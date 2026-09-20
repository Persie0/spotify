package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ku41 implements hv41 {

    /* JADX INFO: renamed from: a */
    public final String f126458a;

    public ku41(String str) {
        this.f126458a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku41) && wj50.m88271j(this.f126458a, ((ku41) obj).f126458a);
    }

    public final int hashCode() {
        return this.f126458a.hashCode();
    }
}
