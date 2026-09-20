package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rbc extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ubc f197552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbc(ubc ubcVar, int i) {
        super(0);
        this.f197551a = i;
        this.f197552b = ubcVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f197551a) {
            case 0:
                return (d201) this.f197552b.f228688e.get();
            default:
                ubc ubcVar = this.f197552b;
                ubcVar.f228688e.set(new d201());
                ubcVar.f228686c.m89809a();
                return w2a1.f247311a;
        }
    }
}
