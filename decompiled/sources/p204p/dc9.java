package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class dc9 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47459a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f47459a) {
            case 0:
                return new ec9(parcel.readString(), parcel.readInt() != 0);
            case 1:
                return new rd9(parcel.readString(), parcel.readString());
            case 2:
                return new fe9(parcel.readString());
            case 3:
                return new ge9(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 4:
                return new he9(parcel.readInt());
            case 5:
                return new xe9(parcel.readString(), parcel.readInt() != 0);
            case 6:
                return new ng9(parcel.readString());
            case 7:
                return new xg9(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), (b370) parcel.readParcelable(xg9.class.getClassLoader()));
            case 8:
                return new dn9(parcel.readString(), parcel.readString());
            case 9:
                return new en9(parcel.readString(), parcel.readString());
            case 10:
                return new fn9(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(kq51.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new zq9(arrayList);
            case 12:
                return new is9(parcel.createStringArrayList(), parcel.readInt() != 0);
            case 13:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("NOT_STARTED")) {
                    i = 1;
                } else if (string2.equals("IN_PROGRESS")) {
                    i = 2;
                } else if (string2.equals("FINISHED")) {
                    i = 3;
                } else {
                    if (!string2.equals("UNRECOGNIZED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo.State.".concat(string2));
                    }
                    i = 4;
                }
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("OPEN")) {
                    i2 = 1;
                } else if (string3.equals("LOCKED")) {
                    i2 = 2;
                } else if (string3.equals("CAPPED")) {
                    i2 = 3;
                } else {
                    if (!string3.equals("UNRECOGNIZED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.BookExtraInfo.Access.".concat(string3));
                    }
                    i2 = 4;
                }
                return new d5a(i, i2, parcel.readInt(), parcel.readLong(), string);
            case 14:
                return o8a.valueOf(parcel.readString());
            case 15:
                return new cba(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                parcel.readInt();
                return bca.f25813a;
            case 17:
                parcel.readInt();
                return cca.f36362a;
            case 18:
                return new jca((wwu) parcel.readParcelable(jca.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 19:
                return new sca((jca) parcel.readParcelable(sca.class.getClassLoader()));
            case 20:
                return new hda((dca) parcel.readParcelable(hda.class.getClassLoader()));
            case 21:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                return new iea(i4, arrayList2);
            case 22:
                parcel.readInt();
                return jea.f111516a;
            case 23:
                parcel.readInt();
                return kea.f121840a;
            case 24:
                parcel.readInt();
                return lea.f132496a;
            case 25:
                parcel.readInt();
                return mea.f142643a;
            case 26:
                parcel.readInt();
                return nea.f152967a;
            case 27:
                parcel.readInt();
                return oea.f164390a;
            case 28:
                parcel.readInt();
                return pea.f176688a;
            default:
                return new wfa((MessageResponseToken) parcel.readParcelable(wfa.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f47459a) {
            case 0:
                return new ec9[i];
            case 1:
                return new rd9[i];
            case 2:
                return new fe9[i];
            case 3:
                return new ge9[i];
            case 4:
                return new he9[i];
            case 5:
                return new xe9[i];
            case 6:
                return new ng9[i];
            case 7:
                return new xg9[i];
            case 8:
                return new dn9[i];
            case 9:
                return new en9[i];
            case 10:
                return new fn9[i];
            case 11:
                return new zq9[i];
            case 12:
                return new is9[i];
            case 13:
                return new d5a[i];
            case 14:
                return new o8a[i];
            case 15:
                return new cba[i];
            case 16:
                return new bca[i];
            case 17:
                return new cca[i];
            case 18:
                return new jca[i];
            case 19:
                return new sca[i];
            case 20:
                return new hda[i];
            case 21:
                return new iea[i];
            case 22:
                return new jea[i];
            case 23:
                return new kea[i];
            case 24:
                return new lea[i];
            case 25:
                return new mea[i];
            case 26:
                return new nea[i];
            case 27:
                return new oea[i];
            case 28:
                return new pea[i];
            default:
                return new wfa[i];
        }
    }
}
