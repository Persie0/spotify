package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class oyq extends cfe0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ qr60[] f171837f = {new wys0(oyq.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new wys0(oyq.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: b */
    public final s2o f171838b;

    /* JADX INFO: renamed from: c */
    public final nyq f171839c;

    /* JADX INFO: renamed from: d */
    public final yma0 f171840d;

    /* JADX INFO: renamed from: e */
    public final xma0 f171841e;

    public oyq(s2o s2oVar, List list, List list2, List list3, eh00 eh00Var) {
        this.f171838b = s2oVar;
        n06 n06Var = (n06) s2oVar.f205039f;
        ((wow0) n06Var.f148909d).getClass();
        this.f171839c = new nyq(this, list, list2, list3);
        y751 y751Var = (y751) n06Var.f148907b;
        kyq kyqVar = new kyq(0, eh00Var);
        bna0 bna0Var = (bna0) y751Var;
        bna0Var.getClass();
        this.f171840d = new yma0(bna0Var, kyqVar);
        C2642z9 c2642z9 = new C2642z9(this, 22);
        bna0 bna0Var2 = (bna0) y751Var;
        bna0Var2.getClass();
        this.f171841e = new xma0(bna0Var2, c2642z9);
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: a */
    public Collection mo27568a(qti0 qti0Var, pkj0 pkj0Var) {
        nyq nyqVar = this.f171839c;
        yma0 yma0Var = nyqVar.f159887h;
        qr60 qr60Var = nyq.f159879j[1];
        return !((Set) yma0Var.invoke()).contains(qti0Var) ? lau.f131415a : (Collection) nyqVar.f159884e.invoke(qti0Var);
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: b */
    public final Set mo25810b() {
        yma0 yma0Var = this.f171839c.f159886g;
        qr60 qr60Var = nyq.f159879j[0];
        return (Set) yma0Var.invoke();
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: c */
    public Collection mo27569c(qti0 qti0Var, pkj0 pkj0Var) {
        nyq nyqVar = this.f171839c;
        yma0 yma0Var = nyqVar.f159886g;
        qr60 qr60Var = nyq.f159879j[0];
        return !((Set) yma0Var.invoke()).contains(qti0Var) ? lau.f131415a : (Collection) nyqVar.f159883d.invoke(qti0Var);
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: e */
    public final Set mo25811e() {
        qr60 qr60Var = f171837f[1];
        return (Set) this.f171841e.invoke();
    }

    @Override // p204p.cfe0, p204p.bfe0
    /* JADX INFO: renamed from: f */
    public final Set mo25812f() {
        yma0 yma0Var = this.f171839c.f159887h;
        qr60 qr60Var = nyq.f159879j[1];
        return (Set) yma0Var.invoke();
    }

    @Override // p204p.cfe0, p204p.oyw0
    /* JADX INFO: renamed from: g */
    public qge mo27571g(qti0 qti0Var, pkj0 pkj0Var) {
        if (mo68560q(qti0Var)) {
            return ((n06) this.f171838b.f205039f).m63281d(mo37351l(qti0Var));
        }
        nyq nyqVar = this.f171839c;
        if (nyqVar.f159882c.keySet().contains(qti0Var)) {
            return (cn91) nyqVar.f159885f.invoke(qti0Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo37348h(ArrayList arrayList);

    /* JADX INFO: renamed from: i */
    public final List m68558i(exq exqVar, gh00 gh00Var) {
        ArrayList arrayList = new ArrayList(0);
        if (exqVar.m40266a(exq.f63820f)) {
            mo37348h(arrayList);
        }
        nyq nyqVar = this.f171839c;
        nyqVar.getClass();
        yma0 yma0Var = nyqVar.f159886g;
        yma0 yma0Var2 = nyqVar.f159887h;
        ecb ecbVar = ecb.f58297i;
        boolean zM40266a = exqVar.m40266a(exq.f63824j);
        lau lauVar = lau.f131415a;
        if (zM40266a) {
            qr60 qr60Var = nyq.f159879j[1];
            Set<qti0> set = (Set) yma0Var2.invoke();
            ArrayList arrayList2 = new ArrayList();
            for (qti0 qti0Var : set) {
                if (((Boolean) gh00Var.invoke(qti0Var)).booleanValue()) {
                    qr60 qr60Var2 = nyq.f159879j[1];
                    arrayList2.addAll(!((Set) yma0Var2.invoke()).contains(qti0Var) ? lauVar : (Collection) nyqVar.f159884e.invoke(qti0Var));
                }
            }
            j6f.m52572d0(arrayList2, ecbVar);
            arrayList.addAll(arrayList2);
        }
        if (exqVar.m40266a(exq.f63823i)) {
            qr60 qr60Var3 = nyq.f159879j[0];
            Set<qti0> set2 = (Set) yma0Var.invoke();
            ArrayList arrayList3 = new ArrayList();
            for (qti0 qti0Var2 : set2) {
                if (((Boolean) gh00Var.invoke(qti0Var2)).booleanValue()) {
                    qr60 qr60Var4 = nyq.f159879j[0];
                    arrayList3.addAll(!((Set) yma0Var.invoke()).contains(qti0Var2) ? lauVar : (Collection) nyqVar.f159883d.invoke(qti0Var2));
                }
            }
            j6f.m52572d0(arrayList3, ecbVar);
            arrayList.addAll(arrayList3);
        }
        if (exqVar.m40266a(exq.f63826l)) {
            for (qti0 qti0Var3 : m68559m()) {
                if (((Boolean) gh00Var.invoke(qti0Var3)).booleanValue()) {
                    ceg1.m32571j(arrayList, ((n06) this.f171838b.f205039f).m63281d(mo37351l(qti0Var3)));
                }
            }
        }
        if (exqVar.m40266a(exq.f63821g)) {
            for (qti0 qti0Var4 : nyqVar.f159882c.keySet()) {
                if (((Boolean) gh00Var.invoke(qti0Var4)).booleanValue()) {
                    ceg1.m32571j(arrayList, (cn91) nyqVar.f159885f.invoke(qti0Var4));
                }
            }
        }
        return ceg1.m32572k(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public abstract vfe mo37351l(qti0 qti0Var);

    /* JADX INFO: renamed from: m */
    public final Set m68559m() {
        qr60 qr60Var = f171837f[0];
        return (Set) this.f171840d.invoke();
    }

    /* JADX INFO: renamed from: n */
    public abstract Set mo37352n();

    /* JADX INFO: renamed from: o */
    public abstract Set mo37353o();

    /* JADX INFO: renamed from: p */
    public abstract Set mo37354p();

    /* JADX INFO: renamed from: q */
    public boolean mo68560q(qti0 qti0Var) {
        return m68559m().contains(qti0Var);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo37355r(ryq ryqVar) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void mo37349j(ArrayList arrayList, qti0 qti0Var) {
    }

    /* JADX INFO: renamed from: k */
    public void mo37350k(ArrayList arrayList, qti0 qti0Var) {
    }
}
