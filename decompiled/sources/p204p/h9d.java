package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f88922a;

    /* JADX INFO: renamed from: b */
    public final String f88923b;

    /* JADX INFO: renamed from: c */
    public final long f88924c;

    public h9d(String str, String str2, long j) {
        this.f88922a = str;
        this.f88923b = str2;
        this.f88924c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9d)) {
            return false;
        }
        h9d h9dVar = (h9d) obj;
        return wj50.m88271j(this.f88922a, h9dVar.f88922a) && wj50.m88271j(this.f88923b, h9dVar.f88923b) && this.f88924c == h9dVar.f88924c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88924c) + s571.m77243b(this.f88922a.hashCode() * 31, 31, this.f88923b);
    }
}
