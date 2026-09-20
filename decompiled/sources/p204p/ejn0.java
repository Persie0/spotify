package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class ejn0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60253a;

    public /* synthetic */ ejn0(int i) {
        this.f60253a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList<String> arrayList;
        boolean z;
        switch (this.f60253a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM9h = 0;
                while (iM9h != i6) {
                    iM9h = AbstractC0000a.m9h(fjn0.class, parcel, arrayList2, iM9h, 1);
                }
                return new fjn0(string, string2, opo.m67546C(arrayList2), parcel.readString(), parcel.readString(), opo.m67546C(parcel.createStringArrayList()));
            case 1:
                return new gjn0(parcel.readString(), parcel.readString());
            case 2:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("CHECK_ALT")) {
                    i = 1;
                } else if (string5.equals("UNDO")) {
                    i = 2;
                } else if (string5.equals("EXTERNAL_LINK")) {
                    i = 3;
                } else if (string5.equals("CAMERA")) {
                    i = 4;
                } else {
                    if (!string5.equals("MESSAGES")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.payment.paymentimpl.data.ResponseAction.DisplayPending.EncoreIcon.".concat(string5));
                    }
                    i = 5;
                }
                return new hjn0(string3, string4, i);
            case 3:
                return new pjn0(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            case 4:
                parcel.readInt();
                return rjn0.f199865a;
            case 5:
                return new yjn0(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new zjn0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new ikn0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 8:
                akn0 akn0Var = (akn0) parcel.readParcelable(jkn0.class.getClassLoader());
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM31715d = 0;
                while (iM31715d != i7) {
                    iM31715d = c7h0.m31715d(ikn0.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new jkn0(akn0Var, arrayList3, parcel.readString());
            case 9:
                return new cmn0(parcel.readInt());
            case 10:
                return new dmn0(parcel.readLong(), parcel.readInt() != 0);
            case 11:
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("Unspecified")) {
                    i2 = 1;
                } else if (string6.equals("OnPlatform")) {
                    i2 = 2;
                } else if (string6.equals("OffPlatform")) {
                    i2 = 3;
                } else if (string6.equals("InviteLink")) {
                    i2 = 4;
                } else {
                    if (!string6.equals("FriendRequest")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Permission.Source.".concat(string6));
                    }
                    i2 = 5;
                }
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("Unspecified")) {
                    i3 = 1;
                } else if (string7.equals("Draft")) {
                    i3 = 2;
                } else if (string7.equals("Active")) {
                    i3 = 3;
                } else if (string7.equals("Canceled")) {
                    i3 = 4;
                } else if (string7.equals("Deleted")) {
                    i3 = 5;
                } else if (string7.equals("Rejected")) {
                    i3 = 6;
                } else {
                    if (!string7.equals("Inactive")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Permission.ChatStatus.".concat(string7));
                    }
                    i3 = 7;
                }
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("Unspecified")) {
                    i4 = 1;
                } else if (string9.equals("Initiator")) {
                    i4 = 2;
                } else if (string9.equals("Accepted")) {
                    i4 = 3;
                } else if (string9.equals("Pending")) {
                    i4 = 4;
                } else if (string9.equals("Rejected")) {
                    i4 = 5;
                } else if (string9.equals("Deleted")) {
                    i4 = 6;
                } else {
                    if (!string9.equals("Left")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Permission.UserParticipationStatus.".concat(string9));
                    }
                    i4 = 7;
                }
                return new nmn0(i2, i3, i4, string8);
            case 12:
                return new tmn0(parcel.readString());
            case 13:
                return new umn0(parcel.readInt() != 0, parcel.readInt() != 0, tmn0.CREATOR.createFromParcel(parcel));
            case 14:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (string11 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string11.equals("BlockedAction")) {
                    i5 = 1;
                } else {
                    if (!string11.equals("HostPaused")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.jam.features.permissionupgrade.api.PermissionUpgradeTrigger.".concat(string11));
                    }
                    i5 = 2;
                }
                return new bon0(string10, i5);
            case 15:
                return new don0(bon0.CREATOR.createFromParcel(parcel));
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                gon0 gon0Var = new gon0();
                gon0Var.f82983a = string12;
                gon0Var.f82984b = string13;
                gon0Var.f82985c = string14;
                return gon0Var;
            case 17:
                String string15 = parcel.readString();
                int i8 = parcel.readInt();
                b221 b221Var = (b221) parcel.readParcelable(jyn0.class.getClassLoader());
                boolean z2 = false;
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                if (parcel.readInt() == 0) {
                    z3 = z2;
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    z = true;
                    arrayList = arrayListCreateStringArrayList;
                } else {
                    arrayList = arrayListCreateStringArrayList;
                    z = false;
                }
                return new jyn0(string15, i8, b221Var, z2, z3, arrayList, z);
            case 18:
                return new kyn0(parcel.readString());
            case 19:
                parcel.readInt();
                return lyn0.f138078a;
            case 20:
                return new tyn0(parcel.readString());
            case 21:
                return new uyn0((kdj) parcel.readParcelable(uyn0.class.getClassLoader()));
            case 22:
                return new vyn0(parcel.readString(), parcel.readLong());
            case 23:
                return new xyn0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new e2o0((r2o0) parcel.readParcelable(e2o0.class.getClassLoader()));
            case 25:
                return new i2o0(parcel.readString(), parcel.readString());
            case 26:
                parcel.readInt();
                return j2o0.f108114a;
            case 27:
                parcel.readInt();
                return k2o0.f118674a;
            case 28:
                return new l2o0(parcel.readInt());
            default:
                parcel.readInt();
                return m2o0.f139435a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f60253a) {
            case 0:
                return new fjn0[i];
            case 1:
                return new gjn0[i];
            case 2:
                return new hjn0[i];
            case 3:
                return new pjn0[i];
            case 4:
                return new rjn0[i];
            case 5:
                return new yjn0[i];
            case 6:
                return new zjn0[i];
            case 7:
                return new ikn0[i];
            case 8:
                return new jkn0[i];
            case 9:
                return new cmn0[i];
            case 10:
                return new dmn0[i];
            case 11:
                return new nmn0[i];
            case 12:
                return new tmn0[i];
            case 13:
                return new umn0[i];
            case 14:
                return new bon0[i];
            case 15:
                return new don0[i];
            case 16:
                return new gon0[i];
            case 17:
                return new jyn0[i];
            case 18:
                return new kyn0[i];
            case 19:
                return new lyn0[i];
            case 20:
                return new tyn0[i];
            case 21:
                return new uyn0[i];
            case 22:
                return new vyn0[i];
            case 23:
                return new xyn0[i];
            case 24:
                return new e2o0[i];
            case 25:
                return new i2o0[i];
            case 26:
                return new j2o0[i];
            case 27:
                return new k2o0[i];
            case 28:
                return new l2o0[i];
            default:
                return new m2o0[i];
        }
    }
}
