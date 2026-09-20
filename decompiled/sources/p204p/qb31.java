package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qb31 implements Parcelable {
    public static final Parcelable.Creator<qb31> CREATOR = new q321(28);

    /* JADX INFO: renamed from: a */
    public final Object f186988a;

    public qb31(List list) {
        this.f186988a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb31) && this.f186988a.equals(((qb31) obj).f186988a);
    }

    public final int hashCode() {
        return this.f186988a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? r0 = this.f186988a;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((hfz0) it.next()).writeToParcel(parcel, i);
        }
    }
}
