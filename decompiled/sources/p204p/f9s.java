package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class f9s implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67333a;

    public /* synthetic */ f9s(int i) {
        this.f67333a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f67333a) {
            case 0:
                return new g9s(parcel);
            case 1:
                return new h9s(parcel);
            case 2:
                return new abs(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new zds(uk91.CREATOR.createFromParcel(parcel));
            case 4:
                parcel.readInt();
                return aes.f14944a;
            case 5:
                return new ahs(parcel);
            case 6:
                return new zgs(parcel);
            case 7:
                return new ais(parcel.readString(), parcel.readString());
            case 8:
                return new eks(parcel.readLong());
            case 9:
                parcel.readInt();
                return jqs.f114969a;
            case 10:
                return new mqs(parcel.readInt(), parcel.readString());
            case 11:
                return new rss(parcel.readString());
            case 12:
                return new yts(parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                return new zus(parcel.readString(), parcel.readString());
            case 14:
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(gys.class, parcel, arrayList, iM9h, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(hys.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new gys(i, arrayList, opo.m67546C(arrayList2));
            case 15:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i4 = parcel.readInt();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int iM75732f = 0;
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                while (iM75732f != i5) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new hys(string, string2, i4, string3, string4, z, z2, string5, arrayListCreateStringArrayList, linkedHashMap);
            case 16:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i7);
                int iM9h2 = 0;
                int iM64020m = 0;
                while (iM64020m != i7) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                while (iM9h2 != i8) {
                    iM9h2 = AbstractC0000a.m9h(kys.class, parcel, arrayList3, iM9h2, 1);
                }
                return new kys(i6, arrayList3, linkedHashSet);
            case 17:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i9 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashSet2.add(parcel.readParcelable(rys.class.getClassLoader()));
                }
                return new rys(string6, string7, linkedHashSet2, (i490) parcel.readParcelable(rys.class.getClassLoader()), (qso) parcel.readParcelable(rys.class.getClassLoader()));
            case 18:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                int i11 = 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                String string10 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                String string11 = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                while (i11 != i12) {
                    linkedHashMap2.put(parcel.readSerializable(), parcel.readParcelable(n0t.class.getClassLoader()));
                    i11++;
                    i12 = i12;
                }
                return new n0t(string8, string9, z3, z4, z5, z6, z7, z8, string10, z9, z10, string11, z11, z12, z13, z14, z15, z16, z17, linkedHashMap2, (r10) parcel.readParcelable(n0t.class.getClassLoader()), (nuc) parcel.readParcelable(n0t.class.getClassLoader()), (nuc) parcel.readParcelable(n0t.class.getClassLoader()));
            case 19:
                return new q0t(parcel.readString(), parcel.readString());
            case 20:
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i13);
                int iM64020m2 = 0;
                while (iM64020m2 != i13) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet3, iM64020m2, 1);
                }
                return new u1t(linkedHashSet3);
            case 21:
                return new a2t(parcel.readString());
            case 22:
                int i14 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i14);
                int iM64020m3 = 0;
                while (iM64020m3 != i14) {
                    iM64020m3 = nap.m64020m(parcel, linkedHashSet4, iM64020m3, 1);
                }
                return new i3t(linkedHashSet4);
            case 23:
                return new o3t(parcel.readString());
            case 24:
                return new a6t(parcel.readString());
            case 25:
                return new r8t(parcel.readString(), parcel.readString(), new c6u0(parcel.readInt(), parcel.readInt(), parcel.readInt()));
            case 26:
                return new t8t(parcel.readString());
            case 27:
                return new a9t(parcel.readString());
            case 28:
                return new b9t(parcel.readString());
            default:
                return new c9t(parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f67333a) {
            case 0:
                return new g9s[i];
            case 1:
                return new h9s[i];
            case 2:
                return new abs[i];
            case 3:
                return new zds[i];
            case 4:
                return new aes[i];
            case 5:
                return new ahs[i];
            case 6:
                return new zgs[i];
            case 7:
                return new ais[i];
            case 8:
                return new eks[i];
            case 9:
                return new jqs[i];
            case 10:
                return new mqs[i];
            case 11:
                return new rss[i];
            case 12:
                return new yts[i];
            case 13:
                return new zus[i];
            case 14:
                return new gys[i];
            case 15:
                return new hys[i];
            case 16:
                return new kys[i];
            case 17:
                return new rys[i];
            case 18:
                return new n0t[i];
            case 19:
                return new q0t[i];
            case 20:
                return new u1t[i];
            case 21:
                return new a2t[i];
            case 22:
                return new i3t[i];
            case 23:
                return new o3t[i];
            case 24:
                return new a6t[i];
            case 25:
                return new r8t[i];
            case 26:
                return new t8t[i];
            case 27:
                return new a9t[i];
            case 28:
                return new b9t[i];
            default:
                return new c9t[i];
        }
    }
}
