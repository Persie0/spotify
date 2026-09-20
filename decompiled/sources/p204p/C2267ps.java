package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p000.AbstractC0000a;

/* JADX INFO: renamed from: p.ps */
/* JADX INFO: loaded from: classes4.dex */
public final class C2267ps implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180699a;

    public /* synthetic */ C2267ps(int i) {
        this.f180699a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        int i3;
        switch (this.f180699a) {
            case 0:
                return new C2312qs(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 1:
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iM9h = 0;
                while (iM9h != i4) {
                    iM9h = AbstractC0000a.m9h(C2349rs.class, parcel, arrayList, iM9h, 1);
                }
                return new C2349rs(opo.m67546C(arrayList), parcel.readInt() != 0, (C1681av) parcel.readParcelable(C2349rs.class.getClassLoader()), parcel.readInt() != 0);
            case 2:
                return new C2387ss(parcel.readInt() != 0);
            case 3:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("NOT_STARTED")) {
                    i = 1;
                } else if (string.equals("IN_PROGRESS")) {
                    i = 2;
                } else if (string.equals("CANCELLED")) {
                    i = 3;
                } else if (string.equals("FAILED")) {
                    i = 4;
                } else {
                    if (!string.equals(SearchEndpointResponseKt.RESULT_SUCCESS)) {
                        throw new IllegalArgumentException("No enum constant com.spotify.accountswitching.switcheruiimpl.mobius.models.AccountSwitchStatus.".concat(string));
                    }
                    i = 5;
                }
                return new C2509vu(i);
            case 4:
                return new C2548wu(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new C2589xu(parcel.readString());
            case 6:
                return new C1681av(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 7:
                return new C2591xw(parcel.readString());
            case 8:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z2 = false;
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                if (parcel.readInt() == 0) {
                    z3 = z2;
                }
                if (parcel.readInt() == 0) {
                    z3 = z2;
                }
                return new C2628yw(string2, string3, z2, z3, z3, parcel.readInt() != 0, (bs10) parcel.readParcelable(C2628yw.class.getClassLoader()));
            case 9:
                String string4 = parcel.readString();
                boolean z4 = false;
                boolean z5 = true;
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() == 0) {
                    z5 = z4;
                }
                if (parcel.readInt() != 0) {
                    z4 = z5;
                }
                if (parcel.readInt() != 0) {
                    z = false;
                } else {
                    z5 = z4;
                    z = z5;
                }
                String string5 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new C2665zw(string4, z6, z4, z5, z4, z5, string5, arrayListCreateStringArrayList, z);
            case 10:
                parcel.readInt();
                return C1722bz.f32333a;
            case 11:
                parcel.readInt();
                return C1759cz.f43410a;
            case 12:
                parcel.readInt();
                return C2433tz.f225078a;
            case 13:
                return new o00(parcel.readString());
            case 14:
                return new u00(parcel.readString());
            case 15:
                return new p10(parcel.readInt() != 0);
            case 16:
                return new q10((d850) parcel.readParcelable(q10.class.getClassLoader()));
            case 17:
                return new e20(parcel.readString());
            case 18:
                return new vd0(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                return new zd0(parcel.readString(), parcel.readString(), parcel.readString(), tfu.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 20:
                parcel.readInt();
                return ae0.f14705a;
            case 21:
                return new ee0(parcel.createStringArrayList(), tfu.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 22:
                parcel.readInt();
                return fe0.f68628a;
            case 23:
                return new xf0(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 24:
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
                }
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (string11 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string11.equals("NORMAL")) {
                    i2 = 1;
                } else {
                    if (!string11.equals("REMINDER_AD")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.adsinternal.adscore.model.Ad.AdType.".concat(string11));
                    }
                    i2 = 2;
                }
                int i5 = i2;
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                int iM75732f = 0;
                while (iM75732f != i6) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                b7d0 b7d0VarCreateFromParcel = b7d0.CREATOR.createFromParcel(parcel);
                String string12 = parcel.readString();
                if (string12 == null) {
                    throw new IllegalArgumentException("LineItemIdentifier value cannot be null in parcel");
                }
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (string14 == null) {
                    throw new IllegalArgumentException("RequestIdentifier value cannot be null in parcel");
                }
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                Format formatValueOf = Format.valueOf(parcel.readString());
                boolean z9 = parcel.readInt() != 0;
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList2.add(parcel.readValue(fh0.class.getClassLoader()));
                }
                String string15 = parcel.readString();
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i9);
                int i10 = 0;
                while (i10 != i9) {
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                    i10++;
                    i9 = i9;
                }
                String string16 = parcel.readString();
                if (string16 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string16.equals("MANAGED")) {
                    i3 = 1;
                } else {
                    if (!string16.equals("UNMANAGED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.adsinternal.adscore.model.Ad.AdLifecycle.".concat(string16));
                    }
                    i3 = 2;
                }
                return new fh0(string6, string7, string8, string9, string10, i5, (Map) linkedHashMap, b7d0VarCreateFromParcel, string12, string13, string14, z7, z8, formatValueOf, z9, (List) arrayList2, string15, (Map) linkedHashMap2, i3);
            case 25:
                aly alyVar = (aly) parcel.readParcelable(lo0.class.getClassLoader());
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                if (string18 == null) {
                    throw new IllegalArgumentException("LineItemIdentifier value cannot be null in parcel");
                }
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                if (string20 == null) {
                    throw new IllegalArgumentException("RequestIdentifier value cannot be null in parcel");
                }
                String string21 = parcel.readString();
                if (string21 != null) {
                    return new lo0(alyVar, string17, string18, string19, string20, string21, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
                }
                throw new IllegalArgumentException("AdIdentifier value cannot be null in parcel");
            case 26:
                return new lu0(parcel.readInt(), parcel.readInt());
            case 27:
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readParcelable(my0.class.getClassLoader()));
                }
                return new my0(linkedHashSet, (fpp) parcel.readParcelable(my0.class.getClassLoader()), (xyu0) parcel.readParcelable(my0.class.getClassLoader()));
            case 28:
                return new xz0(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString());
            default:
                return new yz0(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f180699a) {
            case 0:
                return new C2312qs[i];
            case 1:
                return new C2349rs[i];
            case 2:
                return new C2387ss[i];
            case 3:
                return new C2509vu[i];
            case 4:
                return new C2548wu[i];
            case 5:
                return new C2589xu[i];
            case 6:
                return new C1681av[i];
            case 7:
                return new C2591xw[i];
            case 8:
                return new C2628yw[i];
            case 9:
                return new C2665zw[i];
            case 10:
                return new C1722bz[i];
            case 11:
                return new C1759cz[i];
            case 12:
                return new C2433tz[i];
            case 13:
                return new o00[i];
            case 14:
                return new u00[i];
            case 15:
                return new p10[i];
            case 16:
                return new q10[i];
            case 17:
                return new e20[i];
            case 18:
                return new vd0[i];
            case 19:
                return new zd0[i];
            case 20:
                return new ae0[i];
            case 21:
                return new ee0[i];
            case 22:
                return new fe0[i];
            case 23:
                return new xf0[i];
            case 24:
                return new fh0[i];
            case 25:
                return new lo0[i];
            case 26:
                return new lu0[i];
            case 27:
                return new my0[i];
            case 28:
                return new xz0[i];
            default:
                return new yz0[i];
        }
    }
}
