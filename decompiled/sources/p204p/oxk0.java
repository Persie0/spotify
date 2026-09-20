package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class oxk0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f171008a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f171008a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new qxk0(string, string2, string3, z, parcel.readInt() != 0);
            case 1:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(pxk0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new rxk0(arrayList);
            case 2:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d2 = 0;
                while (iM31715d2 != i4) {
                    iM31715d2 = c7h0.m31715d(qxk0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new sxk0(arrayList2);
            case 3:
                return azk0.valueOf(parcel.readString());
            case 4:
                return c0l0.valueOf(parcel.readString());
            case 5:
                return new m0l0(parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new n0l0(parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d3 = 0;
                while (iM31715d3 != i5) {
                    iM31715d3 = c7h0.m31715d(m0l0.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new o0l0(arrayList3);
            case 8:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM31715d4 = 0;
                while (iM31715d4 != i6) {
                    iM31715d4 = c7h0.m31715d(n0l0.CREATOR, parcel, arrayList4, iM31715d4, 1);
                }
                return new p0l0(arrayList4);
            case 9:
                String string4 = parcel.readString();
                v3l0 v3l0VarCreateFromParcel = parcel.readInt() == 0 ? null : v3l0.CREATOR.createFromParcel(parcel);
                rxk0 rxk0VarCreateFromParcel = parcel.readInt() == 0 ? null : rxk0.CREATOR.createFromParcel(parcel);
                o0l0 o0l0VarCreateFromParcel = parcel.readInt() != 0 ? o0l0.CREATOR.createFromParcel(parcel) : null;
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                int iM31715d5 = 0;
                while (iM31715d5 != i7) {
                    iM31715d5 = c7h0.m31715d(cuk0.CREATOR, parcel, arrayList5, iM31715d5, 1);
                }
                return new w1l0(string4, v3l0VarCreateFromParcel, rxk0VarCreateFromParcel, o0l0VarCreateFromParcel, arrayList5);
            case 10:
                String string5 = parcel.readString();
                w3l0 w3l0VarCreateFromParcel = parcel.readInt() == 0 ? null : w3l0.CREATOR.createFromParcel(parcel);
                sxk0 sxk0VarCreateFromParcel = parcel.readInt() == 0 ? null : sxk0.CREATOR.createFromParcel(parcel);
                p0l0 p0l0VarCreateFromParcel = parcel.readInt() != 0 ? p0l0.CREATOR.createFromParcel(parcel) : null;
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                int iM31715d6 = 0;
                while (iM31715d6 != i8) {
                    iM31715d6 = c7h0.m31715d(duk0.CREATOR, parcel, arrayList6, iM31715d6, 1);
                }
                return new x1l0(string5, w3l0VarCreateFromParcel, sxk0VarCreateFromParcel, p0l0VarCreateFromParcel, arrayList6);
            case 11:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("TRACK")) {
                    i = 1;
                } else if (string9.equals("ALBUM")) {
                    i = 2;
                } else if (string9.equals("EPISODE")) {
                    i = 3;
                } else {
                    if (!string9.equals("PLAYLIST")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.search.uiusecases.offlinerow.OfflineRowSearch.Type.".concat(string9));
                    }
                    i = 4;
                }
                return new f2l0(string6, string7, string8, i, mrx0.m62668v(parcel.readString()), qsj.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 12:
                parcel.readInt();
                return j2l0.f108101a;
            case 13:
                return new l2l0(parcel.readInt());
            case 14:
                parcel.readInt();
                return n2l0.f149784a;
            case 15:
                parcel.readInt();
                return p2l0.f173367a;
            case 16:
                parcel.readInt();
                return r2l0.f195167a;
            case 17:
                parcel.readInt();
                return t2l0.f216587a;
            case 18:
                parcel.readInt();
                return v2l0.f236696a;
            case 19:
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("IN_QUEUE")) {
                    i2 = 1;
                } else if (string10.equals("OFFLINE_MODE")) {
                    i2 = 2;
                } else if (string10.equals("NO_CONNECTION")) {
                    i2 = 3;
                } else {
                    if (!string10.equals("SYNC_NOT_ALLOWED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.offline.util.WaitingReason.".concat(string10));
                    }
                    i2 = 4;
                }
                return new x2l0(i2, parcel.readInt());
            case 20:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                int iM31715d7 = 0;
                while (iM31715d7 != i9) {
                    iM31715d7 = c7h0.m31715d(q3l0.CREATOR, parcel, arrayList7, iM31715d7, 1);
                }
                return new m3l0(string11, string12, string13, arrayList7, parcel.readInt() == 0 ? null : o3l0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            case 21:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i10);
                int iM31715d8 = 0;
                while (iM31715d8 != i10) {
                    iM31715d8 = c7h0.m31715d(r3l0.CREATOR, parcel, arrayList8, iM31715d8, 1);
                }
                return new n3l0(string14, string15, string16, arrayList8, parcel.readInt() == 0 ? null : p3l0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            case 22:
                return new o3l0(parcel.readString(), parcel.readString());
            case 23:
                return new p3l0(parcel.readString(), parcel.readString());
            case 24:
                return new q3l0(parcel.readString());
            case 25:
                return new r3l0(parcel.readString());
            case 26:
                int i11 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i11);
                int iM31715d9 = 0;
                while (iM31715d9 != i11) {
                    iM31715d9 = c7h0.m31715d(m3l0.CREATOR, parcel, arrayList9, iM31715d9, 1);
                }
                return new v3l0(arrayList9);
            case 27:
                int i12 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i12);
                int iM31715d10 = 0;
                while (iM31715d10 != i12) {
                    iM31715d10 = c7h0.m31715d(n3l0.CREATOR, parcel, arrayList10, iM31715d10, 1);
                }
                return new w3l0(arrayList10);
            case 28:
                return new z7l0(parcel.readString(), parcel.readString());
            default:
                parcel.readInt();
                return a8l0.f13321a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f171008a) {
            case 0:
                return new qxk0[i];
            case 1:
                return new rxk0[i];
            case 2:
                return new sxk0[i];
            case 3:
                return new azk0[i];
            case 4:
                return new c0l0[i];
            case 5:
                return new m0l0[i];
            case 6:
                return new n0l0[i];
            case 7:
                return new o0l0[i];
            case 8:
                return new p0l0[i];
            case 9:
                return new w1l0[i];
            case 10:
                return new x1l0[i];
            case 11:
                return new f2l0[i];
            case 12:
                return new j2l0[i];
            case 13:
                return new l2l0[i];
            case 14:
                return new n2l0[i];
            case 15:
                return new p2l0[i];
            case 16:
                return new r2l0[i];
            case 17:
                return new t2l0[i];
            case 18:
                return new v2l0[i];
            case 19:
                return new x2l0[i];
            case 20:
                return new m3l0[i];
            case 21:
                return new n3l0[i];
            case 22:
                return new o3l0[i];
            case 23:
                return new p3l0[i];
            case 24:
                return new q3l0[i];
            case 25:
                return new r3l0[i];
            case 26:
                return new v3l0[i];
            case 27:
                return new w3l0[i];
            case 28:
                return new z7l0[i];
            default:
                return new a8l0[i];
        }
    }
}
