package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fs00 implements hs00 {

    /* JADX INFO: renamed from: a */
    public final String f72719a;

    public fs00(String str) {
        this.f72719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs00) && wj50.m88271j(this.f72719a, ((fs00) obj).f72719a);
    }

    public final int hashCode() {
        return this.f72719a.hashCode();
    }
}
