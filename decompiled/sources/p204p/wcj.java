package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class wcj implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250059a;

    public /* synthetic */ wcj(int i) {
        this.f250059a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (this.f250059a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i6);
                int iM31715d = 0;
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(bej.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i7 = parcel.readInt();
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                int iM66403q = o7t0.m66403q(parcel.readString());
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("NONE")) {
                    i = 1;
                } else if (string6.equals("EXPLICIT")) {
                    i = 2;
                } else {
                    if (!string6.equals("OVER_19_ONLY")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.allboarding.allboardingdomain.model.ContentRestriction.".concat(string6));
                    }
                    i = 3;
                }
                return new bej(string, string2, arrayList, arrayListCreateStringArrayList, i7, string3, z, string4, string5, z2, iM66403q, i);
            case 1:
                return new idj((hdj) parcel.readParcelable(idj.class.getClassLoader()));
            case 2:
                parcel.readInt();
                return xcj.f260243a;
            case 3:
                parcel.readInt();
                return ycj.f271506a;
            case 4:
                return new zcj(parcel.readLong());
            case 5:
                parcel.readInt();
                return adj.f14637a;
            case 6:
                parcel.readInt();
                return bdj.f26117a;
            case 7:
                parcel.readInt();
                return cdj.f36897a;
            case 8:
                return new ddj(pla1.CREATOR.createFromParcel(parcel));
            case 9:
                parcel.readInt();
                return edj.f58528a;
            case 10:
                parcel.readInt();
                return fdj.f68510a;
            case 11:
                return new gdj(pla1.CREATOR.createFromParcel(parcel));
            case 12:
                return new jdj(parcel.readString(), parcel.readString());
            case 13:
                return new kdj(parcel.readString(), parcel.readInt() == 0 ? null : sfx0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 14:
                return new wdj(parcel.readString(), (rv01) parcel.readParcelable(wdj.class.getClassLoader()), parcel.readString(), (vdj) parcel.readParcelable(wdj.class.getClassLoader()), parcel.readInt() == 0 ? null : nsk0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 15:
                return new qdj(parcel.readString(), parcel.readString());
            case 16:
                return new rdj(parcel.readString());
            case 17:
                return new sdj(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new tdj(parcel.readString());
            case 19:
                return new udj(parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                return new xdj(parcel.readString(), parcel.readInt() != 0);
            case 21:
                String string7 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i8);
                int iM31715d2 = 0;
                while (iM31715d2 != i8) {
                    iM31715d2 = c7h0.m31715d(zdj.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                return new aej(string7, arrayList2, parcel.readInt() != 0);
            case 22:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                if (string9 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string9.equals("IMAGE")) {
                    i2 = 1;
                } else {
                    if (!string9.equals("VIDEO")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.campfire.models.Content.UserGeneratedContent.MediaItem.MediaType.".concat(string9));
                    }
                    i2 = 2;
                }
                return new zdj(string8, i2, parcel.readInt() == 0 ? null : tfx0.CREATOR.createFromParcel(parcel));
            case 23:
                parcel.readInt();
                return iej.f101421a;
            case 24:
                parcel.readInt();
                return jej.f111608a;
            case 25:
                parcel.readInt();
                return kej.f121896a;
            case 26:
                jmj jmjVar = new jmj();
                String string10 = parcel.readString();
                int i9 = 0;
                if (TextUtils.isEmpty(string10)) {
                    i3 = 0;
                } else {
                    int[] iArrM38551G = edb.m38551G(24);
                    int length = iArrM38551G.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            i3 = iArrM38551G[i10];
                            if (!pi9.m70093r(i3).equalsIgnoreCase(string10)) {
                                i10++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                }
                jmjVar.f113890a = i3;
                jmjVar.f113891b = (Double) parcel.readSerializable();
                jmjVar.f113892c = (Double) parcel.readSerializable();
                String string11 = parcel.readString();
                if (TextUtils.isEmpty(string11)) {
                    i4 = 0;
                } else {
                    int[] iArrM38551G2 = edb.m38551G(178);
                    int length2 = iArrM38551G2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            i4 = iArrM38551G2[i11];
                            if (!ptl.m70980a(i4).equals(string11)) {
                                i11++;
                            }
                        } else {
                            i4 = 0;
                        }
                    }
                }
                jmjVar.f113893d = i4;
                jmjVar.f113894e = parcel.readString();
                jmjVar.f113895f = parcel.readString();
                jmjVar.f113896g = parcel.readString();
                String string12 = parcel.readString();
                if (TextUtils.isEmpty(string12)) {
                    i5 = 0;
                } else {
                    int[] iArrM38551G3 = edb.m38551G(21);
                    int length3 = iArrM38551G3.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length3) {
                            i5 = iArrM38551G3[i12];
                            if (!m5p0.m60872d(i5).equalsIgnoreCase(string12)) {
                                i12++;
                            }
                        } else {
                            i5 = 0;
                        }
                    }
                }
                jmjVar.f113897h = i5;
                String string13 = parcel.readString();
                if (!TextUtils.isEmpty(string13)) {
                    for (int i13 : edb.m38551G(8)) {
                        if (ydj.m93459r(i13).equalsIgnoreCase(string13)) {
                            i9 = i13;
                        }
                    }
                }
                jmjVar.f113898i = i9;
                jmjVar.f113899t = parcel.readString();
                jmjVar.f113887X = (Double) parcel.readSerializable();
                jmjVar.f113888Y = (Double) parcel.readSerializable();
                jmjVar.f113889Z = (Integer) parcel.readSerializable();
                jmjVar.f113877L0 = (Double) parcel.readSerializable();
                jmjVar.f113878M0 = parcel.readString();
                jmjVar.f113879N0 = parcel.readString();
                jmjVar.f113880O0 = parcel.readString();
                jmjVar.f113881P0 = parcel.readString();
                jmjVar.f113882Q0 = parcel.readString();
                jmjVar.f113883R0 = (Double) parcel.readSerializable();
                jmjVar.f113884S0 = (Double) parcel.readSerializable();
                jmjVar.f113885T0.addAll((ArrayList) parcel.readSerializable());
                jmjVar.f113886U0.putAll((HashMap) parcel.readSerializable());
                return jmjVar;
            case 27:
                return new anj(parcel.readInt(), parcel.readInt());
            case 28:
                int iM0A = AbstractC0000a.m0A(parcel.readString());
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                int iM9h = 0;
                while (iM9h != i14) {
                    iM9h = AbstractC0000a.m9h(bnj.class, parcel, arrayList3, iM9h, 1);
                }
                return new bnj(iM0A, arrayList3);
            default:
                return new cnj((bej) parcel.readParcelable(cnj.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f250059a) {
            case 0:
                return new bej[i];
            case 1:
                return new idj[i];
            case 2:
                return new xcj[i];
            case 3:
                return new ycj[i];
            case 4:
                return new zcj[i];
            case 5:
                return new adj[i];
            case 6:
                return new bdj[i];
            case 7:
                return new cdj[i];
            case 8:
                return new ddj[i];
            case 9:
                return new edj[i];
            case 10:
                return new fdj[i];
            case 11:
                return new gdj[i];
            case 12:
                return new jdj[i];
            case 13:
                return new kdj[i];
            case 14:
                return new wdj[i];
            case 15:
                return new qdj[i];
            case 16:
                return new rdj[i];
            case 17:
                return new sdj[i];
            case 18:
                return new tdj[i];
            case 19:
                return new udj[i];
            case 20:
                return new xdj[i];
            case 21:
                return new aej[i];
            case 22:
                return new zdj[i];
            case 23:
                return new iej[i];
            case 24:
                return new jej[i];
            case 25:
                return new kej[i];
            case 26:
                return new jmj[i];
            case 27:
                return new anj[i];
            case 28:
                return new bnj[i];
            default:
                return new cnj[i];
        }
    }
}
