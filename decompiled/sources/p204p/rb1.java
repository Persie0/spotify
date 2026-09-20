package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rb1 implements zb1 {

    /* JADX INFO: renamed from: a */
    public final String f197421a;

    public rb1(String str) {
        this.f197421a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb1) && wj50.m88271j(this.f197421a, ((rb1) obj).f197421a);
    }

    public final int hashCode() {
        return this.f197421a.hashCode();
    }
}
