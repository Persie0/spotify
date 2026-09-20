package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ng1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f153521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ubl0 f153522c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f153523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng1(gh00 gh00Var, int i, ubl0 ubl0Var, int i2) {
        super(1);
        this.f153520a = i2;
        this.f153521b = gh00Var;
        this.f153523d = i;
        this.f153522c = ubl0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f153520a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ubl0 ubl0Var = this.f153522c;
                pla1 pla1Var = ubl0Var.f228817a;
                String strM35694A = ubl0Var.m87673g().m35694A();
                if (strM35694A == null) {
                    strM35694A = "";
                }
                this.f153521b.invoke(new eh1(this.f153523d, strM35694A, pla1Var, zBooleanValue, false));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ubl0 ubl0Var2 = this.f153522c;
                pla1 pla1Var2 = ubl0Var2.f228817a;
                String strM35694A2 = ubl0Var2.m87673g().m35694A();
                if (strM35694A2 == null) {
                    strM35694A2 = "";
                }
                this.f153521b.invoke(new eh1(this.f153523d, strM35694A2, pla1Var2, zBooleanValue2, true));
                break;
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ubl0 ubl0Var3 = this.f153522c;
                pla1 pla1Var3 = ubl0Var3.f228817a;
                String strM35694A3 = ubl0Var3.m87673g().m35694A();
                if (strM35694A3 == null) {
                    strM35694A3 = "";
                }
                this.f153521b.invoke(new w6l(this.f153523d, strM35694A3, pla1Var3, zBooleanValue3, false));
                break;
            default:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ubl0 ubl0Var4 = this.f153522c;
                pla1 pla1Var4 = ubl0Var4.f228817a;
                String strM35694A4 = ubl0Var4.m87673g().m35694A();
                if (strM35694A4 == null) {
                    strM35694A4 = "";
                }
                this.f153521b.invoke(new w6l(this.f153523d, strM35694A4, pla1Var4, zBooleanValue4, true));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng1(gh00 gh00Var, ubl0 ubl0Var, int i, int i2) {
        super(1);
        this.f153520a = i2;
        this.f153521b = gh00Var;
        this.f153522c = ubl0Var;
        this.f153523d = i;
    }
}
