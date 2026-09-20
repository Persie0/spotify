package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zlu {

    /* JADX INFO: renamed from: a */
    public final List f284078a;

    /* JADX INFO: renamed from: b */
    public final ylu f284079b;

    /* JADX INFO: renamed from: c */
    public final boolean f284080c;

    /* JADX INFO: renamed from: d */
    public final boolean f284081d;

    public zlu(List list, ylu yluVar, boolean z, int i) {
        boolean z2 = (i & 8) == 0;
        z = (i & 16) != 0 ? false : z;
        this.f284078a = list;
        this.f284079b = yluVar;
        this.f284080c = z2;
        this.f284081d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlu)) {
            return false;
        }
        zlu zluVar = (zlu) obj;
        return wj50.m88271j(this.f284078a, zluVar.f284078a) && wj50.m88271j(this.f284079b, zluVar.f284079b) && this.f284080c == zluVar.f284080c && this.f284081d == zluVar.f284081d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(s571.m77245d((this.f284079b.hashCode() + (this.f284078a.hashCode() * 31)) * 961, 31, this.f284080c), 31, this.f284081d);
    }
}
