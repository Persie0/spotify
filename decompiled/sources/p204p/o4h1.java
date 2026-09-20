package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class o4h1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ obc f161673l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4h1(obc obcVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 3);
        this.f161673l = obcVar;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        obc obcVar = this.f161673l;
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            fmf1.m42109d(parcel);
            lkf1 lkf1Var = obcVar.f163606i;
            if (lkf1Var != null && lkf1Var.m59260k()) {
                obcVar.f163606i.m59270u(string, string2).mo1510b(new dxc1(this, 12));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String string3 = parcel.readString();
            kn70 kn70Var = (kn70) fmf1.m42106a(parcel, kn70.CREATOR);
            fmf1.m42109d(parcel);
            lkf1 lkf1Var2 = obcVar.f163606i;
            if (lkf1Var2 != null && lkf1Var2.m59260k()) {
                obcVar.f163606i.m59266q(string3, kn70Var).mo1510b(new py51(this, 24));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            String string4 = parcel.readString();
            fmf1.m42109d(parcel);
            lkf1 lkf1Var3 = obcVar.f163606i;
            if (lkf1Var3 != null && lkf1Var3.m59260k()) {
                obcVar.f163606i.m59267r(string4);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        int i2 = parcel.readInt();
        fmf1.m42109d(parcel);
        obcVar.m66640f(i2);
        parcel2.writeNoException();
        return true;
    }
}
