package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qqe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f191552a;

    /* JADX INFO: renamed from: b */
    public final boolean f191553b;

    public qqe1(boolean z, boolean z2) {
        this.f191552a = z;
        this.f191553b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqe1)) {
            return false;
        }
        qqe1 qqe1Var = (qqe1) obj;
        return this.f191552a == qqe1Var.f191552a && this.f191553b == qqe1Var.f191553b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191553b) + (Boolean.hashCode(this.f191552a) * 31);
    }
}
