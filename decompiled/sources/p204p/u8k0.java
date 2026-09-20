package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u8k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final String f227967a;

    public u8k0(String str) {
        this.f227967a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8k0) && wj50.m88271j(this.f227967a, ((u8k0) obj).f227967a);
    }

    public final int hashCode() {
        String str = this.f227967a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
