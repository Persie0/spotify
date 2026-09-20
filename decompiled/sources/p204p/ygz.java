package p204p;

import android.app.Notification;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class ygz implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272698a;

    public /* synthetic */ ygz(int i) {
        this.f272698a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f272698a) {
            case 0:
                zgz zgzVar = new zgz(-2, -2);
                zgzVar.f282742e = 0.0f;
                zgzVar.f282743f = 1.0f;
                zgzVar.f282744g = -1;
                zgzVar.f282745h = -1.0f;
                zgzVar.f282739X = 16777215;
                zgzVar.f282740Y = 16777215;
                zgzVar.f282742e = parcel.readFloat();
                zgzVar.f282743f = parcel.readFloat();
                zgzVar.f282744g = parcel.readInt();
                zgzVar.f282745h = parcel.readFloat();
                zgzVar.f282746i = parcel.readInt();
                zgzVar.f282747t = parcel.readInt();
                zgzVar.f282739X = parcel.readInt();
                zgzVar.f282740Y = parcel.readInt();
                zgzVar.f282741Z = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) zgzVar).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zgzVar).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zgzVar).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zgzVar).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zgzVar).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) zgzVar).width = parcel.readInt();
                return zgzVar;
            case 1:
                bhz bhzVar = new bhz();
                bhzVar.f27270a = parcel.readInt();
                bhzVar.f27271b = parcel.readInt();
                return bhzVar;
            case 2:
                return new hjz(parcel.readString());
            case 3:
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iM9h = 0;
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readParcelable(zmz.class.getClassLoader()), parcel.readParcelable(zmz.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(zmz.class, parcel, arrayList, iM9h, 1);
                }
                return new zmz(linkedHashMap, arrayList);
            case 4:
                return new xnz((goz) parcel.readParcelable(xnz.class.getClassLoader()));
            case 5:
                parcel.readInt();
                return ynz.f274530d;
            case 6:
                parcel.readInt();
                return znz.f284602d;
            case 7:
                parcel.readInt();
                return aoz.f17792d;
            case 8:
                parcel.readInt();
                return boz.f29279d;
            case 9:
                parcel.readInt();
                return coz.f40371d;
            case 10:
                parcel.readInt();
                return doz.f51132d;
            case 11:
                parcel.readInt();
                return eoz.f61518d;
            case 12:
                parcel.readInt();
                return foz.f71653d;
            case 13:
                return new lrz(parcel.readInt(), parcel.readInt());
            case 14:
                return new qsz(parcel.readString(), gn80.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                return new ktz(parcel.readString(), parcel.readString());
            case 16:
                return new iwz(parcel.readString());
            case 17:
                return new xxz(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 18:
                return new fyz(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                return new s200((Intent) parcel.readParcelable(s200.class.getClassLoader()));
            case 20:
                return new t200(parcel.readInt());
            case 21:
                parcel.readInt();
                return new u200();
            case 22:
                return new v200(parcel.readInt(), (Notification) parcel.readParcelable(v200.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                return new w200(parcel.createStringArrayList());
            case 24:
                return new m300(parcel.readString());
            case 25:
                String str = m300.CREATOR.createFromParcel(parcel).f139495a;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int iM9h2 = 0;
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iM9h2 != i4) {
                    iM9h2 = AbstractC0000a.m9h(n300.class, parcel, arrayList2, iM9h2, 1);
                }
                return new n300(str, string, string2, z, opo.m67546C(arrayList2));
            case 26:
                parcel.readInt();
                return y300.f268720b;
            case 27:
                parcel.readInt();
                return z300.f278736b;
            case 28:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d = 0;
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(ium0.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new h400(arrayList3, parcel.readString());
            default:
                v600 v600Var = new v600();
                v600Var.f237697a = parcel.readString();
                v600Var.f237698b = parcel.readInt();
                return v600Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f272698a) {
            case 0:
                return new zgz[i];
            case 1:
                return new bhz[i];
            case 2:
                return new hjz[i];
            case 3:
                return new zmz[i];
            case 4:
                return new xnz[i];
            case 5:
                return new ynz[i];
            case 6:
                return new znz[i];
            case 7:
                return new aoz[i];
            case 8:
                return new boz[i];
            case 9:
                return new coz[i];
            case 10:
                return new doz[i];
            case 11:
                return new eoz[i];
            case 12:
                return new foz[i];
            case 13:
                return new lrz[i];
            case 14:
                return new qsz[i];
            case 15:
                return new ktz[i];
            case 16:
                return new iwz[i];
            case 17:
                return new xxz[i];
            case 18:
                return new fyz[i];
            case 19:
                return new s200[i];
            case 20:
                return new t200[i];
            case 21:
                return new u200[i];
            case 22:
                return new v200[i];
            case 23:
                return new w200[i];
            case 24:
                return new m300[i];
            case 25:
                return new n300[i];
            case 26:
                return new y300[i];
            case 27:
                return new z300[i];
            case 28:
                return new h400[i];
            default:
                return new v600[i];
        }
    }
}
