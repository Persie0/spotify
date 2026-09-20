package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lba extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f4k0 f131606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f131607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lba(f4k0 f4k0Var, gh00 gh00Var, int i) {
        super(1);
        this.f131605a = i;
        this.f131606b = f4k0Var;
        this.f131607c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f131605a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f131606b.m40734a(new u750(2, zBooleanValue));
                this.f131607c.invoke(new x9i("push", zBooleanValue));
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                this.f131606b.m40734a(new u750(1, zBooleanValue2));
                this.f131607c.invoke(new x9i("email", zBooleanValue2));
                break;
        }
        return w2a1.f247311a;
    }
}
