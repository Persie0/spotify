package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fb9 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jb9 f67763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f67764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb9(jb9 jb9Var, long j, int i) {
        super(2);
        this.f67762a = i;
        this.f67763b = jb9Var;
        this.f67764c = j;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67762a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                hy81 hy81Var = (hy81) obj2;
                kb9 kb9Var = (kb9) this.f67763b.f110709h.get(Long.valueOf(this.f67764c));
                if (kb9Var != null) {
                    kb9Var.mo47021h(iIntValue, hy81Var);
                }
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                kb9 kb9Var2 = (kb9) this.f67763b.f110709h.get(Long.valueOf(this.f67764c));
                if (kb9Var2 != null) {
                    kb9Var2.mo47020e(iIntValue2, iIntValue3);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
