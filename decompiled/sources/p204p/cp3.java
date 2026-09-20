package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cp3 extends kp20 {

    /* JADX INFO: renamed from: a */
    public final String f40413a;

    /* JADX INFO: renamed from: b */
    public final String f40414b;

    /* JADX INFO: renamed from: c */
    public final String f40415c;

    public cp3(String str, String str2, String str3) {
        this.f40413a = str;
        this.f40414b = str2;
        this.f40415c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp3)) {
            return false;
        }
        cp3 cp3Var = (cp3) obj;
        return wj50.m88271j(this.f40413a, cp3Var.f40413a) && wj50.m88271j(this.f40414b, cp3Var.f40414b) && wj50.m88271j(this.f40415c, cp3Var.f40415c);
    }

    public final int hashCode() {
        return this.f40415c.hashCode() + s571.m77243b(this.f40413a.hashCode() * 31, 31, this.f40414b);
    }
}
