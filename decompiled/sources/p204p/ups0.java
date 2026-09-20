package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ups0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vps0 f232821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ups0(vps0 vps0Var, int i) {
        super(1);
        this.f232820a = i;
        this.f232821b = vps0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f232820a) {
            case 0:
                return new mgq0(this.f232821b, 3);
            default:
                this.f232821b.f243778h.f239423a.mo30231j((String) obj);
                return w2a1.f247311a;
        }
    }
}
