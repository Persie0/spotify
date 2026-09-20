package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tf6 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f219859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f219860c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eh00 f219861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf6(boolean z, eh00 eh00Var, eh00 eh00Var2, int i) {
        super(0);
        this.f219858a = i;
        this.f219859b = z;
        this.f219860c = eh00Var;
        this.f219861d = eh00Var2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f219858a) {
            case 0:
                if (this.f219859b) {
                    this.f219860c.invoke();
                } else {
                    this.f219861d.invoke();
                }
                return Boolean.TRUE;
            case 1:
                (this.f219859b ? this.f219860c : this.f219861d).invoke();
                return w2a1.f247311a;
            default:
                (this.f219859b ? this.f219860c : this.f219861d).invoke();
                return w2a1.f247311a;
        }
    }
}
