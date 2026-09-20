package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class c2z implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33497a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f33497a) {
            case 0:
                return new d2z(f2z.valueOf(parcel.readString()));
            case 1:
                d2z d2zVarCreateFromParcel = d2z.CREATOR.createFromParcel(parcel);
                Parcelable.Creator<p68> creator = p68.CREATOR;
                return new e2z(d2zVarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 2:
                return new n2z(parcel.readString(), parcel.readInt() != 0, (m2z) parcel.readParcelable(n2z.class.getClassLoader()));
            case 3:
                return new h2z(g2z.valueOf(parcel.readString()));
            case 4:
                return new i2z(g2z.valueOf(parcel.readString()));
            case 5:
                return new j2z(g2z.valueOf(parcel.readString()));
            case 6:
                return new k2z(g2z.valueOf(parcel.readString()));
            case 7:
                return new l2z(g2z.valueOf(parcel.readString()));
            case 8:
                return new b3z(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 9:
                return new n5z(parcel.readString(), a7z0.CREATOR.createFromParcel(parcel));
            case 10:
                wfz wfzVar = (wfz) parcel.readParcelable(e6z.class.getClassLoader());
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(e6z.class, parcel, arrayList, iM9h, 1);
                }
                return new e6z(wfzVar, arrayList, parcel.readInt() != 0);
            case 11:
                parcel.readInt();
                return f6z.f66516a;
            case 12:
                return new s6z(parcel.readInt());
            case 13:
                return new t6z(parcel.readString());
            case 14:
                k7z k7zVarCreateFromParcel = k7z.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d = 0;
                while (iM31715d != i4) {
                    iM31715d = c7h0.m31715d(j7z.CREATOR, parcel, arrayList2, iM31715d, 1);
                }
                return new l7z(k7zVarCreateFromParcel, opo.m67546C(arrayList2));
            case 15:
                return new j7z(parcel.readString(), parcel.readString());
            case 16:
                return new k7z(parcel.readString());
            case 17:
                return new u7z(parcel.readString());
            case 18:
                return new v7z(parcel.readInt() != 0);
            case 19:
                return new c9z(parcel.readString());
            case 20:
                return new pcz(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (d850) parcel.readParcelable(pcz.class.getClassLoader()));
            case 21:
                return new wfz(parcel.readString(), (vfz) parcel.readParcelable(wfz.class.getClassLoader()));
            case 22:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("VIDEOS")) {
                    i = 1;
                } else {
                    if (!string.equals("PODCAST_AND_EPISODES")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.FlatFilter.Variant.ContentFilter.Type.".concat(string));
                    }
                    i = 2;
                }
                return new sfz(i);
            case 23:
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("ALBUM")) {
                    i2 = 1;
                } else if (string2.equals("ARTIST")) {
                    i2 = 2;
                } else if (string2.equals("AUDIOBOOK")) {
                    i2 = 3;
                } else if (string2.equals("GENRE")) {
                    i2 = 4;
                } else if (string2.equals("PLAYLIST")) {
                    i2 = 5;
                } else if (string2.equals("PROFILE")) {
                    i2 = 6;
                } else {
                    if (!string2.equals("TRACK")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.FlatFilter.Variant.EntityFilter.Type.".concat(string2));
                    }
                    i2 = 7;
                }
                return new tfz(i2);
            case 24:
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("MOST_RECENT")) {
                    return new ufz(1);
                }
                throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.FlatFilter.Variant.UploadDateFilter.Type.".concat(string3));
            case 25:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d2 = 0;
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(wfz.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new yfz(arrayList3);
            case 26:
                return new kgz(parcel.readInt(), parcel.readInt() == 0 ? null : ogz.CREATOR.createFromParcel(parcel));
            case 27:
                return new mgz(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ogz.CREATOR.createFromParcel(parcel) : null);
            case 28:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM31715d3 = 0;
                while (iM31715d3 != i6) {
                    iM31715d3 = c7h0.m31715d(e8o0.CREATOR, parcel, arrayList4, iM31715d3, 1);
                }
                return new ogz(string4, string5, string6, string7, string8, arrayList4, parcel.readString());
            default:
                wgz wgzVar = new wgz(0, 0);
                wgzVar.f251201a = 1;
                wgzVar.f251202b = 0.0f;
                wgzVar.f251203c = 1.0f;
                wgzVar.f251204d = -1;
                wgzVar.f251205e = -1.0f;
                wgzVar.f251206f = -1;
                wgzVar.f251207g = -1;
                wgzVar.f251208h = 16777215;
                wgzVar.f251209i = 16777215;
                wgzVar.f251201a = parcel.readInt();
                wgzVar.f251202b = parcel.readFloat();
                wgzVar.f251203c = parcel.readFloat();
                wgzVar.f251204d = parcel.readInt();
                wgzVar.f251205e = parcel.readFloat();
                wgzVar.f251206f = parcel.readInt();
                wgzVar.f251207g = parcel.readInt();
                wgzVar.f251208h = parcel.readInt();
                wgzVar.f251209i = parcel.readInt();
                wgzVar.f251210t = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) wgzVar).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wgzVar).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wgzVar).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wgzVar).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wgzVar).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) wgzVar).width = parcel.readInt();
                return wgzVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f33497a) {
            case 0:
                return new d2z[i];
            case 1:
                return new e2z[i];
            case 2:
                return new n2z[i];
            case 3:
                return new h2z[i];
            case 4:
                return new i2z[i];
            case 5:
                return new j2z[i];
            case 6:
                return new k2z[i];
            case 7:
                return new l2z[i];
            case 8:
                return new b3z[i];
            case 9:
                return new n5z[i];
            case 10:
                return new e6z[i];
            case 11:
                return new f6z[i];
            case 12:
                return new s6z[i];
            case 13:
                return new t6z[i];
            case 14:
                return new l7z[i];
            case 15:
                return new j7z[i];
            case 16:
                return new k7z[i];
            case 17:
                return new u7z[i];
            case 18:
                return new v7z[i];
            case 19:
                return new c9z[i];
            case 20:
                return new pcz[i];
            case 21:
                return new wfz[i];
            case 22:
                return new sfz[i];
            case 23:
                return new tfz[i];
            case 24:
                return new ufz[i];
            case 25:
                return new yfz[i];
            case 26:
                return new kgz[i];
            case 27:
                return new mgz[i];
            case 28:
                return new ogz[i];
            default:
                return new wgz[i];
        }
    }
}
