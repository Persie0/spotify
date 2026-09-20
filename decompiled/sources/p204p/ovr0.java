package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ovr0 extends bwr0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f170551a;

    public ovr0(Throwable th) {
        this.f170551a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovr0) && wj50.m88271j(this.f170551a, ((ovr0) obj).f170551a);
    }

    public final int hashCode() {
        return this.f170551a.hashCode();
    }
}
