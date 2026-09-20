package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wb60 {

    /* JADX INFO: renamed from: a */
    public final boolean f249701a;

    public wb60(boolean z) {
        this.f249701a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb60) && this.f249701a == ((wb60) obj).f249701a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249701a) * 31;
    }
}
