package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zdu0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jc20 f281801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f281802c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sdu0 f281803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdu0(jc20 jc20Var, gh00 gh00Var, sdu0 sdu0Var, int i) {
        super(0);
        this.f281800a = i;
        this.f281801b = jc20Var;
        this.f281802c = gh00Var;
        this.f281803d = sdu0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f281800a) {
            case 0:
                ((ado0) this.f281801b).m25615a(0);
                this.f281802c.invoke(new pdu0(this.f281803d));
                break;
            default:
                ((ado0) this.f281801b).m25615a(0);
                this.f281802c.invoke(new pdu0(this.f281803d));
                break;
        }
        return w2a1.f247311a;
    }
}
