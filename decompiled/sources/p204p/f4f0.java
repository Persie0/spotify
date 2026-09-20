package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f4f0 extends n4f0 {

    /* JADX INFO: renamed from: a */
    public final String f65774a;

    public f4f0(String str) {
        this.f65774a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4f0) && wj50.m88271j(this.f65774a, ((f4f0) obj).f65774a);
    }

    public final int hashCode() {
        String str = this.f65774a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
