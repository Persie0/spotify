package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ofw0 implements sfw0 {

    /* JADX INFO: renamed from: a */
    public final String f164917a;

    public ofw0(String str) {
        this.f164917a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofw0) && wj50.m88271j(this.f164917a, ((ofw0) obj).f164917a);
    }

    public final int hashCode() {
        return this.f164917a.hashCode();
    }
}
