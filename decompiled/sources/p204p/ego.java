package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ego extends q9g1 {

    /* JADX INFO: renamed from: d */
    public final tjo f59369d;

    public ego(tjo tjoVar) {
        this.f59369d = tjoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ego) && wj50.m88271j(this.f59369d, ((ego) obj).f59369d);
    }

    public final int hashCode() {
        return this.f59369d.hashCode();
    }
}
