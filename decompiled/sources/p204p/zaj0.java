package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zaj0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281081a;

    public zaj0(boolean z) {
        this.f281081a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zaj0) && this.f281081a == ((zaj0) obj).f281081a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281081a);
    }
}
