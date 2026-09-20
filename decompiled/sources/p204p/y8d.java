package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class y8d implements lad {

    /* JADX INFO: renamed from: a */
    public final List f270282a;

    /* JADX INFO: renamed from: b */
    public final long f270283b;

    public y8d(long j, List list) {
        this.f270282a = list;
        this.f270283b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8d)) {
            return false;
        }
        y8d y8dVar = (y8d) obj;
        return wj50.m88271j(this.f270282a, y8dVar.f270282a) && this.f270283b == y8dVar.f270283b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f270283b) + (this.f270282a.hashCode() * 31);
    }
}
