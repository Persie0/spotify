package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tcl extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219102a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lqi0 f219103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f219104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcl(gh00 gh00Var, lqi0 lqi0Var) {
        super(0);
        this.f219104c = gh00Var;
        this.f219103b = lqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        zv41 zv41Var;
        Object value;
        switch (this.f219102a) {
            case 0:
                this.f219104c.invoke(ski.f210103a);
                do {
                    zv41Var = (zv41) this.f219103b;
                    value = zv41Var.getValue();
                } while (!zv41Var.m97089k(value, new lcl(((lcl) value).f131947a, true)));
                break;
            default:
                lcl lclVar = new lcl();
                zv41 zv41Var2 = (zv41) this.f219103b;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, lclVar);
                this.f219104c.invoke(vki.f242229a);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcl(lqi0 lqi0Var, gh00 gh00Var) {
        super(0);
        this.f219103b = lqi0Var;
        this.f219104c = gh00Var;
    }
}
