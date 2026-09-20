package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class pkl implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178485a;

    public /* synthetic */ pkl(int i) {
        this.f178485a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f178485a) {
            case 0:
                return new qkl(ekl.CREATOR.createFromParcel(parcel));
            case 1:
                return new skl((j6y) parcel.readParcelable(skl.class.getClassLoader()));
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("ARTIST")) {
                    i = 1;
                } else {
                    if (!string2.equals("AUTHOR")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.creator.creatorpage.CreatorType.".concat(string2));
                    }
                    i = 2;
                }
                return new vml(string, parcel.readString(), i, parcel.readString());
            case 3:
                return new mrl(parcel.readString(), parcel.readString());
            case 4:
                return new etl(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new bvl(parcel.readInt(), (tdu) parcel.readParcelable(bvl.class.getClassLoader()));
            case 6:
                return new pyl(parcel.readString(), parcel.readString());
            case 7:
                return new qyl(parcel.readString(), parcel.readString());
            case 8:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int iM75732f = 0;
                while (iM75732f != i2) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new z1m(string3, string4, linkedHashMap);
            case 9:
                return new h2m(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (icr0) parcel.readParcelable(h2m.class.getClassLoader()), stz0.m79365s(parcel.readString()), (rgy) parcel.readParcelable(h2m.class.getClassLoader()), (xr01) parcel.readParcelable(h2m.class.getClassLoader()));
            case 10:
                return new n2m(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (rgy) parcel.readParcelable(n2m.class.getClassLoader()), (icr0) parcel.readParcelable(n2m.class.getClassLoader()));
            case 11:
                return new p7m((Uri) parcel.readParcelable(p7m.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new CurrentTrackMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 13:
                return new mam((yth0) parcel.readParcelable(mam.class.getClassLoader()));
            case 14:
                return new pam(parcel.readString(), (yth0) parcel.readParcelable(pam.class.getClassLoader()));
            case 15:
                return new qam(parcel.readString(), parcel.readString());
            case 16:
                return new dbm(parcel);
            case 17:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(hcm.class, parcel, arrayList, iM9h, 1);
                }
                return new hcm(arrayList);
            case 18:
                String string5 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM9h2 = 0;
                while (iM9h2 != i4) {
                    iM9h2 = AbstractC0000a.m9h(icm.class, parcel, arrayList2, iM9h2, 1);
                }
                return new icm(string5, arrayList2, (d6l) parcel.readParcelable(icm.class.getClassLoader()));
            case 19:
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap2.put(parcel.readParcelable(kcm.class.getClassLoader()), parcel.readParcelable(kcm.class.getClassLoader()));
                }
                return new kcm(linkedHashMap2);
            case 20:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap3.put(parcel.readParcelable(lcm.class.getClassLoader()), parcel.readParcelable(lcm.class.getClassLoader()));
                }
                return new lcm(linkedHashMap3, (e6l) parcel.readParcelable(lcm.class.getClassLoader()));
            case 21:
                return new cdm(parcel.readString());
            case 22:
                return new ifm(parcel.readString(), parcel.readString(), parcel.readBundle(ifm.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return sfm.f208614a;
            case 24:
                return new wco(parcel.readString(), parcel.readString());
            case 25:
                return new klo((jba0) parcel.readSerializable(), (jba0) parcel.readSerializable());
            case 26:
                return new emo(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 27:
                return new kmo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
            case 28:
                return new boo(parcel.readLong());
            default:
                return new eoo(parcel.readString(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f178485a) {
            case 0:
                return new qkl[i];
            case 1:
                return new skl[i];
            case 2:
                return new vml[i];
            case 3:
                return new mrl[i];
            case 4:
                return new etl[i];
            case 5:
                return new bvl[i];
            case 6:
                return new pyl[i];
            case 7:
                return new qyl[i];
            case 8:
                return new z1m[i];
            case 9:
                return new h2m[i];
            case 10:
                return new n2m[i];
            case 11:
                return new p7m[i];
            case 12:
                return new CurrentTrackMetadata[i];
            case 13:
                return new mam[i];
            case 14:
                return new pam[i];
            case 15:
                return new qam[i];
            case 16:
                return new dbm[i];
            case 17:
                return new hcm[i];
            case 18:
                return new icm[i];
            case 19:
                return new kcm[i];
            case 20:
                return new lcm[i];
            case 21:
                return new cdm[i];
            case 22:
                return new ifm[i];
            case 23:
                return new sfm[i];
            case 24:
                return new wco[i];
            case 25:
                return new klo[i];
            case 26:
                return new emo[i];
            case 27:
                return new kmo[i];
            case 28:
                return new boo[i];
            default:
                return new eoo[i];
        }
    }
}
