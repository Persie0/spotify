package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nw60 implements sw60 {

    /* JADX INFO: renamed from: a */
    public final String f159032a;

    public nw60(String str) {
        this.f159032a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw60) && wj50.m88271j(this.f159032a, ((nw60) obj).f159032a);
    }

    public final int hashCode() {
        return this.f159032a.hashCode();
    }
}
