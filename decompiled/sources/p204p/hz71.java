package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hz71 extends jz71 {

    /* JADX INFO: renamed from: a */
    public final String f96808a;

    public hz71(String str) {
        this.f96808a = str;
    }

    @Override // p204p.jz71
    /* JADX INFO: renamed from: a */
    public final String mo30975a() {
        return this.f96808a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz71) && wj50.m88271j(this.f96808a, ((hz71) obj).f96808a);
    }

    public final int hashCode() {
        return this.f96808a.hashCode();
    }
}
