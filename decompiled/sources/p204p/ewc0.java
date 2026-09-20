package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ewc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f63500a;

    public ewc0(Throwable th) {
        this.f63500a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewc0) && wj50.m88271j(this.f63500a, ((ewc0) obj).f63500a);
    }

    public final int hashCode() {
        return this.f63500a.hashCode();
    }
}
