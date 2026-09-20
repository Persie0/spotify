package p204p;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class tne1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221959a;

    public /* synthetic */ tne1(int i) {
        this.f221959a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f221959a) {
            case 0:
                return new une1(parcel.readString());
            case 1:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(ur31.valueOf(parcel.readString()));
                }
                return new vne1(arrayList, parcel.readInt() == 0 ? null : ur31.valueOf(parcel.readString()));
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string3 = parcel.readString();
                jev jevVarValueOf = jev.valueOf(parcel.readString());
                String string4 = parcel.readString();
                n4y n4yVar = (n4y) parcel.readParcelable(bpe1.class.getClassLoader());
                String string5 = parcel.readString();
                if (string5 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string5.equals("Empty")) {
                    i = 1;
                } else if (string5.equals("Waiting")) {
                    i = 2;
                } else if (string5.equals("Downloading")) {
                    i = 3;
                } else if (string5.equals("Downloaded")) {
                    i = 4;
                } else {
                    if (!string5.equals("Error")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.yourlibrary.yourlibraryx.shared.domain.DownloadState.".concat(string5));
                    }
                    i = 5;
                }
                return new bpe1(string, string2, z, string3, jevVarValueOf, string4, n4yVar, i);
            case 3:
                return new kpe1((wne1) parcel.readParcelable(kpe1.class.getClassLoader()));
            case 4:
                return new ope1((wne1) parcel.readParcelable(ope1.class.getClassLoader()));
            case 5:
                return new jre1(parcel.readString(), parcel.readString());
            case 6:
                return new ise1(parcel.readInt());
            case 7:
                return new mse1(parcel.readInt());
            case 8:
                return new pse1(parcel.readString(), parcel.readString());
            case 9:
                return new pue1(parcel.readString(), parcel.readInt() != 0);
            case 10:
                String string6 = parcel.readString();
                oxe1 oxe1Var = (oxe1) parcel.readValue(dxe1.class.getClassLoader());
                gaa0 gaa0Var = (gaa0) parcel.readParcelable(dxe1.class.getClassLoader());
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d = 0;
                int iM31715d2 = 0;
                while (iM31715d2 != i4) {
                    iM31715d2 = c7h0.m31715d(w0k0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iM31715d != i5) {
                    iM31715d = c7h0.m31715d(upq.CREATOR, parcel, arrayList3, iM31715d, 1);
                }
                return new dxe1(string6, oxe1Var, gaa0Var, arrayList2, z2, z3, z4, arrayList3);
            case 11:
                return new exe1(parcel.readInt(), (qsj0) parcel.readParcelable(exe1.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return new oxe1();
            case 13:
                return new pxe1(parcel.readInt() != 0, parcel.readString());
            case 14:
                int iM85848N = vkf1.m85848N(parcel);
                Bundle bundleM85862h = null;
                int iM85840F = 0;
                int iM85840F2 = 0;
                while (parcel.dataPosition() < iM85848N) {
                    int i6 = parcel.readInt();
                    char c = (char) i6;
                    if (c == 1) {
                        iM85840F = vkf1.m85840F(i6, parcel);
                    } else if (c == 2) {
                        iM85840F2 = vkf1.m85840F(i6, parcel);
                    } else if (c != 3) {
                        vkf1.m85844J(i6, parcel);
                    } else {
                        bundleM85862h = vkf1.m85862h(i6, parcel);
                    }
                }
                vkf1.m85872r(iM85848N, parcel);
                return new gp10(iM85840F, iM85840F2, bundleM85862h);
            case 15:
                int iM85848N2 = vkf1.m85848N(parcel);
                boolean zM85878x = false;
                int iM85840F3 = 0;
                while (parcel.dataPosition() < iM85848N2) {
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        zM85878x = vkf1.m85878x(i7, parcel);
                    } else if (c2 != 2) {
                        vkf1.m85844J(i7, parcel);
                    } else {
                        iM85840F3 = vkf1.m85840F(i7, parcel);
                    }
                }
                vkf1.m85872r(iM85848N2, parcel);
                return new jxh0(zM85878x, iM85840F3);
            case 16:
                int iM85848N3 = vkf1.m85848N(parcel);
                ArrayList arrayListM85871q = null;
                int iM85840F4 = 0;
                while (parcel.dataPosition() < iM85848N3) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iM85840F4 = vkf1.m85840F(i8, parcel);
                    } else if (c3 != 2) {
                        vkf1.m85844J(i8, parcel);
                    } else {
                        arrayListM85871q = vkf1.m85871q(parcel, i8, pbf0.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N3, parcel);
                return new hy61(iM85840F4, arrayListM85871q);
            case 17:
                int iM85848N4 = vkf1.m85848N(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iM85848N4) {
                    int i9 = parcel.readInt();
                    if (((char) i9) != 1) {
                        vkf1.m85844J(i9, parcel);
                    } else {
                        pendingIntent = (PendingIntent) vkf1.m85866l(parcel, i9, PendingIntent.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N4, parcel);
                return new oxh0(pendingIntent);
            case 18:
                int iM85848N5 = vkf1.m85848N(parcel);
                Intent intent = null;
                int iM85840F5 = 0;
                int iM85840F6 = 0;
                while (parcel.dataPosition() < iM85848N5) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iM85840F5 = vkf1.m85840F(i10, parcel);
                    } else if (c4 == 2) {
                        iM85840F6 = vkf1.m85840F(i10, parcel);
                    } else if (c4 != 3) {
                        vkf1.m85844J(i10, parcel);
                    } else {
                        intent = (Intent) vkf1.m85866l(parcel, i10, Intent.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N5, parcel);
                return new k3f1(iM85840F5, iM85840F6, intent);
            case 19:
                int iM85848N6 = vkf1.m85848N(parcel);
                String strM85867m = null;
                String strM85867m2 = null;
                String strM85867m3 = null;
                String strM85867m4 = null;
                Uri uri = null;
                String strM85867m5 = null;
                String strM85867m6 = null;
                ArrayList arrayListM85871q2 = null;
                String strM85867m7 = null;
                String strM85867m8 = null;
                long jM85842H = 0;
                while (parcel.dataPosition() < iM85848N6) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strM85867m = vkf1.m85867m(i11, parcel);
                            break;
                        case 3:
                            strM85867m2 = vkf1.m85867m(i11, parcel);
                            break;
                        case 4:
                            strM85867m3 = vkf1.m85867m(i11, parcel);
                            break;
                        case 5:
                            strM85867m4 = vkf1.m85867m(i11, parcel);
                            break;
                        case 6:
                            uri = (Uri) vkf1.m85866l(parcel, i11, Uri.CREATOR);
                            break;
                        case 7:
                            strM85867m5 = vkf1.m85867m(i11, parcel);
                            break;
                        case '\b':
                            jM85842H = vkf1.m85842H(i11, parcel);
                            break;
                        case '\t':
                            strM85867m6 = vkf1.m85867m(i11, parcel);
                            break;
                        case '\n':
                            arrayListM85871q2 = vkf1.m85871q(parcel, i11, Scope.CREATOR);
                            break;
                        case 11:
                            strM85867m7 = vkf1.m85867m(i11, parcel);
                            break;
                        case '\f':
                            strM85867m8 = vkf1.m85867m(i11, parcel);
                            break;
                        default:
                            vkf1.m85844J(i11, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N6, parcel);
                return new GoogleSignInAccount(strM85867m, strM85867m2, strM85867m3, strM85867m4, uri, strM85867m5, jM85842H, strM85867m6, arrayListM85871q2, strM85867m7, strM85867m8);
            case 20:
                int iM85848N7 = vkf1.m85848N(parcel);
                int iM85840F7 = 0;
                int iM85840F8 = 0;
                boolean zM85878x2 = false;
                long jM85842H2 = 0;
                String strM85867m9 = null;
                while (parcel.dataPosition() < iM85848N7) {
                    int i12 = parcel.readInt();
                    char c5 = (char) i12;
                    if (c5 == 1) {
                        iM85840F7 = vkf1.m85840F(i12, parcel);
                    } else if (c5 == 2) {
                        strM85867m9 = vkf1.m85867m(i12, parcel);
                    } else if (c5 == 3) {
                        jM85842H2 = vkf1.m85842H(i12, parcel);
                    } else if (c5 == 4) {
                        iM85840F8 = vkf1.m85840F(i12, parcel);
                    } else if (c5 != 5) {
                        vkf1.m85844J(i12, parcel);
                    } else {
                        zM85878x2 = vkf1.m85878x(i12, parcel);
                    }
                }
                vkf1.m85872r(iM85848N7, parcel);
                return new m3f1(iM85840F7, strM85867m9, jM85842H2, iM85840F8, zM85878x2);
            case 21:
                int iM85848N8 = vkf1.m85848N(parcel);
                int iM85840F9 = 0;
                boolean zM85878x3 = false;
                while (parcel.dataPosition() < iM85848N8) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        iM85840F9 = vkf1.m85840F(i13, parcel);
                    } else if (c6 != 2) {
                        vkf1.m85844J(i13, parcel);
                    } else {
                        zM85878x3 = vkf1.m85878x(i13, parcel);
                    }
                }
                vkf1.m85872r(iM85848N8, parcel);
                return new pxh0(iM85840F9, zM85878x3);
            case 22:
                int iM85848N9 = vkf1.m85848N(parcel);
                ArrayList arrayListM85871q3 = null;
                String strM85867m10 = null;
                boolean zM85878x4 = false;
                String strM85867m11 = null;
                while (parcel.dataPosition() < iM85848N9) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        arrayListM85871q3 = vkf1.m85871q(parcel, i14, gey.CREATOR);
                    } else if (c7 == 2) {
                        zM85878x4 = vkf1.m85878x(i14, parcel);
                    } else if (c7 == 3) {
                        strM85867m11 = vkf1.m85867m(i14, parcel);
                    } else if (c7 != 4) {
                        vkf1.m85844J(i14, parcel);
                    } else {
                        strM85867m10 = vkf1.m85867m(i14, parcel);
                    }
                }
                vkf1.m85872r(iM85848N9, parcel);
                return new h45(strM85867m11, strM85867m10, arrayListM85871q3, zM85878x4);
            case 23:
                int iM85848N10 = vkf1.m85848N(parcel);
                String[] strArrM85868n = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleM85862h2 = null;
                int iM85840F10 = 0;
                int iM85840F11 = 0;
                while (parcel.dataPosition() < iM85848N10) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        strArrM85868n = vkf1.m85868n(i15, parcel);
                    } else if (c8 == 2) {
                        cursorWindowArr = (CursorWindow[]) vkf1.m85870p(parcel, i15, CursorWindow.CREATOR);
                    } else if (c8 == 3) {
                        iM85840F11 = vkf1.m85840F(i15, parcel);
                    } else if (c8 == 4) {
                        bundleM85862h2 = vkf1.m85862h(i15, parcel);
                    } else if (c8 != 1000) {
                        vkf1.m85844J(i15, parcel);
                    } else {
                        iM85840F10 = vkf1.m85840F(i15, parcel);
                    }
                }
                vkf1.m85872r(iM85848N10, parcel);
                DataHolder dataHolder = new DataHolder(iM85840F10, strArrM85868n, cursorWindowArr, iM85840F11, bundleM85862h2);
                dataHolder.m1501M();
                return dataHolder;
            case 24:
                int iM85848N11 = vkf1.m85848N(parcel);
                ArrayList arrayListM85871q4 = null;
                ArrayList arrayListM85871q5 = null;
                Account account = null;
                String strM85867m12 = null;
                String strM85867m13 = null;
                String strM85867m14 = null;
                int iM85840F12 = 0;
                boolean zM85878x5 = false;
                boolean zM85878x6 = false;
                boolean zM85878x7 = false;
                while (parcel.dataPosition() < iM85848N11) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iM85840F12 = vkf1.m85840F(i16, parcel);
                            break;
                        case 2:
                            arrayListM85871q5 = vkf1.m85871q(parcel, i16, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) vkf1.m85866l(parcel, i16, Account.CREATOR);
                            break;
                        case 4:
                            zM85878x5 = vkf1.m85878x(i16, parcel);
                            break;
                        case 5:
                            zM85878x6 = vkf1.m85878x(i16, parcel);
                            break;
                        case 6:
                            zM85878x7 = vkf1.m85878x(i16, parcel);
                            break;
                        case 7:
                            strM85867m12 = vkf1.m85867m(i16, parcel);
                            break;
                        case '\b':
                            strM85867m13 = vkf1.m85867m(i16, parcel);
                            break;
                        case '\t':
                            arrayListM85871q4 = vkf1.m85871q(parcel, i16, gp10.CREATOR);
                            break;
                        case '\n':
                            strM85867m14 = vkf1.m85867m(i16, parcel);
                            break;
                        default:
                            vkf1.m85844J(i16, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N11, parcel);
                return new GoogleSignInOptions(iM85840F12, arrayListM85871q5, account, zM85878x5, zM85878x6, zM85878x7, strM85867m12, strM85867m13, GoogleSignInOptions.m1477M(arrayListM85871q4), strM85867m14);
            case 25:
                int iM85848N12 = vkf1.m85848N(parcel);
                int iM85840F13 = 0;
                int iM85840F14 = 0;
                Uri uri2 = null;
                int iM85840F15 = 0;
                while (parcel.dataPosition() < iM85848N12) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        iM85840F13 = vkf1.m85840F(i17, parcel);
                    } else if (c9 == 2) {
                        uri2 = (Uri) vkf1.m85866l(parcel, i17, Uri.CREATOR);
                    } else if (c9 == 3) {
                        iM85840F15 = vkf1.m85840F(i17, parcel);
                    } else if (c9 != 4) {
                        vkf1.m85844J(i17, parcel);
                    } else {
                        iM85840F14 = vkf1.m85840F(i17, parcel);
                    }
                }
                vkf1.m85872r(iM85848N12, parcel);
                return new kld1(iM85840F13, uri2, iM85840F15, iM85840F14);
            case 26:
                int iM85848N13 = vkf1.m85848N(parcel);
                ArrayList arrayListM85869o = null;
                String strM85867m15 = null;
                while (parcel.dataPosition() < iM85848N13) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 1) {
                        arrayListM85869o = vkf1.m85869o(i18, parcel);
                    } else if (c10 != 2) {
                        vkf1.m85844J(i18, parcel);
                    } else {
                        strM85867m15 = vkf1.m85867m(i18, parcel);
                    }
                }
                vkf1.m85872r(iM85848N13, parcel);
                return new m4f1(arrayListM85869o, strM85867m15);
            case 27:
                int iM85848N14 = vkf1.m85848N(parcel);
                b5f1 b5f1Var = null;
                int iM85840F16 = 0;
                while (parcel.dataPosition() < iM85848N14) {
                    int i19 = parcel.readInt();
                    char c11 = (char) i19;
                    if (c11 == 1) {
                        iM85840F16 = vkf1.m85840F(i19, parcel);
                    } else if (c11 != 2) {
                        vkf1.m85844J(i19, parcel);
                    } else {
                        b5f1Var = (b5f1) vkf1.m85866l(parcel, i19, b5f1.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N14, parcel);
                return new o4f1(iM85840F16, b5f1Var);
            case 28:
                int iM85848N15 = vkf1.m85848N(parcel);
                lzi lziVar = null;
                int iM85840F17 = 0;
                d5f1 d5f1Var = null;
                while (parcel.dataPosition() < iM85848N15) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iM85840F17 = vkf1.m85840F(i20, parcel);
                    } else if (c12 == 2) {
                        lziVar = (lzi) vkf1.m85866l(parcel, i20, lzi.CREATOR);
                    } else if (c12 != 3) {
                        vkf1.m85844J(i20, parcel);
                    } else {
                        d5f1Var = (d5f1) vkf1.m85866l(parcel, i20, d5f1.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N15, parcel);
                return new t4f1(iM85840F17, lziVar, d5f1Var);
            default:
                int iM85848N16 = vkf1.m85848N(parcel);
                int iM85840F18 = -1;
                int iM85840F19 = 0;
                int iM85840F20 = 0;
                int iM85840F21 = 0;
                int iM85840F22 = 0;
                String strM85867m16 = null;
                String strM85867m17 = null;
                long jM85842H3 = 0;
                long jM85842H4 = 0;
                while (parcel.dataPosition() < iM85848N16) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iM85840F19 = vkf1.m85840F(i21, parcel);
                            break;
                        case 2:
                            iM85840F20 = vkf1.m85840F(i21, parcel);
                            break;
                        case 3:
                            iM85840F21 = vkf1.m85840F(i21, parcel);
                            break;
                        case 4:
                            jM85842H3 = vkf1.m85842H(i21, parcel);
                            break;
                        case 5:
                            jM85842H4 = vkf1.m85842H(i21, parcel);
                            break;
                        case 6:
                            strM85867m16 = vkf1.m85867m(i21, parcel);
                            break;
                        case 7:
                            strM85867m17 = vkf1.m85867m(i21, parcel);
                            break;
                        case '\b':
                            iM85840F22 = vkf1.m85840F(i21, parcel);
                            break;
                        case '\t':
                            iM85840F18 = vkf1.m85840F(i21, parcel);
                            break;
                        default:
                            vkf1.m85844J(i21, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N16, parcel);
                return new pbf0(iM85840F19, iM85840F20, iM85840F21, jM85842H3, jM85842H4, strM85867m16, strM85867m17, iM85840F22, iM85840F18);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f221959a) {
            case 0:
                return new une1[i];
            case 1:
                return new vne1[i];
            case 2:
                return new bpe1[i];
            case 3:
                return new kpe1[i];
            case 4:
                return new ope1[i];
            case 5:
                return new jre1[i];
            case 6:
                return new ise1[i];
            case 7:
                return new mse1[i];
            case 8:
                return new pse1[i];
            case 9:
                return new pue1[i];
            case 10:
                return new dxe1[i];
            case 11:
                return new exe1[i];
            case 12:
                return new oxe1[i];
            case 13:
                return new pxe1[i];
            case 14:
                return new gp10[i];
            case 15:
                return new jxh0[i];
            case 16:
                return new hy61[i];
            case 17:
                return new oxh0[i];
            case 18:
                return new k3f1[i];
            case 19:
                return new GoogleSignInAccount[i];
            case 20:
                return new m3f1[i];
            case 21:
                return new pxh0[i];
            case 22:
                return new h45[i];
            case 23:
                return new DataHolder[i];
            case 24:
                return new GoogleSignInOptions[i];
            case 25:
                return new kld1[i];
            case 26:
                return new m4f1[i];
            case 27:
                return new o4f1[i];
            case 28:
                return new t4f1[i];
            default:
                return new pbf0[i];
        }
    }
}
