package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ecv implements jcv {

    /* JADX INFO: renamed from: a */
    public final x9s f58392a;

    public ecv(x9s x9sVar) {
        this.f58392a = x9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecv) && wj50.m88271j(this.f58392a, ((ecv) obj).f58392a);
    }

    public final int hashCode() {
        return this.f58392a.hashCode();
    }
}
