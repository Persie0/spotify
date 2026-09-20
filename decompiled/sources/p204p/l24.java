package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l24 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128911a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f128912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l24(int i, ArrayList arrayList) {
        super(1);
        this.f128911a = i;
        this.f128912b = arrayList;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f128911a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                ArrayList arrayList = this.f128912b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    s5o0Var.m77294i((t5o0) arrayList.get(i), 0, 0, 0.0f);
                }
                return w2a1.f247311a;
            case 1:
                s5o0 s5o0Var2 = (s5o0) obj;
                ArrayList arrayList2 = this.f128912b;
                int iM46714K = h6f.m46714K(arrayList2);
                if (iM46714K >= 0) {
                    int i2 = 0;
                    while (true) {
                        s5o0Var2.m77294i((t5o0) arrayList2.get(i2), 0, 0, 0.0f);
                        if (i2 != iM46714K) {
                            i2++;
                        }
                    }
                }
                return w2a1.f247311a;
            case 2:
                s5o0 s5o0Var3 = (s5o0) obj;
                ArrayList arrayList3 = this.f128912b;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    s5o0Var3.m77293f((t5o0) arrayList3.get(i3), 0, 0, 0.0f);
                }
                return w2a1.f247311a;
            case 3:
                jpz0.m54000n((mpz0) obj, g6f.m43753y0(this.f128912b, ", ", null, null, rh5.f199116T0, 30));
                return w2a1.f247311a;
            case 4:
                return ((wc6) this.f128912b.get(((Number) obj).intValue())).f249963a.f287938e;
            case 5:
                ((cqx) obj).m33647b(thj.class, this.f128912b, false);
                return w2a1.f247311a;
            case 6:
                jpz0.m53997k((mpz0) obj, new b4f(this.f128912b.size(), 1));
                return w2a1.f247311a;
            case 7:
                cqx cqxVar = (cqx) obj;
                ArrayList arrayList4 = this.f128912b;
                wj50.m88279p(arrayList4);
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    cqxVar.m33646a((String) it.next(), esf.class, false);
                }
                return w2a1.f247311a;
            case 8:
                return Boolean.valueOf(((Number) obj).intValue() == this.f128912b.size());
            case 9:
                return ((k1r) this.f128912b.get(((Number) obj).intValue())).f118415a;
            case 10:
                cqx cqxVar2 = (cqx) obj;
                ArrayList arrayList5 = this.f128912b;
                cqxVar2.m33647b(v140.class, arrayList5, false);
                cqxVar2.m33647b(erc1.class, arrayList5, false);
                return w2a1.f247311a;
            case 11:
                ((cqx) obj).m33647b(wth.class, this.f128912b, false);
                return w2a1.f247311a;
            case 12:
                j6f.m52564V(this.f128912b, ((cqx) obj).f41018a);
                return w2a1.f247311a;
            case 13:
                return ((x2z) this.f128912b.get(((Number) obj).intValue())).f257602a;
            case 14:
                return (n2z) this.f128912b.get(((Number) obj).intValue());
            case 15:
                ks70 ks70Var = (ks70) obj;
                ArrayList arrayList6 = this.f128912b;
                ks70Var.m57193z(arrayList6.size(), new nq5(26, arrayList6), null, new nq5(27, arrayList6), new fyf(new la7(1, arrayList6), true, -1942245546));
                return w2a1.f247311a;
            case 16:
                s5o0 s5o0Var4 = (s5o0) obj;
                for (yk91 yk91Var : this.f128912b) {
                    List list = (List) yk91Var.f273650a;
                    int iIntValue = ((Number) yk91Var.f273651b).intValue();
                    int iIntValue2 = ((Number) yk91Var.f273652c).intValue();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        s5o0Var4.m77293f((t5o0) it2.next(), iIntValue, iIntValue2, 0.0f);
                    }
                }
                return w2a1.f247311a;
            case 17:
                s5o0 s5o0Var5 = (s5o0) obj;
                int i4 = 0;
                for (t5o0 t5o0Var : this.f128912b) {
                    s5o0Var5.m77294i(t5o0Var, 0, i4, 0.0f);
                    i4 += t5o0Var.f217323b;
                }
                return w2a1.f247311a;
            case 18:
                ((cqx) obj).m33647b(tb81.class, this.f128912b, false);
                return w2a1.f247311a;
            case 19:
                cqx cqxVar3 = (cqx) obj;
                Iterator it3 = this.f128912b.iterator();
                while (it3.hasNext()) {
                    cqxVar3.m33646a((String) it3.next(), erc1.class, false);
                }
                return w2a1.f247311a;
            case 20:
                ContextTrack contextTrack = (ContextTrack) obj;
                wj50.m88279p(contextTrack);
                return Boolean.valueOf(this.f128912b.contains(e72.m38008h0(contextTrack)));
            case 21:
                cqx cqxVar4 = (cqx) obj;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = this.f128912b;
                for (Object obj2 : arrayList8) {
                    if (v9q0.f239022a.m83873e((String) obj2)) {
                        arrayList7.add(obj2);
                    }
                }
                cqxVar4.m33647b(i43.class, arrayList7, false);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : arrayList8) {
                    if (v9q0.f239023b.m83873e((String) obj3)) {
                        arrayList9.add(obj3);
                    }
                }
                cqxVar4.m33647b(d73.class, arrayList9, false);
                return w2a1.f247311a;
            case 22:
                ((cqx) obj).m33647b(eua1.class, this.f128912b, false);
                return w2a1.f247311a;
            case 23:
                return ((ees0) this.f128912b.get(((Number) obj).intValue())).getId();
            case 24:
                ArrayList arrayList10 = this.f128912b;
                ((whu) obj).m88174b(arrayList10.size(), new fyf(new zy10(3, arrayList10), true, -1673449743), new l24(23, arrayList10));
                return w2a1.f247311a;
            case 25:
                ((cqx) obj).m33647b(ks81.class, this.f128912b, false);
                return w2a1.f247311a;
            case 26:
                ((cqx) obj).m33647b(uy80.class, this.f128912b, false);
                return w2a1.f247311a;
            case 27:
                nkg0 nkg0Var = (nkg0) obj;
                etw0 etw0Var = (etw0) g6f.m43745s0(this.f128912b);
                String str = etw0Var != null ? etw0Var.f62815a : null;
                if (str == null) {
                    str = "";
                }
                return nkg0Var.m64700e(str);
            case 28:
                ((cqx) obj).m33647b(daj.class, this.f128912b, false);
                return w2a1.f247311a;
            default:
                cqx cqxVar5 = (cqx) obj;
                Iterator it4 = this.f128912b.iterator();
                while (it4.hasNext()) {
                    cqxVar5.m33646a((String) it4.next(), ea41.class, false);
                }
                return w2a1.f247311a;
        }
    }
}
