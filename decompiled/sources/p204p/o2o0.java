package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class o2o0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161126a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f161126a) {
            case 0:
                parcel.readInt();
                return p2o0.f173373a;
            case 1:
                parcel.readInt();
                return q2o0.f184662a;
            case 2:
                return new v3o0(parcel.readString(), parcel.readString(), parcel.readLong());
            case 3:
                return new c5o0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 4:
                return new w5o0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 5:
                return new x5o0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            case 6:
                return new e8o0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new a9o0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 8:
                return new i9o0(parcel.readString(), parcel.readString(), parcel.readString(), (h9o0) parcel.readParcelable(i9o0.class.getClassLoader()), parcel.readInt() != 0);
            case 9:
                return new b9o0(parcel.readString());
            case 10:
                return new d9o0(parcel.readString());
            case 11:
                parcel.readInt();
                return e9o0.f57491a;
            case 12:
                return new f9o0(parcel.readInt() != 0);
            case 13:
                parcel.readInt();
                return g9o0.f77848a;
            case 14:
                return new xbo0(parcel.readString(), parcel.readInt() != 0);
            case 15:
                parcel.readInt();
                return nco0.f152564a;
            case 16:
                return new oco0(parcel.readString());
            case 17:
                return new ieo0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new jeo0(parcel.readInt() != 0, (mgo0) parcel.readParcelable(jeo0.class.getClassLoader()), parcel.readString());
            case 19:
                return new xfo0(parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                return new yfo0(parcel.readInt() != 0);
            case 21:
                parcel.readInt();
                return zfo0.f282356a;
            case 22:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("LOCKED")) {
                    i = 1;
                } else if (string.equals("PLAYING")) {
                    i = 2;
                } else if (string.equals("PAUSED")) {
                    i = 3;
                } else {
                    if (!string.equals("LOADING")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonStyle.Entity.PlayButtonState.".concat(string));
                    }
                    i = 4;
                }
                return new ago0(i);
            case 23:
                return new bgo0(parcel.readInt() != 0);
            case 24:
                return new cgo0(parcel.readInt() != 0);
            case 25:
                parcel.readInt();
                return new dgo0();
            case 26:
                parcel.readInt();
                return new ego0();
            case 27:
                parcel.readInt();
                return fgo0.f69377a;
            case 28:
                return new ggo0(parcel.readInt() != 0, parcel.readInt() != 0);
            default:
                return new hgo0(parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f161126a) {
            case 0:
                return new p2o0[i];
            case 1:
                return new q2o0[i];
            case 2:
                return new v3o0[i];
            case 3:
                return new c5o0[i];
            case 4:
                return new w5o0[i];
            case 5:
                return new x5o0[i];
            case 6:
                return new e8o0[i];
            case 7:
                return new a9o0[i];
            case 8:
                return new i9o0[i];
            case 9:
                return new b9o0[i];
            case 10:
                return new d9o0[i];
            case 11:
                return new e9o0[i];
            case 12:
                return new f9o0[i];
            case 13:
                return new g9o0[i];
            case 14:
                return new xbo0[i];
            case 15:
                return new nco0[i];
            case 16:
                return new oco0[i];
            case 17:
                return new ieo0[i];
            case 18:
                return new jeo0[i];
            case 19:
                return new xfo0[i];
            case 20:
                return new yfo0[i];
            case 21:
                return new zfo0[i];
            case 22:
                return new ago0[i];
            case 23:
                return new bgo0[i];
            case 24:
                return new cgo0[i];
            case 25:
                return new dgo0[i];
            case 26:
                return new ego0[i];
            case 27:
                return new fgo0[i];
            case 28:
                return new ggo0[i];
            default:
                return new hgo0[i];
        }
    }
}
