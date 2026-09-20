package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cea1 {

    /* JADX INFO: renamed from: a */
    public final String f37069a;

    /* JADX INFO: renamed from: b */
    public final String f37070b;

    /* JADX INFO: renamed from: c */
    public final String f37071c;

    /* JADX INFO: renamed from: d */
    public final String f37072d;

    public cea1(String str, String str2, String str3, String str4) {
        this.f37069a = str;
        this.f37070b = str2;
        this.f37071c = str3;
        this.f37072d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cea1)) {
            return false;
        }
        cea1 cea1Var = (cea1) obj;
        return wj50.m88271j(this.f37069a, cea1Var.f37069a) && wj50.m88271j(this.f37070b, cea1Var.f37070b) && wj50.m88271j(this.f37071c, cea1Var.f37071c) && wj50.m88271j(this.f37072d, cea1Var.f37072d);
    }

    public final int hashCode() {
        return this.f37072d.hashCode() + s571.m77243b(s571.m77243b(this.f37069a.hashCode() * 31, 31, this.f37070b), 31, this.f37071c);
    }
}
