package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lbo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final String f131694a;

    public lbo0(String str) {
        this.f131694a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbo0) && wj50.m88271j(this.f131694a, ((lbo0) obj).f131694a);
    }

    public final int hashCode() {
        String str = this.f131694a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
