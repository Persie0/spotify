package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class v890 implements Parcelable {
    public static final Parcelable.Creator<v890> CREATOR = new x390(9);

    /* JADX INFO: renamed from: a */
    public final String f238443a;

    public v890(String str) {
        this.f238443a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v890) && wj50.m88271j(this.f238443a, ((v890) obj).f238443a);
    }

    public final int hashCode() {
        return this.f238443a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238443a);
    }
}
