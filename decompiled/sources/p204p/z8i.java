package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class z8i {

    /* JADX INFO: renamed from: a */
    public final String f280481a;

    /* JADX INFO: renamed from: b */
    public final boolean f280482b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f280483c;

    public z8i(String str, ArrayList arrayList, boolean z) {
        this.f280481a = str;
        this.f280482b = z;
        this.f280483c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8i)) {
            return false;
        }
        z8i z8iVar = (z8i) obj;
        return wj50.m88271j(this.f280481a, z8iVar.f280481a) && this.f280482b == z8iVar.f280482b && this.f280483c.equals(z8iVar.f280483c);
    }

    public final int hashCode() {
        return this.f280483c.hashCode() + s571.m77245d(this.f280481a.hashCode() * 31, 31, this.f280482b);
    }
}
