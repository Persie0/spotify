package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wk2 implements zk2 {

    /* JADX INFO: renamed from: a */
    public final String f252102a;

    public wk2(String str) {
        this.f252102a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk2) && wj50.m88271j(this.f252102a, ((wk2) obj).f252102a);
    }

    public final int hashCode() {
        return this.f252102a.hashCode();
    }
}
