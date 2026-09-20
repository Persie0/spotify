package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class vp5 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243597a;

    public /* synthetic */ vp5(int i) {
        this.f243597a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f243597a) {
            case 0:
                return new zp5(parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new aq5(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : kuh.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ouh.CREATOR.createFromParcel(parcel) : null);
            case 2:
                return new bq5(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new br5(parcel.readString(), parcel.readString());
            case 4:
                return new ct5(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 5:
                return new ft5(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : ct5.CREATOR.createFromParcel(parcel));
            case 6:
                return new jt5(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (cqj0) parcel.readParcelable(jt5.class.getClassLoader()), (waz0) parcel.readParcelable(jt5.class.getClassLoader()), parcel.readInt() != 0, (mr20) parcel.readParcelable(jt5.class.getClassLoader()));
            case 7:
                return new nt5(parcel.readString(), (voc1) parcel.readParcelable(nt5.class.getClassLoader()), parcel.readString(), jt5.CREATOR.createFromParcel(parcel));
            case 8:
                return new cw5(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 9:
                parcel.readInt();
                return kw5.f127008a;
            case 10:
                return new ow5(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(ow5.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new vw5(arrayList);
            case 12:
                return new iy5(parcel.readString(), parcel.readString());
            case 13:
                return new hz5(parcel.readString(), parcel.createStringArrayList());
            case 14:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int iM31715d2 = 0;
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new o36(string, string2, string3, z, z2, z3, z4, z5, arrayList2);
            case 15:
                return new q56(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 16:
                return new o86(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 17:
                return new oa6(parcel.readString());
            case 18:
                return new pa6(parcel.readString());
            case 19:
                return new db6((uc40) parcel.readParcelable(db6.class.getClassLoader()));
            case 20:
                return new eb6((u9c1) parcel.readParcelable(eb6.class.getClassLoader()));
            case 21:
                return new ub6(mlm0.valueOf(parcel.readString()));
            case 22:
                return new nd6(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 23:
                return fg6.valueOf(parcel.readString());
            case 24:
                return new kg6(parcel.readString(), parcel.readString(), fg6.CREATOR.createFromParcel(parcel));
            case 25:
                return new ng6(parcel.readString(), parcel.readString(), parcel.readString(), fg6.CREATOR.createFromParcel(parcel));
            case 26:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int iM9h = 0;
                boolean z6 = parcel.readInt() != 0;
                kyy kyyVarValueOf = kyy.valueOf(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM9h2 = 0;
                while (iM9h2 != i4) {
                    iM9h2 = AbstractC0000a.m9h(ai6.class, parcel, arrayList3, iM9h2, 1);
                }
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("NOT_LOADED")) {
                    i = 1;
                } else if (string7.equals("LOADED")) {
                    i = 2;
                } else {
                    if (!string7.equals("FAILED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.assistedcuration.searchpage.data.domain.LoadState.".concat(string7));
                    }
                    i = 3;
                }
                ii6 ii6Var = (ii6) parcel.readParcelable(ai6.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM9h3 = 0;
                while (iM9h3 != i5) {
                    iM9h3 = AbstractC0000a.m9h(ai6.class, parcel, arrayList4, iM9h3, 1);
                }
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iM9h != i6) {
                    iM9h = AbstractC0000a.m9h(ai6.class, parcel, arrayList5, iM9h, 1);
                }
                return new ai6(string4, string5, string6, z6, kyyVarValueOf, arrayList3, i, ii6Var, arrayList4, arrayList5);
            case 27:
                return new bi6((cq50) parcel.readParcelable(bi6.class.getClassLoader()));
            case 28:
                return new ci6((dq50) parcel.readParcelable(ci6.class.getClassLoader()));
            default:
                return new di6((lq50) parcel.readParcelable(di6.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f243597a) {
            case 0:
                return new zp5[i];
            case 1:
                return new aq5[i];
            case 2:
                return new bq5[i];
            case 3:
                return new br5[i];
            case 4:
                return new ct5[i];
            case 5:
                return new ft5[i];
            case 6:
                return new jt5[i];
            case 7:
                return new nt5[i];
            case 8:
                return new cw5[i];
            case 9:
                return new kw5[i];
            case 10:
                return new ow5[i];
            case 11:
                return new vw5[i];
            case 12:
                return new iy5[i];
            case 13:
                return new hz5[i];
            case 14:
                return new o36[i];
            case 15:
                return new q56[i];
            case 16:
                return new o86[i];
            case 17:
                return new oa6[i];
            case 18:
                return new pa6[i];
            case 19:
                return new db6[i];
            case 20:
                return new eb6[i];
            case 21:
                return new ub6[i];
            case 22:
                return new nd6[i];
            case 23:
                return new fg6[i];
            case 24:
                return new kg6[i];
            case 25:
                return new ng6[i];
            case 26:
                return new ai6[i];
            case 27:
                return new bi6[i];
            case 28:
                return new ci6[i];
            default:
                return new di6[i];
        }
    }
}
