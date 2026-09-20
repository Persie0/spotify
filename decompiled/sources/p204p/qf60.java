package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class qf60 {
    public static final pf60 Companion = new pf60();

    /* JADX INFO: renamed from: g */
    public static final fr70[] f188124g = {null, null, null, q3d0.m72078I(2, wv30.f255366T0), null, q3d0.m72078I(2, wv30.f255367U0)};

    /* JADX INFO: renamed from: a */
    public final String f188125a;

    /* JADX INFO: renamed from: b */
    public final String f188126b;

    /* JADX INFO: renamed from: c */
    public final String f188127c;

    /* JADX INFO: renamed from: d */
    public final List f188128d;

    /* JADX INFO: renamed from: e */
    public final String f188129e;

    /* JADX INFO: renamed from: f */
    public final List f188130f;

    public /* synthetic */ qf60(int i, String str, String str2, String str3, List list, String str4, List list2) {
        if (15 != (i & 15)) {
            edo.m38617p(i, 15, of60.f164655a.getDescriptor());
            throw null;
        }
        this.f188125a = str;
        this.f188126b = str2;
        this.f188127c = str3;
        this.f188128d = list;
        if ((i & 16) == 0) {
            this.f188129e = null;
        } else {
            this.f188129e = str4;
        }
        if ((i & 32) == 0) {
            this.f188130f = null;
        } else {
            this.f188130f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf60)) {
            return false;
        }
        qf60 qf60Var = (qf60) obj;
        return wj50.m88271j(this.f188125a, qf60Var.f188125a) && wj50.m88271j(this.f188126b, qf60Var.f188126b) && wj50.m88271j(this.f188127c, qf60Var.f188127c) && wj50.m88271j(this.f188128d, qf60Var.f188128d) && wj50.m88271j(this.f188129e, qf60Var.f188129e) && wj50.m88271j(this.f188130f, qf60Var.f188130f);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f188125a.hashCode() * 31, 31, this.f188126b), 31, this.f188127c), 31, this.f188128d);
        String str = this.f188129e;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f188130f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public qf60(String str, String str2, String str3, List list, List list2) {
        this.f188125a = str;
        this.f188126b = str2;
        this.f188127c = "AND";
        this.f188128d = list;
        this.f188129e = str3;
        this.f188130f = list2;
    }
}
