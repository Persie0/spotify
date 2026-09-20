package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g91 implements m91 {

    /* JADX INFO: renamed from: a */
    public final String f77642a;

    public g91(String str) {
        this.f77642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g91) && wj50.m88271j(this.f77642a, ((g91) obj).f77642a);
    }

    public final int hashCode() {
        return this.f77642a.hashCode();
    }
}
