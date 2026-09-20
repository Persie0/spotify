package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ap6 implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final yqq f17838a;

    /* JADX INFO: renamed from: b */
    public final float f17839b;

    /* JADX INFO: renamed from: c */
    public final float f17840c;

    /* JADX INFO: renamed from: d */
    public final float f17841d;

    public ap6(yqq yqqVar) {
        float f = zo6.f284703f;
        float f2 = zo6.f284704g;
        float f3 = zo6.f284705h;
        this.f17838a = yqqVar;
        this.f17839b = f;
        this.f17840c = f2;
        this.f17841d = f3;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public final long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        int i;
        float f = this.f17839b;
        yqq yqqVar = this.f17838a;
        int iMo35990l0 = yqqVar.mo35990l0(f);
        int iMo35990l1 = yqqVar.mo35990l0(this.f17840c);
        int iMo35990l2 = yqqVar.mo35990l0(this.f17841d);
        if (ko70Var == ko70.f124557b) {
            i = c450Var.f33850c + iMo35990l1;
            iMo35990l1 = (int) (j2 >> 32);
        } else {
            i = c450Var.f33848a;
        }
        int i2 = i - iMo35990l1;
        int i3 = (((int) (j >> 32)) - iMo35990l2) - ((int) (j2 >> 32));
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 < iMo35990l2) {
            i2 = iMo35990l2;
        }
        int i4 = (c450Var.f33849b - iMo35990l0) - ((int) (j2 & 4294967295L));
        if (i4 >= iMo35990l2) {
            iMo35990l2 = i4;
        }
        return (((long) iMo35990l2) & 4294967295L) | (((long) i2) << 32);
    }
}
