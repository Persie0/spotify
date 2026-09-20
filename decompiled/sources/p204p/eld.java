package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eld extends sjf1 {

    /* JADX INFO: renamed from: e */
    public final boolean f60690e;

    public eld(boolean z) {
        super(3);
        this.f60690e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eld) && this.f60690e == ((eld) obj).f60690e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60690e);
    }
}
