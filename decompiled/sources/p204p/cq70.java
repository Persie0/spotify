package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cq70 {

    /* JADX INFO: renamed from: a */
    public final boolean f40775a;

    public cq70(boolean z) {
        this.f40775a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq70) && this.f40775a == ((cq70) obj).f40775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40775a) + (Boolean.hashCode(true) * 31);
    }
}
