package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wqc implements xqc {

    /* JADX INFO: renamed from: a */
    public final String f253997a;

    /* JADX INFO: renamed from: b */
    public final String f253998b;

    /* JADX INFO: renamed from: c */
    public final List f253999c;

    public wqc(String str, List list, String str2) {
        this.f253997a = str;
        this.f253998b = str2;
        this.f253999c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqc)) {
            return false;
        }
        wqc wqcVar = (wqc) obj;
        return wj50.m88271j(this.f253997a, wqcVar.f253997a) && wj50.m88271j(this.f253998b, wqcVar.f253998b) && wj50.m88271j(this.f253999c, wqcVar.f253999c);
    }

    public final int hashCode() {
        return this.f253999c.hashCode() + s571.m77243b(this.f253997a.hashCode() * 31, 31, this.f253998b);
    }
}
