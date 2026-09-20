package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class f2i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65197a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.f65197a) {
            case 0:
                parcel.readInt();
                return g2i.f75963a;
            case 1:
                return new u7i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 2:
                return new edi(parcel.readString());
            case 3:
                return new dei(parcel.readString(), parcel.readString());
            case 4:
                return new ihi(parcel.readString(), parcel.readInt() != 0, u300.valueOf(parcel.readString()));
            case 5:
                String string = parcel.readString();
                dmi dmiVarCreateFromParcel = dmi.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iM31715d = 0;
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(gmi.CREATOR, parcel, arrayList, iM31715d2, 1);
                }
                kmi kmiVarCreateFromParcel = kmi.CREATOR.createFromParcel(parcel);
                fmi fmiVarCreateFromParcel = fmi.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(emi.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string4 = parcel.readString();
                ol21 ol21VarValueOf = parcel.readInt() == 0 ? null : ol21.valueOf(parcel.readString());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("BACK_ARROW")) {
                    i = 1;
                } else if (string6.equals("BACK")) {
                    i = 2;
                } else {
                    if (!string6.equals("CANCEL")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.NavigationButton.".concat(string6));
                    }
                    i = 3;
                }
                return new cmi(string, dmiVarCreateFromParcel, arrayList, kmiVarCreateFromParcel, fmiVarCreateFromParcel, string2, string3, z, arrayList2, arrayListCreateStringArrayList, string4, ol21VarValueOf, string5, i);
            case 6:
                return new dmi(parcel.readString(), parcel.readString());
            case 7:
                return new emi(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 8:
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("NEVER")) {
                    i2 = 1;
                } else if (string7.equals("DAILY")) {
                    i2 = 2;
                } else if (string7.equals("WEEKLY")) {
                    i2 = 3;
                } else {
                    if (!string7.equals("MONTHLY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.ScheduleType.".concat(string7));
                    }
                    i2 = 4;
                }
                if (parcel.readInt() == 0) {
                    i3 = 0;
                } else {
                    String string8 = parcel.readString();
                    if (string8 == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string8.equals("SUNDAY")) {
                        i3 = 1;
                    } else if (string8.equals("MONDAY")) {
                        i3 = 2;
                    } else if (string8.equals("TUESDAY")) {
                        i3 = 3;
                    } else if (string8.equals("WEDNESDAY")) {
                        i3 = 4;
                    } else if (string8.equals("THURSDAY")) {
                        i3 = 5;
                    } else if (string8.equals("FRIDAY")) {
                        i3 = 6;
                    } else {
                        if (!string8.equals("SATURDAY")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.bluejay.confirmgenerationpage.api.ConfirmGenerationNavigationContract.DayOfWeek.".concat(string8));
                        }
                        i3 = 7;
                    }
                }
                return new fmi(i2, i3);
            case 9:
                return new gmi((jmi) parcel.readParcelable(gmi.class.getClassLoader()));
            case 10:
                return new hmi(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 11:
                return new imi(parcel.readString());
            case 12:
                return new kmi(parcel.readString(), parcel.readString());
            case 13:
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("FORCED_OFFLINE")) {
                    i4 = 1;
                } else {
                    if (!string9.equals("NO_INTERNET")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.connectivity.connectiontype.OfflineReason.".concat(string9));
                    }
                    i4 = 2;
                }
                return new pzi(i4);
            case 14:
                parcel.readInt();
                return rzi.f204155a;
            case 15:
                return new n2j(parcel.readString(), parcel.readInt() != 0);
            case 16:
                return new o2j(parcel.readString());
            case 17:
                parcel.readInt();
                return u2j.f226107a;
            case 18:
                parcel.readInt();
                return t3j.f216787a;
            case 19:
                return new u3j(parcel.createStringArrayList());
            case 20:
                return new v3j(parcel.createStringArrayList(), parcel.createStringArrayList());
            case 21:
                return new x3j((w3j) parcel.readParcelable(x3j.class.getClassLoader()));
            case 22:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM31715d3 = 0;
                while (iM31715d3 != i7) {
                    iM31715d3 = c7h0.m31715d(n2j.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new m4j(arrayList3);
            case 23:
                return new paj(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new ebj(parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                parcel.readInt();
                return fbj.f67843a;
            case 26:
                return new gbj(parcel.readString());
            case 27:
                return new hbj(parcel.readString(), parcel.readString());
            case 28:
                return new kbj(parcel.readString(), (voc1) parcel.readParcelable(kbj.class.getClassLoader()));
            default:
                return new tbj(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f65197a) {
            case 0:
                return new g2i[i];
            case 1:
                return new u7i[i];
            case 2:
                return new edi[i];
            case 3:
                return new dei[i];
            case 4:
                return new ihi[i];
            case 5:
                return new cmi[i];
            case 6:
                return new dmi[i];
            case 7:
                return new emi[i];
            case 8:
                return new fmi[i];
            case 9:
                return new gmi[i];
            case 10:
                return new hmi[i];
            case 11:
                return new imi[i];
            case 12:
                return new kmi[i];
            case 13:
                return new pzi[i];
            case 14:
                return new rzi[i];
            case 15:
                return new n2j[i];
            case 16:
                return new o2j[i];
            case 17:
                return new u2j[i];
            case 18:
                return new t3j[i];
            case 19:
                return new u3j[i];
            case 20:
                return new v3j[i];
            case 21:
                return new x3j[i];
            case 22:
                return new m4j[i];
            case 23:
                return new paj[i];
            case 24:
                return new ebj[i];
            case 25:
                return new fbj[i];
            case 26:
                return new gbj[i];
            case 27:
                return new hbj[i];
            case 28:
                return new kbj[i];
            default:
                return new tbj[i];
        }
    }
}
