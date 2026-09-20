package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w56 implements x56 {

    /* JADX INFO: renamed from: a */
    public final String f248007a;

    public w56(String str) {
        this.f248007a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w56) && wj50.m88271j(this.f248007a, ((w56) obj).f248007a);
    }

    public final int hashCode() {
        return this.f248007a.hashCode();
    }
}
