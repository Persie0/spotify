package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class u2a1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226045a;

    public /* synthetic */ u2a1(int i) {
        this.f226045a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int i;
        switch (this.f226045a) {
            case 0:
                return new v2a1(parcel.readString(), parcel.readString(), TriggerType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 1:
                return new g5a1(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 2:
                return new q8a1(parcel.readString());
            case 3:
                return new qba1(parcel.readString());
            case 4:
                return new oda1((vda1) parcel.readParcelable(oda1.class.getClassLoader()), (qfy0) parcel.readParcelable(oda1.class.getClassLoader()), (ResultReceiver) parcel.readParcelable(oda1.class.getClassLoader()));
            case 5:
                parcel.readInt();
                return rda1.f198084a;
            case 6:
                parcel.readInt();
                return sda1.f207966a;
            case 7:
                parcel.readInt();
                return tda1.f219274a;
            case 8:
                return new uda1(parcel.readInt());
            case 9:
                return new gha1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new eia1((gha1) parcel.readParcelable(eia1.class.getClassLoader()), parcel.readInt() != 0);
            case 11:
                return new gja1((xu00) parcel.readParcelable(gja1.class.getClassLoader()));
            case 12:
                return new pla1(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 13:
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                vy80 vy80VarCreateFromParcel = vy80.CREATOR.createFromParcel(parcel);
                jw10 jw10VarCreateFromParcel = jw10.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = true;
                    z2 = true;
                } else {
                    z = z4;
                    z2 = z3;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new noa1(z3, z4, z4, z4, z4, z4, vy80VarCreateFromParcel, jw10VarCreateFromParcel, z2, z);
            case 14:
                return new yoa1(parcel.readString());
            case 15:
                return new cpa1(parcel.readString(), (sf60) parcel.readParcelable(cpa1.class.getClassLoader()), cqy.valueOf(parcel.readString()), xf50.valueOf(parcel.readString()), (vf50) parcel.readParcelable(cpa1.class.getClassLoader()), parcel.readString());
            case 16:
                return new ira1(parcel.readString(), parcel.readString());
            case 17:
                String string = parcel.readString();
                kmo kmoVarCreateFromParcel = kmo.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("EMPTY")) {
                    i = 1;
                } else if (string2.equals("READY")) {
                    i = 2;
                } else {
                    if (!string2.equals("DATE_ERROR")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.genalphaaccountcreation.userinfo.page.mobius.ViewState.".concat(string2));
                    }
                    i = 3;
                }
                return new gsa1(string, kmoVarCreateFromParcel, i2, i3, i, (b370) parcel.readParcelable(gsa1.class.getClassLoader()));
            case 18:
                return new nsa1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (b370) parcel.readParcelable(nsa1.class.getClassLoader()));
            case 19:
                return new pua1((oua1) parcel.readParcelable(pua1.class.getClassLoader()), parcel.readString(), parcel.readLong());
            case 20:
                return new mua1(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                return new nua1(parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                return new axa1((sz41) parcel.readParcelable(axa1.class.getClassLoader()), (c181) parcel.readParcelable(axa1.class.getClassLoader()));
            case 23:
                return new bxa1((c181) parcel.readParcelable(bxa1.class.getClassLoader()));
            case 24:
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iM9h = 0;
                while (iM9h != i4) {
                    iM9h = AbstractC0000a.m9h(cxa1.class, parcel, arrayList, iM9h, 1);
                }
                return new cxa1(arrayList, (c181) parcel.readParcelable(cxa1.class.getClassLoader()));
            case 25:
                return new hxa1(parcel.readInt(), (fmn0) parcel.readParcelable(hxa1.class.getClassLoader()), parcel.readString());
            case 26:
                return new wxa1(parcel.readInt() != 0);
            case 27:
                return new k1b1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new s5b1(parcel.readString());
            default:
                return new v7b1(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f226045a) {
            case 0:
                return new v2a1[i];
            case 1:
                return new g5a1[i];
            case 2:
                return new q8a1[i];
            case 3:
                return new qba1[i];
            case 4:
                return new oda1[i];
            case 5:
                return new rda1[i];
            case 6:
                return new sda1[i];
            case 7:
                return new tda1[i];
            case 8:
                return new uda1[i];
            case 9:
                return new gha1[i];
            case 10:
                return new eia1[i];
            case 11:
                return new gja1[i];
            case 12:
                return new pla1[i];
            case 13:
                return new noa1[i];
            case 14:
                return new yoa1[i];
            case 15:
                return new cpa1[i];
            case 16:
                return new ira1[i];
            case 17:
                return new gsa1[i];
            case 18:
                return new nsa1[i];
            case 19:
                return new pua1[i];
            case 20:
                return new mua1[i];
            case 21:
                return new nua1[i];
            case 22:
                return new axa1[i];
            case 23:
                return new bxa1[i];
            case 24:
                return new cxa1[i];
            case 25:
                return new hxa1[i];
            case 26:
                return new wxa1[i];
            case 27:
                return new k1b1[i];
            case 28:
                return new s5b1[i];
            default:
                return new v7b1[i];
        }
    }
}
