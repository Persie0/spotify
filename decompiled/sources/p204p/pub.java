package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pub {

    /* JADX INFO: renamed from: a */
    public final oub f181402a;

    /* JADX INFO: renamed from: b */
    public final boolean f181403b;

    /* JADX INFO: renamed from: c */
    public final boolean f181404c;

    public pub(oub oubVar, boolean z, boolean z2) {
        this.f181402a = oubVar;
        this.f181403b = z;
        this.f181404c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pub)) {
            return false;
        }
        pub pubVar = (pub) obj;
        return this.f181402a == pubVar.f181402a && this.f181403b == pubVar.f181403b && this.f181404c == pubVar.f181404c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181404c) + s571.m77245d(this.f181402a.hashCode() * 31, 31, this.f181403b);
    }
}
