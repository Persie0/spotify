package p204p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class w591 {

    /* JADX INFO: renamed from: a */
    public final l971 f248034a;

    /* JADX INFO: renamed from: b */
    public uw40 f248035b;

    /* JADX INFO: renamed from: c */
    public final pqq0 f248036c;

    /* JADX INFO: renamed from: d */
    public final u4g1 f248037d;

    /* JADX INFO: renamed from: e */
    public final rtq f248038e;

    /* JADX INFO: renamed from: f */
    public final rtq f248039f;

    /* JADX INFO: renamed from: g */
    public final yum0 f248040g;

    public w591(l971 l971Var, uw40 uw40Var, pqq0 pqq0Var, u4g1 u4g1Var) {
        this.f248034a = l971Var;
        this.f248035b = uw40Var;
        this.f248036c = pqq0Var;
        this.f248037d = u4g1Var;
        this.f248038e = u4g1Var != null ? sam.m77674m(new v631(6, this, u4g1Var)) : null;
        this.f248039f = pqq0Var != null ? sam.m77674m(new v631(7, this, pqq0Var)) : null;
        this.f248040g = sam.m77645B(new foz0(1, 1));
    }

    /* JADX INFO: renamed from: l */
    public static void m87227l(w591 w591Var, CharSequence charSequence, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        int i2 = (i & 4) != 0 ? 1 : 3;
        if ((i & 8) != 0) {
            z = true;
        }
        l971 l971Var = w591Var.f248034a;
        uw40 uw40Var = w591Var.f248035b;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        if (z2) {
            t571Var.m80104m(null);
        }
        long j = t571Var.f217236e;
        t571Var.m80101j(ic71.m50239g(j), ic71.m50238f(j), charSequence);
        int length = charSequence.length() + ic71.m50239g(j);
        osg1.m67736v(t571Var, length, length);
        w591Var.m87243q(t571Var);
        l971.m58497a(l971Var, uw40Var, z, i2);
        l971Var.m58502f(true);
    }

    /* JADX INFO: renamed from: m */
    public static void m87228m(w591 w591Var, String str, long j, boolean z, int i) {
        if ((i & 8) != 0) {
            z = true;
        }
        l971 l971Var = w591Var.f248034a;
        uw40 uw40Var = w591Var.f248035b;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        long jM87237i = w591Var.m87237i(j);
        t571Var.m80101j(ic71.m50239g(jM87237i), ic71.m50238f(jM87237i), str);
        int length = str.length() + ic71.m50239g(jM87237i);
        osg1.m67736v(t571Var, length, length);
        w591Var.m87243q(t571Var);
        l971.m58497a(l971Var, uw40Var, z, 1);
        l971Var.m58502f(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m87229a() {
        uw40 uw40Var = this.f248035b;
        l971 l971Var = this.f248034a;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        int iM50238f = ic71.m50238f(t571Var.f217236e);
        osg1.m67736v(t571Var, iM50238f, iM50238f);
        l971.m58497a(l971Var, uw40Var, true, 1);
        l971Var.m58502f(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    /* JADX INFO: renamed from: b */
    public final void m87230b(final ir4 ir4Var, ibk ibkVar) {
        v591 v591Var;
        j971 j971Var;
        if (ibkVar instanceof v591) {
            v591Var = (v591) ibkVar;
            int i = v591Var.f237380c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v591Var.f237380c = i - Integer.MIN_VALUE;
            } else {
                v591Var = new v591(this, ibkVar);
            }
        } else {
            v591Var = new v591(this, ibkVar);
        }
        Object obj = v591Var.f237378a;
        int i2 = v591Var.f237380c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f248037d != null) {
                j971Var = ir4Var;
                j971Var = new j971() { // from class: p.t591
                    @Override // p204p.j971
                    /* JADX INFO: renamed from: a */
                    public final void mo51429a(u571 u571Var, u571 u571Var2, boolean z) {
                        w591 w591Var = this;
                        u591 u591VarM37737h = e45.m37737h(u571Var, w591Var.f248037d, w591Var.m87233e());
                        if (u591VarM37737h != null) {
                            u571Var = u591VarM37737h.f226951a;
                        }
                        ir4Var.mo51429a(u571Var, w591Var.m87235g(), z);
                    }
                };
            }
            j971Var = ir4Var;
            v591Var.f237380c = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(v591Var));
            hqbVar.m48222q();
            this.f248034a.f131028g.m73556b(j971Var);
            hqbVar.mo42415l(new n7w0(4, this, j971Var));
            if (hqbVar.m48221p() == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: c */
    public final void m87231c() {
        uw40 uw40Var = this.f248035b;
        l971 l971Var = this.f248034a;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        t571Var.m80101j(ic71.m50239g(t571Var.f217236e), ic71.m50238f(t571Var.f217236e), "");
        int iM50239g = ic71.m50239g(t571Var.f217236e);
        osg1.m67736v(t571Var, iM50239g, iM50239g);
        m87243q(t571Var);
        l971.m58497a(l971Var, uw40Var, true, 3);
        l971Var.m58502f(true);
    }

    /* JADX INFO: renamed from: d */
    public final u571 m87232d() {
        u591 u591Var;
        rtq rtqVar = this.f248038e;
        return (rtqVar == null || (u591Var = (u591) rtqVar.getValue()) == null) ? this.f248034a.m58500d() : u591Var.f226951a;
    }

    /* JADX INFO: renamed from: e */
    public final foz0 m87233e() {
        return (foz0) this.f248040g.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w591)) {
            return false;
        }
        w591 w591Var = (w591) obj;
        if (wj50.m88271j(this.f248034a, w591Var.f248034a) && wj50.m88271j(this.f248036c, w591Var.f248036c)) {
            return wj50.m88271j(this.f248037d, w591Var.f248037d);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final u571 m87234f() {
        return this.f248034a.m58500d();
    }

    /* JADX INFO: renamed from: g */
    public final u571 m87235g() {
        u591 u591Var;
        rtq rtqVar = this.f248039f;
        return (rtqVar == null || (u591Var = (u591) rtqVar.getValue()) == null) ? m87232d() : u591Var.f226951a;
    }

    /* JADX INFO: renamed from: h */
    public final long m87236h(int i) {
        u591 u591Var;
        u591 u591Var2;
        mir mirVar = null;
        rtq rtqVar = this.f248038e;
        mir mirVar2 = (rtqVar == null || (u591Var2 = (u591) rtqVar.getValue()) == null) ? null : u591Var2.f226952b;
        rtq rtqVar2 = this.f248039f;
        if (rtqVar2 != null && (u591Var = (u591) rtqVar2.getValue()) != null) {
            mirVar = u591Var.f226952b;
        }
        long jM61900c = mirVar != null ? mirVar.m61900c(i, false) : dvg1.m37112n(i, i);
        return mirVar2 != null ? e45.m37742q(jM61900c, mirVar2) : jM61900c;
    }

    public final int hashCode() {
        int iHashCode = this.f248034a.hashCode() * 31;
        pqq0 pqq0Var = this.f248036c;
        int iHashCode2 = (iHashCode + (pqq0Var != null ? pqq0Var.hashCode() : 0)) * 31;
        u4g1 u4g1Var = this.f248037d;
        return iHashCode2 + (u4g1Var != null ? u4g1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final long m87237i(long j) {
        u591 u591Var;
        u591 u591Var2;
        mir mirVar = null;
        rtq rtqVar = this.f248038e;
        mir mirVar2 = (rtqVar == null || (u591Var2 = (u591) rtqVar.getValue()) == null) ? null : u591Var2.f226952b;
        rtq rtqVar2 = this.f248039f;
        if (rtqVar2 != null && (u591Var = (u591) rtqVar2.getValue()) != null) {
            mirVar = u591Var.f226952b;
        }
        if (mirVar != null) {
            j = e45.m37742q(j, mirVar);
        }
        return mirVar2 != null ? e45.m37742q(j, mirVar2) : j;
    }

    /* JADX INFO: renamed from: j */
    public final long m87238j(long j) {
        u591 u591Var;
        u591 u591Var2;
        rtq rtqVar = this.f248038e;
        mir mirVar = (rtqVar == null || (u591Var2 = (u591) rtqVar.getValue()) == null) ? null : u591Var2.f226952b;
        rtq rtqVar2 = this.f248039f;
        mir mirVar2 = (rtqVar2 == null || (u591Var = (u591) rtqVar2.getValue()) == null) ? null : u591Var.f226952b;
        if (mirVar != null) {
            j = e45.m37746x(j, mirVar, null);
        }
        return mirVar2 != null ? e45.m37746x(j, mirVar2, m87233e()) : j;
    }

    /* JADX INFO: renamed from: k */
    public final void m87239k(CharSequence charSequence) {
        uw40 uw40Var = this.f248035b;
        l971 l971Var = this.f248034a;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        t571Var.m80101j(0, t571Var.f217234c.length(), "");
        t571Var.append(charSequence.toString());
        m87243q(t571Var);
        l971.m58497a(l971Var, uw40Var, true, 1);
        l971Var.m58502f(true);
    }

    /* JADX INFO: renamed from: n */
    public final void m87240n(long j) {
        m87241o(m87237i(j));
    }

    /* JADX INFO: renamed from: o */
    public final void m87241o(long j) {
        uw40 uw40Var = this.f248035b;
        l971 l971Var = this.f248034a;
        l971Var.f131023b.m80094c().m31891n();
        t571 t571Var = l971Var.f131023b;
        int i = ic71.f100751c;
        osg1.m67736v(t571Var, (int) (j >> 32), (int) (j & 4294967295L));
        l971.m58497a(l971Var, uw40Var, true, 1);
        l971Var.m58502f(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m87242p(foz0 foz0Var) {
        this.f248040g.setValue(foz0Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m87243q(t571 t571Var) {
        if (((qqi0) t571Var.m80094c().f35413b).f191610c <= 0 || !ic71.m50236d(t571Var.f217236e)) {
            return;
        }
        m87242p(new foz0(1, 1));
    }

    public final String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f248034a + ", outputTransformation=" + this.f248037d + ", outputTransformedText=" + this.f248038e + ", codepointTransformation=" + this.f248036c + ", codepointTransformedText=" + this.f248039f + ", outputText=\"" + ((Object) m87232d()) + "\", visualText=\"" + ((Object) m87235g()) + "\")";
    }
}
