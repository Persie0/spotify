package p204p;

/* JADX INFO: loaded from: classes.dex */
@rtz0
public final class ois {
    public static final nis Companion = new nis();

    /* JADX INFO: renamed from: a */
    public long f165879a;

    /* JADX INFO: renamed from: b */
    public long f165880b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ois)) {
            return false;
        }
        ois oisVar = (ois) obj;
        return this.f165879a == oisVar.f165879a && this.f165880b == oisVar.f165880b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f165880b) + (Long.hashCode(this.f165879a) * 31);
    }
}
