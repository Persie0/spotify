package p204p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class vgb implements vdb {

    /* JADX INFO: renamed from: L0 */
    public gla1 f241195L0;

    /* JADX INFO: renamed from: M0 */
    public oj51 f241196M0;

    /* JADX INFO: renamed from: N0 */
    public final c4x0 f241197N0;

    /* JADX INFO: renamed from: O0 */
    public final c4x0 f241198O0;

    /* JADX INFO: renamed from: P0 */
    public final iaz f241199P0;

    /* JADX INFO: renamed from: Q0 */
    public final iaz f241200Q0;

    /* JADX INFO: renamed from: X */
    public final Object f241201X;

    /* JADX INFO: renamed from: Y */
    public boolean f241202Y;

    /* JADX INFO: renamed from: Z */
    public phi f241203Z;

    /* JADX INFO: renamed from: a */
    public final ifb f241204a;

    /* JADX INFO: renamed from: b */
    public final ifb f241205b;

    /* JADX INFO: renamed from: c */
    public final np7 f241206c;

    /* JADX INFO: renamed from: d */
    public final mla1 f241207d;

    /* JADX INFO: renamed from: e */
    public final my7 f241208e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f241209f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f241210g;

    /* JADX INFO: renamed from: h */
    public final hr81 f241211h;

    /* JADX INFO: renamed from: i */
    public List f241212i;

    /* JADX INFO: renamed from: t */
    public final seb f241213t;

    public vgb(ifb ifbVar, ifb ifbVar2, c4x0 c4x0Var, c4x0 c4x0Var2, hr81 hr81Var, np7 np7Var, udb udbVar) {
        iaz iazVar = iaz.f100399i;
        this.f241209f = new ArrayList();
        this.f241210g = new ArrayList();
        this.f241212i = Collections.EMPTY_LIST;
        this.f241201X = new Object();
        this.f241202Y = true;
        this.f241203Z = null;
        this.f241204a = ifbVar;
        this.f241205b = ifbVar2;
        this.f241199P0 = iazVar;
        this.f241200Q0 = iazVar;
        this.f241211h = hr81Var;
        this.f241206c = np7Var;
        this.f241207d = udbVar;
        seb sebVar = c4x0Var.f34029c;
        this.f241213t = sebVar;
        sebVar.m72604o();
        this.f241197N0 = c4x0Var;
        this.f241198O0 = c4x0Var2;
        this.f241208e = m85412t(c4x0Var, c4x0Var2);
    }

    /* JADX INFO: renamed from: A */
    public static ArrayList m85409A(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((gla1) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw ikc0.m50937i(it2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: j */
    public static Matrix m85410j(Rect rect, Size size) {
        wj50.m88275l("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* JADX INFO: renamed from: q */
    public static s440 m85411q() {
        Object objMo39828c;
        Object objMo39828c2;
        Object objMo39828c3;
        o440 o440Var = new o440(0);
        sy7 sy7Var = nu61.f158519t0;
        lpi0 lpi0Var = o440Var.f161549b;
        lpi0Var.m59673v(sy7Var, "ImageCapture-Extra");
        sy7 sy7Var2 = t440.f216898d;
        lpi0Var.getClass();
        Object objMo39828c4 = null;
        try {
            objMo39828c = lpi0Var.mo39828c(sy7Var2);
        } catch (IllegalArgumentException unused) {
            objMo39828c = null;
        }
        Integer num = (Integer) objMo39828c;
        if (num != null) {
            lpi0Var.m59673v(t640.f217444M, num);
        } else {
            p440 p440Var = s440.f205467x;
            try {
                objMo39828c2 = lpi0Var.mo39828c(t440.f216899e);
            } catch (IllegalArgumentException unused2) {
                objMo39828c2 = null;
            }
            if (Objects.equals(objMo39828c2, 1)) {
                lpi0Var.m59673v(t640.f217444M, 4101);
                lpi0Var.m59673v(t640.f217445N, cns.f40075c);
            } else {
                lpi0Var.m59673v(t640.f217444M, 256);
            }
        }
        t440 t440Var = new t440(jvl0.m54384j(lpi0Var));
        y940.m93144s(t440Var);
        s440 s440Var = new s440(t440Var);
        try {
            objMo39828c3 = lpi0Var.mo39828c(y940.f270501S);
        } catch (IllegalArgumentException unused3) {
            objMo39828c3 = null;
        }
        Size size = (Size) objMo39828c3;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        sy7 sy7Var3 = bo50.f29018b0;
        Object objM38209n = e95.m38209n();
        try {
            objM38209n = lpi0Var.mo39828c(sy7Var3);
        } catch (IllegalArgumentException unused4) {
        }
        wj50.m88280q((Executor) objM38209n, "The IO executor can't be null");
        sy7 sy7Var4 = t440.f216897c;
        if (lpi0Var.f116367a.containsKey(sy7Var4)) {
            Integer num2 = (Integer) lpi0Var.mo39828c(sy7Var4);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objMo39828c4 = lpi0Var.mo39828c(t440.f216903i);
                } catch (IllegalArgumentException unused5) {
                }
                if (objMo39828c4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return s440Var;
    }

    /* JADX INFO: renamed from: t */
    public static my7 m85412t(c4x0 c4x0Var, c4x0 c4x0Var2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c4x0Var.f98362a.mo44590b());
        sb.append(c4x0Var2 == null ? "" : c4x0Var2.f98362a.mo44590b());
        return new my7(sb.toString(), c4x0Var.f34029c.f208259a);
    }

    /* JADX INFO: renamed from: u */
    public static HashMap m85413u(ArrayList arrayList, mla1 mla1Var, mla1 mla1Var2) {
        jla1 jla1VarMo43548e;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gla1 gla1Var = (gla1) it.next();
            if (gla1Var instanceof oj51) {
                oj51 oj51Var = (oj51) gla1Var;
                jla1 jla1VarMo43548e2 = new o440(1).m66233a().mo43548e(false, mla1Var);
                if (jla1VarMo43548e2 == null) {
                    jla1VarMo43548e = null;
                } else {
                    lpi0 lpi0VarM59672u = lpi0.m59672u(jla1VarMo43548e2);
                    lpi0VarM59672u.f116367a.remove(nu61.f158520u0);
                    jla1VarMo43548e = ((rg41) oj51Var.mo43550j(lpi0VarM59672u)).mo51006i();
                }
            } else {
                jla1VarMo43548e = gla1Var.mo43548e(false, mla1Var);
            }
            jla1 jla1VarMo43548e3 = gla1Var.mo43548e(true, mla1Var2);
            ugb ugbVar = new ugb();
            ugbVar.f230068a = jla1VarMo43548e;
            ugbVar.f230069b = jla1VarMo43548e3;
            map.put(gla1Var, ugbVar);
        }
        return map;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m85414y(j28 j28Var, vxz0 vxz0Var) {
        phi phiVar = j28Var.f107953d;
        jvl0 jvl0Var = vxz0Var.f245872g.f276633b;
        if (phiVar.mo39827b().size() != vxz0Var.f245872g.f276633b.mo39827b().size()) {
            return true;
        }
        for (sy7 sy7Var : phiVar.mo39827b()) {
            if (!jvl0Var.f116367a.containsKey(sy7Var) || !Objects.equals(jvl0Var.mo39828c(sy7Var), phiVar.mo39828c(sy7Var))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final void m85415B(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        int i2;
        j28 j28Var;
        phi phiVar;
        boolean z2;
        synchronized (this.f241201X) {
            try {
                m85425x();
                synchronized (this.f241201X) {
                    try {
                        i = 0;
                        if (!this.f241212i.isEmpty()) {
                            Iterator it = linkedHashSet.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                    break;
                                }
                                gla1 gla1Var = (gla1) it.next();
                                if (gla1Var instanceof s440) {
                                    jla1 jla1Var = gla1Var.f81040f;
                                    sy7 sy7Var = t440.f216899e;
                                    if (jla1Var.mo39829d(sy7Var)) {
                                        Integer num = (Integer) jla1Var.mo39828c(sy7Var);
                                        num.getClass();
                                        if (num.intValue() == 1) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            if (z2) {
                                throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z) {
                    m85425x();
                }
                oj51 oj51VarM85421r = m85421r(linkedHashSet, z);
                gla1 gla1VarM85419i = m85419i(linkedHashSet, oj51VarM85421r);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (gla1VarM85419i != null) {
                    arrayList.add(gla1VarM85419i);
                }
                if (oj51VarM85421r != null) {
                    arrayList.add(oj51VarM85421r);
                    arrayList.removeAll(oj51VarM85421r.f165965p.f201523a);
                }
                ArrayList<gla1> arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f241210g);
                ArrayList<gla1> arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f241210g);
                ArrayList<gla1> arrayList4 = new ArrayList(this.f241210g);
                arrayList4.removeAll(arrayList);
                HashMap mapM85413u = m85413u(arrayList2, (mla1) this.f241213t.mo39830f(qeb.f187876p, mla1.f144803a), this.f241207d);
                Map mapM85420p = Collections.EMPTY_MAP;
                try {
                    synchronized (this.f241201X) {
                        try {
                            i2 = this.f241211h.f94375b == 2 ? 1 : 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    HashMap mapM85420p2 = m85420p(i2, this.f241204a.mo50329g(), arrayList2, arrayList3, mapM85413u);
                    if (this.f241205b != null) {
                        synchronized (this.f241201X) {
                            try {
                                if (this.f241211h.f94375b == 2) {
                                    i = 1;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        ifb ifbVar = this.f241205b;
                        Objects.requireNonNull(ifbVar);
                        mapM85420p = m85420p(i, ifbVar.mo50329g(), arrayList2, arrayList3, mapM85413u);
                    }
                    m85416C(mapM85420p2, arrayList);
                    ArrayList arrayListM85409A = m85409A(arrayList, this.f241212i);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListM85409A2 = m85409A(arrayList5, arrayListM85409A);
                    if (arrayListM85409A2.size() > 0) {
                        arrayListM85409A2.toString();
                        vie1.m85617F("CameraUseCaseAdapter");
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((gla1) it2.next()).m45125z(this.f241204a);
                    }
                    this.f241204a.mo50332l(arrayList4);
                    if (this.f241205b != null) {
                        for (gla1 gla1Var2 : arrayList4) {
                            ifb ifbVar2 = this.f241205b;
                            Objects.requireNonNull(ifbVar2);
                            gla1Var2.m45125z(ifbVar2);
                        }
                        ifb ifbVar3 = this.f241205b;
                        Objects.requireNonNull(ifbVar3);
                        ifbVar3.mo50332l(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        for (gla1 gla1Var3 : arrayList3) {
                            if (mapM85420p2.containsKey(gla1Var3) && (phiVar = (j28Var = (j28) mapM85420p2.get(gla1Var3)).f107953d) != null && m85414y(j28Var, gla1Var3.f81047m)) {
                                gla1Var3.f81041g = gla1Var3.mo43552u(phiVar);
                                if (this.f241202Y) {
                                    this.f241204a.mo41987j(gla1Var3);
                                    ifb ifbVar4 = this.f241205b;
                                    if (ifbVar4 != null) {
                                        ifbVar4.mo41987j(gla1Var3);
                                    }
                                }
                            }
                        }
                    }
                    for (gla1 gla1Var4 : arrayList2) {
                        ugb ugbVar = (ugb) mapM85413u.get(gla1Var4);
                        Objects.requireNonNull(ugbVar);
                        ifb ifbVar5 = this.f241205b;
                        if (ifbVar5 != null) {
                            gla1Var4.m45108a(this.f241204a, ifbVar5, ugbVar.f230068a, ugbVar.f230069b);
                            j28 j28Var2 = (j28) mapM85420p2.get(gla1Var4);
                            j28Var2.getClass();
                            gla1Var4.f81041g = gla1Var4.mo43553v(j28Var2, (j28) mapM85420p.get(gla1Var4));
                        } else {
                            gla1Var4.m45108a(this.f241204a, null, ugbVar.f230068a, ugbVar.f230069b);
                            j28 j28Var3 = (j28) mapM85420p2.get(gla1Var4);
                            j28Var3.getClass();
                            gla1Var4.f81041g = gla1Var4.mo43553v(j28Var3, null);
                        }
                    }
                    if (this.f241202Y) {
                        this.f241204a.mo50333m(arrayList2);
                        ifb ifbVar6 = this.f241205b;
                        if (ifbVar6 != null) {
                            ifbVar6.mo50333m(arrayList2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((gla1) it3.next()).m45119o();
                    }
                    this.f241209f.clear();
                    this.f241209f.addAll(linkedHashSet);
                    this.f241210g.clear();
                    this.f241210g.addAll(arrayList);
                    this.f241195L0 = gla1VarM85419i;
                    this.f241196M0 = oj51VarM85421r;
                } catch (IllegalArgumentException e) {
                    if (!z) {
                        m85425x();
                        if (this.f241211h.f94375b != 2) {
                            m85415B(linkedHashSet, true);
                            return;
                        }
                    }
                    throw e;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m85416C(HashMap map, ArrayList arrayList) {
        synchronized (this.f241201X) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    gla1 gla1Var = (gla1) it.next();
                    Rect rectMo78862a = this.f241204a.mo50326c().mo78862a();
                    j28 j28Var = (j28) map.get(gla1Var);
                    j28Var.getClass();
                    gla1Var.mo45124x(m85410j(rectMo78862a, j28Var.f107950a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.vdb
    /* JADX INFO: renamed from: a */
    public final gfb mo50433a() {
        return this.f241197N0;
    }

    /* JADX INFO: renamed from: b */
    public final void m85417b(List list) {
        synchronized (this.f241201X) {
            try {
                this.f241204a.mo50330h(this.f241213t);
                ifb ifbVar = this.f241205b;
                if (ifbVar != null) {
                    ifbVar.mo50330h(this.f241213t);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f241209f);
                linkedHashSet.addAll(list);
                try {
                    m85415B(linkedHashSet, this.f241205b != null);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m85418e() {
        synchronized (this.f241201X) {
            try {
                if (!this.f241202Y) {
                    if (!this.f241210g.isEmpty()) {
                        this.f241204a.mo50330h(this.f241213t);
                        ifb ifbVar = this.f241205b;
                        if (ifbVar != null) {
                            ifbVar.mo50330h(this.f241213t);
                        }
                    }
                    this.f241204a.mo50333m(this.f241210g);
                    ifb ifbVar2 = this.f241205b;
                    if (ifbVar2 != null) {
                        ifbVar2.mo50333m(this.f241210g);
                    }
                    synchronized (this.f241201X) {
                        try {
                            if (this.f241203Z != null) {
                                this.f241204a.mo50326c().mo78865d(this.f241203Z);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Iterator it = this.f241210g.iterator();
                    while (it.hasNext()) {
                        ((gla1) it.next()).m45119o();
                    }
                    this.f241202Y = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    /* JADX INFO: renamed from: i */
    public final gla1 m85419i(LinkedHashSet linkedHashSet, oj51 oj51Var) {
        boolean z;
        boolean z2;
        gla1 gla1VarM85411q;
        synchronized (this.f241201X) {
            try {
                ArrayList<gla1> arrayList = new ArrayList(linkedHashSet);
                if (oj51Var != null) {
                    arrayList.add(oj51Var);
                    arrayList.removeAll(oj51Var.f165965p.f201523a);
                }
                synchronized (this.f241201X) {
                    z = false;
                    z2 = ((Integer) this.f241213t.mo39830f(qeb.f187877q, 0)).intValue() == 1;
                }
                if (z2) {
                    boolean z3 = false;
                    boolean z4 = false;
                    for (gla1 gla1Var : arrayList) {
                        if ((gla1Var instanceof g4r0) || (gla1Var instanceof oj51)) {
                            z4 = true;
                        } else if (gla1Var instanceof s440) {
                            z3 = true;
                        }
                    }
                    if (!z3 || z4) {
                        boolean z5 = false;
                        for (gla1 gla1Var2 : arrayList) {
                            if ((gla1Var2 instanceof g4r0) || (gla1Var2 instanceof oj51)) {
                                z = true;
                            } else if (gla1Var2 instanceof s440) {
                                z5 = true;
                            }
                        }
                        if (!z || z5) {
                            gla1VarM85411q = null;
                        } else {
                            gla1 gla1Var3 = this.f241195L0;
                            gla1VarM85411q = gla1Var3 instanceof s440 ? gla1Var3 : m85411q();
                        }
                    } else {
                        gla1 gla1Var4 = this.f241195L0;
                        if (gla1Var4 instanceof g4r0) {
                            gla1VarM85411q = gla1Var4;
                        } else {
                            o440 o440Var = new o440(1);
                            o440Var.f161549b.m59673v(nu61.f158519t0, "Preview-Extra");
                            g4r0 g4r0VarM66233a = o440Var.m66233a();
                            g4r0VarM66233a.m43546C(new tgb());
                            gla1VarM85411q = g4r0VarM66233a;
                        }
                    }
                } else {
                    gla1VarM85411q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gla1VarM85411q;
    }

    /* JADX INFO: renamed from: p */
    public final HashMap m85420p(int i, gfb gfbVar, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        np7 np7Var;
        Rect rectMo78862a;
        Iterator it;
        boolean z;
        ArrayList arrayList3 = new ArrayList();
        String strMo44590b = gfbVar.mo44590b();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            np7Var = this.f241206c;
            if (!zHasNext) {
                break;
            }
            gla1 gla1Var = (gla1) it2.next();
            int iMo49780l = gla1Var.f81040f.mo49780l();
            j28 j28Var = gla1Var.f81041g;
            Size size = j28Var != null ? j28Var.f107950a : null;
            j761 j761Var = (j761) ((HashMap) np7Var.f156890b).get(strMo44590b);
            l28 l28VarM57896b = j761Var != null ? l28.m57896b(i, iMo49780l, size, j761Var.m52608i(iMo49780l)) : null;
            int iMo49780l2 = gla1Var.f81040f.mo49780l();
            j28 j28Var2 = gla1Var.f81041g;
            Size size2 = j28Var2 != null ? j28Var2.f107950a : null;
            j28Var2.getClass();
            ey7 ey7Var = new ey7(l28VarM57896b, iMo49780l2, size2, j28Var2.f107951b, oj51.m67089F(gla1Var), gla1Var.f81041g.f107953d, (Range) gla1Var.f81040f.mo39830f(jla1.f113566C0, null));
            arrayList3.add(ey7Var);
            map3.put(ey7Var, gla1Var);
            map2.put(gla1Var, gla1Var.f81041g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectMo78862a = this.f241204a.mo50326c().mo78862a();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    gla1 gla1Var2 = (gla1) it.next();
                    if (gla1Var2 != null) {
                        if (gla1Var2.f81040f.mo39829d(jla1.f113569F0)) {
                            if (gla1Var2.f81040f.mo53667q() == lla1.f134602d) {
                                z = true;
                                break;
                            }
                        } else {
                            gla1Var2.toString();
                        }
                    }
                }
            } catch (NullPointerException unused) {
                rectMo78862a = null;
            }
            cx21 cx21Var = new cx21(gfbVar, rectMo78862a != null ? j591.m52449d(rectMo78862a) : null);
            Iterator it3 = arrayList.iterator();
            boolean z2 = false;
            while (it3.hasNext()) {
                gla1 gla1Var3 = (gla1) it3.next();
                ugb ugbVar = (ugb) map.get(gla1Var3);
                jla1 jla1VarM45116l = gla1Var3.m45116l(gfbVar, ugbVar.f230068a, ugbVar.f230069b);
                map4.put(jla1VarM45116l, gla1Var3);
                map5.put(jla1VarM45116l, cx21Var.m34208u(jla1VarM45116l));
                jla1 jla1Var = gla1Var3.f81040f;
                if (jla1Var instanceof i5r0) {
                    z2 = ((i5r0) jla1Var).m53666p() == 2;
                }
            }
            it = arrayList.iterator();
            np7Var.getClass();
            wj50.m88275l("No new use cases to be bound.", !map5.isEmpty());
            j761 j761Var2 = (j761) ((HashMap) np7Var.f156890b).get(strMo44590b);
            if (j761Var2 == null) {
                throw new IllegalArgumentException(edb.m38564m("No such camera id in supported combination list: ", strMo44590b));
            }
            Pair pairM52606g = j761Var2.m52606g(i, arrayList3, map5, z2, z);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((gla1) entry.getValue(), (j28) ((Map) pairM52606g.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairM52606g.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((gla1) map3.get(entry2.getKey()), (j28) entry2.getValue());
                }
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: r */
    public final oj51 m85421r(LinkedHashSet linkedHashSet, boolean z) {
        boolean z2;
        synchronized (this.f241201X) {
            try {
                HashSet<gla1> hashSetM85423v = m85423v(linkedHashSet, z);
                if (hashSetM85423v.size() < 2) {
                    m85425x();
                    return null;
                }
                oj51 oj51Var = this.f241196M0;
                if (oj51Var != null && oj51Var.f165965p.f201523a.equals(hashSetM85423v)) {
                    oj51 oj51Var2 = this.f241196M0;
                    Objects.requireNonNull(oj51Var2);
                    return oj51Var2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                for (gla1 gla1Var : hashSetM85423v) {
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        Iterator it = gla1Var.mo43549i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            int iIntValue = ((Integer) it.next()).intValue();
                            if ((i2 & iIntValue) == iIntValue) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (hashSet.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new oj51(this.f241204a, this.f241205b, this.f241199P0, this.f241200Q0, hashSetM85423v, this.f241207d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m85422s() {
        synchronized (this.f241201X) {
            try {
                if (this.f241202Y) {
                    this.f241204a.mo50332l(new ArrayList(this.f241210g));
                    ifb ifbVar = this.f241205b;
                    if (ifbVar != null) {
                        ifbVar.mo50332l(new ArrayList(this.f241210g));
                    }
                    synchronized (this.f241201X) {
                        veb vebVarMo50326c = this.f241204a.mo50326c();
                        this.f241203Z = vebVarMo50326c.mo78864c();
                        vebVarMo50326c.mo78868g();
                    }
                    this.f241202Y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final HashSet m85423v(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f241201X) {
            Iterator it = this.f241212i.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            gla1 gla1Var = (gla1) it2.next();
            wj50.m88275l("Only support one level of sharing for now.", !(gla1Var instanceof oj51));
            Iterator it3 = gla1Var.mo43549i().iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Integer) it3.next()).intValue();
                if ((i & iIntValue) == iIntValue) {
                    hashSet.add(gla1Var);
                    break;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: w */
    public final List m85424w() {
        ArrayList arrayList;
        synchronized (this.f241201X) {
            arrayList = new ArrayList(this.f241209f);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public final void m85425x() {
        synchronized (this.f241201X) {
            this.f241213t.m72604o();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m85426z(ArrayList arrayList) {
        synchronized (this.f241201X) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f241209f);
            linkedHashSet.removeAll(arrayList);
            m85415B(linkedHashSet, this.f241205b != null);
        }
    }
}
