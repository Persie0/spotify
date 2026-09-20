package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ube0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228705a;

    public /* synthetic */ ube0(int i) {
        this.f228705a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f228705a) {
            case 0:
                return new vbe0(parcel.readString());
            case 1:
                return new uce0(parcel.readString(), parcel.readString());
            case 2:
                return new mee0(parcel.readString(), k8j0.valueOf(parcel.readString()));
            case 3:
                return new tfe0(parcel.readString(), parcel.readString());
            case 4:
                return new hge0(parcel.readString());
            case 5:
                return new lme0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 6:
                parcel.readInt();
                return qoe0.f190928a;
            case 7:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(hhv.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new roe0(arrayList);
            case 8:
                parcel.readInt();
                return soe0.f211178a;
            case 9:
                return new ase0((zre0) parcel.readParcelable(ase0.class.getClassLoader()), (vre0) parcel.readParcelable(ase0.class.getClassLoader()));
            case 10:
                parcel.readInt();
                return tre0.f223055a;
            case 11:
                parcel.readInt();
                return ure0.f233341a;
            case 12:
                return new wre0(parcel.readInt() != 0);
            case 13:
                parcel.readInt();
                return xre0.f265332a;
            case 14:
                return new yre0(parcel.readInt() != 0);
            case 15:
                return fte0.valueOf(parcel.readString());
            case 16:
                parcel.readInt();
                return jte0.f115852a;
            case 17:
                parcel.readInt();
                return kte0.f126252a;
            case 18:
                parcel.readInt();
                return lte0.f136766a;
            case 19:
                parcel.readInt();
                return mte0.f147059a;
            case 20:
                parcel.readInt();
                return nte0.f158057a;
            case 21:
                parcel.readInt();
                return ote0.f169048a;
            case 22:
                return new cwe0((MessageResponseToken) parcel.readParcelable(cwe0.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return dwe0.f53685a;
            case 24:
                parcel.readInt();
                return ewe0.f63525a;
            case 25:
                return new g0f0(parcel.readString(), parcel.readString());
            case 26:
                parcel.readInt();
                return y1f0.f268259a;
            case 27:
                parcel.readInt();
                return o4f0.f161662a;
            case 28:
                parcel.readInt();
                return p4f0.f173915a;
            default:
                parcel.readInt();
                return q4f0.f185172a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f228705a) {
            case 0:
                return new vbe0[i];
            case 1:
                return new uce0[i];
            case 2:
                return new mee0[i];
            case 3:
                return new tfe0[i];
            case 4:
                return new hge0[i];
            case 5:
                return new lme0[i];
            case 6:
                return new qoe0[i];
            case 7:
                return new roe0[i];
            case 8:
                return new soe0[i];
            case 9:
                return new ase0[i];
            case 10:
                return new tre0[i];
            case 11:
                return new ure0[i];
            case 12:
                return new wre0[i];
            case 13:
                return new xre0[i];
            case 14:
                return new yre0[i];
            case 15:
                return new fte0[i];
            case 16:
                return new jte0[i];
            case 17:
                return new kte0[i];
            case 18:
                return new lte0[i];
            case 19:
                return new mte0[i];
            case 20:
                return new nte0[i];
            case 21:
                return new ote0[i];
            case 22:
                return new cwe0[i];
            case 23:
                return new dwe0[i];
            case 24:
                return new ewe0[i];
            case 25:
                return new g0f0[i];
            case 26:
                return new y1f0[i];
            case 27:
                return new o4f0[i];
            case 28:
                return new p4f0[i];
            default:
                return new q4f0[i];
        }
    }
}
