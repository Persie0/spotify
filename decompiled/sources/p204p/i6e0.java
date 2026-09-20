package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class i6e0 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f99218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f99219b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f99220c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vum0 f99221d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fyf f99222e;

    public i6e0(ArrayList arrayList, float f, int i, vum0 vum0Var, fyf fyfVar) {
        this.f99218a = arrayList;
        this.f99219b = f;
        this.f99220c = i;
        this.f99221d = vum0Var;
        this.f99222e = fyfVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft70 ft70Var = (ft70) obj;
        int iIntValue = ((Number) obj2).intValue();
        xq00 xq00Var = (xq00) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (xq00Var.m91766g(ft70Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= xq00Var.m91762e(iIntValue) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            ezs0 ezs0Var = (ezs0) this.f99218a.get(iIntValue);
            xq00Var.m91771i0(-658516213);
            fxh0 fxh0VarM61838v = mi21.m61838v(((ybs) jlg1.m53715y(new ybs(this.f99219b), new ybs(this.f99220c))).f271238a, cxh0.f43038a);
            vum0 vum0Var = this.f99221d;
            boolean zM91770i = xq00Var.m91770i(vum0Var);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new ej8(vum0Var, 24);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM45144n = glf1.m45144n(fxh0VarM61838v, (gh00) objM91750T);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM45144n);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            this.f99222e.mo24818M(Integer.valueOf(iIntValue), ezs0Var, xq00Var, Integer.valueOf((i2 >> 3) & 14));
            xq00Var.m91788r(true);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }
}
