package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f781 {

    /* JADX INFO: renamed from: a */
    public final String f66591a;

    /* JADX INFO: renamed from: b */
    public final String f66592b;

    /* JADX INFO: renamed from: c */
    public final String f66593c;

    public f781(String str, String str2, String str3) {
        this.f66591a = str;
        this.f66592b = str2;
        this.f66593c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f781)) {
            return false;
        }
        f781 f781Var = (f781) obj;
        return wj50.m88271j(this.f66591a, f781Var.f66591a) && wj50.m88271j(this.f66592b, f781Var.f66592b) && wj50.m88271j(this.f66593c, f781Var.f66593c);
    }

    public final int hashCode() {
        return this.f66593c.hashCode() + s571.m77243b(this.f66591a.hashCode() * 31, 31, this.f66592b);
    }
}
