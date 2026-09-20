package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j3x0 implements n3x0 {

    /* JADX INFO: renamed from: a */
    public final String f108494a;

    public j3x0(String str) {
        this.f108494a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3x0) && wj50.m88271j(this.f108494a, ((j3x0) obj).f108494a);
    }

    public final int hashCode() {
        return this.f108494a.hashCode();
    }
}
