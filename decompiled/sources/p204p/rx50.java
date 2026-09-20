package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rx50 {

    /* JADX INFO: renamed from: a */
    public final String f203497a;

    /* JADX INFO: renamed from: b */
    public final String f203498b;

    public rx50(String str, String str2) {
        this.f203497a = str;
        this.f203498b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m76607a() {
        return this.f203497a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx50)) {
            return false;
        }
        rx50 rx50Var = (rx50) obj;
        return wj50.m88271j(this.f203497a, rx50Var.f203497a) && wj50.m88271j(this.f203498b, rx50Var.f203498b);
    }

    public final int hashCode() {
        int iHashCode = this.f203497a.hashCode() * 31;
        String str = this.f203498b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
