package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ch40 implements ih40 {

    /* JADX INFO: renamed from: a */
    public final String f37920a;

    public ch40(String str) {
        this.f37920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ch40) && wj50.m88271j(this.f37920a, ((ch40) obj).f37920a);
    }

    public final int hashCode() {
        return this.f37920a.hashCode();
    }
}
