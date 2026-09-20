package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nfc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f153313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f153314c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f153315d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f153316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfc0(eh00 eh00Var, gh00 gh00Var, Object obj, long j, int i) {
        super(0);
        this.f153312a = i;
        this.f153313b = eh00Var;
        this.f153314c = gh00Var;
        this.f153316e = obj;
        this.f153315d = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f153312a) {
            case 0:
                this.f153313b.invoke();
                this.f153314c.invoke(new tec0(((dfc0) this.f153316e).f48566a.f208271a, this.f153315d));
                break;
            default:
                this.f153313b.invoke();
                this.f153314c.invoke(new pfc0(((vfc0) this.f153316e).f240935a, this.f153315d));
                break;
        }
        return w2a1.f247311a;
    }
}
