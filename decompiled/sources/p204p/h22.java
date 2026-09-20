package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h22 {

    /* JADX INFO: renamed from: a */
    public final String f86846a;

    public h22(String str) {
        this.f86846a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h22) && wj50.m88271j(this.f86846a, ((h22) obj).f86846a);
    }

    public final int hashCode() {
        String str = this.f86846a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
