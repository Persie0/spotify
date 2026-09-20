package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class iyi0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gyi0 f106998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyi0(gyi0 gyi0Var, int i) {
        super(1);
        this.f106997a = i;
        this.f106998b = gyi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f106997a) {
            case 0:
                return Boolean.valueOf(!this.f106998b.m46165b().contains((String) obj));
            default:
                return Boolean.valueOf(!this.f106998b.m46165b().contains((String) obj));
        }
    }
}
