package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class on50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pn50 f167161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on50(pn50 pn50Var, int i) {
        super(0);
        this.f167160a = i;
        this.f167161b = pn50Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f167160a) {
            case 0:
                this.f167161b.f179312a.mo47346g("spotify:managed-account-linking:invite-options");
                break;
            default:
                this.f167161b.f179312a.mo47346g("spotify:managed-account-linking:learn-more");
                break;
        }
        return w2a1.f247311a;
    }
}
