package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e3x0 implements m3x0 {

    /* JADX INFO: renamed from: a */
    public final String f55898a;

    public e3x0(String str) {
        this.f55898a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3x0) && wj50.m88271j(this.f55898a, ((e3x0) obj).f55898a);
    }

    public final int hashCode() {
        return this.f55898a.hashCode();
    }
}
