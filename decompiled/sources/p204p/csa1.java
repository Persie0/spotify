package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class csa1 implements dsa1 {

    /* JADX INFO: renamed from: a */
    public final String f41499a;

    public csa1(String str) {
        this.f41499a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csa1) && wj50.m88271j(this.f41499a, ((csa1) obj).f41499a);
    }

    public final int hashCode() {
        return this.f41499a.hashCode();
    }
}
