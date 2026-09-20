package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vy90 implements wy90 {

    /* JADX INFO: renamed from: a */
    public final String f246027a;

    public vy90(String str) {
        this.f246027a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy90) && wj50.m88271j(this.f246027a, ((vy90) obj).f246027a);
    }

    public final int hashCode() {
        return this.f246027a.hashCode();
    }
}
