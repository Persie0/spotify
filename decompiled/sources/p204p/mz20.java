package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mz20 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148592a;

    public /* synthetic */ mz20(int i) {
        this.f148592a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [int] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r23;
        List listM69791p;
        int i = 3;
        int i2 = 2;
        switch (this.f148592a) {
            case 0:
                return new nz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                return new oz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                return new pz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new qz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new rz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new sz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 6:
                return new tz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                return new uz20(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                String string = parcel.readString();
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                CharSequence charSequence = (CharSequence) creator.createFromParcel(parcel);
                CharSequence charSequence2 = (CharSequence) creator.createFromParcel(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                c030 c030VarValueOf = c030.valueOf(parcel.readString());
                int iM62668v = mrx0.m62668v(parcel.readString());
                qsj qsjVarValueOf = qsj.valueOf(parcel.readString());
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                boolean z6 = parcel.readInt() != 0 ? true : z ? 1 : 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                    z4 = true;
                } else {
                    z3 = true;
                    z4 = z ? 1 : 0;
                }
                boolean z7 = parcel.readInt() != 0 ? z3 ? 1 : 0 : z ? 1 : 0;
                boolean z8 = parcel.readInt() != 0 ? z3 ? 1 : 0 : z;
                boolean z9 = parcel.readInt() != 0 ? z3 ? 1 : 0 : z;
                boolean z10 = parcel.readInt() != 0 ? z3 : z;
                boolean z11 = parcel.readInt() != 0 ? z3 : z;
                boolean z12 = parcel.readInt() != 0 ? z3 : z;
                boolean z13 = parcel.readInt() != 0 ? z3 : z;
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("WIDE")) {
                    r23 = z3;
                } else {
                    if (!string4.equals("NONE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.uiusecases.historyrow.HistoryRowSearch.VideoMetadataType.".concat(string4));
                    }
                    r23 = i2;
                }
                boolean z14 = parcel.readInt() != 0 ? z3 ? 1 : 0 : z;
                boolean z15 = parcel.readInt() != 0 ? z3 : z;
                boolean z16 = parcel.readInt() != 0 ? z3 : z;
                boolean z17 = z;
                if (parcel.readInt() != 0) {
                    z17 = z3;
                }
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("Original")) {
                    i2 = 1;
                } else if (!string5.equals("RestrictedWithTrackCover")) {
                    if (!string5.equals("RestrictedWithPlaceholder")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.uiusecases.historyrow.HistoryRowSearch.VideoArtworkStyle.".concat(string5));
                    }
                    i2 = 3;
                }
                return new b030(string, charSequence, charSequence2, string2, string3, c030VarValueOf, iM62668v, qsjVarValueOf, z5, z2, z6, z4, z7, z8, z9, z10, z11, z12, z13, r23, z14, z15, z16, z17, i2, parcel.readString());
            case 9:
                return new cb30(parcel.readString());
            case 10:
                return new ed30(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 11:
                return new ni30(parcel);
            case 12:
                return new cn30(parcel);
            case 13:
                jt30 jt30VarCreateFromParcel = jt30.CREATOR.createFromParcel(parcel);
                return new qo30(jt30VarCreateFromParcel.f115701a, jt30VarCreateFromParcel.f115702b, parcel.readParcelable(qo30.class.getClassLoader()), parcel.readInt() != 0);
            case 14:
                String string6 = parcel.readString();
                wj50.m88279p(string6);
                HubsImmutableComponentBundle hubsImmutableComponentBundle = (HubsImmutableComponentBundle) ((Parcelable) parcel.readTypedObject(HubsImmutableComponentBundle.CREATOR));
                ar30.Companion.getClass();
                return xq30.m91813a(string6, hubsImmutableComponentBundle);
            case 15:
                Bundle bundle = parcel.readBundle(wj30.class.getClassLoader());
                if (bundle == null || bundle.keySet().isEmpty()) {
                    return HubsImmutableComponentBundle.EMPTY;
                }
                HubsImmutableComponentBundle.Companion.getClass();
                return new HubsImmutableComponentBundle(bundle);
            case 16:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                nr30 nr30Var = or30.Companion;
                wj50.m88279p(string7);
                wj50.m88279p(string8);
                nr30Var.getClass();
                return new or30(string7, string8);
            case 17:
                Parcelable.Creator<ds30> creator2 = ds30.CREATOR;
                ds30 ds30Var = (ds30) ((Parcelable) parcel.readTypedObject(creator2));
                ds30 ds30Var2 = (ds30) ((Parcelable) parcel.readTypedObject(creator2));
                btv0 btv0VarM62558r = mqg1.m62558r(parcel, creator2);
                String string9 = parcel.readString();
                sr30.Companion.getClass();
                return pr30.m70700b(ds30Var, ds30Var2, btv0VarM62558r, string9);
            case 18:
                or30 or30Var = (or30) ((Parcelable) parcel.readTypedObject(or30.CREATOR));
                zr30 zr30Var = (zr30) ((Parcelable) parcel.readTypedObject(zr30.CREATOR));
                sr30 sr30Var = (sr30) ((Parcelable) parcel.readTypedObject(sr30.CREATOR));
                Parcelable.Creator<HubsImmutableComponentBundle> creator3 = HubsImmutableComponentBundle.CREATOR;
                HubsImmutableComponentBundle hubsImmutableComponentBundle2 = (HubsImmutableComponentBundle) ((Parcelable) parcel.readTypedObject(creator3));
                HubsImmutableComponentBundle hubsImmutableComponentBundle3 = (HubsImmutableComponentBundle) ((Parcelable) parcel.readTypedObject(creator3));
                HubsImmutableComponentBundle hubsImmutableComponentBundle4 = (HubsImmutableComponentBundle) ((Parcelable) parcel.readTypedObject(creator3));
                gs30 gs30Var = (gs30) ((Parcelable) parcel.readTypedObject(gs30.CREATOR));
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                btv0 btv0VarM62558r2 = mqg1.m62558r(parcel, ar30.CREATOR);
                pf40 pf40VarM86525z = vvx.m86525z(parcel);
                wr30.Companion.getClass();
                return tr30.m81339b(or30Var, zr30Var, sr30Var, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hubsImmutableComponentBundle4, gs30Var, string10, string11, btv0VarM62558r2, pf40VarM86525z);
            case 19:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                zr30.Companion.getClass();
                return new zr30(string12, string13, string14, string15);
            case 20:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                HubsImmutableComponentBundle hubsImmutableComponentBundle5 = (HubsImmutableComponentBundle) ((Parcelable) parcel.readTypedObject(HubsImmutableComponentBundle.CREATOR));
                ds30.Companion.getClass();
                return as30.m27054a(string16, string17, hubsImmutableComponentBundle5);
            case 21:
                String string18 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (arrayListCreateStringArrayList != null) {
                    listM69791p = pf40.m69791p(arrayListCreateStringArrayList);
                } else {
                    kf40 kf40Var = pf40.f176960b;
                    listM69791p = wsv0.f254763e;
                }
                gs30.Companion.getClass();
                return new gs30(string18, vie1.m85631m(listM69791p));
            case 22:
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                wr30 wr30Var = (wr30) ((Parcelable) parcel.readTypedObject(wr30.CREATOR));
                pf40 pf40VarM86525z2 = vvx.m86525z(parcel);
                pf40 pf40VarM86525z3 = vvx.m86525z(parcel);
                String string21 = parcel.readString();
                br30 br30Var = HubsImmutableComponentBundle.Companion;
                wj30 wj30Var = (wj30) ((Parcelable) parcel.readTypedObject(HubsImmutableComponentBundle.CREATOR));
                br30Var.getClass();
                return new ks30(string19, string20, wr30Var, pf40VarM86525z2, pf40VarM86525z3, string21, br30.m30289e(wj30Var));
            case 23:
                jt30 jt30VarCreateFromParcel2 = jt30.CREATOR.createFromParcel(parcel);
                return new ns30(jt30VarCreateFromParcel2.f115701a, jt30VarCreateFromParcel2.f115702b, parcel.readParcelable(ns30.class.getClassLoader()), parcel.readInt() != 0);
            case 24:
                return new ct30(parcel.readParcelable(dt30.class.getClassLoader()), parcel.readParcelable(dt30.class.getClassLoader()), parcel.readParcelable(dt30.class.getClassLoader()), parcel.readParcelable(dt30.class.getClassLoader()));
            case 25:
                return new jt30(parcel.readParcelable(jt30.class.getClassLoader()), parcel.readParcelable(jt30.class.getClassLoader()));
            case 26:
                return new xv30(parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                return new yv30(parcel.readString());
            case 28:
                String string22 = parcel.readString();
                if (string22 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string22.equals("PHONE_SPEAKERS")) {
                    i = 1;
                } else if (string22.equals("EXTERNAL_SPEAKER")) {
                    i = 2;
                } else if (!string22.equals("OTHER_DEVICE")) {
                    throw new IllegalArgumentException("No enum constant com.spotify.jam.features.notificationcenter.api.IPLNotificationCenter.Notification.DeviceOnboardingNudge.OutputDeviceType.".concat(string22));
                }
                return new zv30(i);
            default:
                String string23 = parcel.readString();
                if (string23 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string23.equals("DEVICE_PICKER_UPSELL_HEADER")) {
                    i = 1;
                } else if (string23.equals("JAM_QUEUE_UPSELL_HEADER")) {
                    i = 2;
                } else if (!string23.equals("DEVICE_PICKER_LEAVE_BUTTON")) {
                    if (string23.equals("JAM_QUEUE_LEAVE_BUTTON")) {
                        i = 4;
                    } else {
                        if (!string23.equals("MANAGED_PARTICIPANTS_SHEET_LEAVE_BUTTON")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.jam.features.notificationcenter.api.IPLNotificationCenter.Notification.FreeUserPremiumUpsell.Source.".concat(string23));
                        }
                        i = 5;
                    }
                }
                return new aw30(i);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f148592a) {
            case 0:
                return new nz20[i];
            case 1:
                return new oz20[i];
            case 2:
                return new pz20[i];
            case 3:
                return new qz20[i];
            case 4:
                return new rz20[i];
            case 5:
                return new sz20[i];
            case 6:
                return new tz20[i];
            case 7:
                return new uz20[i];
            case 8:
                return new b030[i];
            case 9:
                return new cb30[i];
            case 10:
                return new ed30[i];
            case 11:
                return new ni30[i];
            case 12:
                return new cn30[i];
            case 13:
                return new qo30[i];
            case 14:
                return new ar30[i];
            case 15:
                return new HubsImmutableComponentBundle[i];
            case 16:
                return new or30[i];
            case 17:
                return new sr30[i];
            case 18:
                return new wr30[i];
            case 19:
                return new zr30[i];
            case 20:
                return new ds30[i];
            case 21:
                return new gs30[i];
            case 22:
                return new ks30[i];
            case 23:
                return new ns30[i];
            case 24:
                return new ct30[i];
            case 25:
                return new jt30[i];
            case 26:
                return new xv30[i];
            case 27:
                return new yv30[i];
            case 28:
                return new zv30[i];
            default:
                return new aw30[i];
        }
    }
}
