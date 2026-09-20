package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.connect.core.model.AndroidUris;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class bc3 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25760a;

    public /* synthetic */ bc3(int i) {
        this.f25760a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25760a) {
            case 0:
                return new cc3(parcel.readString(), parcel.createStringArrayList(), EntryPoint.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 1:
                parcel.readInt();
                return dc3.f47410a;
            case 2:
                EntryPoint entryPointValueOf = EntryPoint.valueOf(parcel.readString());
                q151 q151Var = (q151) parcel.readParcelable(ad3.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iM9h = 0;
                while (iM9h != i) {
                    iM9h = AbstractC0000a.m9h(ad3.class, parcel, arrayList, iM9h, 1);
                }
                return new ad3(entryPointValueOf, q151Var, arrayList, (ec3) parcel.readParcelable(ad3.class.getClassLoader()));
            case 3:
                return new lh3(parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                return new mh3(parcel.readString());
            case 5:
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(wr31.valueOf(parcel.readString()));
                }
                return new ph3(arrayList2, jz80.CREATOR.createFromParcel(parcel), (fa80) parcel.readParcelable(ph3.class.getClassLoader()));
            case 6:
                return new gi3(parcel.readString(), gn80.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                return new oi3(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0);
            case 8:
                return new wj3(EntryPoint.valueOf(parcel.readString()));
            case 9:
                return new nl3(parcel.readString());
            case 10:
                return new ol3(parcel.readString(), parcel.readString());
            case 11:
                return new an3(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 12:
                return new wn3(parcel.readString());
            case 13:
                return new xn3(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 14:
                return new ko3(jev.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            case 15:
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new mo3(arrayList3);
            case 16:
                parcel.readInt();
                return no3.f156557a;
            case 17:
                parcel.readInt();
                return po3.f179573a;
            case 18:
                return new el4(parcel.createStringArray(), parcel.createIntArray());
            case 19:
                return new AndroidUris(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                parcel.readInt();
                return kz4.f128008c;
            case 21:
                parcel.readInt();
                return lz4.f138257c;
            case 22:
                return new mz4(parcel.readInt(), parcel.readInt());
            case 23:
                String string = parcel.readString();
                brc1 brc1Var = (brc1) parcel.readParcelable(f35.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(vt31.CREATOR, parcel, arrayList4, iM31715d2, 1);
                }
                return new f35(string, brc1Var, arrayList4, parcel.readString(), parcel.createStringArrayList());
            case 24:
                return new i35(parcel.readInt(), parcel.createStringArrayList());
            case 25:
                k75 k75Var = new k75(parcel);
                k75Var.f119979a = parcel.readByte() != 0;
                return k75Var;
            case 26:
                return new fb5((za5) parcel.readValue(fb5.class.getClassLoader()));
            case 27:
                return new gc5(wya0.CREATOR.createFromParcel(parcel));
            case 28:
                return new vf5(parcel.readString());
            default:
                return new ko5(parcel.readString(), parcel.readString(), mlm0.valueOf(parcel.readString()), ohi.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f25760a) {
            case 0:
                return new cc3[i];
            case 1:
                return new dc3[i];
            case 2:
                return new ad3[i];
            case 3:
                return new lh3[i];
            case 4:
                return new mh3[i];
            case 5:
                return new ph3[i];
            case 6:
                return new gi3[i];
            case 7:
                return new oi3[i];
            case 8:
                return new wj3[i];
            case 9:
                return new nl3[i];
            case 10:
                return new ol3[i];
            case 11:
                return new an3[i];
            case 12:
                return new wn3[i];
            case 13:
                return new xn3[i];
            case 14:
                return new ko3[i];
            case 15:
                return new mo3[i];
            case 16:
                return new no3[i];
            case 17:
                return new po3[i];
            case 18:
                return new el4[i];
            case 19:
                return new AndroidUris[i];
            case 20:
                return new kz4[i];
            case 21:
                return new lz4[i];
            case 22:
                return new mz4[i];
            case 23:
                return new f35[i];
            case 24:
                return new i35[i];
            case 25:
                return new k75[i];
            case 26:
                return new fb5[i];
            case 27:
                return new gc5[i];
            case 28:
                return new vf5[i];
            default:
                return new ko5[i];
        }
    }
}
