package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pcm implements qcm {

    /* JADX INFO: renamed from: a */
    public final String f176173a;

    public pcm(String str) {
        this.f176173a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pcm) && wj50.m88271j(this.f176173a, ((pcm) obj).f176173a);
    }

    @Override // p204p.qcm
    public final String getMessage() {
        return this.f176173a;
    }

    public final int hashCode() {
        String str = this.f176173a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
