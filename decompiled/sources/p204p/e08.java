package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class e08 extends y3l {

    /* JADX INFO: renamed from: a */
    public final String f54897a;

    public e08(String str) {
        this.f54897a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y3l)) {
            return false;
        }
        return this.f54897a.equals(((e08) ((y3l) obj)).f54897a);
    }

    public final int hashCode() {
        return this.f54897a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dq60.m36616p(this.f54897a, "}", new StringBuilder("Log{content="));
    }
}
