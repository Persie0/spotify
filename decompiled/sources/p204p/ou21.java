package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ou21 implements jsh, Iterable, pq60 {

    /* JADX INFO: renamed from: X */
    public toi0 f170145X;

    /* JADX INFO: renamed from: b */
    public int f170147b;

    /* JADX INFO: renamed from: d */
    public int f170149d;

    /* JADX INFO: renamed from: e */
    public int f170150e;

    /* JADX INFO: renamed from: g */
    public boolean f170152g;

    /* JADX INFO: renamed from: h */
    public int f170153h;

    /* JADX INFO: renamed from: t */
    public HashMap f170155t;

    /* JADX INFO: renamed from: a */
    public int[] f170146a = new int[0];

    /* JADX INFO: renamed from: c */
    public Object[] f170148c = new Object[0];

    /* JADX INFO: renamed from: f */
    public final Object f170151f = new Object();

    /* JADX INFO: renamed from: i */
    public ArrayList f170154i = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static final void m68075e(wu21 wu21Var, int i) {
        while (wu21Var.f255091v >= 0 && wu21Var.f255090u <= i) {
            wu21Var.m88977O();
            wu21Var.m88995j();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m68076a(rq00 rq00Var) {
        if (this.f170152g) {
            vph.m86124a("Use active SlotWriter to determine anchor location instead");
        }
        if (!rq00Var.m76206a()) {
            lfq0.m58913a("Anchor refers to a group that was removed");
        }
        return rq00Var.f201675a;
    }

    /* JADX INFO: renamed from: b */
    public final void m68077b() {
        this.f170155t = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: d */
    public final cqi0 m68078d(ug5 ug5Var, jpi0 jpi0Var) {
        int i;
        Object[] objArr = jpi0Var.f114675a;
        int i2 = jpi0Var.f114676b;
        boolean z = false;
        for (?? r3 = z; r3 < i2; r3++) {
            if (!m68081j(qkg1.m73117n(((q2i0) objArr[r3]).f184647e))) {
                jpi0 jpi0Var2 = new jpi0();
                Object[] objArr2 = jpi0Var.f114675a;
                int i3 = jpi0Var.f114676b;
                for (?? r4 = z; r4 < i3; r4++) {
                    Object obj = objArr2[r4];
                    if (m68081j(qkg1.m73117n(((q2i0) obj).f184647e))) {
                        jpi0Var2.m53954a(obj);
                    }
                }
                jpi0Var = jpi0Var2;
                break;
            }
        }
        jpi0 jpi0VarM95420G = z520.m95420G(jpi0Var, new rv70(this, 27));
        if (jpi0VarM95420G.m53961h()) {
            return rdy0.f198229b;
        }
        long[] jArr = rdy0.f198228a;
        cqi0 cqi0Var = new cqi0();
        wu21 wu21VarM68080i = m68080i();
        try {
            Object[] objArr3 = jpi0VarM95420G.f114675a;
            int i4 = jpi0VarM95420G.f114676b;
            for (?? r5 = z; r5 < i4; r5++) {
                q2i0 q2i0Var = (q2i0) objArr3[r5];
                int iM88989c = wu21VarM68080i.m88989c(qkg1.m73117n(q2i0Var.f184647e));
                int iM88969G = wu21VarM68080i.m88969G(wu21VarM68080i.f255071b, iM88989c);
                m68075e(wu21VarM68080i, iM88969G);
                m68075e(wu21VarM68080i, iM88969G);
                while (true) {
                    i = wu21VarM68080i.f255089t;
                    if (i == iM88969G || i == wu21VarM68080i.f255090u) {
                        break;
                        break;
                    }
                    if (iM88969G < wu21VarM68080i.m89006u(i) + i) {
                        wu21VarM68080i.m88980R();
                    } else {
                        wu21VarM68080i.m88976N();
                    }
                }
                if (i != iM88969G) {
                    vph.m86124a("Unexpected slot table structure");
                }
                wu21VarM68080i.m88980R();
                wu21VarM68080i.m88987a(iM88989c - wu21VarM68080i.f255089t);
                cqi0Var.m33629m(q2i0Var, vph.m86126c(q2i0Var.f184645c, q2i0Var, wu21VarM68080i, ug5Var));
            }
            m68075e(wu21VarM68080i, Alert.DURATION_SHOW_INDEFINITELY);
            boolean z2 = true;
            return cqi0Var;
        } finally {
            wu21VarM68080i.m88991e(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public final nu21 m68079f() {
        if (this.f170152g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f170150e++;
        return new nu21(this);
    }

    /* JADX INFO: renamed from: i */
    public final wu21 m68080i() {
        if (this.f170152g) {
            vph.m86124a("Cannot start a writer when another writer is pending");
        }
        if (this.f170150e > 0) {
            vph.m86124a("Cannot start a writer when a reader is pending");
        }
        this.f170152g = true;
        this.f170153h++;
        return new wu21(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e620(this, 0, this.f170147b);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m68081j(rq00 rq00Var) {
        int iM73871e;
        return rq00Var.m76206a() && (iM73871e = qu21.m73871e(this.f170154i, rq00Var.f201675a, this.f170147b)) >= 0 && wj50.m88271j(this.f170154i.get(iM73871e), rq00Var);
    }

    /* JADX INFO: renamed from: l */
    public final zq00 m68082l(int i) {
        int i2;
        ArrayList arrayList;
        int iM73871e;
        HashMap map = this.f170155t;
        if (map != null) {
            if (this.f170152g) {
                vph.m86124a("use active SlotWriter to crate an anchor for location instead");
            }
            rq00 rq00Var = (i < 0 || i >= (i2 = this.f170147b) || (iM73871e = qu21.m73871e((arrayList = this.f170154i), i, i2)) < 0) ? null : (rq00) arrayList.get(iM73871e);
            if (rq00Var != null) {
                return (zq00) map.get(rq00Var);
            }
        }
        return null;
    }
}
