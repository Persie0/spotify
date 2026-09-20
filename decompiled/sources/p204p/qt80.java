package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qt80 implements rt80 {
    public static final Parcelable.Creator<qt80> CREATOR = new ct80(11);

    /* JADX INFO: renamed from: a */
    public final Set f192317a;

    public qt80(Set set) {
        this.f192317a = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qt80) && wj50.m88271j(this.f192317a, ((qt80) obj).f192317a);
    }

    public final int hashCode() {
        return this.f192317a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f192317a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString(((in80) itM64022o.next()).name());
        }
    }
}
