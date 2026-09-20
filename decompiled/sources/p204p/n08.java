package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class n08 extends e4l {

    /* JADX INFO: renamed from: a */
    public final String f148929a;

    public n08(String str) {
        this.f148929a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e4l)) {
            return false;
        }
        return this.f148929a.equals(((n08) ((e4l) obj)).f148929a);
    }

    public final int hashCode() {
        return this.f148929a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return dq60.m36616p(this.f148929a, "}", new StringBuilder("User{identifier="));
    }
}
