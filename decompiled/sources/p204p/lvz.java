package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lvz extends mvz {

    /* JADX INFO: renamed from: a */
    public final String f137423a;

    public lvz(String str) {
        this.f137423a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvz) && wj50.m88271j(this.f137423a, ((lvz) obj).f137423a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f137423a;
    }

    public final int hashCode() {
        return this.f137423a.hashCode();
    }
}
