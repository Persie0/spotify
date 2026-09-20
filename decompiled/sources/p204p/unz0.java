package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class unz0 implements Parcelable {
    public static final Parcelable.Creator<unz0> CREATOR = new vcz0(8);

    /* JADX INFO: renamed from: a */
    public final Object f232291a;

    public unz0(List list) {
        this.f232291a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unz0) && this.f232291a.equals(((unz0) obj).f232291a);
    }

    public final int hashCode() {
        return this.f232291a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? r0 = this.f232291a;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((tnz0) it.next()).writeToParcel(parcel, i);
        }
    }
}
