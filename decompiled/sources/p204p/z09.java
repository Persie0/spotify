package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class z09 extends o31 implements yq81 {

    /* JADX INFO: renamed from: A */
    public final luk f278019A;

    /* JADX INFO: renamed from: B */
    public final qe70 f278020B;

    /* JADX INFO: renamed from: C */
    public final qe70 f278021C;

    /* JADX INFO: renamed from: D */
    public boolean f278022D;

    /* JADX INFO: renamed from: E */
    public boolean f278023E;

    /* JADX INFO: renamed from: F */
    public j9c1 f278024F;

    /* JADX INFO: renamed from: G */
    public boolean f278025G;

    /* JADX INFO: renamed from: H */
    public int f278026H;

    /* JADX INFO: renamed from: I */
    public LinkedHashSet f278027I;

    /* JADX INFO: renamed from: J */
    public final ArrayList f278028J;

    /* JADX INFO: renamed from: w */
    public final ri00 f278029w;

    /* JADX INFO: renamed from: x */
    public final boolean f278030x;

    /* JADX INFO: renamed from: y */
    public final boolean f278031y;

    /* JADX INFO: renamed from: z */
    public final r3p0 f278032z;

    /* JADX WARN: Multi-variable type inference failed */
    public z09(th00 th00Var, boolean z, boolean z2, r3p0 r3p0Var, kf81 kf81Var, int[] iArr, at8 at8Var, luk lukVar, gh00 gh00Var, gh00 gh00Var2) {
        super(kf81Var, iArr, at8Var);
        this.f278029w = (ri00) th00Var;
        this.f278030x = z;
        this.f278031y = z2;
        this.f278032z = r3p0Var;
        this.f278019A = lukVar;
        this.f278020B = (qe70) gh00Var;
        this.f278021C = (qe70) gh00Var2;
        this.f278026H = this.f161222s;
        int i = kf81Var.f122099a;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(kf81Var.f122102d[i2]);
        }
        this.f278028J = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public static Object m95058C(z09 z09Var, List list, ibk ibkVar) throws Throwable {
        y09 y09Var;
        Object next;
        if (ibkVar instanceof y09) {
            y09Var = (y09) ibkVar;
            int i = y09Var.f267934d;
            if ((i & Integer.MIN_VALUE) != 0) {
                y09Var.f267934d = i - Integer.MIN_VALUE;
            } else {
                y09Var = new y09(z09Var, ibkVar);
            }
        } else {
            y09Var = new y09(z09Var, ibkVar);
        }
        Object objM89557A = y09Var.f267932b;
        int i2 = y09Var.f267934d;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            y09Var.f267931a = z09Var;
            y09Var.f267934d = 1;
            objM89557A = x0h1.m89557A(z09Var.f278019A, new ez4(list, z09Var, fbkVar, 21), y09Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z09Var = y09Var.f267931a;
            bga.m29073P(objM89557A);
        }
        List list2 = (List) objM89557A;
        if (!list2.isEmpty()) {
            r300 r300Var = z09Var.f44201d[z09Var.f278026H];
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                r300 r300Var2 = (r300) ((pqm0) obj).f180351b;
                if (z09Var.f278025G || z09Var.m95059D(r300Var2)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((r300) ((pqm0) obj2).f180351b).f195382k >= r300Var.f195382k || z09Var.f278025G) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i3 = ((r300) ((pqm0) next).f180351b).f195382k;
                    do {
                        Object next2 = it.next();
                        int i4 = ((r300) ((pqm0) next2).f180351b).f195382k;
                        if (i3 < i4) {
                            next = next2;
                            i3 = i4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            pqm0 pqm0Var = (pqm0) next;
            int iIntValue = pqm0Var != null ? ((Number) pqm0Var.f180350a).intValue() : -1;
            if (iIntValue != -1) {
                return new Integer(iIntValue);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public Object mo64119B(ArrayList arrayList, u37 u37Var) {
        return m95058C(this, arrayList, u37Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.ri00, p.th00] */
    /* JADX INFO: renamed from: D */
    public final boolean m95059D(r300 r300Var) {
        LinkedHashSet linkedHashSet = this.f278027I;
        if (linkedHashSet != null) {
            return linkedHashSet.contains(r300Var);
        }
        List listM43728j1 = g6f.m43728j1(this.f278028J);
        ?? r1 = this.f278029w;
        if (r1 != 0) {
            return ((Boolean) r1.invoke(r300Var, listM43728j1)).booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: E */
    public abstract Object mo64120E(nad0 nad0Var, l92 l92Var);

    @Override // p204p.xjx
    /* JADX INFO: renamed from: b */
    public final boolean mo32619b(long j, mce mceVar, List list) {
        if (!this.f278022D) {
            return false;
        }
        this.f278022D = false;
        this.f278023E = true;
        return true;
    }

    @Override // p204p.o31, p204p.xjx
    /* JADX INFO: renamed from: c */
    public final int mo28306c() {
        return this.f278026H;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.qe70] */
    @Override // p204p.o31, p204p.d19, p204p.xjx
    /* JADX INFO: renamed from: g */
    public final void mo32620g() {
        this.f161225v = null;
        this.f278021C.invoke(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.ri00, p.th00] */
    @Override // p204p.o31, p204p.xjx
    /* JADX INFO: renamed from: l */
    public final void mo28308l(long j, long j2, long j3, List list, nad0[] nad0VarArr) throws Throwable {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList = this.f278028J;
        ?? r1 = this.f278029w;
        if (r1 == 0) {
            linkedHashSet = null;
        } else {
            List listM43728j1 = g6f.m43728j1(arrayList);
            linkedHashSet = new LinkedHashSet();
            for (Object obj : arrayList) {
                r300 r300Var = (r300) obj;
                wj50.m88279p(r300Var);
                if (((Boolean) r1.invoke(r300Var, listM43728j1)).booleanValue()) {
                    linkedHashSet.add(obj);
                }
            }
        }
        this.f278027I = linkedHashSet;
        super.mo28308l(j, j2, j3, list, nad0VarArr);
        this.f278026H = this.f161222s;
        ArrayList arrayList2 = new ArrayList();
        int length = nad0VarArr.length;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            nad0 nad0Var = nad0VarArr[i];
            int i3 = i2 + 1;
            pqm0 pqm0Var = (wj50.m88271j(nad0Var, nad0.f152047a) || !nad0Var.next()) ? null : new pqm0(Integer.valueOf(i2), nad0Var);
            if (pqm0Var != null) {
                arrayList2.add(pqm0Var);
            }
            i++;
            i2 = i3;
        }
        if (this.f278031y && j2 == 0 && this.f278032z.f195537a == 1) {
            z = true;
        }
        this.f278025G = z;
        if (j2 > 0 && this.f278032z.f195537a == 1) {
            this.f278032z.f195537a = 2;
        }
        if (this.f278030x) {
            x0h1.m89581x(dau.f47107a, new C2004j6(this, arrayList2, j2, (fbk) null, 2));
        }
        this.f278027I = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    @Override // p204p.o31, p204p.d19, p204p.xjx
    /* JADX INFO: renamed from: p */
    public final void mo32621p() {
        super.mo32621p();
        this.f278020B.invoke(this);
    }

    @Override // p204p.o31, p204p.d19, p204p.xjx
    /* JADX INFO: renamed from: q */
    public final int mo32622q(long j, List list) {
        if (this.f278023E) {
            this.f278022D = false;
            this.f278023E = false;
            if (!list.isEmpty()) {
                return 1;
            }
        }
        return super.mo32622q(j, list);
    }

    @Override // p204p.yq81
    /* JADX INFO: renamed from: u */
    public final void mo32623u(j9c1 j9c1Var) {
        if (!wj50.m88271j(this.f278024F, j9c1Var)) {
            this.f278022D = true;
            this.f278023E = true;
        }
        this.f278024F = j9c1Var;
    }

    @Override // p204p.o31
    /* JADX INFO: renamed from: x */
    public final boolean mo32624x(r300 r300Var, int i, long j) {
        j9c1 j9c1Var = this.f278024F;
        if (j9c1Var != null) {
            return r300Var.f195394w == j9c1Var.f110145a && r300Var.f195395x == j9c1Var.f110146b;
        }
        return super.mo32624x(r300Var, i, j) && m95059D(r300Var);
    }
}
