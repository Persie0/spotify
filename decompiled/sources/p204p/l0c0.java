package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l0c0 implements m0c0 {

    /* JADX INFO: renamed from: a */
    public final String f128359a;

    public l0c0(String str) {
        this.f128359a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0c0) && wj50.m88271j(this.f128359a, ((l0c0) obj).f128359a);
    }

    public final int hashCode() {
        return this.f128359a.hashCode();
    }
}
