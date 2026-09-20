package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class j38 implements Parcelable {
    public static final Parcelable.Creator<j38> CREATOR = new na7(20);

    /* JADX INFO: renamed from: a */
    public final ArrayList f108303a;

    public j38(ArrayList arrayList) {
        this.f108303a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j38) && this.f108303a.equals(((j38) obj).f108303a);
    }

    public final int hashCode() {
        return this.f108303a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f108303a, parcel);
        while (itM42469m.hasNext()) {
            ((m1z0) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
