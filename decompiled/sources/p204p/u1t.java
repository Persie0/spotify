package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class u1t implements Parcelable {
    public static final Parcelable.Creator<u1t> CREATOR = new f9s(20);

    /* JADX INFO: renamed from: a */
    public final Set f225915a;

    public u1t(Set set) {
        this.f225915a = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1t) && wj50.m88271j(this.f225915a, ((u1t) obj).f225915a);
    }

    public final int hashCode() {
        return this.f225915a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f225915a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString((String) itM64022o.next());
        }
    }
}
