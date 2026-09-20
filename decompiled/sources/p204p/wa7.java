package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wa7 {

    /* JADX INFO: renamed from: a */
    public final String f249407a;

    /* JADX INFO: renamed from: b */
    public final String f249408b;

    public wa7(String str, String str2) {
        this.f249407a = str;
        this.f249408b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa7)) {
            return false;
        }
        wa7 wa7Var = (wa7) obj;
        return wj50.m88271j(this.f249407a, wa7Var.f249407a) && wj50.m88271j(this.f249408b, wa7Var.f249408b);
    }

    public final int hashCode() {
        return this.f249408b.hashCode() + (this.f249407a.hashCode() * 31);
    }
}
