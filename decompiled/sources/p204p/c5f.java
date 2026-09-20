package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c5f extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f34156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b5f f34157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5f(gh00 gh00Var, b5f b5fVar, int i) {
        super(0);
        this.f34155a = i;
        this.f34156b = gh00Var;
        this.f34157c = b5fVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f34155a) {
            case 0:
                this.f34156b.invoke(new u4f(this.f34157c.f23569a));
                break;
            case 1:
                this.f34156b.invoke(new w4f(this.f34157c.f23569a));
                break;
            case 2:
                this.f34156b.invoke(new v4f(this.f34157c.f23569a));
                break;
            default:
                this.f34156b.invoke(new u4f(this.f34157c.f23569a));
                break;
        }
        return w2a1.f247311a;
    }
}
