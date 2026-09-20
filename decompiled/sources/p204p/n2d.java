package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n2d {

    /* JADX INFO: renamed from: a */
    public final String f149739a;

    public n2d(String str) {
        this.f149739a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2d) && wj50.m88271j(this.f149739a, ((n2d) obj).f149739a);
    }

    public final int hashCode() {
        return this.f149739a.hashCode();
    }
}
