package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final boolean f42656a;

    public cw60(boolean z) {
        this.f42656a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw60) && this.f42656a == ((cw60) obj).f42656a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42656a);
    }
}
