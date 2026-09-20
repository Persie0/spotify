package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z5x0 extends z6x0 {

    /* JADX INFO: renamed from: a */
    public final String f279657a;

    public z5x0(String str) {
        this.f279657a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5x0) && wj50.m88271j(this.f279657a, ((z5x0) obj).f279657a);
    }

    public final int hashCode() {
        return this.f279657a.hashCode();
    }
}
