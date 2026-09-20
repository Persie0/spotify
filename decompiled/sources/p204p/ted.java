package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ted {

    /* JADX INFO: renamed from: a */
    public final long f219674a;

    /* JADX INFO: renamed from: b */
    public final int f219675b;

    public ted(int i, long j) {
        this.f219674a = j;
        this.f219675b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ted)) {
            return false;
        }
        ted tedVar = (ted) obj;
        return this.f219674a == tedVar.f219674a && this.f219675b == tedVar.f219675b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219675b) + (Long.hashCode(this.f219674a) * 31);
    }
}
