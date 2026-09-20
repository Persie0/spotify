package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class c8b1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35179a;

    public /* synthetic */ c8b1(int i) {
        this.f35179a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f35179a) {
            case 0:
                return new d8b1(parcel.readString(), parcel.readString());
            case 1:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(ccb1.class, parcel, arrayList, iM9h, 1);
                }
                return new ccb1(string, arrayList);
            case 2:
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM9h2 = 0;
                while (iM9h2 != i3) {
                    iM9h2 = AbstractC0000a.m9h(dcb1.class, parcel, arrayList2, iM9h2, 1);
                }
                return new dcb1(string2, arrayList2, parcel.readString());
            case 3:
                return new kcb1(parcel.readString());
            case 4:
                return new tcb1(parcel.readInt() == 0 ? null : nen0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 5:
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("ID_AND_SELFIE")) {
                    i = 1;
                } else {
                    if (!string3.equals("ID_ONLY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.genalpha.entities.PhotoIdType.".concat(string3));
                    }
                    i = 2;
                }
                return new ucb1(i, parcel.readString());
            case 6:
                return new ffb1(parcel.readInt() != 0);
            case 7:
                return new jhb1(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (ra6) parcel.readParcelable(jhb1.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 8:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM9h3 = 0;
                while (iM9h3 != i4) {
                    iM9h3 = AbstractC0000a.m9h(jnb1.class, parcel, arrayList3, iM9h3, 1);
                }
                return new jnb1(string4, string5, string6, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                parcel.readInt();
                return ynb1.f274430a;
            case 10:
                parcel.readInt();
                return znb1.f284453a;
            case 11:
                return new dqb1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 12:
                parcel.readInt();
                return brb1.f30073a;
            case 13:
                return new crb1(parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(crb1.class.getClassLoader()));
            case 14:
                parcel.readInt();
                return drb1.f52284a;
            case 15:
                return new grb1(parcel.readString(), parcel.readString(), (gcr0) parcel.readParcelable(grb1.class.getClassLoader()), (gcr0) parcel.readParcelable(grb1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), (sr01) parcel.readParcelable(grb1.class.getClassLoader()), ((nu71) parcel.readParcelable(grb1.class.getClassLoader())).f158526a, parcel.readInt() != 0, (erb1) parcel.readParcelable(grb1.class.getClassLoader()), 2048);
            case 16:
                return new hrb1((gcr0) parcel.readParcelable(hrb1.class.getClassLoader()), (gcr0) parcel.readParcelable(hrb1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), ((nu71) parcel.readParcelable(hrb1.class.getClassLoader())).f158526a, parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case 17:
                return new gtb1(xl81.m91413v(parcel.readString()));
            case 18:
                return new l7c1(parcel.readString());
            case 19:
                return new s8c1(parcel.readString());
            case 20:
                return new r9c1(parcel.readString());
            case 21:
                return new s9c1(parcel.readString());
            case 22:
                return new t9c1(parcel.readString());
            case 23:
                parcel.readInt();
                return ccc1.f36381a;
            case 24:
                return new dcc1((Uri) parcel.readParcelable(dcc1.class.getClassLoader()), parcel.readString(), (z0r) parcel.readParcelable(dcc1.class.getClassLoader()));
            case 25:
                parcel.readInt();
                return ecc1.f58306a;
            case 26:
                return new hcc1(parcel.readString(), (gcr0) parcel.readParcelable(hcc1.class.getClassLoader()), (gcr0) parcel.readParcelable(hcc1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(hcc1.class.getClassLoader()), (sr01) parcel.readParcelable(hcc1.class.getClassLoader()), ((nu71) parcel.readParcelable(hcc1.class.getClassLoader())).f158526a, (Uri) parcel.readParcelable(hcc1.class.getClassLoader()), parcel.readInt() != 0, (nu71) parcel.readParcelable(hcc1.class.getClassLoader()), (fcc1) parcel.readParcelable(hcc1.class.getClassLoader()), parcel.readString(), parcel.readString(), 16384);
            case 27:
                return new jcc1((gcr0) parcel.readParcelable(jcc1.class.getClassLoader()), (gcr0) parcel.readParcelable(jcc1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(jcc1.class.getClassLoader()), ((nu71) parcel.readParcelable(jcc1.class.getClassLoader())).f158526a, (nu71) parcel.readParcelable(jcc1.class.getClassLoader()), (Uri) parcel.readParcelable(jcc1.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case 28:
                return new mdc1(parcel.readString());
            default:
                parcel.readInt();
                return olc1.f166821a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f35179a) {
            case 0:
                return new d8b1[i];
            case 1:
                return new ccb1[i];
            case 2:
                return new dcb1[i];
            case 3:
                return new kcb1[i];
            case 4:
                return new tcb1[i];
            case 5:
                return new ucb1[i];
            case 6:
                return new ffb1[i];
            case 7:
                return new jhb1[i];
            case 8:
                return new jnb1[i];
            case 9:
                return new ynb1[i];
            case 10:
                return new znb1[i];
            case 11:
                return new dqb1[i];
            case 12:
                return new brb1[i];
            case 13:
                return new crb1[i];
            case 14:
                return new drb1[i];
            case 15:
                return new grb1[i];
            case 16:
                return new hrb1[i];
            case 17:
                return new gtb1[i];
            case 18:
                return new l7c1[i];
            case 19:
                return new s8c1[i];
            case 20:
                return new r9c1[i];
            case 21:
                return new s9c1[i];
            case 22:
                return new t9c1[i];
            case 23:
                return new ccc1[i];
            case 24:
                return new dcc1[i];
            case 25:
                return new ecc1[i];
            case 26:
                return new hcc1[i];
            case 27:
                return new jcc1[i];
            case 28:
                return new mdc1[i];
            default:
                return new olc1[i];
        }
    }
}
