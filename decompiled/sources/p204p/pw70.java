package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pw70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lv70 f181928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f181929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f181930d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f181931e;

    public /* synthetic */ pw70(lv70 lv70Var, long j, int i, int i2, int i3) {
        this.f181927a = i3;
        this.f181928b = lv70Var;
        this.f181929c = j;
        this.f181930d = i;
        this.f181931e = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f181927a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        gh00 gh00Var = (gh00) obj3;
        switch (i) {
            case 0:
                int i2 = iIntValue + this.f181930d;
                long j = this.f181929c;
                return this.f181928b.f137253b.mo44714T(e8j.m38116g(i2, j), e8j.m38115f(iIntValue2 + this.f181931e, j), nau.f152117a, gh00Var);
            default:
                int i3 = iIntValue + this.f181930d;
                long j2 = this.f181929c;
                return this.f181928b.f137253b.mo44714T(e8j.m38116g(i3, j2), e8j.m38115f(iIntValue2 + this.f181931e, j2), nau.f152117a, gh00Var);
        }
    }
}
