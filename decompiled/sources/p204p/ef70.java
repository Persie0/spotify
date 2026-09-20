package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ef70 {

    /* JADX INFO: renamed from: a */
    public final String f58971a;

    /* JADX INFO: renamed from: b */
    public final String f58972b;

    public ef70(String str, String str2) {
        this.f58971a = str;
        this.f58972b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef70)) {
            return false;
        }
        ef70 ef70Var = (ef70) obj;
        return wj50.m88271j(this.f58971a, ef70Var.f58971a) && wj50.m88271j(this.f58972b, ef70Var.f58972b);
    }

    public final int hashCode() {
        return this.f58972b.hashCode() + (this.f58971a.hashCode() * 31);
    }
}
