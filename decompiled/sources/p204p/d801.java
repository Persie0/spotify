package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d801 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vyr0 f46326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d801(vyr0 vyr0Var, int i) {
        super(0);
        this.f46325a = i;
        this.f46326b = vyr0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f46325a) {
            case 0:
                ((yum0) this.f46326b.f246316e).setValue(null);
                return w2a1.f247311a;
            default:
                return (a801) ((i4t0) this.f46326b.f246313b).get();
        }
    }
}
