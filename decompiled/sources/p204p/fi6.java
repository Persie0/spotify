package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class fi6 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69798a;

    public /* synthetic */ fi6(int i) {
        this.f69798a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f69798a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string2.equals("TOP_TRACKS")) {
                    i = 1;
                } else if (string2.equals("ALBUMS")) {
                    i = 2;
                } else if (string2.equals("SINGLES")) {
                    i = 3;
                } else {
                    if (!string2.equals("APPEARS_ON")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.assistedcuration.searchpage.pages.entitypage.AssistedCurationSearchEntity.SeeAll.Category.".concat(string2));
                    }
                    i = 4;
                }
                return new gi6(string, i);
            case 1:
                return new hi6((qq50) parcel.readParcelable(hi6.class.getClassLoader()));
            case 2:
                return new li6(parcel.readString(), parcel.readString(), parcel.readString(), (ii6) parcel.readParcelable(li6.class.getClassLoader()), (ui6) parcel.readParcelable(li6.class.getClassLoader()));
            case 3:
                return new oi6(parcel.readString(), (ui6) parcel.readParcelable(oi6.class.getClassLoader()), (ii6) parcel.readParcelable(oi6.class.getClassLoader()));
            case 4:
                String string3 = parcel.readString();
                kyy kyyVarValueOf = kyy.valueOf(parcel.readString());
                ii6 ii6Var = (ii6) parcel.readParcelable(qi6.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iM9h = 0;
                int iM9h2 = 0;
                while (iM9h2 != i2) {
                    iM9h2 = AbstractC0000a.m9h(qi6.class, parcel, arrayList, iM9h2, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(qi6.class, parcel, arrayList2, iM9h, 1);
                }
                return new qi6(string3, kyyVarValueOf, ii6Var, arrayList, arrayList2);
            case 5:
                return ui6.valueOf(parcel.readString());
            case 6:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                ui6 ui6Var = (ui6) parcel.readParcelable(xi6.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM9h3 = 0;
                while (iM9h3 != i4) {
                    iM9h3 = AbstractC0000a.m9h(xi6.class, parcel, arrayList3, iM9h3, 1);
                }
                return new xi6(string4, string5, string6, ui6Var, arrayList3);
            case 7:
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iM9h4 = 0;
                while (iM9h4 != i5) {
                    iM9h4 = AbstractC0000a.m9h(yi6.class, parcel, arrayList4, iM9h4, 1);
                }
                return new yi6(arrayList4, parcel.readString());
            case 8:
                String string7 = parcel.readString();
                ui6 ui6VarCreateFromParcel = ui6.CREATOR.createFromParcel(parcel);
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iM9h5 = 0;
                while (iM9h5 != i6) {
                    iM9h5 = AbstractC0000a.m9h(zi6.class, parcel, arrayList5, iM9h5, 1);
                }
                return new zi6(string7, ui6VarCreateFromParcel, arrayList5);
            case 9:
                return new tk6(parcel.readString());
            case 10:
                return new uk6(parcel.readString(), parcel.readString());
            case 11:
                parcel.readInt();
                return ko6.f124546a;
            case 12:
                return new xp6(parcel.readString());
            case 13:
                parcel.readInt();
                return xu6.f266010a;
            case 14:
                return new yu6(parcel.readString(), (om01) parcel.readParcelable(yu6.class.getClassLoader()));
            case 15:
                parcel.readInt();
                return zu6.f286354a;
            case 16:
                return new cv6(parcel.readString(), parcel.readString(), (gcr0) parcel.readParcelable(cv6.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), (sr01) parcel.readParcelable(cv6.class.getClassLoader()), (av6) parcel.readParcelable(cv6.class.getClassLoader()), 256);
            case 17:
                return new dv6((gcr0) parcel.readParcelable(dv6.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new dw6((sr01) parcel.readParcelable(dw6.class.getClassLoader()), stz0.m79365s(parcel.readString()), (gcr0) parcel.readParcelable(dw6.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(dw6.class.getClassLoader()), parcel.readString(), parcel.readString(), (nu71) parcel.readParcelable(dw6.class.getClassLoader()), (nu71) parcel.readParcelable(dw6.class.getClassLoader()), parcel.readString(), null);
            case 19:
                return new fw6((gcr0) parcel.readParcelable(fw6.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (om01) parcel.readParcelable(fw6.class.getClassLoader()), parcel.readString(), parcel.readString(), (nu71) parcel.readParcelable(fw6.class.getClassLoader()), (nu71) parcel.readParcelable(fw6.class.getClassLoader()), parcel.readString());
            case 20:
                String string8 = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                eks eksVarCreateFromParcel = eks.CREATOR.createFromParcel(parcel);
                String string9 = parcel.readString();
                ou71 ou71VarCreateFromParcel = ou71.CREATOR.createFromParcel(parcel);
                boolean z2 = parcel.readInt() != 0 ? true : z;
                qb31 qb31VarCreateFromParcel = qb31.CREATOR.createFromParcel(parcel);
                boolean z3 = parcel.readInt() != 0 ? true : z;
                String string10 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                int iM31715d = 0;
                while (iM31715d != i7) {
                    iM31715d = c7h0.m31715d(pvq.CREATOR, parcel, arrayList6, iM31715d, 1);
                }
                return new rw6(string8, z, eksVarCreateFromParcel, string9, ou71VarCreateFromParcel, z2, qb31VarCreateFromParcel, z3, string10, arrayList6, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, sw6.CREATOR.createFromParcel(parcel));
            case 21:
                return sw6.valueOf(parcel.readString());
            case 22:
                return new qy6(parcel.readString(), parcel.readString());
            case 23:
                String string11 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i8);
                int iM31715d2 = 0;
                while (iM31715d2 != i8) {
                    iM31715d2 = c7h0.m31715d(qy6.CREATOR, parcel, arrayList7, iM31715d2, 1);
                }
                return new ry6(string11, arrayList7);
            case 24:
                return new u17(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C2125mf.CREATOR.createFromParcel(parcel));
            case 25:
                return new w17(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : C2125mf.CREATOR.createFromParcel(parcel));
            case 26:
                return new b67(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 27:
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int iM31715d3 = 0;
                boolean z4 = parcel.readInt() != 0;
                eks eksVarCreateFromParcel2 = eks.CREATOR.createFromParcel(parcel);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                boolean z5 = parcel.readInt() != 0;
                l87 l87Var = (l87) parcel.readValue(n87.class.getClassLoader());
                double d = parcel.readDouble();
                int i9 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i9);
                while (iM31715d3 != i9) {
                    iM31715d3 = c7h0.m31715d(pvq.CREATOR, parcel, arrayList8, iM31715d3, 1);
                }
                return new n87(arrayListCreateStringArrayList, z4, eksVarCreateFromParcel2, string12, string13, z5, l87Var, d, arrayList8);
            case 28:
                return new w87(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                qsj qsjVarValueOf = qsj.valueOf(parcel.readString());
                String string18 = parcel.readString();
                boolean z6 = false;
                boolean z7 = true;
                if (parcel.readInt() != 0) {
                    z6 = true;
                }
                if (parcel.readInt() == 0) {
                    z7 = z6;
                }
                if (parcel.readInt() == 0) {
                    z7 = z6;
                }
                return new w97(string14, string15, charSequence, string16, string17, qsjVarValueOf, string18, z6, z7, z7, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f69798a) {
            case 0:
                return new gi6[i];
            case 1:
                return new hi6[i];
            case 2:
                return new li6[i];
            case 3:
                return new oi6[i];
            case 4:
                return new qi6[i];
            case 5:
                return new ui6[i];
            case 6:
                return new xi6[i];
            case 7:
                return new yi6[i];
            case 8:
                return new zi6[i];
            case 9:
                return new tk6[i];
            case 10:
                return new uk6[i];
            case 11:
                return new ko6[i];
            case 12:
                return new xp6[i];
            case 13:
                return new xu6[i];
            case 14:
                return new yu6[i];
            case 15:
                return new zu6[i];
            case 16:
                return new cv6[i];
            case 17:
                return new dv6[i];
            case 18:
                return new dw6[i];
            case 19:
                return new fw6[i];
            case 20:
                return new rw6[i];
            case 21:
                return new sw6[i];
            case 22:
                return new qy6[i];
            case 23:
                return new ry6[i];
            case 24:
                return new u17[i];
            case 25:
                return new w17[i];
            case 26:
                return new b67[i];
            case 27:
                return new n87[i];
            case 28:
                return new w87[i];
            default:
                return new w97[i];
        }
    }
}
