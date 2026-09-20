package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class pq50 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180196a;

    public /* synthetic */ pq50(int i) {
        this.f180196a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        switch (this.f180196a) {
            case 0:
                return new qq50(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                return new sq50(parcel.readString(), parcel.readString());
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int iM31715d = 0;
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(sq50.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                return new tq50(string, string2, string3, string4, string5, string6, arrayList, z, z2, z3, z4);
            case 3:
                return new sv50(hk80.CREATOR.createFromParcel(parcel), parcel.readString());
            case 4:
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                b450 b450Var = new b450(parcel.readInt(), parcel.readInt(), 1);
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                int iM31715d2 = 0;
                while (iM31715d2 != i6) {
                    iM31715d2 = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                int iM31715d3 = 0;
                while (iM31715d3 != i7) {
                    iM31715d3 = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                int iM9h = 0;
                while (iM9h != i8) {
                    iM9h = AbstractC0000a.m9h(vv50.class, parcel, arrayList4, iM9h, 1);
                }
                return new vv50(i4, i5, b450Var, arrayList2, arrayList3, arrayList4, parcel.readInt() != 0, parcel.readInt());
            case 5:
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                b450 b450Var2 = new b450(parcel.readInt(), parcel.readInt(), 1);
                int i11 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i11);
                int iM9h2 = 0;
                int iM31715d4 = 0;
                while (iM31715d4 != i11) {
                    iM31715d4 = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList5, iM31715d4, 1);
                }
                int i12 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i12);
                int iM31715d5 = 0;
                while (iM31715d5 != i12) {
                    iM31715d5 = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList6, iM31715d5, 1);
                }
                int i13 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i13);
                while (iM9h2 != i13) {
                    iM9h2 = AbstractC0000a.m9h(wv50.class, parcel, arrayList7, iM9h2, 1);
                }
                return new wv50(i9, i10, b450Var2, arrayList5, arrayList6, arrayList7, parcel.readInt());
            case 6:
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                int iM9h3 = 0;
                while (iM9h3 != i15) {
                    iM9h3 = AbstractC0000a.m9h(xv50.class, parcel, arrayList8, iM9h3, 1);
                }
                return new xv50(i14, arrayList8);
            case 7:
                return new yv50(parcel.readString());
            case 8:
                return new zv50((dw50) parcel.readParcelable(zv50.class.getClassLoader()));
            case 9:
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                b450 b450Var3 = new b450(parcel.readInt(), parcel.readInt(), 1);
                int i18 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i18);
                int iM31715d6 = 0;
                while (iM31715d6 != i18) {
                    iM31715d6 = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList9, iM31715d6, 1);
                }
                return new aw50(i16, i17, b450Var3, arrayList9, parcel.readInt() != 0);
            case 10:
                int i19 = parcel.readInt();
                int i20 = parcel.readInt();
                b450 b450Var4 = new b450(parcel.readInt(), parcel.readInt(), 1);
                int i21 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i21);
                int iM31715d7 = 0;
                while (iM31715d7 != i21) {
                    iM31715d7 = c7h0.m31715d(bpe1.CREATOR, parcel, arrayList10, iM31715d7, 1);
                }
                return new bw50(i19, i20, b450Var4, arrayList10, parcel.readInt() != 0);
            case 11:
                parcel.readInt();
                return cw50.f42648a;
            case 12:
                Parcelable.Creator<t7y> creator = t7y.CREATOR;
                return new iy50(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 13:
                return new ky50(iy50.CREATOR.createFromParcel(parcel));
            case 14:
                String string7 = parcel.readString();
                if (string7 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string7.equals("HOST")) {
                    i = 1;
                } else {
                    if (!string7.equals("PARTICIPANT")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.jam.features.jaminvitelearnmorepage.impl.page.JamInviteLearnMorePageParameters.ViewerContextType.".concat(string7));
                    }
                    i = 2;
                }
                int i22 = i;
                int iM67605x = oq40.m67605x(parcel.readString());
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                boolean z5 = true;
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new g060(z5, parcel.readInt() != 0, i22, string8, string9, iM67605x);
            case 15:
                return new z060(parcel.readString(), parcel.readString());
            case 16:
                return new a460(parcel.readString());
            case 17:
                return new sf60(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 18:
                return new fg60(hg60.valueOf(parcel.readString()));
            case 19:
                return new gg60(fg60.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : zq9.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? zq9.CREATOR.createFromParcel(parcel) : null);
            case 20:
                return new sh60((aum0) parcel.readParcelable(sh60.class.getClassLoader()), wj60.valueOf(parcel.readString()));
            case 21:
                return new bs60(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
            case 22:
                return new et60(parcel);
            case 23:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                if (string11 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string11.equals("NOT_CHECKED")) {
                    i2 = 1;
                } else if (string11.equals("DATE_INVALID")) {
                    i2 = 2;
                } else {
                    if (!string11.equals("VALID")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.genalphaaccountcreation.birthday.page.mobius.DateValidationState.".concat(string11));
                    }
                    i2 = 3;
                }
                return new u070(string10, i2, inc1.valueOf(parcel.readString()));
            case 24:
                return new t170((b370) parcel.readParcelable(t170.class.getClassLoader()));
            case 25:
                return new u170(parcel.readInt(), parcel.readInt(), (agr0) parcel.readParcelable(u170.class.getClassLoader()), (dlx) parcel.readParcelable(u170.class.getClassLoader()));
            case 26:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                d0n0 d0n0Var = (d0n0) parcel.readParcelable(w170.class.getClassLoader());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z6 = true;
                }
                return new w170(string12, string13, string14, d0n0Var, string15, string16, z6, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), (cza0) parcel.readParcelable(w170.class.getClassLoader()), (b370) parcel.readParcelable(w170.class.getClassLoader()), (agr0) parcel.readParcelable(w170.class.getClassLoader()));
            case 27:
                return new k270((lzm0) parcel.readParcelable(k270.class.getClassLoader()), (lzm0) parcel.readParcelable(k270.class.getClassLoader()), (b370) parcel.readParcelable(k270.class.getClassLoader()), (dlx) parcel.readParcelable(k270.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 28:
                return new o270((d0n0) parcel.readParcelable(o270.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (b370) parcel.readParcelable(o270.class.getClassLoader()), (dlx) parcel.readParcelable(o270.class.getClassLoader()));
            default:
                parcel.readInt();
                return v270.f236557a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f180196a) {
            case 0:
                return new qq50[i];
            case 1:
                return new sq50[i];
            case 2:
                return new tq50[i];
            case 3:
                return new sv50[i];
            case 4:
                return new vv50[i];
            case 5:
                return new wv50[i];
            case 6:
                return new xv50[i];
            case 7:
                return new yv50[i];
            case 8:
                return new zv50[i];
            case 9:
                return new aw50[i];
            case 10:
                return new bw50[i];
            case 11:
                return new cw50[i];
            case 12:
                return new iy50[i];
            case 13:
                return new ky50[i];
            case 14:
                return new g060[i];
            case 15:
                return new z060[i];
            case 16:
                return new a460[i];
            case 17:
                return new sf60[i];
            case 18:
                return new fg60[i];
            case 19:
                return new gg60[i];
            case 20:
                return new sh60[i];
            case 21:
                return new bs60[i];
            case 22:
                return new et60[i];
            case 23:
                return new u070[i];
            case 24:
                return new t170[i];
            case 25:
                return new u170[i];
            case 26:
                return new w170[i];
            case 27:
                return new k270[i];
            case 28:
                return new o270[i];
            default:
                return new v270[i];
        }
    }
}
