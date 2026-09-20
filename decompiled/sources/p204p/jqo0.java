package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jqo0 {

    /* JADX INFO: renamed from: a */
    public final String f114936a;

    /* JADX INFO: renamed from: b */
    public final String f114937b;

    /* JADX INFO: renamed from: c */
    public final String f114938c;

    /* JADX INFO: renamed from: d */
    public final String f114939d;

    public jqo0(String str, String str2, String str3, String str4) {
        this.f114936a = str;
        this.f114937b = str2;
        this.f114938c = str3;
        this.f114939d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqo0)) {
            return false;
        }
        jqo0 jqo0Var = (jqo0) obj;
        return wj50.m88271j(this.f114936a, jqo0Var.f114936a) && wj50.m88271j(this.f114937b, jqo0Var.f114937b) && wj50.m88271j(this.f114938c, jqo0Var.f114938c) && wj50.m88271j(this.f114939d, jqo0Var.f114939d);
    }

    public final int hashCode() {
        return this.f114939d.hashCode() + s571.m77243b(s571.m77243b(this.f114936a.hashCode() * 31, 31, this.f114937b), 31, this.f114938c);
    }
}
