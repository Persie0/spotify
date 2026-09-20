package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class cmx0 implements Parcelable {
    public static final Parcelable.Creator<cmx0> CREATOR = new xxw0(23);

    /* JADX INFO: renamed from: a */
    public final List f39811a;

    public cmx0(List list) {
        this.f39811a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmx0) && wj50.m88271j(this.f39811a, ((cmx0) obj).f39811a);
    }

    public final int hashCode() {
        return this.f39811a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f39811a);
        while (itM42468l.hasNext()) {
            ((ftw0) itM42468l.next()).writeToParcel(parcel, i);
        }
    }
}
