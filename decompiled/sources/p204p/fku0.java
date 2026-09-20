package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fku0 implements qku0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f70624a;

    public fku0(Throwable th) {
        this.f70624a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fku0) && wj50.m88271j(this.f70624a, ((fku0) obj).f70624a);
    }

    public final int hashCode() {
        return this.f70624a.hashCode();
    }
}
