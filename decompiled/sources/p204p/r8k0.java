package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r8k0 extends nsg1 {

    /* JADX INFO: renamed from: b */
    public final String f196808b;

    public r8k0(String str) {
        this.f196808b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8k0) && wj50.m88271j(this.f196808b, ((r8k0) obj).f196808b);
    }

    public final int hashCode() {
        String str = this.f196808b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
