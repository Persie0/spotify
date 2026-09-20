package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Any;

/* JADX INFO: loaded from: classes4.dex */
public final class zt1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286035a;

    public /* synthetic */ zt1(int i) {
        this.f286035a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        byte[] bArrCreateByteArray;
        switch (this.f286035a) {
            case 0:
                return new au1((i490) parcel.readParcelable(au1.class.getClassLoader()));
            case 1:
                parcel.readInt();
                return bu1.f30982a;
            case 2:
                return new cu1(j891.CREATOR.createFromParcel(parcel));
            case 3:
                return new fu1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new vu1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new ev1((agw) parcel.readParcelable(ev1.class.getClassLoader()));
            case 6:
                return new fv1(rvc.CREATOR.createFromParcel(parcel));
            case 7:
                int iM42454E = fr0.m42454E(parcel.readString());
                int iM42453D = fr0.m42453D(parcel.readString());
                yw1 yw1VarCreateFromParcel = parcel.readInt() == 0 ? null : yw1.CREATOR.createFromParcel(parcel);
                return new ow1(iM42454E, iM42453D, yw1VarCreateFromParcel != null ? yw1VarCreateFromParcel.f276821a : null, parcel.readString(), parcel.readString());
            case 8:
                int iM42454E2 = fr0.m42454E(parcel.readString());
                int iM42453D2 = fr0.m42453D(parcel.readString());
                Any anyM1911t = null;
                yw1 yw1VarCreateFromParcel2 = parcel.readInt() == 0 ? null : yw1.CREATOR.createFromParcel(parcel);
                String str = yw1VarCreateFromParcel2 != null ? yw1VarCreateFromParcel2.f276821a : null;
                if (parcel.readByte() != 0 && (bArrCreateByteArray = parcel.createByteArray()) != null) {
                    try {
                        anyM1911t = Any.m1911t(bArrCreateByteArray);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return new pw1(iM42454E2, iM42453D2, str, anyM1911t);
            case 9:
                return new yw1(parcel.readString());
            case 10:
                return new k02(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                j12 j12Var = new j12(parcel);
                j12Var.f107596a = g0m0.f75396b;
                int i = parcel.readInt();
                j12Var.f107596a = (g0m0) (i == -1 ? null : ((Enum[]) g0m0.class.getEnumConstants())[i]);
                j12Var.f107597b = parcel.readInt() != 0;
                return j12Var;
            case 12:
                return new b52(parcel.readString(), parcel.readBundle(b52.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return l52.f129800a;
            case 14:
                return new m52(parcel.readInt());
            case 15:
                return new n52(parcel.readInt());
            case 16:
                return new v52((k92) parcel.readParcelable(v52.class.getClassLoader()), (Intent) parcel.readParcelable(v52.class.getClassLoader()));
            case 17:
                return new l62((k92) parcel.readParcelable(l62.class.getClassLoader()), (Intent) parcel.readParcelable(l62.class.getClassLoader()));
            case 18:
                return new u82(parcel.readInt() != 0);
            case 19:
                parcel.readInt();
                return w82.f248825a;
            case 20:
                return new x82(parcel.readInt());
            case 21:
                parcel.readInt();
                return e92.f57331a;
            case 22:
                return new f92(parcel.readString(), parcel.readBundle(f92.class.getClassLoader()));
            case 23:
                return new i92((o52) parcel.readParcelable(i92.class.getClassLoader()));
            case 24:
                parcel.readInt();
                return j92.f110078b;
            case 25:
                return new u92(zr9.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 26:
                return new w92(zr9.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            case 27:
                return new ib2(parcel.readString(), parcel.readInt());
            case 28:
                return new jb2(parcel.readInt());
            default:
                parcel.readInt();
                return kb2.f121033a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f286035a) {
            case 0:
                return new au1[i];
            case 1:
                return new bu1[i];
            case 2:
                return new cu1[i];
            case 3:
                return new fu1[i];
            case 4:
                return new vu1[i];
            case 5:
                return new ev1[i];
            case 6:
                return new fv1[i];
            case 7:
                return new ow1[i];
            case 8:
                return new pw1[i];
            case 9:
                return new yw1[i];
            case 10:
                return new k02[i];
            case 11:
                return new j12[i];
            case 12:
                return new b52[i];
            case 13:
                return new l52[i];
            case 14:
                return new m52[i];
            case 15:
                return new n52[i];
            case 16:
                return new v52[i];
            case 17:
                return new l62[i];
            case 18:
                return new u82[i];
            case 19:
                return new w82[i];
            case 20:
                return new x82[i];
            case 21:
                return new e92[i];
            case 22:
                return new f92[i];
            case 23:
                return new i92[i];
            case 24:
                return new j92[i];
            case 25:
                return new u92[i];
            case 26:
                return new w92[i];
            case 27:
                return new ib2[i];
            case 28:
                return new jb2[i];
            default:
                return new kb2[i];
        }
    }
}
