package p196j$.time.temporal;

/* JADX INFO: renamed from: j$.time.temporal.n */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1605n implements InterfaceC1604m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f10833b;

    public /* synthetic */ C1605n(int i, int i2) {
        this.f10832a = i2;
        this.f10833b = i;
    }

    @Override // p196j$.time.temporal.InterfaceC1604m
    /* JADX INFO: renamed from: f */
    public final Temporal mo23951f(Temporal temporal) {
        switch (this.f10832a) {
            case 0:
                int iMo23952g = temporal.mo23952g(EnumC1592a.DAY_OF_WEEK);
                int i = this.f10833b;
                if (iMo23952g == i) {
                    return temporal;
                }
                int i2 = iMo23952g - i;
                return temporal.mo23950e(i2 >= 0 ? 7 - i2 : -i2, ChronoUnit.DAYS);
            default:
                int iMo23952g2 = temporal.mo23952g(EnumC1592a.DAY_OF_WEEK);
                int i3 = this.f10833b;
                if (iMo23952g2 == i3) {
                    return temporal;
                }
                int i4 = i3 - iMo23952g2;
                return temporal.mo23946a(i4 >= 0 ? 7 - i4 : -i4, ChronoUnit.DAYS);
        }
    }
}
