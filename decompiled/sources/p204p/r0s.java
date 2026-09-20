package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class r0s {

    /* JADX INFO: renamed from: i */
    public static final r0s f194552i = new r0s("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: j */
    public static final r0s f194553j = new r0s("English", "DJ X", "en-US-x", "Your DJ X here. What can I play for you?", "Let DJ pick", "English", "We've got DJ X coming up next.", "Switch to English");

    /* JADX INFO: renamed from: a */
    public final String f194554a;

    /* JADX INFO: renamed from: b */
    public final String f194555b;

    /* JADX INFO: renamed from: c */
    public final String f194556c;

    /* JADX INFO: renamed from: d */
    public final String f194557d;

    /* JADX INFO: renamed from: e */
    public final String f194558e;

    /* JADX INFO: renamed from: f */
    public final String f194559f;

    /* JADX INFO: renamed from: g */
    public final String f194560g;

    /* JADX INFO: renamed from: h */
    public final String f194561h;

    public r0s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f194554a = str;
        this.f194555b = str2;
        this.f194556c = str3;
        this.f194557d = str4;
        this.f194558e = str5;
        this.f194559f = str6;
        this.f194560g = str7;
        this.f194561h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0s)) {
            return false;
        }
        r0s r0sVar = (r0s) obj;
        return wj50.m88271j(this.f194554a, r0sVar.f194554a) && wj50.m88271j(this.f194555b, r0sVar.f194555b) && wj50.m88271j(this.f194556c, r0sVar.f194556c) && wj50.m88271j(this.f194557d, r0sVar.f194557d) && wj50.m88271j(this.f194558e, r0sVar.f194558e) && wj50.m88271j(this.f194559f, r0sVar.f194559f) && wj50.m88271j(this.f194560g, r0sVar.f194560g) && wj50.m88271j(this.f194561h, r0sVar.f194561h);
    }

    public final int hashCode() {
        return this.f194561h.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f194554a.hashCode() * 31, 31, this.f194555b), 31, this.f194556c), 31, this.f194557d), 31, this.f194558e), 31, this.f194559f), 31, this.f194560g);
    }
}
