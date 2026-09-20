package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pio0 implements rio0 {

    /* JADX INFO: renamed from: a */
    public final int f177997a;

    public pio0(int i) {
        this.f177997a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pio0) && this.f177997a == ((pio0) obj).f177997a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f177997a);
    }
}
