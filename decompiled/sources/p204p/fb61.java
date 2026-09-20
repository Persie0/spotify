package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fb61 {

    /* JADX INFO: renamed from: a */
    public final String f67732a;

    /* JADX INFO: renamed from: b */
    public final String f67733b;

    public fb61(String str, String str2) {
        this.f67732a = str;
        this.f67733b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb61)) {
            return false;
        }
        fb61 fb61Var = (fb61) obj;
        return wj50.m88271j(this.f67732a, fb61Var.f67732a) && wj50.m88271j(this.f67733b, fb61Var.f67733b);
    }

    public final int hashCode() {
        return this.f67733b.hashCode() + (this.f67732a.hashCode() * 31);
    }
}
