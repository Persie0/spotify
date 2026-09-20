package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vsw0 implements rtr {

    /* JADX INFO: renamed from: a */
    public final String f244507a;

    public vsw0(String str) {
        this.f244507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsw0) && wj50.m88271j(this.f244507a, ((vsw0) obj).f244507a);
    }

    public final int hashCode() {
        return this.f244507a.hashCode();
    }
}
