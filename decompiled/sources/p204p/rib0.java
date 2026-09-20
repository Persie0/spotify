package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class rib0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199476a;

    public /* synthetic */ rib0(int i) {
        this.f199476a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f199476a) {
            case 0:
                parcel.readInt();
                return sib0.f209390a;
            case 1:
                parcel.readInt();
                return tib0.f220601a;
            case 2:
                parcel.readInt();
                return pjb0.f178221a;
            case 3:
                return new qjb0(parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 4:
                tk8 tk8Var = (tk8) parcel.readParcelable(zkb0.class.getClassLoader());
                String string = parcel.readString();
                sab0 sab0Var = (sab0) parcel.readParcelable(zkb0.class.getClassLoader());
                mbb0 mbb0Var = (mbb0) parcel.readParcelable(zkb0.class.getClassLoader());
                int i2 = parcel.readInt();
                ck01 ck01Var = (ck01) parcel.readParcelable(zkb0.class.getClassLoader());
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(zkb0.class, parcel, arrayList, iM9h, 1);
                }
                return new zkb0(tk8Var, string, sab0Var, mbb0Var, i2, ck01Var, string2, arrayList, parcel.readString(), 512);
            case 5:
                return new jlb0((wi01) parcel.readParcelable(jlb0.class.getClassLoader()));
            case 6:
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new gmb0(string3, arrayList2, (sbb0) parcel.readParcelable(gmb0.class.getClassLoader()));
            case 7:
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                return new mmb0(string4, arrayList3, (sbb0) parcel.readParcelable(mmb0.class.getClassLoader()));
            case 8:
                return new omb0((tav) parcel.readParcelable(omb0.class.getClassLoader()));
            case 9:
                return new pmb0((sbb0) parcel.readParcelable(pmb0.class.getClassLoader()));
            case 10:
                wab0 wab0Var = (wab0) parcel.readParcelable(qmb0.class.getClassLoader());
                sbb0 sbb0Var = (sbb0) parcel.readParcelable(qmb0.class.getClassLoader());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashSet.add(Integer.valueOf(parcel.readInt()));
                }
                int i10 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashSet2.add(Integer.valueOf(parcel.readInt()));
                }
                return new qmb0(wab0Var, sbb0Var, string5, string6, string7, linkedHashSet, linkedHashSet2, parcel.readInt() != 0);
            case 11:
                return new rmb0((sbb0) parcel.readParcelable(rmb0.class.getClassLoader()));
            case 12:
                return new tmb0(parcel.readString(), (smb0) parcel.readParcelable(tmb0.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return umb0.f231792a;
            case 14:
                parcel.readInt();
                return anb0.f17354a;
            case 15:
                parcel.readInt();
                return bnb0.f28779a;
            case 16:
                return new dnb0((s7f) parcel.readParcelable(dnb0.class.getClassLoader()));
            case 17:
                parcel.readInt();
                return enb0.f61122a;
            case 18:
                return new hnb0(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                boolean z = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iM31715d = 0;
                while (iM31715d != i12) {
                    iM31715d = c7h0.m31715d(hnb0.CREATOR, parcel, arrayList4, iM31715d, 1);
                }
                return new qnb0(z, arrayListCreateStringArrayList, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0);
            case 20:
                String str = ((cs81) parcel.readParcelable(opb0.class.getClassLoader())).f41492a;
                String str2 = ((xzo0) parcel.readParcelable(opb0.class.getClassLoader())).f267729a;
                vdb0 vdb0VarValueOf = vdb0.valueOf(parcel.readString());
                sab0 sab0Var2 = (sab0) parcel.readParcelable(opb0.class.getClassLoader());
                boolean z2 = parcel.readInt() != 0;
                int iM93117v = y8a0.m93117v(parcel.readString());
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iM31715d2 = 0;
                while (iM31715d2 != i13) {
                    iM31715d2 = c7h0.m31715d(kib0.CREATOR, parcel, arrayList5, iM31715d2, 1);
                }
                npb0 npb0Var = (npb0) parcel.readParcelable(opb0.class.getClassLoader());
                boolean z3 = parcel.readInt() != 0;
                dpb0 dpb0Var = (dpb0) parcel.readParcelable(opb0.class.getClassLoader());
                kpb0 kpb0Var = (kpb0) parcel.readParcelable(opb0.class.getClassLoader());
                zob0 zob0VarCreateFromParcel = zob0.CREATOR.createFromParcel(parcel);
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("TITLE_MEDIUM")) {
                    i = 1;
                } else {
                    if (!string8.equals("TITLE_SMALL")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.textelement.data.LyricsTextElementState.DisplayState.TextStyle.".concat(string8));
                    }
                    i = 2;
                }
                return new opb0(str, str2, vdb0VarValueOf, sab0Var2, z2, iM93117v, arrayList5, npb0Var, z3, dpb0Var, kpb0Var, zob0VarCreateFromParcel, i, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readFloat(), vlb0.f242435Z, vlb0.f242419L0);
            case 21:
                return new zob0((uob0) parcel.readParcelable(zob0.class.getClassLoader()), (yob0) parcel.readParcelable(zob0.class.getClassLoader()), (sbb0) parcel.readParcelable(zob0.class.getClassLoader()), y8a0.m93119x(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readFloat());
            case 22:
                parcel.readInt();
                return oob0.f167525a;
            case 23:
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(fk80.CREATOR.createFromParcel(parcel), parcel.readParcelable(pob0.class.getClassLoader()));
                }
                return new pob0(linkedHashMap);
            case 24:
                fk80 fk80VarCreateFromParcel = parcel.readInt() == 0 ? null : fk80.CREATOR.createFromParcel(parcel);
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    linkedHashMap2.put(fk80.CREATOR.createFromParcel(parcel), parcel.readParcelable(tob0.class.getClassLoader()));
                }
                return new tob0(fk80VarCreateFromParcel, linkedHashMap2);
            case 25:
                parcel.readInt();
                return qob0.f190893a;
            case 26:
                parcel.readInt();
                return rob0.f201217a;
            case 27:
                parcel.readInt();
                return vob0.f243447a;
            case 28:
                parcel.readInt();
                return wob0.f253428a;
            default:
                parcel.readInt();
                return xob0.f263820a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f199476a) {
            case 0:
                return new sib0[i];
            case 1:
                return new tib0[i];
            case 2:
                return new pjb0[i];
            case 3:
                return new qjb0[i];
            case 4:
                return new zkb0[i];
            case 5:
                return new jlb0[i];
            case 6:
                return new gmb0[i];
            case 7:
                return new mmb0[i];
            case 8:
                return new omb0[i];
            case 9:
                return new pmb0[i];
            case 10:
                return new qmb0[i];
            case 11:
                return new rmb0[i];
            case 12:
                return new tmb0[i];
            case 13:
                return new umb0[i];
            case 14:
                return new anb0[i];
            case 15:
                return new bnb0[i];
            case 16:
                return new dnb0[i];
            case 17:
                return new enb0[i];
            case 18:
                return new hnb0[i];
            case 19:
                return new qnb0[i];
            case 20:
                return new opb0[i];
            case 21:
                return new zob0[i];
            case 22:
                return new oob0[i];
            case 23:
                return new pob0[i];
            case 24:
                return new tob0[i];
            case 25:
                return new qob0[i];
            case 26:
                return new rob0[i];
            case 27:
                return new vob0[i];
            case 28:
                return new wob0[i];
            default:
                return new xob0[i];
        }
    }
}
