package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final String f79297a;

    public gf8(String str) {
        this.f79297a = str;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f79297a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf8) && wj50.m88271j(this.f79297a, ((gf8) obj).f79297a);
    }

    public final int hashCode() {
        return this.f79297a.hashCode();
    }
}
