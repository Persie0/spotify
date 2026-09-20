package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uku {

    /* JADX INFO: renamed from: a */
    public final String f231367a;

    /* JADX INFO: renamed from: b */
    public final String f231368b;

    /* JADX INFO: renamed from: c */
    public final String f231369c;

    /* JADX INFO: renamed from: d */
    public final long f231370d;

    public uku(int i, long j, String str, String str2, String str3) {
        this((i & 8) != 0 ? n6f.f150871k : j, str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX INFO: renamed from: a */
    public final long m83341a() {
        return this.f231370d;
    }

    /* JADX INFO: renamed from: b */
    public final String m83342b() {
        return this.f231369c;
    }

    /* JADX INFO: renamed from: c */
    public final String m83343c() {
        return this.f231367a;
    }

    /* JADX INFO: renamed from: d */
    public final String m83344d() {
        return this.f231368b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uku)) {
            return false;
        }
        uku ukuVar = (uku) obj;
        if (!wj50.m88271j(this.f231367a, ukuVar.f231367a) || !wj50.m88271j(this.f231368b, ukuVar.f231368b) || !wj50.m88271j(this.f231369c, ukuVar.f231369c)) {
            return false;
        }
        long j = ukuVar.f231370d;
        int i = n6f.f150872l;
        return as91.m27074b(this.f231370d, j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f231367a.hashCode() * 31, 31, this.f231368b), 31, this.f231369c);
        int i = n6f.f150872l;
        return Long.hashCode(this.f231370d) + iM77243b;
    }

    public uku(long j, String str, String str2, String str3) {
        this.f231367a = str;
        this.f231368b = str2;
        this.f231369c = str3;
        this.f231370d = j;
    }
}
