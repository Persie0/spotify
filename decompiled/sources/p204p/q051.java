package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class q051 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f183914a;

    public /* synthetic */ q051(int i) {
        this.f183914a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        a351 a351Var;
        boolean z3;
        int i;
        int i2;
        switch (this.f183914a) {
            case 0:
                parcel.readInt();
                return r051.f194390a;
            case 1:
                parcel.readInt();
                return s051.f204308a;
            case 2:
                parcel.readInt();
                return t051.f215765a;
            case 3:
                parcel.readInt();
                return u051.f225390a;
            case 4:
                parcel.readInt();
                return v051.f235923a;
            case 5:
                parcel.readInt();
                return w051.f246643a;
            case 6:
                return new m151(parcel.readString(), parcel.readInt());
            case 7:
                return new q151(parcel.readString(), (e10) parcel.readParcelable(q151.class.getClassLoader()), (oiy0) parcel.readParcelable(q151.class.getClassLoader()), parcel.readInt() == 0 ? null : q151.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? q151.CREATOR.createFromParcel(parcel) : null);
            case 8:
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i3);
                    int iM9h = 0;
                    while (iM9h != i3) {
                        iM9h = AbstractC0000a.m9h(n151.class, parcel, arrayList2, iM9h, 1);
                    }
                    arrayList = arrayList2;
                }
                return new n151(string, arrayList);
            case 9:
                parcel.readInt();
                return o151.f160620a;
            case 10:
                return new s151(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 11:
                return new x151(c251.CREATOR.createFromParcel(parcel).f33300a, (d251) parcel.readParcelable(x151.class.getClassLoader()), (f251) parcel.readParcelable(x151.class.getClassLoader()), parcel.createStringArrayList());
            case 12:
                return new c251(parcel.readString());
            case 13:
                return new u251(parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                u251 u251VarCreateFromParcel = parcel.readInt() == 0 ? null : u251.CREATOR.createFromParcel(parcel);
                a351 a351Var2 = (a351) parcel.readParcelable(w251.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                    a351Var = a351Var2;
                } else {
                    a351Var = a351Var2;
                    z3 = z;
                }
                return new w251(string2, string3, string4, string5, z4, u251VarCreateFromParcel, a351Var, z2, z3);
            case 15:
                parcel.readInt();
                return x251.f257363a;
            case 16:
                return new y251(parcel.readString(), parcel.readString());
            case 17:
                parcel.readInt();
                return z251.f278498a;
            case 18:
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(e451.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new d451(arrayList3);
            case 19:
                return new e451(parcel.readString(), parcel.readString());
            case 20:
                a651 a651Var = new a651();
                a651Var.f12699a = parcel.readParcelable(a651.class.getClassLoader());
                a651Var.f12700b = parcel.readInt();
                a651Var.f12701c = parcel.readInt();
                return a651Var;
            case 21:
                return new a751(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            case 22:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(r751.CREATOR, parcel, arrayList4, iM31715d2, 1);
                }
                return new p751(arrayList4, parcel.readString(), (tdu) parcel.readParcelable(p751.class.getClassLoader()), parcel.readString());
            case 23:
                String string6 = parcel.readString();
                boolean z5 = false;
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new r751(string6, z6, z5, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (tdu) parcel.readParcelable(r751.class.getClassLoader()));
            case 24:
                parcel.readInt();
                return ha51.f89127a;
            case 25:
                parcel.readInt();
                return ia51.f100161a;
            case 26:
                parcel.readInt();
                return ja51.f110326a;
            case 27:
                return new ka51(parcel.readInt(), parcel.readInt());
            case 28:
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("MUTED")) {
                    i = 1;
                } else {
                    if (!string7.equals("UNMUTED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campaigns.storytelling.api.StoryContainerState.MuteState.".concat(string7));
                    }
                    i = 2;
                }
                return new kb51(i);
            default:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(parcel.createStringArrayList());
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iM31715d3 = 0;
                while (iM31715d3 != i6) {
                    iM31715d3 = c7h0.m31715d(ut31.CREATOR, parcel, arrayList5, iM31715d3, 1);
                }
                AbstractC2524w8 abstractC2524w8M67546C2 = opo.m67546C(arrayList5);
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("UNSPECIFIED")) {
                    i2 = 1;
                } else if (string10.equals("EVERGREEN")) {
                    i2 = 2;
                } else {
                    if (!string10.equals("TIMELY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.martini.martinidata.model.StoryType.".concat(string10));
                    }
                    i2 = 3;
                }
                return new bc51(string8, string9, abstractC2524w8M67546C, abstractC2524w8M67546C2, i2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f183914a) {
            case 0:
                return new r051[i];
            case 1:
                return new s051[i];
            case 2:
                return new t051[i];
            case 3:
                return new u051[i];
            case 4:
                return new v051[i];
            case 5:
                return new w051[i];
            case 6:
                return new m151[i];
            case 7:
                return new q151[i];
            case 8:
                return new n151[i];
            case 9:
                return new o151[i];
            case 10:
                return new s151[i];
            case 11:
                return new x151[i];
            case 12:
                return new c251[i];
            case 13:
                return new u251[i];
            case 14:
                return new w251[i];
            case 15:
                return new x251[i];
            case 16:
                return new y251[i];
            case 17:
                return new z251[i];
            case 18:
                return new d451[i];
            case 19:
                return new e451[i];
            case 20:
                return new a651[i];
            case 21:
                return new a751[i];
            case 22:
                return new p751[i];
            case 23:
                return new r751[i];
            case 24:
                return new ha51[i];
            case 25:
                return new ia51[i];
            case 26:
                return new ja51[i];
            case 27:
                return new ka51[i];
            case 28:
                return new kb51[i];
            default:
                return new bc51[i];
        }
    }
}
