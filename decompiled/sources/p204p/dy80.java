package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dy80 implements qt60 {

    /* JADX INFO: renamed from: a */
    public final String f54232a;

    public dy80(String str) {
        this.f54232a = str;
    }

    @Override // p204p.qt60
    /* JADX INFO: renamed from: a */
    public final String mo30113a() {
        return this.f54232a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy80) && wj50.m88271j(this.f54232a, ((dy80) obj).f54232a);
    }

    public final int hashCode() {
        return this.f54232a.hashCode() * 31;
    }
}
