package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f44684a;

    public d2x0(String str) {
        this.f44684a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "gone";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f44684a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2x0) && wj50.m88271j(this.f44684a, ((d2x0) obj).f44684a);
    }

    public final int hashCode() {
        return this.f44684a.hashCode();
    }
}
