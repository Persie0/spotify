package p204p;

import android.os.Bundle;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class g800 {

    /* JADX INFO: renamed from: e */
    public static final Field f77376e;

    /* JADX INFO: renamed from: a */
    public final Class f77377a;

    /* JADX INFO: renamed from: b */
    public final h500 f77378b;

    /* JADX INFO: renamed from: c */
    public final Bundle f77379c;

    /* JADX INFO: renamed from: d */
    public int f77380d;

    static {
        try {
            Field declaredField = h500.class.getDeclaredField("a");
            f77376e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public g800(Class cls, h500 h500Var, Bundle bundle, int i) {
        this.f77377a = cls;
        this.f77378b = h500Var;
        this.f77379c = bundle;
        this.f77380d = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m43939a() {
        return this.f77377a.toString();
    }

    /* JADX INFO: renamed from: b */
    public final qqm0 m43940b() {
        Bundle bundle = new Bundle();
        Class cls = this.f77377a;
        bundle.putSerializable("class", cls);
        bundle.putParcelable("saved_state", this.f77378b);
        bundle.putParcelable("arguments", this.f77379c);
        if (this.f77380d == -1) {
            try {
                this.f77380d = oqg1.m67640i(bundle);
            } catch (Throwable th) {
                throw new IllegalStateException("Unable to parcel state for " + cls + ": " + bundle, th);
            }
        }
        bundle.putInt("size", this.f77380d);
        return new qqm0(bundle, Integer.valueOf(this.f77380d));
    }
}
