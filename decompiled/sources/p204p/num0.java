package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class num0 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static oum0 m65709a(Parcel parcel) {
        int i;
        int i2;
        String string = parcel.readString();
        wj50.m88279p(string);
        String string2 = parcel.readString();
        wj50.m88279p(string2);
        String string3 = parcel.readString();
        wj50.m88279p(string3);
        if (string3 == null) {
            throw new NullPointerException("Name is null");
        }
        if (string3.equals("UNKNOWN")) {
            i = 1;
        } else if (string3.equals("COMPUTER")) {
            i = 2;
        } else if (string3.equals("TABLET")) {
            i = 3;
        } else if (string3.equals("SMARTPHONE")) {
            i = 4;
        } else if (string3.equals("SPEAKER")) {
            i = 5;
        } else if (string3.equals("HEADPHONES")) {
            i = 6;
        } else if (string3.equals("TV")) {
            i = 7;
        } else if (string3.equals("AVR")) {
            i = 8;
        } else if (string3.equals("STB")) {
            i = 9;
        } else if (string3.equals("AUDIO_DONGLE")) {
            i = 10;
        } else if (string3.equals("GAME_CONSOLE")) {
            i = 11;
        } else if (string3.equals("CAST_VIDEO")) {
            i = 12;
        } else if (string3.equals("CAST_AUDIO")) {
            i = 13;
        } else if (string3.equals("AUTOMOBILE")) {
            i = 14;
        } else if (string3.equals("SMARTWATCH")) {
            i = 15;
        } else if (string3.equals("CHROMEBOOK")) {
            i = 16;
        } else if (string3.equals("UNKNOWN_SPOTIFY")) {
            i = 17;
        } else {
            if (!string3.equals("HOME_THING")) {
                throw new IllegalArgumentException("No enum constant com.spotify.jam.jam.Jam.PlaybackDeviceInfo.DeviceType.".concat(string3));
            }
            i = 18;
        }
        int i3 = i;
        String string4 = parcel.readString();
        wj50.m88279p(string4);
        if (string4 == null) {
            throw new NullPointerException("Name is null");
        }
        if (string4.equals("BLUETOOTH")) {
            i2 = 1;
        } else if (string4.equals("AIRPLAY")) {
            i2 = 2;
        } else if (string4.equals("CAST")) {
            i2 = 3;
        } else {
            if (!string4.equals("CONNECT")) {
                throw new IllegalArgumentException("No enum constant com.spotify.jam.jam.Jam.PlaybackDeviceInfo.TechType.".concat(string4));
            }
            i2 = 4;
        }
        int i4 = i2;
        boolean z = false;
        if (parcel.readByte() != 0) {
            z = true;
        }
        boolean z2 = parcel.readByte() != 0 ? true : z;
        z = parcel.readByte() != 0;
        String string5 = parcel.readString();
        return new oum0(new xx50(string, string2, i3, i4, z, new vx50(z2, z, string5 != null ? new wx50(string5) : null)));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m65709a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new oum0[i];
    }
}
