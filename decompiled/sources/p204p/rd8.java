package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rd8 implements yd8 {

    /* JADX INFO: renamed from: a */
    public final String f198060a;

    public rd8(String str) {
        this.f198060a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd8) && wj50.m88271j(this.f198060a, ((rd8) obj).f198060a);
    }

    public final int hashCode() {
        return this.f198060a.hashCode();
    }
}
