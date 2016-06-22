using System;
using Android.App;
using MvvmCross.Binding.BindingContext;
using MvvmCross.Core.ViewModels;
using MvvmCross.Binding.Droid.BindingContext;
using MvvmCross.Binding.Droid.Views;
using Android.Content;
using Android.Runtime;

namespace XPlatformMenus.Droid
{
	public class CustomDialog : Dialog, IMvxBindingContextOwner
	{
		public CustomDialog(Android.Content.Context context, int layout, IMvxViewModel viewModel)
			: this(context, Resource.Style.CustomDialog)
		{
			this.BindingContext = new MvxAndroidBindingContext(context, (context as IMvxLayoutInflaterHolder));
			ViewModel = viewModel;
			Init(layout);
		}

		public CustomDialog(Android.Content.Context context, int themeResId)
			: base(context, themeResId)
		{
		}

		protected CustomDialog(IntPtr javaReference, JniHandleOwnership transfer)
			: base(javaReference, transfer)
		{
		}

		protected CustomDialog(Android.Content.Context context, bool cancelable, IDialogInterfaceOnCancelListener cancelListener)
			: base(context, cancelable, cancelListener)
		{
		}

		protected CustomDialog(Android.Content.Context context, bool cancelable, EventHandler cancelHandler)
			: base(context, cancelable, cancelHandler)
		{
		}

		private void Init(int layout)
		{
			SetContentView(layout);
		}

		public override void SetContentView(int layoutResID)
		{
			var view = this.BindingInflate(layoutResID, null);
			base.SetContentView(view);
		}

		public IMvxBindingContext BindingContext { get; set; }

		public object DataContext
		{
			get { return this.BindingContext.DataContext; }
			set { this.BindingContext.DataContext = value; }
		}

		public IMvxViewModel ViewModel
		{
			get { return this.DataContext as IMvxViewModel; }
			set { this.DataContext = value; }
		}
	}
}

