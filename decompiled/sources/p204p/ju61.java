package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ju61 {

    /* JADX INFO: renamed from: a */
    public final String f116038a;

    /* JADX INFO: renamed from: b */
    public final String f116039b;

    public ju61(String str, String str2) {
        this.f116038a = str;
        this.f116039b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m54330a() {
        return this.f116039b;
    }

    /* JADX INFO: renamed from: b */
    public final String m54331b() {
        return this.f116038a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju61)) {
            return false;
        }
        ju61 ju61Var = (ju61) obj;
        return wj50.m88271j(this.f116038a, ju61Var.f116038a) && wj50.m88271j(this.f116039b, ju61Var.f116039b);
    }

    public final int hashCode() {
        return this.f116039b.hashCode() + (this.f116038a.hashCode() * 31);
    }
}
