package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class neq0 implements peq0 {

    /* JADX INFO: renamed from: a */
    public final String f153060a;

    public neq0(String str) {
        this.f153060a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m64270a() {
        return this.f153060a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof neq0) && wj50.m88271j(this.f153060a, ((neq0) obj).f153060a);
    }

    public final int hashCode() {
        return this.f153060a.hashCode();
    }
}
