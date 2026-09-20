package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yyc1 implements czc1 {

    /* JADX INFO: renamed from: a */
    public final float f277471a;

    public yyc1(float f) {
        this.f277471a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyc1) && Float.compare(this.f277471a, ((yyc1) obj).f277471a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f277471a);
    }
}
