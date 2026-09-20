package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class df7 extends ff7 {

    /* JADX INFO: renamed from: a */
    public final String f48502a;

    public df7(String str) {
        this.f48502a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df7) && wj50.m88271j(this.f48502a, ((df7) obj).f48502a);
    }

    public final int hashCode() {
        return this.f48502a.hashCode();
    }
}
