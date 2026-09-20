package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lyh0 {

    /* JADX INFO: renamed from: a */
    public final String f138068a;

    public lyh0(String str) {
        this.f138068a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyh0) && wj50.m88271j(this.f138068a, ((lyh0) obj).f138068a);
    }

    public final int hashCode() {
        String str = this.f138068a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
