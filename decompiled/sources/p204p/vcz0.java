package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class vcz0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240283a;

    public /* synthetic */ vcz0(int i) {
        this.f240283a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f240283a) {
            case 0:
                return wcz0.valueOf(parcel.readString());
            case 1:
                return new vez0(parcel.readString());
            case 2:
                return new efz0(parcel.readString(), parcel.readInt() != 0);
            case 3:
                return new hfz0(parcel.readString(), parcel.readInt() != 0);
            case 4:
                return new mgz0(parcel.readLong(), parcel.readInt() != 0);
            case 5:
                ktx0 ktx0Var = (ktx0) parcel.readParcelable(zmz0.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                return new zmz0(ktx0Var, arrayList);
            case 6:
                return new rnz0(parcel.readString());
            case 7:
                return new tnz0(parcel.readInt(), parcel.readInt());
            case 8:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(tnz0.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new unz0(arrayList2);
            case 9:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet.add(parcel.readParcelable(znz0.class.getClassLoader()));
                }
                return new znz0(linkedHashSet, parcel.readInt() != 0);
            case 10:
                return new jqz0(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 11:
                return new fuz0(parcel.createByteArray());
            case 12:
                return new ixz0(z2c.CREATOR.createFromParcel(parcel), parcel.readLong());
            case 13:
                drp0 drp0VarCreateFromParcel = drp0.CREATOR.createFromParcel(parcel);
                erp0 erp0VarCreateFromParcel = erp0.CREATOR.createFromParcel(parcel);
                la91 la91VarCreateFromParcel = la91.CREATOR.createFromParcel(parcel);
                m5q m5qVarCreateFromParcel = m5q.CREATOR.createFromParcel(parcel);
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashSet2.add(parcel.readParcelable(jxz0.class.getClassLoader()));
                }
                return new jxz0(drp0VarCreateFromParcel, erp0VarCreateFromParcel, la91VarCreateFromParcel, m5qVarCreateFromParcel, linkedHashSet2);
            case 14:
                return new cyz0((zl7) parcel.readParcelable(cyz0.class.getClassLoader()));
            case 15:
                return new e301(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : sh7.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, qfn0.CREATOR.createFromParcel(parcel), parcel.readString(), C2654zl.CREATOR.createFromParcel(parcel));
            case 16:
                return new b801(parcel.readString(), parcel.readString(), parcel.readBundle(b801.class.getClassLoader()), parcel.readInt() != 0);
            case 17:
                return new cc01(parcel.readInt(), parcel.readInt());
            case 18:
                cbm0 cbm0Var = (cbm0) parcel.readSerializable();
                be01 be01Var = (be01) parcel.readParcelable(hc01.class.getClassLoader());
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    i = 0;
                } else {
                    String string2 = parcel.readString();
                    if (string2 == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (!string2.equals("SEARCH")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.settings.platform.page.main.SettingsPageParameters.Source.".concat(string2));
                    }
                    i = 1;
                }
                return new hc01(cbm0Var, be01Var, string, i, null);
            case 19:
                return new ic01(parcel.readString(), parcel.readString());
            case 20:
                return new id01((be01) parcel.readParcelable(id01.class.getClassLoader()), parcel.readInt() != 0);
            case 21:
                return new jd01(parcel.readString());
            case 22:
                return new rd01((cbm0) parcel.readSerializable(), parcel.readString());
            case 23:
                return new be01(parcel.readString());
            case 24:
                return new ge01((cbm0) parcel.readSerializable(), (be01) parcel.readParcelable(ge01.class.getClassLoader()), parcel.readInt() != 0);
            case 25:
                return tg01.valueOf(parcel.readString());
            case 26:
                return new qi01((d850) parcel.readParcelable(qi01.class.getClassLoader()), parcel.readLong(), lnn0.valueOf(parcel.readString()));
            case 27:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i9);
                int iM75732f = 0;
                while (iM75732f != i9) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new vi01(string3, string4, string5, string6, linkedHashMap, b8f.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, ((nu71) parcel.readParcelable(vi01.class.getClassLoader())).f158526a);
            case 28:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                int iM75732f2 = 0;
                while (iM75732f2 != i10) {
                    iM75732f2 = rkh0.m75732f(parcel, linkedHashMap2, parcel.readString(), iM75732f2, 1);
                }
                ern0 ern0VarM67547D = opo.m67547D(linkedHashMap2);
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                int iM31715d2 = 0;
                while (iM31715d2 != i11) {
                    iM31715d2 = c7h0.m31715d(c8f.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new wi01(string7, string8, string9, string10, ern0VarM67547D, opo.m67546C(arrayList3), parcel.readInt(), (sab0) parcel.readParcelable(wi01.class.getClassLoader()), parcel.readInt() != 0, y8a0.m93117v(parcel.readString()), parcel.readString());
            default:
                return new uj01(parcel.readFloat(), parcel.readFloat());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f240283a) {
            case 0:
                return new wcz0[i];
            case 1:
                return new vez0[i];
            case 2:
                return new efz0[i];
            case 3:
                return new hfz0[i];
            case 4:
                return new mgz0[i];
            case 5:
                return new zmz0[i];
            case 6:
                return new rnz0[i];
            case 7:
                return new tnz0[i];
            case 8:
                return new unz0[i];
            case 9:
                return new znz0[i];
            case 10:
                return new jqz0[i];
            case 11:
                return new fuz0[i];
            case 12:
                return new ixz0[i];
            case 13:
                return new jxz0[i];
            case 14:
                return new cyz0[i];
            case 15:
                return new e301[i];
            case 16:
                return new b801[i];
            case 17:
                return new cc01[i];
            case 18:
                return new hc01[i];
            case 19:
                return new ic01[i];
            case 20:
                return new id01[i];
            case 21:
                return new jd01[i];
            case 22:
                return new rd01[i];
            case 23:
                return new be01[i];
            case 24:
                return new ge01[i];
            case 25:
                return new tg01[i];
            case 26:
                return new qi01[i];
            case 27:
                return new vi01[i];
            case 28:
                return new wi01[i];
            default:
                return new uj01[i];
        }
    }
}
