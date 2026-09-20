package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vlc1 implements xlc1 {
    public static final Parcelable.Creator<vlc1> CREATOR = new nlc1(6);

    /* JADX INFO: renamed from: a */
    public final String f242455a;

    public vlc1(String str) {
        this.f242455a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlc1) && wj50.m88271j(this.f242455a, ((vlc1) obj).f242455a);
    }

    public final int hashCode() {
        return this.f242455a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242455a);
    }
}
