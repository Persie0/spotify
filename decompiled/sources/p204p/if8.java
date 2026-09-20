package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class if8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f101707a;

    public if8(String str) {
        this.f101707a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f101707a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if8) && wj50.m88271j(this.f101707a, ((if8) obj).f101707a);
    }

    public final int hashCode() {
        return this.f101707a.hashCode();
    }
}
