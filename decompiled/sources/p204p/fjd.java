package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class fjd implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70171a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.f70171a) {
            case 0:
                parcel.readInt();
                return gjd.f80438a;
            case 1:
                parcel.readInt();
                return hjd.f92033a;
            case 2:
                parcel.readInt();
                return ijd.f102786a;
            case 3:
                return new qmd(parcel.readString(), parcel.readString());
            case 4:
                return new jnd(parcel.readString(), (ind) parcel.readParcelable(jnd.class.getClassLoader()), parcel.readString(), parcel.readString(), (xcl0) parcel.readParcelable(jnd.class.getClassLoader()), ovd.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 5:
                return new end(parcel.readString(), parcel.readString());
            case 6:
                return new fnd(parcel.readString());
            case 7:
                return new gnd(parcel.readString(), parcel.readString());
            case 8:
                return new hnd(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 9:
                return new pod(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new xrd(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new ntd(parcel.readString(), parcel.readString(), parcel.readInt());
            case 12:
                String string = parcel.readString();
                xcl0 xcl0Var = (xcl0) parcel.readParcelable(otd.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iM9h = 0;
                    while (iM9h != i) {
                        iM9h = AbstractC0000a.m9h(otd.class, parcel, arrayList2, iM9h, 1);
                    }
                    arrayList = arrayList2;
                }
                return new otd(string, xcl0Var, arrayList);
            case 13:
                return new ptd(parcel.readString(), (xcl0) parcel.readParcelable(ptd.class.getClassLoader()));
            case 14:
                return new rtd(parcel.readString(), parcel.readInt());
            case 15:
                return new wtd((vtd) parcel.readParcelable(wtd.class.getClassLoader()));
            case 16:
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                int iM9h2 = 0;
                while (iM9h2 != i2) {
                    iM9h2 = AbstractC0000a.m9h(std.class, parcel, arrayList3, iM9h2, 1);
                }
                return new std(arrayList3);
            case 17:
                return new ttd((agw) parcel.readParcelable(ttd.class.getClassLoader()));
            case 18:
                return new utd(parcel.readString());
            case 19:
                return new yud(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (pla1) parcel.readParcelable(yud.class.getClassLoader()));
            case 20:
                parcel.readInt();
                return qxd.f193619a;
            case 21:
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(wn50.CREATOR, parcel, arrayList4, iM31715d, 1);
                }
                return new rxd(string2, arrayList4);
            case 22:
                return new dzd(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 23:
                return new ezd(parcel.readString());
            case 24:
                return new fzd(parcel.readString());
            case 25:
                return new gzd(parcel.readString());
            case 26:
                parcel.readInt();
                return vzd.f246440a;
            case 27:
                parcel.readInt();
                return wzd.f256573a;
            case 28:
                parcel.readInt();
                return xzd.f267587a;
            default:
                parcel.readInt();
                return i0e.f97214b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f70171a) {
            case 0:
                return new gjd[i];
            case 1:
                return new hjd[i];
            case 2:
                return new ijd[i];
            case 3:
                return new qmd[i];
            case 4:
                return new jnd[i];
            case 5:
                return new end[i];
            case 6:
                return new fnd[i];
            case 7:
                return new gnd[i];
            case 8:
                return new hnd[i];
            case 9:
                return new pod[i];
            case 10:
                return new xrd[i];
            case 11:
                return new ntd[i];
            case 12:
                return new otd[i];
            case 13:
                return new ptd[i];
            case 14:
                return new rtd[i];
            case 15:
                return new wtd[i];
            case 16:
                return new std[i];
            case 17:
                return new ttd[i];
            case 18:
                return new utd[i];
            case 19:
                return new yud[i];
            case 20:
                return new qxd[i];
            case 21:
                return new rxd[i];
            case 22:
                return new dzd[i];
            case 23:
                return new ezd[i];
            case 24:
                return new fzd[i];
            case 25:
                return new gzd[i];
            case 26:
                return new vzd[i];
            case 27:
                return new wzd[i];
            case 28:
                return new xzd[i];
            default:
                return new i0e[i];
        }
    }
}
