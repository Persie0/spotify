package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gla1 {

    /* JADX INFO: renamed from: d */
    public jla1 f81038d;

    /* JADX INFO: renamed from: e */
    public final Object f81039e;

    /* JADX INFO: renamed from: f */
    public jla1 f81040f;

    /* JADX INFO: renamed from: g */
    public j28 f81041g;

    /* JADX INFO: renamed from: h */
    public jla1 f81042h;

    /* JADX INFO: renamed from: i */
    public Rect f81043i;

    /* JADX INFO: renamed from: k */
    public ifb f81045k;

    /* JADX INFO: renamed from: l */
    public ifb f81046l;

    /* JADX INFO: renamed from: a */
    public final HashSet f81035a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final Object f81036b = new Object();

    /* JADX INFO: renamed from: c */
    public int f81037c = 2;

    /* JADX INFO: renamed from: j */
    public Matrix f81044j = new Matrix();

    /* JADX INFO: renamed from: m */
    public vxz0 f81047m = vxz0.m86699a();

    /* JADX INFO: renamed from: n */
    public vxz0 f81048n = vxz0.m86699a();

    public gla1(jla1 jla1Var) {
        this.f81039e = jla1Var;
        this.f81040f = jla1Var;
    }

    /* JADX INFO: renamed from: A */
    public final void m45107A(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f81047m = (vxz0) list.get(0);
        if (list.size() > 1) {
            this.f81048n = (vxz0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (mjq mjqVar : ((vxz0) it.next()).m86700b()) {
                if (mjqVar.f144314j == null) {
                    mjqVar.f144314j = getClass();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m45108a(ifb ifbVar, ifb ifbVar2, jla1 jla1Var, jla1 jla1Var2) {
        synchronized (this.f81036b) {
            this.f81045k = ifbVar;
            this.f81046l = ifbVar2;
            this.f81035a.add(ifbVar);
            if (ifbVar2 != null) {
                this.f81035a.add(ifbVar2);
            }
        }
        this.f81038d = jla1Var;
        this.f81042h = jla1Var2;
        this.f81040f = m45116l(ifbVar.mo50329g(), this.f81038d, this.f81042h);
        mo45120p();
    }

    /* JADX INFO: renamed from: b */
    public final ifb m45109b() {
        ifb ifbVar;
        synchronized (this.f81036b) {
            ifbVar = this.f81045k;
        }
        return ifbVar;
    }

    /* JADX INFO: renamed from: c */
    public final veb m45110c() {
        synchronized (this.f81036b) {
            try {
                ifb ifbVar = this.f81045k;
                if (ifbVar == null) {
                    return veb.f240665a;
                }
                return ifbVar.mo50326c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m45111d() {
        ifb ifbVarM45109b = m45109b();
        wj50.m88280q(ifbVarM45109b, "No camera attached to use case: " + this);
        return ifbVarM45109b.mo50329g().mo44590b();
    }

    /* JADX INFO: renamed from: e */
    public abstract jla1 mo43548e(boolean z, mla1 mla1Var);

    /* JADX INFO: renamed from: f */
    public final String m45112f() {
        String str = (String) this.f81040f.mo39830f(nu61.f158519t0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    /* JADX INFO: renamed from: g */
    public final int m45113g(ifb ifbVar, boolean z) {
        int iMo44598j = ifbVar.mo50329g().mo44598j(((y940) this.f81040f).m93145n());
        return (ifbVar.mo50434n() || !z) ? iMo44598j : j591.m52451f(-iMo44598j);
    }

    /* JADX INFO: renamed from: h */
    public final ifb m45114h() {
        ifb ifbVar;
        synchronized (this.f81036b) {
            ifbVar = this.f81046l;
        }
        return ifbVar;
    }

    /* JADX INFO: renamed from: i */
    public Set mo43549i() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: j */
    public abstract ila1 mo43550j(phi phiVar);

    /* JADX INFO: renamed from: k */
    public final boolean m45115k(ifb ifbVar) {
        int iIntValue = ((Integer) ((y940) this.f81040f).mo39830f(y940.f270500R, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return ifbVar.mo50329g().mo44592d() == 0;
        }
        throw new AssertionError(s571.m77246e(iIntValue, "Unknown mirrorMode: "));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p.eru0, p.phi] */
    /* JADX INFO: renamed from: l */
    public final jla1 m45116l(gfb gfbVar, jla1 jla1Var, jla1 jla1Var2) {
        lpi0 lpi0VarM59671t;
        if (jla1Var2 != null) {
            lpi0VarM59671t = lpi0.m59672u(jla1Var2);
            lpi0VarM59671t.f116367a.remove(nu61.f158519t0);
        } else {
            lpi0VarM59671t = lpi0.m59671t();
        }
        TreeMap treeMap = lpi0VarM59671t.f116367a;
        sy7 sy7Var = y940.f270497O;
        ?? r2 = this.f81039e;
        if (r2.mo39829d(sy7Var) || r2.mo39829d(y940.f270501S)) {
            sy7 sy7Var2 = y940.f270505W;
            if (treeMap.containsKey(sy7Var2)) {
                treeMap.remove(sy7Var2);
            }
        }
        sy7 sy7Var3 = y940.f270505W;
        if (r2.mo39829d(sy7Var3)) {
            sy7 sy7Var4 = y940.f270503U;
            if (treeMap.containsKey(sy7Var4) && ((pyw0) r2.mo39828c(sy7Var3)).f183532b != null) {
                treeMap.remove(sy7Var4);
            }
        }
        Iterator it = r2.mo39827b().iterator();
        while (it.hasNext()) {
            phi.m70005m(lpi0VarM59671t, lpi0VarM59671t, r2, (sy7) it.next());
        }
        if (jla1Var != null) {
            for (sy7 sy7Var5 : jla1Var.mo39827b()) {
                if (!sy7Var5.f215171a.equals(nu61.f158519t0.f215171a)) {
                    phi.m70005m(lpi0VarM59671t, lpi0VarM59671t, jla1Var, sy7Var5);
                }
            }
        }
        if (treeMap.containsKey(y940.f270501S)) {
            sy7 sy7Var6 = y940.f270497O;
            if (treeMap.containsKey(sy7Var6)) {
                treeMap.remove(sy7Var6);
            }
        }
        sy7 sy7Var7 = y940.f270505W;
        if (treeMap.containsKey(sy7Var7) && ((pyw0) lpi0VarM59671t.mo39828c(sy7Var7)).f183533c != 0) {
            lpi0VarM59671t.m59673v(jla1.f113567D0, Boolean.TRUE);
        }
        return mo43551r(gfbVar, mo43550j(lpi0VarM59671t));
    }

    /* JADX INFO: renamed from: m */
    public final void m45117m() {
        this.f81037c = 1;
        m45119o();
    }

    /* JADX INFO: renamed from: n */
    public final void m45118n() {
        Iterator it = this.f81035a.iterator();
        while (it.hasNext()) {
            ((fla1) it.next()).mo41985e(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m45119o() {
        int iM38547C = edb.m38547C(this.f81037c);
        HashSet hashSet = this.f81035a;
        if (iM38547C == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((fla1) it.next()).mo41986i(this);
            }
        } else {
            if (iM38547C != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((fla1) it2.next()).mo41984b(this);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract jla1 mo43551r(gfb gfbVar, ila1 ila1Var);

    /* JADX INFO: renamed from: u */
    public abstract j28 mo43552u(phi phiVar);

    /* JADX INFO: renamed from: v */
    public abstract j28 mo43553v(j28 j28Var, j28 j28Var2);

    /* JADX INFO: renamed from: w */
    public abstract void mo43554w();

    /* JADX INFO: renamed from: x */
    public void mo45124x(Matrix matrix) {
        this.f81044j = new Matrix(matrix);
    }

    /* JADX INFO: renamed from: y */
    public void mo43555y(Rect rect) {
        this.f81043i = rect;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, p.jla1] */
    /* JADX INFO: renamed from: z */
    public final void m45125z(ifb ifbVar) {
        mo43554w();
        synchronized (this.f81036b) {
            try {
                ifb ifbVar2 = this.f81045k;
                if (ifbVar == ifbVar2) {
                    this.f81035a.remove(ifbVar2);
                    this.f81045k = null;
                }
                ifb ifbVar3 = this.f81046l;
                if (ifbVar == ifbVar3) {
                    this.f81035a.remove(ifbVar3);
                    this.f81046l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f81041g = null;
        this.f81043i = null;
        this.f81040f = this.f81039e;
        this.f81038d = null;
        this.f81042h = null;
    }

    /* JADX INFO: renamed from: p */
    public void mo45120p() {
    }

    /* JADX INFO: renamed from: q */
    public void mo45121q() {
    }

    /* JADX INFO: renamed from: s */
    public void mo45122s() {
    }

    /* JADX INFO: renamed from: t */
    public void mo45123t() {
    }
}
