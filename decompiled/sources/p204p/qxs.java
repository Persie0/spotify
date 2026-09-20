package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final bws f193738a;

    public qxs(bws bwsVar) {
        this.f193738a = bwsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qxs) && this.f193738a.equals(((qxs) obj).f193738a);
    }

    public final int hashCode() {
        return this.f193738a.hashCode();
    }
}
