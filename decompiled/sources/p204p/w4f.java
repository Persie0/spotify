package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w4f implements y4f {

    /* JADX INFO: renamed from: a */
    public final String f247801a;

    public w4f(String str) {
        this.f247801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4f) && wj50.m88271j(this.f247801a, ((w4f) obj).f247801a);
    }

    public final int hashCode() {
        return this.f247801a.hashCode();
    }
}
