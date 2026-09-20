package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class udl0 implements ydl0 {

    /* JADX INFO: renamed from: a */
    public final String f229268a;

    public udl0(String str) {
        this.f229268a = str;
    }

    @Override // p204p.ydl0
    /* JADX INFO: renamed from: b */
    public final String mo25734b() {
        return this.f229268a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udl0) && wj50.m88271j(this.f229268a, ((udl0) obj).f229268a);
    }

    public final int hashCode() {
        return this.f229268a.hashCode();
    }
}
