package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kum0 implements Parcelable {
    public static final jum0 CREATOR = new jum0();

    /* JADX INFO: renamed from: a */
    public final ax50 f126642a;

    public kum0(ax50 ax50Var) {
        this.f126642a = ax50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        ax50 ax50Var = this.f126642a;
        int i2 = ax50Var.f20768a;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "CONTROL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "LISTEN_AND_CONTROL";
        }
        parcel.writeString(str);
        parcel.writeByte(ax50Var.f20769b.f276867a ? (byte) 1 : (byte) 0);
    }
}
