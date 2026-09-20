package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ff8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f68945a;

    public ff8(String str) {
        this.f68945a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f68945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff8) && wj50.m88271j(this.f68945a, ((ff8) obj).f68945a);
    }

    public final int hashCode() {
        return this.f68945a.hashCode();
    }
}
