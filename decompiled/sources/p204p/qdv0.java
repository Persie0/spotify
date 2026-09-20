package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qdv0 implements udv0 {

    /* JADX INFO: renamed from: a */
    public final String f187756a;

    public qdv0(String str) {
        this.f187756a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdv0) && wj50.m88271j(this.f187756a, ((qdv0) obj).f187756a);
    }

    public final int hashCode() {
        return this.f187756a.hashCode();
    }
}
