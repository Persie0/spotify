package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tw11 extends vw11 {

    /* JADX INFO: renamed from: a */
    public final String f224299a;

    public tw11(String str) {
        this.f224299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw11) && wj50.m88271j(this.f224299a, ((tw11) obj).f224299a);
    }

    public final int hashCode() {
        return this.f224299a.hashCode();
    }
}
