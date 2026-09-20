package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class uir0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230797a;

    public /* synthetic */ uir0(int i) {
        this.f230797a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        Boolean boolValueOf;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        switch (this.f230797a) {
            case 0:
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                int iM31715d = 0;
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(pt51.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new vir0(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : tmw0.valueOf(parcel.readString()));
            case 1:
                parcel.readInt();
                return zir0.f283233a;
            case 2:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("GROUP_TOP")) {
                    i = 1;
                } else if (string.equals("GROUP_MIDDLE")) {
                    i = 2;
                } else if (string.equals("GROUP_BOTTOM")) {
                    i = 3;
                } else if (string.equals("GROUP_SINGLE_ITEM")) {
                    i = 4;
                } else {
                    if (!string.equals("UNGROUPED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.checkout.elements.model.ProductBreakdownRowType.".concat(string));
                    }
                    i = 5;
                }
                int i7 = i;
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("DEFAULT")) {
                    i2 = 1;
                } else if (string2.equals("ADDED")) {
                    i2 = 2;
                } else if (string2.equals("REMOVED")) {
                    i2 = 3;
                } else if (string2.equals("STRIKETHROUGH")) {
                    i2 = 4;
                } else {
                    if (!string2.equals("BOLD")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.checkout.elements.model.ProductBreakdownRowStyle.".concat(string2));
                    }
                    i2 = 5;
                }
                return new ajr0(i7, i2, parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new hjr0(parcel.readString(), hu51.valueOf(parcel.readString()));
            case 4:
                return new jmr0(parcel);
            case 5:
                parcel.readInt();
                return imr0.f103771a;
            case 6:
                return new hmr0(parcel.readInt() != 0);
            case 7:
                return new upr0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 8:
                return new kqr0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 9:
                return new tqr0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 10:
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("NOT_LOADED")) {
                    i3 = 1;
                } else if (string3.equals("LOADING")) {
                    i3 = 2;
                } else if (string3.equals("LOADED")) {
                    i3 = 3;
                } else {
                    if (!string3.equals("FAILED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.profile.profile.entity.model.LoadingState.".concat(string3));
                    }
                    i3 = 4;
                }
                int i8 = i3;
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                xxz xxzVar = (xxz) parcel.readParcelable(htr0.class.getClassLoader());
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                String string8 = parcel.readString();
                int i11 = parcel.readInt();
                boolean z9 = parcel.readInt() != 0;
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean z10 = parcel.readInt() != 0;
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                Boolean boolValueOf2 = null;
                gtr0 gtr0VarCreateFromParcel = parcel.readInt() == 0 ? null : gtr0.CREATOR.createFromParcel(parcel);
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                boolean z16 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                boolean z17 = parcel.readInt() != 0;
                boolean z18 = parcel.readInt() != 0;
                boolean z19 = parcel.readInt() != 0;
                boolean z20 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new htr0(i8, string4, string5, string6, string7, z3, z4, z5, z6, i9, i10, xxzVar, z7, z8, string8, i11, z9, string9, string10, string11, z10, string12, string13, z11, gtr0VarCreateFromParcel, z12, z13, z14, z15, z16, i12, z17, z18, z19, z20, boolValueOf2, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 11:
                return new gtr0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 12:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                boolean z21 = true;
                if (parcel.readInt() == 0) {
                    z21 = false;
                }
                return new rtr0(string14, string15, parcel.readString(), z21, parcel.readInt() != 0);
            case 13:
                htr0 htr0VarCreateFromParcel = htr0.CREATOR.createFromParcel(parcel);
                boolean z22 = false;
                boolean z23 = true;
                if (parcel.readInt() != 0) {
                    z22 = true;
                }
                if (parcel.readInt() == 0) {
                    z23 = z22;
                }
                if (parcel.readInt() == 0) {
                    z23 = z22;
                }
                if (parcel.readInt() == 0) {
                    z23 = z22;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? z23 : z22);
                }
                String string16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                    z2 = true;
                } else {
                    z = z23;
                    z2 = z22;
                }
                if (parcel.readInt() == 0) {
                    z = z22;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                String string17 = parcel.readString();
                if (string17 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string17.equals("NONE")) {
                    i4 = 1;
                } else if (string17.equals("INCOMING")) {
                    i4 = 2;
                } else if (string17.equals("ACCEPTING")) {
                    i4 = 3;
                } else if (string17.equals("SENDING")) {
                    i4 = 4;
                } else if (string17.equals("SENT")) {
                    i4 = 5;
                } else {
                    if (!string17.equals("FRIEND")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.profile.profile.entity.view.domain.FriendshipState.".concat(string17));
                    }
                    i4 = 6;
                }
                return new hwr0(htr0VarCreateFromParcel, z22, z23, z23, z23, boolValueOf, string16, z2, z, z, i4);
            case 14:
                o0s0 o0s0Var = (o0s0) parcel.readParcelable(p0s0.class.getClassLoader());
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                xxz xxzVar2 = (xxz) parcel.readParcelable(p0s0.class.getClassLoader());
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                boolean z24 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                String string24 = parcel.readString();
                if (string24 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string24.equals("NONE")) {
                    i5 = 1;
                } else if (string24.equals("FRIEND")) {
                    i5 = 2;
                } else if (string24.equals("INVITED")) {
                    i5 = 3;
                } else if (string24.equals("SUGGESTED")) {
                    i5 = 4;
                } else if (string24.equals("REQUESTED")) {
                    i5 = 5;
                } else {
                    if (!string24.equals("PENDING")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.profile.profilelist.model.ProfileListItem.FriendState.".concat(string24));
                    }
                    i5 = 6;
                }
                return new p0s0(o0s0Var, string18, string19, string20, string21, xxzVar2, string22, string23, lValueOf, z24, numValueOf, i5);
            case 15:
                parcel.readInt();
                return e0s0.f55029a;
            case 16:
                parcel.readInt();
                return f0s0.f64712a;
            case 17:
                parcel.readInt();
                return g0s0.f75430a;
            case 18:
                parcel.readInt();
                return h0s0.f86348a;
            case 19:
                parcel.readInt();
                return i0s0.f97313a;
            case 20:
                parcel.readInt();
                return j0s0.f107544a;
            case 21:
                parcel.readInt();
                return k0s0.f118140a;
            case 22:
                return new l0s0(o7t0.m66402p(parcel.readString()));
            case 23:
                parcel.readInt();
                return m0s0.f138731a;
            case 24:
                parcel.readInt();
                return n0s0.f149139a;
            case 25:
                return new t0s0(parcel.readString(), parcel.readString());
            case 26:
                return new x0s0(parcel.readString());
            case 27:
                String string25 = parcel.readString();
                String string26 = parcel.readString();
                String string27 = parcel.readString();
                boolean z25 = false;
                int iM31715d2 = 0;
                if (parcel.readInt() != 0) {
                    z25 = true;
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iM31715d2 != i13) {
                    iM31715d2 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new j2s0(string25, string26, z25, string27, arrayList2);
            case 28:
                parcel.readInt();
                return uas0.f228544a;
            default:
                return new ads0(parcel.readString(), parcel.readString(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f230797a) {
            case 0:
                return new vir0[i];
            case 1:
                return new zir0[i];
            case 2:
                return new ajr0[i];
            case 3:
                return new hjr0[i];
            case 4:
                return new jmr0[i];
            case 5:
                return new imr0[i];
            case 6:
                return new hmr0[i];
            case 7:
                return new upr0[i];
            case 8:
                return new kqr0[i];
            case 9:
                return new tqr0[i];
            case 10:
                return new htr0[i];
            case 11:
                return new gtr0[i];
            case 12:
                return new rtr0[i];
            case 13:
                return new hwr0[i];
            case 14:
                return new p0s0[i];
            case 15:
                return new e0s0[i];
            case 16:
                return new f0s0[i];
            case 17:
                return new g0s0[i];
            case 18:
                return new h0s0[i];
            case 19:
                return new i0s0[i];
            case 20:
                return new j0s0[i];
            case 21:
                return new k0s0[i];
            case 22:
                return new l0s0[i];
            case 23:
                return new m0s0[i];
            case 24:
                return new n0s0[i];
            case 25:
                return new t0s0[i];
            case 26:
                return new x0s0[i];
            case 27:
                return new j2s0[i];
            case 28:
                return new uas0[i];
            default:
                return new ads0[i];
        }
    }
}
