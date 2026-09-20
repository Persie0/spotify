package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v8b {

    /* JADX INFO: renamed from: a */
    public final String f238455a;

    /* JADX INFO: renamed from: b */
    public final String f238456b;

    /* JADX INFO: renamed from: c */
    public final String f238457c;

    /* JADX INFO: renamed from: d */
    public final String f238458d;

    /* JADX INFO: renamed from: e */
    public final String f238459e;

    public v8b(String str, String str2, String str3, String str4, String str5) {
        this.f238455a = str;
        this.f238456b = str2;
        this.f238457c = str3;
        this.f238458d = str4;
        this.f238459e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8b)) {
            return false;
        }
        v8b v8bVar = (v8b) obj;
        return wj50.m88271j(this.f238455a, v8bVar.f238455a) && wj50.m88271j(this.f238456b, v8bVar.f238456b) && wj50.m88271j(this.f238457c, v8bVar.f238457c) && wj50.m88271j(this.f238458d, v8bVar.f238458d) && wj50.m88271j(this.f238459e, v8bVar.f238459e);
    }

    public final int hashCode() {
        return this.f238459e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f238455a.hashCode() * 31, 31, this.f238456b), 31, this.f238457c), 31, this.f238458d);
    }
}
