package md539c501d5d0756c8a32a52367f490e518;


public abstract class BaseFragment_1
	extends md539c501d5d0756c8a32a52367f490e518.BaseFragment
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XPlatformMenus.Droid.Fragments.BaseFragment`1, XPlatformMenus.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BaseFragment_1.class, __md_methods);
	}


	public BaseFragment_1 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BaseFragment_1.class)
			mono.android.TypeManager.Activate ("XPlatformMenus.Droid.Fragments.BaseFragment`1, XPlatformMenus.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
