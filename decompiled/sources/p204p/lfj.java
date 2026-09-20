package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lfj implements pfj {

    /* JADX INFO: renamed from: a */
    public final String f132957a;

    public lfj(String str) {
        this.f132957a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfj) && wj50.m88271j(this.f132957a, ((lfj) obj).f132957a);
    }

    public final int hashCode() {
        return this.f132957a.hashCode();
    }
}
