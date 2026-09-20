package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q971 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qoc1 f186533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r971 f186534c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sag0 f186535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q971(qoc1 qoc1Var, r971 r971Var, sag0 sag0Var, int i) {
        super(0);
        this.f186532a = i;
        this.f186533b = qoc1Var;
        this.f186534c = r971Var;
        this.f186535d = sag0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f186532a) {
            case 0:
                sag0 sag0Var = this.f186535d;
                r971 r971Var = this.f186534c;
                return this.f186533b.m73390a(r971Var, new p971(sag0Var, r971Var, 0));
            default:
                sag0 sag0Var2 = this.f186535d;
                r971 r971Var2 = this.f186534c;
                return this.f186533b.m73390a(r971Var2, new p971(sag0Var2, r971Var2, 1));
        }
    }
}
