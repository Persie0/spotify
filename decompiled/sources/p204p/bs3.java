package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs3 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zu0 f30223b;

    public /* synthetic */ bs3(zu0 zu0Var, int i) {
        this.f30222a = i;
        this.f30223b = zu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    @Override // p204p.eh00
    public final Object invoke() {
        float fM96964F;
        switch (this.f30222a) {
            case 0:
                zu0 zu0Var = this.f30223b;
                yum0 yum0Var = (yum0) zu0Var.f286297Z;
                yum0 yum0Var2 = (yum0) zu0Var.f286305h;
                Object value = yum0Var.getValue();
                if (value != null) {
                    return value;
                }
                float fM84031v = ((uum0) zu0Var.f286295X).m84031v();
                return !Float.isNaN(fM84031v) ? zu0Var.m96974e(fM84031v, 0.0f, yum0Var2.getValue()) : yum0Var2.getValue();
            case 1:
                zu0 zu0Var2 = this.f30223b;
                yum0 yum0Var3 = (yum0) zu0Var2.f286297Z;
                yum0 yum0Var4 = (yum0) zu0Var2.f286305h;
                Object value2 = yum0Var3.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fM84031v2 = ((uum0) zu0Var2.f286295X).m84031v();
                if (Float.isNaN(fM84031v2)) {
                    return yum0Var4.getValue();
                }
                Object value3 = yum0Var4.getValue();
                rgc0 rgc0VarM96982m = zu0Var2.m96982m();
                float fM75484d = rgc0VarM96982m.m75484d(value3);
                if (fM75484d != fM84031v2 && !Float.isNaN(fM75484d)) {
                    if (fM75484d < fM84031v2) {
                        Object objM75482b = rgc0VarM96982m.m75482b(fM84031v2, true);
                        if (objM75482b != null) {
                            return objM75482b;
                        }
                    } else {
                        Object objM75482b2 = rgc0VarM96982m.m75482b(fM84031v2, false);
                        if (objM75482b2 != null) {
                            return objM75482b2;
                        }
                    }
                }
                return value3;
            case 2:
                zu0 zu0Var3 = this.f30223b;
                float fM75484d2 = zu0Var3.m96982m().m75484d(((yum0) zu0Var3.f286305h).getValue());
                float fM75484d3 = zu0Var3.m96982m().m75484d(((rtq) zu0Var3.f286307t).getValue()) - fM75484d2;
                float fAbs = Math.abs(fM75484d3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    fM96964F = 1.0f;
                } else {
                    fM96964F = (zu0Var3.m96964F() - fM75484d2) / fM75484d3;
                    if (fM96964F < 1.0E-6f) {
                        fM96964F = 0.0f;
                    } else if (fM96964F > 0.999999f) {
                        fM96964F = 1.0f;
                    }
                }
                return Float.valueOf(fM96964F);
            case 3:
                return this.f30223b.m96982m();
            default:
                zu0 zu0Var4 = this.f30223b;
                return new pqm0(zu0Var4.m96982m(), ((rtq) zu0Var4.f286306i).getValue());
        }
    }
}
