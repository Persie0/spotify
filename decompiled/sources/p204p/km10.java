package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class km10 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124028a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f124028a) {
            case 0:
                parcel.readInt();
                return lm10.f134739a;
            case 1:
                return new nm10(parcel.readString(), (rdt0) parcel.readParcelable(nm10.class.getClassLoader()));
            case 2:
                return new cp10(parcel.readString(), parcel.readString());
            case 3:
                return new dp10(parcel.readString());
            case 4:
                return new lr10((cbm0) parcel.readSerializable(), (voc1) parcel.readParcelable(lr10.class.getClassLoader()), ss10.valueOf(parcel.readString()), (voc1) parcel.readParcelable(lr10.class.getClassLoader()));
            case 5:
                return new mr10(ss10.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                return new yr10(ss10.valueOf(parcel.readString()));
            case 7:
                parcel.readInt();
                return zr10.f285520a;
            case 8:
                return new as10(parcel.readInt());
            case 9:
                return new ns10(ss10.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (vct) parcel.readParcelable(ns10.class.getClassLoader()));
            case 10:
                return new rs10(parcel.readInt() != 0, ss10.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 11:
                parcel.readInt();
                return ht10.f94894a;
            case 12:
                parcel.readInt();
                return it10.f105391a;
            case 13:
                parcel.readInt();
                return jt10.f115685a;
            case 14:
                parcel.readInt();
                return kt10.f126115a;
            case 15:
                return new ot10(ss10.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 16:
                return new st10(ss10.valueOf(parcel.readString()));
            case 17:
                parcel.readInt();
                return new yu10();
            case 18:
                lt10 lt10Var = (lt10) parcel.readParcelable(hv10.class.getClassLoader());
                String string = parcel.readString();
                ss10 ss10VarValueOf = ss10.valueOf(parcel.readString());
                boolean z = false;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new hv10(lt10Var, string, ss10VarValueOf, z, z2, parcel.readInt() != 0);
            case 19:
                return new lv10(ss10.valueOf(parcel.readString()));
            case 20:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                qco0 qco0Var = (qco0) parcel.readParcelable(aw10.class.getClassLoader());
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ss10 ss10VarValueOf2 = ss10.valueOf(parcel.readString());
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new aw10(string2, string3, string4, qco0Var, i, i2, ss10VarValueOf2, z3, parcel.readInt() != 0, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readString());
            case 21:
                return new ew10(parcel.readString(), ss10.valueOf(parcel.readString()));
            case 22:
                return new fw10(parcel.readInt() != 0);
            case 23:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(lnn0.valueOf(parcel.readString()));
                }
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(lnn0.valueOf(parcel.readString()));
                }
                return new jw10(arrayList, arrayList2);
            case 24:
                return new bx10(parcel);
            case 25:
                return new zz10(parcel.readInt(), parcel.readInt());
            case 26:
                return new y020(parcel.readString());
            case 27:
                return new j120(parcel.readString());
            case 28:
                return new m220((wq50) parcel.readParcelable(m220.class.getClassLoader()), parcel.readString(), parcel.readString());
            default:
                return new o320(parcel.readString(), parcel.readString(), (nmn0) parcel.readParcelable(o320.class.getClassLoader()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f124028a) {
            case 0:
                return new lm10[i];
            case 1:
                return new nm10[i];
            case 2:
                return new cp10[i];
            case 3:
                return new dp10[i];
            case 4:
                return new lr10[i];
            case 5:
                return new mr10[i];
            case 6:
                return new yr10[i];
            case 7:
                return new zr10[i];
            case 8:
                return new as10[i];
            case 9:
                return new ns10[i];
            case 10:
                return new rs10[i];
            case 11:
                return new ht10[i];
            case 12:
                return new it10[i];
            case 13:
                return new jt10[i];
            case 14:
                return new kt10[i];
            case 15:
                return new ot10[i];
            case 16:
                return new st10[i];
            case 17:
                return new yu10[i];
            case 18:
                return new hv10[i];
            case 19:
                return new lv10[i];
            case 20:
                return new aw10[i];
            case 21:
                return new ew10[i];
            case 22:
                return new fw10[i];
            case 23:
                return new jw10[i];
            case 24:
                return new bx10[i];
            case 25:
                return new zz10[i];
            case 26:
                return new y020[i];
            case 27:
                return new j120[i];
            case 28:
                return new m220[i];
            default:
                return new o320[i];
        }
    }
}
