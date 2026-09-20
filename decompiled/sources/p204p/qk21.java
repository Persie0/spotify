package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qk21 implements rk21 {

    /* JADX INFO: renamed from: a */
    public final boolean f189413a;

    public qk21(boolean z) {
        this.f189413a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk21) && this.f189413a == ((qk21) obj).f189413a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189413a);
    }
}
