package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f191599a;

    public qqh(String str) {
        this.f191599a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqh) && wj50.m88271j(this.f191599a, ((qqh) obj).f191599a);
    }

    public final int hashCode() {
        return this.f191599a.hashCode();
    }
}
