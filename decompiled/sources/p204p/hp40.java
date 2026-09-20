package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hp40 implements jp40 {

    /* JADX INFO: renamed from: a */
    public final String f93698a;

    /* JADX INFO: renamed from: b */
    public final String f93699b;

    public hp40(String str, String str2) {
        this.f93698a = str;
        this.f93699b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp40)) {
            return false;
        }
        hp40 hp40Var = (hp40) obj;
        return wj50.m88271j(this.f93698a, hp40Var.f93698a) && wj50.m88271j(this.f93699b, hp40Var.f93699b);
    }

    public final int hashCode() {
        return this.f93699b.hashCode() + (this.f93698a.hashCode() * 31);
    }
}
