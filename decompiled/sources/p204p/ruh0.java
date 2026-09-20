package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.address.endpoint.model.p012v1.proto.AddressCollection;
import com.spotify.checkout.proto.model.p044v1.proto.SpotifyCheckoutNative;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class ruh0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202858a;

    public /* synthetic */ ruh0(int i) {
        this.f202858a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        int i;
        switch (this.f202858a) {
            case 0:
                parcel.readInt();
                return suh0.f214126a;
            case 1:
                parcel.readInt();
                return tuh0.f223864a;
            case 2:
                return new dvh0(SpotifyCheckoutNative.m6328P(parcel.createByteArray()), cvh0.valueOf(parcel.readString()), uuh0.CREATOR.createFromParcel(parcel));
            case 3:
                return new evh0(AddressCollection.m2344x(parcel.createByteArray()), (bvh0) parcel.readParcelable(evh0.class.getClassLoader()), parcel.readInt() != 0);
            case 4:
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int i3 = 0;
                while (true) {
                    boolean z = true;
                    if (i3 == i2) {
                        return new uuh0(linkedHashMap, parcel.readInt() != 0);
                    }
                    Parcelable parcelable = parcel.readParcelable(uuh0.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    linkedHashMap.put(parcelable, Boolean.valueOf(z));
                    i3++;
                }
                break;
            case 5:
                return new vuh0(parcel.readString(), parcel.readString());
            case 6:
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap2.put(parcel.readString(), wuh0.CREATOR.createFromParcel(parcel));
                }
                return new xuh0(parcel.readString(), linkedHashMap2);
            case 7:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i6 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i6);
                    int iM31715d = 0;
                    while (iM31715d != i6) {
                        iM31715d = c7h0.m31715d(vuh0.CREATOR, parcel, arrayList2, iM31715d, 1);
                    }
                    arrayList = arrayList2;
                }
                return new wuh0(string, arrayList, string2);
            case 8:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i7);
                int iM75732f = 0;
                while (iM75732f != i7) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap3, parcel.readString(), iM75732f, 1);
                }
                return new yuh0(linkedHashMap3);
            case 9:
                int i8 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i8);
                int iM75732f2 = 0;
                while (iM75732f2 != i8) {
                    iM75732f2 = rkh0.m75732f(parcel, linkedHashMap4, parcel.readString(), iM75732f2, 1);
                }
                return new zuh0(linkedHashMap4);
            case 10:
                parcel.readInt();
                return avh0.f20194a;
            case 11:
                parcel.readInt();
                return fvh0.f73798a;
            case 12:
                parcel.readInt();
                return gvh0.f84758a;
            case 13:
                parcel.readInt();
                return jvh0.f116357a;
            case 14:
                return fyh0.m43103g(parcel.readInt(), parcel.readInt());
            case 15:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i9);
                int iM31715d2 = 0;
                while (iM31715d2 != i9) {
                    iM31715d2 = c7h0.m31715d(bej.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new oyh0(string3, string4, arrayList3, parcel.createStringArrayList(), parcel.readInt(), parcel.readString(), parcel.readString(), o7t0.m66403q(parcel.readString()));
            case 16:
                return new yyh0(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                return new zyh0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                String string5 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i10);
                int iM9h = 0;
                while (iM9h != i10) {
                    iM9h = AbstractC0000a.m9h(bzh0.class, parcel, arrayList4, iM9h, 1);
                }
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("Tracks")) {
                    i = 1;
                } else {
                    if (!string6.equals("Artists")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.morelike.MoreLikeElement.MoreLikeType.".concat(string6));
                    }
                    i = 2;
                }
                return new bzh0(string5, arrayList4, i, nlh0.valueOf(parcel.readString()));
            case 19:
                return new czh0((qro0) parcel.readParcelable(czh0.class.getClassLoader()), bzh0.CREATOR.createFromParcel(parcel));
            case 20:
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                int iM64020m = 0;
                while (iM64020m != i11) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new r2i0(parcel.readString(), linkedHashSet);
            case 21:
                return new g3i0(parcel.createStringArrayList(), parcel.readString());
            case 22:
                return new k5i0(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 23:
                return new v8i0(parcel.readString(), parcel.readString());
            case 24:
                return new ggi0(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 25:
                return new cli0((ou31) parcel.readParcelable(cli0.class.getClassLoader()), (sr01) parcel.readParcelable(cli0.class.getClassLoader()), stz0.m79365s(parcel.readString()));
            case 26:
                return new dli0((ou31) parcel.readParcelable(dli0.class.getClassLoader()), (sr01) parcel.readParcelable(dli0.class.getClassLoader()), stz0.m79365s(parcel.readString()), null, parcel.readString(), (Throwable) parcel.readSerializable());
            case 27:
                return new eli0((sr01) parcel.readParcelable(eli0.class.getClassLoader()), stz0.m79365s(parcel.readString()), (ou31) parcel.readParcelable(eli0.class.getClassLoader()), null, (icr0) parcel.readParcelable(eli0.class.getClassLoader()), (gcr0) parcel.readParcelable(eli0.class.getClassLoader()));
            case 28:
                return new fli0((ou31) parcel.readParcelable(fli0.class.getClassLoader()), (sr01) parcel.readParcelable(fli0.class.getClassLoader()), stz0.m79365s(parcel.readString()), null);
            default:
                return new ili0(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f202858a) {
            case 0:
                return new suh0[i];
            case 1:
                return new tuh0[i];
            case 2:
                return new dvh0[i];
            case 3:
                return new evh0[i];
            case 4:
                return new uuh0[i];
            case 5:
                return new vuh0[i];
            case 6:
                return new xuh0[i];
            case 7:
                return new wuh0[i];
            case 8:
                return new yuh0[i];
            case 9:
                return new zuh0[i];
            case 10:
                return new avh0[i];
            case 11:
                return new fvh0[i];
            case 12:
                return new gvh0[i];
            case 13:
                return new jvh0[i];
            case 14:
                return new fyh0[i];
            case 15:
                return new oyh0[i];
            case 16:
                return new yyh0[i];
            case 17:
                return new zyh0[i];
            case 18:
                return new bzh0[i];
            case 19:
                return new czh0[i];
            case 20:
                return new r2i0[i];
            case 21:
                return new g3i0[i];
            case 22:
                return new k5i0[i];
            case 23:
                return new v8i0[i];
            case 24:
                return new ggi0[i];
            case 25:
                return new cli0[i];
            case 26:
                return new dli0[i];
            case 27:
                return new eli0[i];
            case 28:
                return new fli0[i];
            default:
                return new ili0[i];
        }
    }
}
