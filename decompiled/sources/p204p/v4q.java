package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v4q extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f237218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t4q f237219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4q(gh00 gh00Var, t4q t4qVar, int i) {
        super(0);
        this.f237217a = i;
        this.f237218b = gh00Var;
        this.f237219c = t4qVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f237217a) {
            case 0:
                this.f237218b.invoke(new q4q(this.f237219c.f217055a));
                break;
            default:
                this.f237218b.invoke(new p4q(this.f237219c.f217055a));
                break;
        }
        return w2a1.f247311a;
    }
}
