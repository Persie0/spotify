package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w6i extends b7i {

    /* JADX INFO: renamed from: a */
    public final String f248388a;

    public w6i(String str) {
        this.f248388a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6i) && wj50.m88271j(this.f248388a, ((w6i) obj).f248388a);
    }

    public final int hashCode() {
        return this.f248388a.hashCode();
    }
}
