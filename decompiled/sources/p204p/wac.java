package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class wac extends AbstractC2206o9 {

    /* JADX INFO: renamed from: a */
    public final String f249442a;

    /* JADX INFO: renamed from: b */
    public final String f249443b;

    /* JADX INFO: renamed from: c */
    public final rif1 f249444c;

    /* JADX INFO: renamed from: d */
    public final v0k0 f249445d;

    /* JADX INFO: renamed from: e */
    public final boolean f249446e;

    /* JADX INFO: renamed from: f */
    public final boolean f249447f;

    /* JADX INFO: renamed from: g */
    public static final ura0 f249441g = new ura0("CastMediaOptions", null);
    public static final Parcelable.Creator<wac> CREATOR = new c5f1(8);

    public wac(String str, String str2, IBinder iBinder, v0k0 v0k0Var, boolean z, boolean z2) {
        rif1 rif1Var;
        this.f249442a = str;
        this.f249443b = str2;
        if (iBinder == null) {
            rif1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            rif1Var = iInterfaceQueryLocalInterface instanceof rif1 ? (rif1) iInterfaceQueryLocalInterface : new rif1(iBinder);
        }
        this.f249444c = rif1Var;
        this.f249445d = v0k0Var;
        this.f249446e = z;
        this.f249447f = z2;
    }

    /* JADX INFO: renamed from: k */
    public final void m87592k() {
        rif1 rif1Var = this.f249444c;
        if (rif1Var != null) {
            try {
                ikc0.m50942n(imk0.m51106d2(rif1Var.m75586j2()));
            } catch (RemoteException unused) {
                f249441g.m83849b("Unable to call %s on %s.", "getWrappedClientObject", rif1.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26308N(parcel, 2, this.f249442a);
        alf1.m26308N(parcel, 3, this.f249443b);
        rif1 rif1Var = this.f249444c;
        alf1.m26301G(parcel, 4, rif1Var == null ? null : rif1Var.asBinder());
        alf1.m26307M(parcel, 5, this.f249445d, i);
        alf1.m26295A(parcel, 6, this.f249446e);
        alf1.m26295A(parcel, 7, this.f249447f);
        alf1.m26331n(iM26329l, parcel);
    }
}
