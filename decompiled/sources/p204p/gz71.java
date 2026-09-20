package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f85863a;

    public gz71(String str) {
        this.f85863a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f85863a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz71) && wj50.m88271j(this.f85863a, ((gz71) obj).f85863a);
    }

    public final int hashCode() {
        return this.f85863a.hashCode();
    }
}
