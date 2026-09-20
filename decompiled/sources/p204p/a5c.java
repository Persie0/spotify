package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.notifications.models.preferences.Channels;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a5c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12485a;

    public /* synthetic */ a5c(int i) {
        this.f12485a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        switch (this.f12485a) {
            case 0:
                return new b5c(parcel.readString(), parcel.readInt(), parcel.readString());
            case 1:
                return new c5c(parcel.readString(), parcel.readInt(), parcel.readString());
            case 2:
                return new d5c(parcel.readString());
            case 3:
                return new e5c(parcel.readString(), ln21.valueOf(parcel.readString()));
            case 4:
                return new f5c(parcel.readString());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iM75732f = 0;
                while (iM75732f != i) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new q7c(linkedHashMap, string, string2, string3);
            case 6:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new rac(string4, string5, string6, string7, string8, z, parcel.readInt() != 0, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            case 7:
                return new ufc((wq50) parcel.readParcelable(ufc.class.getClassLoader()), parcel.readString());
            case 8:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(igc.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new jgc(parcel.readInt(), string9, string10, arrayList);
            case 9:
                return new igc(parcel.readString(), parcel.readString());
            case 10:
                String string11 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(bhc.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new chc(string11, parcel.readInt(), arrayList2);
            case 11:
                return new bhc(parcel.readString(), parcel.readString(), parcel.readInt());
            case 12:
                return new vhc(parcel.readInt());
            case 13:
                return new yjc(parcel.readString(), parcel.readString(), owk.CREATOR.createFromParcel(parcel));
            case 14:
                return new wkc(parcel.readString(), (glc) parcel.readParcelable(wkc.class.getClassLoader()));
            case 15:
                parcel.readInt();
                return clc.f39244a;
            case 16:
                parcel.readInt();
                return dlc.f50180a;
            case 17:
                parcel.readInt();
                return elc.f60684a;
            case 18:
                parcel.readInt();
                return flc.f70752a;
            case 19:
                return new tlc(parcel.readString());
            case 20:
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Channels(boolValueOf, boolValueOf2);
            case 21:
                return new eoc(parcel.readString(), ((nu71) parcel.readParcelable(eoc.class.getClassLoader())).f158526a, parcel.readLong(), parcel.readString());
            case 22:
                return new crc(parcel.readString(), parcel.readString());
            case 23:
                return new hrc(doc.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
            case 24:
                return new mrc(zrc.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 25:
                return new nrc(parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                return new zrc(parcel.readString(), parcel.readString());
            case 27:
                return osc.valueOf(parcel.readString());
            case 28:
                return new mtc(parcel.readString());
            default:
                return new nuc(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f12485a) {
            case 0:
                return new b5c[i];
            case 1:
                return new c5c[i];
            case 2:
                return new d5c[i];
            case 3:
                return new e5c[i];
            case 4:
                return new f5c[i];
            case 5:
                return new q7c[i];
            case 6:
                return new rac[i];
            case 7:
                return new ufc[i];
            case 8:
                return new jgc[i];
            case 9:
                return new igc[i];
            case 10:
                return new chc[i];
            case 11:
                return new bhc[i];
            case 12:
                return new vhc[i];
            case 13:
                return new yjc[i];
            case 14:
                return new wkc[i];
            case 15:
                return new clc[i];
            case 16:
                return new dlc[i];
            case 17:
                return new elc[i];
            case 18:
                return new flc[i];
            case 19:
                return new tlc[i];
            case 20:
                return new Channels[i];
            case 21:
                return new eoc[i];
            case 22:
                return new crc[i];
            case 23:
                return new hrc[i];
            case 24:
                return new mrc[i];
            case 25:
                return new nrc[i];
            case 26:
                return new zrc[i];
            case 27:
                return new osc[i];
            case 28:
                return new mtc[i];
            default:
                return new nuc[i];
        }
    }
}
