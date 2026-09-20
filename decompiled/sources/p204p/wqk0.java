package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wqk0 extends zqk0 {

    /* JADX INFO: renamed from: a */
    public final String f254053a;

    public wqk0(String str) {
        this.f254053a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqk0) && wj50.m88271j(this.f254053a, ((wqk0) obj).f254053a);
    }

    public final int hashCode() {
        String str = this.f254053a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
