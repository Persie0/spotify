package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h9b0 implements q9b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9b0 f88915b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f88916c;

    public /* synthetic */ h9b0(r9b0 r9b0Var, String str, int i) {
        this.f88914a = i;
        this.f88915b = r9b0Var;
        this.f88916c = str;
    }

    @Override // p204p.q9b0
    public final void run() {
        switch (this.f88914a) {
            case 0:
                this.f88915b.m75038s(this.f88916c);
                break;
            case 1:
                this.f88915b.m75036q(this.f88916c);
                break;
            default:
                this.f88915b.m75040u(this.f88916c);
                break;
        }
    }
}
