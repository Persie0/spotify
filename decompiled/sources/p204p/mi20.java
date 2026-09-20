package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mi20 implements oi20 {

    /* JADX INFO: renamed from: a */
    public final String f143916a;

    public mi20(String str) {
        this.f143916a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m61812a() {
        return this.f143916a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi20) && wj50.m88271j(this.f143916a, ((mi20) obj).f143916a);
    }

    public final int hashCode() {
        return this.f143916a.hashCode();
    }
}
