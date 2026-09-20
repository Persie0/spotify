package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v491 implements w491 {

    /* JADX INFO: renamed from: a */
    public final Exception f237098a;

    public v491(Exception exc) {
        this.f237098a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v491) && wj50.m88271j(this.f237098a, ((v491) obj).f237098a);
    }

    public final int hashCode() {
        return this.f237098a.hashCode();
    }
}
