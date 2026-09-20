package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e26 extends g26 {

    /* JADX INFO: renamed from: a */
    public final String f55366a;

    public e26(String str) {
        this.f55366a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e26) && this.f55366a.equals(((e26) obj).f55366a);
    }

    public final int hashCode() {
        return this.f55366a.hashCode() * 31;
    }
}
