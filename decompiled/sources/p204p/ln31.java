package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.p044v1.proto.SpotifyCheckoutNative;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class ln31 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135081a;

    public /* synthetic */ ln31(int i) {
        this.f135081a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f135081a) {
            case 0:
                return new mn31(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
            case 1:
                return new gp31(parcel.readString());
            case 2:
                return new hp31(parcel.readString(), parcel.readString());
            case 3:
                return new ip31(parcel.readString());
            case 4:
                parcel.readInt();
                return lp31.f135609a;
            case 5:
                parcel.readInt();
                return tp31.f222422a;
            case 6:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("ASC")) {
                    i = 1;
                } else {
                    if (!string.equals("DESC")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.filterandsort.api.model.Order.".concat(string));
                    }
                    i = 2;
                }
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("ALPHABETIC")) {
                    i2 = 1;
                } else if (string2.equals("DATE")) {
                    i2 = 2;
                } else {
                    if (!string2.equals("NONE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.filterandsort.api.model.SortSelection.".concat(string2));
                    }
                    i2 = 3;
                }
                return new kr31(i, i2);
            case 7:
                return new nr31(parcel.readString(), lr31.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : kr31.CREATOR.createFromParcel(parcel));
            case 8:
                wr31 wr31VarValueOf = wr31.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(wr31.valueOf(parcel.readString()));
                }
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                while (iM9h != i5) {
                    iM9h = AbstractC0000a.m9h(bs31.class, parcel, arrayList2, iM9h, 1);
                }
                return new bs31(wr31VarValueOf, arrayList, arrayList2);
            case 9:
                return new ds31(ur31.valueOf(parcel.readString()));
            case 10:
                return new fs31(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : fs31.CREATOR.createFromParcel(parcel));
            case 11:
                return new gs31(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : gs31.CREATOR.createFromParcel(parcel));
            case 12:
                return is31.valueOf(parcel.readString());
            case 13:
                return new ft31(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() != 0, parcel.readDouble());
            case 14:
                return new jt31(o850.valueOf(parcel.readString()), ft31.CREATOR.createFromParcel(parcel));
            case 15:
                return new vt31(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new ut31(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                return new ou31(parcel.readString(), parcel.readString(), xs01.CREATOR.createFromParcel(parcel).f265445a);
            case 18:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("OptIn")) {
                    return new w241(string3, 1, parcel.readString());
                }
                throw new IllegalArgumentException("No enum constant com.spotify.musicplaybackspeed.speedcontrolmessaging.SpeedControlMessagingType.".concat(string4));
            case 19:
                return new o341(parcel.readInt());
            case 20:
                return new p341(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                return new t641((fh0) parcel.readParcelable(t641.class.getClassLoader()));
            case 22:
                return new rb41((e1e) parcel.readParcelable(rb41.class.getClassLoader()), parcel.readString());
            case 23:
                return new sb41((e1e) parcel.readParcelable(sb41.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 24:
                return new tb41((e1e) parcel.readParcelable(tb41.class.getClassLoader()), parcel.readString(), SpotifyCheckoutNative.m6328P(parcel.createByteArray()));
            case 25:
                parcel.readInt();
                return bh41.f27081a;
            case 26:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ArrayList arrayList3 = new ArrayList();
                parcel.readTypedList(arrayList3, avo0.CREATOR);
                return new eh41(string5, string6, arrayList3);
            case 27:
                sh41 sh41Var = new sh41();
                sh41Var.f209092a = parcel.readInt();
                sh41Var.f209093b = parcel.readInt();
                sh41Var.f209095d = parcel.readInt() == 1;
                int i6 = parcel.readInt();
                if (i6 > 0) {
                    int[] iArr = new int[i6];
                    sh41Var.f209094c = iArr;
                    parcel.readIntArray(iArr);
                }
                return sh41Var;
            case 28:
                th41 th41Var = new th41();
                th41Var.f220321a = parcel.readInt();
                th41Var.f220322b = parcel.readInt();
                int i7 = parcel.readInt();
                th41Var.f220323c = i7;
                if (i7 > 0) {
                    int[] iArr2 = new int[i7];
                    th41Var.f220324d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i8 = parcel.readInt();
                th41Var.f220325e = i8;
                if (i8 > 0) {
                    int[] iArr3 = new int[i8];
                    th41Var.f220326f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                th41Var.f220328h = parcel.readInt() == 1;
                th41Var.f220329i = parcel.readInt() == 1;
                th41Var.f220330t = parcel.readInt() == 1;
                th41Var.f220327g = parcel.readArrayList(sh41.class.getClassLoader());
                return th41Var;
            default:
                return new sj41(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f135081a) {
            case 0:
                return new mn31[i];
            case 1:
                return new gp31[i];
            case 2:
                return new hp31[i];
            case 3:
                return new ip31[i];
            case 4:
                return new lp31[i];
            case 5:
                return new tp31[i];
            case 6:
                return new kr31[i];
            case 7:
                return new nr31[i];
            case 8:
                return new bs31[i];
            case 9:
                return new ds31[i];
            case 10:
                return new fs31[i];
            case 11:
                return new gs31[i];
            case 12:
                return new is31[i];
            case 13:
                return new ft31[i];
            case 14:
                return new jt31[i];
            case 15:
                return new vt31[i];
            case 16:
                return new ut31[i];
            case 17:
                return new ou31[i];
            case 18:
                return new w241[i];
            case 19:
                return new o341[i];
            case 20:
                return new p341[i];
            case 21:
                return new t641[i];
            case 22:
                return new rb41[i];
            case 23:
                return new sb41[i];
            case 24:
                return new tb41[i];
            case 25:
                return new bh41[i];
            case 26:
                return new eh41[i];
            case 27:
                return new sh41[i];
            case 28:
                return new th41[i];
            default:
                return new sj41[i];
        }
    }
}
