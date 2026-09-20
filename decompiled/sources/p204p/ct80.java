package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class ct80 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41809a;

    public /* synthetic */ ct80(int i) {
        this.f41809a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f41809a) {
            case 0:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.createStringArrayList());
                }
                return new dt80(arrayList);
            case 1:
                parcel.readInt();
                return et80.f62664a;
            case 2:
                parcel.readInt();
                return ft80.f73135a;
            case 3:
                parcel.readInt();
                return gt80.f84105a;
            case 4:
                parcel.readInt();
                return ht80.f94952a;
            case 5:
                parcel.readInt();
                return it80.f105465a;
            case 6:
                return new jt80(parcel.readString());
            case 7:
                return new kt80(parcel.readString());
            case 8:
                parcel.readInt();
                return lt80.f136724a;
            case 9:
                parcel.readInt();
                return mt80.f146986a;
            case 10:
                parcel.readInt();
                return pt80.f181071a;
            case 11:
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(in80.valueOf(parcel.readString()));
                }
                return new qt80(linkedHashSet);
            case 12:
                return new vy80(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 13:
                String string = parcel.readString();
                uzk uzkVar = (uzk) parcel.readParcelable(hz80.class.getClassLoader());
                gz80 gz80VarCreateFromParcel = parcel.readInt() == 0 ? null : gz80.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                String string4 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                lnn0 lnn0VarValueOf = lnn0.valueOf(parcel.readString());
                noa1 noa1Var = (noa1) parcel.readParcelable(hz80.class.getClassLoader());
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                int iM75732f = 0;
                while (iM75732f != i5) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM9h = 0;
                while (iM9h != i6) {
                    iM9h = AbstractC0000a.m9h(hz80.class, parcel, arrayList2, iM9h, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM9h2 = 0;
                while (iM9h2 != i7) {
                    iM9h2 = AbstractC0000a.m9h(hz80.class, parcel, arrayList3, iM9h2, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                int iM9h3 = 0;
                while (iM9h3 != i8) {
                    iM9h3 = AbstractC0000a.m9h(hz80.class, parcel, arrayList4, iM9h3, 1);
                }
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i9);
                int i10 = 0;
                while (i10 != i9) {
                    linkedHashMap2.put(in80.valueOf(parcel.readString()), Integer.valueOf(parcel.readInt()));
                    i10++;
                    i9 = i9;
                }
                return new hz80(string, uzkVar, gz80VarCreateFromParcel, string2, string3, z, string4, z2, lnn0VarValueOf, noa1Var, linkedHashMap, arrayList2, arrayList3, arrayList4, linkedHashMap2, parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), b8l0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : gz80.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                return new gz80(parcel.readString(), parcel.readString());
            case 15:
                return new jz80(gvl0.CREATOR.createFromParcel(parcel), h5u0.CREATOR.createFromParcel(parcel), (dw50) parcel.readParcelable(jz80.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (j1v0) parcel.readParcelable(jz80.class.getClassLoader()));
            case 16:
                return new u090((Intent) parcel.readParcelable(u090.class.getClassLoader()), parcel.readString(), (t090) parcel.readParcelable(u090.class.getClassLoader()));
            case 17:
                parcel.readInt();
                return q090.f183930a;
            case 18:
                return new r090(parcel.readString(), parcel.readString());
            case 19:
                parcel.readInt();
                return s090.f204322a;
            case 20:
                return new c190(parcel.readString(), parcel.readString(), (st80) parcel.readParcelable(c190.class.getClassLoader()));
            case 21:
                parcel.readInt();
                return o390.f161327a;
            case 22:
                return new p390(parcel.readInt() != 0);
            case 23:
                return new q390(parcel.readInt() != 0);
            case 24:
                return new r390(parcel.readInt() != 0);
            case 25:
                parcel.readInt();
                return s390.f205242a;
            case 26:
                return new t390(parcel.readInt() != 0);
            case 27:
                parcel.readInt();
                return u390.f226305a;
            case 28:
                parcel.readInt();
                return v390.f236813a;
            default:
                return new w390(parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f41809a) {
            case 0:
                return new dt80[i];
            case 1:
                return new et80[i];
            case 2:
                return new ft80[i];
            case 3:
                return new gt80[i];
            case 4:
                return new ht80[i];
            case 5:
                return new it80[i];
            case 6:
                return new jt80[i];
            case 7:
                return new kt80[i];
            case 8:
                return new lt80[i];
            case 9:
                return new mt80[i];
            case 10:
                return new pt80[i];
            case 11:
                return new qt80[i];
            case 12:
                return new vy80[i];
            case 13:
                return new hz80[i];
            case 14:
                return new gz80[i];
            case 15:
                return new jz80[i];
            case 16:
                return new u090[i];
            case 17:
                return new q090[i];
            case 18:
                return new r090[i];
            case 19:
                return new s090[i];
            case 20:
                return new c190[i];
            case 21:
                return new o390[i];
            case 22:
                return new p390[i];
            case 23:
                return new q390[i];
            case 24:
                return new r390[i];
            case 25:
                return new s390[i];
            case 26:
                return new t390[i];
            case 27:
                return new u390[i];
            case 28:
                return new v390[i];
            default:
                return new w390[i];
        }
    }
}
