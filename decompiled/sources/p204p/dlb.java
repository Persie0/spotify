package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dlb implements glb {

    /* JADX INFO: renamed from: a */
    public final String f50173a;

    /* JADX INFO: renamed from: b */
    public final String f50174b;

    public /* synthetic */ dlb(String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m36352a() {
        return this.f50174b;
    }

    /* JADX INFO: renamed from: b */
    public final String m36353b() {
        return this.f50173a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlb)) {
            return false;
        }
        dlb dlbVar = (dlb) obj;
        return wj50.m88271j(this.f50173a, dlbVar.f50173a) && wj50.m88271j(this.f50174b, dlbVar.f50174b);
    }

    public final int hashCode() {
        int iHashCode = this.f50173a.hashCode() * 31;
        String str = this.f50174b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public dlb(String str, String str2) {
        this.f50173a = str;
        this.f50174b = str2;
    }
}
