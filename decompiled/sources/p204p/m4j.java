package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class m4j implements Parcelable {
    public static final Parcelable.Creator<m4j> CREATOR = new f2i(22);

    /* JADX INFO: renamed from: a */
    public final ArrayList f139973a;

    public m4j(ArrayList arrayList) {
        this.f139973a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4j) && this.f139973a.equals(((m4j) obj).f139973a);
    }

    public final int hashCode() {
        return this.f139973a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f139973a, parcel);
        while (itM42469m.hasNext()) {
            ((n2j) itM42469m.next()).writeToParcel(parcel, i);
        }
    }
}
