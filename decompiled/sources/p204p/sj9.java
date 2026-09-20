package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sj9 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f209784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f209785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj9(int i, long j, gh00 gh00Var) {
        super(0);
        this.f209783a = i;
        this.f209784b = gh00Var;
        this.f209785c = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f209783a) {
            case 0:
                this.f209784b.invoke(new nj9(this.f209785c));
                break;
            case 1:
                this.f209784b.invoke(new vj9(this.f209785c));
                break;
            default:
                this.f209784b.invoke(new oo81(this.f209785c));
                break;
        }
        return w2a1.f247311a;
    }
}
