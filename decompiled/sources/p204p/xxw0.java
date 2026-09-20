package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class xxw0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267118a;

    public /* synthetic */ xxw0(int i) {
        this.f267118a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f267118a) {
            case 0:
                parcel.readInt();
                return yxw0.f277334a;
            case 1:
                return new zxw0(parcel.readInt());
            case 2:
                parcel.readInt();
                return ayw0.f21369a;
            case 3:
                return new pzw0(parcel.readString(), parcel.readInt() != 0);
            case 4:
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(h4b0.valueOf(parcel.readString()), g4b0.CREATOR.createFromParcel(parcel));
                }
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap2.put(hg60.valueOf(parcel.readString()), gg60.CREATOR.createFromParcel(parcel));
                }
                return new o0x0(linkedHashMap, linkedHashMap2);
            case 5:
                return new c5x0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                return new m5x0(parcel.readString());
            case 7:
                parcel.readInt();
                return n5x0.f150637a;
            case 8:
                parcel.readInt();
                return b6x0.f24069a;
            case 9:
                return new i6x0(parcel.readString());
            case 10:
                return new n6x0(parcel.readParcelable(n6x0.class.getClassLoader()));
            case 11:
                return new ResultReceiver(parcel);
            case 12:
                return new l8x0(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString());
            case 13:
                return new wcx0(parcel.readString());
            case 14:
                return new sfx0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                long j = parcel.readLong();
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("UNSPECIFIED")) {
                    i = 1;
                } else if (string3.equals("CAMERA")) {
                    i = 2;
                } else {
                    if (!string3.equals("LIBRARY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.RichMediaMetadata.UploadSource.".concat(string3));
                    }
                    i = 3;
                }
                return new tfx0(string, string2, i7, i8, j, i, parcel.readLong());
            case 16:
                return new zgx0(parcel.readString());
            case 17:
                return new uix0(parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new gkx0((e301) parcel.readParcelable(gkx0.class.getClassLoader()), gc5.CREATOR.createFromParcel(parcel));
            case 19:
                return new zkx0(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), i8b0.CREATOR.createFromParcel(parcel));
            case 20:
                xkx0 xkx0Var = (xkx0) parcel.readParcelable(vlx0.class.getClassLoader());
                int i9 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i9);
                int iM9h = 0;
                while (true) {
                    boolean z = true;
                    if (iM9h == i9) {
                        ylx0 ylx0Var = (ylx0) parcel.readParcelable(vlx0.class.getClassLoader());
                        if (parcel.readInt() == 0) {
                            z = false;
                        }
                        return new vlx0(xkx0Var, arrayList, ylx0Var, z, parcel.readInt() != 0, parcel.readInt() != 0 ? z : false);
                    }
                    iM9h = AbstractC0000a.m9h(vlx0.class, parcel, arrayList, iM9h, 1);
                }
                break;
            case 21:
                return new wlx0((wit0) parcel.readParcelable(wlx0.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0);
            case 22:
                return new xlx0((wit0) parcel.readParcelable(xlx0.class.getClassLoader()));
            case 23:
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                int iM31715d = 0;
                while (iM31715d != i10) {
                    iM31715d = c7h0.m31715d(ftw0.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new cmx0(arrayList2);
            case 24:
                return new wrx0(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 25:
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("None")) {
                    i2 = 1;
                } else if (string4.equals("AutoGenerated")) {
                    i2 = 2;
                } else if (string4.equals("CreatorProvided")) {
                    i2 = 3;
                } else if (string4.equals("CreatorProvidedAndStatic")) {
                    i2 = 4;
                } else {
                    if (!string4.equals("Static")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.transcript.list.data.DisclaimerRow.".concat(string4));
                    }
                    i2 = 5;
                }
                return new xrx0(i2);
            case 26:
                return new yrx0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new zrx0(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                parcel.readInt();
                return asx0.f19524a;
            default:
                return new bsx0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f267118a) {
            case 0:
                return new yxw0[i];
            case 1:
                return new zxw0[i];
            case 2:
                return new ayw0[i];
            case 3:
                return new pzw0[i];
            case 4:
                return new o0x0[i];
            case 5:
                return new c5x0[i];
            case 6:
                return new m5x0[i];
            case 7:
                return new n5x0[i];
            case 8:
                return new b6x0[i];
            case 9:
                return new i6x0[i];
            case 10:
                return new n6x0[i];
            case 11:
                return new ResultReceiver[i];
            case 12:
                return new l8x0[i];
            case 13:
                return new wcx0[i];
            case 14:
                return new sfx0[i];
            case 15:
                return new tfx0[i];
            case 16:
                return new zgx0[i];
            case 17:
                return new uix0[i];
            case 18:
                return new gkx0[i];
            case 19:
                return new zkx0[i];
            case 20:
                return new vlx0[i];
            case 21:
                return new wlx0[i];
            case 22:
                return new xlx0[i];
            case 23:
                return new cmx0[i];
            case 24:
                return new wrx0[i];
            case 25:
                return new xrx0[i];
            case 26:
                return new yrx0[i];
            case 27:
                return new zrx0[i];
            case 28:
                return new asx0[i];
            default:
                return new bsx0[i];
        }
    }
}
