package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class vnp0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243193a;

    public /* synthetic */ vnp0(int i) {
        this.f243193a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Boolean boolValueOf;
        switch (this.f243193a) {
            case 0:
                return new wnp0(parcel.readString());
            case 1:
                String string = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i2);
                int iM31715d = 0;
                while (iM31715d != i2) {
                    iM31715d = c7h0.m31715d(efz0.CREATOR, parcel, arrayList5, iM31715d, 1);
                }
                return new lqp0(string, charSequence, string2, z, z2, arrayList5, parcel.readInt() != 0);
            case 2:
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                int iM64020m = 0;
                while (iM64020m != i3) {
                    iM64020m = nap.m64020m(parcel, linkedHashSet, iM64020m, 1);
                }
                return new drp0(linkedHashSet);
            case 3:
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i4);
                int iM64020m2 = 0;
                while (iM64020m2 != i4) {
                    iM64020m2 = nap.m64020m(parcel, linkedHashSet2, iM64020m2, 1);
                }
                return new erp0(linkedHashSet2);
            case 4:
                return new krp0(parcel.readString(), parcel.readString(), lnn0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 5:
                return new lrp0(parcel.readString(), lnn0.valueOf(parcel.readString()), parcel.readString());
            case 6:
                parcel.readInt();
                return qwp0.f193396a;
            case 7:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                eks eksVarCreateFromParcel = eks.CREATOR.createFromParcel(parcel);
                boolean z3 = true;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new pzp0(string3, string4, eksVarCreateFromParcel, z3, parcel.readInt() != 0, parcel.readInt() != 0 ? z3 : false, ou71.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z3 : false, parcel.readString(), osc.CREATOR.createFromParcel(parcel));
            case 8:
                return new k0q0((voc1) parcel.readParcelable(k0q0.class.getClassLoader()), parcel.readInt() != 0);
            case 9:
                return new s3q0(parcel.readString(), parcel.readString());
            case 10:
                parcel.readInt();
                return a6q0.f12841a;
            case 11:
                return new b6q0(parcel.readDouble(), parcel.readDouble());
            case 12:
                parcel.readInt();
                return cbq0.f36184a;
            case 13:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (string6 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string6.equals("ALBUM")) {
                    i = 1;
                } else if (string6.equals("BOOK")) {
                    i = 2;
                } else {
                    if (!string6.equals("UNRECOGNIZED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.PreReleaseExtraInfo.Type.".concat(string6));
                    }
                    i = 3;
                }
                return new ncq0(string5, i);
            case 14:
                return new hgq0(parcel.readString());
            case 15:
                return new igq0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new kiq0(parcel.readString(), parcel.readString());
            case 17:
                return new yiq0((voc1) parcel.readParcelable(yiq0.class.getClassLoader()), parcel.readInt());
            case 18:
                return new qjq0(parcel.readString(), (e1e) parcel.readParcelable(qjq0.class.getClassLoader()), parcel.readInt() != 0);
            case 19:
                return new ikq0((rkq0) parcel.readParcelable(ikq0.class.getClassLoader()));
            case 20:
                parcel.readInt();
                return okq0.f166655a;
            case 21:
                parcel.readInt();
                return pkq0.f178512a;
            case 22:
                parcel.readInt();
                return qkq0.f189634a;
            case 23:
                return new glq0(parcel.readString(), parcel.readString(), (x9r0) parcel.readParcelable(glq0.class.getClassLoader()), parcel.readInt() != 0);
            case 24:
                return new kqq0(parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                return new kwq0(parcel.readString());
            case 26:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                kcd1 kcd1VarCreateFromParcel = parcel.readInt() == 0 ? null : kcd1.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i5 = parcel.readInt();
                    arrayList = new ArrayList(i5);
                    int iM31715d2 = 0;
                    while (iM31715d2 != i5) {
                        iM31715d2 = c7h0.m31715d(gxq0.CREATOR, parcel, arrayList, iM31715d2, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i6 = parcel.readInt();
                    arrayList2 = new ArrayList(i6);
                    int iM31715d3 = 0;
                    while (iM31715d3 != i6) {
                        iM31715d3 = c7h0.m31715d(mgd1.CREATOR, parcel, arrayList2, iM31715d3, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i7 = parcel.readInt();
                    arrayList3 = new ArrayList(i7);
                    int iM31715d4 = 0;
                    while (iM31715d4 != i7) {
                        iM31715d4 = c7h0.m31715d(xgy.CREATOR, parcel, arrayList3, iM31715d4, 1);
                    }
                }
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i8 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i8);
                    int iM31715d5 = 0;
                    while (iM31715d5 != i8) {
                        iM31715d5 = c7h0.m31715d(sie0.CREATOR, parcel, arrayList6, iM31715d5, 1);
                    }
                    arrayList4 = arrayList6;
                }
                return new owq0(string7, string8, kcd1VarCreateFromParcel, arrayList, arrayList2, arrayList3, string9, string10, arrayList4, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : ch90.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 27:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z4 = true;
                String string13 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new gxq0(string11, string12, arrayListCreateStringArrayList, boolValueOf, string13, z4);
            case 28:
                return new tzq0((zzq0) parcel.readParcelable(tzq0.class.getClassLoader()));
            default:
                parcel.readInt();
                return uzq0.f235620a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f243193a) {
            case 0:
                return new wnp0[i];
            case 1:
                return new lqp0[i];
            case 2:
                return new drp0[i];
            case 3:
                return new erp0[i];
            case 4:
                return new krp0[i];
            case 5:
                return new lrp0[i];
            case 6:
                return new qwp0[i];
            case 7:
                return new pzp0[i];
            case 8:
                return new k0q0[i];
            case 9:
                return new s3q0[i];
            case 10:
                return new a6q0[i];
            case 11:
                return new b6q0[i];
            case 12:
                return new cbq0[i];
            case 13:
                return new ncq0[i];
            case 14:
                return new hgq0[i];
            case 15:
                return new igq0[i];
            case 16:
                return new kiq0[i];
            case 17:
                return new yiq0[i];
            case 18:
                return new qjq0[i];
            case 19:
                return new ikq0[i];
            case 20:
                return new okq0[i];
            case 21:
                return new pkq0[i];
            case 22:
                return new qkq0[i];
            case 23:
                return new glq0[i];
            case 24:
                return new kqq0[i];
            case 25:
                return new kwq0[i];
            case 26:
                return new owq0[i];
            case 27:
                return new gxq0[i];
            case 28:
                return new tzq0[i];
            default:
                return new uzq0[i];
        }
    }
}
