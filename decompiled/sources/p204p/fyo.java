package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fyo implements gyo {

    /* JADX INFO: renamed from: a */
    public final String f74785a;

    public fyo(String str) {
        this.f74785a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyo) && wj50.m88271j(this.f74785a, ((fyo) obj).f74785a);
    }

    public final int hashCode() {
        return this.f74785a.hashCode();
    }
}
