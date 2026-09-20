package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wcv0 implements bdv0 {

    /* JADX INFO: renamed from: a */
    public final String f250125a;

    /* JADX INFO: renamed from: b */
    public final String f250126b;

    public wcv0(String str, String str2) {
        this.f250125a = str;
        this.f250126b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcv0)) {
            return false;
        }
        wcv0 wcv0Var = (wcv0) obj;
        return wj50.m88271j(this.f250125a, wcv0Var.f250125a) && wj50.m88271j(this.f250126b, wcv0Var.f250126b);
    }

    public final int hashCode() {
        return this.f250126b.hashCode() + (this.f250125a.hashCode() * 31);
    }
}
