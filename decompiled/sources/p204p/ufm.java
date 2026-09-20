package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ufm {

    /* JADX INFO: renamed from: a */
    public final String f229839a;

    public ufm(String str) {
        this.f229839a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufm) && wj50.m88271j(this.f229839a, ((ufm) obj).f229839a);
    }

    public final int hashCode() {
        return (this.f229839a.hashCode() * 31) - 2050691869;
    }
}
