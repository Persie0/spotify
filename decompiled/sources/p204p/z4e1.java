package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final String f279227a;

    public z4e1(String str) {
        this.f279227a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4e1) && wj50.m88271j(this.f279227a, ((z4e1) obj).f279227a);
    }

    public final int hashCode() {
        return this.f279227a.hashCode();
    }
}
