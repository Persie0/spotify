package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class hbl0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89560a;

    public /* synthetic */ hbl0(int i) {
        this.f89560a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f89560a) {
            case 0:
                return new ibl0(parcel.readInt(), parcel.readInt(), (j3r) parcel.readParcelable(ibl0.class.getClassLoader()), w9j0.CREATOR.createFromParcel(parcel));
            case 1:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(ycl0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new jbl0(opo.m67546C(arrayList), parcel.readString(), (j3r) parcel.readParcelable(jbl0.class.getClassLoader()), w9j0.CREATOR.createFromParcel(parcel));
            case 2:
                return new kbl0(parcel.readInt(), parcel.readInt(), (j3r) parcel.readParcelable(kbl0.class.getClassLoader()), w9j0.CREATOR.createFromParcel(parcel));
            case 3:
                ycl0 ycl0VarCreateFromParcel = ycl0.CREATOR.createFromParcel(parcel);
                j3r j3rVar = (j3r) parcel.readParcelable(lbl0.class.getClassLoader());
                w9j0 w9j0VarCreateFromParcel = w9j0.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                if (string == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string.equals("USER_STATUS_ACTIVE")) {
                    i = 1;
                } else if (string.equals("USER_STATUS_DISABLED")) {
                    i = 2;
                } else {
                    if (!string.equals("USER_STATUS_NOT_ACCEPTED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.share.impl.data.OnPlatformAppDestination.Single.Status.".concat(string));
                    }
                    i = 3;
                }
                return new lbl0(ycl0VarCreateFromParcel, j3rVar, w9j0VarCreateFromParcel, i);
            case 4:
                return new mbl0(parcel.readInt(), parcel.readInt(), (j3r) parcel.readParcelable(mbl0.class.getClassLoader()), w9j0.CREATOR.createFromParcel(parcel));
            case 5:
                return new pbl0(parcel.readInt(), parcel.readInt(), mrx0.m62669w(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 6:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM9h = 0;
                while (true) {
                    boolean z = true;
                    if (iM9h == i3) {
                        String string2 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            z = false;
                        }
                        return new qbl0(arrayList2, string2, z, parcel.readString(), parcel.readInt() != 0, a831.m25028t(parcel.readString()), o7t0.m66402p(parcel.readString()), mrx0.m62669w(parcel.readString()));
                    }
                    iM9h = AbstractC0000a.m9h(qbl0.class, parcel, arrayList2, iM9h, 1);
                }
                break;
            case 7:
                return new rbl0(parcel.readInt(), parcel.readInt(), mrx0.m62669w(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 8:
                return new tbl0(parcel.readInt(), parcel.readInt(), mrx0.m62669w(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 9:
                return new ubl0((pla1) parcel.readParcelable(ubl0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, a831.m25028t(parcel.readString()), o7t0.m66402p(parcel.readString()), mrx0.m62669w(parcel.readString()));
            case 10:
                return new vbl0(parcel.readInt(), parcel.readInt(), mrx0.m62669w(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 11:
                return new ncl0(parcel.readString());
            case 12:
                return new ocl0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (wcl0) parcel.readParcelable(ocl0.class.getClassLoader()), parcel.readInt() == 0 ? null : yea0.CREATOR.createFromParcel(parcel), (ok01) parcel.readParcelable(ocl0.class.getClassLoader()));
            case 13:
                return new pcl0(parcel.readString());
            case 14:
                return new qcl0((pdj) parcel.readParcelable(qcl0.class.getClassLoader()));
            case 15:
                return new rcl0(parcel.readString(), parcel.readString());
            case 16:
                return new scl0(parcel.readString());
            case 17:
                return new tcl0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new ucl0(parcel.readString());
            case 19:
                return new vcl0(parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new ycl0((Uri) parcel.readParcelable(ycl0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 21:
                return new oil0(parcel.readString(), parcel.readString(), yxv.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readString());
            case 22:
                return new akl0(parcel.readString());
            case 23:
                String string3 = parcel.readString();
                f5r f5rVar = (f5r) parcel.readParcelable(gkl0.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM31715d2 = 0;
                while (iM31715d2 != i4) {
                    iM31715d2 = c7h0.m31715d(oil0.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new gkl0(string3, f5rVar, opo.m67546C(arrayList3), 120);
            case 24:
                return new pkl0(parcel.readString(), parcel.readString(), parcel.readBundle(pkl0.class.getClassLoader()));
            case 25:
                return new xkl0(parcel.readString(), parcel.readString());
            case 26:
                return onl0.valueOf(parcel.readString());
            case 27:
                wfz wfzVar = (wfz) parcel.readParcelable(ynl0.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM31715d3 = 0;
                while (iM31715d3 != i5) {
                    iM31715d3 = c7h0.m31715d(qzy0.CREATOR, parcel, arrayList4, iM31715d3, 1);
                }
                return new ynl0(arrayList4, wfzVar);
            case 28:
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iM31715d4 = 0;
                while (iM31715d4 != i6) {
                    iM31715d4 = c7h0.m31715d(qzy0.CREATOR, parcel, arrayList5, iM31715d4, 1);
                }
                return new znl0(arrayList5);
            default:
                return new yol0(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f89560a) {
            case 0:
                return new ibl0[i];
            case 1:
                return new jbl0[i];
            case 2:
                return new kbl0[i];
            case 3:
                return new lbl0[i];
            case 4:
                return new mbl0[i];
            case 5:
                return new pbl0[i];
            case 6:
                return new qbl0[i];
            case 7:
                return new rbl0[i];
            case 8:
                return new tbl0[i];
            case 9:
                return new ubl0[i];
            case 10:
                return new vbl0[i];
            case 11:
                return new ncl0[i];
            case 12:
                return new ocl0[i];
            case 13:
                return new pcl0[i];
            case 14:
                return new qcl0[i];
            case 15:
                return new rcl0[i];
            case 16:
                return new scl0[i];
            case 17:
                return new tcl0[i];
            case 18:
                return new ucl0[i];
            case 19:
                return new vcl0[i];
            case 20:
                return new ycl0[i];
            case 21:
                return new oil0[i];
            case 22:
                return new akl0[i];
            case 23:
                return new gkl0[i];
            case 24:
                return new pkl0[i];
            case 25:
                return new xkl0[i];
            case 26:
                return new onl0[i];
            case 27:
                return new ynl0[i];
            case 28:
                return new znl0[i];
            default:
                return new yol0[i];
        }
    }
}
