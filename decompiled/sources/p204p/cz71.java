package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f43489a;

    public cz71(String str) {
        this.f43489a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f43489a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz71) && wj50.m88271j(this.f43489a, ((cz71) obj).f43489a);
    }

    public final int hashCode() {
        return this.f43489a.hashCode();
    }
}
