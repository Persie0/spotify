package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class fk80 implements Parcelable, Comparable {
    public static final Parcelable.Creator<fk80> CREATOR = new i980(11);

    /* JADX INFO: renamed from: a */
    public final int f70497a;

    public /* synthetic */ fk80(int i) {
        this.f70497a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return wj50.m88282u(this.f70497a, ((fk80) obj).f70497a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fk80) {
            return this.f70497a == ((fk80) obj).f70497a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70497a);
    }

    public final String toString() {
        return edb.m38563l("LineIndex(value=", this.f70497a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f70497a);
    }
}
