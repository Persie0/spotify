package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class kml implements lml {

    /* JADX INFO: renamed from: a */
    public final List f124173a;

    public kml(List list) {
        this.f124173a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kml) && wj50.m88271j(this.f124173a, ((kml) obj).f124173a);
    }

    public final int hashCode() {
        return this.f124173a.hashCode();
    }
}
