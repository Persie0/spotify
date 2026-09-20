package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gqo0 {

    /* JADX INFO: renamed from: a */
    public final boolean f83501a;

    public gqo0(boolean z) {
        this.f83501a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqo0) && this.f83501a == ((gqo0) obj).f83501a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83501a);
    }
}
