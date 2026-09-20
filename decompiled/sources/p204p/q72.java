package p204p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class q72 implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f185981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f185982b;

    public /* synthetic */ q72(Consumer consumer, int i) {
        this.f185981a = i;
        this.f185982b = consumer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        ?? arrayList;
        switch (this.f185981a) {
            case 0:
                as21 as21Var = (as21) obj;
                yr21 yr21Var = as21Var instanceof yr21 ? (yr21) as21Var : null;
                if (yr21Var != null) {
                    this.f185982b.accept(new i72(yr21Var.f275372b));
                    return;
                }
                return;
            case 1:
                as21 as21Var2 = (as21) obj;
                if (as21Var2 instanceof yr21) {
                    this.f185982b.accept(new np10(g6f.m43736n1(((yr21) as21Var2).f275372b)));
                    return;
                } else {
                    if (!as21Var2.equals(zr21.f285528a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 2:
                pbx0 pbx0Var = (pbx0) obj;
                boolean z = pbx0Var instanceof lbx0;
                if (z) {
                    List list = ((lbx0) pbx0Var).f131746c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ndl) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = new ArrayList(i6f.m49804T(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ndl) it.next()).f152799a);
                    }
                } else {
                    arrayList = lau.f131415a;
                }
                boolean z2 = true;
                fhl fhlVar = ehl.f59615a;
                if ((!z || ((lbx0) pbx0Var).f131747d.f61772b != 1) && z) {
                    fhlVar = crs.f41381Q0;
                }
                lbx0 lbx0Var = z ? (lbx0) pbx0Var : null;
                boolean z3 = false;
                if (lbx0Var != null) {
                    int i = lbx0Var.f131747d.f61771a;
                    if (i != 2 && i != 1) {
                        z2 = false;
                    }
                    z3 = z2;
                }
                this.f185982b.accept(new bhl(arrayList, fhlVar, z3));
                return;
            case 3:
                pbx0 pbx0Var2 = (pbx0) obj;
                if ((pbx0Var2 instanceof kbx0) || (pbx0Var2 instanceof obx0)) {
                    return;
                }
                if (!(pbx0Var2 instanceof lbx0)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list2 = ((lbx0) pbx0Var2).f131746c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof ndl) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((ndl) it2.next()).f152799a);
                }
                this.f185982b.accept(new ur21(arrayList4));
                return;
            case 4:
                Map mapMo56441a = ((nhl) obj).mo56441a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapMo56441a.entrySet()) {
                    if (wj50.m88271j((jhl) entry.getValue(), ihl.f102315a)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new d0w((String) ((Map.Entry) it3.next()).getKey(), 2147483646));
                }
                this.f185982b.accept(new iv81(arrayList5));
                return;
            case 5:
                as21 as21Var3 = (as21) obj;
                if (!(as21Var3 instanceof yr21)) {
                    if (!as21Var3.equals(zr21.f285528a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    Set setM43736n1 = g6f.m43736n1(((yr21) as21Var3).f275372b);
                    Iterator it4 = h6f.m46715L(new s5s(setM43736n1), new whc(setM43736n1), new rfw0(setM43736n1), new h5q0(setM43736n1)).iterator();
                    while (it4.hasNext()) {
                        this.f185982b.accept(it4.next());
                    }
                    return;
                }
            case 6:
                as21 as21Var4 = (as21) obj;
                if (as21Var4 instanceof yr21) {
                    this.f185982b.accept(new i72(g6f.m43728j1(((yr21) as21Var4).f275371a)));
                    return;
                } else {
                    if (!as21Var4.equals(zr21.f285528a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 7:
                if (((as21) obj) instanceof yr21) {
                    this.f185982b.accept(yvw.f276784a);
                    return;
                }
                return;
            default:
                as21 as21Var5 = (as21) obj;
                if (as21Var5 instanceof yr21) {
                    this.f185982b.accept(new tgl(((yr21) as21Var5).f275372b));
                    return;
                } else {
                    if (!as21Var5.equals(zr21.f285528a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        int i = this.f185981a;
    }

    public q72(r72 r72Var, Consumer consumer) {
        this.f185981a = 5;
        this.f185982b = consumer;
    }

    /* JADX INFO: renamed from: a */
    private final void m72268a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m72269b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m72270c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m72271d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m72272e() {
    }

    /* JADX INFO: renamed from: f */
    private final void m72273f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m72274g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m72275h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m72276i() {
    }
}
