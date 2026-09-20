package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class sp01 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212705a;

    public /* synthetic */ sp01(int i) {
        this.f212705a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        dd41 dd41VarM74726U = null;
        int iM75732f = 0;
        switch (this.f212705a) {
            case 0:
                parcel.readInt();
                return tp01.f222377d;
            case 1:
                parcel.readInt();
                return up01.f232548d;
            case 2:
                parcel.readInt();
                return vp01.f243563d;
            case 3:
                parcel.readInt();
                return wp01.f253636d;
            case 4:
                parcel.readInt();
                return xp01.f264405d;
            case 5:
                parcel.readInt();
                return yp01.f274789d;
            case 6:
                parcel.readInt();
                return zp01.f284897d;
            case 7:
                parcel.readInt();
                return aq01.f18050d;
            case 8:
                parcel.readInt();
                return bq01.f29640d;
            case 9:
                parcel.readInt();
                return cq01.f40697d;
            case 10:
                parcel.readInt();
                return dq01.f51788d;
            case 11:
                parcel.readInt();
                return eq01.f61756d;
            case 12:
                return new gq01((fq01) parcel.readParcelable(gq01.class.getClassLoader()), parcel.readInt() != 0);
            case 13:
                return hr01.valueOf(parcel.readString());
            case 14:
                return new rr01((lu01) parcel.readParcelable(rr01.class.getClassLoader()), (xr01) parcel.readParcelable(rr01.class.getClassLoader()));
            case 15:
                return new sr01(rr01.CREATOR.createFromParcel(parcel), nk01.CREATOR.createFromParcel(parcel), q111.CREATOR.createFromParcel(parcel));
            case 16:
                String string = parcel.readString();
                if (string != null) {
                    Set set = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(string);
                }
                return new xr01(dd41VarM74726U);
            case 17:
                return new xs01(parcel.readString());
            case 18:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(gt01.class, parcel, arrayList, iM9h, 1);
                }
                return new gt01(arrayList, parcel.readInt() != 0, parcel.readInt(), (pla1) parcel.readParcelable(gt01.class.getClassLoader()));
            case 19:
                return new bu01(rfg1.m75432b(parcel.readInt()), parcel.readString(), rfg1.m75432b(parcel.readInt()));
            case 20:
                return new cu01((Uri) parcel.readParcelable(cu01.class.getClassLoader()), parcel.readString());
            case 21:
                Uri uri = (Uri) parcel.readParcelable(du01.class.getClassLoader());
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                Long lValueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("PLAYING")) {
                    i2 = 1;
                } else {
                    if (string2.equals("PAUSED")) {
                        i = 2;
                    } else {
                        if (!string2.equals("STOPPED")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.share.mediaelement.api.ShareMediaElementUiModel.Video.State.".concat(string2));
                        }
                        i = 3;
                    }
                    i2 = i;
                }
                return new du01(uri, j, j2, lValueOf, i2, mac1.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
            case 22:
                return new iu01((Uri) parcel.readParcelable(iu01.class.getClassLoader()), parcel.readString(), ntd0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), parcel.readLong(), (aob1) parcel.readParcelable(iu01.class.getClassLoader()), parcel.readInt() != 0);
            case 23:
                return new ju01(parcel.readString(), parcel.readString(), ((xs01) parcel.readParcelable(ju01.class.getClassLoader())).f265445a, (eo01) parcel.readParcelable(ju01.class.getClassLoader()));
            case 24:
                return new ku01(e2r.CREATOR.createFromParcel(parcel));
            case 25:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                while (iM75732f != i4) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new lu01(string3, string4, opo.m67547D(linkedHashMap), (k1b1) parcel.readParcelable(lu01.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readBundle(lu01.class.getClassLoader()));
            case 26:
                return new qu01(sr01.CREATOR.createFromParcel(parcel), parcel.readInt(), stz0.m79365s(parcel.readString()));
            case 27:
                parcel.readInt();
                return yu01.f276244a;
            case 28:
                parcel.readInt();
                return zu01.f286314a;
            default:
                parcel.readInt();
                return av01.f20063a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f212705a) {
            case 0:
                return new tp01[i];
            case 1:
                return new up01[i];
            case 2:
                return new vp01[i];
            case 3:
                return new wp01[i];
            case 4:
                return new xp01[i];
            case 5:
                return new yp01[i];
            case 6:
                return new zp01[i];
            case 7:
                return new aq01[i];
            case 8:
                return new bq01[i];
            case 9:
                return new cq01[i];
            case 10:
                return new dq01[i];
            case 11:
                return new eq01[i];
            case 12:
                return new gq01[i];
            case 13:
                return new hr01[i];
            case 14:
                return new rr01[i];
            case 15:
                return new sr01[i];
            case 16:
                return new xr01[i];
            case 17:
                return new xs01[i];
            case 18:
                return new gt01[i];
            case 19:
                return new bu01[i];
            case 20:
                return new cu01[i];
            case 21:
                return new du01[i];
            case 22:
                return new iu01[i];
            case 23:
                return new ju01[i];
            case 24:
                return new ku01[i];
            case 25:
                return new lu01[i];
            case 26:
                return new qu01[i];
            case 27:
                return new yu01[i];
            case 28:
                return new zu01[i];
            default:
                return new av01[i];
        }
    }
}
