package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class djo {
    public final boolean equals(Object obj) {
        Object objValueOf = Float.valueOf(0.7f);
        if (this == obj) {
            return true;
        }
        return (obj instanceof djo) && objValueOf.equals(objValueOf);
    }

    public final int hashCode() {
        return Float.valueOf(0.7f).hashCode() + (Integer.hashCode(15) * 31);
    }
}
