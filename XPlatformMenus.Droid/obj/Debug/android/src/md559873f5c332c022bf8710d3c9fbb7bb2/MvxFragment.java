package md559873f5c332c022bf8710d3c9fbb7bb2;


public class MvxFragment
	extends md54c8d3888e79e210381ebdd7cb087857c.MvxEventSourceFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MvvmCross.Droid.Support.V4.MvxFragment, MvvmCross.Droid.Support.V4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MvxFragment.class, __md_methods);
	}


	public MvxFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MvxFragment.class)
			mono.android.TypeManager.Activate ("MvvmCross.Droid.Support.V4.MvxFragment, MvvmCross.Droid.Support.V4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

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
