package p204p;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class du70 extends cfe0 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ qr60[] f52989m = {new wys0(du70.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new wys0(du70.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new wys0(du70.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: b */
    public final z9t f52990b;

    /* JADX INFO: renamed from: c */
    public final du70 f52991c;

    /* JADX INFO: renamed from: d */
    public final tma0 f52992d;

    /* JADX INFO: renamed from: e */
    public final yma0 f52993e;

    /* JADX INFO: renamed from: f */
    public final vma0 f52994f;

    /* JADX INFO: renamed from: g */
    public final nwo f52995g;

    /* JADX INFO: renamed from: h */
    public final vma0 f52996h;

    /* JADX INFO: renamed from: i */
    public final yma0 f52997i;

    /* JADX INFO: renamed from: j */
    public final yma0 f52998j;

    /* JADX INFO: renamed from: k */
    public final yma0 f52999k;

    /* JADX INFO: renamed from: l */
    public final vma0 f53000l;

    public du70(z9t z9tVar, qt70 qt70Var) {
        this.f52990b = z9tVar;
        this.f52991c = qt70Var;
        y751 y751Var = (y751) ((qwm) z9tVar.f280873b).f193363a;
        zt70 zt70Var = new zt70(this, 0);
        bna0 bna0Var = (bna0) y751Var;
        bna0Var.getClass();
        this.f52992d = new tma0(bna0Var, zt70Var);
        zt70 zt70Var2 = new zt70(this, 1);
        bna0 bna0Var2 = (bna0) y751Var;
        bna0Var2.getClass();
        this.f52993e = new yma0(bna0Var2, zt70Var2);
        this.f52994f = ((bna0) y751Var).m29937b(new au70(this, 0));
        this.f52995g = ((bna0) y751Var).m29938c(new au70(this, 1));
        this.f52996h = ((bna0) y751Var).m29937b(new au70(this, 2));
        zt70 zt70Var3 = new zt70(this, 2);
        bna0 bna0Var3 = (bna0) y751Var;
        bna0Var3.getClass();
        this.f52997i = new yma0(bna0Var3, zt70Var3);
        zt70 zt70Var4 = new zt70(this, 3);
        bna0 bna0Var4 = (bna0) y751Var;
        bna0Var4.getClass();
        this.f52998j = new yma0(bna0Var4, zt70Var4);
        zt70 zt70Var5 = new zt70(this, 4);
        bna0 bna0Var5 = (bna0) y751Var;
        bna0Var5.getClass();
        this.f52999k = new yma0(bna0Var5, zt70Var5);
        this.f53000l = ((bna0) y751Var).m29937b(new au70(this, 3));
    }

    /* JADX INFO: renamed from: t */
    public static cu70 m36909t(z9t z9tVar, pi00 pi00Var, List list) {
        pqm0 pqm0Var;
        qti0 qti0Var;
        qti0 qti0VarM73841e;
        u010 u010Var = (u010) z9tVar.f280876e;
        qwm qwmVar = (qwm) z9tVar.f280873b;
        mxh0 mxh0Var = (mxh0) qwmVar.f193377o;
        co40 co40VarM43744r1 = g6f.m43744r1(list);
        ArrayList arrayList = new ArrayList(i6f.m49804T(co40VarM43744r1, 10));
        Iterator it = co40VarM43744r1.iterator();
        boolean z = false;
        while (true) {
            do40 do40Var = (do40) it;
            if (!((Iterator) do40Var.f50936c).hasNext()) {
                return new cu70(g6f.m43728j1(arrayList), z);
            }
            bo40 bo40Var = (bo40) do40Var.next();
            int i = bo40Var.f29008a;
            apv0 apv0Var = (apv0) bo40Var.f29009b;
            kt70 kt70VarM86778r = vyg1.m86778r(z9tVar, apv0Var);
            be60 be60VarM73122s = qkg1.m73122s(2, false, null, 7);
            boolean z2 = apv0Var.f18026e;
            yov0 yov0Var = apv0Var.f18023b;
            if (z2) {
                gov0 gov0Var = yov0Var instanceof gov0 ? (gov0) yov0Var : null;
                if (gov0Var == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + apv0Var);
                }
                d6a1 d6a1VarM82085F = u010Var.m82085F(gov0Var, be60VarM73122s, true);
                pqm0Var = new pqm0(d6a1VarM82085F, mxh0Var.mo53211g().m50154g(d6a1VarM82085F));
            } else {
                pqm0Var = new pqm0(u010Var.m82086G(yov0Var, be60VarM73122s), null);
            }
            gd70 gd70Var = (gd70) pqm0Var.f180350a;
            gd70 gd70Var2 = (gd70) pqm0Var.f180351b;
            if (wj50.m88271j(pi00Var.getName().m73844b(), "equals") && list.size() == 1 && mxh0Var.mo53211g().m50163p().equals(gd70Var)) {
                qti0VarM73841e = qti0.m73841e("other");
            } else {
                String str = apv0Var.f18025d;
                qti0 qti0VarM73840d = str != null ? qti0.m73840d(str) : null;
                if (qti0VarM73840d == null) {
                    z = true;
                }
                if (qti0VarM73840d == null) {
                    qti0VarM73841e = qti0.m73841e("p" + i);
                } else {
                    qti0Var = qti0VarM73840d;
                }
                ((ykq0) qwmVar.f193372j).getClass();
                arrayList.add(new s3b1(pi00Var, null, i, kt70VarM86778r, qti0Var, gd70Var, false, false, false, gd70Var2, new kvx0(apv0Var)));
            }
            qti0Var = qti0VarM73841e;
            ((ykq0) qwmVar.f193372j).getClass();
            arrayList.add(new s3b1(pi00Var, null, i, kt70VarM86778r, qti0Var, gd70Var, false, false, false, gd70Var2, new kvx0(apv0Var)));
        }
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: a */
    public Collection mo27568a(qti0 qti0Var, pkj0 pkj0Var) {
        return !mo25812f().contains(qti0Var) ? lau.f131415a : (Collection) this.f53000l.invoke(qti0Var);
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: b */
    public final Set mo25810b() {
        qr60 qr60Var = f52989m[0];
        return (Set) this.f52997i.invoke();
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: c */
    public Collection mo27569c(qti0 qti0Var, pkj0 pkj0Var) {
        return !mo25810b().contains(qti0Var) ? lau.f131415a : (Collection) this.f52996h.invoke(qti0Var);
    }

    @Override // p204p.cfe0, p204p.oyw0
    /* JADX INFO: renamed from: d */
    public Collection mo27570d(exq exqVar, gh00 gh00Var) {
        return (Collection) this.f52992d.invoke();
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: e */
    public final Set mo25811e() {
        qr60 qr60Var = f52989m[2];
        return (Set) this.f52999k.invoke();
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: f */
    public final Set mo25812f() {
        qr60 qr60Var = f52989m[1];
        return (Set) this.f52998j.invoke();
    }

    /* JADX INFO: renamed from: h */
    public abstract Set mo36910h(exq exqVar, gh00 gh00Var);

    /* JADX INFO: renamed from: i */
    public abstract Set mo36911i(exq exqVar, mxq mxqVar);

    /* JADX INFO: renamed from: k */
    public abstract vqo mo36913k();

    /* JADX INFO: renamed from: l */
    public abstract void mo36914l(LinkedHashSet linkedHashSet, qti0 qti0Var);

    /* JADX INFO: renamed from: m */
    public abstract void mo36915m(ArrayList arrayList, qti0 qti0Var);

    /* JADX INFO: renamed from: n */
    public abstract Set mo36916n();

    /* JADX INFO: renamed from: o */
    public abstract wr70 mo36917o();

    /* JADX INFO: renamed from: p */
    public abstract oqo mo36918p();

    /* JADX INFO: renamed from: q */
    public boolean mo36919q(nd60 nd60Var) {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public abstract bu70 mo36920r(ArrayList arrayList, gd70 gd70Var, List list);

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: s */
    public final nd60 m36921s(uov0 uov0Var) {
        z9t z9tVar = this.f52990b;
        kt70 kt70VarM86778r = vyg1.m86778r(z9tVar, uov0Var);
        oqo oqoVarMo36918p = mo36918p();
        qti0 qti0VarM81220u = uov0Var.m81220u();
        ((ykq0) ((qwm) z9tVar.f280873b).f193372j).getClass();
        int i = 1;
        nd60 nd60VarM64195W1 = nd60.m64195W1(oqoVarMo36918p, kt70VarM86778r, qti0VarM81220u, new kvx0(uov0Var), ((vqo) this.f52993e.invoke()).mo61628c(uov0Var.m81220u()) != null && ((ArrayList) uov0Var.m83637z()).isEmpty());
        z9t z9tVarM40594i = f2h1.m40594i(z9tVar, nd60VarM64195W1, uov0Var, 0, z9tVar.f280875d);
        ArrayList typeParameters = uov0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(i6f.m49804T(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            bo91 bo91VarMo39549d = ((eo91) z9tVarM40594i.f280874c).mo39549d((zov0) it.next());
            wj50.m88279p(bo91VarMo39549d);
            arrayList.add(bo91VarMo39549d);
        }
        cu70 cu70VarM36909t = m36909t(z9tVarM40594i, nd60VarM64195W1, uov0Var.m83637z());
        bu70 bu70VarMo36920r = mo36920r(arrayList, ((u010) z9tVarM40594i.f280876e).m82086G(uov0Var.m83636y(), qkg1.m73122s(2, ((Method) uov0Var.mo70492t()).getDeclaringClass().isAnnotation(), null, 6)), cu70VarM36909t.f42068b);
        List list = bu70VarMo36920r.f31047d;
        wr70 wr70VarMo36917o = mo36917o();
        ArrayList arrayList2 = bu70VarMo36920r.f31046c;
        List list2 = bu70VarMo36920r.f31045b;
        gd70 gd70Var = bu70VarMo36920r.f31044a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) uov0Var.mo70492t()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) uov0Var.mo70492t()).getModifiers());
        if (zIsAbstract) {
            i = 4;
        } else if (!zIsFinal) {
            i = 3;
        }
        nd60VarM64195W1.mo64196V1(null, wr70VarMo36917o, lau.f131415a, arrayList2, list2, gd70Var, i, wcg1.m87748m(uov0Var.m81222w()), nau.f152117a);
        nd60VarM64195W1.f177782N0 = Modifier.isNative(uov0Var.f232526b.getModifiers());
        nd60VarM64195W1.m64197X1(false, cu70VarM36909t.f42067a);
        if (list.isEmpty()) {
            return nd60VarM64195W1;
        }
        ((mmq0) ((qwm) z9tVarM40594i.f280873b).f193367e).getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + mo36918p();
    }

    /* JADX INFO: renamed from: j */
    public void mo36912j(ArrayList arrayList, qti0 qti0Var) {
    }
}
