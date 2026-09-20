package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iqf1 implements xqf1 {

    /* JADX INFO: renamed from: a */
    public final int f104759a;

    public iqf1(int i) {
        this.f104759a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return xqf1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqf1)) {
            return false;
        }
        if (this.f104759a != ((iqf1) ((xqf1) obj)).f104759a) {
            return false;
        }
        Object obj2 = tqf1.f222809a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f104759a ^ 14552422) + (tqf1.f222809a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f104759a + "intEncoding=" + tqf1.f222809a + ')';
    }
}
