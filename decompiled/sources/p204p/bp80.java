package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bp80 implements qt60 {

    /* JADX INFO: renamed from: a */
    public final String f29351a;

    public bp80(String str) {
        this.f29351a = str;
    }

    @Override // p204p.qt60
    /* JADX INFO: renamed from: a */
    public final String mo30113a() {
        return this.f29351a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp80) && this.f29351a.equals(((bp80) obj).f29351a) && Float.compare(0.7f, 0.7f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.7f) + mt60.m62800g(15, this.f29351a.hashCode() * 31, 31);
    }
}
