package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final String f258880a;

    public x7e(String str) {
        this.f258880a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7e) && wj50.m88271j(this.f258880a, ((x7e) obj).f258880a);
    }

    public final int hashCode() {
        return this.f258880a.hashCode();
    }
}
