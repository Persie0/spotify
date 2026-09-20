package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qqv0 {

    /* JADX INFO: renamed from: a */
    public final String f191664a;

    /* JADX INFO: renamed from: b */
    public final String f191665b;

    public qqv0(String str, String str2) {
        this.f191664a = str;
        this.f191665b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqv0)) {
            return false;
        }
        qqv0 qqv0Var = (qqv0) obj;
        return wj50.m88271j(this.f191664a, qqv0Var.f191664a) && wj50.m88271j(this.f191665b, qqv0Var.f191665b);
    }

    public final int hashCode() {
        return this.f191665b.hashCode() + (this.f191664a.hashCode() * 31);
    }
}
