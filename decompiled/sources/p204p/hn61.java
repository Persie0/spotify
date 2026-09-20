package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hn61 {

    /* JADX INFO: renamed from: a */
    public final String f93226a;

    /* JADX INFO: renamed from: b */
    public final int f93227b;

    public hn61(String str, int i) {
        this.f93226a = str;
        this.f93227b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn61)) {
            return false;
        }
        hn61 hn61Var = (hn61) obj;
        return wj50.m88271j(this.f93226a, hn61Var.f93226a) && this.f93227b == hn61Var.f93227b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93227b) + (this.f93226a.hashCode() * 31);
    }
}
