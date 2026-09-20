package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gp90 extends jp90 {

    /* JADX INFO: renamed from: a */
    public final Throwable f83111a;

    public gp90(Throwable th) {
        this.f83111a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp90) && wj50.m88271j(this.f83111a, ((gp90) obj).f83111a);
    }

    public final int hashCode() {
        return this.f83111a.hashCode();
    }
}
