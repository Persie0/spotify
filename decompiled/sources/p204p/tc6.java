package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tc6 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219026a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oc6 f219027b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1961i f219028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc6(oc6 oc6Var, AbstractC1961i abstractC1961i, int i) {
        super(1);
        this.f219026a = i;
        this.f219027b = oc6Var;
        this.f219028c = abstractC1961i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f219026a) {
            case 0:
                this.f219027b.f163831o.invoke(new ef6(this.f219028c, (d850) obj));
                break;
            default:
                this.f219027b.f163831o.invoke(new jf6(this.f219028c, (d850) obj));
                break;
        }
        return w2a1.f247311a;
    }
}
