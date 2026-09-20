package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gge0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79651a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lge0 f79652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f79653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gge0(gh00 gh00Var, lge0 lge0Var) {
        super(0);
        this.f79653c = gh00Var;
        this.f79652b = lge0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f79651a) {
            case 0:
                this.f79653c.invoke(((kge0) this.f79652b).f122379b);
                break;
            default:
                String str = ((kge0) this.f79652b).f122382e;
                if (str != null) {
                    this.f79653c.invoke(str);
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gge0(lge0 lge0Var, gh00 gh00Var) {
        super(0);
        this.f79652b = lge0Var;
        this.f79653c = gh00Var;
    }
}
