package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iz80 implements qt60 {

    /* JADX INFO: renamed from: a */
    public final String f107167a;

    public iz80(String str) {
        this.f107167a = str;
    }

    @Override // p204p.qt60
    /* JADX INFO: renamed from: a */
    public final String mo30113a() {
        return this.f107167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz80) && wj50.m88271j(this.f107167a, ((iz80) obj).f107167a);
    }

    public final int hashCode() {
        return this.f107167a.hashCode();
    }
}
