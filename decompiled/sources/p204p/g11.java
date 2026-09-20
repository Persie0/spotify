package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class g11 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75505a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f75505a) {
            case 0:
                return new h11(parcel.readString());
            case 1:
                parcel.readInt();
                return i11.f97349a;
            case 2:
                return new m11(parcel.readString());
            case 3:
                return new n11(hy0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (mrl) parcel.readParcelable(n11.class.getClassLoader()));
            case 4:
                return new o11(parcel.readInt() != 0, (cix) parcel.readParcelable(o11.class.getClassLoader()));
            case 5:
                return new p11((b01) parcel.readParcelable(p11.class.getClassLoader()));
            case 6:
                return new v11((u11) parcel.readParcelable(v11.class.getClassLoader()));
            case 7:
                return new q11(parcel.readString());
            case 8:
                return new r11(parcel.readString());
            case 9:
                return new s11(parcel.readString());
            case 10:
                return new t11(parcel.readString());
            case 11:
                return new w11((a421) parcel.readParcelable(w11.class.getClassLoader()));
            case 12:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(i9o0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                boolean z = parcel.readInt() != 0;
                Intent intent = (Intent) parcel.readParcelable(o41.class.getClassLoader());
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("READY")) {
                    i = 1;
                } else {
                    if (!string.equals("LOADING")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.accountswitching.addaccountpageimpl.mobius.AddAccountModel.Status.".concat(string));
                    }
                    i = 2;
                }
                return new o41(arrayList, z, intent, i, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 13:
                String string2 = parcel.readString();
                k1n0 k1n0Var = (k1n0) parcel.readParcelable(z71.class.getClassLoader());
                int iM64020m = 0;
                boolean z2 = parcel.readInt() != 0;
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(z71.class, parcel, arrayList2, iM9h, 1);
                }
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM9h2 = 0;
                while (iM9h2 != i4) {
                    iM9h2 = AbstractC0000a.m9h(z71.class, parcel, arrayList3, iM9h2, 1);
                }
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                String string4 = parcel.readString();
                npm0 npm0VarCreateFromParcel = npm0.CREATOR.createFromParcel(parcel);
                gpm0 gpm0VarCreateFromParcel = gpm0.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                while (iM64020m != i5) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new z71(string2, k1n0Var, z2, string3, arrayList2, arrayList3, z3, z4, z5, string4, npm0VarCreateFromParcel, gpm0VarCreateFromParcel, opo.m67548E(linkedHashSet), parcel.readString());
            case 14:
                return new k81(parcel.readString(), (voc1) parcel.readParcelable(k81.class.getClassLoader()), (k1n0) parcel.readParcelable(k81.class.getClassLoader()));
            case 15:
                parcel.readInt();
                return new b91();
            case 16:
                return new z91(parcel.readString(), k8j0.valueOf(parcel.readString()));
            case 17:
                return new ic1(parcel.readString());
            case 18:
                return new ie1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 19:
                return new vf1(parcel.readString());
            case 20:
                return new ql1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i6);
                int iM64020m2 = 0;
                while (iM64020m2 != i6) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet2, iM64020m2, 1);
                }
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i7);
                int iM64020m3 = 0;
                while (iM64020m3 != i7) {
                    iM64020m3 = nap.m64020m(parcel, linkedHashSet3, iM64020m3, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                int iM9h3 = 0;
                while (iM9h3 != i8) {
                    iM9h3 = AbstractC0000a.m9h(vl1.class, parcel, arrayList4, iM9h3, 1);
                }
                int i9 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashSet4.add(parcel.readParcelable(vl1.class.getClassLoader()));
                }
                return new vl1(linkedHashSet2, linkedHashSet3, arrayList4, linkedHashSet4);
            case 22:
                return new jr1(parcel.readString(), parcel.readString());
            case 23:
                String string5 = parcel.readString();
                pr1 pr1VarCreateFromParcel = parcel.readInt() == 0 ? null : pr1.CREATOR.createFromParcel(parcel);
                String string6 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string7 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(i11);
                int iM64020m4 = 0;
                int iM64020m5 = 0;
                while (iM64020m5 != i11) {
                    iM64020m5 = nap.m64020m(parcel, linkedHashSet5, iM64020m5, 1);
                }
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet6 = new LinkedHashSet(i12);
                int iM64020m6 = 0;
                while (iM64020m6 != i12) {
                    iM64020m6 = nap.m64020m(parcel, linkedHashSet6, iM64020m6, 1);
                }
                du1 du1Var = (du1) parcel.readParcelable(qr1.class.getClassLoader());
                boolean z6 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet7 = new LinkedHashSet(i13);
                while (iM64020m4 != i13) {
                    iM64020m4 = nap.m64020m(parcel, linkedHashSet7, iM64020m4, 1);
                }
                return new qr1(string5, pr1VarCreateFromParcel, string6, arrayListCreateStringArrayList, string7, linkedHashSet5, linkedHashSet6, du1Var, z6, linkedHashSet7);
            case 24:
                return new pr1(parcel.readString(), parcel.readString());
            case 25:
                jxz0 jxz0VarCreateFromParcel = jxz0.CREATOR.createFromParcel(parcel);
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iM31715d2 = 0;
                while (iM31715d2 != i14) {
                    iM31715d2 = c7h0.m31715d(jr1.CREATOR, parcel, arrayList5, iM31715d2, 1);
                }
                return new vr1(jxz0VarCreateFromParcel, arrayList5);
            case 26:
                String string8 = parcel.readString();
                int i15 = parcel.readInt();
                LinkedHashSet linkedHashSet8 = new LinkedHashSet(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashSet8.add(ene.CREATOR.createFromParcel(parcel));
                }
                return new vt1(string8, linkedHashSet8);
            case 27:
                parcel.readInt();
                return wt1.f254795a;
            case 28:
                return new xt1(x93.valueOf(parcel.readString()));
            default:
                int i17 = parcel.readInt();
                LinkedHashSet linkedHashSet9 = new LinkedHashSet(i17);
                int iM64020m7 = 0;
                int iM64020m8 = 0;
                while (iM64020m8 != i17) {
                    iM64020m8 = nap.m64020m(parcel, linkedHashSet9, iM64020m8, 1);
                }
                int i18 = parcel.readInt();
                LinkedHashSet linkedHashSet10 = new LinkedHashSet(i18);
                while (iM64020m7 != i18) {
                    iM64020m7 = nap.m64020m(parcel, linkedHashSet10, iM64020m7, 1);
                }
                return new yt1(linkedHashSet9, linkedHashSet10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f75505a) {
            case 0:
                return new h11[i];
            case 1:
                return new i11[i];
            case 2:
                return new m11[i];
            case 3:
                return new n11[i];
            case 4:
                return new o11[i];
            case 5:
                return new p11[i];
            case 6:
                return new v11[i];
            case 7:
                return new q11[i];
            case 8:
                return new r11[i];
            case 9:
                return new s11[i];
            case 10:
                return new t11[i];
            case 11:
                return new w11[i];
            case 12:
                return new o41[i];
            case 13:
                return new z71[i];
            case 14:
                return new k81[i];
            case 15:
                return new b91[i];
            case 16:
                return new z91[i];
            case 17:
                return new ic1[i];
            case 18:
                return new ie1[i];
            case 19:
                return new vf1[i];
            case 20:
                return new ql1[i];
            case 21:
                return new vl1[i];
            case 22:
                return new jr1[i];
            case 23:
                return new qr1[i];
            case 24:
                return new pr1[i];
            case 25:
                return new vr1[i];
            case 26:
                return new vt1[i];
            case 27:
                return new wt1[i];
            case 28:
                return new xt1[i];
            default:
                return new yt1[i];
        }
    }
}
