package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zcf implements hdf {

    /* JADX INFO: renamed from: a */
    public final String f281502a;

    /* JADX INFO: renamed from: b */
    public final sef f281503b;

    public zcf(String str, sef sefVar) {
        this.f281502a = str;
        this.f281503b = sefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcf)) {
            return false;
        }
        zcf zcfVar = (zcf) obj;
        return wj50.m88271j(this.f281502a, zcfVar.f281502a) && wj50.m88271j(this.f281503b, zcfVar.f281503b);
    }

    public final int hashCode() {
        return this.f281503b.hashCode() + (this.f281502a.hashCode() * 31);
    }
}
