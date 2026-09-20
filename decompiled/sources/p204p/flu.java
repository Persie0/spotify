package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class flu extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f70869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f70870c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f70871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ flu(kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, int i) {
        super(0);
        this.f70868a = i;
        this.f70869b = kqi0Var;
        this.f70870c = kqi0Var2;
        this.f70871d = kqi0Var3;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f70868a) {
            case 0:
                ((eh00) this.f70869b.getValue()).invoke();
                ((gh00) this.f70870c.getValue()).invoke(cey.m32597a((cey) this.f70871d.getValue(), false, false, 0.0f, 0.0f, 0, 0L, 61));
                break;
            default:
                ((eh00) this.f70869b.getValue()).invoke();
                ((gh00) this.f70870c.getValue()).invoke(cey.m32597a((cey) this.f70871d.getValue(), false, false, 0.0f, 0.0f, 0, 0L, 61));
                break;
        }
        return w2a1.f247311a;
    }
}
