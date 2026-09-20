package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public final class eqy implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61976a;

    public /* synthetic */ eqy(int i) {
        this.f61976a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        switch (this.f61976a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    return new fqy(string, string2);
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
            case 1:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (string4 != null) {
                    return new gqy(string3, string4);
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
            case 2:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (string6 != null) {
                    return new hqy(string5, string6);
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
            case 3:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (string8 != null) {
                    return new iqy(string7, string8);
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
            case 4:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (string10 != null) {
                    return new jqy(string9, string10);
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
            case 5:
                return new nuy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 6:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM31715d = 0;
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(g6e.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new ouy(string11, string12, parcel.readString(), opo.m67546C(arrayList2));
            case 7:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int iM31715d2 = 0;
                while (iM31715d2 != i6) {
                    iM31715d2 = c7h0.m31715d(ais.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new puy(string13, string14, parcel.readString(), opo.m67546C(arrayList3));
            case 8:
                return new quy(parcel.readString());
            case 9:
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                if (string17 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string17.equals("TEXT")) {
                    i = 1;
                } else if (string17.equals("NUMBER")) {
                    i = 2;
                } else if (string17.equals("PHONE")) {
                    i = 3;
                } else if (string17.equals("EMAIL")) {
                    i = 4;
                } else {
                    if (!string17.equals("HIDDEN")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.payment.paymentimpl.data.InputFieldType.".concat(string17));
                    }
                    i = 5;
                }
                int i7 = i;
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                int iM9h = 0;
                while (iM9h != i8) {
                    iM9h = AbstractC0000a.m9h(ruy.class, parcel, arrayList4, iM9h, 1);
                }
                return new ruy(string15, string16, i7, string18, string19, opo.m67546C(arrayList4), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(parcel.createStringArrayList());
                chn0 chn0VarCreateFromParcel = chn0.CREATOR.createFromParcel(parcel);
                jgn0 jgn0VarCreateFromParcel = jgn0.CREATOR.createFromParcel(parcel);
                boolean z = false;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                int i9 = parcel.readInt();
                z = parcel.readInt() != 0;
                String string22 = parcel.readString();
                if (string22 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string22.equals("Loading")) {
                    i2 = 1;
                } else if (string22.equals("Loaded")) {
                    i2 = 2;
                } else {
                    if (!string22.equals("Failed")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.payment.paymentimpl.data.PciLoadState.".concat(string22));
                    }
                    i2 = 3;
                }
                return new suy(string20, string21, abstractC2524w8M67546C, chn0VarCreateFromParcel, jgn0VarCreateFromParcel, z, z2, z2, i9, z, i2, parcel.readDouble());
            case 11:
                String string23 = parcel.readString();
                String string24 = parcel.readString();
                if (string24 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string24.equals("BODY_SMALL")) {
                    i3 = 1;
                } else if (string24.equals("BODY_MEDIUM")) {
                    i3 = 2;
                } else {
                    if (!string24.equals("MARGINAL")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.payment.paymentimpl.data.FieldState.Text.Variant.".concat(string24));
                    }
                    i3 = 3;
                }
                return new tuy(string23, i3);
            case 12:
                String string25 = parcel.readString();
                String string26 = parcel.readString();
                String string27 = parcel.readString();
                String string28 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(i10);
                    int iM31715d3 = 0;
                    while (iM31715d3 != i10) {
                        iM31715d3 = c7h0.m31715d(gvy.CREATOR, parcel, arrayList5, iM31715d3, 1);
                    }
                    arrayList = arrayList5;
                }
                return new hvy(string25, string26, string27, string28, arrayList, parcel.readInt() != 0, fvy.CREATOR.createFromParcel(parcel));
            case 13:
                return new fvy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new gvy(parcel.readString(), parcel.readString());
            case 15:
                String string29 = parcel.readString();
                String string30 = parcel.readString();
                String string31 = parcel.readString();
                String string32 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                int iM31715d4 = 0;
                while (iM31715d4 != i11) {
                    iM31715d4 = c7h0.m31715d(ivy.CREATOR, parcel, arrayList6, iM31715d4, 1);
                }
                return new jvy(string29, string30, string31, string32, parcel.readString(), arrayList6);
            case 16:
                return new ivy(parcel.readString(), parcel.readString());
            case 17:
                return new kvy(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                String string33 = parcel.readString();
                u6z u6zVar = (u6z) parcel.readParcelable(hyy.class.getClassLoader());
                String string34 = parcel.readString();
                int iM31715d5 = 0;
                boolean z3 = parcel.readInt() != 0;
                String string35 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i12);
                while (iM31715d5 != i12) {
                    iM31715d5 = c7h0.m31715d(hyy.CREATOR, parcel, arrayList7, iM31715d5, 1);
                }
                return new hyy(string33, u6zVar, string34, z3, string35, arrayList7, parcel.readString());
            case 19:
                return new jyy(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            case 20:
                String string36 = parcel.readString();
                String string37 = parcel.readString();
                String string38 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashSet.add(fyy.CREATOR.createFromParcel(parcel));
                }
                return new fyy(string36, string37, string38, z4, linkedHashSet);
            case 21:
                String string39 = parcel.readString();
                if (string39 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string39.equals("SINGLE")) {
                    i4 = 1;
                } else {
                    if (!string39.equals("MULTIPLE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.filterandsort.api.model.FilterAndSortConfig.SelectType.".concat(string39));
                    }
                    i4 = 2;
                }
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                int iM31715d6 = 0;
                int iM31715d7 = 0;
                while (iM31715d7 != i15) {
                    iM31715d7 = c7h0.m31715d(n2z.CREATOR, parcel, arrayList8, iM31715d7, 1);
                }
                int i16 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i16);
                while (iM31715d6 != i16) {
                    iM31715d6 = c7h0.m31715d(nr31.CREATOR, parcel, arrayList9, iM31715d6, 1);
                }
                return new lyy(i4, arrayList8, arrayList9);
            case 22:
                return new zyy(lyy.CREATOR.createFromParcel(parcel));
            case 23:
                nr31 nr31VarCreateFromParcel = nr31.CREATOR.createFromParcel(parcel);
                int i17 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i17);
                int iM31715d8 = 0;
                while (iM31715d8 != i17) {
                    iM31715d8 = c7h0.m31715d(n2z.CREATOR, parcel, arrayList10, iM31715d8, 1);
                }
                return new azy(arrayList10, nr31VarCreateFromParcel);
            case 24:
                int i18 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i18);
                int iM31715d9 = 0;
                while (iM31715d9 != i18) {
                    iM31715d9 = c7h0.m31715d(b3z.CREATOR, parcel, arrayList11, iM31715d9, 1);
                }
                return new wzy(arrayList11);
            case 25:
                parcel.readInt();
                return zzy.f288155a;
            case 26:
                return new a0z(f2z.valueOf(parcel.readString()));
            case 27:
                return new s0z(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                int i19 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i19);
                int iM31715d10 = 0;
                while (iM31715d10 != i19) {
                    iM31715d10 = c7h0.m31715d(s0z.CREATOR, parcel, arrayList12, iM31715d10, 1);
                }
                return new w0z(arrayList12, parcel.readString());
            default:
                return new o1z(parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? p68.CREATOR.createFromParcel(parcel) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f61976a) {
            case 0:
                return new fqy[i];
            case 1:
                return new gqy[i];
            case 2:
                return new hqy[i];
            case 3:
                return new iqy[i];
            case 4:
                return new jqy[i];
            case 5:
                return new nuy[i];
            case 6:
                return new ouy[i];
            case 7:
                return new puy[i];
            case 8:
                return new quy[i];
            case 9:
                return new ruy[i];
            case 10:
                return new suy[i];
            case 11:
                return new tuy[i];
            case 12:
                return new hvy[i];
            case 13:
                return new fvy[i];
            case 14:
                return new gvy[i];
            case 15:
                return new jvy[i];
            case 16:
                return new ivy[i];
            case 17:
                return new kvy[i];
            case 18:
                return new hyy[i];
            case 19:
                return new jyy[i];
            case 20:
                return new fyy[i];
            case 21:
                return new lyy[i];
            case 22:
                return new zyy[i];
            case 23:
                return new azy[i];
            case 24:
                return new wzy[i];
            case 25:
                return new zzy[i];
            case 26:
                return new a0z[i];
            case 27:
                return new s0z[i];
            case 28:
                return new w0z[i];
            default:
                return new o1z[i];
        }
    }
}
