package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class o8j {

    /* JADX INFO: renamed from: a */
    public final String f162818a;

    /* JADX INFO: renamed from: b */
    public final Long f162819b;

    /* JADX INFO: renamed from: c */
    public final Long f162820c;

    /* JADX INFO: renamed from: d */
    public final String f162821d;

    /* JADX INFO: renamed from: e */
    public final List f162822e;

    public o8j(String str, Long l, Long l2, String str2, List list) {
        this.f162818a = str;
        this.f162819b = l;
        this.f162820c = l2;
        this.f162821d = str2;
        this.f162822e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8j)) {
            return false;
        }
        o8j o8jVar = (o8j) obj;
        return wj50.m88271j(this.f162818a, o8jVar.f162818a) && wj50.m88271j(this.f162819b, o8jVar.f162819b) && wj50.m88271j(this.f162820c, o8jVar.f162820c) && wj50.m88271j(this.f162821d, o8jVar.f162821d) && wj50.m88271j(this.f162822e, o8jVar.f162822e);
    }

    public final int hashCode() {
        int iHashCode = this.f162818a.hashCode() * 31;
        Long l = this.f162819b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f162820c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f162821d;
        return this.f162822e.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
