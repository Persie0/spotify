package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m390 {

    /* JADX INFO: renamed from: a */
    public final float f139574a;

    /* JADX INFO: renamed from: b */
    public final boolean f139575b;

    public m390(float f, boolean z) {
        this.f139574a = f;
        this.f139575b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m390)) {
            return false;
        }
        m390 m390Var = (m390) obj;
        return Float.compare(this.f139574a, m390Var.f139574a) == 0 && this.f139575b == m390Var.f139575b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139575b) + (Float.hashCode(this.f139574a) * 31);
    }
}
