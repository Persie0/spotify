package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class lb2 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131489a;

    public /* synthetic */ lb2(int i) {
        this.f131489a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.f131489a) {
            case 0:
                return new mb2((ql50) parcel.readParcelable(mb2.class.getClassLoader()));
            case 1:
                parcel.readInt();
                return nb2.f152163a;
            case 2:
                return new pb2(parcel.readString(), ib2.CREATOR.createFromParcel(parcel), parcel.readString(), (ob2) parcel.readParcelable(pb2.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            case 3:
                return new ic2(parcel.readInt(), parcel.readInt(), parcel.readInt(), (he2) parcel.readParcelable(ic2.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 4:
                return new lc2(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 5:
                parcel.readInt();
                return yc2.f271359a;
            case 6:
                return new de2((ql50) parcel.readParcelable(de2.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return ee2.f58650a;
            case 8:
                parcel.readInt();
                return fe2.f68657a;
            case 9:
                parcel.readInt();
                return ge2.f78993a;
            case 10:
                return new xe2(parcel.readInt(), parcel.readString());
            case 11:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("INITIAL")) {
                    i = 1;
                } else if (string.equals("LOADED")) {
                    i = 2;
                } else if (string.equals("FAILED")) {
                    i = 3;
                } else {
                    if (!string.equals("RETRYING")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.ageverification.dialog.AgeVerificationDialogViewModel.State.".concat(string));
                    }
                    i = 4;
                }
                return new ze2(i, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i7);
                int iM9h = 0;
                while (iM9h != i7) {
                    iM9h = AbstractC0000a.m9h(eh2.class, parcel, arrayList, iM9h, 1);
                }
                return new eh2(i5, i6, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : bdb1.valueOf(parcel.readString()));
            case 13:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                int iM9h2 = 0;
                while (iM9h2 != i10) {
                    iM9h2 = AbstractC0000a.m9h(lh2.class, parcel, arrayList2, iM9h2, 1);
                }
                return new lh2(i8, i9, parcel.readInt(), arrayList2);
            case 14:
                return new zi2(parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                return new yn2(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 16:
                return new zn2(parcel.readLong());
            case 17:
                parcel.readInt();
                return ao2.f17544a;
            case 18:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                int iM9h3 = 0;
                while (iM9h3 != i11) {
                    iM9h3 = AbstractC0000a.m9h(xq2.class, parcel, arrayList3, iM9h3, 1);
                }
                return new xq2(string2, string3, string4, string5, parcel.readInt() != 0, arrayList3);
            case 19:
                String string6 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iM31715d = 0;
                while (iM31715d != i12) {
                    iM31715d = c7h0.m31715d(xq2.CREATOR, parcel, arrayList4, iM31715d, 1);
                }
                return new yq2(string6, arrayList4, l12.f128594h);
            case 20:
                return new zr2(parcel.readString());
            case 21:
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iM31715d2 = 0;
                while (iM31715d2 != i13) {
                    iM31715d2 = c7h0.m31715d(kyv0.CREATOR, parcel, arrayList5, iM31715d2, 1);
                }
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("UNDEFINED")) {
                    i2 = 1;
                } else if (string7.equals("ALBUM")) {
                    i2 = 2;
                } else if (string7.equals("SINGLE")) {
                    i2 = 3;
                } else if (string7.equals("COMPILATION")) {
                    i2 = 4;
                } else if (string7.equals("EP")) {
                    i2 = 5;
                } else if (string7.equals("AUDIOBOOK")) {
                    i2 = 6;
                } else {
                    if (!string7.equals("PODCAST")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.searchview.Album.Type.".concat(string7));
                    }
                    i2 = 7;
                }
                return new iw2(arrayList5, i2, (fw2) parcel.readValue(iw2.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 22:
                return new wx2(mrx0.m62668v(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), qsj.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 23:
                return new uy2(parcel.readString(), (voc1) parcel.readParcelable(uy2.class.getClassLoader()), parcel.readString(), h23.CREATOR.createFromParcel(parcel));
            case 24:
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("EP")) {
                    i3 = 1;
                } else if (string8.equals("ALBUM")) {
                    i3 = 2;
                } else if (string8.equals("SINGLE")) {
                    i3 = 3;
                } else if (string8.equals("COMPILATION")) {
                    i3 = 4;
                } else {
                    if (!string8.equals("UNRECOGNIZED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.AlbumExtraInfo.AlbumType.".concat(string8));
                    }
                    i3 = 5;
                }
                return new h03(parcel.readString(), i3, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                cqj0 cqj0Var = (cqj0) parcel.readParcelable(h23.class.getClassLoader());
                boolean z8 = parcel.readInt() != 0;
                String string9 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("Hide")) {
                    i4 = 1;
                } else if (string10.equals("Show")) {
                    i4 = 2;
                } else {
                    if (!string10.equals("ShowWithPlayability")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.album.contextmenu.AlbumMenuConfiguration.AddToQueueConfiguration.".concat(string10));
                    }
                    i4 = 3;
                }
                return new h23(z, z2, z3, z4, z5, z6, z7, cqj0Var, z8, string9, z9, z10, i4, parcel.readInt() != 0, parcel.readInt() != 0, (waz0) parcel.readParcelable(h23.class.getClassLoader()), parcel.readInt() != 0, (mr20) parcel.readParcelable(h23.class.getClassLoader()));
            case 26:
                return new d33(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 27:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int iM31715d3 = 0;
                boolean z11 = parcel.readInt() != 0;
                String string14 = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                qsj qsjVarValueOf = qsj.valueOf(parcel.readString());
                boolean z13 = parcel.readInt() != 0;
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                while (iM31715d3 != i14) {
                    iM31715d3 = c7h0.m31715d(efz0.CREATOR, parcel, arrayList6, iM31715d3, 1);
                }
                return new x53(string11, string12, string13, z11, string14, z12, qsjVarValueOf, z13, arrayList6, parcel.readString());
            case 28:
                return new zb3(parcel.readInt() != 0, EntryPoint.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            default:
                return new ac3(EntryPoint.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f131489a) {
            case 0:
                return new mb2[i];
            case 1:
                return new nb2[i];
            case 2:
                return new pb2[i];
            case 3:
                return new ic2[i];
            case 4:
                return new lc2[i];
            case 5:
                return new yc2[i];
            case 6:
                return new de2[i];
            case 7:
                return new ee2[i];
            case 8:
                return new fe2[i];
            case 9:
                return new ge2[i];
            case 10:
                return new xe2[i];
            case 11:
                return new ze2[i];
            case 12:
                return new eh2[i];
            case 13:
                return new lh2[i];
            case 14:
                return new zi2[i];
            case 15:
                return new yn2[i];
            case 16:
                return new zn2[i];
            case 17:
                return new ao2[i];
            case 18:
                return new xq2[i];
            case 19:
                return new yq2[i];
            case 20:
                return new zr2[i];
            case 21:
                return new iw2[i];
            case 22:
                return new wx2[i];
            case 23:
                return new uy2[i];
            case 24:
                return new h03[i];
            case 25:
                return new h23[i];
            case 26:
                return new d33[i];
            case 27:
                return new x53[i];
            case 28:
                return new zb3[i];
            default:
                return new ac3[i];
        }
    }
}
