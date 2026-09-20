package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c65 {

    /* JADX INFO: renamed from: a */
    public static final fc5 f34381a = new fc5(new ekr(3));

    /* JADX INFO: renamed from: b */
    public static final int f34382b = -100;

    /* JADX INFO: renamed from: c */
    public static jfa0 f34383c = null;

    /* JADX INFO: renamed from: d */
    public static jfa0 f34384d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f34385e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f34386f = false;

    /* JADX INFO: renamed from: g */
    public static final zj5 f34387g = new zj5(0);

    /* JADX INFO: renamed from: h */
    public static final Object f34388h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f34389i = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean m31525b(Context context) {
        if (f34385e == null) {
            try {
                Bundle bundle = ec5.m38474a(context).metaData;
                if (bundle != null) {
                    f34385e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f34385e = Boolean.FALSE;
            }
        }
        return f34385e.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static void m31526e(l65 l65Var) {
        synchronized (f34388h) {
            try {
                zj5 zj5Var = f34387g;
                zj5Var.getClass();
                sj5 sj5Var = new sj5(zj5Var);
                while (sj5Var.hasNext()) {
                    c65 c65Var = (c65) ((WeakReference) sj5Var.next()).get();
                    if (c65Var == l65Var || c65Var == null) {
                        sj5Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo31527a();

    /* JADX INFO: renamed from: c */
    public abstract void mo31528c();

    /* JADX INFO: renamed from: d */
    public abstract void mo31529d();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo31530f(int i);

    /* JADX INFO: renamed from: g */
    public abstract void mo31531g(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo31532h(View view);

    /* JADX INFO: renamed from: i */
    public abstract void mo31533i(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: j */
    public abstract void mo31534j(CharSequence charSequence);
}
