package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class na7 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151961a;

    public /* synthetic */ na7(int i) {
        this.f151961a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f151961a) {
            case 0:
                return new oa7(ag1.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 1:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                qsj qsjVarValueOf = qsj.valueOf(parcel.readString());
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(efz0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new td7(string, string2, string3, qsjVarValueOf, z, arrayList, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            case 2:
                return new be7(parcel.readString());
            case 3:
                return new se7(parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new jf7(parcel.readString());
            case 5:
                return new eg7(parcel.readString(), parcel.createByteArray());
            case 6:
                return new wi7(parcel.readString(), parcel.readInt() == 0 ? null : C1856fd.CREATOR.createFromParcel(parcel), (eg7) parcel.readParcelable(wi7.class.getClassLoader()));
            case 7:
                return new kj7(parcel.createByteArray());
            case 8:
                return new wl7((e301) parcel.readParcelable(wl7.class.getClassLoader()));
            case 9:
                return new xl7(parcel.readInt() == 0 ? null : sh7.valueOf(parcel.readString()));
            case 10:
                return new hm7(parcel);
            case 11:
                return new im7(parcel);
            case 12:
                return new jm7(parcel);
            case 13:
                parcel.readInt();
                return jn7.f114035a;
            case 14:
                return new jo7(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (mr20) parcel.readParcelable(jo7.class.getClassLoader()));
            case 15:
                return new lo7(parcel.readString(), (voc1) parcel.readParcelable(lo7.class.getClassLoader()), parcel.readString(), jo7.CREATOR.createFromParcel(parcel));
            case 16:
                parcel.readInt();
                return mo7.f145603a;
            case 17:
                return xx7.valueOf(parcel.readString());
            case 18:
                return new w28(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : do80.CREATOR.createFromParcel(parcel));
            case 19:
                return new i38(parcel.readString(), (j38) parcel.readParcelable(i38.class.getClassLoader()));
            case 20:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(m1z0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new j38(arrayList2);
            case 21:
                return new k38(parcel.readString(), qb31.CREATOR.createFromParcel(parcel));
            case 22:
                return new p38(parcel.readString(), (a48) parcel.readParcelable(p38.class.getClassLoader()));
            case 23:
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d3 = 0;
                while (iM31715d3 != i4) {
                    iM31715d3 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("NEW")) {
                    i = 1;
                } else {
                    if (!string5.equals("RECENT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.uiusecases.autocompleterow.AutocompleteRow.Type.".concat(string5));
                    }
                    i = 2;
                }
                return new s38(string4, arrayList3, i, parcel.readInt() != 0);
            case 24:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d4 = 0;
                while (iM31715d4 != i5) {
                    iM31715d4 = c7h0.m31715d(zbv.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                return new a48(arrayList4, parcel.readInt() == 0 ? null : xt8.CREATOR.createFromParcel(parcel));
            case 25:
                return new j58(parcel.readInt() != 0);
            case 26:
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iM31715d5 = 0;
                while (iM31715d5 != i6) {
                    iM31715d5 = c7h0.m31715d(b6q0.CREATOR, parcel, arrayList5, iM31715d5, 1);
                }
                return new o68(arrayList5, parcel.readDouble(), parcel.readDouble());
            case 27:
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                int iM31715d6 = 0;
                while (iM31715d6 != i7) {
                    iM31715d6 = c7h0.m31715d(o68.CREATOR, parcel, arrayList6, iM31715d6, 1);
                }
                return new p68(arrayList6, parcel.readDouble(), parcel.readDouble());
            case 28:
                return n78.valueOf(parcel.readString());
            default:
                return new h98(parcel.readInt(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f151961a) {
            case 0:
                return new oa7[i];
            case 1:
                return new td7[i];
            case 2:
                return new be7[i];
            case 3:
                return new se7[i];
            case 4:
                return new jf7[i];
            case 5:
                return new eg7[i];
            case 6:
                return new wi7[i];
            case 7:
                return new kj7[i];
            case 8:
                return new wl7[i];
            case 9:
                return new xl7[i];
            case 10:
                return new hm7[i];
            case 11:
                return new im7[i];
            case 12:
                return new jm7[i];
            case 13:
                return new jn7[i];
            case 14:
                return new jo7[i];
            case 15:
                return new lo7[i];
            case 16:
                return new mo7[i];
            case 17:
                return new xx7[i];
            case 18:
                return new w28[i];
            case 19:
                return new i38[i];
            case 20:
                return new j38[i];
            case 21:
                return new k38[i];
            case 22:
                return new p38[i];
            case 23:
                return new s38[i];
            case 24:
                return new a48[i];
            case 25:
                return new j58[i];
            case 26:
                return new o68[i];
            case 27:
                return new p68[i];
            case 28:
                return new n78[i];
            default:
                return new h98[i];
        }
    }
}
