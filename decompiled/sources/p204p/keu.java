package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class keu {

    /* JADX INFO: renamed from: a */
    public final String f121982a;

    public keu(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f121982a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keu)) {
            return false;
        }
        return this.f121982a.equals(((keu) obj).f121982a);
    }

    public final int hashCode() {
        return this.f121982a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dq60.m36616p(this.f121982a, "\"}", new StringBuilder("Encoding{name=\""));
    }
}
