package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.connect.core.model.Capability;
import com.spotify.connect.core.model.RedirectUris;
import java.util.LinkedHashMap;
import java.util.UUID;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class n6f1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: b */
    public static final n6f1 f150875b = new n6f1(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150876a;

    public /* synthetic */ n6f1(int i) {
        this.f150876a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f150876a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    return vif1.m85645a(parcel);
                }
                parcel.setDataPosition(iDataPosition - 4);
                return j45.f108593d;
            case 1:
                return new C2539wl(parcel.readString(), AbstractC0000a.m5d(parcel.readString()), parcel.readString(), C2131ml.CREATOR.createFromParcel(parcel), (AbstractC2500vl) parcel.readParcelable(C2539wl.class.getClassLoader()));
            case 2:
                return new hy0(parcel.readString(), parcel.readString(), rk7.valueOf(parcel.readString()));
            case 3:
                return new m05(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 4:
                parcel.readInt();
                return yl7.f273926a;
            case 5:
                return new lk9(parcel.readString(), parcel.readString());
            case 6:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                RedirectUris redirectUrisCreateFromParcel = parcel.readInt() == 0 ? null : RedirectUris.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i);
                    int iM75732f = 0;
                    while (iM75732f != i) {
                        iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                    }
                }
                return new Capability(string, string2, string3, redirectUrisCreateFromParcel, linkedHashMap);
            case 7:
                return new x7c(parcel.readInt());
            case 8:
                return new doc(parcel.readLong(), parcel.readString());
            case 9:
                return new tth(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return pxj.valueOf(parcel.readString());
            case 11:
                return new uzk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new rbl(parcel.readInt() != 0, (qbl) parcel.readParcelable(rbl.class.getClassLoader()));
            case 13:
                return new mnp(parcel.readInt());
            case 14:
                return new f5r(parcel.readString(), b5r.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt());
            case 15:
                parcel.readInt();
                return rdu.f198207a;
            case 16:
                parcel.readInt();
                return rpu.f201645c;
            case 17:
                parcel.readInt();
                return eru.f62208c;
            case 18:
                parcel.readInt();
                return ztu.f286267c;
            case 19:
                parcel.readInt();
                return uvu.f234506c;
            case 20:
                parcel.readInt();
                return uwu.f234734c;
            case 21:
                return new lfx(parcel.readString(), parcel.readString());
            case 22:
                return new h600(parcel.readString(), parcel.readString(), parcel.readString(), (zzq0) parcel.readParcelable(h600.class.getClassLoader()), (m05) parcel.readParcelable(h600.class.getClassLoader()));
            case 23:
                return new d800(parcel);
            case 24:
                return new xu00(parcel.readString(), qqg1.m73549s(parcel), rbz.m75185c(parcel.readString()));
            case 25:
                return new aj40((UUID) parcel.readSerializable());
            case 26:
                fl80 fl80Var = new fl80();
                fl80Var.f70722a = parcel.readInt();
                fl80Var.f70723b = parcel.readInt();
                fl80Var.f70724c = parcel.readInt() == 1;
                return fl80Var;
            case 27:
                return new n390(parcel.readInt() != 0);
            case 28:
                parcel.readInt();
                return ho90.f93484a;
            default:
                return new sie0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f150876a) {
            case 0:
                return new j45[i];
            case 1:
                return new C2539wl[i];
            case 2:
                return new hy0[i];
            case 3:
                return new m05[i];
            case 4:
                return new yl7[i];
            case 5:
                return new lk9[i];
            case 6:
                return new Capability[i];
            case 7:
                return new x7c[i];
            case 8:
                return new doc[i];
            case 9:
                return new tth[i];
            case 10:
                return new pxj[i];
            case 11:
                return new uzk[i];
            case 12:
                return new rbl[i];
            case 13:
                return new mnp[i];
            case 14:
                return new f5r[i];
            case 15:
                return new rdu[i];
            case 16:
                return new rpu[i];
            case 17:
                return new eru[i];
            case 18:
                return new ztu[i];
            case 19:
                return new uvu[i];
            case 20:
                return new uwu[i];
            case 21:
                return new lfx[i];
            case 22:
                return new h600[i];
            case 23:
                return new d800[i];
            case 24:
                return new xu00[i];
            case 25:
                return new aj40[i];
            case 26:
                return new fl80[i];
            case 27:
                return new n390[i];
            case 28:
                return new ho90[i];
            default:
                return new sie0[i];
        }
    }
}
