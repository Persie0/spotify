package p204p;

import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class bld implements cld {

    /* JADX INFO: renamed from: a */
    public final List f28168a;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public bld(List list) {
        this.f28168a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bld) && wj50.m88271j(this.f28168a, ((bld) obj).f28168a);
    }

    public final int hashCode() {
        return this.f28168a.hashCode();
    }
}
