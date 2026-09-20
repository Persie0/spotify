package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l9e0 extends h1h1 {

    /* JADX INFO: renamed from: b */
    public final String f131073b;

    public l9e0(String str) {
        this.f131073b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9e0) && wj50.m88271j(this.f131073b, ((l9e0) obj).f131073b);
    }

    public final int hashCode() {
        return this.f131073b.hashCode();
    }
}
