package p204p;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z5f1 extends Fragment implements ac80 {

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f279560b = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final ob31 f279561a = new ob31(8, false);

    /* JADX INFO: renamed from: a */
    public static z5f1 m95461a(Activity activity) {
        z5f1 z5f1Var;
        WeakHashMap weakHashMap = f279560b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (z5f1Var = (z5f1) weakReference.get()) != null) {
            return z5f1Var;
        }
        try {
            z5f1 z5f1Var2 = (z5f1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (z5f1Var2 == null || z5f1Var2.isRemoving()) {
                z5f1Var2 = new z5f1();
                activity.getFragmentManager().beginTransaction().add(z5f1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(z5f1Var2));
            return z5f1Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // p204p.ac80
    /* JADX INFO: renamed from: W */
    public final Activity mo25445W() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f279561a.m66620u();
    }

    @Override // p204p.ac80
    /* JADX INFO: renamed from: m */
    public final void mo25446m(l3f1 l3f1Var) {
        this.f279561a.m66611k(l3f1Var);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f279561a.m66616p(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f279561a.m66612l(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f279561a.m66619t();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f279561a.m66615o();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f279561a.m66617r(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f279561a.m66614n();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f279561a.m66618s();
    }

    @Override // p204p.ac80
    /* JADX INFO: renamed from: t */
    public final l3f1 mo25447t() {
        return this.f279561a.m66609i();
    }
}
