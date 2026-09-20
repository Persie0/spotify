package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class r4f0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195736a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f195736a) {
            case 0:
                parcel.readInt();
                return s4f0.f205579a;
            case 1:
                parcel.readInt();
                return t4f0.f216992a;
            case 2:
                MessageResponseToken messageResponseToken = (MessageResponseToken) parcel.readParcelable(w4f0.class.getClassLoader());
                wco wcoVarCreateFromParcel = parcel.readInt() == 0 ? null : wco.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new w4f0(messageResponseToken, wcoVarCreateFromParcel, string, z2, z, (a5f0) parcel.readParcelable(w4f0.class.getClassLoader()), parcel.readInt() != 0, (u4f0) parcel.readParcelable(w4f0.class.getClassLoader()), parcel.readBundle(w4f0.class.getClassLoader()));
            case 3:
                return new x4f0(parcel.readString());
            case 4:
                parcel.readInt();
                return y4f0.f269137a;
            case 5:
                parcel.readInt();
                return z4f0.f279231a;
            case 6:
                return new jdf0(hdf0.valueOf(parcel.readString()));
            case 7:
                return new ldf0(parcel.readInt() != 0);
            case 8:
                parcel.readInt();
                return cff0.f37340a;
            case 9:
                parcel.readInt();
                return new kjf0();
            case 10:
                return new xjf0(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 11:
                return new klf0(parcel.readString(), parcel.readString(), (aox0) parcel.readParcelable(klf0.class.getClassLoader()), (aox0) parcel.readParcelable(klf0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 12:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(rsx.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new vqf0(arrayList, parcel.readString(), (a151) parcel.readParcelable(vqf0.class.getClassLoader()));
            case 13:
                return new arf0(parcel.readString(), parcel.readString());
            case 14:
                parcel.readInt();
                return jtf0.f115858a;
            case 15:
                parcel.readInt();
                return ktf0.f126286a;
            case 16:
                parcel.readInt();
                return ltf0.f136771a;
            case 17:
                parcel.readInt();
                return ntf0.f158060a;
            case 18:
                return new otf0(parcel.readString());
            case 19:
                return new xtf0(parcel.readString(), (mtf0) parcel.readParcelable(xtf0.class.getClassLoader()));
            case 20:
                parcel.readInt();
                return ytf0.f276114a;
            case 21:
                parcel.readInt();
                return ztf0.f286153a;
            case 22:
                parcel.readInt();
                return buf0.f31130a;
            case 23:
                parcel.readInt();
                return cuf0.f42107a;
            case 24:
                parcel.readInt();
                return duf0.f53052a;
            case 25:
                parcel.readInt();
                return euf0.f62972a;
            case 26:
                parcel.readInt();
                return fuf0.f73477a;
            case 27:
                parcel.readInt();
                return guf0.f84465a;
            case 28:
                parcel.readInt();
                return huf0.f95398a;
            default:
                parcel.readInt();
                return iuf0.f105960a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f195736a) {
            case 0:
                return new s4f0[i];
            case 1:
                return new t4f0[i];
            case 2:
                return new w4f0[i];
            case 3:
                return new x4f0[i];
            case 4:
                return new y4f0[i];
            case 5:
                return new z4f0[i];
            case 6:
                return new jdf0[i];
            case 7:
                return new ldf0[i];
            case 8:
                return new cff0[i];
            case 9:
                return new kjf0[i];
            case 10:
                return new xjf0[i];
            case 11:
                return new klf0[i];
            case 12:
                return new vqf0[i];
            case 13:
                return new arf0[i];
            case 14:
                return new jtf0[i];
            case 15:
                return new ktf0[i];
            case 16:
                return new ltf0[i];
            case 17:
                return new ntf0[i];
            case 18:
                return new otf0[i];
            case 19:
                return new xtf0[i];
            case 20:
                return new ytf0[i];
            case 21:
                return new ztf0[i];
            case 22:
                return new buf0[i];
            case 23:
                return new cuf0[i];
            case 24:
                return new duf0[i];
            case 25:
                return new euf0[i];
            case 26:
                return new fuf0[i];
            case 27:
                return new guf0[i];
            case 28:
                return new huf0[i];
            default:
                return new iuf0[i];
        }
    }
}
