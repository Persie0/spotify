package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.connect.core.model.AndroidUris;
import com.spotify.connect.core.model.RedirectUris;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes11.dex */
public final class h1v0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86767a;

    public /* synthetic */ h1v0(int i) {
        this.f86767a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        switch (this.f86767a) {
            case 0:
                return new i1v0(parcel.createStringArrayList());
            case 1:
                return new p4v0(parcel.readString(), parcel.readInt());
            case 2:
                return new r4v0(parcel.readString(), parcel.readString());
            case 3:
                return s4v0.valueOf(parcel.readString());
            case 4:
                return new r6v0(parcel.readString(), parcel.readString());
            case 5:
                return new l8v0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 6:
                int i4 = parcel.readInt();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                pxj pxjVar = (pxj) parcel.readParcelable(t8v0.class.getClassLoader());
                s4v0 s4v0VarCreateFromParcel = parcel.readInt() == 0 ? null : s4v0.CREATOR.createFromParcel(parcel);
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new t8v0(i4, arrayListCreateStringArrayList, pxjVar, s4v0VarCreateFromParcel, z, parcel.readInt() != 0, parcel.readInt() != 0 ? z : false);
            case 7:
                return new v9v0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("RECOMMENDATIONS_TYPE_UNKNOWN")) {
                    i = 1;
                } else if (string.equals("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST")) {
                    i = 2;
                } else if (string.equals("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE")) {
                    i = 3;
                } else if (string.equals("RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY")) {
                    i = 4;
                } else if (string.equals("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK")) {
                    i = 5;
                } else if (string.equals("RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE")) {
                    i = 6;
                } else if (string.equals("RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY")) {
                    i = 7;
                } else {
                    if (!string.equals("UNRECOGNIZED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.RecommendationsType.".concat(string));
                    }
                    i = 8;
                }
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iM31715d = 0;
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(zbv.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new jcv0(i, arrayList);
            case 9:
                return new dev0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(dev0.class.getClassLoader()));
            case 10:
                return new rev0(parcel.readString());
            case 11:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z2 = true;
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new cfv0(string2, string3, z2, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false, (sro0) parcel.readParcelable(cfv0.class.getClassLoader()), parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false);
            case 12:
                return new rfv0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                rfv0 rfv0VarCreateFromParcel = rfv0.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("Follow")) {
                    i2 = 1;
                } else {
                    if (!string4.equals("UnFollow")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.recommendedplaylist.RecommendedPlaylistElement.LibraryStatus.".concat(string4));
                    }
                    i2 = 2;
                }
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("PLAYING")) {
                    i3 = 1;
                } else if (string5.equals("PAUSED")) {
                    i3 = 2;
                } else {
                    if (!string5.equals("NONE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.recommendedplaylist.RecommendedPlaylistElement.PlayState.".concat(string5));
                    }
                    i3 = 3;
                }
                return new sfv0(rfv0VarCreateFromParcel, i2, i3);
            case 14:
                return new fgv0(parcel.readString(), parcel.readString());
            case 15:
                return new ogv0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 16:
                return new RedirectUris(parcel.readInt() == 0 ? null : AndroidUris.CREATOR.createFromParcel(parcel));
            case 17:
                return new nqv0(parcel.readString(), parcel.readString());
            case 18:
                return new tqv0(parcel.readString(), parcel.readString());
            case 19:
                return new iuv0(parcel.readString());
            case 20:
                return new kyv0(parcel.readString(), parcel.readString());
            case 21:
                return new czv0(parcel.readString(), parcel.readString());
            case 22:
                eil eilVar = (eil) parcel.readParcelable(a7w0.class.getClassLoader());
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    linkedHashSet.add(fyy.CREATOR.createFromParcel(parcel));
                }
                return new a7w0(eilVar, linkedHashSet);
            case 23:
                return new b7w0(fyy.CREATOR.createFromParcel(parcel));
            case 24:
                return new c7w0(fyy.CREATOR.createFromParcel(parcel));
            case 25:
                parcel.readInt();
                return d7w0.f46282a;
            case 26:
                return new e7w0((m8w0) parcel.readParcelable(e7w0.class.getClassLoader()));
            case 27:
                return new f7w0(fyy.CREATOR.createFromParcel(parcel), parcel.readString());
            case 28:
                return new g7w0(fyy.CREATOR.createFromParcel(parcel), parcel.readString());
            default:
                eil eilVar2 = (eil) parcel.readParcelable(w7w0.class.getClassLoader());
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i8);
                int iM9h = 0;
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashSet2.add(fyy.CREATOR.createFromParcel(parcel));
                }
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                while (iM9h != i10) {
                    iM9h = AbstractC0000a.m9h(w7w0.class, parcel, arrayList2, iM9h, 1);
                }
                return new w7w0(eilVar2, linkedHashSet2, arrayList2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f86767a) {
            case 0:
                return new i1v0[i];
            case 1:
                return new p4v0[i];
            case 2:
                return new r4v0[i];
            case 3:
                return new s4v0[i];
            case 4:
                return new r6v0[i];
            case 5:
                return new l8v0[i];
            case 6:
                return new t8v0[i];
            case 7:
                return new v9v0[i];
            case 8:
                return new jcv0[i];
            case 9:
                return new dev0[i];
            case 10:
                return new rev0[i];
            case 11:
                return new cfv0[i];
            case 12:
                return new rfv0[i];
            case 13:
                return new sfv0[i];
            case 14:
                return new fgv0[i];
            case 15:
                return new ogv0[i];
            case 16:
                return new RedirectUris[i];
            case 17:
                return new nqv0[i];
            case 18:
                return new tqv0[i];
            case 19:
                return new iuv0[i];
            case 20:
                return new kyv0[i];
            case 21:
                return new czv0[i];
            case 22:
                return new a7w0[i];
            case 23:
                return new b7w0[i];
            case 24:
                return new c7w0[i];
            case 25:
                return new d7w0[i];
            case 26:
                return new e7w0[i];
            case 27:
                return new f7w0[i];
            case 28:
                return new g7w0[i];
            default:
                return new w7w0[i];
        }
    }
}
