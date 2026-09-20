package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k9d1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120570a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l9d1 f120571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fk30 f120572c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d1(fk30 fk30Var, l9d1 l9d1Var) {
        super(1);
        this.f120572c = fk30Var;
        this.f120571b = l9d1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        wj30 wj30VarData;
        String strString;
        switch (this.f120570a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                fk30 fk30Var = this.f120572c;
                if (fk30Var.children().size() > iIntValue) {
                    this.f120571b.f131068b.m64235z((fk30) fk30Var.children().get(iIntValue));
                }
                break;
            default:
                ood0 ood0Var = this.f120571b.f131069c;
                fk30 fk30Var2 = (fk30) this.f120572c.children().get(((abd1) obj).f14095a);
                ood0Var.getClass();
                mj30 mj30Var = (mj30) fk30Var2.events().get("click");
                if (mj30Var != null && (wj30VarData = mj30Var.data()) != null && (strString = wj30VarData.string("uri")) != null) {
                    ((z9j0) ood0Var.f167565b).mo47342b(strString, ((kv91) ood0Var.f167567d).mo57453r(((csy) ood0Var.f167566c).m33789E(new zj30("click", fk30Var2, btv0.f30940g)).m91841u((String) g6f.m43741q0(wl51.m88477a1(strString, new String[]{"?"}, 0, 6))), null), null);
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d1(l9d1 l9d1Var, fk30 fk30Var) {
        super(1);
        this.f120571b = l9d1Var;
        this.f120572c = fk30Var;
    }
}
