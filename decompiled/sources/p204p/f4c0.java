package p204p;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class f4c0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65755a;

    public /* synthetic */ f4c0(int i) {
        this.f65755a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f65755a) {
            case 0:
                return new g4c0(parcel.readString());
            case 1:
                return new x5c0(parcel.readString(), z5c0.valueOf(parcel.readString()), (voc1) parcel.readParcelable(x5c0.class.getClassLoader()));
            case 2:
                return new v8c0(parcel.readString(), z5c0.valueOf(parcel.readString()), (voc1) parcel.readParcelable(v8c0.class.getClassLoader()));
            case 3:
                return new eac0(parcel.readString(), z5c0.valueOf(parcel.readString()), (voc1) parcel.readParcelable(eac0.class.getClassLoader()));
            case 4:
                return new acc0(parcel.readString(), parcel.readString());
            case 5:
                return new zdc0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (jgq0) parcel.readParcelable(zdc0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                return new vlc0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new jnc0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                fuz0 fuz0Var = (fuz0) parcel.readParcelable(knc0.class.getClassLoader());
                Parcelable.Creator<jnc0> creator = jnc0.CREATOR;
                return new knc0(fuz0Var, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zrl0 zrl0VarCreateFromParcel = zrl0.CREATOR.createFromParcel(parcel);
                String string14 = parcel.readString();
                gqc0 gqc0VarCreateFromParcel = parcel.readInt() == 0 ? null : gqc0.CREATOR.createFromParcel(parcel);
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                if (string16 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string16.equals("UNKNOWN")) {
                    i = 1;
                } else if (string16.equals("NO_HOLDOUT")) {
                    i = 2;
                } else {
                    if (!string16.equals("HOLDOUT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.marquee.marquee.domain.MarqueeHoldoutInfo.".concat(string16));
                    }
                    i = 3;
                }
                return new vnc0(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, zrl0VarCreateFromParcel, string14, gqc0VarCreateFromParcel, string15, i, parcel.readString(), parcel.readInt() != 0);
            case 10:
                return new eqc0(vnc0.CREATOR.createFromParcel(parcel));
            case 11:
                return gqc0.valueOf(parcel.readString());
            case 12:
                return trc0.valueOf(parcel.readString());
            case 13:
                return new vzc0(parcel.readString());
            case 14:
                return new wzc0(parcel.readString());
            case 15:
                parcel.readInt();
                return xzc0.f267580a;
            case 16:
                return new yzc0(parcel.readString(), bc51.CREATOR.createFromParcel(parcel));
            case 17:
                return new zzc0(parcel.readString());
            case 18:
                parcel.readInt();
                return a0d0.f11063a;
            case 19:
                parcel.readInt();
                return b0d0.f21856a;
            case 20:
                return new c0d0(parcel.readString());
            case 21:
                return new h0d0((d0d0) parcel.readParcelable(h0d0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (h400) parcel.readParcelable(h0d0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            case 22:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                int iM31715d2 = 0;
                while (iM31715d2 != i2) {
                    iM31715d2 = c7h0.m31715d(h340.CREATOR, parcel, arrayList, iM31715d2, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d3 = 0;
                while (iM31715d3 != i3) {
                    iM31715d3 = c7h0.m31715d(jhb1.CREATOR, parcel, arrayList2, iM31715d3, 1);
                }
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(ed30.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new b7d0(arrayList, arrayList2, arrayList3);
            case 23:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 24:
                return MediaDescriptionCompat.m28c(MediaDescription.CREATOR.createFromParcel(parcel));
            case 25:
                return new eed0(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 26:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d4 = 0;
                while (iM31715d4 != i5) {
                    iM31715d4 = c7h0.m31715d(sl00.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                return new ted0(arrayList4, (sed0) parcel.readParcelable(ted0.class.getClassLoader()), (pla1) parcel.readParcelable(ted0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 27:
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iM31715d5 = 0;
                while (iM31715d5 != i6) {
                    iM31715d5 = c7h0.m31715d(sl00.CREATOR, parcel, arrayList5, iM31715d5, 1);
                }
                return new ped0(arrayList5);
            case 28:
                return new qed0(sl00.CREATOR.createFromParcel(parcel));
            default:
                return new red0(sl00.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f65755a) {
            case 0:
                return new g4c0[i];
            case 1:
                return new x5c0[i];
            case 2:
                return new v8c0[i];
            case 3:
                return new eac0[i];
            case 4:
                return new acc0[i];
            case 5:
                return new zdc0[i];
            case 6:
                return new vlc0[i];
            case 7:
                return new jnc0[i];
            case 8:
                return new knc0[i];
            case 9:
                return new vnc0[i];
            case 10:
                return new eqc0[i];
            case 11:
                return new gqc0[i];
            case 12:
                return new trc0[i];
            case 13:
                return new vzc0[i];
            case 14:
                return new wzc0[i];
            case 15:
                return new xzc0[i];
            case 16:
                return new yzc0[i];
            case 17:
                return new zzc0[i];
            case 18:
                return new a0d0[i];
            case 19:
                return new b0d0[i];
            case 20:
                return new c0d0[i];
            case 21:
                return new h0d0[i];
            case 22:
                return new b7d0[i];
            case 23:
                return new MediaBrowserCompat$MediaItem[i];
            case 24:
                return new MediaDescriptionCompat[i];
            case 25:
                return new eed0[i];
            case 26:
                return new ted0[i];
            case 27:
                return new ped0[i];
            case 28:
                return new qed0[i];
            default:
                return new red0[i];
        }
    }
}
