package p204p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k971 implements s9y0 {

    /* JADX INFO: renamed from: b */
    public static final k971 f120529b = new k971(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120530a;

    public /* synthetic */ k971(int i) {
        this.f120530a = i;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    @Override // p204p.s9y0
    /* JADX INFO: renamed from: a */
    public final Object mo55773a(Object obj) {
        switch (this.f120530a) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                Object obj4 = list.get(2);
                Object obj5 = list.get(3);
                String str = (String) obj2;
                long jM37112n = dvg1.m37112n(((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                wj50.m88279p(obj5);
                List list2 = (List) obj5;
                Object obj6 = list2.get(0);
                Object obj7 = list2.get(1);
                sf71 sf71Var = obj6 != null ? (sf71) sf71.f208486i.mo55773a(obj6) : null;
                wj50.m88279p(obj7);
                return new l971(str, jM37112n, new dh31(sf71Var, (l1a1) rf71.f198543a.mo55773a(obj7)));
            case 1:
                yum0 yum0VarM77645B = sam.m77645B(null);
                yq2 yq2Var = (yq2) ((Bundle) obj).getParcelable("agentsBottomSheetModel");
                if (yq2Var != null) {
                    yum0VarM77645B.setValue(new yq2(yq2Var.f275111a, yq2Var.f275112b, new w62(yum0VarM77645B, 3)));
                }
                return yum0VarM77645B;
            case 2:
                List list3 = (List) obj;
                int iIntValue = ((Number) list3.get(0)).intValue();
                int iIntValue2 = ((Number) list3.get(1)).intValue();
                int iIntValue3 = ((Number) list3.get(2)).intValue();
                ro80 ro80VarM44508o = geg1.m44508o();
                int i = 3;
                while (true) {
                    int i2 = iIntValue2 + 3;
                    k971 k971Var = sf71.f208486i;
                    if (i >= i2) {
                        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                        ro80 ro80VarM44508o2 = geg1.m44508o();
                        while (i < iIntValue2 + iIntValue3 + 3) {
                            ro80VarM44508o2.add(k971Var.mo55773a(list3.get(i)));
                            i++;
                        }
                        return new l1a1(iIntValue, ro80VarM44506m, geg1.m44506m(ro80VarM44508o2));
                    }
                    ro80VarM44508o.add(k971Var.mo55773a(list3.get(i)));
                    i++;
                }
                break;
            default:
                List list4 = (List) obj;
                return new sf71(((Integer) list4.get(0)).intValue(), (String) list4.get(1), (String) list4.get(2), dvg1.m37112n(((Integer) list4.get(3)).intValue(), ((Integer) list4.get(4)).intValue()), dvg1.m37112n(((Integer) list4.get(5)).intValue(), ((Integer) list4.get(6)).intValue()), ((Long) list4.get(7)).longValue(), false, 64);
        }
    }

    @Override // p204p.s9y0
    /* JADX INFO: renamed from: b */
    public final Object mo55774b(x7y0 x7y0Var, Object obj) {
        List listM46715L = null;
        switch (this.f120530a) {
            case 0:
                l971 l971Var = (l971) obj;
                String string = l971Var.m58500d().f226935c.toString();
                long j = l971Var.m58500d().f226936d;
                int i = ic71.f100751c;
                Integer numValueOf = Integer.valueOf((int) (j >> 32));
                Integer numValueOf2 = Integer.valueOf((int) (l971Var.m58500d().f226936d & 4294967295L));
                dh31 dh31Var = l971Var.f131022a;
                sf71 sf71Var = (sf71) ((yum0) dh31Var.f48974c).getValue();
                if (sf71Var != null) {
                    Integer numValueOf3 = Integer.valueOf(sf71Var.f208487a);
                    String str = sf71Var.f208488b;
                    String str2 = sf71Var.f208489c;
                    long j2 = sf71Var.f208490d;
                    int i2 = ic71.f100751c;
                    Integer numValueOf4 = Integer.valueOf((int) (j2 >> 32));
                    Integer numValueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
                    long j3 = sf71Var.f208491e;
                    listM46715L = h6f.m46715L(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(sf71Var.f208492f));
                }
                return h6f.m46715L(string, numValueOf, numValueOf2, h6f.m46715L(listM46715L, rf71.f198543a.mo55774b(x7y0Var, (l1a1) dh31Var.f48973b)));
            case 1:
                yq2 yq2Var = (yq2) ((kqi0) obj).getValue();
                if (yq2Var == null) {
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("agentsBottomSheetModel", yq2Var);
                return bundle;
            case 2:
                l1a1 l1a1Var = (l1a1) obj;
                ro80 ro80VarM44508o = geg1.m44508o();
                ro80VarM44508o.add(Integer.valueOf(l1a1Var.f128676a));
                gb31 gb31Var = l1a1Var.f128677b;
                ro80VarM44508o.add(Integer.valueOf(gb31Var.size()));
                gb31 gb31Var2 = l1a1Var.f128678c;
                ro80VarM44508o.add(Integer.valueOf(gb31Var2.size()));
                int size = gb31Var.size();
                int i3 = 0;
                while (true) {
                    k971 k971Var = sf71.f208486i;
                    if (i3 >= size) {
                        int size2 = gb31Var2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            ro80VarM44508o.add(k971Var.mo55774b(x7y0Var, gb31Var2.get(i4)));
                        }
                        return geg1.m44506m(ro80VarM44508o);
                    }
                    ro80VarM44508o.add(k971Var.mo55774b(x7y0Var, gb31Var.get(i3)));
                    i3++;
                }
                break;
            default:
                sf71 sf71Var2 = (sf71) obj;
                Integer numValueOf6 = Integer.valueOf(sf71Var2.f208487a);
                String str3 = sf71Var2.f208488b;
                String str4 = sf71Var2.f208489c;
                long j4 = sf71Var2.f208490d;
                int i5 = ic71.f100751c;
                Integer numValueOf7 = Integer.valueOf((int) (j4 >> 32));
                Integer numValueOf8 = Integer.valueOf((int) (j4 & 4294967295L));
                long j5 = sf71Var2.f208491e;
                return h6f.m46715L(numValueOf6, str3, str4, numValueOf7, numValueOf8, Integer.valueOf((int) (j5 >> 32)), Integer.valueOf((int) (j5 & 4294967295L)), Long.valueOf(sf71Var2.f208492f));
        }
    }
}
