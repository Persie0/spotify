package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qti {

    /* JADX INFO: renamed from: a */
    public final boolean f192385a;

    /* JADX INFO: renamed from: b */
    public final boolean f192386b;

    public qti(boolean z, boolean z2) {
        this.f192385a = z;
        this.f192386b = z2;
        if (!z && !z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qti)) {
            return false;
        }
        qti qtiVar = (qti) obj;
        return this.f192385a == qtiVar.f192385a && this.f192386b == qtiVar.f192386b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192386b) + (Boolean.hashCode(this.f192385a) * 31);
    }
}
