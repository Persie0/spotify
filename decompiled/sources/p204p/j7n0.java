package p204p;

import android.app.Application;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class j7n0 implements vd50, Predicate {
    public j7n0(i34 i34Var, j231 j231Var) {
        if (i34Var.m49572b()) {
            j231Var.f107918a.mo48713h(j231.f107917b, false);
        }
        qhg1.m72808A(i34Var.m49571a());
    }

    /* JADX INFO: renamed from: a */
    public static void m52630a(Application application) {
        File file = new File(s571.m77250i(application.getFilesDir().getParent(), "/shared_prefs/"));
        application.getSharedPreferences("my_secret_shared_pref_data", 0).edit().clear().apply();
        new File(file, "my_secret_shared_pref_data.xml").delete();
    }

    /* JADX INFO: renamed from: b */
    public static final int m52631b(int i, long j) {
        int i2 = z981.f280720b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    /* JADX INFO: renamed from: c */
    public static long m52632c(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        xm7 xm7VarM91448a = xm7.m91448a(i);
        return xm7VarM91448a == null ? xm7.UNRECOGNIZED : xm7VarM91448a;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((qxr0) obj).m74147g() == 3;
    }
}
