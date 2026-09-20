package p204p;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: p.pn */
/* JADX INFO: loaded from: classes4.dex */
public final class C2262pn extends jjv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f179270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f179271b;

    public /* synthetic */ C2262pn(Object obj, int i) {
        this.f179270a = i;
        this.f179271b = obj;
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: a */
    public void mo29357a() {
        switch (this.f179270a) {
            case 1:
                lfj0 lfj0Var = (lfj0) this.f179271b;
                lfj0Var.f132962e = lfj0Var.f132960c.mo1617e();
                rth rthVar = lfj0Var.f132961d;
                ((qth) rthVar.f202590e).m47712h();
                rthVar.m76383d();
                break;
            case 2:
                ((nwr0) this.f179271b).m65802a();
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) this.f179271b;
                recyclerView.m1020n(null);
                recyclerView.f1194F1.f283549f = true;
                recyclerView.m1016k0(true);
                if (!recyclerView.f1237e.m37311x()) {
                    recyclerView.requestLayout();
                }
                break;
            case 5:
                czy0.m34476a((czy0) this.f179271b);
                break;
            case 6:
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = (StickyHeaderLinearLayoutManager) this.f179271b;
                ArrayList arrayList = stickyHeaderLinearLayoutManager.f6384g1;
                arrayList.clear();
                int iMo1617e = stickyHeaderLinearLayoutManager.f6382e1.mo1617e();
                for (int i = 0; i < iMo1617e; i++) {
                    if (((Boolean) stickyHeaderLinearLayoutManager.f6383f1.invoke(Integer.valueOf(i))).booleanValue()) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                if (stickyHeaderLinearLayoutManager.f6385h1 != null && !arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.f6386i1))) {
                    stickyHeaderLinearLayoutManager.m16034M1(null);
                    break;
                }
                break;
            case 7:
                ((bl61) this.f179271b).m29742b();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: b */
    public void mo29358b(int i, int i2) {
        switch (this.f179270a) {
            case 1:
                lfj0 lfj0Var = (lfj0) this.f179271b;
                rth rthVar = lfj0Var.f132961d;
                ((qth) rthVar.f202590e).f92278a.m50840d(i + rthVar.m76384e(lfj0Var), i2, null);
                return;
            case 5:
                czy0.m34476a((czy0) this.f179271b);
                return;
            case 7:
                ((bl61) this.f179271b).m29742b();
                return;
            case 8:
                yz61 yz61Var = (yz61) this.f179271b;
                lz61 lz61Var = yz61Var.f277710Z1;
                if (lz61Var == null) {
                    wj50.m88260d0("termsAdapter");
                    throw null;
                }
                List list = lz61Var.f82904d.f39905f;
                boolean z = true;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((oz61) it.next()).f172140c) {
                            z = false;
                        }
                    }
                }
                a531 a531Var = yz61Var.f277712b2;
                if (a531Var != null) {
                    ((EncoreButton) a531Var.f12415c).setEnabled(z);
                    return;
                } else {
                    wj50.m88260d0("binding");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: c */
    public void mo29359c(int i, int i2, Object obj) {
        switch (this.f179270a) {
            case 1:
                lfj0 lfj0Var = (lfj0) this.f179271b;
                rth rthVar = lfj0Var.f132961d;
                ((qth) rthVar.f202590e).f92278a.m50840d(i + rthVar.m76384e(lfj0Var), i2, obj);
                break;
            case 2:
            case 4:
            case 6:
            default:
                super.mo29359c(i, i2, obj);
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) this.f179271b;
                recyclerView.m1020n(null);
                dy0 dy0Var = recyclerView.f1237e;
                ArrayList arrayList = (ArrayList) dy0Var.f54138c;
                if (i2 >= 1) {
                    arrayList.add(dy0Var.m37313z(4, i, obj, i2));
                    dy0Var.f54136a |= 4;
                    if (arrayList.size() == 1) {
                        m70423i();
                    }
                    break;
                }
                break;
            case 5:
                czy0.m34476a((czy0) this.f179271b);
                break;
            case 7:
                ((bl61) this.f179271b).m29742b();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: d */
    public void mo29360d(int i, int i2) {
        switch (this.f179270a) {
            case 0:
                if (i == 0) {
                    ((RecyclerView) ((nh61) ((C2300qn) this.f179271b).f190445b).f153886d).mo1035v0(0);
                }
                break;
            case 1:
                lfj0 lfj0Var = (lfj0) this.f179271b;
                lfj0Var.f132962e += i2;
                rth rthVar = lfj0Var.f132961d;
                ((qth) rthVar.f202590e).m47715k(i + rthVar.m76384e(lfj0Var), i2);
                if (lfj0Var.f132962e > 0 && lfj0Var.f132960c.f92280c == 2) {
                    rthVar.m76383d();
                    break;
                }
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) this.f179271b;
                recyclerView.m1020n(null);
                dy0 dy0Var = recyclerView.f1237e;
                ArrayList arrayList = (ArrayList) dy0Var.f54138c;
                if (i2 >= 1) {
                    arrayList.add(dy0Var.m37313z(1, i, null, i2));
                    dy0Var.f54136a |= 1;
                    if (arrayList.size() == 1) {
                        m70423i();
                    }
                    break;
                }
                break;
            case 4:
                if (i == 0) {
                    ((h8w0) this.f179271b).f88821d.mo1035v0(0);
                }
                break;
            case 5:
                czy0.m34476a((czy0) this.f179271b);
                break;
            case 6:
                mo29357a();
                break;
            case 7:
                ((bl61) this.f179271b).m29742b();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: e */
    public void mo29361e(int i, int i2) {
        switch (this.f179270a) {
            case 1:
                lfj0 lfj0Var = (lfj0) this.f179271b;
                rth rthVar = lfj0Var.f132961d;
                int iM76384e = rthVar.m76384e(lfj0Var);
                ((qth) rthVar.f202590e).m47714j(i + iM76384e, i2 + iM76384e);
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) this.f179271b;
                recyclerView.m1020n(null);
                dy0 dy0Var = recyclerView.f1237e;
                ArrayList arrayList = (ArrayList) dy0Var.f54138c;
                if (i != i2) {
                    arrayList.add(dy0Var.m37313z(8, i, null, i2));
                    dy0Var.f54136a |= 8;
                    if (arrayList.size() == 1) {
                        m70423i();
                    }
                    break;
                }
                break;
            case 5:
                czy0.m34476a((czy0) this.f179271b);
                break;
            case 6:
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = (StickyHeaderLinearLayoutManager) this.f179271b;
                ArrayList arrayList2 = stickyHeaderLinearLayoutManager.f6384g1;
                int size = arrayList2.size();
                if (size > 0) {
                    if (i < i2) {
                        for (int iM16026E1 = StickyHeaderLinearLayoutManager.m16026E1(stickyHeaderLinearLayoutManager, i); iM16026E1 != -1 && iM16026E1 < size; iM16026E1++) {
                            int iIntValue = ((Number) arrayList2.get(iM16026E1)).intValue();
                            if (iIntValue >= i && iIntValue < i + 1) {
                                arrayList2.set(iM16026E1, Integer.valueOf((i2 - i) + iIntValue));
                                m70422h(iM16026E1);
                            } else if (iIntValue >= i + 1 && iIntValue <= i2) {
                                arrayList2.set(iM16026E1, Integer.valueOf(iIntValue - 1));
                                m70422h(iM16026E1);
                            }
                        }
                    } else {
                        for (int iM16026E2 = StickyHeaderLinearLayoutManager.m16026E1(stickyHeaderLinearLayoutManager, i2); iM16026E2 != -1 && iM16026E2 < size; iM16026E2++) {
                            int iIntValue2 = ((Number) arrayList2.get(iM16026E2)).intValue();
                            if (iIntValue2 >= i && iIntValue2 < i + 1) {
                                arrayList2.set(iM16026E2, Integer.valueOf((i2 - i) + iIntValue2));
                                m70422h(iM16026E2);
                            } else if (i2 <= iIntValue2 && iIntValue2 <= i) {
                                arrayList2.set(iM16026E2, Integer.valueOf(iIntValue2 + 1));
                                m70422h(iM16026E2);
                            }
                        }
                    }
                }
                break;
            case 7:
                ((bl61) this.f179271b).m29742b();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: f */
    public void mo29362f(int i, int i2) {
        switch (this.f179270a) {
            case 1:
                lfj0 lfj0Var = (lfj0) this.f179271b;
                lfj0Var.f132962e -= i2;
                rth rthVar = lfj0Var.f132961d;
                ((qth) rthVar.f202590e).m47716l(i + rthVar.m76384e(lfj0Var), i2);
                if (lfj0Var.f132962e < 1 && lfj0Var.f132960c.f92280c == 2) {
                    rthVar.m76383d();
                    break;
                }
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) this.f179271b;
                recyclerView.m1020n(null);
                dy0 dy0Var = recyclerView.f1237e;
                ArrayList arrayList = (ArrayList) dy0Var.f54138c;
                if (i2 >= 1) {
                    arrayList.add(dy0Var.m37313z(2, i, null, i2));
                    dy0Var.f54136a |= 2;
                    if (arrayList.size() == 1) {
                        m70423i();
                    }
                    break;
                }
                break;
            case 4:
                if (i == 0) {
                    ((h8w0) this.f179271b).f88821d.mo1035v0(0);
                }
                break;
            case 5:
                czy0.m34476a((czy0) this.f179271b);
                break;
            case 6:
                mo29357a();
                break;
            case 7:
                ((bl61) this.f179271b).m29742b();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: g */
    public void mo53574g() {
        hjv0 hjv0Var;
        switch (this.f179270a) {
            case 1:
                ((lfj0) this.f179271b).f132961d.m76383d();
                break;
            case 3:
                RecyclerView recyclerView = (RecyclerView) this.f179271b;
                if (recyclerView.f1235d != null && (hjv0Var = recyclerView.f1204N0) != null) {
                    int iM38547C = edb.m38547C(hjv0Var.f92280c);
                    if (iM38547C != 1) {
                        if (iM38547C == 2) {
                        }
                    } else if (hjv0Var.mo1617e() <= 0) {
                    }
                    recyclerView.requestLayout();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m70422h(int i) {
        StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = (StickyHeaderLinearLayoutManager) this.f179271b;
        ArrayList arrayList = stickyHeaderLinearLayoutManager.f6384g1;
        int iIntValue = ((Number) arrayList.remove(i)).intValue();
        int iM16026E1 = StickyHeaderLinearLayoutManager.m16026E1(stickyHeaderLinearLayoutManager, iIntValue);
        if (iM16026E1 != -1) {
            arrayList.add(iM16026E1, Integer.valueOf(iIntValue));
        } else {
            arrayList.add(Integer.valueOf(iIntValue));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m70423i() {
        RecyclerView recyclerView = (RecyclerView) this.f179271b;
        if (!RecyclerView.f1184e2 || !recyclerView.f1218U0 || !recyclerView.f1216T0) {
            recyclerView.f1232b1 = true;
            recyclerView.requestLayout();
        } else {
            zu3 zu3Var = recyclerView.f1245i;
            WeakHashMap weakHashMap = mec1.f142677a;
            recyclerView.postOnAnimation(zu3Var);
        }
    }
}
