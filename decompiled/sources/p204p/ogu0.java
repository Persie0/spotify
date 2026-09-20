package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ogu0 implements pgu0 {

    /* JADX INFO: renamed from: a */
    public final String f165276a;

    public ogu0(String str) {
        this.f165276a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogu0) && wj50.m88271j(this.f165276a, ((ogu0) obj).f165276a);
    }

    public final int hashCode() {
        return this.f165276a.hashCode();
    }
}
