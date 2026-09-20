package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final String f129662a;

    public l4d1(String str) {
        this.f129662a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4d1) && wj50.m88271j(this.f129662a, ((l4d1) obj).f129662a);
    }

    public final int hashCode() {
        return this.f129662a.hashCode();
    }
}
