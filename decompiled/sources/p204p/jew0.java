package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jew0 {

    /* JADX INFO: renamed from: a */
    public final String f111683a;

    /* JADX INFO: renamed from: b */
    public final String f111684b;

    public jew0(String str, String str2) {
        this.f111683a = str;
        this.f111684b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jew0)) {
            return false;
        }
        jew0 jew0Var = (jew0) obj;
        return wj50.m88271j(this.f111683a, jew0Var.f111683a) && wj50.m88271j(this.f111684b, jew0Var.f111684b);
    }

    public final int hashCode() {
        return this.f111684b.hashCode() + (this.f111683a.hashCode() * 31);
    }
}
