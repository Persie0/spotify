package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class apb0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17902a;

    public /* synthetic */ apb0(int i) {
        this.f17902a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f17902a) {
            case 0:
                parcel.readInt();
                return bpb0.f29397a;
            case 1:
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(vhc.CREATOR.createFromParcel(parcel), parcel.readParcelable(cpb0.class.getClassLoader()));
                }
                return new cpb0(linkedHashMap);
            case 2:
                return new hpb0((gpb0) parcel.readParcelable(hpb0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 3:
                return new epb0(fk80.CREATOR.createFromParcel(parcel).f70497a);
            case 4:
                return new fpb0(fk80.CREATOR.createFromParcel(parcel).f70497a, parcel.readInt());
            case 5:
                parcel.readInt();
                return ipb0.f104465a;
            case 6:
                parcel.readInt();
                return jpb0.f114606a;
            case 7:
                return new lpb0(y8a0.m93119x(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 8:
                parcel.readInt();
                return mpb0.f145955a;
            case 9:
                return new ppb0(fk80.CREATOR.createFromParcel(parcel).f70497a);
            case 10:
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(fk80.CREATOR.createFromParcel(parcel));
                }
                return new qpb0(linkedHashSet, parcel.readInt() != 0);
            case 11:
                return new uqb0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (uib0) parcel.readParcelable(uqb0.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readDouble(), parcel.readInt() != 0, (sab0) parcel.readParcelable(uqb0.class.getClassLoader()), y8a0.m93117v(parcel.readString()), (rjb0) parcel.readParcelable(uqb0.class.getClassLoader()));
            case 12:
                return new yrb0(parcel.readBundle(yrb0.class.getClassLoader()));
            case 13:
                return new wsb0(parcel.readString());
            case 14:
                return new btb0(parcel.readString(), parcel.readString());
            case 15:
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new gub0(string, string2, z, parcel.readInt() != 0, (fub0) parcel.readParcelable(gub0.class.getClassLoader()));
            case 16:
                return new aub0((byw0) parcel.readParcelable(aub0.class.getClassLoader()));
            case 17:
                parcel.readInt();
                return bub0.f31075a;
            case 18:
                parcel.readInt();
                return cub0.f42083a;
            case 19:
                parcel.readInt();
                return dub0.f53026a;
            case 20:
                return new eub0(parcel.readInt() != 0);
            case 21:
                return new rvb0(parcel.readParcelable(rvb0.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case 22:
                return new hzb0((wwu) parcel.readParcelable(hzb0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 23:
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iM31715d = 0;
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(zbv.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new tzb0(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : jcv0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : xt8.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : yfz.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? wzy.CREATOR.createFromParcel(parcel) : null);
            case 24:
                return new z0c0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                k1n0 k1n0Var = (k1n0) parcel.readParcelable(r2c0.class.getClassLoader());
                k3c0 k3c0VarValueOf = k3c0.valueOf(parcel.readString());
                int iM75732f = 0;
                boolean z2 = parcel.readInt() != 0;
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM31715d2 = 0;
                while (iM31715d2 != i6) {
                    iM31715d2 = c7h0.m31715d(h3c0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM31715d3 = 0;
                while (iM31715d3 != i7) {
                    iM31715d3 = c7h0.m31715d(z0c0.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                int iM31715d4 = 0;
                while (iM31715d4 != i8) {
                    iM31715d4 = c7h0.m31715d(c2n0.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                int iM31715d5 = 0;
                while (iM31715d5 != i9) {
                    iM31715d5 = c7h0.m31715d(n0n0.CREATOR, parcel, arrayList5, iM31715d5, 1);
                }
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                while (iM75732f != i10) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap2, parcel.readString(), iM75732f, 1);
                }
                return new r2c0(string3, string4, k1n0Var, k3c0VarValueOf, z2, arrayList2, arrayList3, arrayList4, arrayList5, linkedHashMap2, parcel.readString());
            case 26:
                return new f3c0(parcel.readString(), (voc1) parcel.readParcelable(f3c0.class.getClassLoader()), (k1n0) parcel.readParcelable(f3c0.class.getClassLoader()), parcel.readString());
            case 27:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean z3 = false;
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                if (parcel.readInt() == 0) {
                    z4 = z3;
                }
                return new h3c0(string5, string6, string7, string8, string9, string10, z3, z4, z4, z4, z4, parcel.readInt() != 0);
            case 28:
                return new o3c0(parcel.readString());
            default:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                int iM9h = 0;
                while (iM9h != i11) {
                    iM9h = AbstractC0000a.m9h(b4c0.class, parcel, arrayList6, iM9h, 1);
                }
                return new b4c0(string11, string12, arrayList6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f17902a) {
            case 0:
                return new bpb0[i];
            case 1:
                return new cpb0[i];
            case 2:
                return new hpb0[i];
            case 3:
                return new epb0[i];
            case 4:
                return new fpb0[i];
            case 5:
                return new ipb0[i];
            case 6:
                return new jpb0[i];
            case 7:
                return new lpb0[i];
            case 8:
                return new mpb0[i];
            case 9:
                return new ppb0[i];
            case 10:
                return new qpb0[i];
            case 11:
                return new uqb0[i];
            case 12:
                return new yrb0[i];
            case 13:
                return new wsb0[i];
            case 14:
                return new btb0[i];
            case 15:
                return new gub0[i];
            case 16:
                return new aub0[i];
            case 17:
                return new bub0[i];
            case 18:
                return new cub0[i];
            case 19:
                return new dub0[i];
            case 20:
                return new eub0[i];
            case 21:
                return new rvb0[i];
            case 22:
                return new hzb0[i];
            case 23:
                return new tzb0[i];
            case 24:
                return new z0c0[i];
            case 25:
                return new r2c0[i];
            case 26:
                return new f3c0[i];
            case 27:
                return new h3c0[i];
            case 28:
                return new o3c0[i];
            default:
                return new b4c0[i];
        }
    }
}
