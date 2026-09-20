package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h6x0 extends y6x0 {

    /* JADX INFO: renamed from: a */
    public final String f88291a;

    /* JADX INFO: renamed from: b */
    public final String f88292b;

    public h6x0(String str, String str2) {
        this.f88291a = str;
        this.f88292b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6x0)) {
            return false;
        }
        h6x0 h6x0Var = (h6x0) obj;
        return wj50.m88271j(this.f88291a, h6x0Var.f88291a) && wj50.m88271j(this.f88292b, h6x0Var.f88292b);
    }

    public final int hashCode() {
        return this.f88292b.hashCode() + (this.f88291a.hashCode() * 31);
    }
}
