package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tcp0 extends wcp0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f219131a;

    public tcp0(Throwable th) {
        this.f219131a = th;
    }

    /* JADX INFO: renamed from: a */
    public final Throwable m80481a() {
        return this.f219131a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcp0) && wj50.m88271j(this.f219131a, ((tcp0) obj).f219131a);
    }

    public final int hashCode() {
        return this.f219131a.hashCode();
    }
}
