package p204p;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o9z0 extends hjv0 implements ikv0 {

    /* JADX INFO: renamed from: e */
    public int f163167e;

    /* JADX INFO: renamed from: d */
    public final ArrayList f163166d = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final SparseArray f163169g = new SparseArray();

    /* JADX INFO: renamed from: h */
    public int f163170h = 1;

    /* JADX INFO: renamed from: f */
    public final boolean f163168f = true;

    /* JADX INFO: renamed from: A */
    public static void m66502A(o9z0 o9z0Var, int i, int i2) {
        ArrayList arrayList = o9z0Var.f163166d;
        while (i < arrayList.size()) {
            if (((l9z0) arrayList.get(i)).f131199e) {
                ((l9z0) arrayList.get(i)).f131197c += i2;
            }
            i++;
        }
        o9z0Var.f163167e += i2;
    }

    /* JADX INFO: renamed from: B */
    public final void m66503B(djv0 djv0Var, int i) {
        ArrayList arrayList = this.f163166d;
        int size = arrayList.size();
        l9z0 l9z0Var = new l9z0(this, djv0Var);
        l9z0Var.f131197c = this.f163167e;
        l9z0Var.f131196b = size;
        l9z0Var.f131198d = i;
        arrayList.add(l9z0Var);
        int i2 = this.f163167e + 1;
        this.f163167e = i2;
        m47715k(i2, 1);
    }

    /* JADX INFO: renamed from: C */
    public final l9z0 m66504C(int i) {
        ArrayList arrayList = this.f163166d;
        int i2 = 0;
        Object obj = arrayList.get(0);
        while (true) {
            l9z0 l9z0Var = (l9z0) obj;
            int i3 = l9z0Var.f131197c;
            l9z0Var.f131195a.getClass();
            if (i < i3 + 1 && l9z0Var.f131199e) {
                return l9z0Var;
            }
            i2++;
            obj = arrayList.get(i2);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m66505D() {
        int i = 0;
        for (l9z0 l9z0Var : this.f163166d) {
            if (l9z0Var.f131199e) {
                l9z0Var.f131197c = i;
                l9z0Var.f131195a.getClass();
                i++;
            }
        }
        this.f163167e = i;
    }

    /* JADX INFO: renamed from: E */
    public final void m66506E(boolean z, int... iArr) {
        l9z0 l9z0Var;
        int length = iArr.length;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            na6.m63960h("Its not allowed to do actions using the SECTION_ID_NONE id", i2 != Integer.MIN_VALUE);
            Iterator it = this.f163166d.iterator();
            do {
                if (!it.hasNext()) {
                    l9z0Var = null;
                    break;
                }
                l9z0Var = (l9z0) it.next();
            } while (l9z0Var.f131198d != i2);
            if (l9z0Var != null && l9z0Var.f131199e != z) {
                l9z0Var.f131199e = z;
                z2 = true;
            }
        }
        if (z2) {
            m66505D();
            m47712h();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m66507F(int i) {
        l9z0 l9z0Var;
        na6.m63960h("Its not allowed to do actions using the SECTION_ID_NONE id", i != Integer.MIN_VALUE);
        Iterator it = this.f163166d.iterator();
        do {
            if (!it.hasNext()) {
                l9z0Var = null;
                break;
            }
            l9z0Var = (l9z0) it.next();
        } while (l9z0Var.f131198d != i);
        if (l9z0Var == null) {
            return;
        }
        boolean z = l9z0Var.f131199e;
        l9z0Var.f131195a.getClass();
        l9z0Var.f131199e = true;
        if (!z) {
            m66505D();
            m47712h();
        }
    }

    @Override // p204p.ikv0
    /* JADX INFO: renamed from: a */
    public final int mo47855a(int i) {
        l9z0 l9z0VarM66504C = m66504C(i);
        int i2 = i - l9z0VarM66504C.f131197c;
        Object obj = l9z0VarM66504C.f131195a;
        obj.getClass();
        int i3 = i2 == 0 ? 1 : 0;
        return ((obj instanceof ikv0) && i3 == 0) ? ((ikv0) obj).mo47855a(i2) : i3 ^ 1;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f163167e;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public final long mo1618f(int i) {
        l9z0 l9z0VarM66504C = m66504C(i);
        return l9z0VarM66504C.f131195a.mo1618f(i - l9z0VarM66504C.f131197c) ^ ((long) l9z0VarM66504C.hashCode());
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        l9z0 l9z0VarM66504C = m66504C(i);
        SparseIntArray sparseIntArray = l9z0VarM66504C.f131200f;
        int iHashCode = l9z0VarM66504C.f131195a.f49750d.hashCode();
        boolean z = this.f163168f;
        SparseArray sparseArray = this.f163169g;
        if (z) {
            sparseArray.put(iHashCode, new m9z0(l9z0VarM66504C.f131196b, iHashCode));
            return iHashCode;
        }
        int i2 = sparseIntArray.get(iHashCode, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.f163170h;
        this.f163170h = i3 + 1;
        sparseIntArray.put(iHashCode, i3);
        sparseArray.put(i3, new m9z0(l9z0VarM66504C.f131196b, iHashCode));
        return i3;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: m */
    public final void mo28858m(RecyclerView recyclerView) {
        Iterator it = this.f163166d.iterator();
        while (it.hasNext()) {
            ((l9z0) it.next()).f131195a.getClass();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        l9z0 l9z0VarM66504C = m66504C(i);
        l9z0VarM66504C.f131195a.mo1619n(i - l9z0VarM66504C.f131197c, ((n9z0) dkv0Var).f151896S0);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: o */
    public final void mo47717o(dkv0 dkv0Var, int i, List list) {
        l9z0 l9z0VarM66504C = m66504C(i);
        l9z0VarM66504C.f131195a.mo1619n(i - l9z0VarM66504C.f131197c, ((n9z0) dkv0Var).f151896S0);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        m9z0 m9z0Var = (m9z0) this.f163169g.get(i);
        return new n9z0(((l9z0) this.f163166d.get(m9z0Var.f141413a)).f131195a.m47710c(m9z0Var.f141414b, viewGroup));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: q */
    public final void mo28696q(RecyclerView recyclerView) {
        Iterator it = this.f163166d.iterator();
        while (it.hasNext()) {
            ((l9z0) it.next()).f131195a.getClass();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: s */
    public final void mo31053s(dkv0 dkv0Var) {
        ((l9z0) this.f163166d.get(((m9z0) this.f163169g.get(((n9z0) dkv0Var).f50044f)).f141413a)).f131195a.getClass();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: t */
    public final void mo31054t(dkv0 dkv0Var) {
        ((l9z0) this.f163166d.get(((m9z0) this.f163169g.get(((n9z0) dkv0Var).f50044f)).f141413a)).f131195a.getClass();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: u */
    public final void mo28697u(dkv0 dkv0Var) {
        ((l9z0) this.f163166d.get(((m9z0) this.f163169g.get(((n9z0) dkv0Var).f50044f)).f141413a)).f131195a.getClass();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: v */
    public final void mo47719v(jjv0 jjv0Var) {
        boolean z;
        if (!this.f92278a.m50837a()) {
            Iterator it = this.f163166d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((l9z0) it.next()).f131195a.f92279b) {
                    z = false;
                    break;
                }
            }
            m47720w(z);
        }
        super.mo47719v(jjv0Var);
    }
}
