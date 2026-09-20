package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ip90 extends jp90 {

    /* JADX INFO: renamed from: a */
    public final Throwable f104456a;

    public ip90(Throwable th) {
        this.f104456a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ip90) && wj50.m88271j(this.f104456a, ((ip90) obj).f104456a);
    }

    public final int hashCode() {
        return this.f104456a.hashCode();
    }
}
