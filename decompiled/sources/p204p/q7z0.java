package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q7z0 {

    /* JADX INFO: renamed from: a */
    public final String f186195a;

    public q7z0(String str) {
        this.f186195a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q7z0) && wj50.m88271j(this.f186195a, ((q7z0) obj).f186195a);
    }

    public final int hashCode() {
        String str = this.f186195a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public /* synthetic */ q7z0(String str, int i) {
        this(str);
    }
}
