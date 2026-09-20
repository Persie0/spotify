package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f88318a;

    public h71(String str) {
        this.f88318a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h71) && wj50.m88271j(this.f88318a, ((h71) obj).f88318a);
    }

    public final int hashCode() {
        String str = this.f88318a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
