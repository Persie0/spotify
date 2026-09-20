package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class e361 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55633a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f55633a) {
            case 0:
                return new f361(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 1:
                return new g361(parcel.readInt(), (fuz0) parcel.readParcelable(g361.class.getClassLoader()), (fuz0) parcel.readParcelable(g361.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : f361.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 2:
                return new h361(g361.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 3:
                return new n361(parcel.readLong());
            case 4:
                c561 c561Var = (c561) parcel.readParcelable(b561.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(b561.class, parcel, arrayList, iM9h, 1);
                }
                return new b561(c561Var, arrayList);
            case 5:
                return new c561(parcel.readString(), parcel.readString());
            case 6:
                return new h561(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 7:
                parcel.readInt();
                return j661.f109233a;
            case 8:
                parcel.readInt();
                return k661.f119681a;
            case 9:
                parcel.readInt();
                return l661.f130240a;
            case 10:
                parcel.readInt();
                return m661.f140398a;
            case 11:
                parcel.readInt();
                return n661.f150719a;
            case 12:
                parcel.readInt();
                return o661.f162260a;
            case 13:
                parcel.readInt();
                return p661.f174303a;
            case 14:
                parcel.readInt();
                return q661.f185694a;
            case 15:
                parcel.readInt();
                return r661.f196181a;
            case 16:
                parcel.readInt();
                return s661.f206015a;
            case 17:
                return new db61(parcel.readString());
            case 18:
                String string = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string2 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(new n6f(rfg1.m75432b(parcel.readInt())));
                }
                return new yb61(string, string2, arrayList2, z);
            case 19:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                }
                return new zb61(arrayList3, parcel.readString());
            case 20:
                String string3 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("COVER_CREATION")) {
                    return new ac61(string3, 1, string4, z2);
                }
                throw new IllegalArgumentException("No enum constant com.spotify.share.models.Swatch.Themed.EncoreIcon.".concat(string5));
            case 21:
                return new bc61(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Uri) parcel.readParcelable(bc61.class.getClassLoader()));
            case 22:
                return new cc61((Uri) parcel.readParcelable(cc61.class.getClassLoader()), parcel.readString());
            case 23:
                return new dc61((Uri) parcel.readParcelable(dc61.class.getClassLoader()), parcel.readString());
            case 24:
                String string6 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                String string7 = parcel.readString();
                Uri uri = (Uri) parcel.readParcelable(ec61.class.getClassLoader());
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("PLAYING")) {
                    i = 1;
                } else if (string8.equals("PAUSE")) {
                    i = 2;
                } else {
                    if (!string8.equals("STOPPED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.share.uiusecases.swatch.Swatch.Video.State.".concat(string8));
                    }
                    i = 3;
                }
                return new ec61(string6, z3, string7, uri, i);
            case 25:
                return new fc61((Uri) parcel.readParcelable(fc61.class.getClassLoader()), parcel.readString());
            case 26:
                return new kc61(parcel.readInt(), (gc61) parcel.readParcelable(kc61.class.getClassLoader()));
            case 27:
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                int iM9h2 = 0;
                while (iM9h2 != i7) {
                    iM9h2 = AbstractC0000a.m9h(oc61.class, parcel, arrayList4, iM9h2, 1);
                }
                return new oc61(arrayList4);
            case 28:
                return new nd61(parcel);
            default:
                return new gs61(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f55633a) {
            case 0:
                return new f361[i];
            case 1:
                return new g361[i];
            case 2:
                return new h361[i];
            case 3:
                return new n361[i];
            case 4:
                return new b561[i];
            case 5:
                return new c561[i];
            case 6:
                return new h561[i];
            case 7:
                return new j661[i];
            case 8:
                return new k661[i];
            case 9:
                return new l661[i];
            case 10:
                return new m661[i];
            case 11:
                return new n661[i];
            case 12:
                return new o661[i];
            case 13:
                return new p661[i];
            case 14:
                return new q661[i];
            case 15:
                return new r661[i];
            case 16:
                return new s661[i];
            case 17:
                return new db61[i];
            case 18:
                return new yb61[i];
            case 19:
                return new zb61[i];
            case 20:
                return new ac61[i];
            case 21:
                return new bc61[i];
            case 22:
                return new cc61[i];
            case 23:
                return new dc61[i];
            case 24:
                return new ec61[i];
            case 25:
                return new fc61[i];
            case 26:
                return new kc61[i];
            case 27:
                return new oc61[i];
            case 28:
                return new nd61[i];
            default:
                return new gs61[i];
        }
    }
}
