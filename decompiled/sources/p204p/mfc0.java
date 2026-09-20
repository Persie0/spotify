package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mfc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ffc0 f143030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f143031c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f143032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mfc0(ffc0 ffc0Var, gh00 gh00Var, long j, int i) {
        super(0);
        this.f143029a = i;
        this.f143030b = ffc0Var;
        this.f143031c = gh00Var;
        this.f143032d = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f143029a) {
            case 0:
                dfc0 dfc0Var = (dfc0) this.f143030b;
                boolean z = dfc0Var.f48569d;
                gh00 gh00Var = this.f143031c;
                if (z) {
                    gh00Var.invoke(new tec0(dfc0Var.f48566a.f208271a, this.f143032d));
                } else {
                    gh00Var.invoke(uec0.f229485a);
                }
                break;
            default:
                ffc0 ffc0Var = this.f143030b;
                if (ffc0Var instanceof dfc0) {
                    dfc0 dfc0Var2 = (dfc0) ffc0Var;
                    boolean z2 = dfc0Var2.f48569d;
                    gh00 gh00Var2 = this.f143031c;
                    if (z2) {
                        gh00Var2.invoke(new tec0(dfc0Var2.f48566a.f208271a, this.f143032d));
                    } else {
                        gh00Var2.invoke(uec0.f229485a);
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }
}
