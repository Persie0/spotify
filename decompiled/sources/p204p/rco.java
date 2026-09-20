package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class rco {

    /* JADX INFO: renamed from: a */
    public final String f197901a;

    /* JADX INFO: renamed from: b */
    public final String f197902b;

    /* JADX INFO: renamed from: c */
    public final boolean f197903c;

    /* JADX INFO: renamed from: d */
    public final Map f197904d;

    public rco(String str, String str2, boolean z, Map map) {
        this.f197901a = str;
        this.f197902b = str2;
        this.f197903c = z;
        this.f197904d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rco)) {
            return false;
        }
        rco rcoVar = (rco) obj;
        return wj50.m88271j(this.f197901a, rcoVar.f197901a) && wj50.m88271j(this.f197902b, rcoVar.f197902b) && this.f197903c == rcoVar.f197903c && wj50.m88271j(this.f197904d, rcoVar.f197904d);
    }

    public final int hashCode() {
        String str = this.f197901a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f197902b;
        return this.f197904d.hashCode() + s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f197903c);
    }
}
