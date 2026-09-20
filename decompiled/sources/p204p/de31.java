package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class de31 implements ie31 {

    /* JADX INFO: renamed from: a */
    public final String f47957a;

    public de31(String str) {
        this.f47957a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de31) && wj50.m88271j(this.f47957a, ((de31) obj).f47957a);
    }

    public final int hashCode() {
        return this.f47957a.hashCode();
    }
}
