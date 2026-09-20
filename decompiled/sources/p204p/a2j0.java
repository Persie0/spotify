package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a2j0 extends aka1 {

    /* JADX INFO: renamed from: a */
    public final String f11689a;

    public a2j0(String str) {
        this.f11689a = str;
    }

    @Override // p204p.aka1
    /* JADX INFO: renamed from: a */
    public final String mo24516a() {
        return this.f11689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2j0) && wj50.m88271j(this.f11689a, ((a2j0) obj).f11689a);
    }

    public final int hashCode() {
        return this.f11689a.hashCode();
    }
}
