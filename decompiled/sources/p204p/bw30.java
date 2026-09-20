package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class bw30 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31519a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f31519a) {
            case 0:
                parcel.readInt();
                return cw30.f42620c;
            case 1:
                parcel.readInt();
                return dw30.f53595c;
            case 2:
                parcel.readInt();
                return ew30.f63409c;
            case 3:
                parcel.readInt();
                return fw30.f73927c;
            case 4:
                parcel.readInt();
                return gw30.f84903c;
            case 5:
                parcel.readInt();
                return hw30.f95852c;
            case 6:
                return new jw30(parcel.readString());
            case 7:
                return new kw30(parcel.readString());
            case 8:
                parcel.readInt();
                return lw30.f137442c;
            case 9:
                parcel.readInt();
                return mw30.f147707c;
            case 10:
                return new ow30(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.readInt();
                return pw30.f181895c;
            case 12:
                parcel.readInt();
                return qw30.f193156c;
            case 13:
                return new rw30(parcel.readInt() != 0, parcel.readString());
            case 14:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(lx30.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new sw30(arrayList, dx30.CREATOR.createFromParcel(parcel));
            case 15:
                d850 d850Var = (d850) parcel.readParcelable(tw30.class.getClassLoader());
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("HOST")) {
                    i = 1;
                } else {
                    if (!string.equals("PARTICIPANT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.jam.features.notificationcenter.api.IPLNotificationCenter.Notification.ListeningActivityJoinJamConfirmationDialog.CurrentUserJamRole.".concat(string));
                    }
                    i = 2;
                }
                return new tw30(i, parcel.readString(), d850Var);
            case 16:
                parcel.readInt();
                return uw30.f234559c;
            case 17:
                return new vw30(parcel.readString());
            case 18:
                return new ww30(parcel.readInt() != 0, parcel.readInt() != 0);
            case 19:
                return new xw30(parcel.readInt() != 0);
            case 20:
                return new yw30(parcel.readInt() != 0);
            case 21:
                return new zw30(parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
            case 22:
                parcel.readInt();
                return ax30.f20753c;
            case 23:
                parcel.readInt();
                return bx30.f31774c;
            case 24:
                parcel.readInt();
                return cx30.f42895c;
            case 25:
                return new dx30(parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                return new ex30(parcel.readString(), parcel.readString());
            case 27:
                return new lx30(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                return new i340(parcel.readString(), parcel.readInt(), parcel.readInt());
            default:
                return new k340(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f31519a) {
            case 0:
                return new cw30[i];
            case 1:
                return new dw30[i];
            case 2:
                return new ew30[i];
            case 3:
                return new fw30[i];
            case 4:
                return new gw30[i];
            case 5:
                return new hw30[i];
            case 6:
                return new jw30[i];
            case 7:
                return new kw30[i];
            case 8:
                return new lw30[i];
            case 9:
                return new mw30[i];
            case 10:
                return new ow30[i];
            case 11:
                return new pw30[i];
            case 12:
                return new qw30[i];
            case 13:
                return new rw30[i];
            case 14:
                return new sw30[i];
            case 15:
                return new tw30[i];
            case 16:
                return new uw30[i];
            case 17:
                return new vw30[i];
            case 18:
                return new ww30[i];
            case 19:
                return new xw30[i];
            case 20:
                return new yw30[i];
            case 21:
                return new zw30[i];
            case 22:
                return new ax30[i];
            case 23:
                return new bx30[i];
            case 24:
                return new cx30[i];
            case 25:
                return new dx30[i];
            case 26:
                return new ex30[i];
            case 27:
                return new lx30[i];
            case 28:
                return new i340[i];
            default:
                return new k340[i];
        }
    }
}
