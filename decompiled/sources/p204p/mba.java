package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mba extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f141844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f141845c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f141846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mba(Object obj, gh00 gh00Var, kqi0 kqi0Var, int i) {
        super(1);
        this.f141843a = i;
        this.f141844b = obj;
        this.f141845c = gh00Var;
        this.f141846d = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f141843a) {
            case 0:
                ((Boolean) obj).getClass();
                kqi0 kqi0Var = this.f141846d;
                Object value = kqi0Var.getValue();
                Object obj2 = this.f141844b;
                if (!wj50.m88271j(value, obj2)) {
                    this.f141845c.invoke(obj2);
                }
                kqi0Var.setValue(obj2);
                break;
            default:
                ((Boolean) obj).getClass();
                kqi0 kqi0Var2 = this.f141846d;
                Object value2 = kqi0Var2.getValue();
                Object obj3 = this.f141844b;
                if (!wj50.m88271j(value2, obj3)) {
                    this.f141845c.invoke(obj3);
                }
                kqi0Var2.setValue(obj3);
                break;
        }
        return w2a1.f247311a;
    }
}
