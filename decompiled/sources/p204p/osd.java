package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class osd {

    /* JADX INFO: renamed from: a */
    public final String f168801a;

    public osd(String str) {
        this.f168801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osd) && wj50.m88271j(this.f168801a, ((osd) obj).f168801a);
    }

    public final int hashCode() {
        return this.f168801a.hashCode();
    }
}
