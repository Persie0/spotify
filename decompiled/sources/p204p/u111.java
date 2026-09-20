package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class u111 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225644a;

    public /* synthetic */ u111(int i) {
        this.f225644a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        int i;
        switch (this.f225644a) {
            case 0:
                return new v111((ju01) parcel.readParcelable(v111.class.getClassLoader()));
            case 1:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(b311.class, parcel, arrayList, iM9h, 1);
                }
                AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(arrayList);
                ou31 ou31Var = (ou31) parcel.readParcelable(b311.class.getClassLoader());
                u311 u311Var = (u311) parcel.readParcelable(b311.class.getClassLoader());
                ox01 ox01Var = (ox01) parcel.readParcelable(b311.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new b311(abstractC2524w8M67546C, ou31Var, u311Var, ox01Var, z, boolValueOf);
            case 2:
                return new y211(parcel.readString(), (u511) parcel.readParcelable(y211.class.getClassLoader()), (e081) parcel.readParcelable(y211.class.getClassLoader()));
            case 3:
                return new z211(parcel.readString());
            case 4:
                parcel.readInt();
                return c311.f33524a;
            case 5:
                return new r311(parcel.readString());
            case 6:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM9h2 = 0;
                while (iM9h2 != i3) {
                    iM9h2 = AbstractC0000a.m9h(s311.class, parcel, arrayList2, iM9h2, 1);
                }
                return new s311(opo.m67546C(arrayList2));
            case 7:
                parcel.readInt();
                return t311.f216688a;
            case 8:
                return new j411(parcel.readString(), parcel.readString(), ((xs01) parcel.readParcelable(j411.class.getClassLoader())).f265445a, parcel.readString(), (e2r) parcel.readParcelable(j411.class.getClassLoader()), (ku01) parcel.readParcelable(j411.class.getClassLoader()), (ox01) parcel.readParcelable(j411.class.getClassLoader()), (u311) parcel.readParcelable(j411.class.getClassLoader()));
            case 9:
                return new x411(parcel.readInt(), parcel.createStringArrayList());
            case 10:
                parcel.readInt();
                return h511.f87702b;
            case 11:
                parcel.readInt();
                return i511.f98740b;
            case 12:
                return new j511(parcel.readString());
            case 13:
                parcel.readInt();
                return k511.f119387b;
            case 14:
                return new r511((s511) parcel.readParcelable(r511.class.getClassLoader()), (u511) parcel.readParcelable(r511.class.getClassLoader()));
            case 15:
                String string = parcel.readString();
                return new u511(string == null ? null : qpv0.f191387a.mo54112b(Class.forName(string)));
            case 16:
                return new t611(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 17:
                parcel.readInt();
                return ij11.f102668a;
            case 18:
                return new yj11(parcel.readString(), parcel.readString(), (gcr0) parcel.readParcelable(yj11.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 19:
                return new dl11(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                return new mm11(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            case 21:
                return new jo11(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 22:
                return new ko11(parcel.readString());
            case 23:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(efz0.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new lr11(string2, string3, string4, string5, parcel.readInt() != 0, arrayList3);
            case 24:
                parcel.readInt();
                return kw11.f126992a;
            case 25:
                parcel.readInt();
                return lw11.f137433a;
            case 26:
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM9h3 = 0;
                while (iM9h3 != i5) {
                    iM9h3 = AbstractC0000a.m9h(mw11.class, parcel, arrayList4, iM9h3, 1);
                }
                return new mw11(string6, arrayList4, parcel.readInt() != 0);
            case 27:
                parcel.readInt();
                return nw11.f159003a;
            case 28:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("Ready")) {
                    i = 1;
                } else if (string8.equals("Pending")) {
                    i = 2;
                } else {
                    if (!string8.equals("Unknown")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.listplatform.models.Signal.State.".concat(string8));
                    }
                    i = 3;
                }
                return new q121(i, string7, parcel.createByteArray());
            default:
                parcel.readInt();
                return p321.f173546a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f225644a) {
            case 0:
                return new v111[i];
            case 1:
                return new b311[i];
            case 2:
                return new y211[i];
            case 3:
                return new z211[i];
            case 4:
                return new c311[i];
            case 5:
                return new r311[i];
            case 6:
                return new s311[i];
            case 7:
                return new t311[i];
            case 8:
                return new j411[i];
            case 9:
                return new x411[i];
            case 10:
                return new h511[i];
            case 11:
                return new i511[i];
            case 12:
                return new j511[i];
            case 13:
                return new k511[i];
            case 14:
                return new r511[i];
            case 15:
                return new u511[i];
            case 16:
                return new t611[i];
            case 17:
                return new ij11[i];
            case 18:
                return new yj11[i];
            case 19:
                return new dl11[i];
            case 20:
                return new mm11[i];
            case 21:
                return new jo11[i];
            case 22:
                return new ko11[i];
            case 23:
                return new lr11[i];
            case 24:
                return new kw11[i];
            case 25:
                return new lw11[i];
            case 26:
                return new mw11[i];
            case 27:
                return new nw11[i];
            case 28:
                return new q121[i];
            default:
                return new p321[i];
        }
    }
}
