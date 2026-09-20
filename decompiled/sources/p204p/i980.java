package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class i980 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99927a;

    public /* synthetic */ i980(int i) {
        this.f99927a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.f99927a) {
            case 0:
                parcel.readInt();
                return j980.f110118b;
            case 1:
                parcel.readInt();
                return t980.f218212a;
            case 2:
                lw8 lw8VarValueOf = lw8.valueOf(parcel.readString());
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iM31715d = 0;
                while (iM31715d != i) {
                    iM31715d = c7h0.m31715d(lt8.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new u980(lw8VarValueOf, string, arrayList2, parcel.readInt() == 0 ? null : pyl.CREATOR.createFromParcel(parcel), parcel.readString());
            case 3:
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readParcelable(fa80.class.getClassLoader()), parcel.readValue(fa80.class.getClassLoader()));
                }
                return new fa80(linkedHashMap);
            case 4:
                return new na80(parcel.readString(), parcel.readString());
            case 5:
                return new gj80(parcel.readString(), (fj80) parcel.readParcelable(gj80.class.getClassLoader()));
            case 6:
                return new dj80(parcel.readString());
            case 7:
                parcel.readInt();
                return ej80.f60159a;
            case 8:
                return new ij80(parcel.readInt(), (gj80) parcel.readParcelable(ij80.class.getClassLoader()), parcel.readInt() != 0);
            case 9:
                return new jj80(parcel.readString(), parcel.readString());
            case 10:
                return new vj80(parcel.readString(), parcel.readString());
            case 11:
                return new fk80(parcel.readInt());
            case 12:
                kk80 kk80VarCreateFromParcel = parcel.readInt() == 0 ? null : kk80.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                np71 np71Var = (np71) parcel.readParcelable(hk80.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i4);
                    int iM9h = 0;
                    while (iM9h != i4) {
                        iM9h = AbstractC0000a.m9h(hk80.class, parcel, arrayList3, iM9h, 1);
                    }
                    arrayList = arrayList3;
                }
                return new hk80(kk80VarCreateFromParcel, string2, np71Var, arrayList, parcel.createStringArrayList());
            case 13:
                return new kk80(parcel.readInt() == 0 ? null : k340.CREATOR.createFromParcel(parcel), (j6y) parcel.readParcelable(kk80.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? nk80.CREATOR.createFromParcel(parcel) : null);
            case 14:
                return new nk80(parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                return new qk80(parcel.readString());
            case 16:
                return new vn80(parcel.readString());
            case 17:
                return new do80(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new eq80(parcel.readString(), (voc1) parcel.readParcelable(eq80.class.getClassLoader()), (agy) parcel.readParcelable(eq80.class.getClassLoader()), ump0.CREATOR.createFromParcel(parcel));
            case 19:
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyM18422w = PlaylistRequestDecorationPolicy.m18422w(parcel.createByteArray());
                i490 i490Var = (i490) parcel.readParcelable(st80.class.getClassLoader());
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet.add(parcel.readParcelable(st80.class.getClassLoader()));
                }
                return new st80(playlistRequestDecorationPolicyM18422w, i490Var, linkedHashSet, parcel.readInt() != 0, (rt80) parcel.readParcelable(st80.class.getClassLoader()), (f5u0) parcel.readParcelable(st80.class.getClassLoader()), ot80.valueOf(parcel.readString()), parcel.readInt(), parcel.createStringArrayList());
            case 20:
                parcel.readInt();
                return ss80.f213529a;
            case 21:
                return new ts80(parcel.readString());
            case 22:
                parcel.readInt();
                return us80.f233558a;
            case 23:
                parcel.readInt();
                return vs80.f244380a;
            case 24:
                parcel.readInt();
                return ws80.f254555a;
            case 25:
                parcel.readInt();
                return xs80.f265540a;
            case 26:
                parcel.readInt();
                return ys80.f275721a;
            case 27:
                parcel.readInt();
                return zs80.f285887a;
            case 28:
                parcel.readInt();
                return at80.f19613a;
            default:
                parcel.readInt();
                return bt80.f30532a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f99927a) {
            case 0:
                return new j980[i];
            case 1:
                return new t980[i];
            case 2:
                return new u980[i];
            case 3:
                return new fa80[i];
            case 4:
                return new na80[i];
            case 5:
                return new gj80[i];
            case 6:
                return new dj80[i];
            case 7:
                return new ej80[i];
            case 8:
                return new ij80[i];
            case 9:
                return new jj80[i];
            case 10:
                return new vj80[i];
            case 11:
                return new fk80[i];
            case 12:
                return new hk80[i];
            case 13:
                return new kk80[i];
            case 14:
                return new nk80[i];
            case 15:
                return new qk80[i];
            case 16:
                return new vn80[i];
            case 17:
                return new do80[i];
            case 18:
                return new eq80[i];
            case 19:
                return new st80[i];
            case 20:
                return new ss80[i];
            case 21:
                return new ts80[i];
            case 22:
                return new us80[i];
            case 23:
                return new vs80[i];
            case 24:
                return new ws80[i];
            case 25:
                return new xs80[i];
            case 26:
                return new ys80[i];
            case 27:
                return new zs80[i];
            case 28:
                return new at80[i];
            default:
                return new bt80[i];
        }
    }
}
