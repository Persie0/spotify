package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qpo0 {

    /* JADX INFO: renamed from: a */
    public final String f191350a;

    public qpo0(String str) {
        this.f191350a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m73452a() {
        return this.f191350a;
    }

    /* JADX INFO: renamed from: b */
    public final qpo0 m73453b() {
        return new qpo0(this.f191350a.substring(0, 32));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpo0) && wj50.m88271j(this.f191350a, ((qpo0) obj).f191350a);
    }

    public final int hashCode() {
        return this.f191350a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qpo0(byte[] bArr) {
        this(yq20.m94330k(bArr, br20.f29944d));
        int[] iArr = yq20.f275114a;
    }
}
