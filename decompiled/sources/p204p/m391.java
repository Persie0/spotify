package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m391 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f139576a;

    /* JADX INFO: renamed from: b */
    public final String f139577b;

    public m391(String str, String str2) {
        this.f139576a = str;
        this.f139577b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m391)) {
            return false;
        }
        m391 m391Var = (m391) obj;
        return wj50.m88271j(this.f139576a, m391Var.f139576a) && wj50.m88271j(this.f139577b, m391Var.f139577b);
    }

    public final int hashCode() {
        int iHashCode = this.f139576a.hashCode() * 31;
        String str = this.f139577b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
