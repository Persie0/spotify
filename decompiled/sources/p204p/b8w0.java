package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.martini.martinidata.model.Mode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class b8w0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24674a;

    public /* synthetic */ b8w0(int i) {
        this.f24674a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f24674a) {
            case 0:
                return new c8w0(parcel.readString(), (eil) parcel.readParcelable(c8w0.class.getClassLoader()), parcel.readString());
            case 1:
                return new j8w0(w7w0.CREATOR.createFromParcel(parcel));
            case 2:
                return new k8w0((Throwable) parcel.readSerializable());
            case 3:
                parcel.readInt();
                return l8w0.f130953a;
            case 4:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
                int iM64020m = 0;
                while (iM64020m != i2) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new n8w0(string, string2, linkedHashSet);
            case 5:
                return new o8w0(parcel.readString(), parcel.readString());
            case 6:
                return new p8w0(parcel.readString());
            case 7:
                return new q8w0(parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new ycw0((fgr) parcel.readParcelable(ycw0.class.getClassLoader()), (psx0) parcel.readParcelable(ycw0.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return zcw0.f281579a;
            case 10:
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(fdw0.class, parcel, arrayList, iM9h, 1);
                }
                return new fdw0(string3, z, opo.m67546C(arrayList), parcel.readInt(), (fgr) parcel.readParcelable(fdw0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (b7x0) parcel.readParcelable(fdw0.class.getClassLoader()));
            case 11:
                return new jdw0(parcel.readString());
            case 12:
                return new odw0(parcel.readString());
            case 13:
                int iM85848N = vkf1.m85848N(parcel);
                Bundle bundleM85862h = null;
                while (parcel.dataPosition() < iM85848N) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        vkf1.m85844J(i4, parcel);
                    } else {
                        bundleM85862h = vkf1.m85862h(i4, parcel);
                    }
                }
                vkf1.m85872r(iM85848N, parcel);
                return new zdw0(bundleM85862h);
            case 14:
                return new aqw0(parcel.readString(), parcel.readString(), (dhr0) parcel.readParcelable(aqw0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (zv8) parcel.readParcelable(aqw0.class.getClassLoader()), parcel.readString(), (sky) parcel.readParcelable(aqw0.class.getClassLoader()), parcel.readInt() != 0);
            case 15:
                return new hqw0(parcel.readString(), parcel.readString(), (voc1) parcel.readParcelable(hqw0.class.getClassLoader()), Mode.valueOf(parcel.readString()));
            case 16:
                return new iqw0(parcel.readString(), parcel.readString());
            case 17:
                return new drw0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new erw0(parcel.readString());
            case 19:
                parcel.readInt();
                return frw0.f72672a;
            case 20:
                return new grw0(parcel.createStringArrayList());
            case 21:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                int iM75732f = 0;
                while (iM75732f != i5) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new osw0(linkedHashMap, string4, string5, string6);
            case 22:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("UNSPECIFIED")) {
                    i = 1;
                } else if (string8.equals("CORRECT")) {
                    i = 2;
                } else if (string8.equals("WRONG")) {
                    i = 3;
                } else {
                    if (!string8.equals("TIME_RAN_OUT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.musicquiz.model.AnswerState.".concat(string8));
                    }
                    i = 4;
                }
                return new ftw0(parcel.readLong(), i, string7);
            case 23:
                return otw0.valueOf(parcel.readString());
            case 24:
                return new stw0(qk80.CREATOR.createFromParcel(parcel).f189495a);
            case 25:
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    linkedHashMap2.put(fk80.CREATOR.createFromParcel(parcel), qk80.CREATOR.createFromParcel(parcel));
                }
                return new ttw0(linkedHashMap2);
            case 26:
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new vtw0(arrayListCreateStringArrayList, arrayList2, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList());
            case 27:
                return new jvw0(parcel.readString());
            case 28:
                return new iww0(parcel.readInt());
            default:
                parcel.readInt();
                return wxw0.f256139a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f24674a) {
            case 0:
                return new c8w0[i];
            case 1:
                return new j8w0[i];
            case 2:
                return new k8w0[i];
            case 3:
                return new l8w0[i];
            case 4:
                return new n8w0[i];
            case 5:
                return new o8w0[i];
            case 6:
                return new p8w0[i];
            case 7:
                return new q8w0[i];
            case 8:
                return new ycw0[i];
            case 9:
                return new zcw0[i];
            case 10:
                return new fdw0[i];
            case 11:
                return new jdw0[i];
            case 12:
                return new odw0[i];
            case 13:
                return new zdw0[i];
            case 14:
                return new aqw0[i];
            case 15:
                return new hqw0[i];
            case 16:
                return new iqw0[i];
            case 17:
                return new drw0[i];
            case 18:
                return new erw0[i];
            case 19:
                return new frw0[i];
            case 20:
                return new grw0[i];
            case 21:
                return new osw0[i];
            case 22:
                return new ftw0[i];
            case 23:
                return new otw0[i];
            case 24:
                return new stw0[i];
            case 25:
                return new ttw0[i];
            case 26:
                return new vtw0[i];
            case 27:
                return new jvw0[i];
            case 28:
                return new iww0[i];
            default:
                return new wxw0[i];
        }
    }
}
