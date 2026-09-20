package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class csx0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41716a;

    public /* synthetic */ csx0(int i) {
        this.f41716a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        switch (this.f41716a) {
            case 0:
                return new dsx0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            case 1:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                String string2 = parcel.readString();
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new esx0(z3, parcel.readInt() != 0, i2, string, string2, i3);
            case 2:
                return new fsx0(parcel.readInt(), parcel.readInt());
            case 3:
                return new gsx0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            case 4:
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                int iM31715d = 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                bg61 bg61VarValueOf = bg61.valueOf(parcel.readString());
                int i8 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i8);
                while (iM31715d != i8) {
                    iM31715d = c7h0.m31715d(fsx0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new hsx0(string3, i4, i5, string4, i6, i7, z4, z5, bg61VarValueOf, arrayList);
            case 5:
                return new isx0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                parcel.readInt();
                return ksx0.f126068a;
            case 7:
                parcel.readInt();
                return lsx0.f136633a;
            case 8:
                parcel.readInt();
                return msx0.f146876a;
            case 9:
                parcel.readInt();
                return osx0.f168916a;
            case 10:
                parcel.readInt();
                return htx0.f95208a;
            case 11:
                parcel.readInt();
                return itx0.f105787a;
            case 12:
                return new jtx0(parcel.readInt());
            case 13:
                return new x4y0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new r9y0(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 15:
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("NONE")) {
                    i = 1;
                } else if (string5.equals("DAILY")) {
                    i = 2;
                } else if (string5.equals("WEEKLY")) {
                    i = 3;
                } else {
                    if (!string5.equals("MONTHLY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.bluejay.data.api.ScheduleType.".concat(string5));
                    }
                    i = 4;
                }
                return new ney0(i, parcel.readInt() == 0 ? null : joo.valueOf(parcel.readString()));
            case 16:
                return qfy0.valueOf(parcel.readString());
            case 17:
                return new eiy0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                int iM31715d2 = 0;
                while (iM31715d2 != i9) {
                    iM31715d2 = c7h0.m31715d(eiy0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new fiy0(parcel.readString(), arrayList2, parcel.readString());
            case 19:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int iM9h = 0;
                while (iM9h != i10) {
                    iM9h = AbstractC0000a.m9h(hiy0.class, parcel, arrayList3, iM9h, 1);
                }
                int i11 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i11);
                int iM31715d3 = 0;
                while (iM31715d3 != i11) {
                    iM31715d3 = c7h0.m31715d(giy0.CREATOR, parcel, arrayList4, iM31715d3, 1);
                }
                SearchConfiguration searchConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : SearchConfiguration.CREATOR.createFromParcel(parcel);
                e20 e20VarCreateFromParcel = parcel.readInt() == 0 ? null : e20.CREATOR.createFromParcel(parcel);
                e20 e20VarCreateFromParcel2 = parcel.readInt() == 0 ? null : e20.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iM31715d4 = 0;
                while (iM31715d4 != i13) {
                    iM31715d4 = c7h0.m31715d(xyn0.CREATOR, parcel, arrayList5, iM31715d4, 1);
                }
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iM31715d5 = 0;
                while (iM31715d5 != i14) {
                    iM31715d5 = c7h0.m31715d(xyn0.CREATOR, parcel, arrayList6, iM31715d5, 1);
                }
                return new hiy0(string6, string7, arrayList3, arrayList4, searchConfigurationCreateFromParcel, e20VarCreateFromParcel, e20VarCreateFromParcel2, i12, arrayList5, arrayList6, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), ln21.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 20:
                return new giy0(parcel.readString(), parcel.readString());
            case 21:
                String string8 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                int iM31715d6 = 0;
                while (iM31715d6 != i15) {
                    iM31715d6 = c7h0.m31715d(bej.CREATOR, parcel, arrayList7, iM31715d6, 1);
                }
                return new iiy0(string8, arrayList7);
            case 22:
                return new jiy0(parcel.readString());
            case 23:
                parcel.readInt();
                return kiy0.f123141a;
            case 24:
                parcel.readInt();
                return liy0.f133908a;
            case 25:
                String string9 = parcel.readString();
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                int iM31715d7 = 0;
                while (iM31715d7 != i16) {
                    iM31715d7 = c7h0.m31715d(bej.CREATOR, parcel, arrayList8, iM31715d7, 1);
                }
                return new miy0(string9, arrayList8);
            case 26:
                parcel.readInt();
                return niy0.f154382a;
            case 27:
                int iM0A = AbstractC0000a.m0A(parcel.readString());
                int i17 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i17);
                int iM9h2 = 0;
                while (iM9h2 != i17) {
                    iM9h2 = AbstractC0000a.m9h(yiy0.class, parcel, arrayList9, iM9h2, 1);
                }
                return new yiy0(iM0A, arrayList9);
            case 28:
                return new ziy0(parcel.readString());
            default:
                boolean z6 = true;
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                boolean z7 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = z6;
                    z2 = false;
                } else {
                    z = false;
                    z2 = false;
                }
                int i18 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z2 = z6;
                }
                if (parcel.readInt() != 0) {
                    z2 = z6;
                }
                if (parcel.readInt() != 0) {
                    z2 = z6;
                }
                return new kpy0(i18, z6, z7, z, z2, z2, z2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f41716a) {
            case 0:
                return new dsx0[i];
            case 1:
                return new esx0[i];
            case 2:
                return new fsx0[i];
            case 3:
                return new gsx0[i];
            case 4:
                return new hsx0[i];
            case 5:
                return new isx0[i];
            case 6:
                return new ksx0[i];
            case 7:
                return new lsx0[i];
            case 8:
                return new msx0[i];
            case 9:
                return new osx0[i];
            case 10:
                return new htx0[i];
            case 11:
                return new itx0[i];
            case 12:
                return new jtx0[i];
            case 13:
                return new x4y0[i];
            case 14:
                return new r9y0[i];
            case 15:
                return new ney0[i];
            case 16:
                return new qfy0[i];
            case 17:
                return new eiy0[i];
            case 18:
                return new fiy0[i];
            case 19:
                return new hiy0[i];
            case 20:
                return new giy0[i];
            case 21:
                return new iiy0[i];
            case 22:
                return new jiy0[i];
            case 23:
                return new kiy0[i];
            case 24:
                return new liy0[i];
            case 25:
                return new miy0[i];
            case 26:
                return new niy0[i];
            case 27:
                return new yiy0[i];
            case 28:
                return new ziy0[i];
            default:
                return new kpy0[i];
        }
    }
}
