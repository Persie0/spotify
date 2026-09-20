package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k700 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119893a;

    public /* synthetic */ k700(int i) {
        this.f119893a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f119893a) {
            case 0:
                l700 l700Var = new l700();
                l700Var.f130523e = null;
                l700Var.f130524f = new ArrayList();
                l700Var.f130525g = new ArrayList();
                l700Var.f130519a = parcel.createStringArrayList();
                l700Var.f130520b = parcel.createStringArrayList();
                l700Var.f130521c = (zi8[]) parcel.createTypedArray(zi8.CREATOR);
                l700Var.f130522d = parcel.readInt();
                l700Var.f130523e = parcel.readString();
                l700Var.f130524f = parcel.createStringArrayList();
                l700Var.f130525g = parcel.createTypedArrayList(dj8.CREATOR);
                l700Var.f130526h = parcel.createTypedArrayList(v600.CREATOR);
                return l700Var;
            case 1:
                return new cc00(parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                Parcelable.Creator<r7y> creator = r7y.CREATOR;
                return new pc00(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 3:
                return new rc00(pc00.CREATOR.createFromParcel(parcel));
            case 4:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                voc1 voc1Var = (voc1) parcel.readParcelable(md00.class.getClassLoader());
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("FRIEND")) {
                    i = 1;
                } else if (string5.equals("INVITED_FRIEND")) {
                    i = 2;
                } else {
                    if (!string5.equals("SUGGESTED_FRIEND")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.profile.contextmenu.FriendContextMenuParameters.Type.".concat(string5));
                    }
                    i = 3;
                }
                return new md00(string, string2, string3, string4, voc1Var, i);
            case 5:
                return new re00((lu01) parcel.readParcelable(re00.class.getClassLoader()), (gcr0) parcel.readParcelable(re00.class.getClassLoader()), (gcr0) parcel.readParcelable(re00.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(re00.class.getClassLoader()), (xr01) parcel.readParcelable(re00.class.getClassLoader()), (ck01) parcel.readParcelable(re00.class.getClassLoader()), null);
            case 6:
                return new we00((gcr0) parcel.readParcelable(we00.class.getClassLoader()), (gcr0) parcel.readParcelable(we00.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(we00.class.getClassLoader()));
            case 7:
                return new mg00((MessageResponseToken) parcel.readParcelable(mg00.class.getClassLoader()));
            case 8:
                return new xj00(parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                return new mk00(parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? p68.CREATOR.createFromParcel(parcel) : null);
            case 10:
                return new nk00(pk00.valueOf(parcel.readString()));
            case 11:
                nk00 nk00VarCreateFromParcel = nk00.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<p68> creator2 = p68.CREATOR;
                return new ok00(nk00VarCreateFromParcel, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel));
            case 12:
                return ql00.valueOf(parcel.readString());
            case 13:
                String string6 = parcel.readString();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("IMAGE")) {
                    i2 = 1;
                } else {
                    if (!string7.equals("VIDEO")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.chatcontributionmediagallerypage.GalleryMediaType.".concat(string7));
                    }
                    i2 = 2;
                }
                return new sl00(i3, i4, i2, parcel.readLong(), string6, parcel.readString());
            case 14:
                return new eo00(parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                return new fq00(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return hq00.valueOf(parcel.readString());
            case 17:
                return new xs00(parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new lw00((kw00) parcel.readParcelable(lw00.class.getClassLoader()), hw00.CREATOR.createFromParcel(parcel));
            case 19:
                return fw00.valueOf(parcel.readString());
            case 20:
                return hw00.valueOf(parcel.readString());
            case 21:
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iM31715d = 0;
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(fw00.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new iw00(arrayList);
            case 22:
                parcel.readInt();
                return jw00.f116551a;
            case 23:
                return new bz00((az00) parcel.readParcelable(bz00.class.getClassLoader()));
            case 24:
                return new yy00(parcel.readString());
            case 25:
                return new zy00(parcel.readString());
            case 26:
                parcel.readInt();
                return iz00.f107098a;
            case 27:
                parcel.readInt();
                return jz00.f117531a;
            case 28:
                wz00 wz00Var = (wz00) parcel.readParcelable(xz00.class.getClassLoader());
                boolean z = false;
                boolean z2 = true;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new xz00(wz00Var, z3, z, z2, parcel.readInt() != 0);
            default:
                parcel.readInt();
                return pz00.f183564a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f119893a) {
            case 0:
                return new l700[i];
            case 1:
                return new cc00[i];
            case 2:
                return new pc00[i];
            case 3:
                return new rc00[i];
            case 4:
                return new md00[i];
            case 5:
                return new re00[i];
            case 6:
                return new we00[i];
            case 7:
                return new mg00[i];
            case 8:
                return new xj00[i];
            case 9:
                return new mk00[i];
            case 10:
                return new nk00[i];
            case 11:
                return new ok00[i];
            case 12:
                return new ql00[i];
            case 13:
                return new sl00[i];
            case 14:
                return new eo00[i];
            case 15:
                return new fq00[i];
            case 16:
                return new hq00[i];
            case 17:
                return new xs00[i];
            case 18:
                return new lw00[i];
            case 19:
                return new fw00[i];
            case 20:
                return new hw00[i];
            case 21:
                return new iw00[i];
            case 22:
                return new jw00[i];
            case 23:
                return new bz00[i];
            case 24:
                return new yy00[i];
            case 25:
                return new zy00[i];
            case 26:
                return new iz00[i];
            case 27:
                return new jz00[i];
            case 28:
                return new xz00[i];
            default:
                return new pz00[i];
        }
    }
}
