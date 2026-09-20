package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sm20 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rm20 f210552b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm20(rm20 rm20Var, int i) {
        super(1);
        this.f210551a = i;
        this.f210552b = rm20Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f210551a) {
            case 0:
                ((fdx0) obj).m41380b(((Number) this.f210552b.f200424b.getValue()).floatValue());
                break;
            case 1:
                ((fdx0) obj).m41380b(((Number) this.f210552b.f200423a.getValue()).floatValue());
                break;
            default:
                ((fdx0) obj).m41380b(((Number) this.f210552b.f200423a.getValue()).floatValue());
                break;
        }
        return w2a1.f247311a;
    }
}
