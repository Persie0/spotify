package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fc60 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kc60 f68015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kol0 f68016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc60(kc60 kc60Var, kol0 kol0Var, int i) {
        super(0);
        this.f68014a = i;
        this.f68015b = kc60Var;
        this.f68016c = kol0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f68014a) {
            case 0:
                kc60 kc60Var = this.f68015b;
                dc60 dc60VarM56012a = kc60.m56012a(kc60Var, kc60.m56013b(kc60Var));
                kc60Var.f121390h.add(this.f68016c);
                return dc60VarM56012a;
            default:
                kc60 kc60Var2 = this.f68015b;
                dc60 dc60VarM56012a2 = kc60.m56012a(kc60Var2, kc60.m56013b(kc60Var2));
                j6f.m52566X(kc60Var2.f121390h, new jf50(this.f68016c, 19), true);
                return dc60VarM56012a2;
        }
    }
}
