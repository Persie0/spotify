package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eit extends k1h1 {

    /* JADX INFO: renamed from: b */
    public final String f60004b;

    public eit(String str) {
        this.f60004b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eit) && wj50.m88271j(this.f60004b, ((eit) obj).f60004b);
    }

    public final int hashCode() {
        return this.f60004b.hashCode();
    }
}
