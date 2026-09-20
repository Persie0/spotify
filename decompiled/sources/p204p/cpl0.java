package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.spotify.notifications.models.preferences.OptOutRecord;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class cpl0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40577a;

    public /* synthetic */ cpl0(int i) {
        this.f40577a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f40577a) {
            case 0:
                return new dpl0(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 1:
                return new zrl0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                return new OptOutRecord(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 3:
                oe70 oe70VarCreateFromParcel = oe70.CREATOR.createFromParcel(parcel);
                xi3 xi3VarValueOf = xi3.valueOf(parcel.readString());
                wr31 wr31VarValueOf = wr31.valueOf(parcel.readString());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (true) {
                    if (iM9h == i2) {
                        return new gvl0(oe70VarCreateFromParcel, xi3VarValueOf, wr31VarValueOf, arrayList, (ibj) parcel.readParcelable(gvl0.class.getClassLoader()), parcel.readInt() != 0);
                    }
                    iM9h = AbstractC0000a.m9h(gvl0.class, parcel, arrayList, iM9h, 1);
                }
                break;
            case 4:
                return new txl0(parcel.readString(), parcel.readString());
            case 5:
                return new rzl0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readDouble(), parcel.readDouble());
            case 6:
                m0m0 m0m0Var = new m0m0(parcel);
                m0m0Var.f138701a = g0m0.f75396b;
                int i3 = parcel.readInt();
                m0m0Var.f138701a = (g0m0) (i3 == -1 ? null : ((Enum[]) g0m0.class.getEnumConstants())[i3]);
                m0m0Var.f138702b = parcel.readInt() != 0;
                return m0m0Var;
            case 7:
                return new m1m0((Class) parcel.readSerializable(), parcel.readBundle(m1m0.class.getClassLoader()), (h600) parcel.readParcelable(m1m0.class.getClassLoader()));
            case 8:
                return new n1m0((Class) parcel.readSerializable(), parcel.readBundle(n1m0.class.getClassLoader()), (h600) parcel.readParcelable(n1m0.class.getClassLoader()));
            case 9:
                return new v2m0(parcel.readString(), parcel.readString());
            case 10:
                return new qbm0(parcel.readString(), (cbm0) parcel.readSerializable(), parcel.readString(), (d850) parcel.readParcelable(qbm0.class.getClassLoader()), parcel.readString());
            case 11:
                return new gdm0(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new rnm0(z2c.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 13:
                return new cpm0(parcel.readInt(), parcel.readInt());
            case 14:
                return new gpm0(parcel.readInt(), parcel.readInt());
            case 15:
                return new npm0(parcel.readInt() != 0, parcel.readString());
            case 16:
                parcel.readInt();
                return kpm0.f125090a;
            case 17:
                return new lpm0(parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new lqm0(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                return new zrm0(parcel.readString(), parcel.readString());
            case 20:
                return new asm0(parcel.readString(), parcel.readString());
            case 21:
                return new ism0(parcel.readString());
            case 22:
                float f = parcel.readFloat();
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("PX")) {
                    i = 1;
                } else if (string.equals("DP")) {
                    i = 2;
                } else {
                    if (!string.equals("SP")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campaigns.paragraph.view.ParagraphView.Metric.".concat(string));
                    }
                    i = 3;
                }
                return new xsm0(f, i);
            case 23:
                atm0 atm0VarCreateFromParcel = atm0.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(atm0.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new ysm0(atm0VarCreateFromParcel, arrayList2);
            case 24:
                return new atm0(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : xsm0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : xsm0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 25:
                return new ParcelImpl(parcel);
            case 26:
                return new gum0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                return new hum0(b281.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 28:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(zum0.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new ium0(string2, string3, arrayList3);
            default:
                String string4 = parcel.readString();
                d510 d510Var = (d510) parcel.readParcelable(mum0.class.getClassLoader());
                klo kloVarCreateFromParcel = parcel.readInt() == 0 ? null : klo.CREATOR.createFromParcel(parcel);
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM9h2 = 0;
                while (iM9h2 != i6) {
                    iM9h2 = AbstractC0000a.m9h(mum0.class, parcel, arrayList4, iM9h2, 1);
                }
                return new mum0(string4, d510Var, kloVarCreateFromParcel, arrayList4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f40577a) {
            case 0:
                return new dpl0[i];
            case 1:
                return new zrl0[i];
            case 2:
                return new OptOutRecord[i];
            case 3:
                return new gvl0[i];
            case 4:
                return new txl0[i];
            case 5:
                return new rzl0[i];
            case 6:
                return new m0m0[i];
            case 7:
                return new m1m0[i];
            case 8:
                return new n1m0[i];
            case 9:
                return new v2m0[i];
            case 10:
                return new qbm0[i];
            case 11:
                return new gdm0[i];
            case 12:
                return new rnm0[i];
            case 13:
                return new cpm0[i];
            case 14:
                return new gpm0[i];
            case 15:
                return new npm0[i];
            case 16:
                return new kpm0[i];
            case 17:
                return new lpm0[i];
            case 18:
                return new lqm0[i];
            case 19:
                return new zrm0[i];
            case 20:
                return new asm0[i];
            case 21:
                return new ism0[i];
            case 22:
                return new xsm0[i];
            case 23:
                return new ysm0[i];
            case 24:
                return new atm0[i];
            case 25:
                return new ParcelImpl[i];
            case 26:
                return new gum0[i];
            case 27:
                return new hum0[i];
            case 28:
                return new ium0[i];
            default:
                return new mum0[i];
        }
    }
}
