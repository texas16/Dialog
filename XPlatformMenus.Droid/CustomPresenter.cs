using System;
using MvvmCross.Droid.Shared.Presenter;
using MvvmCross.Core.ViewModels;
using System.Collections.Generic;
using System.Reflection;
using MvvmCross.Platform.Droid.Platform;
using MvvmCross.Platform;
using XPlatformMenus.Droid.Fragments;

namespace XPlatformMenus.Droid
{
	public class CustomPresenter : MvxFragmentsPresenter
	{
		protected IMvxViewModelLoader MvxViewModelLoader => Mvx.Resolve<IMvxViewModelLoader>();

		CustomDialog _modal;

		public CustomPresenter(IEnumerable<Assembly> AndroidViewAssemblies) : base(AndroidViewAssemblies)
		{
		}

		protected override void ShowActivity(MvxViewModelRequest request, MvxViewModelRequest fragmentRequest = null)
		{
			if (!Intercept(request))
				base.ShowActivity(request, fragmentRequest);
		}

		protected override void ShowFragment(MvxViewModelRequest request)
		{
			if (!Intercept(request))
				base.ShowFragment(request);
		}

		private bool Intercept(MvxViewModelRequest request)
		{
			if (request.ViewModelType == typeof(ThirdFragment))
			{
				var activity = Mvx.Resolve<IMvxAndroidCurrentTopActivity>().Activity;
				var viewModel = MvxViewModelLoader.LoadViewModel(request, null) as ThirdFragment;
				_modal = new CustomDialog(activity, Resource.Layout.modal_popup, viewModel);
				_modal.Show();
				return true;
			}

			if (_modal != null)
			{
				_modal.Dismiss();
				_modal = null;
			}
			return false;
		}
	}

}

