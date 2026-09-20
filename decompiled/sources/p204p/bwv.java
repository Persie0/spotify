package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class bwv implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31735a;

    public /* synthetic */ bwv(int i) {
        this.f31735a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f31735a) {
            case 0:
                return new cwv((ou31) parcel.readParcelable(cwv.class.getClassLoader()), (sr01) parcel.readParcelable(cwv.class.getClassLoader()), stz0.m79365s(parcel.readString()), null);
            case 1:
                String string = parcel.readString();
                a081 a081Var = (a081) parcel.readParcelable(hwv.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    i = 0;
                } else {
                    String string2 = parcel.readString();
                    if (string2 == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string2.equals("PLAYLIST_WITH_TRACKS")) {
                        i = 1;
                    } else if (string2.equals("PRO_PLAYLIST")) {
                        i = 2;
                    } else if (string2.equals("AI_PLAYLIST_DEFAULT_STICKER")) {
                        i = 3;
                    } else if (string2.equals("AI_PLAYLIST_FUN_COLLECTIBLE")) {
                        i = 4;
                    } else if (string2.equals("AI_PLAYLIST_BETTER_SCREENSHOT")) {
                        i = 5;
                    } else {
                        if (!string2.equals("PRO_PLAYLIST_WITH_TRACKS")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.share.formats.entity.StickerType.".concat(string2));
                        }
                        i = 6;
                    }
                }
                return new hwv(string, a081Var, i, parcel.readInt() != 0, parcel.readInt() == 0 ? null : shv.CREATOR.createFromParcel(parcel), (tu71) parcel.readParcelable(hwv.class.getClassLoader()), (mrp0) parcel.readParcelable(hwv.class.getClassLoader()));
            case 2:
                return ayv.valueOf(parcel.readString());
            case 3:
                lyv lyvVar = new lyv();
                lyvVar.f138119a = 0.0f;
                lyvVar.f138120b = null;
                lyvVar.f138121c = 0.0f;
                lyvVar.f138121c = parcel.readFloat();
                lyvVar.f138119a = parcel.readFloat();
                if (parcel.readInt() == 1) {
                    lyvVar.f138120b = parcel.readParcelable(Object.class.getClassLoader());
                }
                return lyvVar;
            case 4:
                parcel.readInt();
                return oyv.f171906b;
            case 5:
                parcel.readInt();
                return pyv.f183528b;
            case 6:
                parcel.readInt();
                return ryv.f203973b;
            case 7:
                parcel.readInt();
                return syv.f215342b;
            case 8:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                gcr0 gcr0Var = (gcr0) parcel.readParcelable(e0w.class.getClassLoader());
                Uri uri = (Uri) parcel.readParcelable(e0w.class.getClassLoader());
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new e0w(string3, string4, gcr0Var, uri, z, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong());
            case 9:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                qsj qsjVarValueOf = qsj.valueOf(parcel.readString());
                boolean z2 = parcel.readInt() != 0;
                String string11 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(efz0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new s1w(string5, string6, string7, string8, string9, string10, qsjVarValueOf, z2, string11, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString());
            case 10:
                return new i4w(parcel.readString());
            case 11:
                return new m5w(parcel.readString(), parcel.readBundle(m5w.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 12:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                qsj qsjVarValueOf2 = qsj.valueOf(parcel.readString());
                boolean z3 = parcel.readInt() != 0;
                String string16 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                int iM62668v = mrx0.m62668v(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM31715d2 = 0;
                while (iM31715d2 != i3) {
                    iM31715d2 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new a9w(string12, string13, string14, string15, qsjVarValueOf2, z3, string16, z4, z5, iM62668v, arrayList2, parcel.readInt() != 0, parcel.readString());
            case 13:
                return new v9w(parcel.readInt() == 0 ? null : yj11.CREATOR.createFromParcel(parcel), e0w.CREATOR.createFromParcel(parcel), (eoc) parcel.readParcelable(v9w.class.getClassLoader()), (ume) parcel.readParcelable(v9w.class.getClassLoader()), (gcr0) parcel.readParcelable(v9w.class.getClassLoader()), t611.CREATOR.createFromParcel(parcel), parcel.readString());
            case 14:
                parcel.readInt();
                return qbw.f187179a;
            case 15:
                return new rbw(wbw.valueOf(parcel.readString()));
            case 16:
                return new tbw(parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : p68.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? p68.CREATOR.createFromParcel(parcel) : null);
            case 17:
                return new ubw(wbw.valueOf(parcel.readString()));
            case 18:
                ubw ubwVarCreateFromParcel = ubw.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<p68> creator = p68.CREATOR;
                return new vbw(ubwVarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 19:
                return new kcw(parcel.readString());
            case 20:
                return new fdw(parcel.readString(), parcel.readInt() != 0);
            case 21:
                parcel.readInt();
                return iew.f101567a;
            case 22:
                parcel.readInt();
                return jew.f111682a;
            case 23:
                return new ifw(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 24:
                return new pfw(parcel.readString(), parcel.readString(), p1v.m68862s(parcel.readString()), parcel.readString());
            case 25:
                parcel.readInt();
                return rfw.f198755a;
            case 26:
                parcel.readInt();
                return sfw.f208650a;
            case 27:
                parcel.readInt();
                return tfw.f220061a;
            case 28:
                parcel.readInt();
                return ufw.f229885a;
            default:
                return new vfw(parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f31735a) {
            case 0:
                return new cwv[i];
            case 1:
                return new hwv[i];
            case 2:
                return new ayv[i];
            case 3:
                return new lyv[i];
            case 4:
                return new oyv[i];
            case 5:
                return new pyv[i];
            case 6:
                return new ryv[i];
            case 7:
                return new syv[i];
            case 8:
                return new e0w[i];
            case 9:
                return new s1w[i];
            case 10:
                return new i4w[i];
            case 11:
                return new m5w[i];
            case 12:
                return new a9w[i];
            case 13:
                return new v9w[i];
            case 14:
                return new qbw[i];
            case 15:
                return new rbw[i];
            case 16:
                return new tbw[i];
            case 17:
                return new ubw[i];
            case 18:
                return new vbw[i];
            case 19:
                return new kcw[i];
            case 20:
                return new fdw[i];
            case 21:
                return new iew[i];
            case 22:
                return new jew[i];
            case 23:
                return new ifw[i];
            case 24:
                return new pfw[i];
            case 25:
                return new rfw[i];
            case 26:
                return new sfw[i];
            case 27:
                return new tfw[i];
            case 28:
                return new ufw[i];
            default:
                return new vfw[i];
        }
    }
}
