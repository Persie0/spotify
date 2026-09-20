package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ri81 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f199457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pi81 f199458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri81(gh00 gh00Var, pi81 pi81Var, int i) {
        super(0);
        this.f199456a = i;
        this.f199457b = gh00Var;
        this.f199458c = pi81Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f199456a) {
            case 0:
                this.f199457b.invoke(new li81(this.f199458c.f177856a));
                break;
            case 1:
                this.f199457b.invoke(new ki81(this.f199458c.f177856a));
                break;
            default:
                this.f199457b.invoke(new ji81(this.f199458c.f177856a));
                break;
        }
        return w2a1.f247311a;
    }
}
