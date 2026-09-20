package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ejz extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ plv0 f60323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejz(plv0 plv0Var, int i) {
        super(1);
        this.f60322a = i;
        this.f60323b = plv0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i;
        switch (this.f60322a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                plv0 plv0Var = this.f60323b;
                if (Math.abs(iIntValue - plv0Var.f178796a) >= 17 || (i = plv0Var.f178796a) == 0) {
                    plv0Var.f178796a = iIntValue;
                } else {
                    iIntValue = i;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                this.f60323b.f178796a = ((db71) obj).f47231b.f279922f;
                return w2a1.f247311a;
            default:
                this.f60323b.f178796a = ((db71) obj).f47231b.f279922f;
                return w2a1.f247311a;
        }
    }
}
