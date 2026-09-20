package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w7i {

    /* JADX INFO: renamed from: a */
    public final String f248689a;

    public w7i(String str) {
        this.f248689a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7i) && wj50.m88271j(this.f248689a, ((w7i) obj).f248689a);
    }

    public final int hashCode() {
        return this.f248689a.hashCode();
    }
}
