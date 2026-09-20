package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class um31 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vm31 f231713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um31(vm31 vm31Var, int i) {
        super(0);
        this.f231712a = i;
        this.f231713b = vm31Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f231712a) {
            case 0:
                return (im31) this.f231713b.f242689d.get();
            default:
                return (bn31) this.f231713b.f242688c.get();
        }
    }
}
