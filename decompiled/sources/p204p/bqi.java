package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bqi {

    /* JADX INFO: renamed from: a */
    public final String f29817a;

    /* JADX INFO: renamed from: b */
    public final boolean f29818b;

    public bqi(String str, boolean z) {
        this.f29817a = str;
        this.f29818b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqi)) {
            return false;
        }
        bqi bqiVar = (bqi) obj;
        return wj50.m88271j(this.f29817a, bqiVar.f29817a) && this.f29818b == bqiVar.f29818b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29818b) + (this.f29817a.hashCode() * 31);
    }
}
