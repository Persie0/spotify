package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class th81 extends vh81 {

    /* JADX INFO: renamed from: a */
    public final String f220376a;

    public th81(String str) {
        this.f220376a = str;
    }

    @Override // p204p.vh81
    /* JADX INFO: renamed from: a */
    public final String mo75505a() {
        return this.f220376a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th81) && wj50.m88271j(this.f220376a, ((th81) obj).f220376a);
    }

    public final int hashCode() {
        return this.f220376a.hashCode();
    }
}
