package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class opc {

    /* JADX INFO: renamed from: a */
    public final String f167863a;

    public opc(String str) {
        this.f167863a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opc) && wj50.m88271j(this.f167863a, ((opc) obj).f167863a);
    }

    public final int hashCode() {
        return this.f167863a.hashCode();
    }
}
