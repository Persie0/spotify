package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class iu2 implements mu2 {

    /* JADX INFO: renamed from: a */
    public final String f105839a;

    public iu2(String str) {
        this.f105839a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu2) && wj50.m88271j(this.f105839a, ((iu2) obj).f105839a);
    }

    @Override // p204p.mu2
    public final String getSessionId() {
        return this.f105839a;
    }

    public final int hashCode() {
        return this.f105839a.hashCode();
    }
}
