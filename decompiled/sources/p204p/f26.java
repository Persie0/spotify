package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f26 extends g26 {

    /* JADX INFO: renamed from: a */
    public final String f65117a;

    public f26(String str) {
        this.f65117a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f26) && this.f65117a.equals(((f26) obj).f65117a);
    }

    public final int hashCode() {
        return this.f65117a.hashCode() * 31;
    }
}
