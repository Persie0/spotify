package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class f881 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66884a;

    public /* synthetic */ f881(int i) {
        this.f66884a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        switch (this.f66884a) {
            case 0:
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(e881.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                lu71 lu71VarM1966t = Timestamp.m1966t();
                lu71VarM1966t.m59943q(parcel.readLong());
                lu71VarM1966t.m59942m(parcel.readInt());
                return new g881(arrayList, numValueOf, (Timestamp) lu71VarM1966t.build(), parcel.readString());
            case 1:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                kyv0 kyv0VarCreateFromParcel = kyv0.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(kyv0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new mb81(z, z2, kyv0VarCreateFromParcel, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, z7l0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (lej) parcel.readParcelable(mb81.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, qb31.CREATOR.createFromParcel(parcel), (as81) parcel.readParcelable(mb81.class.getClassLoader()), (vc81) parcel.readParcelable(mb81.class.getClassLoader()), eks.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 2:
                return new vb81(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int iM31715d3 = 0;
                while (iM31715d3 != i6) {
                    iM31715d3 = c7h0.m31715d(vb81.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new cc81(string, string2, string3, string4, arrayList3, string5);
            case 4:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                long j = parcel.readLong();
                z2c z2cVarCreateFromParcel = z2c.CREATOR.createFromParcel(parcel);
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i7);
                int iM64020m = 0;
                while (iM64020m != i7) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new ec81(string6, string7, j, z2cVarCreateFromParcel, linkedHashSet);
            case 5:
                parcel.readInt();
                return sc81.f207660a;
            case 6:
                parcel.readInt();
                return tc81.f219043a;
            case 7:
                parcel.readInt();
                return uc81.f228971a;
            case 8:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                qsj qsjVarValueOf = qsj.valueOf(parcel.readString());
                int iM62668v = mrx0.m62668v(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                String string12 = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                int iM31715d4 = 0;
                while (iM31715d4 != i8) {
                    iM31715d4 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList4, iM31715d4, 1);
                    i8 = i8;
                    string8 = string8;
                }
                return new he81(string8, string9, string10, string11, qsjVarValueOf, iM62668v, z3, z4, z5, z6, z7, z8, z9, z10, string12, z11, z12, z13, z14, z15, arrayList4, parcel.readString());
            case 9:
                return new me81(parcel.readString(), parcel.readString());
            case 10:
                return new xf81(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new vl81(parcel.readString(), parcel.readString(), (wl81) parcel.readParcelable(vl81.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return wl81.f252487a;
            case 13:
                int i9 = parcel.readInt();
                String string13 = parcel.readString();
                if (string13 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string13.equals("Player")) {
                    i = 1;
                } else {
                    if (!string13.equals("Scrub")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.textelement.data.TrackProgress.ChangeType.".concat(string13));
                    }
                    i = 2;
                }
                return new zl81(i9, i);
            case 14:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                qsj qsjVarValueOf2 = qsj.valueOf(parcel.readString());
                int iM62668v2 = mrx0.m62668v(parcel.readString());
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                boolean z19 = parcel.readInt() != 0;
                boolean z20 = parcel.readInt() != 0;
                boolean z21 = parcel.readInt() != 0;
                boolean z22 = parcel.readInt() != 0;
                boolean z23 = parcel.readInt() != 0;
                String string18 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i10);
                int iM31715d5 = 0;
                while (true) {
                    boolean z24 = z16;
                    if (iM31715d5 == i10) {
                        return new iq81(string14, string15, string16, string17, qsjVarValueOf2, iM62668v2, z24, z17, z18, z19, z20, z21, z22, z23, string18, arrayList5, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
                    }
                    iM31715d5 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList5, iM31715d5, 1);
                    z16 = z24;
                    i10 = i10;
                }
                break;
            case 15:
                return new ir81((lu01) parcel.readParcelable(ir81.class.getClassLoader()));
            case 16:
                parcel.readInt();
                return tr81.f223009a;
            case 17:
                parcel.readInt();
                return ur81.f233277a;
            case 18:
                parcel.readInt();
                return xr81.f265291a;
            case 19:
                parcel.readInt();
                return yr81.f275423a;
            case 20:
                parcel.readInt();
                return zr81.f285582a;
            case 21:
                return new cs81(parcel.readString());
            case 22:
                i1e i1eVarCreateFromParcel = parcel.readInt() == 0 ? null : i1e.CREATOR.createFromParcel(parcel);
                String str = i1eVarCreateFromParcel != null ? i1eVarCreateFromParcel.f97495a : null;
                hjz hjzVarCreateFromParcel = parcel.readInt() == 0 ? null : hjz.CREATOR.createFromParcel(parcel);
                String str2 = hjzVarCreateFromParcel != null ? hjzVarCreateFromParcel.f92293a : null;
                xp6 xp6VarCreateFromParcel = parcel.readInt() == 0 ? null : xp6.CREATOR.createFromParcel(parcel);
                return new nt81(str, str2, xp6VarCreateFromParcel != null ? xp6VarCreateFromParcel.f264512a : null);
            case 23:
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iM9h = 0;
                while (iM9h != i14) {
                    iM9h = AbstractC0000a.m9h(vy81.class, parcel, arrayList6, iM9h, 1);
                }
                boolean z25 = parcel.readInt() != 0;
                String string24 = parcel.readString();
                if (string24 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string24.equals("Unknown")) {
                    i2 = 1;
                } else if (string24.equals("Static")) {
                    i2 = 2;
                } else if (string24.equals("SyllableSynced")) {
                    i2 = 3;
                } else {
                    if (!string24.equals("SentenceSynced")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.transcript.model.TimeSyncedStatus.".concat(string24));
                    }
                    i2 = 4;
                }
                return new vy81(string19, string20, string21, string22, string23, i11, i12, i13, arrayList6, z25, i2, parcel.readInt() != 0, parcel.readInt() != 0);
            case 24:
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                int iM9h2 = 0;
                while (iM9h2 != i15) {
                    iM9h2 = AbstractC0000a.m9h(y291.class, parcel, arrayList7, iM9h2, 1);
                }
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                u3a0 u3a0Var = (u3a0) parcel.readParcelable(y291.class.getClassLoader());
                String string25 = parcel.readString();
                if (string25 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string25.equals("ReadAlongPage")) {
                    i3 = 1;
                } else {
                    if (!string25.equals("ScrollCard")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.transcript.list.TranscriptReadAlongListElement.Surface.".concat(string25));
                    }
                    i3 = 2;
                }
                return new y291(arrayList7, numValueOf2, numValueOf3, u3a0Var, i3, parcel.readString());
            case 25:
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                int iM9h3 = 0;
                while (iM9h3 != i16) {
                    iM9h3 = AbstractC0000a.m9h(y391.class, parcel, arrayList8, iM9h3, 1);
                }
                return new y391(arrayList8, unz0.CREATOR.createFromParcel(parcel), (u3a0) parcel.readParcelable(y391.class.getClassLoader()));
            case 26:
                parcel.readInt();
                return e491.f56032a;
            case 27:
                return new b791(i0r0.CREATOR.createFromParcel(parcel), rzl0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                return new j791(parcel.readString(), (h891) parcel.readParcelable(j791.class.getClassLoader()), (b370) parcel.readParcelable(j791.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (dlx) parcel.readParcelable(j791.class.getClassLoader()), parcel.readInt() != 0);
            default:
                return new e891(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f66884a) {
            case 0:
                return new g881[i];
            case 1:
                return new mb81[i];
            case 2:
                return new vb81[i];
            case 3:
                return new cc81[i];
            case 4:
                return new ec81[i];
            case 5:
                return new sc81[i];
            case 6:
                return new tc81[i];
            case 7:
                return new uc81[i];
            case 8:
                return new he81[i];
            case 9:
                return new me81[i];
            case 10:
                return new xf81[i];
            case 11:
                return new vl81[i];
            case 12:
                return new wl81[i];
            case 13:
                return new zl81[i];
            case 14:
                return new iq81[i];
            case 15:
                return new ir81[i];
            case 16:
                return new tr81[i];
            case 17:
                return new ur81[i];
            case 18:
                return new xr81[i];
            case 19:
                return new yr81[i];
            case 20:
                return new zr81[i];
            case 21:
                return new cs81[i];
            case 22:
                return new nt81[i];
            case 23:
                return new vy81[i];
            case 24:
                return new y291[i];
            case 25:
                return new y391[i];
            case 26:
                return new e491[i];
            case 27:
                return new b791[i];
            case 28:
                return new j791[i];
            default:
                return new e891[i];
        }
    }
}
