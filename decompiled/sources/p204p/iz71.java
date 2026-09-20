package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f107160a;

    public iz71(String str) {
        this.f107160a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f107160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz71) && wj50.m88271j(this.f107160a, ((iz71) obj).f107160a);
    }

    public final int hashCode() {
        return this.f107160a.hashCode();
    }
}
