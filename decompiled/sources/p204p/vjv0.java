package p204p;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vjv0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f242060a;

    /* JADX INFO: renamed from: b */
    public ArrayList f242061b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f242062c;

    /* JADX INFO: renamed from: d */
    public final List f242063d;

    /* JADX INFO: renamed from: e */
    public int f242064e;

    /* JADX INFO: renamed from: f */
    public int f242065f;

    /* JADX INFO: renamed from: g */
    public ujv0 f242066g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f242067h;

    public vjv0(RecyclerView recyclerView) {
        this.f242067h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f242060a = arrayList;
        this.f242061b = null;
        this.f242062c = new ArrayList();
        this.f242063d = Collections.unmodifiableList(arrayList);
        this.f242064e = 2;
        this.f242065f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m85778a(dkv0 dkv0Var, boolean z) {
        RecyclerView.m977o(dkv0Var);
        View view = dkv0Var.f50039a;
        RecyclerView recyclerView = this.f242067h;
        fkv0 fkv0Var = recyclerView.f1203M1;
        if (fkv0Var != null) {
            C2647ze c2647zeMo40436j = fkv0Var.mo40436j();
            mec1.m61564p(view, c2647zeMo40436j != null ? ((ekv0) c2647zeMo40436j).m39313j(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f1208P0;
            if (arrayList.size() > 0) {
                ikc0.m50942n(arrayList.get(0));
                throw null;
            }
            hjv0 hjv0Var = recyclerView.f1204N0;
            if (hjv0Var != null) {
                hjv0Var.mo28697u(dkv0Var);
            }
            if (recyclerView.f1194F1 != null) {
                recyclerView.f1241g.m88091E(dkv0Var);
            }
            if (RecyclerView.f1180a2) {
                Objects.toString(dkv0Var);
            }
        }
        dkv0Var.f50035Q0 = null;
        dkv0Var.f50034P0 = null;
        ujv0 ujv0VarM85780c = m85780c();
        ujv0VarM85780c.getClass();
        int i = dkv0Var.f50044f;
        ArrayList arrayList2 = ujv0VarM85780c.m83293a(i).f221019a;
        if (((tjv0) ujv0VarM85780c.f231154a.get(i)).f221020b <= arrayList2.size()) {
            mvl0.m62946i(view);
        } else {
            if (RecyclerView.f1179Z1 && arrayList2.contains(dkv0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            dkv0Var.m36335z();
            arrayList2.add(dkv0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m85779b(int i) {
        RecyclerView recyclerView = this.f242067h;
        zjv0 zjv0Var = recyclerView.f1194F1;
        if (i >= 0 && i < zjv0Var.m96246b()) {
            return !zjv0Var.f283550g ? i : recyclerView.f1237e.m37300m(i);
        }
        StringBuilder sbM56838j = klh.m56838j(i, "invalid position ", ". State item count is ");
        sbM56838j.append(zjv0Var.m96246b());
        sbM56838j.append(recyclerView.m988G());
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    /* JADX INFO: renamed from: c */
    public final ujv0 m85780c() {
        if (this.f242066g == null) {
            this.f242066g = new ujv0();
            m85782e();
        }
        return this.f242066g;
    }

    /* JADX INFO: renamed from: d */
    public final View m85781d(int i) {
        return m85790m(i, Long.MAX_VALUE).f50039a;
    }

    /* JADX INFO: renamed from: e */
    public final void m85782e() {
        RecyclerView recyclerView;
        hjv0 hjv0Var;
        ujv0 ujv0Var = this.f242066g;
        if (ujv0Var == null || (hjv0Var = (recyclerView = this.f242067h).f1204N0) == null || !recyclerView.f1216T0) {
            return;
        }
        ujv0Var.f231156c.add(hjv0Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m85783f(hjv0 hjv0Var, boolean z) {
        ujv0 ujv0Var = this.f242066g;
        if (ujv0Var != null) {
            SparseArray sparseArray = ujv0Var.f231154a;
            Set set = ujv0Var.f231156c;
            set.remove(hjv0Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((tjv0) sparseArray.get(sparseArray.keyAt(i))).f221019a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    mvl0.m62946i(((dkv0) arrayList.get(i2)).f50039a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m85784g() {
        ArrayList arrayList = this.f242062c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m85785h(size);
        }
        arrayList.clear();
        if (RecyclerView.f1185f2) {
            this.f242067h.f1193E1.m46030d();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m85785h(int i) {
        boolean z = RecyclerView.f1179Z1;
        ArrayList arrayList = this.f242062c;
        dkv0 dkv0Var = (dkv0) arrayList.get(i);
        if (RecyclerView.f1180a2) {
            Objects.toString(dkv0Var);
        }
        m85778a(dkv0Var, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m85786i(View view) {
        dkv0 dkv0VarM969U = RecyclerView.m969U(view);
        boolean zM36332v = dkv0VarM969U.m36332v();
        RecyclerView recyclerView = this.f242067h;
        if (zM36332v) {
            recyclerView.removeDetachedView(view, false);
        }
        if (dkv0VarM969U.m36331u()) {
            dkv0VarM969U.f50030L0.m85791n(dkv0VarM969U);
        } else if (dkv0VarM969U.m36320C()) {
            dkv0VarM969U.f50048t &= -33;
        }
        m85787j(dkv0VarM969U);
        if (recyclerView.f1251n1 == null || dkv0VarM969U.m36329s()) {
            return;
        }
        recyclerView.f1251n1.mo33395f(dkv0VarM969U);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX INFO: renamed from: j */
    public final void m85787j(dkv0 dkv0Var) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.f242067h;
        gx8 gx8Var = recyclerView.f1193E1;
        boolean zM36331u = dkv0Var.m36331u();
        View view = dkv0Var.f50039a;
        boolean z3 = false;
        boolean z4 = true;
        if (zM36331u || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(dkv0Var.m36331u());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m988G());
            throw new IllegalArgumentException(sb.toString());
        }
        if (dkv0Var.m36332v()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(dkv0Var);
            throw new IllegalArgumentException(o7t0.m66395i(recyclerView, sb2));
        }
        if (dkv0Var.m36319B()) {
            throw new IllegalArgumentException(o7t0.m66395i(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((dkv0Var.f50048t & 16) == 0) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        hjv0 hjv0Var = recyclerView.f1204N0;
        boolean z5 = hjv0Var != null && z && hjv0Var.mo47718r(dkv0Var);
        boolean z6 = RecyclerView.f1179Z1;
        ArrayList arrayList = this.f242062c;
        if (z6 && arrayList.contains(dkv0Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(dkv0Var);
            throw new IllegalArgumentException(o7t0.m66395i(recyclerView, sb3));
        }
        if (z5 || dkv0Var.m36329s()) {
            if (this.f242065f <= 0 || (dkv0Var.f50048t & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f242065f && size > 0) {
                    m85785h(0);
                    size--;
                }
                if (RecyclerView.f1185f2 && size > 0 && !gx8Var.m46037k(dkv0Var.f50041c)) {
                    int i = size - 1;
                    while (i >= 0 && gx8Var.m46037k(((dkv0) arrayList.get(i)).f50041c)) {
                        i--;
                    }
                    size = i + 1;
                }
                arrayList.add(size, dkv0Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                m85778a(dkv0Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.f1180a2) {
                recyclerView.m988G();
            }
            z4 = false;
        }
        recyclerView.f1241g.m88091E(dkv0Var);
        if (z3 || z4 || !z) {
            return;
        }
        mvl0.m62946i(view);
        dkv0Var.f50035Q0 = null;
        dkv0Var.f50034P0 = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m85788k(View view) {
        mjv0 mjv0Var;
        dkv0 dkv0VarM969U = RecyclerView.m969U(view);
        int i = dkv0VarM969U.f50048t & 12;
        RecyclerView recyclerView = this.f242067h;
        if (i == 0 && dkv0VarM969U.m36333w() && (mjv0Var = recyclerView.f1251n1) != null && !mjv0Var.mo33394c(dkv0VarM969U, dkv0VarM969U.m36325o())) {
            if (this.f242061b == null) {
                this.f242061b = new ArrayList();
            }
            dkv0VarM969U.f50030L0 = this;
            dkv0VarM969U.f50031M0 = true;
            this.f242061b.add(dkv0VarM969U);
            return;
        }
        if (dkv0VarM969U.m36328r() && !dkv0VarM969U.m36330t() && !recyclerView.f1204N0.f92279b) {
            throw new IllegalArgumentException(o7t0.m66395i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        dkv0VarM969U.f50030L0 = this;
        dkv0VarM969U.f50031M0 = false;
        this.f242060a.add(dkv0VarM969U);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m85789l(dkv0 dkv0Var, int i, int i2, long j) {
        dkv0Var.f50035Q0 = null;
        View view = dkv0Var.f50039a;
        RecyclerView recyclerView = this.f242067h;
        dkv0Var.f50034P0 = recyclerView;
        int i3 = dkv0Var.f50044f;
        long nanoTime = recyclerView.getNanoTime();
        boolean z = false;
        if (j != Long.MAX_VALUE) {
            long j2 = this.f242066g.m83293a(i3).f221022d;
            if (j2 != 0 && j2 + nanoTime >= j) {
                return false;
            }
        }
        if (dkv0Var.m36332v()) {
            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
            z = true;
        }
        recyclerView.f1204N0.m47709b(i, dkv0Var);
        if (z) {
            recyclerView.detachViewFromParent(view);
        }
        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
        tjv0 tjv0VarM83293a = this.f242066g.m83293a(dkv0Var.f50044f);
        long j3 = tjv0VarM83293a.f221022d;
        if (j3 != 0) {
            nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
        }
        tjv0VarM83293a.f221022d = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.f1234c1;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            WeakHashMap weakHashMap = mec1.f142677a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            fkv0 fkv0Var = recyclerView.f1203M1;
            if (fkv0Var != null) {
                C2647ze c2647zeMo40436j = fkv0Var.mo40436j();
                if (c2647zeMo40436j != null) {
                    ((ekv0) c2647zeMo40436j).m39314k(view);
                }
                mec1.m61564p(view, c2647zeMo40436j);
            }
        }
        if (recyclerView.f1194F1.f283550g) {
            dkv0Var.f50045g = i2;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01db  */
    /* JADX WARN: Code duplicated, block: B:181:0x031b A[EDGE_INSN: B:181:0x031b->B:182:0x031c BREAK  A[LOOP:4: B:176:0x0302->B:180:0x0318]] */
    /* JADX WARN: Code duplicated, block: B:223:0x03de  */
    /* JADX WARN: Code duplicated, block: B:250:0x043a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0444  */
    /* JADX WARN: Code duplicated, block: B:253:0x044a  */
    /* JADX WARN: Code duplicated, block: B:254:0x0454  */
    /* JADX WARN: Code duplicated, block: B:257:0x045a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x045f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[EDGE_INSN: B:35:0x007b->B:36:0x007c BREAK  A[LOOP:0: B:14:0x0023->B:20:0x003d]] */
    /* JADX INFO: renamed from: m */
    public final dkv0 m85790m(int i, long j) {
        boolean z;
        dkv0 dkv0VarM47710c;
        boolean z2;
        boolean z3;
        dkv0 dkv0Var;
        boolean zM85789l;
        ViewGroup.LayoutParams layoutParams;
        ojv0 ojv0Var;
        boolean z4;
        RecyclerView recyclerViewM966L;
        dkv0 dkv0Var2;
        View view;
        boolean z5;
        int size;
        int iM37300m;
        RecyclerView recyclerView = this.f242067h;
        zjv0 zjv0Var = recyclerView.f1194F1;
        if (i < 0 || i >= zjv0Var.m96246b()) {
            StringBuilder sbM36619s = dq60.m36619s(i, i, "Invalid item position ", "(", "). Item count:");
            sbM36619s.append(zjv0Var.m96246b());
            sbM36619s.append(recyclerView.m988G());
            throw new IndexOutOfBoundsException(sbM36619s.toString());
        }
        if (zjv0Var.f283550g) {
            ArrayList arrayList = this.f242061b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (recyclerView.f1204N0.f92279b && (iM37300m = recyclerView.f1237e.m37300m(i)) > 0 && iM37300m < recyclerView.f1204N0.mo1617e()) {
                            long jMo1618f = recyclerView.f1204N0.mo1618f(iM37300m);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    dkv0VarM47710c = null;
                                    break;
                                }
                                dkv0 dkv0Var3 = (dkv0) this.f242061b.get(i3);
                                if (!dkv0Var3.m36320C() && dkv0Var3.f50043e == jMo1618f) {
                                    dkv0Var3.m36321k(32);
                                    dkv0VarM47710c = dkv0Var3;
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            dkv0VarM47710c = null;
                            break;
                        }
                    } else {
                        dkv0VarM47710c = (dkv0) this.f242061b.get(i2);
                        if (!dkv0VarM47710c.m36320C() && dkv0VarM47710c.m36324n() == i) {
                            dkv0VarM47710c.m36321k(32);
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                dkv0VarM47710c = null;
                break;
            }
            z = dkv0VarM47710c != null;
        } else {
            z = false;
            dkv0VarM47710c = null;
        }
        ArrayList arrayList2 = this.f242060a;
        ArrayList arrayList3 = this.f242062c;
        if (dkv0VarM47710c == null) {
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    ArrayList arrayList4 = recyclerView.f1239f.f205271c;
                    int size3 = arrayList4.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            z2 = true;
                            view = null;
                            break;
                        }
                        view = (View) arrayList4.get(i5);
                        dkv0 dkv0VarM44960f = gjv0.m44960f(view);
                        z2 = true;
                        if (dkv0VarM44960f.m36324n() == i && !dkv0VarM44960f.m36328r() && !dkv0VarM44960f.m36330t()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = arrayList3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                dkv0VarM47710c = null;
                                break;
                            }
                            dkv0 dkv0Var4 = (dkv0) arrayList3.get(i6);
                            if (!dkv0Var4.m36328r() && dkv0Var4.m36324n() == i && !dkv0Var4.m36326p()) {
                                arrayList3.remove(i6);
                                if (RecyclerView.f1180a2) {
                                    dkv0Var4.toString();
                                }
                                dkv0VarM47710c = dkv0Var4;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        dkv0 dkv0VarM969U = RecyclerView.m969U(view);
                        s3e s3eVar = recyclerView.f1239f;
                        gd5 gd5Var = s3eVar.f205270b;
                        int iM44969i = s3eVar.f205269a.m44969i(view);
                        if (iM44969i < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!gd5Var.m44352C(iM44969i)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        gd5Var.m44366z(iM44969i);
                        s3eVar.m77133g(view);
                        int iM77131e = recyclerView.f1239f.m77131e(view);
                        if (iM77131e == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(dkv0VarM969U);
                            throw new IllegalStateException(o7t0.m66395i(recyclerView, sb));
                        }
                        s3e s3eVar2 = recyclerView.f1239f;
                        int iM77130d = s3eVar2.m77130d(iM77131e);
                        s3eVar2.f205270b.m44360L(iM77130d);
                        s3eVar2.f205269a.m44964c(iM77130d);
                        m85788k(view);
                        dkv0VarM969U.m36321k(8224);
                        dkv0VarM47710c = dkv0VarM969U;
                        break;
                    }
                } else {
                    dkv0 dkv0Var5 = (dkv0) arrayList2.get(i4);
                    if (!dkv0Var5.m36320C() && dkv0Var5.m36324n() == i && !dkv0Var5.m36328r() && (zjv0Var.f283550g || !dkv0Var5.m36330t())) {
                        dkv0Var5.m36321k(32);
                        dkv0VarM47710c = dkv0Var5;
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
            if (dkv0VarM47710c != null) {
                if (!dkv0VarM47710c.m36330t()) {
                    int i7 = dkv0VarM47710c.f50041c;
                    if (i7 < 0 || i7 >= recyclerView.f1204N0.mo1617e()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(dkv0VarM47710c);
                        throw new IndexOutOfBoundsException(o7t0.m66395i(recyclerView, sb2));
                    }
                    if (zjv0Var.f283550g || recyclerView.f1204N0.mo28437g(dkv0VarM47710c.f50041c) == dkv0VarM47710c.f50044f) {
                        hjv0 hjv0Var = recyclerView.f1204N0;
                        if (!hjv0Var.f92279b || dkv0VarM47710c.f50043e == hjv0Var.mo1618f(dkv0VarM47710c.f50041c)) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = false;
                    }
                } else {
                    if (RecyclerView.f1179Z1 && !zjv0Var.f283550g) {
                        throw new IllegalStateException(o7t0.m66395i(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z5 = zjv0Var.f283550g;
                }
                if (z5) {
                    z = z2;
                } else {
                    dkv0VarM47710c.m36321k(4);
                    if (dkv0VarM47710c.m36331u()) {
                        recyclerView.removeDetachedView(dkv0VarM47710c.f50039a, false);
                        dkv0VarM47710c.f50030L0.m85791n(dkv0VarM47710c);
                    } else if (dkv0VarM47710c.m36320C()) {
                        dkv0VarM47710c.f50048t &= -33;
                    }
                    m85787j(dkv0VarM47710c);
                    dkv0VarM47710c = null;
                }
            }
        } else {
            z2 = true;
        }
        if (dkv0VarM47710c == null) {
            int iM37300m2 = recyclerView.f1237e.m37300m(i);
            if (iM37300m2 < 0 || iM37300m2 >= recyclerView.f1204N0.mo1617e()) {
                StringBuilder sbM36619s2 = dq60.m36619s(i, iM37300m2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbM36619s2.append(zjv0Var.m96246b());
                sbM36619s2.append(recyclerView.m988G());
                throw new IndexOutOfBoundsException(sbM36619s2.toString());
            }
            int iMo28437g = recyclerView.f1204N0.mo28437g(iM37300m2);
            hjv0 hjv0Var2 = recyclerView.f1204N0;
            if (hjv0Var2.f92279b) {
                long jMo1618f2 = hjv0Var2.mo1618f(iM37300m2);
                int size5 = arrayList2.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                dkv0 dkv0Var6 = (dkv0) arrayList3.get(size6);
                                if (dkv0Var6.f50043e != jMo1618f2 || dkv0Var6.m36326p()) {
                                    size6--;
                                } else {
                                    if (iMo28437g == dkv0Var6.f50044f) {
                                        arrayList3.remove(size6);
                                        dkv0VarM47710c = dkv0Var6;
                                        break;
                                    }
                                    m85785h(size6);
                                }
                            }
                            dkv0VarM47710c = null;
                            break;
                        }
                    }
                    dkv0 dkv0Var7 = (dkv0) arrayList2.get(size5);
                    RecyclerView recyclerView2 = recyclerView;
                    long j2 = dkv0Var7.f50043e;
                    View view2 = dkv0Var7.f50039a;
                    if (j2 != jMo1618f2 || dkv0Var7.m36320C()) {
                        recyclerView = recyclerView2;
                    } else {
                        if (iMo28437g == dkv0Var7.f50044f) {
                            dkv0Var7.m36321k(32);
                            if (dkv0Var7.m36330t() && !zjv0Var.f283550g) {
                                dkv0Var7.f50048t = (dkv0Var7.f50048t & (-15)) | 2;
                            }
                            dkv0VarM47710c = dkv0Var7;
                            recyclerView = recyclerView2;
                            break;
                        }
                        arrayList2.remove(size5);
                        recyclerView = recyclerView2;
                        recyclerView.removeDetachedView(view2, false);
                        dkv0 dkv0VarM969U2 = RecyclerView.m969U(view2);
                        dkv0VarM969U2.f50030L0 = null;
                        dkv0VarM969U2.f50031M0 = false;
                        dkv0VarM969U2.f50048t &= -33;
                        m85787j(dkv0VarM969U2);
                    }
                    size5--;
                }
                if (dkv0VarM47710c != null) {
                    dkv0VarM47710c.f50041c = iM37300m2;
                    z = z2;
                }
            }
            if (dkv0VarM47710c == null) {
                boolean z6 = RecyclerView.f1179Z1;
                tjv0 tjv0Var = (tjv0) m85780c().f231154a.get(iMo28437g);
                if (tjv0Var == null) {
                    dkv0Var2 = null;
                    break;
                }
                ArrayList arrayList5 = tjv0Var.f221019a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            dkv0Var2 = null;
                            break;
                        }
                        if (!((dkv0) arrayList5.get(size7)).m36326p()) {
                            dkv0Var2 = (dkv0) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    dkv0Var2 = null;
                    break;
                }
                if (dkv0Var2 != null) {
                    dkv0Var2.m36335z();
                    boolean z7 = RecyclerView.f1179Z1;
                }
                dkv0VarM47710c = dkv0Var2;
            }
            if (dkv0VarM47710c == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j3 = this.f242066g.m83293a(iMo28437g).f221021c;
                    if (!((j3 == 0 || j3 + nanoTime < j) ? z2 : false)) {
                        return null;
                    }
                }
                dkv0VarM47710c = recyclerView.f1204N0.m47710c(iMo28437g, recyclerView);
                if (RecyclerView.f1185f2 && (recyclerViewM966L = RecyclerView.m966L(dkv0VarM47710c.f50039a)) != null) {
                    dkv0VarM47710c.f50040b = new WeakReference(recyclerViewM966L);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                tjv0 tjv0VarM83293a = this.f242066g.m83293a(iMo28437g);
                long j4 = tjv0VarM83293a.f221021c;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                }
                tjv0VarM83293a.f221021c = nanoTime2;
            }
        }
        boolean z8 = z;
        View view3 = dkv0VarM47710c.f50039a;
        if (!z8 || zjv0Var.f283550g) {
            z3 = false;
        } else {
            int i8 = dkv0VarM47710c.f50048t;
            if ((i8 & 8192) != 0 ? z2 : false) {
                dkv0VarM47710c.f50048t = i8 & (-8193);
                if (zjv0Var.f283553j) {
                    mjv0.m61990b(dkv0VarM47710c);
                    mjv0 mjv0Var = recyclerView.f1251n1;
                    dkv0VarM47710c.m36325o();
                    mjv0Var.getClass();
                    z3 = false;
                    qr8 qr8Var = new qr8(z3);
                    qr8Var.m73604o(dkv0VarM47710c);
                    recyclerView.m1017l0(dkv0VarM47710c, qr8Var);
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
        }
        if (!zjv0Var.f283550g || !dkv0VarM47710c.m36327q()) {
            if (dkv0VarM47710c.m36327q()) {
                if (((dkv0VarM47710c.f50048t & 2) != 0 ? z2 : z3) || dkv0VarM47710c.m36328r()) {
                }
                layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                    ojv0Var = (ojv0) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(ojv0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    ojv0Var = (ojv0) layoutParams;
                } else {
                    ojv0Var = (ojv0) recyclerView.generateLayoutParams(layoutParams);
                    view3.setLayoutParams(ojv0Var);
                }
                ojv0Var.f166147a = dkv0Var;
                if (z8 || !zM85789l) {
                    z4 = z3;
                } else {
                    z4 = z2;
                }
                ojv0Var.f166150d = z4;
                return dkv0Var;
            }
            if (RecyclerView.f1179Z1 && dkv0VarM47710c.m36330t()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(dkv0VarM47710c);
                throw new IllegalStateException(o7t0.m66395i(recyclerView, sb3));
            }
            dkv0Var = dkv0VarM47710c;
            zM85789l = m85789l(dkv0Var, recyclerView.f1237e.m37300m(i), i, j);
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
                ojv0Var = (ojv0) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(ojv0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                ojv0Var = (ojv0) recyclerView.generateLayoutParams(layoutParams);
                view3.setLayoutParams(ojv0Var);
            } else {
                ojv0Var = (ojv0) layoutParams;
            }
            ojv0Var.f166147a = dkv0Var;
            if (z8) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            ojv0Var.f166150d = z4;
            return dkv0Var;
        }
        dkv0VarM47710c.f50045g = i;
        zM85789l = z3;
        dkv0Var = dkv0VarM47710c;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            ojv0Var = (ojv0) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(ojv0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            ojv0Var = (ojv0) recyclerView.generateLayoutParams(layoutParams);
            view3.setLayoutParams(ojv0Var);
        } else {
            ojv0Var = (ojv0) layoutParams;
        }
        ojv0Var.f166147a = dkv0Var;
        if (z8) {
            z4 = z3;
        } else {
            z4 = z3;
        }
        ojv0Var.f166150d = z4;
        return dkv0Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m85791n(dkv0 dkv0Var) {
        if (dkv0Var.f50031M0) {
            this.f242061b.remove(dkv0Var);
        } else {
            this.f242060a.remove(dkv0Var);
        }
        dkv0Var.f50030L0 = null;
        dkv0Var.f50031M0 = false;
        dkv0Var.f50048t &= -33;
    }

    /* JADX INFO: renamed from: o */
    public final void m85792o() {
        AbstractC0110a abstractC0110a = this.f242067h.f1206O0;
        this.f242065f = this.f242064e + (abstractC0110a != null ? abstractC0110a.f1290X : 0);
        ArrayList arrayList = this.f242062c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f242065f; size--) {
            m85785h(size);
        }
    }
}
