package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eoz0 {

    /* JADX INFO: renamed from: a */
    public final boolean f61519a;

    public eoz0(boolean z) {
        this.f61519a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eoz0) && this.f61519a == ((eoz0) obj).f61519a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61519a);
    }
}
