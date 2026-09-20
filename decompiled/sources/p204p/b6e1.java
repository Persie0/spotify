package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final Boolean f23957a;

    public b6e1(Boolean bool) {
        this.f23957a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6e1) && wj50.m88271j(this.f23957a, ((b6e1) obj).f23957a);
    }

    public final int hashCode() {
        Boolean bool = this.f23957a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
