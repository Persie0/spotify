package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nwc implements zwc {

    /* JADX INFO: renamed from: a */
    public final String f159091a;

    public nwc(String str) {
        this.f159091a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwc) && wj50.m88271j(this.f159091a, ((nwc) obj).f159091a);
    }

    public final int hashCode() {
        String str = this.f159091a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
