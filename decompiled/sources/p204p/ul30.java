package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final enum ul30 extends yl30 {
    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public final int mo25406k(fk30 fk30Var) {
        String strString = fk30Var.custom().string("style");
        if ("error".equals(strString)) {
            return yl30.f273893d;
        }
        boolean zEquals = "noResults".equals(strString);
        int i = yl30.f273894e;
        if (zEquals) {
            return i;
        }
        ydj.m93454m("Unsupported empty state style: ", strString);
        return i;
    }
}
