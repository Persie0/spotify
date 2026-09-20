package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class na61 {

    /* JADX INFO: renamed from: a */
    public final String f151959a;

    /* JADX INFO: renamed from: b */
    public final int f151960b;

    public na61(String str, int i) {
        this.f151959a = str;
        this.f151960b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na61)) {
            return false;
        }
        na61 na61Var = (na61) obj;
        return wj50.m88271j(this.f151959a, na61Var.f151959a) && this.f151960b == na61Var.f151960b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151960b) + (this.f151959a.hashCode() * 31);
    }
}
