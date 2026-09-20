package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ave1 implements dve1 {

    /* JADX INFO: renamed from: a */
    public final String f20179a;

    public ave1(String str) {
        this.f20179a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ave1) && wj50.m88271j(this.f20179a, ((ave1) obj).f20179a);
    }

    public final int hashCode() {
        return this.f20179a.hashCode();
    }
}
