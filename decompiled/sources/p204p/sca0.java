package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sca0 {

    /* JADX INFO: renamed from: a */
    public final String f207672a;

    public sca0(String str) {
        this.f207672a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sca0) && wj50.m88271j(this.f207672a, ((sca0) obj).f207672a);
    }

    public final int hashCode() {
        String str = this.f207672a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
