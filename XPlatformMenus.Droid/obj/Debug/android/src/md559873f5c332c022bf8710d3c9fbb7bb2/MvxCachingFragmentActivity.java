package md559873f5c332c022bf8710d3c9fbb7bb2;


public class MvxCachingFragmentActivity
	extends md559873f5c332c022bf8710d3c9fbb7bb2.MvxFragmentActivity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onPostCreate:(Landroid/os/Bundle;)V:GetOnPostCreate_Landroid_os_Bundle_Handler\n" +
			"n_onSaveInstanceState:(Landroid/os/Bundle;)V:GetOnSaveInstanceState_Landroid_os_Bundle_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxCachingFragmentActivity, MvvmCross.Droid.Support.V4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxCachingFragmentActivity.class, __md_methods);
	}


	public MvxCachingFragmentActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxCachingFragmentActivity.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxCachingFragmentActivity, MvvmCross.Droid.Support.V4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPostCreate (android.os.Bundle p0)
	{
		n_onPostCreate (p0);
	}

	private native void n_onPostCreate (android.os.Bundle p0);


	public void onSaveInstanceState (android.os.Bundle p0)
	{
		n_onSaveInstanceState (p0);
	}

	private native void n_onSaveInstanceState (android.os.Bundle p0);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
