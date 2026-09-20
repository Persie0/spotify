package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kb1 implements nb1 {

    /* JADX INFO: renamed from: a */
    public final String f121030a;

    /* JADX INFO: renamed from: b */
    public final String f121031b;

    public kb1(String str, String str2) {
        this.f121030a = str;
        this.f121031b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb1)) {
            return false;
        }
        kb1 kb1Var = (kb1) obj;
        return wj50.m88271j(this.f121030a, kb1Var.f121030a) && wj50.m88271j(this.f121031b, kb1Var.f121031b);
    }

    public final int hashCode() {
        return this.f121031b.hashCode() + (this.f121030a.hashCode() * 31);
    }
}
