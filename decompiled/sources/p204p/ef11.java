package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ef11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p511 f58909b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f58910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef11(p511 p511Var, String str, int i) {
        super(0);
        this.f58908a = i;
        this.f58909b = p511Var;
        this.f58910c = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f58908a) {
            case 0:
                this.f58909b.invoke(new qe11(this.f58910c));
                break;
            default:
                this.f58909b.invoke(new se11(this.f58910c));
                break;
        }
        return w2a1.f247311a;
    }
}
