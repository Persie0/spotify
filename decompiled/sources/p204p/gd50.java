package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.notifications.models.preferences.Channels;
import com.spotify.notifications.models.preferences.Item$Group;
import com.spotify.notifications.models.preferences.Item$Preference;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class gd50 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78731a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f78731a) {
            case 0:
                return new hd50(parcel.readString(), parcel.readInt() != 0);
            case 1:
                return new vf50(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 2:
                return new th50((agy) parcel.readParcelable(th50.class.getClassLoader()));
            case 3:
                return new yk50(parcel.readString(), parcel.readString());
            case 4:
                parcel.readInt();
                return kl50.f123802a;
            case 5:
                return new ll50(parcel.readString());
            case 6:
                return new ml50(parcel.readString());
            case 7:
                parcel.readInt();
                return nl50.f155007a;
            case 8:
                return new ol50(parcel.readString());
            case 9:
                parcel.readInt();
                return pl50.f178644a;
            case 10:
                return new rm50(parcel.readInt() != 0);
            case 11:
                return new bn50((agw) parcel.readParcelable(bn50.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return cn50.f39893a;
            case 13:
                return new in50((hn50) parcel.readParcelable(in50.class.getClassLoader()));
            case 14:
                return new fn50((agw) parcel.readParcelable(fn50.class.getClassLoader()));
            case 15:
                return new gn50(parcel.readString(), parcel.readString());
            case 16:
                return new wn50(parcel.readString(), pla1.CREATOR.createFromParcel(parcel));
            case 17:
                parcel.readInt();
                return oo50.f167466a;
            case 18:
                parcel.readInt();
                return so50.f211096a;
            case 19:
                parcel.readInt();
                return to50.f222185a;
            case 20:
                parcel.readInt();
                return dp50.f51184a;
            case 21:
                parcel.readInt();
                return ep50.f61550a;
            case 22:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("NOT_APPLICABLE")) {
                    i = 1;
                } else if (string4.equals("ALBUM")) {
                    i = 2;
                } else if (string4.equals("SINGLE")) {
                    i = 3;
                } else {
                    if (!string4.equals("APPEARS_ON")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.assistedcuration.endpoints.Item.Album.Source.".concat(string4));
                    }
                    i = 4;
                }
                return new cq50(i, string, string2, string3, arrayListCreateStringArrayList, parcel.createStringArrayList(), z, z2);
            case 23:
                return new dq50(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 24:
                return new fq50(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createStringArrayList(), parcel.readLong());
            case 25:
                return new yq50(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            case 26:
                return new jq50(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
            case 27:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int iM9h = 0;
                boolean z3 = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iM9h != i2) {
                    iM9h = AbstractC0000a.m9h(Item$Group.class, parcel, arrayList, iM9h, 1);
                }
                return new Item$Group(string5, string6, string7, string8, z3, arrayList);
            case 28:
                return new lq50(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new Item$Preference(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Channels.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f78731a) {
            case 0:
                return new hd50[i];
            case 1:
                return new vf50[i];
            case 2:
                return new th50[i];
            case 3:
                return new yk50[i];
            case 4:
                return new kl50[i];
            case 5:
                return new ll50[i];
            case 6:
                return new ml50[i];
            case 7:
                return new nl50[i];
            case 8:
                return new ol50[i];
            case 9:
                return new pl50[i];
            case 10:
                return new rm50[i];
            case 11:
                return new bn50[i];
            case 12:
                return new cn50[i];
            case 13:
                return new in50[i];
            case 14:
                return new fn50[i];
            case 15:
                return new gn50[i];
            case 16:
                return new wn50[i];
            case 17:
                return new oo50[i];
            case 18:
                return new so50[i];
            case 19:
                return new to50[i];
            case 20:
                return new dp50[i];
            case 21:
                return new ep50[i];
            case 22:
                return new cq50[i];
            case 23:
                return new dq50[i];
            case 24:
                return new fq50[i];
            case 25:
                return new yq50[i];
            case 26:
                return new jq50[i];
            case 27:
                return new Item$Group[i];
            case 28:
                return new lq50[i];
            default:
                return new Item$Preference[i];
        }
    }
}
