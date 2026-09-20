package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u4b {

    /* JADX INFO: renamed from: a */
    public final String f226642a;

    public u4b(String str) {
        this.f226642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4b) && wj50.m88271j(this.f226642a, ((u4b) obj).f226642a);
    }

    public final int hashCode() {
        return this.f226642a.hashCode();
    }
}
