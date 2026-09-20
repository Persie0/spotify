package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w8d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f248908a;

    public w8d(String str) {
        this.f248908a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8d) && wj50.m88271j(this.f248908a, ((w8d) obj).f248908a);
    }

    public final int hashCode() {
        return this.f248908a.hashCode();
    }
}
