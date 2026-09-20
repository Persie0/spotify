package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes7.dex */
public final class z4l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279261a;

    public /* synthetic */ z4l(int i) {
        this.f279261a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f279261a) {
            case 0:
                iwm0 iwm0VarCreateFromParcel = iwm0.CREATOR.createFromParcel(parcel);
                lc2 lc2VarCreateFromParcel = lc2.CREATOR.createFromParcel(parcel);
                d0n0 d0n0VarCreateFromParcel = d0n0.CREATOR.createFromParcel(parcel);
                dlx dlxVar = (dlx) parcel.readParcelable(a5l.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    i2 = 0;
                } else {
                    String string = parcel.readString();
                    if (string == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string.equals("MaxChildrenReached")) {
                        i = 1;
                    } else if (string.equals("ParentalAge")) {
                        i = 2;
                    } else {
                        if (!string.equals("NotAllowed")) {
                            throw new IllegalArgumentException("No enum constant com.spotify.genalpha.entities.DenialReason.".concat(string));
                        }
                        i = 3;
                    }
                    i2 = i;
                }
                return new a5l(iwm0VarCreateFromParcel, lc2VarCreateFromParcel, d0n0VarCreateFromParcel, dlxVar, i2, parcel.readInt() != 0);
            case 1:
                return new l5l(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ney0 ney0VarCreateFromParcel = parcel.readInt() == 0 ? null : ney0.CREATOR.createFromParcel(parcel);
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(s151.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new d6l(string2, string3, arrayListCreateStringArrayList, ney0VarCreateFromParcel, arrayList);
            case 3:
                String string4 = parcel.readString();
                e4r0 e4r0VarCreateFromParcel = e4r0.CREATOR.createFromParcel(parcel);
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d2 = 0;
                int iM9h = 0;
                while (iM9h != i4) {
                    iM9h = AbstractC0000a.m9h(e6l.class, parcel, arrayList2, iM9h, 1);
                }
                dsc1 dsc1VarCreateFromParcel = dsc1.CREATOR.createFromParcel(parcel);
                ney0 ney0VarCreateFromParcel2 = ney0.CREATOR.createFromParcel(parcel);
                boolean z = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iM31715d2 != i5) {
                    iM31715d2 = c7h0.m31715d(ogv0.CREATOR, parcel, arrayList3, iM31715d2, 1);
                }
                return new e6l(string4, e4r0VarCreateFromParcel, arrayList2, dsc1VarCreateFromParcel, ney0VarCreateFromParcel2, z, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : ol21.valueOf(parcel.readString()));
            case 4:
                return new s7l(parcel.readString(), parcel.readString(), gt01.CREATOR.createFromParcel(parcel));
            case 5:
                return new h9l(parcel.readString());
            case 6:
                return new ebl(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new qbl(parcel.readString(), parcel.readString(), (obl) parcel.readParcelable(qbl.class.getClassLoader()));
            case 8:
                return new mbl(parcel.createStringArrayList(), parcel.readInt() != 0);
            case 9:
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM31715d3 = 0;
                while (iM31715d3 != i6) {
                    iM31715d3 = c7h0.m31715d(pbl.CREATOR, parcel, arrayList4, iM31715d3, 1);
                }
                return new nbl(z2, z3, z4, arrayList4, parcel.createStringArrayList(), (i490) parcel.readParcelable(nbl.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 10:
                return new pbl(parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                return new sbl(parcel.readString());
            case 12:
                return new ecl(parcel.readString());
            case 13:
                return new fcl(parcel.readString(), parcel.readString());
            case 14:
                return new ndl(parcel.readString(), parcel.readString());
            case 15:
                parcel.readInt();
                return hfl.f90753a;
            case 16:
                return new ifl(parcel.readInt() != 0);
            case 17:
                return new jfl(parcel.readInt());
            case 18:
                return new yhl(parcel.readString());
            case 19:
                return new zhl(parcel.readString());
            case 20:
                return new ail(parcel.readString());
            case 21:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                int iM31715d4 = 0;
                while (iM31715d4 != i9) {
                    iM31715d4 = c7h0.m31715d(v940.CREATOR, parcel, arrayList5, iM31715d4, 1);
                }
                return new hil(i7, i8, arrayList5, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : w28.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? vw5.CREATOR.createFromParcel(parcel) : null);
            case 22:
                return new ekl(parcel.readString(), (j6y) parcel.readParcelable(ekl.class.getClassLoader()), parcel.readInt() != 0);
            case 23:
                return new ikl(ekl.CREATOR.createFromParcel(parcel));
            case 24:
                return new jkl(ekl.CREATOR.createFromParcel(parcel), skl.CREATOR.createFromParcel(parcel));
            case 25:
                int i10 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i10);
                int iM31715d5 = 0;
                while (iM31715d5 != i10) {
                    iM31715d5 = c7h0.m31715d(ekl.CREATOR, parcel, arrayList6, iM31715d5, 1);
                }
                return new kkl(parcel.readInt(), arrayList6, (gh00) parcel.readSerializable());
            case 26:
                int i11 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i11);
                int iM31715d6 = 0;
                while (iM31715d6 != i11) {
                    iM31715d6 = c7h0.m31715d(ekl.CREATOR, parcel, arrayList7, iM31715d6, 1);
                }
                return new lkl(parcel.readInt(), arrayList7, (gh00) parcel.readSerializable());
            case 27:
                int i12 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i12);
                int iM31715d7 = 0;
                while (iM31715d7 != i12) {
                    iM31715d7 = c7h0.m31715d(ekl.CREATOR, parcel, arrayList8, iM31715d7, 1);
                }
                return new mkl(arrayList8);
            case 28:
                parcel.readInt();
                return nkl.f154894a;
            default:
                return new okl(ekl.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f279261a) {
            case 0:
                return new a5l[i];
            case 1:
                return new l5l[i];
            case 2:
                return new d6l[i];
            case 3:
                return new e6l[i];
            case 4:
                return new s7l[i];
            case 5:
                return new h9l[i];
            case 6:
                return new ebl[i];
            case 7:
                return new qbl[i];
            case 8:
                return new mbl[i];
            case 9:
                return new nbl[i];
            case 10:
                return new pbl[i];
            case 11:
                return new sbl[i];
            case 12:
                return new ecl[i];
            case 13:
                return new fcl[i];
            case 14:
                return new ndl[i];
            case 15:
                return new hfl[i];
            case 16:
                return new ifl[i];
            case 17:
                return new jfl[i];
            case 18:
                return new yhl[i];
            case 19:
                return new zhl[i];
            case 20:
                return new ail[i];
            case 21:
                return new hil[i];
            case 22:
                return new ekl[i];
            case 23:
                return new ikl[i];
            case 24:
                return new jkl[i];
            case 25:
                return new kkl[i];
            case 26:
                return new lkl[i];
            case 27:
                return new mkl[i];
            case 28:
                return new nkl[i];
            default:
                return new okl[i];
        }
    }
}
