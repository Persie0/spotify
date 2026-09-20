package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n580 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f150501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l580 f150502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n580(th00 th00Var, l580 l580Var, int i) {
        super(1);
        this.f150500a = i;
        this.f150501b = th00Var;
        this.f150502c = l580Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f150500a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f150501b.invoke(this.f150502c, bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f150501b.invoke(this.f150502c, bool2);
                break;
        }
        return w2a1.f247311a;
    }
}
