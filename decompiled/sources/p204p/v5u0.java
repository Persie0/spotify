package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class v5u0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237648a;

    public /* synthetic */ v5u0(int i) {
        this.f237648a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f237648a) {
            case 0:
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM9h = 0;
                while (iM9h != i) {
                    iM9h = AbstractC0000a.m9h(w5u0.class, parcel, arrayList, iM9h, 1);
                }
                return new w5u0(string, arrayList, parcel.readString(), (gp8) parcel.readParcelable(w5u0.class.getClassLoader()));
            case 1:
                return new x5u0(w5u0.CREATOR.createFromParcel(parcel));
            case 2:
                return new y5u0((gp8) parcel.readParcelable(y5u0.class.getClassLoader()));
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new l7u0(parcel.readString(), parcel.readInt());
            case 5:
                return new o9u0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 6:
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iM9h2 = 0;
                while (iM9h2 != i2) {
                    iM9h2 = AbstractC0000a.m9h(ibu0.class, parcel, arrayList2, iM9h2, 1);
                }
                return new ibu0(parcel.readString(), arrayList2, parcel.readInt() != 0);
            case 7:
                return new jbu0(parcel.readString(), parcel.readString(), ss8.valueOf(parcel.readString()));
            case 8:
                return new kbu0(parcel.readString(), parcel.readString(), ss8.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : jbu0.CREATOR.createFromParcel(parcel));
            case 9:
                return new ocu0(parcel.readInt(), (pua1) parcel.readParcelable(ocu0.class.getClassLoader()));
            case 10:
                return new pcu0(parcel.readString(), parcel.readString(), pla1.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            case 11:
                return new xcu0(parcel.readString(), parcel.readInt());
            case 12:
                int i3 = parcel.readInt();
                qf40 qf40VarM67574x = null;
                if (i3 > 0) {
                    b450 b450VarM63417Y = n0e1.m63417Y(0, i3);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = b450VarM63417Y.iterator();
                    while (((a450) it).hasNext()) {
                        ((t350) it).nextInt();
                        String string2 = parcel.readString();
                        xcu0 xcu0Var = string2 == null ? null : new xcu0(string2, parcel.readInt());
                        if (xcu0Var != null) {
                            arrayList3.add(xcu0Var);
                        }
                    }
                    qf40VarM67574x = opo.m67574x(arrayList3);
                }
                return new zcu0(qf40VarM67574x);
            case 13:
                return new tfu0(parcel.readString(), parcel.readString());
            case 14:
                int i4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(ocu0.CREATOR, parcel, arrayList4, iM31715d, 1);
                }
                return new vfu0(parcel.readInt(), parcel.readString(), parcel.readString(), arrayList4);
            case 15:
                return new bgu0(parcel.readString(), parcel.readString());
            case 16:
                return new ohu0((faa0) parcel.readParcelable(ohu0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
            case 17:
                return new kju0(jju0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 18:
                return new jju0(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 19:
                String string3 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                int iM9h3 = 0;
                while (iM9h3 != i5) {
                    iM9h3 = AbstractC0000a.m9h(lju0.class, parcel, arrayList5, iM9h3, 1);
                }
                return new lju0(string3, arrayList5);
            case 20:
                return new yku0(parcel.readInt() != 0, parcel.readString(), (faa0) parcel.readParcelable(yku0.class.getClassLoader()), parcel.readInt());
            case 21:
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i6);
                int iM9h4 = 0;
                while (iM9h4 != i6) {
                    iM9h4 = AbstractC0000a.m9h(clu0.class, parcel, arrayList6, iM9h4, 1);
                }
                return new clu0(string4, arrayList6);
            case 22:
                return new dlu0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 23:
                return new apu0(parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new jtu0(parcel.readString());
            case 25:
                parcel.readInt();
                return vyu0.f246331a;
            case 26:
                long j = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashSet.add(parcel.readParcelable(wyu0.class.getClassLoader()));
                }
                int i9 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashSet2.add(parcel.readParcelable(wyu0.class.getClassLoader()));
                }
                return new wyu0(j, z, linkedHashSet, linkedHashSet2, parcel.readInt() != 0);
            case 27:
                return new czu0(parcel.readString(), lzu0.valueOf(parcel.readString()), pla1.CREATOR.createFromParcel(parcel));
            case 28:
                return new yzu0(parcel.readString(), parcel.readInt() != 0);
            default:
                parcel.readInt();
                return g1v0.f75757a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f237648a) {
            case 0:
                return new w5u0[i];
            case 1:
                return new x5u0[i];
            case 2:
                return new y5u0[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new l7u0[i];
            case 5:
                return new o9u0[i];
            case 6:
                return new ibu0[i];
            case 7:
                return new jbu0[i];
            case 8:
                return new kbu0[i];
            case 9:
                return new ocu0[i];
            case 10:
                return new pcu0[i];
            case 11:
                return new xcu0[i];
            case 12:
                return new zcu0[i];
            case 13:
                return new tfu0[i];
            case 14:
                return new vfu0[i];
            case 15:
                return new bgu0[i];
            case 16:
                return new ohu0[i];
            case 17:
                return new kju0[i];
            case 18:
                return new jju0[i];
            case 19:
                return new lju0[i];
            case 20:
                return new yku0[i];
            case 21:
                return new clu0[i];
            case 22:
                return new dlu0[i];
            case 23:
                return new apu0[i];
            case 24:
                return new jtu0[i];
            case 25:
                return new vyu0[i];
            case 26:
                return new wyu0[i];
            case 27:
                return new czu0[i];
            case 28:
                return new yzu0[i];
            default:
                return new g1v0[i];
        }
    }
}
