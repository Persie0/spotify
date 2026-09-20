package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pu00 {

    /* JADX INFO: renamed from: a */
    public final String f181295a;

    /* JADX INFO: renamed from: b */
    public final boolean f181296b;

    public pu00(String str, boolean z) {
        this.f181295a = str;
        this.f181296b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu00)) {
            return false;
        }
        pu00 pu00Var = (pu00) obj;
        return wj50.m88271j(this.f181295a, pu00Var.f181295a) && this.f181296b == pu00Var.f181296b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181296b) + (this.f181295a.hashCode() * 31);
    }
}
