package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lp71 implements np71 {
    public static final Parcelable.Creator<lp71> CREATOR = new c071(24);

    /* JADX INFO: renamed from: a */
    public final ArrayList f135695a;

    public lp71(ArrayList arrayList) {
        this.f135695a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp71) && this.f135695a.equals(((lp71) obj).f135695a);
    }

    public final List getItems() {
        return this.f135695a;
    }

    public final int hashCode() {
        return this.f135695a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f135695a, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
    }
}
