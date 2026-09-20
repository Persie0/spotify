package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class h1r0 {

    /* JADX INFO: renamed from: a */
    public final n1r0 f86685a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f86686b;

    /* JADX INFO: renamed from: c */
    public final boolean f86687c;

    /* JADX INFO: renamed from: d */
    public final p7x0 f86688d;

    /* JADX INFO: renamed from: e */
    public final p7x0 f86689e;

    public h1r0(u7x0 u7x0Var, n1r0 n1r0Var, h15 h15Var) {
        this.f86685a = n1r0Var;
        ArrayList arrayList = new ArrayList();
        this.f86686b = arrayList;
        this.f86688d = u7x0Var.mo27151a(uh1.f230326p, new f1r0(this, 1));
        this.f86689e = u7x0Var.mo27151a(uh1.f230336z, new f1r0(this, 0));
        this.f86687c = true;
        List listM43728j1 = g6f.m43728j1(arrayList);
        arrayList.clear();
        Iterator it = listM43728j1.iterator();
        while (it.hasNext()) {
            ((eh00) it.next()).invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m46465a(String str, ibk ibkVar) {
        g1r0 g1r0Var;
        String str2;
        Object objM63520l;
        w2a1 w2a1Var;
        Iterator it;
        int i;
        String str3;
        int i2;
        if (ibkVar instanceof g1r0) {
            g1r0Var = (g1r0) ibkVar;
            int i3 = g1r0Var.f75706d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g1r0Var.f75706d = i3 - Integer.MIN_VALUE;
            } else {
                g1r0Var = new g1r0(this, ibkVar);
            }
        } else {
            g1r0Var = new g1r0(this, ibkVar);
        }
        Object obj = g1r0Var.f75704b;
        int i4 = g1r0Var.f75706d;
        n1r0 n1r0Var = this.f86685a;
        if (i4 == 0) {
            bga.m29073P(obj);
            str2 = str;
            g1r0Var.f75703a = str2;
            g1r0Var.f75706d = 1;
            objM63520l = n1r0Var.m63520l(g1r0Var);
            yuk yukVar = yuk.f276404a;
            if (objM63520l == yukVar) {
                return yukVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = g1r0Var.f75703a;
            bga.m29073P(obj);
            objM63520l = obj;
            str2 = str4;
        }
        y2r0 y2r0Var = (y2r0) objM63520l;
        w2a1 w2a1Var2 = w2a1.f247311a;
        if (y2r0Var == null) {
            return w2a1Var2;
        }
        z2r0 z2r0Var = y2r0Var.f268670a;
        String str5 = z2r0Var.f278646a;
        ArrayList arrayList = z2r0Var.f278654i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i6 = i5 + 1;
            x151 x151Var = null;
            if (i5 < 0) {
                h6f.m46722S();
                throw null;
            }
            f3r0 f3r0Var = (f3r0) next;
            String str6 = z2r0Var.f278650e;
            if (f3r0Var instanceof a3r0) {
                w2a1Var = w2a1Var2;
                it = it2;
                i = i6;
                x151Var = new x151(s571.m77246e(i5, "location:"), new zla0(str6), null, ((a3r0) f3r0Var).f12033c, 4);
            } else if (f3r0Var instanceof b3r0) {
                String strM77246e = s571.m77246e(i5, "questionnaire:");
                b3r0 b3r0Var = (b3r0) f3r0Var;
                String str7 = b3r0Var.f23114a;
                String str8 = b3r0Var.f23115b;
                String str9 = b3r0Var.f23116c;
                Integer num = b3r0Var.f23117d;
                w2a1Var = w2a1Var2;
                boolean z = b3r0Var.f23118e;
                ArrayList arrayList3 = b3r0Var.f23119f;
                it = it2;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    x2r0 x2r0Var = (x2r0) it3.next();
                    Iterator it4 = it3;
                    String str10 = x2r0Var.f257549a;
                    String str11 = x2r0Var.f257550b;
                    String str12 = x2r0Var.f257551c;
                    int iM38547C = edb.m38547C(x2r0Var.f257552d);
                    if (iM38547C != 0) {
                        str3 = str7;
                        if (iM38547C != 1) {
                            int i7 = 3;
                            if (iM38547C != 2) {
                                if (iM38547C != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i7 = 4;
                            }
                            i2 = i7;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        str3 = str7;
                        i2 = 1;
                    }
                    arrayList4.add(new hlt0(i2, str10, str11, x2r0Var.f257553e, str12));
                    it3 = it4;
                    str7 = str3;
                    i6 = i6;
                }
                i = i6;
                String str13 = b3r0Var.f23120g;
                List list = b3r0Var.f23121h;
                x151Var = new x151(strM77246e, new slt0(str7, str8, str9, num, z, arrayList4, str13, list, 1, 1), null, list, 4);
            } else {
                w2a1Var = w2a1Var2;
                it = it2;
                i = i6;
                if (!(f3r0Var instanceof c3r0) && !(f3r0Var instanceof d3r0) && !(f3r0Var instanceof e3r0)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (x151Var != null) {
                arrayList2.add(x151Var);
            }
            w2a1Var2 = w2a1Var;
            it2 = it;
            i5 = i;
        }
        w2a1 w2a1Var3 = w2a1Var2;
        String str14 = z2r0Var.f278656k;
        dsc1 dsc1Var = z2r0Var.f278653h;
        if (dsc1Var == null) {
            throw new IllegalStateException(s571.m77251j("Personalized preset ", str5, " has no voice").toString());
        }
        icm icmVar = new icm(str5, arrayList2, new d6l(str14, dsc1Var.f52536a, (List) null, z2r0Var.f278652g, 20));
        n1r0Var.f149498t = icmVar;
        this.f86688d.mo25060a(icmVar, str2);
        return w2a1Var3;
    }
}
