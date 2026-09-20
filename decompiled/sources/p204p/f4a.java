package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f4a implements g4a {

    /* JADX INFO: renamed from: a */
    public final String f65713a;

    /* JADX INFO: renamed from: b */
    public final String f65714b;

    /* JADX INFO: renamed from: c */
    public final String f65715c;

    /* JADX INFO: renamed from: d */
    public final int f65716d;

    public f4a(String str, String str2, int i, String str3) {
        this.f65713a = str;
        this.f65714b = str2;
        this.f65715c = str3;
        this.f65716d = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m40722a() {
        return this.f65714b;
    }

    /* JADX INFO: renamed from: b */
    public final String m40723b() {
        return this.f65713a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4a)) {
            return false;
        }
        f4a f4aVar = (f4a) obj;
        return wj50.m88271j(this.f65713a, f4aVar.f65713a) && wj50.m88271j(this.f65714b, f4aVar.f65714b) && wj50.m88271j(this.f65715c, f4aVar.f65715c) && this.f65716d == f4aVar.f65716d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f65713a.hashCode() * 31, 31, this.f65714b);
        String str = this.f65715c;
        return edb.m38547C(this.f65716d) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
