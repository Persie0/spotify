package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hlb implements mlb {

    /* JADX INFO: renamed from: a */
    public final String f92663a;

    /* JADX INFO: renamed from: b */
    public final String f92664b;

    public hlb(String str, String str2) {
        this.f92663a = str;
        this.f92664b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m47875a() {
        return this.f92664b;
    }

    /* JADX INFO: renamed from: b */
    public final String m47876b() {
        return this.f92663a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlb)) {
            return false;
        }
        hlb hlbVar = (hlb) obj;
        return wj50.m88271j(this.f92663a, hlbVar.f92663a) && wj50.m88271j(this.f92664b, hlbVar.f92664b);
    }

    public final int hashCode() {
        return this.f92664b.hashCode() + (this.f92663a.hashCode() * 31);
    }
}
