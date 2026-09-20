package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z4t extends o5t {

    /* JADX INFO: renamed from: a */
    public final String f279337a;

    public z4t(String str) {
        this.f279337a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4t) && wj50.m88271j(this.f279337a, ((z4t) obj).f279337a);
    }

    public final int hashCode() {
        return this.f279337a.hashCode();
    }
}
