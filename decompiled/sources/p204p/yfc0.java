package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yfc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272204a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vfc0 f272205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f272206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f272207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfc0(vfc0 vfc0Var, gh00 gh00Var, long j, int i) {
        super(0);
        this.f272204a = i;
        this.f272205b = vfc0Var;
        this.f272206c = gh00Var;
        this.f272207d = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f272204a) {
            case 0:
                vfc0 vfc0Var = this.f272205b;
                boolean z = vfc0Var.f240945k;
                gh00 gh00Var = this.f272206c;
                if (z) {
                    String str = vfc0Var.f240935a;
                    if (str != null) {
                        gh00Var.invoke(new pfc0(str, this.f272207d));
                    }
                } else {
                    gh00Var.invoke(qfc0.f188166a);
                }
                break;
            default:
                vfc0 vfc0Var2 = this.f272205b;
                boolean z2 = vfc0Var2.f240945k;
                gh00 gh00Var2 = this.f272206c;
                if (z2) {
                    gh00Var2.invoke(new pfc0(vfc0Var2.f240935a, this.f272207d));
                } else {
                    gh00Var2.invoke(qfc0.f188166a);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
