package p204p;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qhq0 implements uv70 {

    /* JADX INFO: renamed from: a */
    public final int f188823a;

    /* JADX INFO: renamed from: b */
    public final hun0 f188824b;

    /* JADX INFO: renamed from: c */
    public final gh00 f188825c;

    /* JADX INFO: renamed from: d */
    public b8j f188826d;

    /* JADX INFO: renamed from: e */
    public wr51 f188827e;

    /* JADX INFO: renamed from: f */
    public vr51 f188828f;

    /* JADX INFO: renamed from: g */
    public boolean f188829g;

    /* JADX INFO: renamed from: h */
    public boolean f188830h;

    /* JADX INFO: renamed from: i */
    public boolean f188831i;

    /* JADX INFO: renamed from: j */
    public Object f188832j;

    /* JADX INFO: renamed from: k */
    public boolean f188833k;

    /* JADX INFO: renamed from: l */
    public rz10 f188834l;

    /* JADX INFO: renamed from: m */
    public boolean f188835m;

    /* JADX INFO: renamed from: n */
    public long f188836n;

    /* JADX INFO: renamed from: o */
    public long f188837o;

    /* JADX INFO: renamed from: p */
    public long f188838p = dyh0.m37342a();

    /* JADX INFO: renamed from: q */
    public boolean f188839q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ m12 f188840r;

    public qhq0(m12 m12Var, int i, hun0 hun0Var, gh00 gh00Var) {
        this.f188840r = m12Var;
        this.f188823a = i;
        this.f188824b = hun0Var;
        this.f188825c = gh00Var;
    }

    @Override // p204p.uv70
    /* JADX INFO: renamed from: a */
    public final void mo72838a() {
        this.f188835m = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m72839b() {
        vr51 vr51Var = this.f188828f;
        if (vr51Var != null) {
            vr51Var.cancel();
        }
        this.f188828f = null;
        wr51 wr51Var = this.f188827e;
        if (wr51Var != null) {
            wr51Var.dispose();
        }
        this.f188827e = null;
        this.f188834l = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72840c(hw51 hw51Var) {
        boolean zM72841d;
        if (!this.f188840r.f138796b) {
            return false;
        }
        if (this.f188835m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM72841d = m72841d(hw51Var);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zM72841d = m72841d(hw51Var);
        }
        ds4.m36751f(-1L, "compose:lazy:prefetch:execute:item");
        return zM72841d;
    }

    @Override // p204p.uv70
    public final void cancel() {
        if (this.f188830h) {
            return;
        }
        this.f188830h = true;
        m72839b();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01e3  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX INFO: renamed from: d */
    public final boolean m72841d(hw51 hw51Var) {
        ?? r12;
        List list;
        int i = this.f188823a;
        long j = i;
        ds4.m36751f(j, "compose:lazy:prefetch:execute:item");
        iv70 iv70Var = (iv70) ((hv70) this.f188840r.f138797c).f95604b.invoke();
        if (!this.f188830h) {
            int iMo30870a = iv70Var.mo30870a();
            if (i >= 0 && i < iMo30870a) {
                Object objMo30873d = iv70Var.mo30873d(i);
                Object obj = this.f188832j;
                if (obj != null && !objMo30873d.equals(obj)) {
                    m72839b();
                    return false;
                }
                Object objMo30871b = iv70Var.mo30871b(i);
                hun0 hun0Var = this.f188824b;
                pa8 pa8Var = (pa8) hun0Var.f95433d;
                if (hun0Var.f95432c != objMo30871b || pa8Var == null) {
                    cqi0 cqi0Var = (cqi0) hun0Var.f95431b;
                    Object objM33623g = cqi0Var.m33623g(objMo30871b);
                    Object obj2 = objM33623g;
                    if (objM33623g == null) {
                        pa8 pa8Var2 = new pa8();
                        pa8Var2.f175434e = -1;
                        cqi0Var.m33629m(objMo30871b, pa8Var2);
                        obj2 = pa8Var2;
                    }
                    pa8Var = (pa8) obj2;
                    hun0Var.f95432c = objMo30871b;
                    hun0Var.f95433d = pa8Var;
                }
                m72842e();
                long jM48920a = hw51Var.m48920a();
                this.f188836n = jM48920a;
                this.f188838p = dyh0.m37342a();
                this.f188837o = 0L;
                ds4.m36751f(jM48920a, "compose:lazy:prefetch:available_time_nanos");
                if (!m72842e()) {
                    if (m72844g(this.f188836n, pa8Var.f175430a + pa8Var.f175431b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m72843f(objMo30873d, objMo30871b, pa8Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!m72842e()) {
                        return true;
                    }
                }
                if (this.f188828f != null) {
                    if (!m72844g(this.f188836n, pa8Var.f175432c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        vr51 vr51Var = this.f188828f;
                        if (vr51Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.f188827e = vr51Var.apply();
                        this.f188828f = null;
                        this.f188831i = true;
                        Trace.endSection();
                        m72845h();
                        pa8Var.f175432c = pa8.m69437a(this.f188837o, pa8Var.f175432c);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.f188833k) {
                    if (this.f188836n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        wr51 wr51Var = this.f188827e;
                        if (wr51Var == null) {
                            throw mt60.m62801h("Should precompose before resolving nested prefetch states");
                        }
                        rlv0 rlv0Var = new rlv0();
                        wr51Var.mo88802c(new phq0(rlv0Var, 0));
                        List list2 = (List) rlv0Var.f200373a;
                        this.f188834l = list2 != null ? new rz10(this, list2) : null;
                        this.f188833k = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                rz10 rz10Var = this.f188834l;
                if (rz10Var != null) {
                    int i2 = pa8Var.f175434e;
                    boolean z = this.f188835m;
                    List[] listArr = (List[]) rz10Var.f204027f;
                    int i3 = rz10Var.f204024c;
                    List list3 = (List) rz10Var.f204026e;
                    if (i3 < list3.size()) {
                        if (((qhq0) rz10Var.f204028g).f188830h) {
                            pt40.m70893c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((vv70) list3.get(i4)).f245165d = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (rz10Var.f204024c < list3.size()) {
                                try {
                                    if (listArr[rz10Var.f204024c] == null) {
                                        if (hw51Var.m48920a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = rz10Var.f204024c;
                                        vv70 vv70Var = (vv70) list3.get(i5);
                                        gh00 gh00Var = vv70Var.f245162a;
                                        if (gh00Var == null) {
                                            list = lau.f131415a;
                                        } else {
                                            tv70 tv70Var = new tv70(vv70Var, vv70Var.f245165d);
                                            gh00Var.invoke(tv70Var);
                                            ArrayList arrayList = tv70Var.f224088b;
                                            vv70Var.f245167f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list4 = listArr[rz10Var.f204024c];
                                    wj50.m88279p(list4);
                                    while (rz10Var.f204025d < list4.size()) {
                                        qhq0 qhq0Var = (qhq0) list4.get(rz10Var.f204025d);
                                        if (z) {
                                            qhq0 qhq0Var2 = qhq0Var != null ? qhq0Var : null;
                                            if (qhq0Var2 != null) {
                                                r12 = 1;
                                                qhq0Var2.f188835m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        rz10Var.f204023b = r12;
                                        if (qhq0Var.m72840c(hw51Var)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        rz10Var.f204025d += r12;
                                    }
                                    rz10Var.f204025d = 0;
                                    rz10Var.f204024c++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                rz10 rz10Var2 = this.f188834l;
                if (rz10Var2 != null && rz10Var2.f204023b) {
                    m72845h();
                    ds4.m36751f(j, "compose:lazy:prefetch:execute:item");
                    rz10 rz10Var3 = this.f188834l;
                    if (rz10Var3 != null) {
                        rz10Var3.f204023b = false;
                    }
                }
                b8j b8jVar = this.f188826d;
                if (!this.f188829g && b8jVar != null) {
                    if (!m72844g(this.f188836n, pa8Var.f175433d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j2 = b8jVar.f24596a;
                        if (this.f188830h) {
                            pt40.m70891a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f188829g) {
                            pt40.m70891a("Request was already measured!");
                        }
                        this.f188829g = true;
                        wr51 wr51Var2 = this.f188827e;
                        if (wr51Var2 == null) {
                            throw mt60.m62801h("performComposition() must be called before performMeasure()");
                        }
                        int iMo88801b = wr51Var2.mo88801b();
                        for (int i6 = 0; i6 < iMo88801b; i6++) {
                            wr51Var2.mo88803d(i6, j2);
                        }
                        Trace.endSection();
                        m72845h();
                        pa8Var.f175433d = pa8.m69437a(this.f188837o, pa8Var.f175433d);
                        gh00 gh00Var2 = this.f188825c;
                        if (gh00Var2 != null) {
                            gh00Var2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                rz10 rz10Var4 = this.f188834l;
                if (this.f188829g && this.f188833k && rz10Var4 != null) {
                    List list5 = (List) rz10Var4.f204026e;
                    int size2 = list5.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((vv70) list5.get(i7)).f245166e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = pa8Var.f175434e;
                    pa8Var.f175434e = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list5.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((vv70) list5.get(i9)).f245167f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        pa8Var.f175433d = 0L;
                    }
                }
                return false;
            }
        }
        m72839b();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72842e() {
        vr51 vr51Var;
        return this.f188831i || ((vr51Var = this.f188828f) != null && vr51Var.mo50036e());
    }

    /* JADX INFO: renamed from: f */
    public final void m72843f(Object obj, Object obj2, pa8 pa8Var) {
        vr51 xh70Var;
        vr51 vr51Var = this.f188828f;
        if (vr51Var == null) {
            m12 m12Var = this.f188840r;
            th00 th00VarM48722a = ((hv70) m12Var.f138797c).m48722a(this.f188823a, obj, obj2);
            zp70 zp70VarM94410a = ((yr51) m12Var.f138798d).m94410a();
            if (zp70VarM94410a.f285001a.m59606H()) {
                zp70VarM94410a.m96673l(obj, th00VarM48722a, true);
                xh70Var = new xh70(1, zp70VarM94410a, obj);
            } else {
                xh70Var = new ia70(2, zp70VarM94410a, obj);
            }
            vr51Var = xh70Var;
            this.f188828f = vr51Var;
            this.f188832j = obj;
        }
        this.f188839q = false;
        while (!vr51Var.mo50036e() && !this.f188839q) {
            vr51Var.mo50035c(new us30(26, this, pa8Var));
        }
        m72845h();
        if (this.f188839q) {
            pa8Var.f175431b = pa8.m69437a(this.f188837o, pa8Var.f175431b);
        } else {
            pa8Var.f175430a = pa8.m69437a(this.f188837o, pa8Var.f175430a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m72844g(long j, long j2) {
        if (this.f188835m) {
            j2 = 0;
        }
        return j > j2;
    }

    /* JADX INFO: renamed from: h */
    public final void m72845h() {
        long jM37342a = dyh0.m37342a();
        long jM33188g = cks.m33188g(fbg1.m41248p(jM37342a, this.f188838p, ils.NANOSECONDS));
        this.f188837o = jM33188g;
        long j = this.f188836n - jM33188g;
        this.f188836n = j;
        this.f188838p = jM37342a;
        ds4.m36751f(j, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f188823a);
        sb.append(", constraints = ");
        sb.append(this.f188826d);
        sb.append(", isComposed = ");
        sb.append(m72842e());
        sb.append(", isMeasured = ");
        sb.append(this.f188829g);
        sb.append(", isCanceled = ");
        return edb.m38570s(sb, this.f188830h, " }");
    }
}
