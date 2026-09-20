package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class jfd0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111878a;

    public /* synthetic */ jfd0(int i) {
        this.f111878a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.f111878a) {
            case 0:
                return new tfd0(parcel.readLong(), (Uri) parcel.readParcelable(tfd0.class.getClassLoader()), parcel.readLong(), parcel.readInt(), parcel.readInt(), wxd0.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong());
            case 1:
                return new MediaMetadataCompat(parcel);
            case 2:
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("GRANTED")) {
                    i = 1;
                } else if (string.equals("PARTIAL")) {
                    i = 2;
                } else if (string.equals("NOT_DETERMINED")) {
                    i = 3;
                } else {
                    if (!string.equals("DENIED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.mediapicker.impl.mediaprovider.PermissionStatus.".concat(string));
                    }
                    i = 4;
                }
                int i7 = i;
                int i8 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i8);
                int iM31715d = 0;
                while (iM31715d != i8) {
                    iM31715d = c7h0.m31715d(tfd0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                int i9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i9);
                int iM31715d2 = 0;
                while (iM31715d2 != i9) {
                    iM31715d2 = c7h0.m31715d(tfd0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new djd0(i7, arrayList, z, z2, arrayList2, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, wxd0.valueOf(parcel.readString()));
            case 3:
                return new wjd0(parcel.readInt(), parcel.readInt());
            case 4:
                int i10 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i10);
                int iM31715d3 = 0;
                while (iM31715d3 != i10) {
                    iM31715d3 = c7h0.m31715d(akd0.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new bkd0(arrayList3);
            case 5:
                Uri uri = (Uri) parcel.readParcelable(akd0.class.getClassLoader());
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("IMAGE")) {
                    i2 = 1;
                } else {
                    if (!string2.equals("VIDEO")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.mediapicker.api.MediaPickerResult.MediaType.".concat(string2));
                    }
                    i2 = 2;
                }
                return new akd0(i2, uri);
            case 6:
                return new MediaSessionCompat$QueueItem(parcel);
            case 7:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null, 0);
            case 8:
                return ntd0.valueOf(parcel.readString());
            case 9:
                return new std0((aud0) parcel.readParcelable(std0.class.getClassLoader()), parcel.readInt());
            case 10:
                return new aud0(parcel.readString(), (wtd0) parcel.readParcelable(aud0.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : tvd0.valueOf(parcel.readString()), parcel.readString());
            case 11:
                return new ttd0((ztd0) parcel.readParcelable(ttd0.class.getClassLoader()));
            case 12:
                return new utd0((ztd0) parcel.readParcelable(utd0.class.getClassLoader()));
            case 13:
                return new vtd0((ztd0) parcel.readParcelable(vtd0.class.getClassLoader()));
            case 14:
                return new xtd0((pu71) parcel.readParcelable(xtd0.class.getClassLoader()), (pu71) parcel.readParcelable(xtd0.class.getClassLoader()));
            case 15:
                return new ytd0((pu71) parcel.readParcelable(ytd0.class.getClassLoader()));
            case 16:
                return new yud0((uk91) parcel.readParcelable(yud0.class.getClassLoader()), (bes) parcel.readParcelable(yud0.class.getClassLoader()));
            case 17:
                bvd0 bvd0VarCreateFromParcel = bvd0.CREATOR.createFromParcel(parcel);
                int i11 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                zud0 zud0Var = (zud0) parcel.readParcelable(avd0.class.getClassLoader());
                String string3 = parcel.readString();
                yud0 yud0VarCreateFromParcel = yud0.CREATOR.createFromParcel(parcel);
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("START_ONLY")) {
                    i3 = 1;
                } else {
                    if (!string4.equals("DRAGGABLE")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.mediatrimmer.mediatrimmerimpl.MediaTrimmerElement.Props.TrimMode.".concat(string4));
                    }
                    i3 = 2;
                }
                int i13 = i3;
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("SHARE_CLIP")) {
                    i4 = 1;
                } else if (string5.equals("CREATE_CLIP")) {
                    i4 = 2;
                } else {
                    if (!string5.equals("SHARE_PARENT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.mediatrimmer.mediatrimmerimpl.MediaTrimmerElement.Props.PageMode.".concat(string5));
                    }
                    i4 = 3;
                }
                int i14 = i4;
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new avd0(bvd0VarCreateFromParcel, arrayList4, zud0Var, string3, yud0VarCreateFromParcel, i13, i14, z3, parcel.readInt() != 0, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readString(), parcel.readLong(), parcel.readLong(), 49152);
            case 18:
                parcel.readInt();
                return zud0.f286424a;
            case 19:
                int iM9h = 0;
                boolean z4 = parcel.readInt() != 0;
                long j = parcel.readLong();
                int i15 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i15);
                int iM9h2 = 0;
                while (iM9h2 != i15) {
                    iM9h2 = AbstractC0000a.m9h(bvd0.class, parcel, arrayList5, iM9h2, 1);
                }
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i17);
                while (iM9h != i17) {
                    iM9h = AbstractC0000a.m9h(bvd0.class, parcel, arrayList6, iM9h, 1);
                }
                return new bvd0(z4, j, arrayList5, i16, arrayList6, parcel.readString());
            case 20:
                parcel.readInt();
                return xvd0.f266367a;
            case 21:
                return new yvd0(parcel.readString(), parcel.readString(), new t2b0(parcel.readLong(), parcel.readLong()));
            case 22:
                t2b0 t2b0Var = new t2b0(parcel.readLong(), parcel.readLong());
                int i18 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i18);
                int iM31715d4 = 0;
                while (iM31715d4 != i18) {
                    iM31715d4 = c7h0.m31715d(jd71.CREATOR, parcel, arrayList7, iM31715d4, 1);
                }
                return new zvd0(t2b0Var, arrayList7);
            case 23:
                return new fwd0((aud0) parcel.readParcelable(fwd0.class.getClassLoader()));
            case 24:
                return new n6e0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 25:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                AbstractC1683ax abstractC1683ax = (AbstractC1683ax) parcel.readParcelable(hae0.class.getClassLoader());
                String string10 = parcel.readString();
                if (string10 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string10.equals("LOADING")) {
                    i5 = 1;
                } else {
                    if (!string10.equals("READY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.premiumaccountmanagement.memberdetails.mobius.State.".concat(string10));
                    }
                    i5 = 2;
                }
                return new hae0(string6, string7, string8, string9, abstractC1683ax, i5, parcel.readInt(), parcel.readInt() != 0);
            case 26:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                if (string12 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string12.equals("NONE")) {
                    i6 = 1;
                } else {
                    if (!string12.equals("QUICKSILVER")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.premiumaccountmanagement.memberdetails.MemberDetailsEntrySource.".concat(string12));
                    }
                    i6 = 2;
                }
                return new nae0(string11, i6);
            case 27:
                return new bbe0(parcel.readString(), parcel.readString(), parcel.readString(), (jnc1) parcel.readParcelable(bbe0.class.getClassLoader()));
            case 28:
                return new gbe0(parcel.readString());
            default:
                return new obe0(parcel.readString(), (knc1) parcel.readParcelable(obe0.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f111878a) {
            case 0:
                return new tfd0[i];
            case 1:
                return new MediaMetadataCompat[i];
            case 2:
                return new djd0[i];
            case 3:
                return new wjd0[i];
            case 4:
                return new bkd0[i];
            case 5:
                return new akd0[i];
            case 6:
                return new MediaSessionCompat$QueueItem[i];
            case 7:
                return new MediaSessionCompat$Token[i];
            case 8:
                return new ntd0[i];
            case 9:
                return new std0[i];
            case 10:
                return new aud0[i];
            case 11:
                return new ttd0[i];
            case 12:
                return new utd0[i];
            case 13:
                return new vtd0[i];
            case 14:
                return new xtd0[i];
            case 15:
                return new ytd0[i];
            case 16:
                return new yud0[i];
            case 17:
                return new avd0[i];
            case 18:
                return new zud0[i];
            case 19:
                return new bvd0[i];
            case 20:
                return new xvd0[i];
            case 21:
                return new yvd0[i];
            case 22:
                return new zvd0[i];
            case 23:
                return new fwd0[i];
            case 24:
                return new n6e0[i];
            case 25:
                return new hae0[i];
            case 26:
                return new nae0[i];
            case 27:
                return new bbe0[i];
            case 28:
                return new gbe0[i];
            default:
                return new obe0[i];
        }
    }
}
