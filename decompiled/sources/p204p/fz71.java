package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f74940a;

    public fz71(String str) {
        this.f74940a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f74940a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz71) && wj50.m88271j(this.f74940a, ((fz71) obj).f74940a);
    }

    public final int hashCode() {
        return this.f74940a.hashCode();
    }
}
