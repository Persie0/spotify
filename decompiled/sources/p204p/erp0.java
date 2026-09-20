package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class erp0 extends AbstractC2206o9 {
    public static final Parcelable.Creator<erp0> CREATOR = new vnp0(3);

    /* JADX INFO: renamed from: a */
    public final Set f62158a;

    public erp0(Set set) {
        this.f62158a = set;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erp0) && wj50.m88271j(this.f62158a, ((erp0) obj).f62158a);
    }

    public final int hashCode() {
        return this.f62158a.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final Set m39824k() {
        return this.f62158a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f62158a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString((String) itM64022o.next());
        }
    }
}
