package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b2c implements i2c {

    /* JADX INFO: renamed from: a */
    public final String f22562a;

    public b2c(String str) {
        this.f22562a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2c) && wj50.m88271j(this.f22562a, ((b2c) obj).f22562a);
    }

    public final int hashCode() {
        return this.f22562a.hashCode();
    }
}
