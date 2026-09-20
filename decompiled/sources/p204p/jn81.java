package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jn81 implements mn81 {

    /* JADX INFO: renamed from: a */
    public final long f114041a;

    /* JADX INFO: renamed from: b */
    public final float f114042b;

    public jn81(long j, float f) {
        this.f114041a = j;
        this.f114042b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn81)) {
            return false;
        }
        jn81 jn81Var = (jn81) obj;
        return this.f114041a == jn81Var.f114041a && Float.compare(this.f114042b, jn81Var.f114042b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f114042b) + (Long.hashCode(this.f114041a) * 31);
    }
}
