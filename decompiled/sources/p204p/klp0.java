package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class klp0 {

    /* JADX INFO: renamed from: a */
    public final String f123936a;

    /* JADX INFO: renamed from: b */
    public final String f123937b;

    /* JADX INFO: renamed from: c */
    public final String f123938c;

    /* JADX INFO: renamed from: d */
    public final boolean f123939d;

    public klp0(String str, String str2, String str3, boolean z) {
        this.f123936a = str;
        this.f123937b = str2;
        this.f123938c = str3;
        this.f123939d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klp0)) {
            return false;
        }
        klp0 klp0Var = (klp0) obj;
        return wj50.m88271j(this.f123936a, klp0Var.f123936a) && wj50.m88271j(this.f123937b, klp0Var.f123937b) && wj50.m88271j(this.f123938c, klp0Var.f123938c) && this.f123939d == klp0Var.f123939d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f123939d) + s571.m77243b(s571.m77243b(this.f123936a.hashCode() * 31, 31, this.f123937b), 31, this.f123938c);
    }
}
