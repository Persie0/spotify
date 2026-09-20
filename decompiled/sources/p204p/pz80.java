package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pz80 implements qt60 {

    /* JADX INFO: renamed from: a */
    public final String f183634a;

    public pz80(String str) {
        this.f183634a = str;
    }

    @Override // p204p.qt60
    /* JADX INFO: renamed from: a */
    public final String mo30113a() {
        return this.f183634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz80) && wj50.m88271j(this.f183634a, ((pz80) obj).f183634a);
    }

    public final int hashCode() {
        return this.f183634a.hashCode();
    }
}
