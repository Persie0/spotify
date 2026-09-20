package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f142983a;

    public mf8(String str) {
        this.f142983a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f142983a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf8) && wj50.m88271j(this.f142983a, ((mf8) obj).f142983a);
    }

    public final int hashCode() {
        return this.f142983a.hashCode();
    }
}
