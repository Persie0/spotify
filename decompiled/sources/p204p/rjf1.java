package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class rjf1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final a201 f199826l;

    /* JADX INFO: renamed from: m */
    public final Class f199827m;

    public rjf1(a201 a201Var) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 3);
        this.f199826l = a201Var;
        this.f199827m = obc.class;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        Class cls = this.f199827m;
        a201 a201Var = this.f199826l;
        switch (i) {
            case 1:
                imk0 imk0Var = new imk0(a201Var);
                parcel2.writeNoException();
                fmf1.m42108c(parcel2, imk0Var);
                return true;
            case 2:
                tv30 tv30VarM51105c2 = imk0.m51105c2(parcel.readStrongBinder());
                fmf1.m42109d(parcel);
                axz0 axz0Var = (axz0) imk0.m51106d2(tv30VarM51105c2);
                if (cls.isInstance(axz0Var) && a201Var != null) {
                    a201Var.mo24471b((axz0) cls.cast(axz0Var));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                tv30 tv30VarM51105c3 = imk0.m51105c2(parcel.readStrongBinder());
                String string = parcel.readString();
                fmf1.m42109d(parcel);
                axz0 axz0Var2 = (axz0) imk0.m51106d2(tv30VarM51105c3);
                if (cls.isInstance(axz0Var2) && a201Var != null) {
                    a201Var.mo24477h((axz0) cls.cast(axz0Var2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                tv30 tv30VarM51105c4 = imk0.m51105c2(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                fmf1.m42109d(parcel);
                axz0 axz0Var3 = (axz0) imk0.m51106d2(tv30VarM51105c4);
                if (cls.isInstance(axz0Var3) && a201Var != null) {
                    a201Var.mo24472c((axz0) cls.cast(axz0Var3), i2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                tv30 tv30VarM51105c5 = imk0.m51105c2(parcel.readStrongBinder());
                fmf1.m42109d(parcel);
                axz0 axz0Var4 = (axz0) imk0.m51106d2(tv30VarM51105c5);
                if (cls.isInstance(axz0Var4) && a201Var != null) {
                    a201Var.mo24473d((axz0) cls.cast(axz0Var4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                tv30 tv30VarM51105c6 = imk0.m51105c2(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                fmf1.m42109d(parcel);
                axz0 axz0Var5 = (axz0) imk0.m51106d2(tv30VarM51105c6);
                if (cls.isInstance(axz0Var5) && a201Var != null) {
                    a201Var.mo24470a((axz0) cls.cast(axz0Var5), i3);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                tv30 tv30VarM51105c7 = imk0.m51105c2(parcel.readStrongBinder());
                String string2 = parcel.readString();
                fmf1.m42109d(parcel);
                axz0 axz0Var6 = (axz0) imk0.m51106d2(tv30VarM51105c7);
                if (cls.isInstance(axz0Var6) && a201Var != null) {
                    a201Var.mo24474e((axz0) cls.cast(axz0Var6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                tv30 tv30VarM51105c8 = imk0.m51105c2(parcel.readStrongBinder());
                int i4 = fmf1.f71041a;
                boolean z = parcel.readInt() != 0;
                fmf1.m42109d(parcel);
                axz0 axz0Var7 = (axz0) imk0.m51106d2(tv30VarM51105c8);
                if (cls.isInstance(axz0Var7) && a201Var != null) {
                    a201Var.mo24475f((axz0) cls.cast(axz0Var7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                tv30 tv30VarM51105c9 = imk0.m51105c2(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                fmf1.m42109d(parcel);
                axz0 axz0Var8 = (axz0) imk0.m51106d2(tv30VarM51105c9);
                if (cls.isInstance(axz0Var8) && a201Var != null) {
                    a201Var.mo24476g((axz0) cls.cast(axz0Var8), i5);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                tv30 tv30VarM51105c10 = imk0.m51105c2(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                fmf1.m42109d(parcel);
                axz0 axz0Var9 = (axz0) imk0.m51106d2(tv30VarM51105c10);
                if (cls.isInstance(axz0Var9) && a201Var != null) {
                    a201Var.mo24478i((axz0) cls.cast(axz0Var9), i6);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
