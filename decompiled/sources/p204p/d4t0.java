package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d4t0 implements f4t0 {

    /* JADX INFO: renamed from: a */
    public final String f45238a;

    public d4t0(String str) {
        this.f45238a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4t0) && wj50.m88271j(this.f45238a, ((d4t0) obj).f45238a);
    }

    @Override // p204p.f4t0
    public final String getValue() {
        return this.f45238a;
    }

    public final int hashCode() {
        return this.f45238a.hashCode();
    }
}
