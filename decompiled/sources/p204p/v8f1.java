package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class v8f1 implements bcf1 {

    /* JADX INFO: renamed from: a */
    public final int f238571a;

    public v8f1(int i) {
        this.f238571a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return bcf1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcf1)) {
            return false;
        }
        if (this.f238571a != ((v8f1) ((bcf1) obj)).f238571a) {
            return false;
        }
        Object obj2 = jbf1.f110794a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f238571a ^ 14552422) + (jbf1.f110794a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f238571a + "intEncoding=" + jbf1.f110794a + ')';
    }
}
