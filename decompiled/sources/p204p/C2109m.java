package p204p;

import android.util.Size;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: p.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2109m implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138479a;

    public /* synthetic */ C2109m(int i) {
        this.f138479a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f138479a) {
            case 0:
                r150 r150Var = (r150) obj;
                r150 r150Var2 = (r150) obj2;
                if (p2l.f173365a.contains(AbstractC2196o.class)) {
                    return 0;
                }
                try {
                    Long l = r150Var.f194772g;
                    if (l == null) {
                        return -1;
                    }
                    long jLongValue = l.longValue();
                    Long l2 = r150Var2.f194772g;
                    if (l2 != null) {
                        return wj50.m88283v(l2.longValue(), jLongValue);
                    }
                    return 1;
                } catch (Throwable th) {
                    p2l.m68953a(AbstractC2196o.class, th);
                    return 0;
                }
            case 1:
                return wj50.m88282u(((per0) obj2).f176837a, ((per0) obj).f176837a);
            case 2:
                return Integer.bitCount(((Integer) obj2).intValue()) - Integer.bitCount(((Integer) obj).intValue());
            case 3:
                return Integer.compare(((r300) obj2).f195382k, ((r300) obj).f195382k);
            case 4:
                return Integer.compare(((mhc) obj2).f143769b, ((mhc) obj).f143769b);
            case 5:
                r150 r150Var3 = (r150) obj2;
                Long l3 = ((r150) obj).f194772g;
                if (l3 == null) {
                    return -1;
                }
                long jLongValue2 = l3.longValue();
                Long l4 = r150Var3.f194772g;
                if (l4 != null) {
                    return wj50.m88283v(l4.longValue(), jLongValue2);
                }
                return 1;
            case 6:
                String name = ((File) obj).getName();
                int i = m4l.f139983f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return Integer.compare(((jeq) ((List) obj).get(0)).f111644f, ((jeq) ((List) obj2).get(0)).f111644f);
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 13;
                return wtf.m88917g(qeq.m72666c((qeq) Collections.max(list, new C2109m(12)), (qeq) Collections.max(list2, new C2109m(12)))).mo88918a(list.size(), list2.size()).mo88920c((qeq) Collections.max(list, new C2109m(i2)), (qeq) Collections.max(list2, new C2109m(i2)), new C2109m(i2)).mo88923f();
            case 10:
                return ((ieq) Collections.max((List) obj)).compareTo((ieq) Collections.max((List) obj2));
            case 11:
                return ((neq) ((List) obj).get(0)).compareTo((neq) ((List) obj2).get(0));
            case 12:
                return qeq.m72666c((qeq) obj, (qeq) obj2);
            case 13:
                qeq qeqVar = (qeq) obj;
                qeq qeqVar2 = (qeq) obj2;
                boolean z = qeqVar.f188002e;
                int i3 = qeqVar.f188007t;
                tvl0 tvl0VarMo47258a = (z && qeqVar.f188005h) ? req.f198406l : req.f198406l.mo47258a();
                boolean z2 = qeqVar.f188003f.f52237F;
                ytf ytfVarMo88920c = ytf.f276111a;
                if (z2) {
                    ytfVarMo88920c = ytfVarMo88920c.mo88920c(Integer.valueOf(i3), Integer.valueOf(qeqVar2.f188007t), req.f198406l.mo47258a());
                }
                ytf ytfVarMo88920c2 = ytfVarMo88920c.mo88921d(qeqVar.f187997W0, qeqVar2.f187997W0).mo88920c(Integer.valueOf(qeqVar.f187998X), Integer.valueOf(qeqVar2.f187998X), tvl0VarMo47258a);
                if (qeqVar.f187993S0 && qeqVar.f187995U0) {
                    ytfVarMo88920c2 = ytfVarMo88920c2.mo88918a(qeqVar.f187996V0, qeqVar2.f187996V0);
                }
                return ytfVarMo88920c2.mo88921d(qeqVar.f187994T0, qeqVar2.f187994T0).mo88920c(Integer.valueOf(i3), Integer.valueOf(qeqVar2.f188007t), tvl0VarMo47258a).mo88923f();
            case 14:
                return Long.compare(((p2s) obj).f173422c, ((p2s) obj2).f173422c);
            case 15:
                cgw cgwVar = (cgw) obj2;
                Long l5 = ((cgw) obj).f37819c;
                if (l5 == null) {
                    return -1;
                }
                long jLongValue3 = l5.longValue();
                Long l6 = cgwVar.f37819c;
                if (l6 != null) {
                    return wj50.m88283v(l6.longValue(), jLongValue3);
                }
                return 1;
            case 16:
                return wj50.m88282u(((sl50) obj).f210301b, ((sl50) obj2).f210301b);
            case 17:
                return ((s030) obj).f204292a.compareTo(((s030) obj2).f204292a);
            case 18:
                b450 b450Var = (b450) obj;
                b450 b450Var2 = (b450) obj2;
                return (b450Var.f278779b - b450Var.f278778a) - (b450Var2.f278779b - b450Var2.f278778a);
            case 19:
                return wj50.m88282u(((mv70) obj).getIndex(), ((mv70) obj2).getIndex());
            case 20:
                j4b j4bVar = (j4b) obj;
                j4b j4bVar2 = (j4b) obj2;
                long j = j4bVar.f108648f;
                long j2 = j4bVar2.f108648f;
                if (j - j2 == 0) {
                    return j4bVar.compareTo(j4bVar2);
                }
                return j < j2 ? -1 : 1;
            case 21:
                un80 un80Var = (un80) obj;
                un80 un80Var2 = (un80) obj2;
                int i4 = un80Var.f232095c;
                int i5 = un80Var2.f232095c;
                if (i4 < i5) {
                    return -1;
                }
                if (i4 > i5) {
                    return 1;
                }
                return Integer.compare(un80Var2.f232096d, un80Var.f232096d);
            case 22:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 23:
                ((hb81) obj).getClass();
                ((hb81) obj2).getClass();
                return Integer.compare(1, 1);
            case 24:
                return ((sy7) obj).f215171a.compareTo(((sy7) obj2).f215171a);
            case 25:
                return ((bz7) ((j3l) obj)).f32422a.compareTo(((bz7) ((j3l) obj2)).f32422a);
            case 26:
                return ((mr21) obj).f146408a - ((mr21) obj2).f146408a;
            case 27:
                return Float.compare(((mr21) obj).f146410c, ((mr21) obj2).f146410c);
            case 28:
                fv21 fv21Var = (fv21) obj;
                fv21 fv21Var2 = (fv21) obj2;
                return ytf.f276111a.mo88919b(fv21Var.f73624a, fv21Var2.f73624a).mo88919b(fv21Var.f73625b, fv21Var2.f73625b).mo88918a(fv21Var.f73626c, fv21Var2.f73626c).mo88923f();
            default:
                jw31 jw31Var = (jw31) obj;
                jw31 jw31Var2 = (jw31) obj2;
                int iCompare = Integer.compare(jw31Var2.f116569b, jw31Var.f116569b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = jw31Var.f116570c.compareTo(jw31Var2.f116570c);
                return iCompareTo != 0 ? iCompareTo : jw31Var.f116571d.compareTo(jw31Var2.f116571d);
        }
    }
}
