package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m9l implements o9l {

    /* JADX INFO: renamed from: a */
    public final boolean f141327a;

    /* JADX INFO: renamed from: b */
    public final f8l f141328b;

    /* JADX INFO: renamed from: c */
    public final boolean f141329c;

    public m9l(boolean z, f8l f8lVar, boolean z2) {
        this.f141327a = z;
        this.f141328b = f8lVar;
        this.f141329c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9l)) {
            return false;
        }
        m9l m9lVar = (m9l) obj;
        return this.f141327a == m9lVar.f141327a && this.f141328b == m9lVar.f141328b && this.f141329c == m9lVar.f141329c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141329c) + ((this.f141328b.hashCode() + (Boolean.hashCode(this.f141327a) * 31)) * 31);
    }
}
