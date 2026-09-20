package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ioy0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104309a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f104310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uum0 f104311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioy0(gh00 gh00Var, uum0 uum0Var) {
        super(1);
        this.f104310b = gh00Var;
        this.f104311c = uum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f104309a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                this.f104311c.m84032w(fFloatValue);
                this.f104310b.invoke(new vny0(fFloatValue));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                this.f104311c.m84032w(fFloatValue2);
                this.f104310b.invoke(Float.valueOf(fFloatValue2));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioy0(uum0 uum0Var, gh00 gh00Var) {
        super(1);
        this.f104311c = uum0Var;
        this.f104310b = gh00Var;
    }
}
