package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class oaj0 implements taj0 {
    public static final Parcelable.Creator<oaj0> CREATOR = new rri0(17);

    /* JADX INFO: renamed from: a */
    public final int f163346a;

    public oaj0(int i) {
        this.f163346a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oaj0) && this.f163346a == ((oaj0) obj).f163346a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f163346a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.f163346a) {
            case 1:
                str = "CAST";
                break;
            case 2:
                str = "SPEAKER";
                break;
            case 3:
                str = "GAME_CONSOLE";
                break;
            case 4:
                str = "TV";
                break;
            case 5:
                str = "AVR";
                break;
            case 6:
                str = "HOME_THING";
                break;
            case 7:
                str = "AUTOMOBILE";
                break;
            case 8:
                str = "HEADPHONES";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
