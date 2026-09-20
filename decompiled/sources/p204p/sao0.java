package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sao0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f207246a;

    public sao0(String str) {
        this.f207246a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sao0) && wj50.m88271j(this.f207246a, ((sao0) obj).f207246a);
    }

    public final int hashCode() {
        String str = this.f207246a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
