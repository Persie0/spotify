package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class usw {

    /* JADX INFO: renamed from: a */
    public final boolean f233692a;

    public usw(boolean z) {
        this.f233692a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usw) && this.f233692a == ((usw) obj).f233692a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233692a);
    }
}
