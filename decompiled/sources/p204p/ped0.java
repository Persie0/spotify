package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class ped0 implements sed0 {
    public static final Parcelable.Creator<ped0> CREATOR = new f4c0(27);

    /* JADX INFO: renamed from: a */
    public final ArrayList f176736a;

    public ped0(ArrayList arrayList) {
        this.f176736a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ped0) && this.f176736a.equals(((ped0) obj).f176736a);
    }

    public final int hashCode() {
        return this.f176736a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.f176736a;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sl00) it.next()).writeToParcel(parcel, i);
        }
    }
}
