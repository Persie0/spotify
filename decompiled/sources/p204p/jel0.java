package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jel0 implements sel0 {

    /* JADX INFO: renamed from: a */
    public final String f111618a;

    public jel0(String str) {
        this.f111618a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jel0) && wj50.m88271j(this.f111618a, ((jel0) obj).f111618a);
    }

    public final int hashCode() {
        return this.f111618a.hashCode();
    }
}
