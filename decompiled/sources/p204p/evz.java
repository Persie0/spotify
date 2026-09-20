package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class evz {

    /* JADX INFO: renamed from: a */
    public final String f63370a;

    /* JADX INFO: renamed from: b */
    public final String f63371b;

    /* JADX INFO: renamed from: c */
    public final boolean f63372c;

    public evz(String str, String str2, boolean z) {
        this.f63370a = str;
        this.f63371b = str2;
        this.f63372c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evz)) {
            return false;
        }
        evz evzVar = (evz) obj;
        return wj50.m88271j(this.f63370a, evzVar.f63370a) && wj50.m88271j(this.f63371b, evzVar.f63371b) && this.f63372c == evzVar.f63372c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63372c) + s571.m77243b(this.f63370a.hashCode() * 31, 31, this.f63371b);
    }
}
