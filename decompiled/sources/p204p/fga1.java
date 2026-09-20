package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fga1 implements jga1 {

    /* JADX INFO: renamed from: a */
    public final String f69263a;

    public fga1(String str) {
        this.f69263a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fga1) && wj50.m88271j(this.f69263a, ((fga1) obj).f69263a);
    }

    public final int hashCode() {
        return this.f69263a.hashCode();
    }
}
