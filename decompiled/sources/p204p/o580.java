package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class o580 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161911a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f161911a) {
            case 0:
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readParcelable(p580.class.getClassLoader()), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new p580(z, opo.m67547D(linkedHashMap));
            case 1:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(f880.class, parcel, arrayList, iM9h, 1);
                }
                return new f880(arrayList);
            case 2:
                parcel.readInt();
                return g880.f77435b;
            case 3:
                parcel.readInt();
                return h880.f88652b;
            case 4:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM9h2 = 0;
                while (iM9h2 != i4) {
                    iM9h2 = AbstractC0000a.m9h(i880.class, parcel, arrayList2, iM9h2, 1);
                }
                return new i880(arrayList2, parcel.readInt() != 0);
            case 5:
                parcel.readInt();
                return j880.f109864b;
            case 6:
                parcel.readInt();
                return k880.f120269b;
            case 7:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM9h3 = 0;
                while (iM9h3 != i5) {
                    iM9h3 = AbstractC0000a.m9h(l880.class, parcel, arrayList3, iM9h3, 1);
                }
                return new l880(arrayList3);
            case 8:
                parcel.readInt();
                return m880.f140941b;
            case 9:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM9h4 = 0;
                while (iM9h4 != i6) {
                    iM9h4 = AbstractC0000a.m9h(n880.class, parcel, arrayList4, iM9h4, 1);
                }
                return new n880(arrayList4);
            case 10:
                parcel.readInt();
                return o880.f162732b;
            case 11:
                parcel.readInt();
                return p880.f174896b;
            case 12:
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                int iM9h5 = 0;
                while (iM9h5 != i7) {
                    iM9h5 = AbstractC0000a.m9h(q880.class, parcel, arrayList5, iM9h5, 1);
                }
                return new q880(arrayList5);
            case 13:
                parcel.readInt();
                return r880.f196735b;
            case 14:
                parcel.readInt();
                return s880.f206600b;
            case 15:
                parcel.readInt();
                return t880.f218004b;
            case 16:
                parcel.readInt();
                return u880.f227857b;
            case 17:
                parcel.readInt();
                return v880.f238430b;
            case 18:
                parcel.readInt();
                return w880.f248883b;
            case 19:
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                int iM9h6 = 0;
                while (iM9h6 != i8) {
                    iM9h6 = AbstractC0000a.m9h(x880.class, parcel, arrayList6, iM9h6, 1);
                }
                return new x880(arrayList6);
            case 20:
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                int iM9h7 = 0;
                while (iM9h7 != i9) {
                    iM9h7 = AbstractC0000a.m9h(y880.class, parcel, arrayList7, iM9h7, 1);
                }
                return new y880(arrayList7);
            case 21:
                parcel.readInt();
                return z880.f280406b;
            case 22:
                parcel.readInt();
                return a980.f13517b;
            case 23:
                parcel.readInt();
                return b980.f24800b;
            case 24:
                parcel.readInt();
                return c980.f35422b;
            case 25:
                parcel.readInt();
                return d980.f46745b;
            case 26:
                int i10 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i10);
                int iM9h8 = 0;
                while (iM9h8 != i10) {
                    iM9h8 = AbstractC0000a.m9h(e980.class, parcel, arrayList8, iM9h8, 1);
                }
                return new e980(arrayList8);
            case 27:
                int i11 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i11);
                int iM9h9 = 0;
                while (iM9h9 != i11) {
                    iM9h9 = AbstractC0000a.m9h(f980.class, parcel, arrayList9, iM9h9, 1);
                }
                return new f980(arrayList9);
            case 28:
                parcel.readInt();
                return g980.f77703b;
            default:
                parcel.readInt();
                return h980.f88893b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f161911a) {
            case 0:
                return new p580[i];
            case 1:
                return new f880[i];
            case 2:
                return new g880[i];
            case 3:
                return new h880[i];
            case 4:
                return new i880[i];
            case 5:
                return new j880[i];
            case 6:
                return new k880[i];
            case 7:
                return new l880[i];
            case 8:
                return new m880[i];
            case 9:
                return new n880[i];
            case 10:
                return new o880[i];
            case 11:
                return new p880[i];
            case 12:
                return new q880[i];
            case 13:
                return new r880[i];
            case 14:
                return new s880[i];
            case 15:
                return new t880[i];
            case 16:
                return new u880[i];
            case 17:
                return new v880[i];
            case 18:
                return new w880[i];
            case 19:
                return new x880[i];
            case 20:
                return new y880[i];
            case 21:
                return new z880[i];
            case 22:
                return new a980[i];
            case 23:
                return new b980[i];
            case 24:
                return new c980[i];
            case 25:
                return new d980[i];
            case 26:
                return new e980[i];
            case 27:
                return new f980[i];
            case 28:
                return new g980[i];
            default:
                return new h980[i];
        }
    }
}
