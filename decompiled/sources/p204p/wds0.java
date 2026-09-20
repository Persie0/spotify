package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.p044v1.proto.SpotifyCheckoutNative;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class wds0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250325a;

    public /* synthetic */ wds0(int i) {
        this.f250325a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        int i;
        switch (this.f250325a) {
            case 0:
                return new xds0(parcel.readString(), parcel.readString(), m5p0.m60881m(parcel.readString()));
            case 1:
                return new qis0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                return new qns0(parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new rns0(parcel.readString(), (cos0) parcel.readParcelable(rns0.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case 4:
                return new sns0(parcel.readString(), parcel.readString());
            case 5:
                return new tns0(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 6:
                return new cos0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 7:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(iqs0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new hqs0(arrayList, parcel.readString());
            case 8:
                return new iqs0(parcel.readString(), parcel.readString());
            case 9:
                return new ass0(parcel.createStringArrayList());
            case 10:
                return new hws0(parcel.readString(), parcel.readString(), parcel.readString(), aus0.valueOf(parcel.readString()));
            case 11:
                parcel.readInt();
                return iws0.f106508a;
            case 12:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(hws0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new jws0(string, string2, string3, arrayList2);
            case 13:
                parcel.readInt();
                return kws0.f127180a;
            case 14:
                return new nws0(parcel.readString(), (lws0) parcel.readParcelable(nws0.class.getClassLoader()), (sr01) parcel.readParcelable(nws0.class.getClassLoader()), 8);
            case 15:
                return new ows0(parcel.readString());
            case 16:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d3 = 0;
                while (iM31715d3 != i4) {
                    iM31715d3 = c7h0.m31715d(pzw0.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new hxs0(string4, string5, arrayListCreateStringArrayList, arrayList3);
            case 17:
                return new ixs0(parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new jxs0(string6, string7, string8, string9, string10, string11, string12, numValueOf, z, parcel.readInt() != 0);
            case 19:
                return new kxs0(parcel.readString(), parcel.readString());
            case 20:
                return new lxs0(parcel.readString());
            case 21:
                parcel.readInt();
                return l4t0.f129758a;
            case 22:
                return new m4t0((ok10) parcel.readParcelable(m4t0.class.getClassLoader()));
            case 23:
                return new n4t0(SpotifyCheckoutNative.m6328P(parcel.createByteArray()));
            case 24:
                return new o4t0(parcel.readString());
            case 25:
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new cat0(boolValueOf);
            case 26:
                return new zat0(parcel.readInt() != 0);
            case 27:
                return new kct0(parcel.readInt() != 0);
            case 28:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (string14 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string14.equals("PENDING")) {
                    i = 1;
                } else if (string14.equals("PURCHASED")) {
                    i = 2;
                } else {
                    if (!string14.equals("UNSPECIFIED_STATE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.gpb.client.Purchase.State.".concat(string14));
                    }
                    i = 3;
                }
                return new rdt0(i, string13, parcel.readString(), parcel.createStringArrayList());
            default:
                return new tit0(parcel.readInt() == 0 ? null : nuf.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f250325a) {
            case 0:
                return new xds0[i];
            case 1:
                return new qis0[i];
            case 2:
                return new qns0[i];
            case 3:
                return new rns0[i];
            case 4:
                return new sns0[i];
            case 5:
                return new tns0[i];
            case 6:
                return new cos0[i];
            case 7:
                return new hqs0[i];
            case 8:
                return new iqs0[i];
            case 9:
                return new ass0[i];
            case 10:
                return new hws0[i];
            case 11:
                return new iws0[i];
            case 12:
                return new jws0[i];
            case 13:
                return new kws0[i];
            case 14:
                return new nws0[i];
            case 15:
                return new ows0[i];
            case 16:
                return new hxs0[i];
            case 17:
                return new ixs0[i];
            case 18:
                return new jxs0[i];
            case 19:
                return new kxs0[i];
            case 20:
                return new lxs0[i];
            case 21:
                return new l4t0[i];
            case 22:
                return new m4t0[i];
            case 23:
                return new n4t0[i];
            case 24:
                return new o4t0[i];
            case 25:
                return new cat0[i];
            case 26:
                return new zat0[i];
            case 27:
                return new kct0[i];
            case 28:
                return new rdt0[i];
            default:
                return new tit0[i];
        }
    }
}
