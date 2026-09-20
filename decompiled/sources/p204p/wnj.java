package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wnj extends eoj {

    /* JADX INFO: renamed from: a */
    public final List f253190a;

    /* JADX INFO: renamed from: b */
    public final boolean f253191b;

    /* JADX INFO: renamed from: c */
    public final String f253192c;

    /* JADX INFO: renamed from: d */
    public final String f253193d;

    /* JADX INFO: renamed from: e */
    public final boolean f253194e;

    /* JADX INFO: renamed from: f */
    public final boolean f253195f;

    public wnj(List list, boolean z, String str, String str2, boolean z2, boolean z3) {
        this.f253190a = list;
        this.f253191b = z;
        this.f253192c = str;
        this.f253193d = str2;
        this.f253194e = z2;
        this.f253195f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnj)) {
            return false;
        }
        wnj wnjVar = (wnj) obj;
        return wj50.m88271j(this.f253190a, wnjVar.f253190a) && this.f253191b == wnjVar.f253191b && wj50.m88271j(this.f253192c, wnjVar.f253192c) && wj50.m88271j(this.f253193d, wnjVar.f253193d) && this.f253194e == wnjVar.f253194e && this.f253195f == wnjVar.f253195f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(this.f253190a.hashCode() * 31, 31, this.f253191b), 31, this.f253192c);
        String str = this.f253193d;
        return Boolean.hashCode(this.f253195f) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f253194e);
    }
}
