package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class z1j0 extends aka1 {

    /* JADX INFO: renamed from: a */
    public final String f278324a;

    public z1j0(String str) {
        this.f278324a = str;
    }

    @Override // p204p.aka1
    /* JADX INFO: renamed from: a */
    public final String mo24516a() {
        return this.f278324a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1j0) && wj50.m88271j(this.f278324a, ((z1j0) obj).f278324a);
    }

    public final int hashCode() {
        return this.f278324a.hashCode();
    }
}
