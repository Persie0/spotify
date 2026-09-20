package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hv70 {

    /* JADX INFO: renamed from: a */
    public final b8y0 f95603a;

    /* JADX INFO: renamed from: b */
    public final dr4 f95604b;

    /* JADX INFO: renamed from: c */
    public final cqi0 f95605c;

    public hv70(b8y0 b8y0Var, dr4 dr4Var) {
        this.f95603a = b8y0Var;
        this.f95604b = dr4Var;
        long[] jArr = rdy0.f198228a;
        this.f95605c = new cqi0();
    }

    /* JADX INFO: renamed from: a */
    public final th00 m48722a(int i, Object obj, Object obj2) {
        cqi0 cqi0Var = this.f95605c;
        gv70 gv70Var = (gv70) cqi0Var.m33623g(obj);
        if (gv70Var != null && gv70Var.f84653c == i && wj50.m88271j(gv70Var.f84652b, obj2)) {
            fyf fyfVar = gv70Var.f84654d;
            if (fyfVar != null) {
                return fyfVar;
            }
            fyf fyfVarM75763o = rkk.m75763o(new cr3(14, gv70Var.f84655e, gv70Var), true, 818252804);
            gv70Var.f84654d = fyfVarM75763o;
            return fyfVarM75763o;
        }
        gv70 gv70Var2 = new gv70(this, i, obj, obj2);
        cqi0Var.m33629m(obj, gv70Var2);
        fyf fyfVar2 = gv70Var2.f84654d;
        if (fyfVar2 != null) {
            return fyfVar2;
        }
        fyf fyfVarM75763o2 = rkk.m75763o(new cr3(14, this, gv70Var2), true, 818252804);
        gv70Var2.f84654d = fyfVarM75763o2;
        return fyfVarM75763o2;
    }

    /* JADX INFO: renamed from: b */
    public final Object m48723b(Object obj) {
        if (obj == null) {
            return null;
        }
        gv70 gv70Var = (gv70) this.f95605c.m33623g(obj);
        if (gv70Var != null) {
            return gv70Var.f84652b;
        }
        iv70 iv70Var = (iv70) this.f95604b.invoke();
        int iMo30872c = iv70Var.mo30872c(obj);
        if (iMo30872c != -1) {
            return iv70Var.mo30871b(iMo30872c);
        }
        return null;
    }
}
