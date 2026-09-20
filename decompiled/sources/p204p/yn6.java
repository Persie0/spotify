package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yn6 implements d3t0 {

    /* JADX INFO: renamed from: a */
    public final int f274400a;

    public yn6(int i) {
        this.f274400a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d3t0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3t0)) {
            return false;
        }
        if (this.f274400a != ((yn6) ((d3t0) obj)).f274400a) {
            return false;
        }
        Object obj2 = a3t0.f12071a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f274400a) + (a3t0.f12071a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f274400a + "intEncoding=" + a3t0.f12071a + ')';
    }
}
