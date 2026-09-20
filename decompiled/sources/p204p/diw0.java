package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class diw0 {

    /* JADX INFO: renamed from: a */
    public final String f49500a;

    /* JADX INFO: renamed from: b */
    public final String f49501b;

    public diw0(String str, String str2) {
        this.f49500a = str;
        this.f49501b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diw0)) {
            return false;
        }
        diw0 diw0Var = (diw0) obj;
        return wj50.m88271j(this.f49500a, diw0Var.f49500a) && wj50.m88271j(this.f49501b, diw0Var.f49501b);
    }

    public final int hashCode() {
        return this.f49501b.hashCode() + (this.f49500a.hashCode() * 31);
    }
}
