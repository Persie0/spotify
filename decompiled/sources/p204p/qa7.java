package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qa7 implements ta7 {

    /* JADX INFO: renamed from: a */
    public final String f186766a;

    /* JADX INFO: renamed from: b */
    public final String f186767b;

    /* JADX INFO: renamed from: c */
    public final String f186768c;

    /* JADX INFO: renamed from: d */
    public final String f186769d;

    /* JADX INFO: renamed from: e */
    public final String f186770e;

    /* JADX INFO: renamed from: f */
    public final String f186771f;

    public qa7(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f186766a = str;
        this.f186767b = str2;
        this.f186768c = str3;
        this.f186769d = str4;
        this.f186770e = str5;
        this.f186771f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa7)) {
            return false;
        }
        qa7 qa7Var = (qa7) obj;
        return wj50.m88271j(this.f186766a, qa7Var.f186766a) && wj50.m88271j(this.f186767b, qa7Var.f186767b) && wj50.m88271j(this.f186768c, qa7Var.f186768c) && wj50.m88271j(this.f186769d, qa7Var.f186769d) && wj50.m88271j(this.f186770e, qa7Var.f186770e) && wj50.m88271j(this.f186771f, qa7Var.f186771f);
    }

    public final int hashCode() {
        return this.f186771f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f186766a.hashCode() * 31, 31, this.f186767b), 31, this.f186768c), 31, this.f186769d), 31, this.f186770e);
    }
}
