package p204p;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ad70 extends bc70 implements hpv0 {

    /* JADX INFO: renamed from: b */
    public final nq60 f14548b;

    /* JADX INFO: renamed from: c */
    public final String f14549c;

    /* JADX INFO: renamed from: d */
    public final Object f14550d;

    /* JADX INFO: renamed from: e */
    public final x870 f14551e;

    /* JADX INFO: renamed from: f */
    public final Object f14552f = q3d0.m72078I(2, new oc70(this, 0));

    /* JADX INFO: renamed from: g */
    public final Object f14553g = q3d0.m72078I(2, new oc70(this, 1));

    /* JADX INFO: renamed from: h */
    public final Object f14554h = q3d0.m72078I(2, new oc70(this, 2));

    /* JADX INFO: renamed from: i */
    public final Object f14555i = q3d0.m72078I(2, new oc70(this, 3));

    /* JADX INFO: renamed from: t */
    public final Object f14556t = q3d0.m72078I(2, new oc70(this, 4));

    public ad70(nq60 nq60Var, String str, Object obj, x870 x870Var) {
        this.f14548b = nq60Var;
        this.f14549c = str;
        this.f14550d = obj;
        this.f14551e = x870Var;
    }

    /* JADX INFO: renamed from: A */
    public final Member m25522A() {
        zk1 zk1Var = gr6.f83662p;
        qr60 qr60Var = gr6.f83647a[41];
        x870 x870Var = this.f14551e;
        if (!zk1Var.m96258A(x870Var)) {
            return null;
        }
        jo60 jo60Var = npg1.m65333n(x870Var).f179620f;
        if (jo60Var == null) {
            return mo25524E();
        }
        return this.f14548b.m65383P(jo60Var.f114337c, jo60Var.f114338d);
    }

    @Override // p204p.sb70
    /* JADX INFO: renamed from: C */
    public final GenericDeclaration mo25523C() {
        return iug1.m51689r(this.f14548b, this.f14549c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.hpv0
    /* JADX INFO: renamed from: E */
    public final Field mo25524E() {
        return (Field) this.f14556t.getValue();
    }

    /* JADX INFO: renamed from: G */
    public abstract qc70 mo25525G();

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: J */
    public final Object mo25526J() {
        return this.f14550d;
    }

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: a */
    public final nq60 mo25527a() {
        return this.f14548b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.rp60
    /* JADX INFO: renamed from: e */
    public final List mo25528e() {
        return (List) this.f14553g.getValue();
    }

    public final boolean equals(Object obj) {
        hpv0 hpv0VarM52044c = j0b1.m52044c(obj);
        return hpv0VarM52044c != null && wj50.m88271j(this.f14548b, hpv0VarM52044c.mo25527a()) && wj50.m88271j(this.f14551e.f259066b, hpv0VarM52044c.getName()) && wj50.m88271j(this.f14549c, hpv0VarM52044c.mo25532m()) && wj50.m88271j(this.f14550d, hpv0VarM52044c.mo25526J());
    }

    @Override // p204p.qp60
    public final List getAnnotations() {
        Annotation[] annotations;
        boolean zM34647h = d1h1.m34647h(this);
        x870 x870Var = this.f14551e;
        nq60 nq60Var = this.f14548b;
        if (zM34647h) {
            ArrayList arrayList = x870Var.f259076l;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(qlk.m73239r((n770) it.next(), nq60Var.mo28587A().getClassLoader()));
            }
            return arrayList2;
        }
        if (!(nq60Var instanceof gr60)) {
            throw new IllegalArgumentException(("Annotations are only supported for top-level properties for now: " + this).toString());
        }
        jo60 jo60Var = npg1.m65333n(x870Var).f179619e;
        if (jo60Var == null) {
            return lau.f131415a;
        }
        Method methodM65383P = nq60Var.m65383P(jo60Var.f114337c, jo60Var.f114338d);
        if (methodM65383P != null && (annotations = methodM65383P.getAnnotations()) != null) {
            return j0b1.m52061t(bk5.m29620k1(annotations));
        }
        throw new cvk("No synthetic method found: " + this);
    }

    @Override // p204p.cpv0
    public final lbb getCaller() {
        return mo25525G().getCaller();
    }

    @Override // p204p.rp60
    public final String getName() {
        return this.f14551e.f259066b;
    }

    @Override // p204p.rp60
    /* JADX INFO: renamed from: h */
    public final boolean mo25529h() {
        return false;
    }

    public final int hashCode() {
        return this.f14549c.hashCode() + s571.m77243b(this.f14548b.hashCode() * 31, 31, this.f14551e.f259066b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.rp60
    /* JADX INFO: renamed from: i */
    public final sr60 mo25530i() {
        return (sr60) this.f14554h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.cpv0
    /* JADX INFO: renamed from: k */
    public final List mo25531k() {
        return (List) this.f14552f.getValue();
    }

    @Override // p204p.hpv0
    /* JADX INFO: renamed from: m */
    public final String mo25532m() {
        return this.f14549c;
    }

    @Override // p204p.cpv0
    /* JADX INFO: renamed from: o */
    public final lbb mo25533o() {
        mo25525G().getClass();
        return null;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        qyq0.m74218a(sb, this);
        sb.append(this instanceof br60 ? "var " : "val ");
        qyq0.m74220c(sb, this);
        qyq0.m74219b(sb, this.f14551e.f259066b);
        sb.append(": ");
        sb.append(qyq0.m74225j(mo25530i(), false));
        return sb.toString();
    }
}
