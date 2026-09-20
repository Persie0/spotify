package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final fbs f279209a;

    public z4d(fbs fbsVar) {
        this.f279209a = fbsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4d) && wj50.m88271j(this.f279209a, ((z4d) obj).f279209a);
    }

    public final int hashCode() {
        return this.f279209a.hashCode();
    }
}
