package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class pvq implements Parcelable {
    public static final Parcelable.Creator<pvq> CREATOR = new lso(12);

    /* JADX INFO: renamed from: a */
    public final String f181817a;

    public pvq(String str) {
        this.f181817a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvq) && wj50.m88271j(this.f181817a, ((pvq) obj).f181817a);
    }

    public final int hashCode() {
        return this.f181817a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f181817a);
    }
}
