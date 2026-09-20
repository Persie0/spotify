package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tfz extends vfz {
    public static final Parcelable.Creator<tfz> CREATOR = new c2z(23);

    /* JADX INFO: renamed from: a */
    public final int f220083a;

    public tfz(int i) {
        this.f220083a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfz) && this.f220083a == ((tfz) obj).f220083a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f220083a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.f220083a) {
            case 1:
                str = "ALBUM";
                break;
            case 2:
                str = "ARTIST";
                break;
            case 3:
                str = "AUDIOBOOK";
                break;
            case 4:
                str = "GENRE";
                break;
            case 5:
                str = "PLAYLIST";
                break;
            case 6:
                str = "PROFILE";
                break;
            case 7:
                str = "TRACK";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
