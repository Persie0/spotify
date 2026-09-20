package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m5e0 {

    /* JADX INFO: renamed from: a */
    public final String f140195a;

    /* JADX INFO: renamed from: b */
    public final String f140196b;

    /* JADX INFO: renamed from: c */
    public final String f140197c;

    /* JADX INFO: renamed from: d */
    public final String f140198d;

    public m5e0(String str, String str2, String str3, String str4) {
        this.f140195a = str;
        this.f140196b = str2;
        this.f140197c = str3;
        this.f140198d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5e0)) {
            return false;
        }
        m5e0 m5e0Var = (m5e0) obj;
        return wj50.m88271j(this.f140195a, m5e0Var.f140195a) && wj50.m88271j(this.f140196b, m5e0Var.f140196b) && wj50.m88271j(this.f140197c, m5e0Var.f140197c) && wj50.m88271j(this.f140198d, m5e0Var.f140198d);
    }

    public final int hashCode() {
        return this.f140198d.hashCode() + s571.m77243b(s571.m77243b(this.f140195a.hashCode() * 31, 31, this.f140196b), 31, this.f140197c);
    }
}
