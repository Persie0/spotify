package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b7z {

    /* JADX INFO: renamed from: a */
    public final List f24439a;

    /* JADX INFO: renamed from: b */
    public final List f24440b;

    public b7z(List list, List list2) {
        this.f24439a = list;
        this.f24440b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7z)) {
            return false;
        }
        b7z b7zVar = (b7z) obj;
        return wj50.m88271j(this.f24439a, b7zVar.f24439a) && wj50.m88271j(this.f24440b, b7zVar.f24440b);
    }

    public final int hashCode() {
        return this.f24440b.hashCode() + (this.f24439a.hashCode() * 31);
    }
}
