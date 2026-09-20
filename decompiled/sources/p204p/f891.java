package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class f891 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66920a;

    public /* synthetic */ f891(int i) {
        this.f66920a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f66920a) {
            case 0:
                return new g891(parcel.readString());
            case 1:
                return new j891(parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iM64020m = 0;
                int iM64020m2 = 0;
                while (iM64020m2 != i) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet, iM64020m2, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashSet2.add(r9y0.CREATOR.createFromParcel(parcel));
                }
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i4);
                int iM64020m3 = 0;
                while (iM64020m3 != i4) {
                    iM64020m3 = nap.m64020m(parcel, linkedHashSet3, iM64020m3, 1);
                }
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i5);
                int iM64020m4 = 0;
                while (iM64020m4 != i5) {
                    iM64020m4 = nap.m64020m(parcel, linkedHashSet4, iM64020m4, 1);
                }
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(i6);
                while (iM64020m != i6) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet5, iM64020m, 1);
                }
                return new la91(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, linkedHashSet5);
            case 3:
                String string = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new gb91(string, z, (h891) parcel.readParcelable(gb91.class.getClassLoader()), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readString(), (nb91) parcel.readParcelable(gb91.class.getClassLoader()), (dlx) parcel.readParcelable(gb91.class.getClassLoader()));
            case 4:
                return new hb91((b370) parcel.readParcelable(hb91.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (d0n0) parcel.readParcelable(hb91.class.getClassLoader()), parcel.readInt() == 0 ? null : xxm0.valueOf(parcel.readString()), (dlx) parcel.readParcelable(hb91.class.getClassLoader()));
            case 5:
                parcel.readInt();
                return ib91.f100492a;
            case 6:
                parcel.readInt();
                return jb91.f110716a;
            case 7:
                parcel.readInt();
                return kb91.f121155a;
            case 8:
                parcel.readInt();
                return lb91.f131604a;
            case 9:
                parcel.readInt();
                return mb91.f141842a;
            case 10:
                parcel.readInt();
                return uc91.f228976a;
            case 11:
                return new vc91(parcel.readString());
            case 12:
                return new wc91(parcel.readInt() != 0);
            case 13:
                parcel.readInt();
                return xc91.f260172a;
            case 14:
                parcel.readInt();
                return ch91.f37968d;
            case 15:
                parcel.readInt();
                return dh91.f49023d;
            case 16:
                parcel.readInt();
                return eh91.f59520d;
            case 17:
                parcel.readInt();
                return fh91.f69614d;
            case 18:
                parcel.readInt();
                return gh91.f79859d;
            case 19:
                parcel.readInt();
                return hh91.f91309d;
            case 20:
                parcel.readInt();
                return ih91.f102214d;
            case 21:
                return new hj91((jh91) parcel.readParcelable(hj91.class.getClassLoader()), parcel.readInt());
            case 22:
                return new uk91(parcel.readLong(), parcel.readLong());
            case 23:
                return new fl91(parcel.readString());
            case 24:
                parcel.readInt();
                return ay91.f21170a;
            case 25:
                parcel.readInt();
                return by91.f32116a;
            case 26:
                parcel.readInt();
                return cy91.f43193a;
            case 27:
                parcel.readInt();
                return ey91.f63995a;
            case 28:
                return new h1a1(parcel.readInt() != 0);
            default:
                return new f2a1(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f66920a) {
            case 0:
                return new g891[i];
            case 1:
                return new j891[i];
            case 2:
                return new la91[i];
            case 3:
                return new gb91[i];
            case 4:
                return new hb91[i];
            case 5:
                return new ib91[i];
            case 6:
                return new jb91[i];
            case 7:
                return new kb91[i];
            case 8:
                return new lb91[i];
            case 9:
                return new mb91[i];
            case 10:
                return new uc91[i];
            case 11:
                return new vc91[i];
            case 12:
                return new wc91[i];
            case 13:
                return new xc91[i];
            case 14:
                return new ch91[i];
            case 15:
                return new dh91[i];
            case 16:
                return new eh91[i];
            case 17:
                return new fh91[i];
            case 18:
                return new gh91[i];
            case 19:
                return new hh91[i];
            case 20:
                return new ih91[i];
            case 21:
                return new hj91[i];
            case 22:
                return new uk91[i];
            case 23:
                return new fl91[i];
            case 24:
                return new ay91[i];
            case 25:
                return new by91[i];
            case 26:
                return new cy91[i];
            case 27:
                return new ey91[i];
            case 28:
                return new h1a1[i];
            default:
                return new f2a1[i];
        }
    }
}
