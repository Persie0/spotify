package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oam0 implements qam0 {

    /* JADX INFO: renamed from: a */
    public final String f163365a;

    public oam0(String str) {
        this.f163365a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oam0) && wj50.m88271j(this.f163365a, ((oam0) obj).f163365a);
    }

    public final int hashCode() {
        return this.f163365a.hashCode();
    }
}
