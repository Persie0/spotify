package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class fzh {

    /* JADX INFO: renamed from: a */
    public final String f75017a;

    /* JADX INFO: renamed from: b */
    public final String f75018b;

    /* JADX INFO: renamed from: c */
    public final String f75019c;

    /* JADX INFO: renamed from: d */
    public final boolean f75020d;

    /* JADX INFO: renamed from: e */
    public final List f75021e;

    /* JADX INFO: renamed from: f */
    public final boolean f75022f;

    /* JADX INFO: renamed from: g */
    public final boolean f75023g;

    public fzh(String str, String str2, String str3, boolean z, List list, boolean z2, boolean z3) {
        this.f75017a = str;
        this.f75018b = str2;
        this.f75019c = str3;
        this.f75020d = z;
        this.f75021e = list;
        this.f75022f = z2;
        this.f75023g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzh)) {
            return false;
        }
        fzh fzhVar = (fzh) obj;
        return wj50.m88271j(this.f75017a, fzhVar.f75017a) && wj50.m88271j(this.f75018b, fzhVar.f75018b) && wj50.m88271j(this.f75019c, fzhVar.f75019c) && this.f75020d == fzhVar.f75020d && wj50.m88271j(this.f75021e, fzhVar.f75021e) && this.f75022f == fzhVar.f75022f && this.f75023g == fzhVar.f75023g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75023g) + s571.m77245d(s571.m77244c(s571.m77245d(s571.m77243b(s571.m77243b(this.f75017a.hashCode() * 31, 31, this.f75018b), 31, this.f75019c), 31, this.f75020d), 31, this.f75021e), 31, this.f75022f);
    }
}
