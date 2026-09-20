package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jum0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        String string = parcel.readString();
        wj50.m88279p(string);
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("UNKNOWN")) {
            i = 1;
        } else if (string.equals("CONTROL")) {
            i = 2;
        } else {
            if (!string.equals("LISTEN_AND_CONTROL")) {
                throw new IllegalArgumentException("No enum constant com.spotify.jam.jam.Jam.AvailableJam.PlaybackControl.".concat(string));
            }
            i = 3;
        }
        return new kum0(new ax50(i, new yw50(parcel.readByte() != 0)));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new kum0[i];
    }
}
