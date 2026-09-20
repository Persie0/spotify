package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hom0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jom0 f93569b;

    public /* synthetic */ hom0(jom0 jom0Var, int i) {
        this.f93568a = i;
        this.f93569b = jom0Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f93568a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                jom0 jom0Var = this.f93569b;
                Integer num = jom0Var.f114458g;
                if (num == null || iIntValue != num.intValue()) {
                    Integer num2 = jom0Var.f114458g;
                    jom0Var.f114458g = new Integer(iIntValue);
                    jxf jxfVar = jxf.f117125d;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        jv50 jv50VarM53890a = jom0Var.m53890a(iIntValue2, (vwf) jom0Var.f114460i.get(iIntValue2));
                        if (jv50VarM53890a.f116262a == jxfVar) {
                            jv50VarM53890a.m54371a(jxf.f117123b);
                        }
                    }
                    jv50 jv50VarM53890a2 = jom0Var.m53890a(iIntValue, (vwf) jom0Var.f114460i.get(iIntValue));
                    jv50VarM53890a2.m54371a(jxfVar);
                    idd1 idd1Var = jom0Var.f114453b;
                    idd1Var.f101069a.m97090l(jv50VarM53890a2.f116265d);
                }
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                Integer num3 = new Integer(iIntValue3);
                jom0 jom0Var2 = this.f93569b;
                jom0Var2.f114459h = num3;
                if (iIntValue3 <= h6f.m46714K(jom0Var2.f114460i)) {
                    jom0Var2.m53890a(iIntValue3, (vwf) jom0Var2.f114460i.get(iIntValue3)).m54371a(jxf.f117124c);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
