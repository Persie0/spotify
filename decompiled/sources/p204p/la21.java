package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class la21 implements na21 {

    /* JADX INFO: renamed from: a */
    public final Throwable f131227a;

    public la21(Throwable th) {
        this.f131227a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la21) && wj50.m88271j(this.f131227a, ((la21) obj).f131227a);
    }

    public final int hashCode() {
        return this.f131227a.hashCode();
    }
}
