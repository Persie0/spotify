package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class vmc1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242765a;

    public /* synthetic */ vmc1(int i) {
        this.f242765a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        ArrayList arrayList;
        switch (this.f242765a) {
            case 0:
                parcel.readInt();
                return ymc1.f274221a;
            case 1:
                parcel.readInt();
                return zmc1.f284218a;
            case 2:
                parcel.readInt();
                return anc1.f17366a;
            case 3:
                parcel.readInt();
                return bnc1.f28807a;
            case 4:
                return new cnc1(parcel.readString(), parcel.readString());
            case 5:
                parcel.readInt();
                return dnc1.f50755a;
            case 6:
                parcel.readInt();
                return enc1.f61140a;
            case 7:
                parcel.readInt();
                return fnc1.f71263a;
            case 8:
                return new gnc1(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : cmc1.CREATOR.createFromParcel(parcel));
            case 9:
                return new yqc1((fb6) parcel.readParcelable(yqc1.class.getClassLoader()), parcel.readString());
            case 10:
                return new zqc1(parcel.readString());
            case 11:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(yqc1.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new arc1(arrayList2);
            case 12:
                return new dsc1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                return new avc1(parcel.readString(), parcel.readString());
            case 14:
                parcel.readInt();
                return iwc1.f106395a;
            case 15:
                return new jwc1(mzc1.valueOf(parcel.readString()));
            case 16:
                return new kzc1(mzc1.valueOf(parcel.readString()));
            case 17:
                kzc1 kzc1VarCreateFromParcel = kzc1.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<p68> creator = p68.CREATOR;
                return new lzc1(kzc1VarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 18:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                gm20 gm20VarCreateFromParcel = gm20.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(jnj0.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                cba cbaVarCreateFromParcel = cba.CREATOR.createFromParcel(parcel);
                ifw ifwVarCreateFromParcel = ifw.CREATOR.createFromParcel(parcel);
                boolean z3 = parcel.readInt() != 0;
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("V1")) {
                    i = 1;
                } else {
                    if (!string4.equals("V2")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.voting.root.domain.VotingVersion.".concat(string4));
                    }
                    i = 2;
                }
                return new i1d1(string, string2, string3, i4, gm20VarCreateFromParcel, arrayList3, cbaVarCreateFromParcel, ifwVarCreateFromParcel, z3, i, parcel.readString(), parcel.readString());
            case 19:
                return new k1d1(parcel.readString(), parcel.readString());
            case 20:
                return new l1d1(parcel.readString());
            case 21:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList4.add(parcel.readValue(g3d1.class.getClassLoader()));
                }
                return new g3d1(parcel.readInt(), string5, string6, parcel.readString(), parcel.readString(), arrayList4);
            case 22:
                return new n3d1(parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString());
            case 23:
                return new o3d1(parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                boolean z4 = parcel.readInt() == 0 ? z : true;
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("PORTRAIT")) {
                    i2 = 1;
                } else if (string10.equals("LANDSCAPE")) {
                    i2 = 2;
                } else if (string10.equals("SCREEN_ORIENTATION_LOCKED")) {
                    i2 = 3;
                } else {
                    if (!string10.equals("NONE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.tome.pagecapabilities.properties.ForcedOrientationOnSmallScreen.Mode.".concat(string10));
                    }
                    i2 = 4;
                }
                return new o6d1(i2, string7, string8, string9, z2, z4);
            case 25:
                parcel.readInt();
                return x6d1.f258644a;
            case 26:
                return new a8d1(parcel.readString(), b8d1.valueOf(parcel.readString()), parcel.createStringArrayList());
            case 27:
                int iM31715d3 = 0;
                ArrayList arrayList5 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i8 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i8);
                    int iM31715d4 = 0;
                    while (iM31715d4 != i8) {
                        iM31715d4 = c7h0.m31715d(qn20.CREATOR, parcel, arrayList6, iM31715d4, 1);
                    }
                    arrayList = arrayList6;
                }
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string17 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i9 = parcel.readInt();
                    arrayList5 = new ArrayList(i9);
                    while (iM31715d3 != i9) {
                        iM31715d3 = c7h0.m31715d(zp5.CREATOR, parcel, arrayList5, iM31715d3, 1);
                    }
                }
                return new kcd1(arrayList, string11, string12, string13, string14, string15, string16, boolValueOf, string17, arrayList5);
            case 28:
                parcel.readInt();
                return med1.f142685a;
            default:
                return new ned1(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f242765a) {
            case 0:
                return new ymc1[i];
            case 1:
                return new zmc1[i];
            case 2:
                return new anc1[i];
            case 3:
                return new bnc1[i];
            case 4:
                return new cnc1[i];
            case 5:
                return new dnc1[i];
            case 6:
                return new enc1[i];
            case 7:
                return new fnc1[i];
            case 8:
                return new gnc1[i];
            case 9:
                return new yqc1[i];
            case 10:
                return new zqc1[i];
            case 11:
                return new arc1[i];
            case 12:
                return new dsc1[i];
            case 13:
                return new avc1[i];
            case 14:
                return new iwc1[i];
            case 15:
                return new jwc1[i];
            case 16:
                return new kzc1[i];
            case 17:
                return new lzc1[i];
            case 18:
                return new i1d1[i];
            case 19:
                return new k1d1[i];
            case 20:
                return new l1d1[i];
            case 21:
                return new g3d1[i];
            case 22:
                return new n3d1[i];
            case 23:
                return new o3d1[i];
            case 24:
                return new o6d1[i];
            case 25:
                return new x6d1[i];
            case 26:
                return new a8d1[i];
            case 27:
                return new kcd1[i];
            case 28:
                return new med1[i];
            default:
                return new ned1[i];
        }
    }
}
