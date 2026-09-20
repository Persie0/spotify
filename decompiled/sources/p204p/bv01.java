package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class bv01 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31247a;

    public /* synthetic */ bv01(int i) {
        this.f31247a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        dd41 dd41VarM74726U = null;
        int iM9h = 0;
        int iM9h2 = 0;
        switch (this.f31247a) {
            case 0:
                return new hv01(parcel.readFloat(), (gv01) parcel.readParcelable(hv01.class.getClassLoader()));
            case 1:
                return new cv01(parcel.readString(), parcel.readString());
            case 2:
                return new dv01(parcel.readString());
            case 3:
                return new ev01(parcel.readString());
            case 4:
                return new fv01(parcel.readString());
            case 5:
                return new iv01((ok01) parcel.readParcelable(iv01.class.getClassLoader()), (pv01) parcel.readParcelable(iv01.class.getClassLoader()));
            case 6:
                return new jv01(parcel.readString());
            case 7:
                return new kv01(parcel.readString());
            case 8:
                return new mv01(parcel.readString(), parcel.readString(), hv01.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ov01.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? xu01.valueOf(parcel.readString()) : null, (lv01) parcel.readParcelable(mv01.class.getClassLoader()));
            case 9:
                int i = 1;
                String string = parcel.readString();
                String string2 = parcel.readString();
                hv01 hv01VarCreateFromParcel = hv01.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (!string4.equals("Square")) {
                    if (!string4.equals("Round")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.ShareMetadata.Loaded.Preview.DefaultPreview.ImageShape.".concat(string4));
                    }
                    i = 2;
                }
                return new ov01(string, string2, hv01VarCreateFromParcel, string3, i, parcel.readInt() == 0 ? null : nv01.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? xu01.valueOf(parcel.readString()) : null, (lv01) parcel.readParcelable(ov01.class.getClassLoader()));
            case 10:
                return new nv01(parcel.readString(), parcel.readString());
            case 11:
                return new ix01(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new jx01(parcel.readString(), parcel.readInt() != 0 ? tj01.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), (hr01) parcel.readParcelable(jx01.class.getClassLoader()));
            case 13:
                fq01 fq01Var = (fq01) parcel.readParcelable(lx01.class.getClassLoader());
                String string5 = parcel.readString();
                if (string5 != null) {
                    Set set = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(string5);
                }
                return new lx01(fq01Var, dd41VarM74726U);
            case 14:
                return new mx01(parcel.readString());
            case 15:
                parcel.readInt();
                return nx01.f159318a;
            case 16:
                return new by01(parcel.readString(), parcel.readString(), ((xs01) parcel.readParcelable(by01.class.getClassLoader())).f265445a, (ox01) parcel.readParcelable(by01.class.getClassLoader()), (u311) parcel.readParcelable(by01.class.getClassLoader()));
            case 17:
                return new cy01(parcel.readString(), (ij40) parcel.readParcelable(cy01.class.getClassLoader()));
            case 18:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(mz01.class, parcel, arrayList, iM9h, 1);
                }
                return new mz01(arrayList);
            case 19:
                parcel.readInt();
                return nz01.f159969a;
            case 20:
                u311 u311Var = (u311) parcel.readParcelable(qz01.class.getClassLoader());
                eo01 eo01Var = (eo01) parcel.readParcelable(qz01.class.getClassLoader());
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ox01 ox01Var = (ox01) parcel.readParcelable(qz01.class.getClassLoader());
                oz01 oz01Var = (oz01) parcel.readParcelable(qz01.class.getClassLoader());
                pz01 pz01VarCreateFromParcel = parcel.readInt() == 0 ? null : pz01.CREATOR.createFromParcel(parcel);
                xs01 xs01Var = (xs01) parcel.readParcelable(qz01.class.getClassLoader());
                return new qz01(u311Var, eo01Var, numValueOf, ox01Var, oz01Var, pz01VarCreateFromParcel, xs01Var != null ? xs01Var.f265445a : null, (ku01) parcel.readParcelable(qz01.class.getClassLoader()), (xr01) parcel.readParcelable(qz01.class.getClassLoader()));
            case 21:
                return new pz01((fq01) parcel.readParcelable(pz01.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 22:
                return new j011(parcel.readString(), parcel.readString(), parcel.readString(), (C1722bz) parcel.readParcelable(j011.class.getClassLoader()), (C1722bz) parcel.readParcelable(j011.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return u011.f225348a;
            case 24:
                u311 u311Var2 = (u311) parcel.readParcelable(v011.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iM9h2 != i3) {
                    iM9h2 = AbstractC0000a.m9h(v011.class, parcel, arrayList2, iM9h2, 1);
                }
                return new v011(u311Var2, arrayList2, (e2r) parcel.readParcelable(v011.class.getClassLoader()), parcel.readString(), parcel.readString(), ((xs01) parcel.readParcelable(v011.class.getClassLoader())).f265445a, (ku01) parcel.readParcelable(v011.class.getClassLoader()), (ox01) parcel.readParcelable(v011.class.getClassLoader()));
            case 25:
                parcel.readInt();
                return w011.f246617a;
            case 26:
                parcel.readInt();
                return h111.f86404a;
            case 27:
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM9h3 = 0;
                while (iM9h3 != i4) {
                    iM9h3 = AbstractC0000a.m9h(j111.class, parcel, arrayList3, iM9h3, 1);
                }
                return new j111(arrayList3, (u311) parcel.readParcelable(j111.class.getClassLoader()), parcel.readString(), parcel.readString(), ((xs01) parcel.readParcelable(j111.class.getClassLoader())).f265445a, parcel.readInt() != 0, i111.valueOf(parcel.readString()), (ox01) parcel.readParcelable(j111.class.getClassLoader()));
            case 28:
                parcel.readInt();
                return k111.f118185a;
            default:
                a400 a400Var = (a400) parcel.readParcelable(q111.class.getClassLoader());
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet.add(parcel.readParcelable(q111.class.getClassLoader()));
                }
                return new q111(a400Var, linkedHashSet, parcel.readInt() != 0, parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f31247a) {
            case 0:
                return new hv01[i];
            case 1:
                return new cv01[i];
            case 2:
                return new dv01[i];
            case 3:
                return new ev01[i];
            case 4:
                return new fv01[i];
            case 5:
                return new iv01[i];
            case 6:
                return new jv01[i];
            case 7:
                return new kv01[i];
            case 8:
                return new mv01[i];
            case 9:
                return new ov01[i];
            case 10:
                return new nv01[i];
            case 11:
                return new ix01[i];
            case 12:
                return new jx01[i];
            case 13:
                return new lx01[i];
            case 14:
                return new mx01[i];
            case 15:
                return new nx01[i];
            case 16:
                return new by01[i];
            case 17:
                return new cy01[i];
            case 18:
                return new mz01[i];
            case 19:
                return new nz01[i];
            case 20:
                return new qz01[i];
            case 21:
                return new pz01[i];
            case 22:
                return new j011[i];
            case 23:
                return new u011[i];
            case 24:
                return new v011[i];
            case 25:
                return new w011[i];
            case 26:
                return new h111[i];
            case 27:
                return new j111[i];
            case 28:
                return new k111[i];
            default:
                return new q111[i];
        }
    }
}
