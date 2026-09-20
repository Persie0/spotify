package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bjl implements cjl {

    /* JADX INFO: renamed from: a */
    public final String f27716a;

    public bjl(String str) {
        this.f27716a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjl) && wj50.m88271j(this.f27716a, ((bjl) obj).f27716a);
    }

    public final int hashCode() {
        return this.f27716a.hashCode();
    }
}
