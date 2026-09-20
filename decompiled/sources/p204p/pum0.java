package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class pum0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181499a;

    public /* synthetic */ pum0(int i) {
        this.f181499a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f181499a) {
            case 0:
                return new qum0(parcel.readInt() != 0);
            case 1:
                return new rum0(parcel.readString(), parcel.readString(), m5p0.m60881m(parcel.readString()));
            case 2:
                return new sum0(parcel.readString());
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("PLACEHOLDER")) {
                    i = 1;
                } else {
                    if (!string4.equals("SHOW")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.bluejay.confirmgenerationpage.domain.ShowType.".concat(string4));
                    }
                    i = 2;
                }
                return new tum0(string, string2, string3, arrayListCreateStringArrayList, numValueOf, i);
            case 4:
                return new uum0(parcel.readFloat());
            case 5:
                return new wum0(parcel.readLong());
            case 6:
                return new zum0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("DAILY")) {
                    i2 = 1;
                } else if (string5.equals("WEEKLY")) {
                    i2 = 2;
                } else if (string5.equals("NEVER")) {
                    i2 = 3;
                } else {
                    if (!string5.equals("MONTHLY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.promptedplaylists.schedule.config.Cadence.".concat(string5));
                    }
                    i2 = 4;
                }
                return new avm0(i2, parcel.readInt(), qfy0.CREATOR.createFromParcel(parcel));
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f25a = parcel.readInt();
                parcelableVolumeInfo.f27c = parcel.readInt();
                parcelableVolumeInfo.f28d = parcel.readInt();
                parcelableVolumeInfo.f29e = parcel.readInt();
                parcelableVolumeInfo.f26b = parcel.readInt();
                return parcelableVolumeInfo;
            case 9:
                parcel.readInt();
                return new vvm0();
            case 10:
                return new ewm0(parcel.readString(), parcel.readString());
            case 11:
                int iM9h = 0;
                boolean z = parcel.readInt() != 0;
                agr0 agr0VarCreateFromParcel = agr0.CREATOR.createFromParcel(parcel);
                boolean z2 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(iwm0.class, parcel, arrayList, iM9h, 1);
                }
                return new iwm0(z, agr0VarCreateFromParcel, z2, arrayList);
            case 12:
                return new cxm0(parcel.readString(), parcel.readInt(), (cbm0) parcel.readSerializable(), (voc1) parcel.readParcelable(cxm0.class.getClassLoader()));
            case 13:
                return new sxm0(parcel.readString(), xxm0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (cbm0) parcel.readSerializable(), (voc1) parcel.readParcelable(sxm0.class.getClassLoader()));
            case 14:
                return new uym0(parcel.readString(), (gy91) parcel.readParcelable(uym0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 15:
                return new fzm0(parcel.readInt() != 0);
            case 16:
                parcel.readInt();
                return kzm0.f128164a;
            case 17:
                return new d0n0((lzm0) parcel.readParcelable(d0n0.class.getClassLoader()), (lzm0) parcel.readParcelable(d0n0.class.getClassLoader()));
            case 18:
                return new n0n0(parcel.readString(), parcel.readString(), ss8.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 19:
                return k1n0.valueOf(parcel.readString());
            case 20:
                return new c2n0(parcel.readString(), parcel.readString(), ss8.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 21:
                return new d5n0(parcel.readInt() != 0, (p5n0) parcel.readParcelable(d5n0.class.getClassLoader()), (tdu) parcel.readParcelable(d5n0.class.getClassLoader()));
            case 22:
                return new m5n0(parcel.readString());
            case 23:
                return new n5n0(parcel.readString());
            case 24:
                parcel.readInt();
                return o5n0.f162040a;
            case 25:
                return new i7n0(parcel.readString(), parcel.readString());
            case 26:
                return new w9n0((v9n0) parcel.readParcelable(w9n0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                return new k9n0(parcel.readString());
            case 28:
                parcel.readInt();
                return l9n0.f131153b;
            default:
                return new m9n0(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f181499a) {
            case 0:
                return new qum0[i];
            case 1:
                return new rum0[i];
            case 2:
                return new sum0[i];
            case 3:
                return new tum0[i];
            case 4:
                return new uum0[i];
            case 5:
                return new wum0[i];
            case 6:
                return new zum0[i];
            case 7:
                return new avm0[i];
            case 8:
                return new ParcelableVolumeInfo[i];
            case 9:
                return new vvm0[i];
            case 10:
                return new ewm0[i];
            case 11:
                return new iwm0[i];
            case 12:
                return new cxm0[i];
            case 13:
                return new sxm0[i];
            case 14:
                return new uym0[i];
            case 15:
                return new fzm0[i];
            case 16:
                return new kzm0[i];
            case 17:
                return new d0n0[i];
            case 18:
                return new n0n0[i];
            case 19:
                return new k1n0[i];
            case 20:
                return new c2n0[i];
            case 21:
                return new d5n0[i];
            case 22:
                return new m5n0[i];
            case 23:
                return new n5n0[i];
            case 24:
                return new o5n0[i];
            case 25:
                return new i7n0[i];
            case 26:
                return new w9n0[i];
            case 27:
                return new k9n0[i];
            case 28:
                return new l9n0[i];
            default:
                return new m9n0[i];
        }
    }
}
