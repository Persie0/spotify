package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class z5a implements c6a {

    /* JADX INFO: renamed from: a */
    public final String f279518a;

    public z5a(String str) {
        this.f279518a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5a) && wj50.m88271j(this.f279518a, ((z5a) obj).f279518a);
    }

    public final int hashCode() {
        return this.f279518a.hashCode();
    }
}
