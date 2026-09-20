package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f54554a;

    public dz71(String str) {
        this.f54554a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f54554a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz71) && wj50.m88271j(this.f54554a, ((dz71) obj).f54554a);
    }

    public final int hashCode() {
        return this.f54554a.hashCode();
    }
}
