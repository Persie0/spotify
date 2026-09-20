package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dy61 {

    /* JADX INFO: renamed from: a */
    public final String f54200a;

    /* JADX INFO: renamed from: b */
    public final String f54201b;

    public dy61(String str, String str2) {
        this.f54200a = str;
        this.f54201b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy61)) {
            return false;
        }
        dy61 dy61Var = (dy61) obj;
        return wj50.m88271j(this.f54200a, dy61Var.f54200a) && wj50.m88271j(this.f54201b, dy61Var.f54201b);
    }

    public final int hashCode() {
        return this.f54201b.hashCode() + (this.f54200a.hashCode() * 31);
    }
}
