package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gt61 {

    /* JADX INFO: renamed from: a */
    public static final long f84098a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f84099b = 0;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f84098a = jwg1.m54449D(250, ils.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public static final C2317qx m45675a(InterfaceC2392sx interfaceC2392sx, int i, int i2) {
        long j = i2;
        if (j < 0) {
            j = 0;
        }
        long j2 = j + 1;
        if (j2 > 2147483647L) {
            j2 = 2147483647L;
        }
        int i3 = (int) j2;
        if (interfaceC2392sx.equals(C2354rx.f203436a)) {
            return new C2317qx(i, 1);
        }
        if (!(interfaceC2392sx instanceof C2317qx)) {
            throw new NoWhenBranchMatchedException();
        }
        C2317qx c2317qx = (C2317qx) interfaceC2392sx;
        int i4 = c2317qx.f193441a;
        if (i4 != i) {
            return new C2317qx(i, 1);
        }
        int i5 = c2317qx.f193442b + 1;
        return i5 <= i3 ? new C2317qx(i4, i5) : c2317qx;
    }
}
