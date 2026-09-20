package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p5b {

    /* JADX INFO: renamed from: a */
    public final List f174132a;

    /* JADX INFO: renamed from: b */
    public final int f174133b;

    public p5b(int i, List list) {
        this.f174132a = list;
        this.f174133b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5b)) {
            return false;
        }
        p5b p5bVar = (p5b) obj;
        return wj50.m88271j(this.f174132a, p5bVar.f174132a) && this.f174133b == p5bVar.f174133b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174133b) + (this.f174132a.hashCode() * 31);
    }
}
