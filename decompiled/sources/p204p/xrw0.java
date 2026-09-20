package p204p;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m24212d2 = {"Lp/xrw0;", "Landroid/app/Fragment;", "<init>", "()V", "p/ezk0", "a", "p/vrw0", "lifecycle-runtime"}, m24213k = 1, m24214mv = {2, 0, 0}, m24216xi = 48)
public class xrw0 extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f265430b = 0;

    /* JADX INFO: renamed from: a */
    public ezk0 f265431a;

    /* JADX INFO: renamed from: a */
    public final void m91951a(ta80 ta80Var) {
        if (Build.VERSION.SDK_INT < 29) {
            vrw0.m86300a(getActivity(), ta80Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m91951a(ta80.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m91951a(ta80.ON_DESTROY);
        this.f265431a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m91951a(ta80.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ezk0 ezk0Var = this.f265431a;
        if (ezk0Var != null) {
            ezk0Var.m40370k();
        }
        m91951a(ta80.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ezk0 ezk0Var = this.f265431a;
        if (ezk0Var != null) {
            ezk0Var.m40371m();
        }
        m91951a(ta80.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m91951a(ta80.ON_STOP);
    }

    /* JADX INFO: renamed from: p.xrw0$a */
    public static final class C2586a implements Application.ActivityLifecycleCallbacks {
        public static final wrw0 Companion = new wrw0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            wrw0.m88870a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = xrw0.f265430b;
            vrw0.m86300a(activity, ta80.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = xrw0.f265430b;
            vrw0.m86300a(activity, ta80.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = xrw0.f265430b;
            vrw0.m86300a(activity, ta80.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = xrw0.f265430b;
            vrw0.m86300a(activity, ta80.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = xrw0.f265430b;
            vrw0.m86300a(activity, ta80.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = xrw0.f265430b;
            vrw0.m86300a(activity, ta80.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
