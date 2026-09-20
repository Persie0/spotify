package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cia {

    /* JADX INFO: renamed from: a */
    public final int f38261a;

    /* JADX INFO: renamed from: b */
    public final int f38262b;

    public cia(int i, int i2) {
        this.f38261a = i;
        this.f38262b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cia)) {
            return false;
        }
        cia ciaVar = (cia) obj;
        return this.f38261a == ciaVar.f38261a && this.f38262b == ciaVar.f38262b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38262b) + (Integer.hashCode(this.f38261a) * 31);
    }
}
