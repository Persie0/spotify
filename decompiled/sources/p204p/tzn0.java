package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tzn0 {

    /* JADX INFO: renamed from: a */
    public final String f225274a;

    /* JADX INFO: renamed from: b */
    public final o0o0 f225275b;

    /* JADX INFO: renamed from: c */
    public final Integer f225276c;

    public tzn0(String str, o0o0 o0o0Var, Integer num) {
        this.f225274a = str;
        this.f225275b = o0o0Var;
        this.f225276c = num;
        if (str.length() > 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzn0)) {
            return false;
        }
        tzn0 tzn0Var = (tzn0) obj;
        return wj50.m88271j(this.f225274a, tzn0Var.f225274a) && wj50.m88271j(this.f225275b, tzn0Var.f225275b) && wj50.m88271j(this.f225276c, tzn0Var.f225276c);
    }

    public final int hashCode() {
        int iHashCode = (this.f225275b.hashCode() + (this.f225274a.hashCode() * 31)) * 31;
        Integer num = this.f225276c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
