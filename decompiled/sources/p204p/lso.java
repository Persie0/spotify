package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class lso implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136573a;

    public /* synthetic */ lso(int i) {
        this.f136573a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        dd41 dd41VarM74726U = null;
        int iM9h = 0;
        int iM64020m = 0;
        int iM64020m2 = 0;
        int i = 1;
        switch (this.f136573a) {
            case 0:
                return new mso(parcel.readString());
            case 1:
                parcel.readInt();
                return oso.f168842a;
            case 2:
                return new dpp(parcel.readInt() != 0);
            case 3:
                parcel.readInt();
                return m3q.f139697a;
            case 4:
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                int iM64020m3 = 0;
                while (iM64020m3 != i2) {
                    iM64020m3 = nap.m64020m(parcel, linkedHashSet, iM64020m3, 1);
                }
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int iM64020m4 = 0;
                while (iM64020m4 != i3) {
                    iM64020m4 = nap.m64020m(parcel, linkedHashSet2, iM64020m4, 1);
                }
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i4);
                while (iM64020m2 != i4) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet3, iM64020m2, 1);
                }
                return new m5q(linkedHashSet, linkedHashSet2, linkedHashSet3);
            case 5:
                return new hlq(parcel.readString());
            case 6:
                return new knq((pck) parcel.readParcelable(knq.class.getClassLoader()));
            case 7:
                return new soq(parcel.readString());
            case 8:
                return new uoq(parcel.readInt() != 0);
            case 9:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i5);
                while (iM64020m != i5) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet4, iM64020m, 1);
                }
                return new apq(linkedHashSet4);
            case 10:
                return new upq(qsj0.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
            case 11:
                return new qqq(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 12:
                return new pvq(parcel.readString());
            case 13:
                parcel.readInt();
                return new xyq();
            case 14:
                return new fzq((w0b0) parcel.readParcelable(fzq.class.getClassLoader()), rk7.valueOf(parcel.readString()), parcel.readInt() != 0 ? mrl.CREATOR.createFromParcel(parcel) : null);
            case 15:
                return new gzq((fua0) parcel.readParcelable(gzq.class.getClassLoader()));
            case 16:
                return new hzq(C2539wl.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? mrl.CREATOR.createFromParcel(parcel) : null);
            case 17:
                return new izq(parcel.readString());
            case 18:
                return mzq.valueOf(parcel.readString());
            case 19:
                return uzq.valueOf(parcel.readString());
            case 20:
                return wzq.valueOf(parcel.readString());
            case 21:
                return c0r.valueOf(parcel.readString());
            case 22:
                fq01 fq01Var = (fq01) parcel.readParcelable(x0r.class.getClassLoader());
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList.add(tj01.valueOf(parcel.readString()));
                }
                return new x0r(fq01Var, opo.m67546C(arrayList), (z650) parcel.readSerializable());
            case 23:
                fq01 fq01Var2 = (fq01) parcel.readParcelable(y0r.class.getClassLoader());
                String string = parcel.readString();
                if (string != null) {
                    Set set = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(string);
                }
                return new y0r(fq01Var2, dd41VarM74726U, (z650) parcel.readSerializable());
            case 24:
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                while (iM9h != i8) {
                    iM9h = AbstractC0000a.m9h(e2r.class, parcel, arrayList2, iM9h, 1);
                }
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (!string2.equals("PLATFORM")) {
                    if (string2.equals("KEEP")) {
                        i = 2;
                    } else {
                        if (!string2.equals("SMART")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.share.models.DestinationListConfiguration.SortType.".concat(string2));
                        }
                        i = 3;
                    }
                }
                return new e2r(i, arrayList2);
            case 25:
                return new f2r(parcel.readInt() != 0, parcel.readInt() != 0);
            case 26:
                return new f3r((j411) parcel.readParcelable(f3r.class.getClassLoader()));
            case 27:
                parcel.readInt();
                return g3r.f76268a;
            case 28:
                parcel.readInt();
                return h3r.f87292a;
            default:
                parcel.readInt();
                return i3r.f98255a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f136573a) {
            case 0:
                return new mso[i];
            case 1:
                return new oso[i];
            case 2:
                return new dpp[i];
            case 3:
                return new m3q[i];
            case 4:
                return new m5q[i];
            case 5:
                return new hlq[i];
            case 6:
                return new knq[i];
            case 7:
                return new soq[i];
            case 8:
                return new uoq[i];
            case 9:
                return new apq[i];
            case 10:
                return new upq[i];
            case 11:
                return new qqq[i];
            case 12:
                return new pvq[i];
            case 13:
                return new xyq[i];
            case 14:
                return new fzq[i];
            case 15:
                return new gzq[i];
            case 16:
                return new hzq[i];
            case 17:
                return new izq[i];
            case 18:
                return new mzq[i];
            case 19:
                return new uzq[i];
            case 20:
                return new wzq[i];
            case 21:
                return new c0r[i];
            case 22:
                return new x0r[i];
            case 23:
                return new y0r[i];
            case 24:
                return new e2r[i];
            case 25:
                return new f2r[i];
            case 26:
                return new f3r[i];
            case 27:
                return new g3r[i];
            case 28:
                return new h3r[i];
            default:
                return new i3r[i];
        }
    }
}
