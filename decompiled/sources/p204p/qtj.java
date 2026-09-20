package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qtj extends huj {

    /* JADX INFO: renamed from: a */
    public final ae50 f192389a;

    /* JADX INFO: renamed from: b */
    public final String f192390b;

    public qtj(String str, ae50 ae50Var) {
        this.f192389a = ae50Var;
        this.f192390b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtj)) {
            return false;
        }
        qtj qtjVar = (qtj) obj;
        return this.f192389a.equals(qtjVar.f192389a) && wj50.m88271j(this.f192390b, qtjVar.f192390b);
    }

    public final int hashCode() {
        int iHashCode = this.f192389a.hashCode() * 31;
        String str = this.f192390b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
