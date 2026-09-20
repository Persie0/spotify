package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v9b {

    /* JADX INFO: renamed from: a */
    public final int f238896a;

    /* JADX INFO: renamed from: b */
    public final String f238897b;

    /* JADX INFO: renamed from: c */
    public final String f238898c;

    /* JADX INFO: renamed from: d */
    public final String f238899d;

    /* JADX INFO: renamed from: e */
    public final String f238900e;

    public v9b(int i, String str, String str2, String str3, String str4) {
        this.f238896a = i;
        this.f238897b = str;
        this.f238898c = str2;
        this.f238899d = str3;
        this.f238900e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9b)) {
            return false;
        }
        v9b v9bVar = (v9b) obj;
        return this.f238896a == v9bVar.f238896a && this.f238897b.equals(v9bVar.f238897b) && this.f238898c.equals(v9bVar.f238898c) && this.f238899d.equals(v9bVar.f238899d) && this.f238900e.equals(v9bVar.f238900e);
    }

    public final int hashCode() {
        return this.f238900e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(edb.m38547C(this.f238896a) * 31, 31, this.f238897b), 31, this.f238898c), 31, this.f238899d);
    }
}
