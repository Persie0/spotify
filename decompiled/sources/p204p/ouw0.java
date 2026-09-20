package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw0 implements puw0 {

    /* JADX INFO: renamed from: a */
    public final String f170361a;

    /* JADX INFO: renamed from: b */
    public final String f170362b;

    public ouw0(String str, String str2) {
        this.f170361a = str;
        this.f170362b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouw0)) {
            return false;
        }
        ouw0 ouw0Var = (ouw0) obj;
        return wj50.m88271j(this.f170361a, ouw0Var.f170361a) && wj50.m88271j(this.f170362b, ouw0Var.f170362b);
    }

    public final int hashCode() {
        return this.f170362b.hashCode() + (this.f170361a.hashCode() * 31);
    }
}
