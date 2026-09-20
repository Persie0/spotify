package p204p;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class tda implements f5i0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wf11 f219272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f219273b;

    public tda(wf11 wf11Var, eh00 eh00Var) {
        this.f219272a = wf11Var;
        this.f219273b = eh00Var;
    }

    @Override // p204p.f5i0
    /* JADX INFO: renamed from: a */
    public final n6d0 mo40761a(o6d0 o6d0Var, List list, long j) {
        Integer numValueOf;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        final int iM28430i = b8j.m28430i(j);
        final int iM28429h = b8j.m28429h(j);
        long jM28423b = b8j.m28423b(j, 0, 0, 0, 0, 10);
        final ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((h6d0) list4.get(i2)).mo39619B(jM28423b));
        }
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList3.add(((h6d0) list2.get(i3)).mo39619B(jM28423b));
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((t5o0) arrayList3.get(0)).f217323b);
            int iM46714K = h6f.m46714K(arrayList3);
            if (1 <= iM46714K) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t5o0) arrayList3.get(i)).f217323b);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i == iM46714K) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jM28423b2 = b8j.m28423b(jM28423b, 0, 0, 0, iM28429h - iIntValue, 7);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList4.add(((h6d0) list3.get(i4)).mo39619B(jM28423b2));
        }
        final ArrayList arrayList5 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i5 = 0; i5 < size4; i5++) {
            arrayList5.add(((h6d0) list5.get(i5)).mo39619B(jM28423b));
        }
        final wf11 wf11Var = this.f219272a;
        final eh00 eh00Var = this.f219273b;
        return o6d0Var.mo44714T(iM28430i, iM28429h, nau.f152117a, new gh00() { // from class: p.sda
            @Override // p204p.gh00
            public final Object invoke(Object obj) {
                Integer numValueOf3;
                Integer numValueOf4;
                int iM72083N;
                s5o0 s5o0Var = (s5o0) obj;
                ArrayList arrayList6 = arrayList2;
                Integer numValueOf5 = null;
                if (!arrayList6.isEmpty()) {
                    numValueOf3 = Integer.valueOf(((t5o0) arrayList6.get(0)).f217322a);
                    int iM46714K2 = h6f.m46714K(arrayList6);
                    if (1 <= iM46714K2) {
                        int i6 = 1;
                        while (true) {
                            Integer numValueOf6 = Integer.valueOf(((t5o0) arrayList6.get(i6)).f217322a);
                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf6;
                            }
                            if (i6 == iM46714K2) {
                                break;
                            }
                            i6++;
                        }
                    }
                } else {
                    numValueOf3 = null;
                }
                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                int i7 = iM28430i;
                int iMax = Math.max(0, (i7 - iIntValue2) / 2);
                ArrayList arrayList7 = arrayList5;
                if (!arrayList7.isEmpty()) {
                    numValueOf4 = Integer.valueOf(((t5o0) arrayList7.get(0)).f217322a);
                    int iM46714K3 = h6f.m46714K(arrayList7);
                    if (1 <= iM46714K3) {
                        int i8 = 1;
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((t5o0) arrayList7.get(i8)).f217322a);
                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf7;
                            }
                            if (i8 == iM46714K3) {
                                break;
                            }
                            i8++;
                        }
                    }
                } else {
                    numValueOf4 = null;
                }
                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                if (!arrayList7.isEmpty()) {
                    numValueOf5 = Integer.valueOf(((t5o0) arrayList7.get(0)).f217323b);
                    int iM46714K4 = h6f.m46714K(arrayList7);
                    if (1 <= iM46714K4) {
                        int i9 = 1;
                        while (true) {
                            Integer numValueOf8 = Integer.valueOf(((t5o0) arrayList7.get(i9)).f217323b);
                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                numValueOf5 = numValueOf8;
                            }
                            if (i9 == iM46714K4) {
                                break;
                            }
                            i9++;
                        }
                    }
                }
                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                int i10 = (i7 - iIntValue3) / 2;
                int iOrdinal = wf11Var.m87922d().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iM72083N = iM28429h;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iM72083N = q3d0.m72083N(((Number) eh00Var.invoke()).floatValue());
                }
                int i11 = iM72083N - iIntValue4;
                ArrayList arrayList8 = arrayList4;
                int size5 = arrayList8.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    s5o0Var.m77294i((t5o0) arrayList8.get(i12), 0, iIntValue, 0.0f);
                }
                ArrayList arrayList9 = arrayList3;
                int size6 = arrayList9.size();
                for (int i13 = 0; i13 < size6; i13++) {
                    s5o0Var.m77294i((t5o0) arrayList9.get(i13), 0, 0, 0.0f);
                }
                int size7 = arrayList6.size();
                for (int i14 = 0; i14 < size7; i14++) {
                    s5o0Var.m77294i((t5o0) arrayList6.get(i14), iMax, 0, 0.0f);
                }
                int size8 = arrayList7.size();
                for (int i15 = 0; i15 < size8; i15++) {
                    s5o0Var.m77294i((t5o0) arrayList7.get(i15), i10, i11, 0.0f);
                }
                return w2a1.f247311a;
            }
        });
    }
}
