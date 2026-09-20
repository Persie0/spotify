package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wei {

    /* JADX INFO: renamed from: a */
    public final String f250540a;

    /* JADX INFO: renamed from: b */
    public final int f250541b;

    public wei(String str, int i) {
        this.f250540a = str;
        this.f250541b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wei)) {
            return false;
        }
        wei weiVar = (wei) obj;
        return wj50.m88271j(this.f250540a, weiVar.f250540a) && this.f250541b == weiVar.f250541b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250541b) + (this.f250540a.hashCode() * 31);
    }
}
