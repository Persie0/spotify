package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class vj01 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241849a;

    public /* synthetic */ vj01(int i) {
        this.f241849a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM31715d = 0;
        dd41 dd41VarM74726U = null;
        switch (this.f241849a) {
            case 0:
                parcel.readInt();
                return wj01.f251822a;
            case 1:
                parcel.readInt();
                return xj01.f261984a;
            case 2:
                parcel.readInt();
                return yj01.f273239a;
            case 3:
                parcel.readInt();
                return zj01.f283324a;
            case 4:
                parcel.readInt();
                return ak01.f16384a;
            case 5:
                parcel.readInt();
                return bk01.f27801a;
            case 6:
                xr01 xr01Var = (xr01) parcel.readParcelable(ok01.class.getClassLoader());
                String string = parcel.readString();
                if (string != null) {
                    Set set = dd41.f47702f;
                    dd41VarM74726U = r46.m74726U(string);
                }
                return new ok01(xr01Var, dd41VarM74726U, (z0c) parcel.readParcelable(ok01.class.getClassLoader()));
            case 7:
                return new nk01(um01.CREATOR.createFromParcel(parcel), (as01) parcel.readParcelable(nk01.class.getClassLoader()), (ck01) parcel.readParcelable(nk01.class.getClassLoader()), parcel.readInt() != 0);
            case 8:
                return new om01(parcel.readString(), (wwu) parcel.readParcelable(om01.class.getClassLoader()));
            case 9:
                String string2 = parcel.readString();
                return new um01(string2 != null ? qpv0.f191387a.mo54112b(Class.forName(string2)) : null);
            case 10:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(on01.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new pn01(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList);
            case 11:
                return new on01(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.readInt();
                return zn01.f284388a;
            case 13:
                return new ao01((e2r) parcel.readParcelable(ao01.class.getClassLoader()));
            case 14:
                lu01 lu01VarCreateFromParcel = parcel.readInt() != 0 ? lu01.CREATOR.createFromParcel(parcel) : null;
                Bundle bundle = parcel.readBundle(eo01.class.getClassLoader());
                l511 l511Var = (l511) parcel.readParcelable(eo01.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iM31715d != i2) {
                    iM31715d = AbstractC0000a.m9h(eo01.class, parcel, arrayList2, iM31715d, 1);
                }
                return new eo01(lu01VarCreateFromParcel, bundle, l511Var, arrayList2);
            case 15:
                return new no01(parcel.readString(), parcel.readString());
            case 16:
                parcel.readInt();
                return ep01.f61529d;
            case 17:
                parcel.readInt();
                return fp01.f71659d;
            case 18:
                parcel.readInt();
                return gp01.f83051d;
            case 19:
                parcel.readInt();
                return hp01.f93667d;
            case 20:
                parcel.readInt();
                return ip01.f104325d;
            case 21:
                parcel.readInt();
                return jp01.f114542d;
            case 22:
                parcel.readInt();
                return kp01.f124948d;
            case 23:
                parcel.readInt();
                return lp01.f135591d;
            case 24:
                parcel.readInt();
                return mp01.f145818d;
            case 25:
                parcel.readInt();
                return np01.f156838d;
            case 26:
                parcel.readInt();
                return op01.f167731d;
            case 27:
                parcel.readInt();
                return pp01.f179843d;
            case 28:
                parcel.readInt();
                return qp01.f191110d;
            default:
                parcel.readInt();
                return rp01.f201396d;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f241849a) {
            case 0:
                return new wj01[i];
            case 1:
                return new xj01[i];
            case 2:
                return new yj01[i];
            case 3:
                return new zj01[i];
            case 4:
                return new ak01[i];
            case 5:
                return new bk01[i];
            case 6:
                return new ok01[i];
            case 7:
                return new nk01[i];
            case 8:
                return new om01[i];
            case 9:
                return new um01[i];
            case 10:
                return new pn01[i];
            case 11:
                return new on01[i];
            case 12:
                return new zn01[i];
            case 13:
                return new ao01[i];
            case 14:
                return new eo01[i];
            case 15:
                return new no01[i];
            case 16:
                return new ep01[i];
            case 17:
                return new fp01[i];
            case 18:
                return new gp01[i];
            case 19:
                return new hp01[i];
            case 20:
                return new ip01[i];
            case 21:
                return new jp01[i];
            case 22:
                return new kp01[i];
            case 23:
                return new lp01[i];
            case 24:
                return new mp01[i];
            case 25:
                return new np01[i];
            case 26:
                return new op01[i];
            case 27:
                return new pp01[i];
            case 28:
                return new qp01[i];
            default:
                return new rp01[i];
        }
    }
}
