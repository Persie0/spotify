package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class t441 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216906a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f216907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f216908c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ai00 f216909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t441(eh00 eh00Var, boolean z, int i) {
        super(0);
        this.f216907b = i;
        this.f216908c = z;
        this.f216909d = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f216906a) {
            case 0:
                if (!this.f216908c) {
                    ((gh00) this.f216909d).invoke(Integer.valueOf(this.f216907b));
                }
                break;
            default:
                if (this.f216907b != 2 && this.f216908c) {
                    ((eh00) this.f216909d).invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t441(boolean z, gh00 gh00Var, int i) {
        super(0);
        this.f216908c = z;
        this.f216909d = gh00Var;
        this.f216907b = i;
    }
}
