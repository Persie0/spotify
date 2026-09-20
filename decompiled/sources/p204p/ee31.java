package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ee31 implements ie31 {

    /* JADX INFO: renamed from: a */
    public final String f58666a;

    public ee31(String str) {
        this.f58666a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee31) && wj50.m88271j(this.f58666a, ((ee31) obj).f58666a);
    }

    public final int hashCode() {
        return this.f58666a.hashCode();
    }
}
