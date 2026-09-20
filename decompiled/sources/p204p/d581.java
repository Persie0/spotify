package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d581 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f45366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45367c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o581 f45368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d581(th00 th00Var, int i, o581 o581Var, int i2) {
        super(0);
        this.f45365a = i2;
        this.f45366b = th00Var;
        this.f45367c = i;
        this.f45368d = o581Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f45365a) {
            case 0:
                this.f45366b.invoke(Integer.valueOf(this.f45367c), this.f45368d.f161915d);
                break;
            default:
                th00 th00Var = this.f45366b;
                if (th00Var != null) {
                    th00Var.invoke(Integer.valueOf(this.f45367c), this.f45368d.f161915d);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
