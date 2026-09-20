package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class glc0 extends ilc0 {

    /* JADX INFO: renamed from: a */
    public final String f81053a;

    public glc0(String str) {
        this.f81053a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glc0) && wj50.m88271j(this.f81053a, ((glc0) obj).f81053a);
    }

    public final int hashCode() {
        return this.f81053a.hashCode();
    }
}
