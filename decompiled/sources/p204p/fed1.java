package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fed1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vcs0 f68746b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fed1(vcs0 vcs0Var, int i) {
        super(0);
        this.f68745a = i;
        this.f68746b = vcs0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f68745a) {
            case 0:
                return bga.m29062E((dcm0) this.f68746b.f240251c);
            case 1:
                return bga.m29103y((dcm0) this.f68746b.f240251c);
            case 2:
                return bga.m29062E((dcm0) this.f68746b.f240251c);
            default:
                return bga.m29103y((dcm0) this.f68746b.f240251c);
        }
    }
}
