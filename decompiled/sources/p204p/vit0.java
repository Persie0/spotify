package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class vit0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241789a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f241789a) {
            case 0:
                return new wit0(parcel.readString(), parcel.readString(), (flt0) parcel.readParcelable(wit0.class.getClassLoader()), (i35) parcel.readParcelable(wit0.class.getClassLoader()), parcel.readLong(), parcel.readString(), f35.CREATOR.createFromParcel(parcel), parcel.readString());
            case 1:
                return new blt0(parcel.readString(), parcel.readString());
            case 2:
                return new clt0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new dlt0(parcel.readString());
            case 4:
                return new elt0(parcel.readString());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (string4 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string4.equals("UNSPECIFIED")) {
                    i = 1;
                } else if (string4.equals("PRESET")) {
                    i = 2;
                } else if (string4.equals("USER_PROFILE")) {
                    i = 3;
                } else {
                    if (!string4.equals("USER")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.bluejay.onboarding.customization.steps.questionnaire.QuestionnaireAnswerSource.".concat(string4));
                    }
                    i = 4;
                }
                return new hlt0(i, string, string2, parcel.readInt() != 0, string3);
            case 6:
                return new llt0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new mlt0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 8:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int iM31715d = 0;
                boolean z = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(hlt0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new slt0(string5, string6, string7, numValueOf, z, arrayList, parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
            case 9:
                return new tlt0(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 10:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iM9h = 0;
                while (iM9h != i5) {
                    iM9h = AbstractC0000a.m9h(ult0.class, parcel, arrayList2, iM9h, 1);
                }
                return new ult0(i4, parcel.readString(), arrayList2, parcel.readInt() != 0);
            case 11:
                String string8 = parcel.readString();
                if (string8 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string8.equals("STANDARD")) {
                    i2 = 1;
                } else {
                    if (!string8.equals("ADD_CONFIRMATION_PEEK")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.nowplayingqueue.bottomsheet.page.QueuePresentationIntent.".concat(string8));
                    }
                    i2 = 2;
                }
                return new krt0(i2);
            case 12:
                return new htt0(parcel.readString());
            case 13:
                return new vwt0(parcel.readString());
            case 14:
                parcel.readInt();
                return wwt0.f255836a;
            case 15:
                parcel.readInt();
                return xwt0.f266744a;
            case 16:
                parcel.readInt();
                return ywt0.f277051a;
            case 17:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int iM9h2 = 0;
                while (iM9h2 != i6) {
                    iM9h2 = AbstractC0000a.m9h(oxt0.class, parcel, arrayList3, iM9h2, 1);
                }
                i8b0 i8b0Var = (i8b0) parcel.readParcelable(oxt0.class.getClassLoader());
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                int iM9h3 = 0;
                while (iM9h3 != i7) {
                    iM9h3 = AbstractC0000a.m9h(oxt0.class, parcel, arrayList4, iM9h3, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                int iM9h4 = 0;
                while (iM9h4 != i8) {
                    iM9h4 = AbstractC0000a.m9h(oxt0.class, parcel, arrayList5, iM9h4, 1);
                }
                return new oxt0(string9, string10, string11, string12, arrayList3, i8b0Var, arrayList4, arrayList5, parcel.readInt(), parcel.readInt(), hq00.CREATOR.createFromParcel(parcel), (baa0) parcel.readParcelable(oxt0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new wxt0(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                int iM31715d2 = 0;
                while (iM31715d2 != i9) {
                    iM31715d2 = c7h0.m31715d(zkx0.CREATOR, parcel, arrayList6, iM31715d2, 1);
                }
                return new ryt0(arrayList6, i8b0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 20:
                return new xyt0(parcel.readString());
            case 21:
                return new yyt0(parcel.readString());
            case 22:
                return new zyt0(parcel.readString(), parcel.readString());
            case 23:
                int i10 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i10);
                int iM9h5 = 0;
                while (iM9h5 != i10) {
                    iM9h5 = AbstractC0000a.m9h(qzt0.class, parcel, arrayList7, iM9h5, 1);
                }
                return new qzt0(arrayList7, parcel.readString());
            case 24:
                int i11 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i11);
                int iM31715d3 = 0;
                while (iM31715d3 != i11) {
                    iM31715d3 = c7h0.m31715d(vj80.CREATOR, parcel, arrayList8, iM31715d3, 1);
                }
                return new t0u0(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), arrayList8);
            case 25:
                ArrayList arrayList9 = null;
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList10 = new ArrayList(i12);
                    for (int i13 = 0; i13 != i12; i13++) {
                        int i14 = parcel.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
                        int iM75732f = 0;
                        while (iM75732f != i14) {
                            iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                        }
                        arrayList10.add(linkedHashMap);
                    }
                    arrayList9 = arrayList10;
                }
                return new x3u0(numValueOf2, arrayList9);
            case 26:
                parcel.readInt();
                return a5u0.f12598a;
            case 27:
                return new h5u0(new b450(parcel.readInt(), parcel.readInt(), 1), new b450(parcel.readInt(), parcel.readInt(), 1), parcel.readInt());
            case 28:
                return new b5u0(parcel.readInt(), parcel.readInt());
            default:
                parcel.readInt();
                return c5u0.f34291a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f241789a) {
            case 0:
                return new wit0[i];
            case 1:
                return new blt0[i];
            case 2:
                return new clt0[i];
            case 3:
                return new dlt0[i];
            case 4:
                return new elt0[i];
            case 5:
                return new hlt0[i];
            case 6:
                return new llt0[i];
            case 7:
                return new mlt0[i];
            case 8:
                return new slt0[i];
            case 9:
                return new tlt0[i];
            case 10:
                return new ult0[i];
            case 11:
                return new krt0[i];
            case 12:
                return new htt0[i];
            case 13:
                return new vwt0[i];
            case 14:
                return new wwt0[i];
            case 15:
                return new xwt0[i];
            case 16:
                return new ywt0[i];
            case 17:
                return new oxt0[i];
            case 18:
                return new wxt0[i];
            case 19:
                return new ryt0[i];
            case 20:
                return new xyt0[i];
            case 21:
                return new yyt0[i];
            case 22:
                return new zyt0[i];
            case 23:
                return new qzt0[i];
            case 24:
                return new t0u0[i];
            case 25:
                return new x3u0[i];
            case 26:
                return new a5u0[i];
            case 27:
                return new h5u0[i];
            case 28:
                return new b5u0[i];
            default:
                return new c5u0[i];
        }
    }
}
