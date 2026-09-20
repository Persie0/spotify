package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class lpy0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135861a;

    public /* synthetic */ lpy0(int i) {
        this.f135861a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        g6z g6zVar;
        int i2;
        int i3;
        switch (this.f135861a) {
            case 0:
                return new SearchConfiguration(parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new yry0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(iy5.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new zry0(string, string2, string3, string4, z, z2, arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 3:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                l0z0 l0z0Var = (l0z0) parcel.readParcelable(yxy0.class.getClassLoader());
                vzi vziVar = (vzi) parcel.readParcelable(yxy0.class.getClassLoader());
                kpy0 kpy0VarCreateFromParcel = kpy0.CREATOR.createFromParcel(parcel);
                mpm0 mpm0Var = (mpm0) parcel.readParcelable(yxy0.class.getClassLoader());
                g6z g6zVar2 = (g6z) parcel.readParcelable(yxy0.class.getClassLoader());
                vro0 vro0Var = (vro0) parcel.readParcelable(yxy0.class.getClassLoader());
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("None")) {
                    i = 1;
                } else {
                    if (!string7.equals("Dismissed")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.mobius.model.MessageBannerState.".concat(string7));
                    }
                    i = 2;
                }
                c5x0 c5x0VarCreateFromParcel = c5x0.CREATOR.createFromParcel(parcel);
                qbm0 qbm0VarCreateFromParcel = qbm0.CREATOR.createFromParcel(parcel);
                boolean z3 = true;
                boolean z4 = parcel.readInt() != 0;
                tit0 tit0VarCreateFromParcel = tit0.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    g6zVar = g6zVar2;
                } else {
                    g6zVar = g6zVar2;
                    z3 = false;
                }
                return new yxy0(string5, string6, i5, l0z0Var, vziVar, kpy0VarCreateFromParcel, mpm0Var, g6zVar, vro0Var, i, c5x0VarCreateFromParcel, qbm0VarCreateFromParcel, z4, tit0VarCreateFromParcel, z3);
            case 4:
                parcel.readInt();
                return eyy0.f64228a;
            case 5:
                parcel.readInt();
                return fyy0.f74870a;
            case 6:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean z5 = true;
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new jyy0(string8, string9, string10, z5, parcel.readInt() != 0, parcel.readInt() == 0 ? null : nuf.valueOf(parcel.readString()));
            case 7:
                return new qzy0(parcel.readString(), (tzb0) parcel.readParcelable(qzy0.class.getClassLoader()));
            case 8:
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM9h = 0;
                while (iM9h != i6) {
                    iM9h = AbstractC0000a.m9h(k0z0.class, parcel, arrayList2, iM9h, 1);
                }
                return new k0z0(parcel.readString(), arrayList2, parcel.readInt() != 0);
            case 9:
                return new vzy0(parcel.readString());
            case 10:
                parcel.readInt();
                return wzy0.f256710a;
            case 11:
                return new xzy0((wfz) parcel.readParcelable(xzy0.class.getClassLoader()), parcel.readString(), (gyy0) parcel.readParcelable(xzy0.class.getClassLoader()), parcel.readInt() != 0);
            case 12:
                parcel.readInt();
                return a0z0.f11217a;
            case 13:
                return new c0z0((p38) parcel.readParcelable(c0z0.class.getClassLoader()));
            case 14:
                return new d0z0((i38) parcel.readParcelable(d0z0.class.getClassLoader()));
            case 15:
                parcel.readInt();
                return e0z0.f55071a;
            case 16:
                return new f0z0((x1l0) parcel.readParcelable(f0z0.class.getClassLoader()));
            case 17:
                return new g0z0((aol0) parcel.readParcelable(g0z0.class.getClassLoader()), parcel.readInt() != 0);
            case 18:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM9h2 = 0;
                int iM9h3 = 0;
                while (iM9h3 != i7) {
                    iM9h3 = AbstractC0000a.m9h(h0z0.class, parcel, arrayList3, iM9h3, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                while (iM9h2 != i8) {
                    iM9h2 = AbstractC0000a.m9h(h0z0.class, parcel, arrayList4, iM9h2, 1);
                }
                return new h0z0(arrayList3, arrayList4);
            case 19:
                return new m1z0(xov.CREATOR.createFromParcel(parcel));
            case 20:
                return new j4z0(parcel.readString(), parcel.readString());
            case 21:
                parcel.readInt();
                return new o4z0();
            case 22:
                return new r4z0(parcel.readString(), parcel.readString());
            case 23:
                return new u4z0(parcel.readString());
            case 24:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                if (string12 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string12.equals("VIDEO_CAROUSEL")) {
                    i2 = 1;
                } else if (string12.equals("GENERIC")) {
                    i2 = 2;
                } else if (string12.equals("DISCOVERY_FEED")) {
                    i2 = 3;
                } else if (string12.equals("UNKNOWN")) {
                    i2 = 4;
                } else if (string12.equals("CROSSWORD")) {
                    i2 = 5;
                } else if (string12.equals("INSTANT_MIX")) {
                    i2 = 6;
                } else if (string12.equals("DIVIDER")) {
                    i2 = 7;
                } else if (string12.equals("RELATED_SEARCHES")) {
                    i2 = 8;
                } else if (string12.equals("START_A_CHAT")) {
                    i2 = 9;
                } else if (string12.equals("AGENT")) {
                    i2 = 10;
                } else if (string12.equals("CROSS_CONTENT_RELATED")) {
                    i2 = 11;
                } else if (string12.equals("TRACK_VERSIONS")) {
                    i2 = 12;
                } else {
                    if (!string12.equals("SEARCH_OVERVIEW_PLACEHOLDER")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.Section.Type.".concat(string12));
                    }
                    i2 = 13;
                }
                int i9 = i2;
                int i10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i10);
                int iM9h4 = 0;
                while (iM9h4 != i10) {
                    iM9h4 = AbstractC0000a.m9h(h6z0.class, parcel, arrayList5, iM9h4, 1);
                }
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (string14 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string14.equals("UNKNOWN")) {
                    i3 = 1;
                } else if (string14.equals("CAROUSEL")) {
                    i3 = 2;
                } else {
                    if (!string14.equals("LIST")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.Section.RenderHint.".concat(string14));
                    }
                    i3 = 3;
                }
                return new h6z0(string11, i9, arrayList5, string13, i3, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 25:
                int i11 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i11);
                int iM31715d2 = 0;
                while (iM31715d2 != i11) {
                    iM31715d2 = c7h0.m31715d(jyy.CREATOR, parcel, arrayList6, iM31715d2, 1);
                }
                return new a7z0(arrayList6);
            case 26:
                return new paz0(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 27:
                return new uaz0(parcel.readString(), parcel.readString());
            case 28:
                return new vaz0(parcel.readString(), parcel.readString());
            default:
                return new jbz0(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f135861a) {
            case 0:
                return new SearchConfiguration[i];
            case 1:
                return new yry0[i];
            case 2:
                return new zry0[i];
            case 3:
                return new yxy0[i];
            case 4:
                return new eyy0[i];
            case 5:
                return new fyy0[i];
            case 6:
                return new jyy0[i];
            case 7:
                return new qzy0[i];
            case 8:
                return new k0z0[i];
            case 9:
                return new vzy0[i];
            case 10:
                return new wzy0[i];
            case 11:
                return new xzy0[i];
            case 12:
                return new a0z0[i];
            case 13:
                return new c0z0[i];
            case 14:
                return new d0z0[i];
            case 15:
                return new e0z0[i];
            case 16:
                return new f0z0[i];
            case 17:
                return new g0z0[i];
            case 18:
                return new h0z0[i];
            case 19:
                return new m1z0[i];
            case 20:
                return new j4z0[i];
            case 21:
                return new o4z0[i];
            case 22:
                return new r4z0[i];
            case 23:
                return new u4z0[i];
            case 24:
                return new h6z0[i];
            case 25:
                return new a7z0[i];
            case 26:
                return new paz0[i];
            case 27:
                return new uaz0[i];
            case 28:
                return new vaz0[i];
            default:
                return new jbz0[i];
        }
    }
}
