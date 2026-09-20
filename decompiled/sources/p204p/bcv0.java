package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bcv0 extends dcv0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f25948a;

    public bcv0(Throwable th) {
        this.f25948a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcv0) && wj50.m88271j(this.f25948a, ((bcv0) obj).f25948a);
    }

    public final int hashCode() {
        return this.f25948a.hashCode();
    }
}
