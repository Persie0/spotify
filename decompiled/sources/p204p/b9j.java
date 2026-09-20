package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b9j extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f24948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24949c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y00 f24950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b9j(gh00 gh00Var, int i, y00 y00Var, int i2) {
        super(0);
        this.f24947a = i2;
        this.f24948b = gh00Var;
        this.f24949c = i;
        this.f24950d = y00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f24947a) {
            case 0:
                this.f24948b.invoke(new i9j(this.f24949c, this.f24950d.f267830b));
                break;
            default:
                this.f24948b.invoke(new j9j(this.f24949c, this.f24950d.f267830b));
                break;
        }
        return w2a1.f247311a;
    }
}
