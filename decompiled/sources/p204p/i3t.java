package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class i3t implements Parcelable {
    public static final Parcelable.Creator<i3t> CREATOR = new f9s(22);

    /* JADX INFO: renamed from: a */
    public final Set f98268a;

    public i3t(Set set) {
        this.f98268a = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3t) && wj50.m88271j(this.f98268a, ((i3t) obj).f98268a);
    }

    public final int hashCode() {
        return this.f98268a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f98268a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString((String) itM64022o.next());
        }
    }
}
