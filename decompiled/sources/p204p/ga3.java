package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ga3 implements ha3, ia3 {

    /* JADX INFO: renamed from: a */
    public final String f77960a;

    public ga3(String str) {
        this.f77960a = str;
    }

    @Override // p204p.ia3
    /* JADX INFO: renamed from: e */
    public final String mo28556e() {
        return this.f77960a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga3) && wj50.m88271j(this.f77960a, ((ga3) obj).f77960a);
    }

    public final int hashCode() {
        return this.f77960a.hashCode();
    }
}
