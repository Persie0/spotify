package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class pd31 {

    /* JADX INFO: renamed from: a */
    public final xvx0 f176342a;

    /* JADX INFO: renamed from: b */
    public final xfp0 f176343b;

    /* JADX INFO: renamed from: c */
    public final vnt0 f176344c;

    public pd31(tjr0 tjr0Var, xvx0 xvx0Var, xfp0 xfp0Var, vnt0 vnt0Var) {
        this.f176342a = xvx0Var;
        this.f176343b = xfp0Var;
        this.f176344c = vnt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m69638a(w6k w6kVar, ibk ibkVar) {
        od31 od31Var;
        String str;
        w6k w6kVar2;
        jlp0 jlp0Var;
        if (ibkVar instanceof od31) {
            od31Var = (od31) ibkVar;
            int i = od31Var.f164091e;
            if ((i & Integer.MIN_VALUE) != 0) {
                od31Var.f164091e = i - Integer.MIN_VALUE;
            } else {
                od31Var = new od31(this, ibkVar);
            }
        } else {
            od31Var = new od31(this, ibkVar);
        }
        Object objM86757v = od31Var.f164089c;
        int i2 = od31Var.f164091e;
        vnt0 vnt0Var = this.f176344c;
        u6k u6kVar = null;
        Object[] objArr = 0;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            if (vnt0Var != null) {
                z6k z6kVar = w6kVar.f248412a;
                String str2 = z6kVar.f279941b;
                jlp0 jlp0Var2 = (str2 == null || new gf41(str2).f79270c != df41.PLAYLIST_V2 || (str = z6kVar.f279942c) == null) ? null : new jlp0(str2, str);
                if (!this.f176343b.f261055c) {
                    jlp0Var2 = null;
                }
                if (jlp0Var2 != null) {
                    xvx0 xvx0Var = this.f176342a;
                    nnc nncVarM92074U = xtm0.m92074U((luk0) ((p0p0) xvx0Var.f266533c).f172721b, new sb90((fbk) (objArr == true ? 1 : 0), (Object) jlp0Var2, (Object) xvx0Var, 27));
                    od31Var.f164087a = w6kVar;
                    od31Var.f164088b = jlp0Var2;
                    od31Var.f164091e = 1;
                    objM86757v = vyf1.m86757v(nncVarM92074U, od31Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM86757v == yukVar) {
                        return yukVar;
                    }
                    w6kVar2 = w6kVar;
                    jlp0Var = jlp0Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jlp0Var = od31Var.f164088b;
        w6kVar2 = od31Var.f164087a;
        bga.m29073P(objM86757v);
        yd31 yd31Var = (yd31) objM86757v;
        if (yd31Var != null && !yd31Var.equals(xd31.f260369a)) {
            if (!(yd31Var instanceof wd31)) {
                throw new NoWhenBranchMatchedException();
            }
            wd31 wd31Var = (wd31) yd31Var;
            if (wd31Var.f250199b) {
                eh00 eh00Var = w6kVar2.f248413b;
                jsn jsnVar = (jsn) vnt0Var.f243248b;
                String str3 = jlp0Var.f113663a;
                String str4 = jlp0Var.f113664b;
                otn otnVar = (otn) jsnVar.f115519a.f241006d;
                u6kVar = new u6k(new poz0(str3, str4, eh00Var, (ksn) otnVar.f169833n2.get(), (wt80) otnVar.f169389M0.get(), new m57(false, 22)));
            }
            ud31 ud31Var = wd31Var.f250200c;
            if (!ud31Var.equals(sd31.f207872a) && !ud31Var.equals(td31.f219220a) && !ud31Var.equals(rd31.f198016a)) {
                throw new NoWhenBranchMatchedException();
            }
            vd31 vd31Var = wd31Var.f250198a;
            String str5 = vd31Var.f240305a;
            String str6 = vd31Var.f240306b;
            String str7 = vd31Var.f240307c;
            Integer num = vd31Var.f240308d;
            return new v6k(u6kVar, new t6k(new s6k(num != null ? rfg1.m75432b(num.intValue()) : n6f.f150871k, str5, str6, str7)));
        }
        return null;
    }
}
