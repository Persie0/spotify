package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class dej {
    public static final vcj Companion = new vcj();

    /* JADX INFO: renamed from: l */
    public static final fr70[] f48096l = {null, null, null, q3d0.m72078I(2, ssh.f213607R0), q3d0.m72078I(2, ssh.f213608S0), q3d0.m72078I(2, ssh.f213609T0), q3d0.m72078I(2, ssh.f213610U0), null, null};

    /* JADX INFO: renamed from: a */
    public final long f48097a;

    /* JADX INFO: renamed from: b */
    public final long f48098b;

    /* JADX INFO: renamed from: c */
    public final long f48099c;

    /* JADX INFO: renamed from: d */
    public final List f48100d;

    /* JADX INFO: renamed from: e */
    public final List f48101e;

    /* JADX INFO: renamed from: f */
    public final List f48102f;

    /* JADX INFO: renamed from: g */
    public final List f48103g;

    /* JADX INFO: renamed from: h */
    public final Float f48104h;

    /* JADX INFO: renamed from: i */
    public final q6d0 f48105i;

    /* JADX INFO: renamed from: j */
    public final List f48106j;

    /* JADX INFO: renamed from: k */
    public final List f48107k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    public dej(int i, long j, long j2, long j3, List list, List list2, List list3, List list4, Float f, q6d0 q6d0Var) {
        ArrayList arrayList = null;
        if (71 != (i & 71)) {
            edo.m38617p(i, 71, ucj.f229071a.getDescriptor());
            throw null;
        }
        this.f48097a = j;
        this.f48098b = j2;
        this.f48099c = j3;
        if ((i & 8) == 0) {
            this.f48100d = null;
        } else {
            this.f48100d = list;
        }
        if ((i & 16) == 0) {
            this.f48101e = null;
        } else {
            this.f48101e = list2;
        }
        if ((i & 32) == 0) {
            this.f48102f = null;
        } else {
            this.f48102f = list3;
        }
        this.f48103g = list4;
        if ((i & 128) == 0) {
            this.f48104h = null;
        } else {
            this.f48104h = f;
        }
        if ((i & 256) == 0) {
            this.f48105i = null;
        } else {
            this.f48105i = q6d0Var;
        }
        List arrayList2 = this.f48101e;
        List list5 = lau.f131415a;
        if (arrayList2 == 0) {
            List list6 = this.f48100d;
            if (list6 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list6) {
                    if (((cmr0) obj).f39768c != null) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2 = new ArrayList(i6f.m49804T(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new k4c1((cmr0) it.next()));
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = list5;
            }
        }
        this.f48106j = arrayList2;
        List list7 = this.f48102f;
        if (list7 == null) {
            List list8 = this.f48100d;
            if (list8 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list8) {
                    if (((cmr0) obj2).f39773h != null) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList = new ArrayList(i6f.m49804T(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new w27((cmr0) it2.next()));
                }
            }
            if (arrayList != null) {
                list5 = arrayList;
            }
        } else {
            list5 = list7;
        }
        this.f48107k = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dej)) {
            return false;
        }
        dej dejVar = (dej) obj;
        return this.f48097a == dejVar.f48097a && this.f48098b == dejVar.f48098b && this.f48099c == dejVar.f48099c && wj50.m88271j(this.f48100d, dejVar.f48100d) && wj50.m88271j(this.f48101e, dejVar.f48101e) && wj50.m88271j(this.f48102f, dejVar.f48102f) && wj50.m88271j(this.f48103g, dejVar.f48103g) && wj50.m88271j(this.f48104h, dejVar.f48104h) && wj50.m88271j(this.f48105i, dejVar.f48105i);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(dq60.m36605e(Long.hashCode(this.f48097a) * 31, this.f48098b, 31), this.f48099c, 31);
        List list = this.f48100d;
        int iHashCode = (iM36605e + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f48101e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f48102f;
        int iM77244c = s571.m77244c((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.f48103g);
        Float f = this.f48104h;
        int iHashCode3 = (iM77244c + (f == null ? 0 : f.hashCode())) * 31;
        q6d0 q6d0Var = this.f48105i;
        return iHashCode3 + (q6d0Var != null ? q6d0Var.hashCode() : 0);
    }
}
