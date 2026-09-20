package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d0z {

    /* JADX INFO: renamed from: a */
    public final String f44107a;

    /* JADX INFO: renamed from: b */
    public final String f44108b;

    /* JADX INFO: renamed from: c */
    public final boolean f44109c;

    /* JADX INFO: renamed from: d */
    public final int f44110d;

    public d0z(String str, String str2, boolean z, int i) {
        this.f44107a = str;
        this.f44108b = str2;
        this.f44109c = z;
        this.f44110d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0z)) {
            return false;
        }
        d0z d0zVar = (d0z) obj;
        return wj50.m88271j(this.f44107a, d0zVar.f44107a) && wj50.m88271j(this.f44108b, d0zVar.f44108b) && this.f44109c == d0zVar.f44109c && this.f44110d == d0zVar.f44110d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44110d) + s571.m77245d(s571.m77243b(this.f44107a.hashCode() * 31, 31, this.f44108b), 31, this.f44109c);
    }
}
