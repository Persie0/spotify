package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pji0 implements rji0 {

    /* JADX INFO: renamed from: a */
    public final String f178270a;

    public pji0(String str) {
        this.f178270a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pji0) && wj50.m88271j(this.f178270a, ((pji0) obj).f178270a);
    }

    public final int hashCode() {
        return this.f178270a.hashCode();
    }
}
