package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class qvc implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192966a;

    public /* synthetic */ qvc(int i) {
        this.f192966a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f192966a) {
            case 0:
                String string = parcel.readString();
                sxd sxdVar = (sxd) parcel.readParcelable(rvc.class.getClassLoader());
                nmn0 nmn0VarCreateFromParcel = nmn0.CREATOR.createFromParcel(parcel);
                pcu0 pcu0VarCreateFromParcel = parcel.readInt() == 0 ? null : pcu0.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(akk.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(pck.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new rvc(string, sxdVar, nmn0VarCreateFromParcel, pcu0VarCreateFromParcel, arrayList, arrayList2, parcel.readInt(), g5a1.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0);
            case 1:
                return new hzc(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 2:
                return new pzc(parcel.readString());
            case 3:
                return new qzc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 4:
                return new rzc((wyn0) parcel.readParcelable(rzc.class.getClassLoader()));
            case 5:
                return new vzc(parcel.readString(), parcel.readString());
            case 6:
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("SEARCH")) {
                    i = 1;
                } else if (string2.equals("LYRICS_STICKERS")) {
                    i = 2;
                } else {
                    if (!string2.equals("GIFS")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.chatcontentpickerpage.pagecontract.ChatContentPickerTabId.".concat(string2));
                    }
                    i = 3;
                }
                return new wzc(i, parcel.readString(), (wwu) parcel.readParcelable(wzc.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 7:
                pla1 pla1Var = (pla1) parcel.readParcelable(c0d.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d3 = 0;
                while (true) {
                    if (iM31715d3 == i4) {
                        return new c0d(parcel.readString(), parcel.readString(), arrayList3, pla1Var, parcel.readInt() != 0);
                    }
                    iM31715d3 = c7h0.m31715d(sl00.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                break;
            case 8:
                String string3 = parcel.readString();
                int iM31715d4 = 0;
                boolean z = parcel.readInt() != 0;
                sxd sxdVar2 = (sxd) parcel.readParcelable(n0d.class.getClassLoader());
                nmn0 nmn0VarCreateFromParcel2 = nmn0.CREATOR.createFromParcel(parcel);
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d5 = 0;
                while (iM31715d5 != i5) {
                    iM31715d5 = c7h0.m31715d(akk.CREATOR, parcel, arrayList4, iM31715d5, 1);
                }
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iM31715d4 != i6) {
                    iM31715d4 = c7h0.m31715d(pck.CREATOR, parcel, arrayList5, iM31715d4, 1);
                }
                return new n0d(string3, z, sxdVar2, nmn0VarCreateFromParcel2, arrayList4, arrayList5);
            case 9:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z2 = true;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new r0d(string4, string5, string6, z2, parcel.readInt() != 0, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false);
            case 10:
                return new y1d((n0d) parcel.readParcelable(y1d.class.getClassLoader()), parcel.readInt() != 0);
            case 11:
                return new d2d(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new e2d(parcel.readString());
            case 13:
                return new j2d((i2d) parcel.readParcelable(j2d.class.getClassLoader()));
            case 14:
                parcel.readInt();
                return f2d.f65151a;
            case 15:
                parcel.readInt();
                return g2d.f75887a;
            case 16:
                return new h2d(parcel.readString());
            case 17:
                return new c3d(parcel.readString());
            case 18:
                parcel.readInt();
                return d3d.f44851a;
            case 19:
                return new wgd(parcel.readString());
            case 20:
                return new whd(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                int iM9h = 0;
                int iM9h2 = 0;
                while (iM9h2 != i7) {
                    iM9h2 = AbstractC0000a.m9h(wid.class, parcel, arrayList6, iM9h2, 1);
                }
                boolean z3 = parcel.readInt() != 0;
                int i8 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i8);
                while (iM9h != i8) {
                    iM9h = AbstractC0000a.m9h(wid.class, parcel, arrayList7, iM9h, 1);
                }
                return new wid(arrayList6, arrayList7, z3);
            case 22:
                rvc rvcVar = (rvc) parcel.readParcelable(kjd.class.getClassLoader());
                pla1 pla1Var2 = (pla1) parcel.readParcelable(kjd.class.getClassLoader());
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                wid widVarCreateFromParcel = wid.CREATOR.createFromParcel(parcel);
                jqs jqsVar = (jqs) parcel.readParcelable(kjd.class.getClassLoader());
                jjd jjdVar = (jjd) parcel.readParcelable(kjd.class.getClassLoader());
                boolean z6 = parcel.readInt() != 0;
                int i9 = parcel.readInt();
                boolean z7 = parcel.readInt() != 0;
                String string7 = parcel.readString();
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                String string8 = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                xcl0 xcl0Var = (xcl0) parcel.readParcelable(kjd.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                boolean z15 = z4;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i13;
                    String string9 = parcel.readString();
                    xcl0 xcl0Var2 = xcl0Var;
                    int i15 = parcel.readInt();
                    rvc rvcVar2 = rvcVar;
                    ArrayList arrayList8 = new ArrayList(i15);
                    pla1 pla1Var3 = pla1Var2;
                    int iM9h3 = 0;
                    while (iM9h3 != i15) {
                        iM9h3 = AbstractC0000a.m9h(kjd.class, parcel, arrayList8, iM9h3, 1);
                        i15 = i15;
                    }
                    linkedHashMap.put(string9, arrayList8);
                    i13 = i14 + 1;
                    xcl0Var = xcl0Var2;
                    rvcVar = rvcVar2;
                    pla1Var2 = pla1Var3;
                }
                xcl0 xcl0Var3 = xcl0Var;
                rvc rvcVar3 = rvcVar;
                pla1 pla1Var4 = pla1Var2;
                boolean z16 = parcel.readInt() != 0;
                boolean z17 = parcel.readInt() != 0;
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
                int i17 = 0;
                while (i17 != i16) {
                    linkedHashMap2.put(parcel.readString(), parcel.createStringArrayList());
                    i17++;
                    linkedHashMap = linkedHashMap;
                }
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                String string10 = parcel.readString();
                boolean z18 = parcel.readInt() != 0;
                boolean z19 = parcel.readInt() != 0;
                whn0 whn0Var = (whn0) parcel.readParcelable(kjd.class.getClassLoader());
                boolean z20 = parcel.readInt() != 0;
                bo2 bo2Var = (bo2) parcel.readParcelable(kjd.class.getClassLoader());
                boolean z21 = parcel.readInt() != 0;
                gcd gcdVarValueOf = gcd.valueOf(parcel.readString());
                int i18 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i18);
                int i19 = 0;
                while (i19 != i18) {
                    arrayList9.add(gcd.valueOf(parcel.readString()));
                    i19++;
                    string10 = string10;
                }
                return new kjd(rvcVar3, pla1Var4, z15, z5, widVarCreateFromParcel, jqsVar, jjdVar, z6, i9, z7, string7, z8, z9, z10, string8, z11, i10, i11, xcl0Var3, z12, z13, z14, linkedHashMap3, z16, z17, linkedHashMap2, string10, z18, z19, whn0Var, z20, bo2Var, z21, gcdVarValueOf, arrayList9);
            case 23:
                return new xid(parcel.readString(), (pck) parcel.readParcelable(xid.class.getClassLoader()));
            case 24:
                return new yid(parcel.readString(), (pck) parcel.readParcelable(yid.class.getClassLoader()), (pck) parcel.readParcelable(yid.class.getClassLoader()));
            case 25:
                return new zid(parcel.readString(), (pck) parcel.readParcelable(zid.class.getClassLoader()), (pck) parcel.readParcelable(zid.class.getClassLoader()));
            case 26:
                return new ajd(parcel.readString(), (pck) parcel.readParcelable(ajd.class.getClassLoader()));
            case 27:
                return new bjd(parcel.readString(), (pck) parcel.readParcelable(bjd.class.getClassLoader()));
            case 28:
                return new djd((cjd) parcel.readParcelable(djd.class.getClassLoader()), parcel.readInt() != 0, (gcl) parcel.readParcelable(djd.class.getClassLoader()));
            default:
                return new ejd((gcl) parcel.readParcelable(ejd.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f192966a) {
            case 0:
                return new rvc[i];
            case 1:
                return new hzc[i];
            case 2:
                return new pzc[i];
            case 3:
                return new qzc[i];
            case 4:
                return new rzc[i];
            case 5:
                return new vzc[i];
            case 6:
                return new wzc[i];
            case 7:
                return new c0d[i];
            case 8:
                return new n0d[i];
            case 9:
                return new r0d[i];
            case 10:
                return new y1d[i];
            case 11:
                return new d2d[i];
            case 12:
                return new e2d[i];
            case 13:
                return new j2d[i];
            case 14:
                return new f2d[i];
            case 15:
                return new g2d[i];
            case 16:
                return new h2d[i];
            case 17:
                return new c3d[i];
            case 18:
                return new d3d[i];
            case 19:
                return new wgd[i];
            case 20:
                return new whd[i];
            case 21:
                return new wid[i];
            case 22:
                return new kjd[i];
            case 23:
                return new xid[i];
            case 24:
                return new yid[i];
            case 25:
                return new zid[i];
            case 26:
                return new ajd[i];
            case 27:
                return new bjd[i];
            case 28:
                return new djd[i];
            default:
                return new ejd[i];
        }
    }
}
