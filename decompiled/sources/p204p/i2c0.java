package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i2c0 extends n2c0 {

    /* JADX INFO: renamed from: a */
    public final String f97796a;

    public i2c0(String str) {
        this.f97796a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2c0) && wj50.m88271j(this.f97796a, ((i2c0) obj).f97796a);
    }

    public final int hashCode() {
        return this.f97796a.hashCode();
    }
}
