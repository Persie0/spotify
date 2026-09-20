package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class t320 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216689a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f216689a) {
            case 0:
                return new u320(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(u320.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new v320(opo.m67546C(arrayList));
            case 2:
                parcel.readInt();
                return w320.f247465a;
            case 3:
                return new c420(parcel.readString(), parcel.readInt() != 0);
            case 4:
                return new t420(parcel.readString(), parcel.readString(), (c520) parcel.readParcelable(t420.class.getClassLoader()));
            case 5:
                return new a520(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 6:
                parcel.readInt();
                return b520.f23494a;
            case 7:
                return new e520(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? t420.CREATOR.createFromParcel(parcel) : null);
            case 8:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(e520.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new f520(string, string2, parcel.readString(), parcel.readString(), arrayList2);
            case 9:
                return new g520(parcel.readString(), parcel.readString());
            case 10:
                return new h520(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 11:
                return ab20.valueOf(parcel.readString());
            case 12:
                return new ve20(parcel.readString(), parcel.readString());
            case 13:
                return new gm20(parcel.readString(), parcel.readString(), parcel.readString(), opo.m67546C(parcel.createStringArrayList()), parcel.readString(), parcel.readString(), opo.m67546C(parcel.createStringArrayList()), parcel.readString(), parcel.readString());
            case 14:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i4 = parcel.readInt();
                String string8 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d3 = 0;
                while (iM31715d3 != i5) {
                    iM31715d3 = c7h0.m31715d(c6e.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new zm20(i4, string3, string4, string5, string6, string7, string8, arrayList3);
            case 15:
                return new qn20(parcel.readString(), parcel.readString());
            case 16:
                return new go20(parcel.readString(), parcel.readString(), parcel.readInt());
            case 17:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("RECENTS")) {
                    i = 1;
                } else {
                    if (!string10.equals("SHORTCUTS")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.home.hidefromhome.HideFromHomeSection.".concat(string10));
                    }
                    i = 2;
                }
                return new mr20(string9, i);
            case 18:
                return new as20(parcel.readInt(), parcel.readLong(), parcel.readInt());
            case 19:
                return new ku20(parcel.readLong(), parcel.readString());
            case 20:
                return new mw20(parcel.readString());
            case 21:
                return new nw20(parcel.readString());
            case 22:
                return new ow20(parcel.readInt(), parcel.readLong(), o511.valueOf(parcel.readString()));
            case 23:
                return new pw20(parcel.readInt(), parcel.readLong());
            case 24:
                parcel.readInt();
                return xw20.f266560a;
            case 25:
                parcel.readInt();
                return rx20.f203471a;
            case 26:
                return new iz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 27:
                return new jz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                return new kz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            default:
                return new lz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f216689a) {
            case 0:
                return new u320[i];
            case 1:
                return new v320[i];
            case 2:
                return new w320[i];
            case 3:
                return new c420[i];
            case 4:
                return new t420[i];
            case 5:
                return new a520[i];
            case 6:
                return new b520[i];
            case 7:
                return new e520[i];
            case 8:
                return new f520[i];
            case 9:
                return new g520[i];
            case 10:
                return new h520[i];
            case 11:
                return new ab20[i];
            case 12:
                return new ve20[i];
            case 13:
                return new gm20[i];
            case 14:
                return new zm20[i];
            case 15:
                return new qn20[i];
            case 16:
                return new go20[i];
            case 17:
                return new mr20[i];
            case 18:
                return new as20[i];
            case 19:
                return new ku20[i];
            case 20:
                return new mw20[i];
            case 21:
                return new nw20[i];
            case 22:
                return new ow20[i];
            case 23:
                return new pw20[i];
            case 24:
                return new xw20[i];
            case 25:
                return new rx20[i];
            case 26:
                return new iz20[i];
            case 27:
                return new jz20[i];
            case 28:
                return new kz20[i];
            default:
                return new lz20[i];
        }
    }
}
