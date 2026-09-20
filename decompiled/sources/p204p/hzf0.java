package p204p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class hzf0 {

    /* JADX INFO: renamed from: a */
    public final er70 f96913a;

    /* JADX INFO: renamed from: b */
    public final r991 f96914b;

    /* JADX INFO: renamed from: c */
    public final wg61 f96915c = new wg61(gzf0.f85907a);

    public hzf0(er70 er70Var, r991 r991Var) {
        this.f96913a = er70Var;
        this.f96914b = r991Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final blw0 m49273a(List list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            nw80 nw80Var = (nw80) obj;
            Set set = dd41.f47702f;
            if (r46.m74726U(nw80Var.f159049c).f47709c != gn80.TRACK || nw80Var.m65755f() || (!nw80Var.m65756g() && nw80Var.m65751b() != hto0.f95104f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nw80) it.next()).f159047a);
        }
        Set setM43736n1 = g6f.m43736n1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!setM43736n1.contains(((nw80) obj2).f159047a)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.size() < 2) {
            list2 = lau.f131415a;
        } else {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int i = 0;
            for (Object obj3 : arrayList3) {
                int i2 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                nw80 nw80Var2 = (nw80) obj3;
                nw80 nw80Var3 = (nw80) g6f.m43747t0(i2, arrayList3);
                if (nw80Var3 != null) {
                    Map map = nw80Var2.f159053g;
                    this.f96914b.getClass();
                    b791 b791VarM75017b = r991.m75017b(map);
                    if (b791VarM75017b != null) {
                        boolean z = b791VarM75017b.f24197c || b791VarM75017b.f24198d || q3d0.m72075F(b791VarM75017b.f24195a);
                        boolean zM88271j = wj50.m88271j(b791VarM75017b.f24196b.f204175b, nw80Var3.f159049c);
                        if (z && zM88271j) {
                            if (arrayList5.isEmpty()) {
                                arrayList5.add(nw80Var2.f159047a);
                            }
                            arrayList5.add(nw80Var3.f159047a);
                        } else if (!arrayList5.isEmpty()) {
                            arrayList4.add(g6f.m43728j1(arrayList5));
                            arrayList5 = new ArrayList();
                        }
                    } else if (!arrayList5.isEmpty()) {
                        arrayList4.add(g6f.m43728j1(arrayList5));
                        arrayList5 = new ArrayList();
                    }
                } else if (!arrayList5.isEmpty()) {
                    arrayList4.add(g6f.m43728j1(arrayList5));
                    arrayList5 = new ArrayList();
                }
                i = i2;
            }
            list2 = arrayList4;
            if (!arrayList5.isEmpty()) {
                arrayList4.add(g6f.m43728j1(arrayList5));
                list2 = arrayList4;
            }
        }
        return new blw0(arrayList2, list2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m49274b(String str, List list, ibk ibkVar) {
        fzf0 fzf0Var;
        List list2;
        if (ibkVar instanceof fzf0) {
            fzf0Var = (fzf0) ibkVar;
            int i = fzf0Var.f75010d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzf0Var.f75010d = i - Integer.MIN_VALUE;
            } else {
                fzf0Var = new fzf0(this, ibkVar);
            }
        } else {
            fzf0Var = new fzf0(this, ibkVar);
        }
        Object objM62841f = fzf0Var.f75008b;
        int i2 = fzf0Var.f75010d;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            wt80 wt80Var = (wt80) this.f96913a.get();
            st80 st80Var = new st80((PlaylistRequestDecorationPolicy) this.f96915c.getValue(), null, null, false, null, a5u0.f12598a, null, 0, null, 478);
            fzf0Var.f75007a = list;
            fzf0Var.f75010d = 1;
            objM62841f = ((mu80) wt80Var).m62841f(str, st80Var, fzf0Var);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = fzf0Var.f75007a;
            bga.m29073P(objM62841f);
        }
        p2x0 p2x0Var = (p2x0) objM62841f;
        if (p2x0Var instanceof k2x0) {
            return new c6x0(new Exception(((k2x0) p2x0Var).f118699a.mo27977b()));
        }
        if (!(p2x0Var instanceof m2x0)) {
            throw new NoWhenBranchMatchedException();
        }
        Set setM43736n1 = g6f.m43736n1(list2);
        List list3 = ((qu80) ((m2x0) p2x0Var).f139474a).f192598d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (!setM43736n1.contains(((nw80) obj).f159047a)) {
                arrayList.add(obj);
            }
        }
        return m49273a(arrayList);
    }
}
