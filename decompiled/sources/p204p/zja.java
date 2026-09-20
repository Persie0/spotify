package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zja {

    /* JADX INFO: renamed from: a */
    public final String f283404a;

    /* JADX INFO: renamed from: b */
    public final String f283405b;

    public zja(String str, String str2) {
        this.f283404a = str;
        this.f283405b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zja)) {
            return false;
        }
        zja zjaVar = (zja) obj;
        return wj50.m88271j(this.f283404a, zjaVar.f283404a) && wj50.m88271j(this.f283405b, zjaVar.f283405b);
    }

    public final int hashCode() {
        return this.f283405b.hashCode() + (this.f283404a.hashCode() * 31);
    }
}
