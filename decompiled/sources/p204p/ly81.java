package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ly81 implements usd0 {

    /* JADX INFO: renamed from: a */
    public final kb9 f137990a;

    /* JADX INFO: renamed from: b */
    public final List f137991b;

    /* JADX INFO: renamed from: c */
    public final da80 f137992c;

    public ly81(udd0 udd0Var, k7q0 k7q0Var, z4l0 z4l0Var, o89 o89Var, kb9 kb9Var) {
        this.f137990a = kb9Var;
        List listMo64237a = udd0Var.mo64237a(z4l0Var, o89Var.m66420a());
        this.f137991b = listMo64237a;
        this.f137992c = new da80(z4l0Var, k7q0Var, listMo64237a, (Object) null, 10);
    }

    @Override // p204p.usd0
    /* JADX INFO: renamed from: a */
    public final wz8 mo771a(ufd0 ufd0Var) {
        ofd0 ofd0Var = ufd0Var.f229763b;
        wz8 wz8VarM35407c = this.f137992c.m35407c(new yzo0(new l1p0(String.valueOf(ofd0Var != null ? ofd0Var.f164727a : null), 14, null), "", ""), new ky81(this), null, 0, "", false);
        ifd0 ifd0Var = ufd0Var.f229766e;
        long j = 1000;
        return new cqe(wz8VarM35407c, ifd0Var.f90690a * j, ifd0Var.f90692c * j);
    }
}
