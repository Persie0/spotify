package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.p044v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.p044v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.p044v1.proto.Error;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class xuf0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266102a;

    public /* synthetic */ xuf0(int i) {
        this.f266102a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f266102a) {
            case 0:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                Class<yuf0> cls = yuf0.class;
                csh0 csh0Var = (csh0) parcel.readParcelable(cls.getClassLoader());
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                jbp0 jbp0Var = (jbp0) parcel.readParcelable(cls.getClassLoader());
                b791 b791Var = (b791) parcel.readParcelable(cls.getClassLoader());
                b791 b791Var2 = (b791) parcel.readParcelable(cls.getClassLoader());
                b791 b791Var3 = (b791) parcel.readParcelable(cls.getClassLoader());
                xx7 xx7VarCreateFromParcel = xx7.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (true) {
                    Class<yuf0> cls2 = cls;
                    if (iM31715d == i2) {
                        int i3 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i3);
                        int iM31715d2 = 0;
                        while (iM31715d2 != i3) {
                            iM31715d2 = c7h0.m31715d(mky.CREATOR, parcel, arrayList2, iM31715d2, 1);
                            i3 = i3;
                        }
                        boolean z4 = parcel.readInt() != 0;
                        boolean z5 = parcel.readInt() != 0;
                        Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                        b791 b791Var4 = (b791) parcel.readParcelable(cls2.getClassLoader());
                        b791 b791Var5 = (b791) parcel.readParcelable(cls2.getClassLoader());
                        b791 b791Var6 = (b791) parcel.readParcelable(cls2.getClassLoader());
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        b791 b791Var7 = (b791) parcel.readParcelable(cls2.getClassLoader());
                        h2r0 h2r0Var = (h2r0) parcel.readParcelable(cls2.getClassLoader());
                        boolean z6 = parcel.readInt() != 0;
                        int i4 = parcel.readInt();
                        int i5 = parcel.readInt();
                        int i6 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i6);
                        int i7 = 0;
                        while (i7 != i6) {
                            arrayList3.add(Integer.valueOf(parcel.readInt()));
                            i7++;
                            i6 = i6;
                        }
                        int i8 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i8);
                        int i9 = 0;
                        while (i9 != i8) {
                            arrayList4.add(Integer.valueOf(parcel.readInt()));
                            i9++;
                            i8 = i8;
                        }
                        return new yuf0(z, z2, z3, csh0Var, boolValueOf, jbp0Var, b791Var, b791Var2, b791Var3, xx7VarCreateFromParcel, arrayList, arrayList2, z4, z5, fValueOf, b791Var4, b791Var5, b791Var6, string, string2, b791Var7, h2r0Var, z6, i4, i5, arrayList3, arrayList4, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, (b791) parcel.readParcelable(cls2.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, xjf0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, -1073741824, 49159);
                    }
                    iM31715d = c7h0.m31715d(mky.CREATOR, parcel, arrayList, iM31715d, 1);
                    cls = cls2;
                }
                break;
            case 1:
                int i10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i10);
                int iM31715d3 = 0;
                while (iM31715d3 != i10) {
                    iM31715d3 = c7h0.m31715d(yq50.CREATOR, parcel, arrayList5, iM31715d3, 1);
                }
                return new j1g0(arrayList5, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), (x051) parcel.readParcelable(j1g0.class.getClassLoader()), parcel.readInt() != 0);
            case 2:
                String string3 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList6.add(parcel.createStringArrayList());
                }
                return new l1g0(string3, arrayListCreateStringArrayList, arrayList6, parcel.createStringArrayList());
            case 3:
                return new r1g0(parcel.readString(), parcel.readString());
            case 4:
                return new kph0(parcel.readString(), (bej) parcel.readParcelable(kph0.class.getClassLoader()));
            case 5:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList7.add(Integer.valueOf(parcel.readInt()));
                }
                return new xrh0(i13, arrayList7);
            case 6:
                return new yrh0((rzl0) parcel.readParcelable(yrh0.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return zrh0.f285689a;
            case 8:
                parcel.readInt();
                return ash0.f19458a;
            case 9:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                int iM31715d4 = 0;
                while (iM31715d4 != i16) {
                    iM31715d4 = c7h0.m31715d(mky.CREATOR, parcel, arrayList8, iM31715d4, 1);
                }
                return new bsh0(parcel.readInt(), parcel.readInt(), string4, string5, arrayList8, parcel.readInt() != 0);
            case 10:
                return new kth0((MessageResponseToken) parcel.readParcelable(kth0.class.getClassLoader()));
            case 11:
                return zth0.valueOf(parcel.readString());
            case 12:
                return new rth0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 13:
                return new sth0(parcel.readString());
            case 14:
                parcel.readInt();
                return tth0.f223599a;
            case 15:
                return new uth0(znz0.CREATOR.createFromParcel(parcel), otw0.CREATOR.createFromParcel(parcel));
            case 16:
                return new vth0(znz0.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 17:
                return new wth0((ud21) parcel.readParcelable(wth0.class.getClassLoader()));
            case 18:
                return new iuh0(Error.m6003A(parcel.createByteArray()));
            case 19:
                return new kuh0(CheckoutStatus.m5996u(parcel.createByteArray()));
            case 20:
                return new zvh0(parcel.readInt() == 0 ? null : ouh0.CREATOR.createFromParcel(parcel));
            case 21:
                return new fwh0(parcel.readString());
            case 22:
                return new gwh0((yu41) parcel.readParcelable(gwh0.class.getClassLoader()));
            case 23:
                return new hwh0(parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new mvh0((cy91) parcel.readParcelable(mvh0.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 25:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                String string8 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                int i17 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i17);
                int iM64020m = 0;
                while (iM64020m != i17) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                int i18 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i18);
                int iM64020m2 = 0;
                while (iM64020m2 != i18) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet2, iM64020m2, 1);
                }
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                int i19 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i19);
                int iM64020m3 = 0;
                while (true) {
                    boolean z14 = z7;
                    if (iM64020m3 == i19) {
                        boolean z15 = parcel.readInt() != 0;
                        aaa0 aaa0Var = (aaa0) parcel.readParcelable(pvh0.class.getClassLoader());
                        boolean z16 = parcel.readInt() != 0;
                        boolean z17 = parcel.readInt() != 0;
                        boolean z18 = z15;
                        int i20 = parcel.readInt();
                        ArrayList arrayList9 = new ArrayList(i20);
                        int iM9h = 0;
                        while (iM9h != i20) {
                            iM9h = AbstractC0000a.m9h(pvh0.class, parcel, arrayList9, iM9h, 1);
                            i20 = i20;
                        }
                        return new pvh0(string6, string7, z14, z8, string8, z9, z10, z11, linkedHashSet, linkedHashSet2, z12, z13, linkedHashSet3, z18, aaa0Var, z16, z17, arrayList9, parcel.readString(), parcel.readInt(), 524288);
                    }
                    iM64020m3 = nap.m64020m(parcel, linkedHashSet3, iM64020m3, 1);
                    z7 = z14;
                }
                break;
            case 26:
                String string9 = parcel.readString();
                int i21 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i21);
                int iM31715d5 = 0;
                while (iM31715d5 != i21) {
                    iM31715d5 = c7h0.m31715d(v9v0.CREATOR, parcel, arrayList10, iM31715d5, 1);
                }
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("Error")) {
                    i = 1;
                } else if (string10.equals("Loaded")) {
                    i = 2;
                } else if (string10.equals("Loading")) {
                    i = 3;
                } else {
                    if (!string10.equals("PendingLoad")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.listuxplatformconsumers.standard.sections.morelikethis.mobius.domain.LoadingState.".concat(string10));
                    }
                    i = 4;
                }
                return new qvh0(string9, i, arrayList10);
            case 27:
                String string11 = parcel.readString();
                int iM64020m4 = 0;
                boolean z19 = parcel.readInt() != 0;
                Uri uri = (Uri) parcel.readParcelable(tvh0.class.getClassLoader());
                boolean z20 = parcel.readInt() != 0;
                String string12 = parcel.readString();
                boolean z21 = parcel.readInt() != 0;
                int i22 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i22);
                while (iM64020m4 != i22) {
                    iM64020m4 = nap.m64020m(parcel, linkedHashSet4, iM64020m4, 1);
                }
                return new tvh0(string11, z19, uri, z20, string12, z21, linkedHashSet4);
            case 28:
                int i23 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i23);
                int iM31715d6 = 0;
                while (iM31715d6 != i23) {
                    iM31715d6 = c7h0.m31715d(n5z.CREATOR, parcel, arrayList11, iM31715d6, 1);
                }
                return new ouh0(arrayList11);
            default:
                return new quh0(CheckoutItemUnavailable.m5988u(parcel.createByteArray()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f266102a) {
            case 0:
                return new yuf0[i];
            case 1:
                return new j1g0[i];
            case 2:
                return new l1g0[i];
            case 3:
                return new r1g0[i];
            case 4:
                return new kph0[i];
            case 5:
                return new xrh0[i];
            case 6:
                return new yrh0[i];
            case 7:
                return new zrh0[i];
            case 8:
                return new ash0[i];
            case 9:
                return new bsh0[i];
            case 10:
                return new kth0[i];
            case 11:
                return new zth0[i];
            case 12:
                return new rth0[i];
            case 13:
                return new sth0[i];
            case 14:
                return new tth0[i];
            case 15:
                return new uth0[i];
            case 16:
                return new vth0[i];
            case 17:
                return new wth0[i];
            case 18:
                return new iuh0[i];
            case 19:
                return new kuh0[i];
            case 20:
                return new zvh0[i];
            case 21:
                return new fwh0[i];
            case 22:
                return new gwh0[i];
            case 23:
                return new hwh0[i];
            case 24:
                return new mvh0[i];
            case 25:
                return new pvh0[i];
            case 26:
                return new qvh0[i];
            case 27:
                return new tvh0[i];
            case 28:
                return new ouh0[i];
            default:
                return new quh0[i];
        }
    }
}
