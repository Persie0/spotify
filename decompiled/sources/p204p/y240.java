package p204p;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class y240 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268452a;

    public /* synthetic */ y240(int i) {
        this.f268452a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kbm0 kbm0Var;
        switch (this.f268452a) {
            case 0:
                return new d340(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 1:
                return new h340(parcel.readInt(), parcel.readInt(), (ra6) parcel.readParcelable(h340.class.getClassLoader()));
            case 2:
                return new a540(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0, parcel.readString());
            case 3:
                return new l640(parcel.readString(), parcel.readString());
            case 4:
                return new y840(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 5:
                return new a940(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 6:
                return new v940(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 7:
                return new w940(parcel.readString(), parcel.readString(), parcel.readInt());
            case 8:
                return new fa40(parcel.readInt() != 0, parcel.readInt() != 0);
            case 9:
                return new ga40(parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                return new gc40(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            case 11:
                return new sc40(parcel.readString());
            case 12:
                return new tc40(parcel.readString());
            case 13:
                return new ij40(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new um40(parcel.readString(), parcel.readString());
            case 15:
                return new vm40(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 16:
                parcel.readInt();
                return eu40.f62869a;
            case 17:
                return new vw40(parcel.readString());
            case 18:
                return new ww40(parcel.readInt(), parcel.readString());
            case 19:
                return new xw40(parcel.readString());
            case 20:
                return new yw40(parcel.readString(), parcel.readString());
            case 21:
                return new zw40(parcel.readString());
            case 22:
                fuz0 fuz0Var = (fuz0) parcel.readParcelable(gy40.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                String string3 = parcel.readString();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(gy40.class, parcel, arrayList, iM9h, 1);
                }
                return new gy40(fuz0Var, string, string2, i, string3, i2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                return new hy40(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 24:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                Parcelable.Creator<hy40> creator = hy40.CREATOR;
                return new iy40(i4, i5, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt());
            case 25:
                return new jy40(ky40.valueOf(parcel.readString()), gy40.CREATOR.createFromParcel(parcel), iy40.CREATOR.createFromParcel(parcel), parcel.readString());
            case 26:
                return new sz40(parcel);
            case 27:
                return new g150(zbv.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 28:
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                wj50.m88279p(parcelable);
                return new x550((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            default:
                y650 y650Var = z650.Companion;
                String string4 = parcel.readString();
                if (string4 == null) {
                    string4 = "";
                }
                y650Var.getClass();
                z650 z650Var = new z650(string4);
                String string5 = parcel.readString();
                if (string5 != null) {
                    kbm0.Companion.getClass();
                    kbm0Var = new kbm0(string5);
                } else {
                    kbm0Var = null;
                }
                boolean z = parcel.readInt() == 1;
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                Object value = parcel.readValue(Integer.TYPE.getClassLoader());
                Integer num = value instanceof Integer ? (Integer) value : null;
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                Serializable serializable = parcel.readSerializable();
                gt91 gt91Var = serializable instanceof gt91 ? (gt91) serializable : null;
                if (gt91Var == null) {
                    gt91.Companion.getClass();
                    gt91Var = gt91.f84115e;
                }
                return new d850(z650Var, kbm0Var, z, j, j2, num, gt91Var, string6, string7, string8);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f268452a) {
            case 0:
                return new d340[i];
            case 1:
                return new h340[i];
            case 2:
                return new a540[i];
            case 3:
                return new l640[i];
            case 4:
                return new y840[i];
            case 5:
                return new a940[i];
            case 6:
                return new v940[i];
            case 7:
                return new w940[i];
            case 8:
                return new fa40[i];
            case 9:
                return new ga40[i];
            case 10:
                return new gc40[i];
            case 11:
                return new sc40[i];
            case 12:
                return new tc40[i];
            case 13:
                return new ij40[i];
            case 14:
                return new um40[i];
            case 15:
                return new vm40[i];
            case 16:
                return new eu40[i];
            case 17:
                return new vw40[i];
            case 18:
                return new ww40[i];
            case 19:
                return new xw40[i];
            case 20:
                return new yw40[i];
            case 21:
                return new zw40[i];
            case 22:
                return new gy40[i];
            case 23:
                return new hy40[i];
            case 24:
                return new iy40[i];
            case 25:
                return new jy40[i];
            case 26:
                return new sz40[i];
            case 27:
                return new g150[i];
            case 28:
                return new x550[i];
            default:
                return new d850[i];
        }
    }
}
