package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hoz0 implements koz0 {

    /* JADX INFO: renamed from: a */
    public final float f93659a;

    public hoz0(float f) {
        this.f93659a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hoz0) && Float.compare(this.f93659a, ((hoz0) obj).f93659a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f93659a);
    }
}
