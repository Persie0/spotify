package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class qm31 {

    /* JADX INFO: renamed from: a */
    public final List f190029a;

    /* JADX INFO: renamed from: b */
    public final int f190030b;

    /* JADX INFO: renamed from: c */
    public final String f190031c;

    /* JADX INFO: renamed from: d */
    public final String f190032d;

    /* JADX INFO: renamed from: e */
    public final String f190033e;

    /* JADX INFO: renamed from: f */
    public final boolean f190034f;

    public /* synthetic */ qm31() {
        this(0, "", null, "", lau.f131415a, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm31)) {
            return false;
        }
        qm31 qm31Var = (qm31) obj;
        return wj50.m88271j(this.f190029a, qm31Var.f190029a) && this.f190030b == qm31Var.f190030b && wj50.m88271j(this.f190031c, qm31Var.f190031c) && wj50.m88271j(this.f190032d, qm31Var.f190032d) && wj50.m88271j(this.f190033e, qm31Var.f190033e) && this.f190034f == qm31Var.f190034f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f190030b, this.f190029a.hashCode() * 31, 31), 31, this.f190031c);
        String str = this.f190032d;
        return Boolean.hashCode(this.f190034f) + s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f190033e);
    }

    public qm31(int i, String str, String str2, String str3, List list, boolean z) {
        this.f190029a = list;
        this.f190030b = i;
        this.f190031c = str;
        this.f190032d = str2;
        this.f190033e = str3;
        this.f190034f = z;
    }
}
