package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class m8v implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141135a;

    public /* synthetic */ m8v(int i) {
        this.f141135a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        LinkedHashSet linkedHashSet;
        switch (this.f141135a) {
            case 0:
                return new n8v(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                String string = parcel.readString();
                long j = parcel.readLong();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                n0c n0cVar = (n0c) parcel.readParcelable(lav.class.getClassLoader());
                xz71 xz71VarValueOf = parcel.readInt() != 0 ? xz71.valueOf(parcel.readString()) : null;
                mbb0 mbb0Var = (mbb0) parcel.readParcelable(lav.class.getClassLoader());
                tk8 tk8Var = (tk8) parcel.readParcelable(lav.class.getClassLoader());
                udb0 udb0VarValueOf = udb0.valueOf(parcel.readString());
                int iM93118w = y8a0.m93118w(parcel.readString());
                boolean z2 = parcel.readInt() != 0;
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iM31715d = 0;
                while (true) {
                    Integer num = numValueOf;
                    if (iM31715d == i4) {
                        return new lav(string, j, string2, z, num, n0cVar, xz71VarValueOf, mbb0Var, tk8Var, udb0VarValueOf, iM93118w, z2, arrayList, 1056);
                    }
                    iM31715d = c7h0.m31715d(w5o0.CREATOR, parcel, arrayList, iM31715d, 1);
                    numValueOf = num;
                    string = string;
                }
                break;
            case 2:
                String string3 = parcel.readString();
                long j2 = parcel.readLong();
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new qav(string3, j2, string4, arrayList2);
            case 3:
                String string5 = parcel.readString();
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                int iM31715d2 = 0;
                int iM75732f = 0;
                while (iM75732f != i7) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                ern0 ern0VarM67547D = opo.m67547D(linkedHashMap);
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("CLASSIC")) {
                    i = 1;
                } else if (string6.equals("WIDE")) {
                    i = 2;
                } else if (string6.equals("NARROW")) {
                    i = 3;
                } else {
                    if (!string6.equals("SLANTED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.stickers.enhancedsharecard.FontStyle.".concat(string6));
                    }
                    i = 4;
                }
                int i11 = i;
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("LEFT")) {
                    i2 = 1;
                } else if (string7.equals("CENTER")) {
                    i2 = 2;
                } else {
                    if (!string7.equals("RIGHT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.stickers.enhancedsharecard.Alignment.".concat(string7));
                    }
                    i2 = 3;
                }
                int i12 = i2;
                boolean z3 = parcel.readInt() != 0;
                String string8 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iM31715d2 != i13) {
                    iM31715d2 = c7h0.m31715d(x5o0.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new tav(string5, ern0VarM67547D, i8, i9, i10, i11, i12, z3, string8, arrayList3);
            case 4:
                return new zbv(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (zq50) parcel.readParcelable(zbv.class.getClassLoader()), (tbv) parcel.readParcelable(zbv.class.getClassLoader()), parcel.readInt() == 0 ? null : lw00.CREATOR.createFromParcel(parcel));
            case 5:
                return new vbv(parcel.readString(), EntityType.valueOf(parcel.readString()));
            case 6:
                parcel.readInt();
                return qbv.f187174a;
            case 7:
                parcel.readInt();
                return rbv.f197659a;
            case 8:
                parcel.readInt();
                return sbv.f207586a;
            case 9:
                parcel.readInt();
                return chv.f38091a;
            case 10:
                return new dhv(parcel.readInt(), bpe1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, xi3.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 11:
                return new ehv(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 12:
                return new fhv(parcel.readString(), (u980) parcel.readParcelable(fhv.class.getClassLoader()));
            case 13:
                return new hhv(parcel.readString(), (MessageResponseToken) parcel.readParcelable(hhv.class.getClassLoader()));
            case 14:
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("Artist")) {
                    i3 = 1;
                } else if (string9.equals("Podcast")) {
                    i3 = 2;
                } else if (string9.equals("Event")) {
                    i3 = 3;
                } else {
                    if (!string9.equals("ImportMusic")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.view.EntityItem.Onboarding.Type.".concat(string9));
                    }
                    i3 = 4;
                }
                return new ihv(i3, parcel.readString(), parcel.readInt() != 0, xi3.valueOf(parcel.readString()));
            case 15:
                return new jhv(parcel.readInt(), xi3.valueOf(parcel.readString()));
            case 16:
                return new khv(parcel.readString());
            case 17:
                return new lhv(wr31.valueOf(parcel.readString()), xi3.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 18:
                return new shv((pnv) parcel.readParcelable(shv.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                parcel.readInt();
                return mnv.f145480a;
            case 20:
                parcel.readInt();
                return nnv.f156494a;
            case 21:
                parcel.readInt();
                return onv.f167364a;
            case 22:
                return new xov(parcel.readString(), qb31.CREATOR.createFromParcel(parcel));
            case 23:
                int i14 = parcel.readInt();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                lpv lpvVarCreateFromParcel = lpv.CREATOR.createFromParcel(parcel);
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                int iM31715d3 = 0;
                while (iM31715d3 != i15) {
                    iM31715d3 = c7h0.m31715d(d340.CREATOR, parcel, arrayList4, iM31715d3, 1);
                }
                return new mpv(i14, string10, string11, string12, lpvVarCreateFromParcel, arrayList4, parcel.readString(), parcel.readString());
            case 24:
                String string13 = parcel.readString();
                int i16 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i16);
                int iM31715d4 = 0;
                while (iM31715d4 != i16) {
                    iM31715d4 = c7h0.m31715d(n1j0.CREATOR, parcel, arrayList5, iM31715d4, 1);
                }
                return new lpv(string13, arrayList5);
            case 25:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                i490 i490Var = (i490) parcel.readParcelable(bqv.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i17 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        linkedHashSet.add(parcel.readParcelable(bqv.class.getClassLoader()));
                    }
                }
                return new bqv(string14, string15, string16, i490Var, linkedHashSet);
            case 26:
                return new utv(parcel.readString());
            case 27:
                return new xvv((ou31) parcel.readParcelable(xvv.class.getClassLoader()), (sr01) parcel.readParcelable(xvv.class.getClassLoader()), stz0.m79365s(parcel.readString()));
            case 28:
                return new yvv((ou31) parcel.readParcelable(yvv.class.getClassLoader()), (sr01) parcel.readParcelable(yvv.class.getClassLoader()), stz0.m79365s(parcel.readString()), null, parcel.readString(), (Throwable) parcel.readSerializable());
            default:
                sr01 sr01Var = (sr01) parcel.readParcelable(awv.class.getClassLoader());
                int iM79365s = stz0.m79365s(parcel.readString());
                ou31 ou31Var = (ou31) parcel.readParcelable(awv.class.getClassLoader());
                mrp0 mrp0Var = (mrp0) parcel.readParcelable(awv.class.getClassLoader());
                icr0 icr0Var = (icr0) parcel.readParcelable(awv.class.getClassLoader());
                zvv zvvVarValueOf = zvv.valueOf(parcel.readString());
                int i19 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i19);
                int iM9h = 0;
                for (int i20 = 0; i20 != i19; i20++) {
                    linkedHashMap2.put(zvv.valueOf(parcel.readString()), parcel.readParcelable(awv.class.getClassLoader()));
                }
                tu71 tu71Var = (tu71) parcel.readParcelable(awv.class.getClassLoader());
                shv shvVar = (shv) parcel.readParcelable(awv.class.getClassLoader());
                int i21 = parcel.readInt();
                int i22 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i22);
                while (iM9h != i22) {
                    iM9h = AbstractC0000a.m9h(awv.class, parcel, arrayList6, iM9h, 1);
                }
                return new awv(sr01Var, iM79365s, ou31Var, null, mrp0Var, icr0Var, zvvVarValueOf, linkedHashMap2, tu71Var, shvVar, i21, arrayList6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f141135a) {
            case 0:
                return new n8v[i];
            case 1:
                return new lav[i];
            case 2:
                return new qav[i];
            case 3:
                return new tav[i];
            case 4:
                return new zbv[i];
            case 5:
                return new vbv[i];
            case 6:
                return new qbv[i];
            case 7:
                return new rbv[i];
            case 8:
                return new sbv[i];
            case 9:
                return new chv[i];
            case 10:
                return new dhv[i];
            case 11:
                return new ehv[i];
            case 12:
                return new fhv[i];
            case 13:
                return new hhv[i];
            case 14:
                return new ihv[i];
            case 15:
                return new jhv[i];
            case 16:
                return new khv[i];
            case 17:
                return new lhv[i];
            case 18:
                return new shv[i];
            case 19:
                return new mnv[i];
            case 20:
                return new nnv[i];
            case 21:
                return new onv[i];
            case 22:
                return new xov[i];
            case 23:
                return new mpv[i];
            case 24:
                return new lpv[i];
            case 25:
                return new bqv[i];
            case 26:
                return new utv[i];
            case 27:
                return new xvv[i];
            case 28:
                return new yvv[i];
            default:
                return new awv[i];
        }
    }
}
