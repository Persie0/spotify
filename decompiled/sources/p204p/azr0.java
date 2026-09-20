package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class azr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f21673a;

    public azr0(Throwable th) {
        this.f21673a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azr0) && wj50.m88271j(this.f21673a, ((azr0) obj).f21673a);
    }

    public final int hashCode() {
        return this.f21673a.hashCode();
    }
}
