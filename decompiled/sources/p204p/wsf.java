package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wsf {

    /* JADX INFO: renamed from: a */
    public final String f254602a;

    public wsf(String str) {
        this.f254602a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsf) && wj50.m88271j(this.f254602a, ((wsf) obj).f254602a);
    }

    public final int hashCode() {
        return this.f254602a.hashCode();
    }
}
