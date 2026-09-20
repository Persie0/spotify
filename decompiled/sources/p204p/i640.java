package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i640 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y540 f99098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i640(y540 y540Var, int i) {
        super(0);
        this.f99097a = i;
        this.f99098b = y540Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f99097a) {
            case 0:
                y540 y540Var = this.f99098b;
                return (z6d0) y540Var.f269331b.get(y540Var.f269332c);
            case 1:
                y540 y540Var2 = this.f99098b;
                return (z6d0) y540Var2.f269331b.get(y540Var2.f269332c);
            default:
                return Integer.valueOf(this.f99098b.f269331b.size());
        }
    }
}
