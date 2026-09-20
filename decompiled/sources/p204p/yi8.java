package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class yi8 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273061a;

    public /* synthetic */ yi8(int i) {
        this.f273061a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i;
        switch (this.f273061a) {
            case 0:
                return new zi8(parcel);
            case 1:
                return new dj8(parcel);
            case 2:
                return new tk8(parcel.readInt(), parcel.readInt());
            case 3:
                return new am8((jm8) parcel.readParcelable(am8.class.getClassLoader()), parcel.readString());
            case 4:
                return new gm8(parcel.readString(), parcel.readString());
            case 5:
                return new hm8(parcel.readString());
            case 6:
                return new im8(parcel.readString());
            case 7:
                return new xn8(am8.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : hm8.CREATOR.createFromParcel(parcel));
            case 8:
                return new zn8((icr0) parcel.readParcelable(zn8.class.getClassLoader()), (gcr0) parcel.readParcelable(zn8.class.getClassLoader()));
            case 9:
                return new ao8((go8) parcel.readParcelable(ao8.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                parcel.readInt();
                return co8.f40198a;
            case 11:
                parcel.readInt();
                return do8.f50966a;
            case 12:
                parcel.readInt();
                return eo8.f61340a;
            case 13:
                return new fo8(parcel.readString());
            case 14:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(lo8.class, parcel, arrayList, iM9h, 1);
                }
                gcr0 gcr0Var = (gcr0) parcel.readParcelable(lo8.class.getClassLoader());
                int iM79365s = stz0.m79365s(parcel.readString());
                ou31 ou31Var = (ou31) parcel.readParcelable(lo8.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                k1b1 k1b1Var = (k1b1) parcel.readParcelable(lo8.class.getClassLoader());
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                int iM75732f = 0;
                while (iM75732f != i3) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                ern0 ern0VarM67547D = opo.m67547D(linkedHashMap);
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new lo8(string, arrayList, gcr0Var, iM79365s, ou31Var, string2, string3, string4, k1b1Var, ern0VarM67547D, string5, boolValueOf, (ao8) parcel.readParcelable(lo8.class.getClassLoader()), (zn8) parcel.readParcelable(lo8.class.getClassLoader()), (xr01) parcel.readParcelable(lo8.class.getClassLoader()), (ck01) parcel.readParcelable(lo8.class.getClassLoader()), (f2r) parcel.readParcelable(lo8.class.getClassLoader()));
            case 15:
                String string6 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM9h2 = 0;
                while (iM9h2 != i5) {
                    iM9h2 = AbstractC0000a.m9h(mo8.class, parcel, arrayList2, iM9h2, 1);
                }
                AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(arrayList2);
                gcr0 gcr0Var2 = (gcr0) parcel.readParcelable(mo8.class.getClassLoader());
                int iM79365s2 = stz0.m79365s(parcel.readString());
                ao8 ao8Var = (ao8) parcel.readParcelable(mo8.class.getClassLoader());
                zn8 zn8Var = (zn8) parcel.readParcelable(mo8.class.getClassLoader());
                ck01 ck01Var = (ck01) parcel.readParcelable(mo8.class.getClassLoader());
                ou31 ou31Var2 = (ou31) parcel.readParcelable(mo8.class.getClassLoader());
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                k1b1 k1b1Var2 = (k1b1) parcel.readParcelable(mo8.class.getClassLoader());
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
                int iM75732f2 = 0;
                while (true) {
                    int i7 = iM79365s2;
                    if (iM75732f2 == i6) {
                        k1b1 k1b1Var3 = k1b1Var2;
                        ern0 ern0VarM67547D2 = opo.m67547D(linkedHashMap2);
                        String string10 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            boolValueOf2 = null;
                        } else {
                            boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new mo8(string6, i4, abstractC2524w8M67546C, gcr0Var2, i7, ao8Var, zn8Var, ck01Var, ou31Var2, string7, string8, string9, k1b1Var3, ern0VarM67547D2, string10, boolValueOf2, (xr01) parcel.readParcelable(mo8.class.getClassLoader()), (f2r) parcel.readParcelable(mo8.class.getClassLoader()), null);
                    }
                    iM75732f2 = rkh0.m75732f(parcel, linkedHashMap2, parcel.readString(), iM75732f2, 1);
                    iM79365s2 = i7;
                    k1b1Var2 = k1b1Var2;
                }
                break;
            case 16:
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                int iM9h3 = 0;
                while (iM9h3 != i8) {
                    iM9h3 = AbstractC0000a.m9h(so8.class, parcel, arrayList3, iM9h3, 1);
                }
                gcr0 gcr0Var3 = (gcr0) parcel.readParcelable(so8.class.getClassLoader());
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                k1b1 k1b1Var4 = (k1b1) parcel.readParcelable(so8.class.getClassLoader());
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i9);
                int iM75732f3 = 0;
                while (iM75732f3 != i9) {
                    iM75732f3 = rkh0.m75732f(parcel, linkedHashMap3, parcel.readString(), iM75732f3, 1);
                }
                String string14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new so8(arrayList3, gcr0Var3, string11, string12, string13, k1b1Var4, linkedHashMap3, string14, boolValueOf3, parcel.readInt() == 0 ? null : ao8.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? zn8.CREATOR.createFromParcel(parcel) : null, (f2r) parcel.readParcelable(so8.class.getClassLoader()));
            case 17:
                return new zo8(parcel.readString(), ap8.valueOf(parcel.readString()));
            case 18:
                return new gp8(parcel.createStringArrayList(), parcel.readString());
            case 19:
                cq8 cq8Var = new cq8();
                cq8Var.f40785c = 255;
                cq8Var.f40786d = -1;
                cq8Var.f40783a = parcel.readInt();
                cq8Var.f40784b = parcel.readInt();
                cq8Var.f40785c = parcel.readInt();
                cq8Var.f40786d = parcel.readInt();
                cq8Var.f40787e = parcel.readInt();
                cq8Var.f40788f = parcel.readString();
                cq8Var.f40789g = parcel.readInt();
                cq8Var.f40791i = parcel.readInt();
                cq8Var.f40780X = parcel.readInt();
                cq8Var.f40781Y = parcel.readInt();
                cq8Var.f40782Z = parcel.readInt();
                cq8Var.f40777L0 = parcel.readInt();
                cq8Var.f40778M0 = parcel.readInt();
                cq8Var.f40779N0 = parcel.readInt();
                cq8Var.f40792t = parcel.readInt() != 0;
                return cq8Var;
            case 20:
                return new it8(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
            case 21:
                String string15 = parcel.readString();
                if (string15 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string15.equals(SearchEndpointResponseKt.RESULT_SUCCESS)) {
                    i = 1;
                } else if (string15.equals("NO_MATCH")) {
                    i = 2;
                } else {
                    if (!string15.equals("FAIL")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.libraryimport.matchresult.api.BannerBodyIcon.".concat(string15));
                    }
                    i = 3;
                }
                return new lt8(i, parcel.readString());
            case 22:
                return new xt8(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                parcel.readInt();
                return qv8.f192934a;
            case 24:
                parcel.readInt();
                return vv8.f245169a;
            case 25:
                return new xv8(parcel.readInt(), parcel.readInt());
            case 26:
                return new z19(z2c.CREATOR.createFromParcel(parcel));
            case 27:
                acc0 acc0VarCreateFromParcel = acc0.CREATOR.createFromParcel(parcel);
                na80 na80VarCreateFromParcel = na80.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                boolean z6 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                Parcelable.Creator<o8a> creator = o8a.CREATOR;
                return new n89(acc0VarCreateFromParcel, na80VarCreateFromParcel, i10, z, z2, z3, z4, z5, i11, i12, z6, i13, i14, z7, z8, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, wcz0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, n78.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, ab20.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, ppo0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, c0l0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                cc9 cc9VarCreateFromParcel = parcel.readInt() == 0 ? null : cc9.CREATOR.createFromParcel(parcel);
                String string16 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                int iM9h4 = 0;
                while (true) {
                    if (iM9h4 == i15) {
                        int i16 = parcel.readInt();
                        ArrayList arrayList5 = new ArrayList(i16);
                        int iM31715d = 0;
                        while (iM31715d != i16) {
                            iM31715d = c7h0.m31715d(ge9.CREATOR, parcel, arrayList5, iM31715d, 1);
                        }
                        return new bc9(cc9VarCreateFromParcel, string16, arrayList4, arrayList5, parcel.readInt() != 0 ? ec9.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readString(), (p4t0) parcel.readParcelable(bc9.class.getClassLoader()), parcel.createStringArrayList());
                    }
                    iM9h4 = AbstractC0000a.m9h(bc9.class, parcel, arrayList4, iM9h4, 1);
                }
                break;
            default:
                return new cc9(parcel.readString(), parcel.readInt() == 0 ? null : qyl.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f273061a) {
            case 0:
                return new zi8[i];
            case 1:
                return new dj8[i];
            case 2:
                return new tk8[i];
            case 3:
                return new am8[i];
            case 4:
                return new gm8[i];
            case 5:
                return new hm8[i];
            case 6:
                return new im8[i];
            case 7:
                return new xn8[i];
            case 8:
                return new zn8[i];
            case 9:
                return new ao8[i];
            case 10:
                return new co8[i];
            case 11:
                return new do8[i];
            case 12:
                return new eo8[i];
            case 13:
                return new fo8[i];
            case 14:
                return new lo8[i];
            case 15:
                return new mo8[i];
            case 16:
                return new so8[i];
            case 17:
                return new zo8[i];
            case 18:
                return new gp8[i];
            case 19:
                return new cq8[i];
            case 20:
                return new it8[i];
            case 21:
                return new lt8[i];
            case 22:
                return new xt8[i];
            case 23:
                return new qv8[i];
            case 24:
                return new vv8[i];
            case 25:
                return new xv8[i];
            case 26:
                return new z19[i];
            case 27:
                return new n89[i];
            case 28:
                return new bc9[i];
            default:
                return new cc9[i];
        }
    }
}
