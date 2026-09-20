package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zkl {

    /* JADX INFO: renamed from: a */
    public final String f283779a;

    /* JADX INFO: renamed from: b */
    public final List f283780b;

    public zkl(String str, List list) {
        this.f283779a = str;
        this.f283780b = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m96327a() {
        return this.f283780b;
    }

    /* JADX INFO: renamed from: b */
    public final String m96328b() {
        return this.f283779a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkl)) {
            return false;
        }
        zkl zklVar = (zkl) obj;
        return wj50.m88271j(this.f283779a, zklVar.f283779a) && wj50.m88271j(this.f283780b, zklVar.f283780b);
    }

    public final int hashCode() {
        return this.f283780b.hashCode() + (this.f283779a.hashCode() * 31);
    }
}
