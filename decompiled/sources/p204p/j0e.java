package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class j0e implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107433a;

    public /* synthetic */ j0e(int i) {
        this.f107433a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f107433a) {
            case 0:
                parcel.readInt();
                return k0e.f117991b;
            case 1:
                parcel.readInt();
                return l0e.f128395b;
            case 2:
                parcel.readInt();
                return m0e.f138646b;
            case 3:
                parcel.readInt();
                return n0e.f149033b;
            case 4:
                parcel.readInt();
                return o0e.f160366b;
            case 5:
                return new p0e(parcel.readString());
            case 6:
                parcel.readInt();
                return q0e.f183980b;
            case 7:
                parcel.readInt();
                return r0e.f194473b;
            case 8:
                parcel.readInt();
                return s0e.f204363b;
            case 9:
                parcel.readInt();
                return t0e.f215853b;
            case 10:
                parcel.readInt();
                return u0e.f225466b;
            case 11:
                parcel.readInt();
                return v0e.f235976b;
            case 12:
                parcel.readInt();
                return w0e.f246706b;
            case 13:
                parcel.readInt();
                return x0e.f256868b;
            case 14:
                parcel.readInt();
                return y0e.f267970b;
            case 15:
                parcel.readInt();
                return z0e.f278073b;
            case 16:
                parcel.readInt();
                return a1e.f11392b;
            case 17:
                parcel.readInt();
                return b1e.f22300b;
            case 18:
                parcel.readInt();
                return c1e.f33059b;
            case 19:
                parcel.readInt();
                return d1e.f44241b;
            case 20:
                return new i1e(parcel.readString());
            case 21:
                return new q1e((e1e) parcel.readParcelable(q1e.class.getClassLoader()), (p1e) parcel.readParcelable(q1e.class.getClassLoader()), (Uri) parcel.readParcelable(q1e.class.getClassLoader()));
            case 22:
                return new l1e(parcel.readString());
            case 23:
                parcel.readInt();
                return m1e.f138948a;
            case 24:
                parcel.readInt();
                return n1e.f149400a;
            case 25:
                return new o1e(parcel.readString());
            case 26:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                return new j2e(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), string, string2, string3, parcel.readString(), z, parcel.readInt() != 0);
            case 27:
                return new r4e(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 28:
                return new c6e(parcel.readString(), parcel.readString());
            default:
                return new g6e(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f107433a) {
            case 0:
                return new k0e[i];
            case 1:
                return new l0e[i];
            case 2:
                return new m0e[i];
            case 3:
                return new n0e[i];
            case 4:
                return new o0e[i];
            case 5:
                return new p0e[i];
            case 6:
                return new q0e[i];
            case 7:
                return new r0e[i];
            case 8:
                return new s0e[i];
            case 9:
                return new t0e[i];
            case 10:
                return new u0e[i];
            case 11:
                return new v0e[i];
            case 12:
                return new w0e[i];
            case 13:
                return new x0e[i];
            case 14:
                return new y0e[i];
            case 15:
                return new z0e[i];
            case 16:
                return new a1e[i];
            case 17:
                return new b1e[i];
            case 18:
                return new c1e[i];
            case 19:
                return new d1e[i];
            case 20:
                return new i1e[i];
            case 21:
                return new q1e[i];
            case 22:
                return new l1e[i];
            case 23:
                return new m1e[i];
            case 24:
                return new n1e[i];
            case 25:
                return new o1e[i];
            case 26:
                return new j2e[i];
            case 27:
                return new r4e[i];
            case 28:
                return new c6e[i];
            default:
                return new g6e[i];
        }
    }
}
