package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ui1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f8b0 f230560b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui1(f8b0 f8b0Var, int i) {
        super(0);
        this.f230559a = i;
        this.f230560b = f8b0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f230559a) {
            case 0:
                return Float.valueOf(this.f230560b.m41028i());
            case 1:
                return Float.valueOf(this.f230560b.m41028i());
            case 2:
                return Float.valueOf(((Number) this.f230560b.getValue()).floatValue());
            case 3:
                return Float.valueOf(this.f230560b.m41028i());
            case 4:
                return (Float) this.f230560b.getValue();
            case 5:
                return Float.valueOf(this.f230560b.m41028i());
            case 6:
                f8b0 f8b0Var = this.f230560b;
                u8b0 u8b0VarM41025d = f8b0Var.m41025d();
                float fMo74977a = 0.0f;
                if (u8b0VarM41025d != null) {
                    if (f8b0Var.m41029j() < 0.0f) {
                        t8b0 t8b0VarM41024c = f8b0Var.m41024c();
                        if (t8b0VarM41024c != null) {
                            fMo74977a = t8b0VarM41024c.mo74978b(u8b0VarM41025d);
                        }
                    } else {
                        t8b0 t8b0VarM41024c2 = f8b0Var.m41024c();
                        fMo74977a = t8b0VarM41024c2 != null ? t8b0VarM41024c2.mo74977a(u8b0VarM41025d) : 1.0f;
                    }
                }
                return Float.valueOf(fMo74977a);
            case 7:
                f8b0 f8b0Var2 = this.f230560b;
                return Float.valueOf((((Boolean) f8b0Var2.f66943d.getValue()).booleanValue() && f8b0Var2.m41027f() % 2 == 0) ? -f8b0Var2.m41029j() : f8b0Var2.m41029j());
            case 8:
                f8b0 f8b0Var3 = this.f230560b;
                return Boolean.valueOf(f8b0Var3.m41027f() == ((Number) f8b0Var3.f66942c.getValue()).intValue() && f8b0Var3.m41028i() == f8b0Var3.m41026e());
            case 9:
                return Float.valueOf(((Number) this.f230560b.getValue()).floatValue());
            case 10:
                return Float.valueOf(((Number) this.f230560b.getValue()).floatValue());
            case 11:
                return Float.valueOf(this.f230560b.m41028i());
            case 12:
                return Float.valueOf(this.f230560b.m41028i());
            case 13:
                return Float.valueOf(((Number) this.f230560b.getValue()).floatValue());
            case 14:
                return (Float) this.f230560b.getValue();
            case 15:
                return Float.valueOf(((Number) this.f230560b.getValue()).floatValue());
            default:
                return (Float) this.f230560b.getValue();
        }
    }
}
