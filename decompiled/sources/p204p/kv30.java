package p204p;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.core.crossdeviceprompt.CrossDevicePromptException;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kv30 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126770a;

    /* JADX INFO: renamed from: C */
    public abstract boolean mo57436C(int i, Parcel parcel);

    /* JADX INFO: renamed from: a2 */
    public abstract boolean mo46686a2(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.f126770a;
        return this;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        weg1 weg1Var;
        boolean zOnTransact = false;
        switch (this.f126770a) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.media3.session.IMediaSessionService");
                    return true;
                }
                if (i != 3001) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                final dv30 dv30VarM69572C = pcd0.m69572C(parcel.readStrongBinder());
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                final krd0 krd0Var = (krd0) this;
                if (dv30VarM69572C == null || bundle == null) {
                    vlg1.m85970r(dv30VarM69572C);
                    return true;
                }
                try {
                    final kzi kziVarM57757a = kzi.m57757a(bundle);
                    String str = kziVarM57757a.f128133c;
                    lrd0 lrd0Var = (lrd0) krd0Var.f125620l.get();
                    if (lrd0Var == null) {
                        vlg1.m85970r(dv30VarM69572C);
                        return true;
                    }
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    if (callingPid == 0) {
                        callingPid = kziVarM57757a.f128134d;
                    }
                    if (vlg1.m85969q(callingUid, lrd0Var, str) == 0) {
                        final MediaSessionManager.RemoteUserInfo remoteUserInfo = new MediaSessionManager.RemoteUserInfo(str, callingPid, callingUid);
                        final boolean zIsTrustedForMediaControl = MediaSessionManager.getSessionManager(lrd0Var.getApplicationContext()).isTrustedForMediaControl(remoteUserInfo);
                        krd0Var.f125622n.add(dv30VarM69572C);
                        try {
                            krd0Var.f125621m.post(new Runnable() { // from class: p.jrd0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionManager.RemoteUserInfo remoteUserInfo2 = remoteUserInfo;
                                    kzi kziVar = kziVarM57757a;
                                    boolean z = zIsTrustedForMediaControl;
                                    krd0 krd0Var2 = krd0Var;
                                    Set set = krd0Var2.f125622n;
                                    dv30 dv30Var = dv30VarM69572C;
                                    set.remove(dv30Var);
                                    try {
                                        try {
                                            lrd0 lrd0Var2 = (lrd0) krd0Var2.f125620l.get();
                                            if (lrd0Var2 == null) {
                                                vlg1.m85970r(dv30Var);
                                                return;
                                            }
                                            int i3 = kziVar.f128131a;
                                            int i4 = kziVar.f128132b;
                                            tnd0 tnd0Var = new tnd0(remoteUserInfo2, i3, i4, z, new isd0(dv30Var, i4), kziVar.f128135e);
                                            ggd0 ggd0VarMo13468n = lrd0Var2.mo13468n(tnd0Var);
                                            if (ggd0VarMo13468n == null) {
                                                vlg1.m85970r(dv30Var);
                                                return;
                                            } else {
                                                lrd0Var2.m59792j(ggd0VarMo13468n);
                                                ggd0VarMo13468n.f79643a.f201547g.m70778C(dv30Var, tnd0Var);
                                                return;
                                            }
                                        } catch (Exception e) {
                                            yif1.m93821x0("Failed to add a session to session service", e);
                                            vlg1.m85970r(dv30Var);
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        vlg1.m85970r(dv30Var);
                                        throw th;
                                    }
                                    vlg1.m85970r(dv30Var);
                                    throw th;
                                }
                            });
                            return true;
                        } finally {
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                    yif1.m93819w0("Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    vlg1.m85970r(dv30VarM69572C);
                    return true;
                } catch (RuntimeException e) {
                    yif1.m93821x0("Ignoring malformed Bundle for ConnectionRequest", e);
                    vlg1.m85970r(dv30VarM69572C);
                    return true;
                }
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo46686a2(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return mo36471v1(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo25223b2(i, parcel, parcel2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo25223b2(i, parcel, parcel2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo57436C(i, parcel);
            case 6:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo25223b2(i, parcel, parcel2);
            case 7:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 8:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                d1g1 d1g1Var = (d1g1) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = nmf1.f155423a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(s571.m77246e(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                qrg1 qrg1Var = d1g1Var.f44293n.f205586a;
                if (qrg1Var != null) {
                    ev61 ev61Var = d1g1Var.f44292m;
                    synchronized (qrg1Var.f191842f) {
                        qrg1Var.f191841e.remove(ev61Var);
                        break;
                    }
                    qrg1Var.m73619a().post(new tbg1(qrg1Var));
                }
                d1g1Var.f44291l.m26899h("onGetLaunchPromptFlowInfo", new Object[0]);
                PendingIntent pendingIntent = (PendingIntent) bundle2.get("confirmation_intent");
                boolean z = bundle2.getBoolean("is_cross_device_prompt_no_op");
                if (pendingIntent == null) {
                    d1g1Var.f44292m.m40098c(new CrossDevicePromptException(-100));
                } else {
                    d1g1Var.f44292m.m40099d(new g6f1(pendingIntent, z));
                }
                return true;
            case 9:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                c1g1 c1g1Var = (c1g1) this;
                vah1 vah1Var = c1g1Var.f33090l;
                ev61 ev61Var2 = c1g1Var.f33091m;
                r4g1 r4g1Var = c1g1Var.f33092n;
                if (i == 1) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i4 = omf1.f167028a;
                    Bundle bundle3 = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator2.createFromParcel(parcel));
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(s571.m77246e(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    r4g1Var.f195767b.m76290c(ev61Var2);
                    vah1Var.m85082a("onCompleteCheckAgeSignals", new Object[0]);
                    if (bundle3.containsKey("user.status")) {
                        weg1Var = new weg1(bundle3.containsKey("user.status") ? Integer.valueOf(bundle3.getInt("user.status")) : null, bundle3.containsKey("age.range.lower") ? Integer.valueOf(bundle3.getInt("age.range.lower")) : null, bundle3.containsKey("age.range.upper") ? Integer.valueOf(bundle3.getInt("age.range.upper")) : null, bundle3.containsKey("most.recent.approval.date") ? new Date(bundle3.getLong("most.recent.approval.date")) : null, bundle3.containsKey("install.id") ? bundle3.getString("install.id") : null);
                    } else {
                        weg1Var = new weg1(null, null, null, null, null);
                    }
                    ev61Var2.m40099d(weg1Var);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i5 = omf1.f167028a;
                    Bundle bundle4 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int iDataAvail3 = parcel.dataAvail();
                    if (iDataAvail3 > 0) {
                        throw new BadParcelableException(s571.m77246e(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    r4g1Var.f195767b.m76290c(ev61Var2);
                    int i6 = bundle4.getInt("error.code");
                    Object[] objArr = {Integer.valueOf(i6)};
                    vah1Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        vah1.m85081d(vah1Var.f239278b, "onError(%d)", objArr);
                    }
                    ev61Var2.m40098c(new AgeSignalsException(i6));
                }
                return true;
            case 10:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo25223b2(i, parcel, parcel2);
            case 11:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo25223b2(i, parcel, parcel2);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public abstract boolean mo36471v1(int i, Parcel parcel, Parcel parcel2);

    public kv30(String str, int i) {
        this.f126770a = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 7:
            case 8:
            case 9:
            default:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
            case 11:
                attachInterface(this, str);
                break;
        }
    }
}
