package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class jja implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112963a;

    public /* synthetic */ jja(int i) {
        this.f112963a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f112963a) {
            case 0:
                return new kja(parcel);
            case 1:
                return new yja(ixz0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 2:
                return new oma(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new xna(parcel.readString(), parcel.readString());
            case 4:
                fuz0 fuz0Var = (fuz0) parcel.readParcelable(bpa.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(epa.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new bpa(fuz0Var, arrayList, parcel.readString(), parcel.readString());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("Small")) {
                    i = 1;
                } else if (string3.equals("Medium")) {
                    i = 2;
                } else if (string3.equals("Large")) {
                    i = 3;
                } else {
                    if (!string3.equals("XLarge")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph.BubbleGraphViewGroup.BubbleSize.".concat(string3));
                    }
                    i = 4;
                }
                return new epa(i, string, string2, parcel.readString(), parcel.readString());
            case 6:
                return new y5b(fs31.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 7:
                return new o8b((fyh0) parcel.readParcelable(fyh0.class.getClassLoader()), (fyh0) parcel.readParcelable(fyh0.class.getClassLoader()), (boo) parcel.readParcelable(boo.class.getClassLoader()), (fyh0) parcel.readParcelable(fyh0.class.getClassLoader()));
            case 8:
                String str = wcx0.CREATOR.createFromParcel(parcel).f250138a;
                String str2 = mfn0.CREATOR.createFromParcel(parcel).f143100a;
                String str3 = ren0.CREATOR.createFromParcel(parcel).f198390a;
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                int iM75732f = 0;
                while (iM75732f != i4) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new cbb(str, str2, str3, i3, linkedHashMap);
            case 9:
                parcel.readInt();
                return dbb.f47269a;
            case 10:
                return new gcb(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new lob(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 12:
                parcel.readInt();
                return mob.f145639a;
            case 13:
                Parcelable.Creator<q7y> creator = q7y.CREATOR;
                return new fpb(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), (wwu) parcel.readParcelable(fpb.class.getClassLoader()), parcel.readString());
            case 14:
                return new hpb(fpb.CREATOR.createFromParcel(parcel));
            case 15:
                return new sqb(zz10.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            case 16:
                return new sub(parcel.readLong());
            case 17:
                return new l0c(w940.CREATOR.createFromParcel(parcel));
            case 18:
                return new m0c(w7f.CREATOR.createFromParcel(parcel));
            case 19:
                return new v0c((xn8) parcel.readParcelable(v0c.class.getClassLoader()));
            case 20:
                return new w0c((t0u0) parcel.readParcelable(w0c.class.getClassLoader()));
            case 21:
                return new x0c((ru71) parcel.readParcelable(x0c.class.getClassLoader()));
            case 22:
                parcel.readInt();
                return y0c.f267958a;
            case 23:
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM64020m = 0;
                int iM9h = 0;
                while (iM9h != i5) {
                    iM9h = AbstractC0000a.m9h(z2c.class, parcel, arrayList2, iM9h, 1);
                }
                boolean z = parcel.readInt() != 0;
                jbz0 jbz0VarCreateFromParcel = parcel.readInt() == 0 ? null : jbz0.CREATOR.createFromParcel(parcel);
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
                while (iM64020m != i6) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new z2c(arrayList2, z, jbz0VarCreateFromParcel, linkedHashSet, nd6.CREATOR.createFromParcel(parcel));
            case 24:
                return new u4c(AbstractC0000a.m0A(parcel.readString()));
            case 25:
                return new v4c(parcel.readString());
            case 26:
                return new w4c(parcel.readString());
            case 27:
                return new x4c(parcel.readString());
            case 28:
                return new y4c(parcel.readString(), parcel.readInt());
            default:
                return new z4c(parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f112963a) {
            case 0:
                return new kja[i];
            case 1:
                return new yja[i];
            case 2:
                return new oma[i];
            case 3:
                return new xna[i];
            case 4:
                return new bpa[i];
            case 5:
                return new epa[i];
            case 6:
                return new y5b[i];
            case 7:
                return new o8b[i];
            case 8:
                return new cbb[i];
            case 9:
                return new dbb[i];
            case 10:
                return new gcb[i];
            case 11:
                return new lob[i];
            case 12:
                return new mob[i];
            case 13:
                return new fpb[i];
            case 14:
                return new hpb[i];
            case 15:
                return new sqb[i];
            case 16:
                return new sub[i];
            case 17:
                return new l0c[i];
            case 18:
                return new m0c[i];
            case 19:
                return new v0c[i];
            case 20:
                return new w0c[i];
            case 21:
                return new x0c[i];
            case 22:
                return new y0c[i];
            case 23:
                return new z2c[i];
            case 24:
                return new u4c[i];
            case 25:
                return new v4c[i];
            case 26:
                return new w4c[i];
            case 27:
                return new x4c[i];
            case 28:
                return new y4c[i];
            default:
                return new z4c[i];
        }
    }
}
