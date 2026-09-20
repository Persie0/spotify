package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class km4 implements i6q0 {

    /* JADX INFO: renamed from: b */
    public final int f124046b;

    public km4(int i) {
        this.f124046b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return km4.class.equals(obj != null ? obj.getClass() : null) && this.f124046b == ((km4) obj).f124046b;
    }

    public final int hashCode() {
        return this.f124046b;
    }

    public final String toString() {
        return edb.m38567p(new StringBuilder("AndroidPointerIcon(type="), this.f124046b, ')');
    }
}
