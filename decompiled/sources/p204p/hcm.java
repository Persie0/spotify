package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class hcm implements jcm {
    public static final Parcelable.Creator<hcm> CREATOR = new pkl(17);

    /* JADX INFO: renamed from: a */
    public final List f89836a;

    public hcm(List list) {
        this.f89836a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcm) && wj50.m88271j(this.f89836a, ((hcm) obj).f89836a);
    }

    public final int hashCode() {
        return this.f89836a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f89836a);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }

    @Override // p204p.jcm
    /* JADX INFO: renamed from: z */
    public final List mo47125z() {
        return this.f89836a;
    }
}
