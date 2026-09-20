package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l9y {

    /* JADX INFO: renamed from: a */
    public final float f131192a;

    /* JADX INFO: renamed from: b */
    public final w9z f131193b;

    public l9y(float f, w9z w9zVar) {
        this.f131192a = f;
        this.f131193b = w9zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9y)) {
            return false;
        }
        l9y l9yVar = (l9y) obj;
        return Float.compare(this.f131192a, l9yVar.f131192a) == 0 && wj50.m88271j(this.f131193b, l9yVar.f131193b);
    }

    public final int hashCode() {
        return this.f131193b.hashCode() + (Float.hashCode(this.f131192a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f131192a + ", animationSpec=" + this.f131193b + ')';
    }
}
