package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class z211 extends a311 {
    public static final Parcelable.Creator<z211> CREATOR = new u111(3);

    /* JADX INFO: renamed from: a */
    public final String f278465a;

    public z211(String str) {
        this.f278465a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z211) && wj50.m88271j(this.f278465a, ((z211) obj).f278465a);
    }

    public final int hashCode() {
        return this.f278465a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f278465a);
    }
}
