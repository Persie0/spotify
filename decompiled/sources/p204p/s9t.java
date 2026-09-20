package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s9t implements u9t {

    /* JADX INFO: renamed from: a */
    public final String f207061a;

    public s9t(String str) {
        this.f207061a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9t) && wj50.m88271j(this.f207061a, ((s9t) obj).f207061a);
    }

    public final int hashCode() {
        return this.f207061a.hashCode();
    }
}
