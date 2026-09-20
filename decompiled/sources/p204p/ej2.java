package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ej2 {

    /* JADX INFO: renamed from: a */
    public final String f60110a;

    /* JADX INFO: renamed from: b */
    public final String f60111b;

    public ej2(String str, String str2) {
        this.f60110a = str;
        this.f60111b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej2)) {
            return false;
        }
        ej2 ej2Var = (ej2) obj;
        return wj50.m88271j(this.f60110a, ej2Var.f60110a) && wj50.m88271j(this.f60111b, ej2Var.f60111b);
    }

    public final int hashCode() {
        String str = this.f60110a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60111b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
