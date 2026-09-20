package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class dnj implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50847a;

    public /* synthetic */ dnj(int i) {
        this.f50847a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f50847a) {
            case 0:
                return new enj((jyn0) parcel.readParcelable(enj.class.getClassLoader()));
            case 1:
                b221 b221Var = (b221) parcel.readParcelable(fnj.class.getClassLoader());
                int iM9h = 0;
                boolean z = parcel.readInt() != 0;
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(fnj.class, parcel, arrayList, iM9h, 1);
                }
                return new fnj(b221Var, z, string, arrayListCreateStringArrayList, arrayList, parcel.readString());
            case 2:
                return new gnj(parcel.readString());
            case 3:
                return new hnj(parcel.readString(), (jyn0) parcel.readParcelable(hnj.class.getClassLoader()), parcel.readInt());
            case 4:
                return new inj(parcel.readString());
            case 5:
                return new jnj(parcel.readString());
            case 6:
                return new knj(parcel.readString(), (SearchConfiguration) parcel.readParcelable(knj.class.getClassLoader()));
            case 7:
                return new lnj(parcel.readString(), parcel.readInt(), parcel.readString());
            case 8:
                return new mnj(parcel.readString(), ln21.valueOf(parcel.readString()));
            case 9:
                return new nnj(parcel.readString());
            case 10:
                return new opj(parcel.readString(), parcel.readString());
            case 11:
                return new spj(parcel.readString(), parcel.readString());
            case 12:
                return new kqj(parcel.readString());
            case 13:
                return new lqj(parcel.readString());
            case 14:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("CIRCLE")) {
                    i = 1;
                } else {
                    if (!string3.equals("SQUARE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.allboarding.uiusecases.contentstack.ContentStackElement.Shape.".concat(string3));
                    }
                    i = 2;
                }
                return new puj(string2, i);
            case 15:
                return new n0k(parcel.readString(), parcel.readString());
            case 16:
                return new o0k(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                parcel.readInt();
                return z5k.f279586a;
            case 18:
                parcel.readInt();
                return a6k.f12813a;
            case 19:
                return new k6k(parcel.readString(), (m6k) parcel.readParcelable(k6k.class.getClassLoader()), (voc1) parcel.readParcelable(k6k.class.getClassLoader()));
            case 20:
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM9h2 = 0;
                while (iM9h2 != i5) {
                    iM9h2 = AbstractC0000a.m9h(l6k.class, parcel, arrayList2, iM9h2, 1);
                }
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int iM9h3 = 0;
                while (iM9h3 != i6) {
                    iM9h3 = AbstractC0000a.m9h(l6k.class, parcel, arrayList3, iM9h3, 1);
                }
                return new l6k(i4, string4, string5, string6, arrayList2, arrayList3, parcel.readInt() != 0, parcel.readInt() != 0);
            case 21:
                return new z6k(parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                pla1 pla1VarCreateFromParcel = pla1.CREATOR.createFromParcel(parcel);
                long j = parcel.readLong();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                fej fejVar = (fej) parcel.readParcelable(pck.class.getClassLoader());
                nck nckVar = (nck) parcel.readParcelable(pck.class.getClassLoader());
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                int iM31715d = 0;
                while (iM31715d != i7) {
                    iM31715d = c7h0.m31715d(pcu0.CREATOR, parcel, arrayList4, iM31715d, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                int iM31715d2 = 0;
                while (iM31715d2 != i8) {
                    iM31715d2 = c7h0.m31715d(czu0.CREATOR, parcel, arrayList5, iM31715d2, 1);
                }
                return new pck(string7, string8, pla1VarCreateFromParcel, j, z2, fejVar, nckVar, arrayList4, arrayList5, (ick) parcel.readParcelable(pck.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : zi2.CREATOR.createFromParcel(parcel));
            case 23:
                parcel.readInt();
                return cck.f36423a;
            case 24:
                parcel.readInt();
                return dck.f47573a;
            case 25:
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("UNSPECIFIED")) {
                    i2 = 1;
                } else if (string9.equals("PAIRING_NEEDED")) {
                    i2 = 2;
                } else {
                    if (!string9.equals("RE_PAIRING_NEEDED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Contribution.ModerationStatus.HiddenReason.".concat(string9));
                    }
                    i2 = 3;
                }
                return new eck(i2);
            case 26:
                parcel.readInt();
                return fck.f68135a;
            case 27:
                return new gck(parcel.readLong());
            case 28:
                return new hck(parcel.readLong());
            default:
                return new jck(parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f50847a) {
            case 0:
                return new enj[i];
            case 1:
                return new fnj[i];
            case 2:
                return new gnj[i];
            case 3:
                return new hnj[i];
            case 4:
                return new inj[i];
            case 5:
                return new jnj[i];
            case 6:
                return new knj[i];
            case 7:
                return new lnj[i];
            case 8:
                return new mnj[i];
            case 9:
                return new nnj[i];
            case 10:
                return new opj[i];
            case 11:
                return new spj[i];
            case 12:
                return new kqj[i];
            case 13:
                return new lqj[i];
            case 14:
                return new puj[i];
            case 15:
                return new n0k[i];
            case 16:
                return new o0k[i];
            case 17:
                return new z5k[i];
            case 18:
                return new a6k[i];
            case 19:
                return new k6k[i];
            case 20:
                return new l6k[i];
            case 21:
                return new z6k[i];
            case 22:
                return new pck[i];
            case 23:
                return new cck[i];
            case 24:
                return new dck[i];
            case 25:
                return new eck[i];
            case 26:
                return new fck[i];
            case 27:
                return new gck[i];
            case 28:
                return new hck[i];
            default:
                return new jck[i];
        }
    }
}
