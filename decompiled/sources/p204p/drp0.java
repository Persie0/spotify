package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class drp0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<drp0> CREATOR = new vnp0(2);

    /* JADX INFO: renamed from: a */
    public final Set f52375a;

    public drp0(Set set) {
        this.f52375a = set;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drp0) && wj50.m88271j(this.f52375a, ((drp0) obj).f52375a);
    }

    public final int hashCode() {
        return this.f52375a.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final Set m36738k() {
        return this.f52375a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f52375a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString((String) itM64022o.next());
        }
    }
}
