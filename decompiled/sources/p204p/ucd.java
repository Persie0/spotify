package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ucd implements qdd {

    /* JADX INFO: renamed from: a */
    public final lcd f229018a;

    public ucd(lcd lcdVar) {
        this.f229018a = lcdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucd) && this.f229018a == ((ucd) obj).f229018a;
    }

    public final int hashCode() {
        return this.f229018a.hashCode();
    }
}
