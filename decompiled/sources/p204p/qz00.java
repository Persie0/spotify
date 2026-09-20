package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class qz00 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194073a;

    public /* synthetic */ qz00(int i) {
        this.f194073a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f194073a) {
            case 0:
                parcel.readInt();
                return rz00.f204017a;
            case 1:
                parcel.readInt();
                return sz00.f215356a;
            case 2:
                parcel.readInt();
                return tz00.f225079a;
            case 3:
                parcel.readInt();
                return uz00.f235397a;
            case 4:
                parcel.readInt();
                return vz00.f246356a;
            case 5:
                parcel.readInt();
                return a110.f11231a;
            case 6:
                parcel.readInt();
                return i210.f97690a;
            case 7:
                return new z310(zbv.CREATOR.createFromParcel(parcel));
            case 8:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("UNKNOWN")) {
                    i = 1;
                } else if (string.equals("DEFAULT")) {
                    i = 2;
                } else {
                    if (!string.equals("CONTENT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.Genre.GenreType.".concat(string));
                    }
                    i = 3;
                }
                return new g410(i, parcel.readInt() != 0);
            case 9:
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(h410.class, parcel, arrayList, iM9h, 1);
                }
                return new h410(string2, arrayList);
            case 10:
                return new i410(h410.CREATOR.createFromParcel(parcel), z2c.CREATOR.createFromParcel(parcel));
            case 11:
                String string3 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(efz0.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new c510(string3, charSequence, string4, arrayList2);
            case 12:
                return new d510(parcel.readString(), parcel.readInt());
            case 13:
                return new xb10(parcel);
            case 14:
                return new ok10((wir0) parcel.readParcelable(ok10.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : rd9.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? f2a1.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            case 15:
                return new nl10(ok10.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (ml10) parcel.readParcelable(nl10.class.getClassLoader()), (hm10) parcel.readParcelable(nl10.class.getClassLoader()));
            case 16:
                parcel.readInt();
                return il10.f103263a;
            case 17:
                parcel.readInt();
                return jl10.f113460a;
            case 18:
                parcel.readInt();
                return kl10.f123774a;
            case 19:
                parcel.readInt();
                return ll10.f134510a;
            case 20:
                parcel.readInt();
                return tl10.INSTANCE;
            case 21:
                return new wl10(parcel.readString(), parcel.readString());
            case 22:
                parcel.readInt();
                return yl10.INSTANCE;
            case 23:
                return new bm10(parcel.readInt() != 0, parcel.readString());
            case 24:
                parcel.readInt();
                return cm10.INSTANCE;
            case 25:
                parcel.readInt();
                return dm10.INSTANCE;
            case 26:
                parcel.readInt();
                return fm10.f70921a;
            case 27:
                parcel.readInt();
                return gm10.f81252a;
            case 28:
                return new im10(parcel.readString());
            default:
                parcel.readInt();
                return jm10.f113730a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f194073a) {
            case 0:
                return new rz00[i];
            case 1:
                return new sz00[i];
            case 2:
                return new tz00[i];
            case 3:
                return new uz00[i];
            case 4:
                return new vz00[i];
            case 5:
                return new a110[i];
            case 6:
                return new i210[i];
            case 7:
                return new z310[i];
            case 8:
                return new g410[i];
            case 9:
                return new h410[i];
            case 10:
                return new i410[i];
            case 11:
                return new c510[i];
            case 12:
                return new d510[i];
            case 13:
                return new xb10[i];
            case 14:
                return new ok10[i];
            case 15:
                return new nl10[i];
            case 16:
                return new il10[i];
            case 17:
                return new jl10[i];
            case 18:
                return new kl10[i];
            case 19:
                return new ll10[i];
            case 20:
                return new tl10[i];
            case 21:
                return new wl10[i];
            case 22:
                return new yl10[i];
            case 23:
                return new bm10[i];
            case 24:
                return new cm10[i];
            case 25:
                return new dm10[i];
            case 26:
                return new fm10[i];
            case 27:
                return new gm10[i];
            case 28:
                return new im10[i];
            default:
                return new jm10[i];
        }
    }
}
