package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ob60 {

    /* JADX INFO: renamed from: a */
    public final boolean f163545a;

    public ob60(boolean z) {
        this.f163545a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob60) && this.f163545a == ((ob60) obj).f163545a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163545a);
    }
}
