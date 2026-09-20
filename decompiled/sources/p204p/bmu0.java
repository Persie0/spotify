package p204p;

import java.util.Arrays;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bmu0 {

    /* JADX INFO: renamed from: a */
    public static final d0k[] f28619a;

    static {
        try {
            f28619a = (d0k[]) btz0.m30496T(btz0.m30477A(Arrays.asList(new d0k[0]).iterator())).toArray(new d0k[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final onc m29894a(i7t0 i7t0Var) {
        return new onc(i7t0Var);
    }

    /* JADX INFO: renamed from: b */
    public static kiz m29895b(fiz fizVar) {
        j1a1 j1a1Var = xsr.f265652b;
        j1a1Var.getClass();
        return new kiz(fizVar, cct.m32296A(j1a1Var, dau.f47107a));
    }
}
