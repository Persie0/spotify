package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aja1 {

    /* JADX INFO: renamed from: a */
    public final String f16208a;

    /* JADX INFO: renamed from: b */
    public final String f16209b;

    public aja1(String str, String str2) {
        this.f16208a = str;
        this.f16209b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aja1)) {
            return false;
        }
        aja1 aja1Var = (aja1) obj;
        return wj50.m88271j(this.f16208a, aja1Var.f16208a) && wj50.m88271j(this.f16209b, aja1Var.f16209b);
    }

    public final int hashCode() {
        return this.f16209b.hashCode() + (this.f16208a.hashCode() * 31);
    }
}
