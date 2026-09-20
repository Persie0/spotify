package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ed00 {

    /* JADX INFO: renamed from: a */
    public final String f58417a;

    /* JADX INFO: renamed from: b */
    public final String f58418b;

    public ed00(String str, String str2) {
        this.f58417a = str;
        this.f58418b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed00)) {
            return false;
        }
        ed00 ed00Var = (ed00) obj;
        return wj50.m88271j(this.f58417a, ed00Var.f58417a) && wj50.m88271j(this.f58418b, ed00Var.f58418b);
    }

    public final int hashCode() {
        return this.f58418b.hashCode() + (this.f58417a.hashCode() * 31);
    }
}
