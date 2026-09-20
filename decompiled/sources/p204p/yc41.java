package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class yc41 {
    public static final xc41 Companion = new xc41();

    /* JADX INFO: renamed from: m */
    public static final fr70[] f271378m = {q3d0.m72078I(2, st31.f213801t), null, null, null, null, q3d0.m72078I(2, st31.f213784X), q3d0.m72078I(2, st31.f213786Y), q3d0.m72078I(2, st31.f213788Z), null, null, null};

    /* JADX INFO: renamed from: a */
    public final List f271379a;

    /* JADX INFO: renamed from: b */
    public final long f271380b;

    /* JADX INFO: renamed from: c */
    public final long f271381c;

    /* JADX INFO: renamed from: d */
    public final String f271382d;

    /* JADX INFO: renamed from: e */
    public final String f271383e;

    /* JADX INFO: renamed from: f */
    public final List f271384f;

    /* JADX INFO: renamed from: g */
    public final List f271385g;

    /* JADX INFO: renamed from: h */
    public final List f271386h;

    /* JADX INFO: renamed from: i */
    public final String f271387i;

    /* JADX INFO: renamed from: j */
    public final kdz0 f271388j;

    /* JADX INFO: renamed from: k */
    public final mx51 f271389k;

    /* JADX INFO: renamed from: l */
    public final mx51 f271390l;

    public /* synthetic */ yc41(int i, List list, long j, long j2, String str, String str2, List list2, List list3, List list4, String str3, kdz0 kdz0Var, mx51 mx51Var) {
        List<String> list5;
        String str4;
        mx51 mx51Var2 = null;
        if (63 != (i & 63)) {
            edo.m38617p(i, 63, wc41.f249953a.getDescriptor());
            throw null;
        }
        this.f271379a = list;
        this.f271380b = j;
        this.f271381c = j2;
        this.f271382d = str;
        this.f271383e = str2;
        this.f271384f = list2;
        if ((i & 64) == 0) {
            this.f271385g = null;
        } else {
            this.f271385g = list3;
        }
        if ((i & 128) == 0) {
            this.f271386h = null;
        } else {
            this.f271386h = list4;
        }
        if ((i & 256) == 0) {
            this.f271387i = null;
        } else {
            this.f271387i = str3;
        }
        if ((i & 512) == 0) {
            this.f271388j = null;
        } else {
            this.f271388j = kdz0Var;
        }
        if ((i & 1024) == 0) {
            this.f271389k = null;
        } else {
            this.f271389k = mx51Var;
        }
        mx51 mx51Var3 = this.f271389k;
        if (mx51Var3 == null) {
            List list6 = this.f271385g;
            if (list6 != null && (list5 = this.f271386h) != null && (str4 = this.f271387i) != null) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(list5, 10));
                for (String str5 : list5) {
                    arrayList.add(new ix51(bm51.m29801l0(str4, "{{language_code}}", str5), wl51.m88470T0(str5, "-x-cc"), bm51.m29796g0(str5, "-x-cc", false)));
                }
                mx51Var2 = new mx51(arrayList, list6);
            }
            mx51Var3 = mx51Var2;
        }
        this.f271390l = mx51Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc41)) {
            return false;
        }
        yc41 yc41Var = (yc41) obj;
        return wj50.m88271j(this.f271379a, yc41Var.f271379a) && this.f271380b == yc41Var.f271380b && this.f271381c == yc41Var.f271381c && wj50.m88271j(this.f271382d, yc41Var.f271382d) && wj50.m88271j(this.f271383e, yc41Var.f271383e) && wj50.m88271j(this.f271384f, yc41Var.f271384f) && wj50.m88271j(this.f271385g, yc41Var.f271385g) && wj50.m88271j(this.f271386h, yc41Var.f271386h) && wj50.m88271j(this.f271387i, yc41Var.f271387i) && wj50.m88271j(this.f271388j, yc41Var.f271388j) && wj50.m88271j(this.f271389k, yc41Var.f271389k);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(dq60.m36605e(dq60.m36605e(this.f271379a.hashCode() * 31, this.f271380b, 31), this.f271381c, 31), 31, this.f271382d), 31, this.f271383e), 31, this.f271384f);
        List list = this.f271385g;
        int iHashCode = (iM77244c + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f271386h;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f271387i;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        kdz0 kdz0Var = this.f271388j;
        int iHashCode4 = (iHashCode3 + (kdz0Var == null ? 0 : kdz0Var.hashCode())) * 31;
        mx51 mx51Var = this.f271389k;
        return iHashCode4 + (mx51Var != null ? mx51Var.hashCode() : 0);
    }
}
