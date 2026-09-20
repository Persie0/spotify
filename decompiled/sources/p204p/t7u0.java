package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t7u0 {

    /* JADX INFO: renamed from: a */
    public final String f217899a;

    /* JADX INFO: renamed from: b */
    public final String f217900b;

    public t7u0(String str) {
        this.f217899a = str;
        this.f217900b = s571.m77250i(str, ":ratings");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7u0) && wj50.m88271j(this.f217899a, ((t7u0) obj).f217899a);
    }

    public final int hashCode() {
        return this.f217899a.hashCode();
    }
}
