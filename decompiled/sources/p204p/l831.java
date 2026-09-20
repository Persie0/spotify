package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l831 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q831 f130795b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b631 f130796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l831(q831 q831Var, b631 b631Var, int i) {
        super(0);
        this.f130794a = i;
        this.f130795b = q831Var;
        this.f130796c = b631Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f130794a) {
            case 0:
                this.f130795b.f186232f.add(this.f130796c);
                break;
            default:
                this.f130795b.f186232f.remove(this.f130796c);
                break;
        }
        return w2a1.f247311a;
    }
}
