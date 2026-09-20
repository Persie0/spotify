package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class oeq0 implements qeq0 {

    /* JADX INFO: renamed from: a */
    public final String f164511a;

    public oeq0(String str) {
        this.f164511a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oeq0) && wj50.m88271j(this.f164511a, ((oeq0) obj).f164511a);
    }

    public final int hashCode() {
        return this.f164511a.hashCode();
    }
}
