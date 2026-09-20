package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class law {

    /* JADX INFO: renamed from: a */
    public final String f131433a;

    /* JADX INFO: renamed from: b */
    public final String f131434b;

    /* JADX INFO: renamed from: c */
    public final boolean f131435c;

    /* JADX INFO: renamed from: d */
    public final String f131436d;

    /* JADX INFO: renamed from: e */
    public final boolean f131437e;

    /* JADX INFO: renamed from: f */
    public final String f131438f;

    public law(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f131433a = str;
        this.f131434b = str2;
        this.f131435c = z;
        this.f131436d = str3;
        this.f131437e = z2;
        this.f131438f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof law)) {
            return false;
        }
        law lawVar = (law) obj;
        return wj50.m88271j(this.f131433a, lawVar.f131433a) && wj50.m88271j(this.f131434b, lawVar.f131434b) && this.f131435c == lawVar.f131435c && wj50.m88271j(this.f131436d, lawVar.f131436d) && this.f131437e == lawVar.f131437e && wj50.m88271j(this.f131438f, lawVar.f131438f);
    }

    public final int hashCode() {
        return this.f131438f.hashCode() + s571.m77245d(s571.m77243b(s571.m77245d(s571.m77243b(this.f131433a.hashCode() * 31, 31, this.f131434b), 31, this.f131435c), 31, this.f131436d), 31, this.f131437e);
    }
}
