package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class ama0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17075a;

    public /* synthetic */ ama0(int i) {
        this.f17075a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        int i;
        Boolean boolValueOf2;
        int i2;
        int i3;
        Boolean boolValueOf3;
        switch (this.f17075a) {
            case 0:
                return new bma0(parcel.readString(), parcel.readInt() != 0);
            case 1:
                return new qta0(parcel.readString(), (eg7) parcel.readParcelable(qta0.class.getClassLoader()));
            case 2:
                return new yta0((xta0) parcel.readParcelable(yta0.class.getClassLoader()));
            case 3:
                parcel.readInt();
                return sta0.f213877a;
            case 4:
                return new tta0(parcel.readString());
            case 5:
                parcel.readInt();
                return uta0.f233861a;
            case 6:
                parcel.readInt();
                return vta0.f244594a;
            case 7:
                parcel.readInt();
                return wta0.f254901a;
            case 8:
                return new dua0((cua0) parcel.readParcelable(dua0.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return zta0.f286120a;
            case 10:
                return new aua0(parcel.readString());
            case 11:
                parcel.readInt();
                return bua0.f31071a;
            case 12:
                return new eua0(parcel.readString(), parcel.readString());
            case 13:
                String string = parcel.readString();
                String string2 = parcel.readString();
                tyv tyvVar = (tyv) parcel.readParcelable(uva0.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new uva0(string, string2, tyvVar, boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (voc1) parcel.readParcelable(uva0.class.getClassLoader()), (voc1) parcel.readParcelable(uva0.class.getClassLoader()));
            case 14:
                String string3 = parcel.readString();
                tyv tyvVar2 = (tyv) parcel.readParcelable(yva0.class.getClassLoader());
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("NONE")) {
                    i = 1;
                } else {
                    if (!string4.equals("QUICKSILVER")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.genalpha.loginchoice.page.LoginChoiceEntrySource.".concat(string4));
                    }
                    i = 2;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new yva0(string3, tyvVar2, i, boolValueOf2);
            case 15:
                cwa0 cwa0Var = new cwa0();
                cwa0Var.f42675b = -1;
                Parcelable[] parcelableArray = parcel.readParcelableArray(bza0.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = parcelableArray.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        cwa0Var.f42674a = (bza0[]) arrayList.toArray(new bza0[0]);
                        cwa0Var.f42675b = parcel.readInt();
                        cwa0Var.f42680g = (awa0) parcel.readParcelable(awa0.class.getClassLoader());
                        HashMap mapM63348G = n0b1.m63348G(parcel);
                        cwa0Var.f42681h = mapM63348G != null ? new LinkedHashMap(mapM63348G) : null;
                        HashMap mapM63348G2 = n0b1.m63348G(parcel);
                        cwa0Var.f42682i = mapM63348G2 != null ? new LinkedHashMap(mapM63348G2) : null;
                        return cwa0Var;
                    }
                    Parcelable parcelable = parcelableArray[i4];
                    bza0 bza0Var = parcelable instanceof bza0 ? (bza0) parcelable : null;
                    if (bza0Var != null) {
                        bza0Var.f32447b = cwa0Var;
                    }
                    if (bza0Var != null) {
                        arrayList.add(bza0Var);
                    }
                    i4++;
                }
                break;
            case 16:
                return new awa0(parcel);
            case 17:
                return new bwa0(parcel);
            case 18:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                tyv tyvVar3 = (tyv) parcel.readParcelable(axa0.class.getClassLoader());
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Intent intent = (Intent) parcel.readParcelable(axa0.class.getClassLoader());
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("READY")) {
                    i2 = 1;
                } else {
                    if (!string7.equals("LOADING")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.genalpha.logincurrentdevice.page.mobius.LoginCurrentDeviceModel.Status.".concat(string7));
                    }
                    i2 = 2;
                }
                int i5 = i2;
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("NONE")) {
                    i3 = 1;
                } else if (string8.equals("LOGIN_FAILED")) {
                    i3 = 2;
                } else {
                    if (!string8.equals("UPGRADE_REQUIRED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.genalpha.logincurrentdevice.page.mobius.LoginCurrentDeviceModel.ErrorType.".concat(string8));
                    }
                    i3 = 3;
                }
                int i6 = i3;
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new axa0(string5, string6, tyvVar3, numValueOf, intent, i5, i6, z, parcel.readInt() != 0);
            case 19:
                return new mxa0(parcel.readString(), (tyv) parcel.readParcelable(mxa0.class.getClassLoader()));
            case 20:
                return new aya0(parcel.readString(), parcel.readString(), parcel.readString(), (tyv) parcel.readParcelable(aya0.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), qrv0.valueOf(parcel.readString()));
            case 21:
                String string9 = parcel.readString();
                tyv tyvVar4 = (tyv) parcel.readParcelable(iya0.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new iya0(string9, tyvVar4, boolValueOf3);
            case 22:
                return new wya0(cyz0.CREATOR.createFromParcel(parcel));
            case 23:
                return new cza0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new f0b0(parcel.readString());
            case 25:
                return new g0b0(parcel.readString(), parcel.readString());
            case 26:
                return new h0b0(parcel.readString(), parcel.readString());
            case 27:
                parcel.readInt();
                return i0b0.f97198a;
            case 28:
                return new j0b0(parcel.readString(), parcel.readString());
            default:
                return new k0b0(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f17075a) {
            case 0:
                return new bma0[i];
            case 1:
                return new qta0[i];
            case 2:
                return new yta0[i];
            case 3:
                return new sta0[i];
            case 4:
                return new tta0[i];
            case 5:
                return new uta0[i];
            case 6:
                return new vta0[i];
            case 7:
                return new wta0[i];
            case 8:
                return new dua0[i];
            case 9:
                return new zta0[i];
            case 10:
                return new aua0[i];
            case 11:
                return new bua0[i];
            case 12:
                return new eua0[i];
            case 13:
                return new uva0[i];
            case 14:
                return new yva0[i];
            case 15:
                return new cwa0[i];
            case 16:
                return new awa0[i];
            case 17:
                return new bwa0[i];
            case 18:
                return new axa0[i];
            case 19:
                return new mxa0[i];
            case 20:
                return new aya0[i];
            case 21:
                return new iya0[i];
            case 22:
                return new wya0[i];
            case 23:
                return new cza0[i];
            case 24:
                return new f0b0[i];
            case 25:
                return new g0b0[i];
            case 26:
                return new h0b0[i];
            case 27:
                return new i0b0[i];
            case 28:
                return new j0b0[i];
            default:
                return new k0b0[i];
        }
    }
}
