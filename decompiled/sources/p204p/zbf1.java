package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zbf1 extends kv30 implements ycf1 {
    public zbf1() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 3);
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                fmf1.m42109d(parcel);
                zzb(i2);
                return true;
            case 2:
                lg5 lg5Var = (lg5) fmf1.m42106a(parcel, lg5.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                fmf1.m42109d(parcel);
                mo41920B1(lg5Var, string, string2, z);
                return true;
            case 3:
                int i3 = parcel.readInt();
                fmf1.m42109d(parcel);
                zzf(i3);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i4 = fmf1.f71041a;
                parcel.readInt();
                fmf1.m42109d(parcel);
                mo41923T();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                fmf1.m42109d(parcel);
                mo41921K0(string3, string4);
                return true;
            case 6:
                String string5 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                fmf1.m42109d(parcel);
                mo41927s(string5, bArrCreateByteArray);
                return true;
            case 7:
                int i5 = parcel.readInt();
                fmf1.m42109d(parcel);
                zzh(i5);
                return true;
            case 8:
                int i6 = parcel.readInt();
                fmf1.m42109d(parcel);
                zzg(i6);
                return true;
            case 9:
                int i7 = parcel.readInt();
                fmf1.m42109d(parcel);
                mo41925g0(i7);
                return true;
            case 10:
                parcel.readString();
                long j = parcel.readLong();
                int i8 = parcel.readInt();
                fmf1.m42109d(parcel);
                mo41919A1(i8, j);
                return true;
            case 11:
                parcel.readString();
                long j2 = parcel.readLong();
                fmf1.m42109d(parcel);
                mo41924V1(j2);
                return true;
            case 12:
                l6f1 l6f1Var = (l6f1) fmf1.m42106a(parcel, l6f1.CREATOR);
                fmf1.m42109d(parcel);
                mo41928u0(l6f1Var);
                return true;
            case 13:
                g8f1 g8f1Var = (g8f1) fmf1.m42106a(parcel, g8f1.CREATOR);
                fmf1.m42109d(parcel);
                mo41926k0(g8f1Var);
                return true;
            case 14:
                int i9 = parcel.readInt();
                fmf1.m42109d(parcel);
                mo41922P(i9);
                return true;
            case 15:
                int i10 = parcel.readInt();
                fmf1.m42109d(parcel);
                zzd(i10);
                return true;
            default:
                return false;
        }
    }
}
