package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wrh0 {

    /* JADX INFO: renamed from: a */
    public final String f254359a;

    /* JADX INFO: renamed from: b */
    public final String f254360b;

    public wrh0(String str, String str2) {
        this.f254359a = str;
        this.f254360b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrh0)) {
            return false;
        }
        wrh0 wrh0Var = (wrh0) obj;
        return wj50.m88271j(this.f254359a, wrh0Var.f254359a) && wj50.m88271j(this.f254360b, wrh0Var.f254360b);
    }

    public final int hashCode() {
        int iHashCode = this.f254359a.hashCode() * 31;
        String str = this.f254360b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
