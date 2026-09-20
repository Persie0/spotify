package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dp71 implements np71 {
    public static final Parcelable.Creator<dp71> CREATOR = new c071(17);

    /* JADX INFO: renamed from: a */
    public final ArrayList f51205a;

    public dp71(ArrayList arrayList) {
        this.f51205a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp71) && this.f51205a.equals(((dp71) obj).f51205a);
    }

    public final List getItems() {
        return this.f51205a;
    }

    public final int hashCode() {
        return this.f51205a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f51205a, parcel);
        while (itM42469m.hasNext()) {
            ((fm71) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
