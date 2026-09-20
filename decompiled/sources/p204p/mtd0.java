package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mtd0 {

    /* JADX INFO: renamed from: a */
    public final w9p0 f147045a;

    /* JADX INFO: renamed from: b */
    public final at8 f147046b;

    /* JADX INFO: renamed from: f */
    public final qjx f147050f;

    /* JADX INFO: renamed from: i */
    public final xwo f147053i;

    /* JADX INFO: renamed from: j */
    public final kh61 f147054j;

    /* JADX INFO: renamed from: l */
    public boolean f147056l;

    /* JADX INFO: renamed from: k */
    public qv11 f147055k = new qv11();

    /* JADX INFO: renamed from: d */
    public final IdentityHashMap f147048d = new IdentityHashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f147049e = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f147047c = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final HashMap f147051g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final HashSet f147052h = new HashSet();

    public mtd0(qjx qjxVar, xwo xwoVar, kh61 kh61Var, w9p0 w9p0Var, at8 at8Var) {
        this.f147045a = w9p0Var;
        this.f147046b = at8Var;
        this.f147050f = qjxVar;
        this.f147053i = xwoVar;
        this.f147054j = kh61Var;
    }

    /* JADX INFO: renamed from: a */
    public final qp71 m62815a(int i, ArrayList arrayList, qv11 qv11Var) {
        if (!arrayList.isEmpty()) {
            this.f147055k = qv11Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                ltd0 ltd0Var = (ltd0) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.f147047c;
                if (i2 > 0) {
                    ltd0 ltd0Var2 = (ltd0) arrayList2.get(i2 - 1);
                    ltd0Var.m59878b(ltd0Var2.f136759a.m68786L().mo26655o() + ltd0Var2.f136762d);
                } else {
                    ltd0Var.m59878b(0);
                }
                int iMo26655o = ltd0Var.f136759a.m68786L().mo26655o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((ltd0) arrayList2.get(i3)).f136762d += iMo26655o;
                }
                arrayList2.add(i2, ltd0Var);
                this.f147049e.put(ltd0Var.f136760b, ltd0Var);
                if (this.f147056l) {
                    m62819e(ltd0Var);
                    if (this.f147048d.isEmpty()) {
                        this.f147052h.add(ltd0Var);
                    } else {
                        ktd0 ktd0Var = (ktd0) this.f147051g.get(ltd0Var);
                        if (ktd0Var != null) {
                            ktd0Var.f126242a.m89409g(ktd0Var.f126243b);
                        }
                    }
                }
            }
        }
        return m62816b();
    }

    /* JADX INFO: renamed from: b */
    public final qp71 m62816b() {
        ArrayList arrayList = this.f147047c;
        if (arrayList.isEmpty()) {
            return qp71.f191180a;
        }
        int iMo26655o = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            ltd0 ltd0Var = (ltd0) arrayList.get(i);
            ltd0Var.f136762d = iMo26655o;
            iMo26655o += ltd0Var.f136759a.m68786L().mo26655o();
        }
        return new jtp0(arrayList, this.f147055k);
    }

    /* JADX INFO: renamed from: c */
    public final void m62817c() {
        Iterator it = this.f147052h.iterator();
        while (it.hasNext()) {
            ltd0 ltd0Var = (ltd0) it.next();
            if (ltd0Var.f136761c.isEmpty()) {
                ktd0 ktd0Var = (ktd0) this.f147051g.get(ltd0Var);
                if (ktd0Var != null) {
                    ktd0Var.f126242a.m89409g(ktd0Var.f126243b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m62818d(ltd0 ltd0Var) {
        if (ltd0Var.f136763e && ltd0Var.f136761c.isEmpty()) {
            ktd0 ktd0Var = (ktd0) this.f147051g.remove(ltd0Var);
            ktd0Var.getClass();
            jtd0 jtd0Var = ktd0Var.f126244c;
            wz8 wz8Var = ktd0Var.f126242a;
            wz8Var.m89413w(ktd0Var.f126243b);
            wz8Var.m89415z(jtd0Var);
            wz8Var.m89414y(jtd0Var);
            this.f147052h.remove(ltd0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.etd0, p.wsd0] */
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
    /* JADX INFO: renamed from: e */
    public final void m62819e(ltd0 ltd0Var) {
        p1d0 p1d0Var = ltd0Var.f136759a;
        ?? r1 = new wsd0() { // from class: p.etd0
            @Override // p204p.wsd0
            /* JADX INFO: renamed from: a */
            public final void mo35153a(wz8 wz8Var, qp71 qp71Var) {
                kh61 kh61Var = this.f62683a.f147050f.f189355g;
                kh61Var.m56391i(2);
                kh61Var.m56392j(22);
            }
        };
        jtd0 jtd0Var = new jtd0(this, ltd0Var);
        this.f147051g.put(ltd0Var, new ktd0(p1d0Var, r1, jtd0Var));
        p1d0Var.m89407b(h0b1.m46331s(null), jtd0Var);
        p1d0Var.m89406a(h0b1.m46331s(null), jtd0Var);
        p1d0Var.m89411q(r1, this.f147045a, this.f147046b);
    }

    /* JADX INFO: renamed from: f */
    public final void m62820f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f147047c;
            ltd0 ltd0Var = (ltd0) arrayList.remove(i3);
            this.f147049e.remove(ltd0Var.f136760b);
            int i4 = -ltd0Var.f136759a.m68786L().mo26655o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((ltd0) arrayList.get(i5)).f136762d += i4;
            }
            ltd0Var.f136763e = true;
            if (this.f147056l) {
                m62818d(ltd0Var);
            }
        }
    }
}
