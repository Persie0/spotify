package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dsq0 extends gsq0 {

    /* JADX INFO: renamed from: a */
    public final String f52621a;

    public dsq0(String str) {
        this.f52621a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsq0) && wj50.m88271j(this.f52621a, ((dsq0) obj).f52621a);
    }

    public final int hashCode() {
        return this.f52621a.hashCode();
    }
}
