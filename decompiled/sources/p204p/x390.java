package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class x390 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257717a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f257717a) {
            case 0:
                return new y390(parcel.readInt() != 0);
            case 1:
                return new z390(parcel.readInt() != 0);
            case 2:
                parcel.readInt();
                return a490.f12157a;
            case 3:
                return new b490(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 4:
                return new c490(parcel.readString(), parcel.readString());
            case 5:
                return new e490(parcel.readInt() != 0);
            case 6:
                return new g490(parcel.readInt() != 0);
            case 7:
                return new h490(parcel.readInt() != 0);
            case 8:
                return new o490(parcel.readString(), parcel.readString(), (hz80) parcel.readParcelable(o490.class.getClassLoader()));
            case 9:
                return new v890(parcel.readString());
            case 10:
                return new h990(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 11:
                return new i990(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.readInt();
                return j990.f110129a;
            case 13:
                return new k990(parcel.readInt());
            case 14:
                parcel.readInt();
                return l990.f131040a;
            case 15:
                return new m990(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new n990(parcel.readString());
            case 17:
                return new o990(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : w990.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong());
            case 18:
                return new w990(parcel.readString(), parcel.readString());
            case 19:
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int iM75732f = 0;
                while (iM75732f != i2) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), z990.CREATOR.createFromParcel(parcel));
                }
                return new y990(linkedHashMap, linkedHashMap2, (r990) parcel.readParcelable(y990.class.getClassLoader()));
            case 20:
                return new z990(parcel.readString(), parcel.readInt() == 0 ? null : h990.CREATOR.createFromParcel(parcel));
            case 21:
                parcel.readInt();
                return ea90.f57605a;
            case 22:
                String string = parcel.readString();
                ia90 ia90VarCreateFromParcel = ia90.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("Friend")) {
                    i = 1;
                } else {
                    if (!string2.equals("Following")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.listeningactivity.elements.carousel.api.ListeningActivityCarouselElement.CarouselItem.FeedItem.Type.".concat(string2));
                    }
                    i = 2;
                }
                return new ja90(string, ia90VarCreateFromParcel, i);
            case 23:
                return new ia90(parcel.readString(), parcel.readString(), (ha90) parcel.readParcelable(ia90.class.getClassLoader()));
            case 24:
                return new fa90(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 25:
                parcel.readInt();
                return ga90.f78004a;
            case 26:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iM31715d = 0;
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(ka90.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new la90(string3, string4, arrayList);
            case 27:
                return new ka90(parcel.readString(), parcel.readInt() == 0 ? null : ia90.CREATOR.createFromParcel(parcel));
            case 28:
                parcel.readInt();
                return ma90.f141543a;
            default:
                parcel.readInt();
                return qa90.f186827a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f257717a) {
            case 0:
                return new y390[i];
            case 1:
                return new z390[i];
            case 2:
                return new a490[i];
            case 3:
                return new b490[i];
            case 4:
                return new c490[i];
            case 5:
                return new e490[i];
            case 6:
                return new g490[i];
            case 7:
                return new h490[i];
            case 8:
                return new o490[i];
            case 9:
                return new v890[i];
            case 10:
                return new h990[i];
            case 11:
                return new i990[i];
            case 12:
                return new j990[i];
            case 13:
                return new k990[i];
            case 14:
                return new l990[i];
            case 15:
                return new m990[i];
            case 16:
                return new n990[i];
            case 17:
                return new o990[i];
            case 18:
                return new w990[i];
            case 19:
                return new y990[i];
            case 20:
                return new z990[i];
            case 21:
                return new ea90[i];
            case 22:
                return new ja90[i];
            case 23:
                return new ia90[i];
            case 24:
                return new fa90[i];
            case 25:
                return new ga90[i];
            case 26:
                return new la90[i];
            case 27:
                return new ka90[i];
            case 28:
                return new ma90[i];
            default:
                return new qa90[i];
        }
    }
}
