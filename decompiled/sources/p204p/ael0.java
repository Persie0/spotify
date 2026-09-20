package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ael0 implements ydl0 {

    /* JADX INFO: renamed from: a */
    public final String f14896a;

    public ael0(String str) {
        this.f14896a = str;
    }

    @Override // p204p.ydl0
    /* JADX INFO: renamed from: b */
    public final String mo25734b() {
        return this.f14896a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ael0) && wj50.m88271j(this.f14896a, ((ael0) obj).f14896a);
    }

    public final int hashCode() {
        return this.f14896a.hashCode();
    }
}
