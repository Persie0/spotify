package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class di51 {

    /* JADX INFO: renamed from: a */
    public final String f49258a;

    /* JADX INFO: renamed from: b */
    public final String f49259b;

    public di51(String str, String str2) {
        this.f49258a = str;
        this.f49259b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di51)) {
            return false;
        }
        di51 di51Var = (di51) obj;
        return wj50.m88271j(this.f49258a, di51Var.f49258a) && wj50.m88271j(this.f49259b, di51Var.f49259b);
    }

    public final int hashCode() {
        return this.f49259b.hashCode() + (this.f49258a.hashCode() * 31);
    }
}
