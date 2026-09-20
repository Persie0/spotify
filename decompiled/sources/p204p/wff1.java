package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wff1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f250841l = 1;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f250842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wff1(axz0 axz0Var) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 3);
        this.f250842m = axz0Var;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i2 = this.f250841l;
        Object obj = this.f250842m;
        boolean z = false;
        switch (i2) {
            case 0:
                fzj fzjVar = (fzj) obj;
                if (i == 1) {
                    rfr rfrVar = (rfr) fmf1.m42106a(parcel, rfr.CREATOR);
                    fmf1.m42109d(parcel);
                    fzjVar.m43228i(new und1(this, rfrVar));
                } else {
                    if (i != 2) {
                        return false;
                    }
                    rfr rfrVar2 = (rfr) fmf1.m42106a(parcel, rfr.CREATOR);
                    fmf1.m42109d(parcel);
                    fzjVar.m43228i(new y4f1(this, rfrVar2));
                }
                return true;
            case 1:
                axz0 axz0Var = (axz0) obj;
                switch (i) {
                    case 1:
                        imk0 imk0Var = new imk0(axz0Var);
                        parcel2.writeNoException();
                        fmf1.m42108c(parcel2, imk0Var);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) fmf1.m42106a(parcel, Bundle.CREATOR);
                        fmf1.m42109d(parcel);
                        ((obc) axz0Var).m66641g(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) fmf1.m42106a(parcel, Bundle.CREATOR);
                        fmf1.m42109d(parcel);
                        ((obc) axz0Var).m66641g(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i3 = fmf1.f71041a;
                        int i4 = parcel.readInt() != 0 ? 1 : 0;
                        fmf1.m42109d(parcel);
                        obc obcVar = (obc) axz0Var;
                        zdf1 zdf1Var = obcVar.f163602e;
                        if (zdf1Var != null) {
                            try {
                                ecf1 ecf1Var = (ecf1) zdf1Var;
                                Parcel parcelM43604d2 = ecf1Var.m43604d2();
                                parcelM43604d2.writeInt(i4);
                                parcelM43604d2.writeInt(0);
                                ecf1Var.m43606f2(6, parcelM43604d2);
                            } catch (RemoteException unused) {
                                obc.f163599m.m83849b("Unable to call %s on %s.", "disconnectFromDevice", zdf1.class.getSimpleName());
                            }
                            obcVar.m27442b(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        obc obcVar2 = (obc) axz0Var;
                        obcVar2.getClass();
                        ig31.m50501s("Must be called from the main thread.");
                        ydw0 ydw0Var = obcVar2.f163607j;
                        long jM93503f = ydw0Var == null ? 0L : ydw0Var.m93503f() - obcVar2.f163607j.m93499b();
                        parcel2.writeNoException();
                        parcel2.writeLong(jM93503f);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) fmf1.m42106a(parcel, Bundle.CREATOR);
                        fmf1.m42109d(parcel);
                        obc obcVar3 = (obc) axz0Var;
                        obcVar3.getClass();
                        obcVar3.f163608k = CastDevice.m1481M(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) fmf1.m42106a(parcel, Bundle.CREATOR);
                        fmf1.m42109d(parcel);
                        obc obcVar4 = (obc) axz0Var;
                        obcVar4.getClass();
                        obcVar4.f163608k = CastDevice.m1481M(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) fmf1.m42106a(parcel, Bundle.CREATOR);
                        fmf1.m42109d(parcel);
                        obc obcVar5 = (obc) axz0Var;
                        obcVar5.getClass();
                        CastDevice castDeviceM1481M = CastDevice.m1481M(bundle5);
                        if (castDeviceM1481M != null) {
                            String str = castDeviceM1481M.f1774d;
                            if (!castDeviceM1481M.equals(obcVar5.f163608k)) {
                                if (!TextUtils.isEmpty(str) && ((castDevice2 = obcVar5.f163608k) == null || !TextUtils.equals(castDevice2.f1774d, str))) {
                                    z = true;
                                }
                                obcVar5.f163608k = castDeviceM1481M;
                                obc.f163599m.m83848a("update to device (%s) with name %s", castDeviceM1481M, true != z ? "unchanged" : "changed");
                                if (z && (castDevice = obcVar5.f163608k) != null) {
                                    s0h1 s0h1Var = obcVar5.f163605h;
                                    if (s0h1Var != null) {
                                        s0h1.f204393v.m83850c("update Cast device to %s", castDevice);
                                        s0h1Var.f204408o = castDevice;
                                        s0h1Var.m76874c();
                                    }
                                    Iterator it = new HashSet(obcVar5.f163601d).iterator();
                                    while (it.hasNext()) {
                                        ((m6h1) it.next()).getClass();
                                    }
                                    c4d1 c4d1Var = obcVar5.f163609l;
                                    if (c4d1Var != null) {
                                        ((oyp0) c4d1Var.f33927b).m68532E().f227344u++;
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
            case 2:
                xif1 xif1Var = (xif1) obj;
                if (i == 1) {
                    String string = parcel.readString();
                    fmf1.m42109d(parcel);
                    xif1Var.getClass();
                    Context context = xif1Var.f261867a;
                    String str2 = xif1Var.f261868b;
                    Context context2 = xif1Var.f261867a;
                    ebc ebcVar = xif1Var.f261870d;
                    wlf1 wlf1Var = xif1Var.f261871e;
                    tv30 tv30VarM27444d = new obc(context, str2, string, ebcVar, wlf1Var, new s0h1(context2, ebcVar, wlf1Var)).m27444d();
                    parcel2.writeNoException();
                    fmf1.m42108c(parcel2, tv30VarM27444d);
                } else if (i == 2) {
                    boolean z2 = xif1Var.f261870d.f57894e;
                    parcel2.writeNoException();
                    int i5 = fmf1.f71041a;
                    parcel2.writeInt(z2 ? 1 : 0);
                } else if (i == 3) {
                    String str3 = xif1Var.f261868b;
                    parcel2.writeNoException();
                    parcel2.writeString(str3);
                } else {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            default:
                if (i == 1) {
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    fmf1.m42109d(parcel);
                    ((jrf1) obj).publishProgress(Long.valueOf(j), Long.valueOf(j2));
                    parcel2.writeNoException();
                } else {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wff1(thf1 thf1Var, fzj fzjVar) {
        super("com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsCallback", 3);
        this.f250842m = fzjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wff1(xif1 xif1Var) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 3);
        this.f250842m = xif1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wff1(jrf1 jrf1Var) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 3);
        this.f250842m = jrf1Var;
    }
}
