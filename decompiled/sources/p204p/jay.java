package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class jay {

    /* JADX INFO: renamed from: a */
    public final HashMap f110567a;

    /* JADX INFO: renamed from: b */
    public final boolean f110568b;

    /* JADX INFO: renamed from: c */
    public final boolean f110569c;

    public jay(HashMap map, boolean z, boolean z2) {
        this.f110567a = map;
        this.f110568b = z;
        this.f110569c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jay)) {
            return false;
        }
        jay jayVar = (jay) obj;
        return this.f110567a.equals(jayVar.f110567a) && this.f110568b == jayVar.f110568b && this.f110569c == jayVar.f110569c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110569c) + s571.m77245d(this.f110567a.hashCode() * 31, 31, this.f110568b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.f110567a);
        sb.append(", containsInheritedStatics=");
        sb.append(this.f110568b);
        sb.append(", containsPackagePrivate=");
        return s571.m77253l(sb, this.f110569c, ')');
    }
}
