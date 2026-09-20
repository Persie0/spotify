package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kt60 implements lt60 {

    /* JADX INFO: renamed from: a */
    public final Object f126165a;

    public kt60(Object obj) {
        this.f126165a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt60) && wj50.m88271j(this.f126165a, ((kt60) obj).f126165a);
    }

    public final int hashCode() {
        return this.f126165a.hashCode();
    }
}
