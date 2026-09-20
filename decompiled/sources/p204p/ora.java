package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ora implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168515a;

    public /* synthetic */ ora(int i) {
        this.f168515a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.f168515a) {
            case 0:
                Bundle bundle = parcel.readBundle(ora.class.getClassLoader());
                Objects.requireNonNull(bundle);
                return new pra(bundle);
            case 1:
                return new C1760d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createStringArrayList(), parcel.readLong());
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new C1796e(string, string2, string3, string4, z, parcel.readInt() != 0, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            case 3:
                return new C1839f(parcel.readString(), parcel.readString());
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(C1839f.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i2);
                    int iM31715d2 = 0;
                    while (iM31715d2 != i2) {
                        iM31715d2 = c7h0.m31715d(C1916h.CREATOR, parcel, arrayList3, iM31715d2, 1);
                    }
                    arrayList = arrayList3;
                }
                return new C1879g(string5, string6, string7, string8, z2, z3, z4, z5, z6, arrayList2, arrayList);
            case 5:
                return new C1916h(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new C2598y2(parcel.readString(), parcel.readString());
            case 7:
                return new C1801e4(parcel.readString());
            case 8:
                return new C2325r4(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (z0r) parcel.readParcelable(C2325r4.class.getClassLoader()));
            case 9:
                return new C2040k5(parcel.readString(), parcel.createStringArrayList());
            case 10:
                return new C2078l5(parcel.readString(), parcel.createStringArrayList());
            case 11:
                return new C1735cb((AbstractC1662ac) parcel.readValue(C1735cb.class.getClassLoader()), (AbstractC2566xb) parcel.readValue(C1735cb.class.getClassLoader()), (AbstractC2332rb) parcel.readValue(C1735cb.class.getClassLoader()), (AbstractC2010jc) parcel.readValue(C1735cb.class.getClassLoader()), parcel.readInt() != 0);
            case 12:
                return new C1772db((AbstractC2209oc) parcel.readValue(C1772db.class.getClassLoader()), (AbstractC1892gc) parcel.readValue(C1772db.class.getClassLoader()), (AbstractC2010jc) parcel.readValue(C1772db.class.getClassLoader()), (AbstractC2566xb) parcel.readValue(C1772db.class.getClassLoader()), (AbstractC2332rb) parcel.readValue(C1772db.class.getClassLoader()), parcel.readInt() != 0);
            case 13:
                return new C2208ob(parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                parcel.readInt();
                return C2250pb.f175656a;
            case 15:
                return new C2287qb(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 16:
                return new C2370sb(parcel.readInt() != 0, parcel.readInt() != 0);
            case 17:
                parcel.readInt();
                return C2407tb.f218722a;
            case 18:
                return new C2447ub(parcel.readInt() != 0, parcel.readInt() != 0);
            case 19:
                return new C2489vb(parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                return new C2527wb(parcel.readInt() != 0, parcel.readInt() != 0);
            case 21:
                return new C2607yb(parcel.readInt() != 0);
            case 22:
                parcel.readInt();
                return C2644zb.f281194a;
            case 23:
                return new C1699bc(parcel.readInt() != 0);
            case 24:
                parcel.readInt();
                return C1736cc.f36273a;
            case 25:
                parcel.readInt();
                return C1773dc.f47398a;
            case 26:
                parcel.readInt();
                return C1809ec.f58163a;
            case 27:
                parcel.readInt();
                return C1855fc.f67961a;
            case 28:
                parcel.readInt();
                return C1932hc.f89644a;
            default:
                return new C1974ic(parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f168515a) {
            case 0:
                return new pra[i];
            case 1:
                return new C1760d[i];
            case 2:
                return new C1796e[i];
            case 3:
                return new C1839f[i];
            case 4:
                return new C1879g[i];
            case 5:
                return new C1916h[i];
            case 6:
                return new C2598y2[i];
            case 7:
                return new C1801e4[i];
            case 8:
                return new C2325r4[i];
            case 9:
                return new C2040k5[i];
            case 10:
                return new C2078l5[i];
            case 11:
                return new C1735cb[i];
            case 12:
                return new C1772db[i];
            case 13:
                return new C2208ob[i];
            case 14:
                return new C2250pb[i];
            case 15:
                return new C2287qb[i];
            case 16:
                return new C2370sb[i];
            case 17:
                return new C2407tb[i];
            case 18:
                return new C2447ub[i];
            case 19:
                return new C2489vb[i];
            case 20:
                return new C2527wb[i];
            case 21:
                return new C2607yb[i];
            case 22:
                return new C2644zb[i];
            case 23:
                return new C1699bc[i];
            case 24:
                return new C1736cc[i];
            case 25:
                return new C1773dc[i];
            case 26:
                return new C1809ec[i];
            case 27:
                return new C1855fc[i];
            case 28:
                return new C1932hc[i];
            default:
                return new C1974ic[i];
        }
    }
}
