package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xts {

    /* JADX INFO: renamed from: a */
    public final String f265916a;

    /* JADX INFO: renamed from: b */
    public final boolean f265917b;

    public xts(String str, boolean z) {
        this.f265916a = str;
        this.f265917b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xts)) {
            return false;
        }
        xts xtsVar = (xts) obj;
        return this.f265916a.equals(xtsVar.f265916a) && this.f265917b == xtsVar.f265917b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265917b) + (this.f265916a.hashCode() * 31);
    }
}
