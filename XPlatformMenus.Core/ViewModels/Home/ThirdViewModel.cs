using MvvmCross.Core.ViewModels;
using MvvmCross.Platform;

namespace XPlatformMenus.Core.ViewModels
{
    public class ThirdViewModel : BaseViewModel
    {

        private MvxCommand saveAndCloseCommand;

        public MvxCommand SaveAndCloseCommand
        {
            get
            {
                saveAndCloseCommand = saveAndCloseCommand ?? new MvxCommand(DoSaveAndClose);
                return saveAndCloseCommand;
            }
        }

		private MvxCommand _showSettingsCommand;
		public MvxCommand ShowSettingsCommand =>
		_showSettingsCommand ?? (_showSettingsCommand = new MvxCommand(() => ShowViewModel<HomeViewModel>()));

		private MvxCommand _showCloseCommand;
		public MvxCommand ShowCloseCommand =>
		_showCloseCommand ?? (_showCloseCommand = new MvxCommand(() => ShowViewModel<SettingsViewModel>()));

        private MvxPresentationHint popToRootHint = Mvx.Resolve<MvxPresentationHint>();

        private void DoSaveAndClose()
        {
            //do whatever work one would do to 'save', and send a message to pop to root               
            ChangePresentation(popToRootHint);
        }
    }
}