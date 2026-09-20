package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tol0 extends aka1 {

    /* JADX INFO: renamed from: a */
    public final String f222285a;

    public tol0(String str) {
        this.f222285a = str;
    }

    @Override // p204p.aka1
    /* JADX INFO: renamed from: a */
    public final String mo24516a() {
        return this.f222285a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tol0) && wj50.m88271j(this.f222285a, ((tol0) obj).f222285a);
    }

    public final int hashCode() {
        return this.f222285a.hashCode();
    }
}
