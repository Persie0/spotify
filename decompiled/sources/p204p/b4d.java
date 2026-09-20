package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f23305a;

    /* JADX INFO: renamed from: b */
    public final String f23306b;

    /* JADX INFO: renamed from: c */
    public final boolean f23307c;

    public b4d(String str, String str2, boolean z) {
        this.f23305a = str;
        this.f23306b = str2;
        this.f23307c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4d)) {
            return false;
        }
        b4d b4dVar = (b4d) obj;
        return wj50.m88271j(this.f23305a, b4dVar.f23305a) && wj50.m88271j(this.f23306b, b4dVar.f23306b) && this.f23307c == b4dVar.f23307c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23307c) + s571.m77243b(this.f23305a.hashCode() * 31, 31, this.f23306b);
    }
}
