package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zkp0 {

    /* JADX INFO: renamed from: a */
    public final String f283801a;

    /* JADX INFO: renamed from: b */
    public final String f283802b;

    public zkp0(String str, String str2) {
        this.f283801a = str;
        this.f283802b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkp0)) {
            return false;
        }
        zkp0 zkp0Var = (zkp0) obj;
        return wj50.m88271j(this.f283801a, zkp0Var.f283801a) && wj50.m88271j(this.f283802b, zkp0Var.f283802b);
    }

    public final int hashCode() {
        String str = this.f283801a;
        return this.f283802b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
