package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v62 {

    /* JADX INFO: renamed from: a */
    public final z3e f237710a;

    /* JADX INFO: renamed from: b */
    public final d4e f237711b;

    /* JADX INFO: renamed from: c */
    public final vmz f237712c;

    public v62(z3e z3eVar, d4e d4eVar, vmz vmzVar) {
        this.f237710a = z3eVar;
        this.f237711b = d4eVar;
        this.f237712c = vmzVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m84765a(ibk ibkVar) {
        u62 u62Var;
        v62 v62Var;
        String str;
        Object objM86755t;
        String str2;
        if (ibkVar instanceof u62) {
            u62Var = (u62) ibkVar;
            int i = u62Var.f227206d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u62Var.f227206d = i - Integer.MIN_VALUE;
            } else {
                u62Var = new u62(this, ibkVar);
            }
        } else {
            u62Var = new u62(this, ibkVar);
        }
        Object objM95274f = u62Var.f227204b;
        int i2 = u62Var.f227206d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                v62Var = (v62) u62Var.f227203a;
                bga.m29073P(objM95274f);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) u62Var.f227203a;
                bga.m29073P(objM95274f);
            }
            return new mvh0(cy91.f43193a, false, str2, ((Boolean) objM95274f).booleanValue());
        }
        bga.m29073P(objM95274f);
        c4e c4eVarM37771b = ((e4e) this.f237711b).m37771b();
        if (c4eVarM37771b != null) {
            if (c4eVarM37771b.f33928a != 2) {
                c4eVarM37771b = null;
            }
            if (c4eVarM37771b != null) {
                str = c4eVarM37771b.f33929b;
                fiz fizVarM86024a = this.f237712c.m86024a("has-addons-terminated-by-transition", false);
                u62Var.f227203a = str;
                u62Var.f227206d = 2;
                objM86755t = vyf1.m86755t(fizVarM86024a, u62Var);
                if (objM86755t != yukVar) {
                    str2 = str;
                    objM95274f = objM86755t;
                    return new mvh0(cy91.f43193a, false, str2, ((Boolean) objM95274f).booleanValue());
                }
            }
            return yukVar;
        }
        u62Var.f227203a = this;
        u62Var.f227206d = 1;
        objM95274f = this.f237710a.m95274f(u62Var);
        if (objM95274f != yukVar) {
            v62Var = this;
        }
        return yukVar;
        vxm0 vxm0Var = (vxm0) objM95274f;
        d4e d4eVar = v62Var.f237711b;
        String str3 = vxm0Var.f245782a;
        long j = vxm0Var.f245784c;
        lv31 lv31VarEdit = ((e4e) d4eVar).f56060a.edit();
        lv31VarEdit.m60051d(e4e.f56057c, "AgeAssurance");
        lv31VarEdit.m60051d(e4e.f56058d, str3);
        lv31VarEdit.m60050c(e4e.f56059e, j);
        lv31VarEdit.m60054g();
        str = vxm0Var.f245782a;
        fiz fizVarM86024a2 = this.f237712c.m86024a("has-addons-terminated-by-transition", false);
        u62Var.f227203a = str;
        u62Var.f227206d = 2;
        objM86755t = vyf1.m86755t(fizVarM86024a2, u62Var);
        if (objM86755t != yukVar) {
            str2 = str;
            objM95274f = objM86755t;
            return new mvh0(cy91.f43193a, false, str2, ((Boolean) objM95274f).booleanValue());
        }
        return yukVar;
    }
}
