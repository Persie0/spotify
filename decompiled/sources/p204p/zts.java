package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zts extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f286250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f286251c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f286252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zts(int i, String str, gh00 gh00Var, boolean z) {
        super(0);
        this.f286249a = i;
        this.f286250b = z;
        this.f286251c = gh00Var;
        this.f286252d = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f286249a) {
            case 0:
                if (this.f286250b) {
                    this.f286251c.invoke(this.f286252d);
                }
                break;
            default:
                if (!this.f286250b) {
                    this.f286251c.invoke(new xjy(this.f286252d));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
