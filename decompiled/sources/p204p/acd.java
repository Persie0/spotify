package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class acd implements bcd {

    /* JADX INFO: renamed from: a */
    public final String f14317a;

    /* JADX INFO: renamed from: b */
    public final boolean f14318b;

    /* JADX INFO: renamed from: c */
    public final akk f14319c;

    /* JADX INFO: renamed from: d */
    public final List f14320d;

    public acd(String str, boolean z, akk akkVar, List list) {
        this.f14317a = str;
        this.f14318b = z;
        this.f14319c = akkVar;
        this.f14320d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acd)) {
            return false;
        }
        acd acdVar = (acd) obj;
        return wj50.m88271j(this.f14317a, acdVar.f14317a) && this.f14318b == acdVar.f14318b && wj50.m88271j(this.f14319c, acdVar.f14319c) && wj50.m88271j(this.f14320d, acdVar.f14320d);
    }

    public final int hashCode() {
        String str = this.f14317a;
        return this.f14320d.hashCode() + ((this.f14319c.hashCode() + s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f14318b)) * 31);
    }
}
