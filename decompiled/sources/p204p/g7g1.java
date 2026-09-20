package p204p;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Network;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g7g1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77264a;

    public /* synthetic */ g7g1(int i) {
        this.f77264a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m43822a(eb10 eb10Var, Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        int i2 = eb10Var.f57773a;
        alf1.m26313S(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = eb10Var.f57774b;
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = eb10Var.f57775c;
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(i4);
        alf1.m26308N(parcel, 4, eb10Var.f57776d);
        alf1.m26301G(parcel, 5, eb10Var.f57777e);
        alf1.m26311Q(parcel, 6, eb10Var.f57778f, i);
        alf1.m26297C(parcel, 7, eb10Var.f57779g);
        alf1.m26307M(parcel, 8, eb10Var.f57780h, i);
        alf1.m26311Q(parcel, 10, eb10Var.f57781i, i);
        alf1.m26311Q(parcel, 11, eb10Var.f57782t, i);
        boolean z = eb10Var.f57770X;
        alf1.m26313S(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = eb10Var.f57771Y;
        alf1.m26313S(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = eb10Var.f57772Z;
        alf1.m26313S(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        alf1.m26308N(parcel, 15, eb10Var.f57769L0);
        alf1.m26316V(iM26314T, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f77264a) {
            case 0:
                int iM85848N = vkf1.m85848N(parcel);
                int iM85840F = 0;
                String strM85867m = null;
                while (parcel.dataPosition() < iM85848N) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        iM85840F = vkf1.m85840F(i, parcel);
                    } else if (c != 3) {
                        vkf1.m85844J(i, parcel);
                    } else {
                        strM85867m = vkf1.m85867m(i, parcel);
                    }
                }
                vkf1.m85872r(iM85848N, parcel);
                return new d7g1(iM85840F, strM85867m);
            case 1:
                int iM85848N2 = vkf1.m85848N(parcel);
                int iM85840F2 = 0;
                ctf1 ctf1Var = null;
                while (parcel.dataPosition() < iM85848N2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        iM85840F2 = vkf1.m85840F(i2, parcel);
                    } else if (c2 != 3) {
                        vkf1.m85844J(i2, parcel);
                    } else {
                        ctf1Var = (ctf1) vkf1.m85866l(parcel, i2, ctf1.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N2, parcel);
                return new j7g1(iM85840F2, ctf1Var);
            case 2:
                int iM85848N3 = vkf1.m85848N(parcel);
                int iM85840F3 = 0;
                IBinder iBinderM85839E = null;
                while (parcel.dataPosition() < iM85848N3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iM85840F3 = vkf1.m85840F(i3, parcel);
                    } else if (c3 != 2) {
                        vkf1.m85844J(i3, parcel);
                    } else {
                        iBinderM85839E = vkf1.m85839E(i3, parcel);
                    }
                }
                vkf1.m85872r(iM85848N3, parcel);
                return new p7g1(iM85840F3, iBinderM85839E);
            case 3:
                int iM85848N4 = vkf1.m85848N(parcel);
                int iM85840F4 = 0;
                while (parcel.dataPosition() < iM85848N4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        vkf1.m85844J(i4, parcel);
                    } else {
                        iM85840F4 = vkf1.m85840F(i4, parcel);
                    }
                }
                vkf1.m85872r(iM85848N4, parcel);
                return new v7g1(iM85840F4);
            case 4:
                return new g6f1((PendingIntent) parcel.readParcelable(rul.class.getClassLoader()), parcel.readInt() != 0);
            case 5:
                int iM85848N5 = vkf1.m85848N(parcel);
                int iM85840F5 = 0;
                int iM85840F6 = 0;
                int iM85840F7 = 0;
                while (parcel.dataPosition() < iM85848N5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        iM85840F5 = vkf1.m85840F(i5, parcel);
                    } else if (c4 == 3) {
                        iM85840F6 = vkf1.m85840F(i5, parcel);
                    } else if (c4 != 4) {
                        vkf1.m85844J(i5, parcel);
                    } else {
                        iM85840F7 = vkf1.m85840F(i5, parcel);
                    }
                }
                vkf1.m85872r(iM85848N5, parcel);
                return new q640(iM85840F5, iM85840F6, iM85840F7);
            case 6:
                return new BinderWrapper(parcel);
            case 7:
                int iM85848N6 = vkf1.m85848N(parcel);
                int iM85840F8 = 0;
                byte[] bArrM85863i = null;
                int iM85840F9 = 0;
                while (parcel.dataPosition() < iM85848N6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        iM85840F8 = vkf1.m85840F(i6, parcel);
                    } else if (c5 == 2) {
                        iM85840F9 = vkf1.m85840F(i6, parcel);
                    } else if (c5 != 3) {
                        vkf1.m85844J(i6, parcel);
                    } else {
                        bArrM85863i = vkf1.m85863i(i6, parcel);
                    }
                }
                vkf1.m85872r(iM85848N6, parcel);
                return new m8g1(iM85840F8, bArrM85863i, iM85840F9);
            case 8:
                int iM85848N7 = vkf1.m85848N(parcel);
                int iM85840F10 = 0;
                int iM85840F11 = 0;
                while (parcel.dataPosition() < iM85848N7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 2) {
                        iM85840F10 = vkf1.m85840F(i7, parcel);
                    } else if (c6 != 3) {
                        vkf1.m85844J(i7, parcel);
                    } else {
                        iM85840F11 = vkf1.m85840F(i7, parcel);
                    }
                }
                vkf1.m85872r(iM85848N7, parcel);
                return new s8g1(iM85840F10, iM85840F11);
            case 9:
                int iM85848N8 = vkf1.m85848N(parcel);
                int iM85840F12 = 0;
                long jM85842H = 0;
                ArrayList arrayListM85871q = null;
                while (parcel.dataPosition() < iM85848N8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        iM85840F12 = vkf1.m85840F(i8, parcel);
                    } else if (c7 == 3) {
                        jM85842H = vkf1.m85842H(i8, parcel);
                    } else if (c7 != 4) {
                        vkf1.m85844J(i8, parcel);
                    } else {
                        arrayListM85871q = vkf1.m85871q(parcel, i8, v6g1.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N8, parcel);
                return new e9g1(iM85840F12, jM85842H, arrayListM85871q);
            case 10:
                int iM85848N9 = vkf1.m85848N(parcel);
                boolean zM85878x = false;
                boolean zM85878x2 = false;
                boolean zM85878x3 = false;
                float fM85836B = 0.5f;
                float fM85836B2 = 1.0f;
                LatLng latLng = null;
                String strM85867m2 = null;
                String strM85867m3 = null;
                IBinder iBinderM85839E2 = null;
                float fM85836B3 = 0.0f;
                float fM85836B4 = 0.0f;
                float fM85836B5 = 0.0f;
                float fM85836B6 = 0.0f;
                float fM85836B7 = 0.0f;
                while (parcel.dataPosition() < iM85848N9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            latLng = (LatLng) vkf1.m85866l(parcel, i9, LatLng.CREATOR);
                            break;
                        case 3:
                            strM85867m2 = vkf1.m85867m(i9, parcel);
                            break;
                        case 4:
                            strM85867m3 = vkf1.m85867m(i9, parcel);
                            break;
                        case 5:
                            iBinderM85839E2 = vkf1.m85839E(i9, parcel);
                            break;
                        case 6:
                            fM85836B3 = vkf1.m85836B(i9, parcel);
                            break;
                        case 7:
                            fM85836B4 = vkf1.m85836B(i9, parcel);
                            break;
                        case '\b':
                            zM85878x = vkf1.m85878x(i9, parcel);
                            break;
                        case '\t':
                            zM85878x2 = vkf1.m85878x(i9, parcel);
                            break;
                        case '\n':
                            zM85878x3 = vkf1.m85878x(i9, parcel);
                            break;
                        case 11:
                            fM85836B5 = vkf1.m85836B(i9, parcel);
                            break;
                        case '\f':
                            fM85836B = vkf1.m85836B(i9, parcel);
                            break;
                        case '\r':
                            fM85836B6 = vkf1.m85836B(i9, parcel);
                            break;
                        case 14:
                            fM85836B2 = vkf1.m85836B(i9, parcel);
                            break;
                        case 15:
                            fM85836B7 = vkf1.m85836B(i9, parcel);
                            break;
                        default:
                            vkf1.m85844J(i9, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N9, parcel);
                dnc0 dnc0Var = new dnc0();
                dnc0Var.f50749e = 0.5f;
                dnc0Var.f50750f = 1.0f;
                dnc0Var.f50752h = true;
                dnc0Var.f50753i = false;
                dnc0Var.f50754t = 0.0f;
                dnc0Var.f50742X = 0.5f;
                dnc0Var.f50743Y = 0.0f;
                dnc0Var.f50744Z = 1.0f;
                dnc0Var.f50745a = latLng;
                dnc0Var.f50746b = strM85867m2;
                dnc0Var.f50747c = strM85867m3;
                if (iBinderM85839E2 == null) {
                    dnc0Var.f50748d = null;
                } else {
                    dnc0Var.f50748d = new fj1(imk0.m51105c2(iBinderM85839E2));
                }
                dnc0Var.f50749e = fM85836B3;
                dnc0Var.f50750f = fM85836B4;
                dnc0Var.f50751g = zM85878x;
                dnc0Var.f50752h = zM85878x2;
                dnc0Var.f50753i = zM85878x3;
                dnc0Var.f50754t = fM85836B5;
                dnc0Var.f50742X = fM85836B;
                dnc0Var.f50743Y = fM85836B6;
                dnc0Var.f50744Z = fM85836B2;
                dnc0Var.f50741L0 = fM85836B7;
                return dnc0Var;
            case 11:
                int iM85848N10 = vkf1.m85848N(parcel);
                byte bM85880z = 0;
                String strM85867m4 = null;
                byte bM85880z2 = 0;
                while (parcel.dataPosition() < iM85848N10) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 2) {
                        bM85880z = vkf1.m85880z(i10, parcel);
                    } else if (c8 == 3) {
                        bM85880z2 = vkf1.m85880z(i10, parcel);
                    } else if (c8 != 4) {
                        vkf1.m85844J(i10, parcel);
                    } else {
                        strM85867m4 = vkf1.m85867m(i10, parcel);
                    }
                }
                vkf1.m85872r(iM85848N10, parcel);
                return new lbg1(bM85880z, bM85880z2, strM85867m4);
            case 12:
                int iM85848N11 = vkf1.m85848N(parcel);
                Bundle bundleM85862h = null;
                c0j c0jVar = null;
                int iM85840F13 = 0;
                gey[] geyVarArr = null;
                while (parcel.dataPosition() < iM85848N11) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        bundleM85862h = vkf1.m85862h(i11, parcel);
                    } else if (c9 == 2) {
                        geyVarArr = (gey[]) vkf1.m85870p(parcel, i11, gey.CREATOR);
                    } else if (c9 == 3) {
                        iM85840F13 = vkf1.m85840F(i11, parcel);
                    } else if (c9 != 4) {
                        vkf1.m85844J(i11, parcel);
                    } else {
                        c0jVar = (c0j) vkf1.m85866l(parcel, i11, c0j.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N11, parcel);
                afg1 afg1Var = new afg1();
                afg1Var.f15154a = bundleM85862h;
                afg1Var.f15155b = geyVarArr;
                afg1Var.f15156c = iM85840F13;
                afg1Var.f15157d = c0jVar;
                return afg1Var;
            case 13:
                int iM85848N12 = vkf1.m85848N(parcel);
                boolean zM85878x4 = false;
                while (parcel.dataPosition() < iM85848N12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        vkf1.m85844J(i12, parcel);
                    } else {
                        zM85878x4 = vkf1.m85878x(i12, parcel);
                    }
                }
                vkf1.m85872r(iM85848N12, parcel);
                return new yeg1(zM85878x4);
            case 14:
                int iM85848N13 = vkf1.m85848N(parcel);
                dkx0 dkx0Var = null;
                int[] iArrM85864j = null;
                int[] iArrM85864j2 = null;
                boolean zM85878x5 = false;
                boolean zM85878x6 = false;
                int iM85840F14 = 0;
                while (parcel.dataPosition() < iM85848N13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            dkx0Var = (dkx0) vkf1.m85866l(parcel, i13, dkx0.CREATOR);
                            break;
                        case 2:
                            zM85878x5 = vkf1.m85878x(i13, parcel);
                            break;
                        case 3:
                            zM85878x6 = vkf1.m85878x(i13, parcel);
                            break;
                        case 4:
                            iArrM85864j = vkf1.m85864j(i13, parcel);
                            break;
                        case 5:
                            iM85840F14 = vkf1.m85840F(i13, parcel);
                            break;
                        case 6:
                            iArrM85864j2 = vkf1.m85864j(i13, parcel);
                            break;
                        default:
                            vkf1.m85844J(i13, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N13, parcel);
                return new c0j(dkx0Var, zM85878x5, zM85878x6, iArrM85864j, iM85840F14, iArrM85864j2);
            case 15:
                int iM85848N14 = vkf1.m85848N(parcel);
                int iM85840F15 = 0;
                byte bM85880z3 = 0;
                byte bM85880z4 = 0;
                byte bM85880z5 = 0;
                byte bM85880z6 = 0;
                String strM85867m5 = null;
                String strM85867m6 = null;
                String strM85867m7 = null;
                String strM85867m8 = null;
                String strM85867m9 = null;
                String strM85867m10 = null;
                String strM85867m11 = null;
                while (parcel.dataPosition() < iM85848N14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            iM85840F15 = vkf1.m85840F(i14, parcel);
                            break;
                        case 3:
                            strM85867m5 = vkf1.m85867m(i14, parcel);
                            break;
                        case 4:
                            strM85867m6 = vkf1.m85867m(i14, parcel);
                            break;
                        case 5:
                            strM85867m7 = vkf1.m85867m(i14, parcel);
                            break;
                        case 6:
                            strM85867m8 = vkf1.m85867m(i14, parcel);
                            break;
                        case 7:
                            strM85867m9 = vkf1.m85867m(i14, parcel);
                            break;
                        case '\b':
                            strM85867m10 = vkf1.m85867m(i14, parcel);
                            break;
                        case '\t':
                            bM85880z3 = vkf1.m85880z(i14, parcel);
                            break;
                        case '\n':
                            bM85880z4 = vkf1.m85880z(i14, parcel);
                            break;
                        case 11:
                            bM85880z5 = vkf1.m85880z(i14, parcel);
                            break;
                        case '\f':
                            bM85880z6 = vkf1.m85880z(i14, parcel);
                            break;
                        case '\r':
                            strM85867m11 = vkf1.m85867m(i14, parcel);
                            break;
                        default:
                            vkf1.m85844J(i14, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N14, parcel);
                return new zkg1(iM85840F15, strM85867m5, strM85867m6, strM85867m7, strM85867m8, strM85867m9, strM85867m10, bM85880z3, bM85880z4, bM85880z5, bM85880z6, strM85867m11);
            case 16:
                int iM85848N15 = vkf1.m85848N(parcel);
                int iM85840F16 = 0;
                while (parcel.dataPosition() < iM85848N15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        vkf1.m85844J(i15, parcel);
                    } else {
                        iM85840F16 = vkf1.m85840F(i15, parcel);
                    }
                }
                vkf1.m85872r(iM85848N15, parcel);
                return new blg1(iM85840F16);
            case 17:
                int iM85848N16 = vkf1.m85848N(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = eb10.f57767M0;
                String strM85867m12 = null;
                IBinder iBinderM85839E3 = null;
                Account account = null;
                String strM85867m13 = null;
                int iM85840F17 = 0;
                int iM85840F18 = 0;
                int iM85840F19 = 0;
                boolean zM85878x7 = false;
                int iM85840F20 = 0;
                boolean zM85878x8 = false;
                gey[] geyVarArr2 = eb10.f57768N0;
                gey[] geyVarArr3 = geyVarArr2;
                while (parcel.dataPosition() < iM85848N16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iM85840F17 = vkf1.m85840F(i16, parcel);
                            break;
                        case 2:
                            iM85840F18 = vkf1.m85840F(i16, parcel);
                            break;
                        case 3:
                            iM85840F19 = vkf1.m85840F(i16, parcel);
                            break;
                        case 4:
                            strM85867m12 = vkf1.m85867m(i16, parcel);
                            break;
                        case 5:
                            iBinderM85839E3 = vkf1.m85839E(i16, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) vkf1.m85870p(parcel, i16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = vkf1.m85862h(i16, parcel);
                            break;
                        case '\b':
                            account = (Account) vkf1.m85866l(parcel, i16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            vkf1.m85844J(i16, parcel);
                            break;
                        case '\n':
                            geyVarArr2 = (gey[]) vkf1.m85870p(parcel, i16, gey.CREATOR);
                            break;
                        case 11:
                            geyVarArr3 = (gey[]) vkf1.m85870p(parcel, i16, gey.CREATOR);
                            break;
                        case '\f':
                            zM85878x7 = vkf1.m85878x(i16, parcel);
                            break;
                        case '\r':
                            iM85840F20 = vkf1.m85840F(i16, parcel);
                            break;
                        case 14:
                            zM85878x8 = vkf1.m85878x(i16, parcel);
                            break;
                        case 15:
                            strM85867m13 = vkf1.m85867m(i16, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N16, parcel);
                return new eb10(iM85840F17, iM85840F18, iM85840F19, strM85867m12, iBinderM85839E3, scopeArr, bundle, account, geyVarArr2, geyVarArr3, zM85878x7, iM85840F20, zM85878x8, strM85867m13);
            case 18:
                int iM85848N17 = vkf1.m85848N(parcel);
                int iM85840F21 = 0;
                boolean zM85878x9 = false;
                int iM85840F22 = 0;
                int iM85840F23 = 0;
                eyg1[] eyg1VarArr = null;
                z0g1 z0g1Var = null;
                z0g1 z0g1Var2 = null;
                z0g1 z0g1Var3 = null;
                String strM85867m14 = null;
                String strM85867m15 = null;
                float fM85836B8 = 0.0f;
                while (parcel.dataPosition() < iM85848N17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            eyg1VarArr = (eyg1[]) vkf1.m85870p(parcel, i17, eyg1.CREATOR);
                            break;
                        case 3:
                            z0g1Var = (z0g1) vkf1.m85866l(parcel, i17, z0g1.CREATOR);
                            break;
                        case 4:
                            z0g1Var2 = (z0g1) vkf1.m85866l(parcel, i17, z0g1.CREATOR);
                            break;
                        case 5:
                            z0g1Var3 = (z0g1) vkf1.m85866l(parcel, i17, z0g1.CREATOR);
                            break;
                        case 6:
                            strM85867m14 = vkf1.m85867m(i17, parcel);
                            break;
                        case 7:
                            fM85836B8 = vkf1.m85836B(i17, parcel);
                            break;
                        case '\b':
                            strM85867m15 = vkf1.m85867m(i17, parcel);
                            break;
                        case '\t':
                            iM85840F21 = vkf1.m85840F(i17, parcel);
                            break;
                        case '\n':
                            zM85878x9 = vkf1.m85878x(i17, parcel);
                            break;
                        case 11:
                            iM85840F22 = vkf1.m85840F(i17, parcel);
                            break;
                        case '\f':
                            iM85840F23 = vkf1.m85840F(i17, parcel);
                            break;
                        default:
                            vkf1.m85844J(i17, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N17, parcel);
                return new wkg1(eyg1VarArr, z0g1Var, z0g1Var2, z0g1Var3, strM85867m14, fM85836B8, strM85867m15, iM85840F21, zM85878x9, iM85840F22, iM85840F23);
            case 19:
                int iM85848N18 = vkf1.m85848N(parcel);
                boolean zM85878x10 = false;
                boolean zM85878x11 = false;
                boolean zM85878x12 = false;
                boolean zM85878x13 = false;
                boolean zM85878x14 = false;
                boolean zM85878x15 = false;
                boolean zM85878x16 = false;
                boolean zM85878x17 = false;
                boolean zM85878x18 = false;
                boolean zM85878x19 = false;
                String strM85867m16 = null;
                ArrayList arrayListM85869o = null;
                kn70 kn70Var = null;
                wac wacVar = null;
                ArrayList arrayListM85869o2 = null;
                yeg1 yeg1Var = null;
                blg1 blg1Var = null;
                double dM85835A = 0.0d;
                while (parcel.dataPosition() < iM85848N18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            strM85867m16 = vkf1.m85867m(i18, parcel);
                            break;
                        case 3:
                            arrayListM85869o = vkf1.m85869o(i18, parcel);
                            break;
                        case 4:
                            zM85878x10 = vkf1.m85878x(i18, parcel);
                            break;
                        case 5:
                            kn70Var = (kn70) vkf1.m85866l(parcel, i18, kn70.CREATOR);
                            break;
                        case 6:
                            zM85878x11 = vkf1.m85878x(i18, parcel);
                            break;
                        case 7:
                            wacVar = (wac) vkf1.m85866l(parcel, i18, wac.CREATOR);
                            break;
                        case '\b':
                            zM85878x12 = vkf1.m85878x(i18, parcel);
                            break;
                        case '\t':
                            dM85835A = vkf1.m85835A(i18, parcel);
                            break;
                        case '\n':
                            zM85878x13 = vkf1.m85878x(i18, parcel);
                            break;
                        case 11:
                            zM85878x14 = vkf1.m85878x(i18, parcel);
                            break;
                        case '\f':
                            zM85878x15 = vkf1.m85878x(i18, parcel);
                            break;
                        case '\r':
                            arrayListM85869o2 = vkf1.m85869o(i18, parcel);
                            break;
                        case 14:
                            zM85878x16 = vkf1.m85878x(i18, parcel);
                            break;
                        case 15:
                            vkf1.m85840F(i18, parcel);
                            break;
                        case 16:
                            zM85878x17 = vkf1.m85878x(i18, parcel);
                            break;
                        case 17:
                            yeg1Var = (yeg1) vkf1.m85866l(parcel, i18, yeg1.CREATOR);
                            break;
                        case 18:
                            blg1Var = (blg1) vkf1.m85866l(parcel, i18, blg1.CREATOR);
                            break;
                        case 19:
                            zM85878x18 = vkf1.m85878x(i18, parcel);
                            break;
                        case 20:
                            zM85878x19 = vkf1.m85878x(i18, parcel);
                            break;
                        default:
                            vkf1.m85844J(i18, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N18, parcel);
                return new ebc(strM85867m16, arrayListM85869o, zM85878x10, kn70Var, zM85878x11, wacVar, zM85878x12, dM85835A, zM85878x13, zM85878x14, zM85878x15, arrayListM85869o2, zM85878x16, zM85878x17, yeg1Var, blg1Var, zM85878x18, zM85878x19);
            case 20:
                int iM85848N19 = vkf1.m85848N(parcel);
                while (parcel.dataPosition() < iM85848N19) {
                    vkf1.m85844J(parcel.readInt(), parcel);
                }
                vkf1.m85872r(iM85848N19, parcel);
                return new upg1();
            case 21:
                int iM85848N20 = vkf1.m85848N(parcel);
                String strM85867m17 = null;
                String strM85867m18 = null;
                ieg1 ieg1Var = null;
                String strM85867m19 = null;
                String strM85867m20 = null;
                Float fM85837C = null;
                p0h1 p0h1Var = null;
                while (parcel.dataPosition() < iM85848N20) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strM85867m17 = vkf1.m85867m(i19, parcel);
                            break;
                        case 2:
                            strM85867m18 = vkf1.m85867m(i19, parcel);
                            break;
                        case 3:
                            ieg1Var = (ieg1) vkf1.m85866l(parcel, i19, ieg1.CREATOR);
                            break;
                        case 4:
                            strM85867m19 = vkf1.m85867m(i19, parcel);
                            break;
                        case 5:
                            strM85867m20 = vkf1.m85867m(i19, parcel);
                            break;
                        case 6:
                            fM85837C = vkf1.m85837C(i19, parcel);
                            break;
                        case 7:
                            p0h1Var = (p0h1) vkf1.m85866l(parcel, i19, p0h1.CREATOR);
                            break;
                        default:
                            vkf1.m85844J(i19, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N20, parcel);
                return new trg1(strM85867m17, strM85867m18, ieg1Var, strM85867m19, strM85867m20, fM85837C, p0h1Var);
            case 22:
                int iM85848N21 = vkf1.m85848N(parcel);
                String strM85867m21 = null;
                int iM85840F24 = 0;
                String strM85867m22 = null;
                while (parcel.dataPosition() < iM85848N21) {
                    int i20 = parcel.readInt();
                    char c10 = (char) i20;
                    if (c10 == 2) {
                        strM85867m21 = vkf1.m85867m(i20, parcel);
                    } else if (c10 == 3) {
                        iM85840F24 = vkf1.m85840F(i20, parcel);
                    } else if (c10 != 4) {
                        vkf1.m85844J(i20, parcel);
                    } else {
                        strM85867m22 = vkf1.m85867m(i20, parcel);
                    }
                }
                vkf1.m85872r(iM85848N21, parcel);
                return new wsj0(strM85867m21, iM85840F24, strM85867m22);
            case 23:
                int iM85848N22 = vkf1.m85848N(parcel);
                String strM85867m23 = null;
                while (parcel.dataPosition() < iM85848N22) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        vkf1.m85844J(i21, parcel);
                    } else {
                        strM85867m23 = vkf1.m85867m(i21, parcel);
                    }
                }
                vkf1.m85872r(iM85848N22, parcel);
                return new qtg1(strM85867m23);
            case 24:
                int iM85848N23 = vkf1.m85848N(parcel);
                int iM85840F25 = 0;
                ArrayList arrayListM85871q2 = null;
                ieg1 ieg1Var2 = null;
                while (parcel.dataPosition() < iM85848N23) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        iM85840F25 = vkf1.m85840F(i22, parcel);
                    } else if (c11 == 2) {
                        arrayListM85871q2 = vkf1.m85871q(parcel, i22, trg1.CREATOR);
                    } else if (c11 != 3) {
                        vkf1.m85844J(i22, parcel);
                    } else {
                        ieg1Var2 = (ieg1) vkf1.m85866l(parcel, i22, ieg1.CREATOR);
                    }
                }
                vkf1.m85872r(iM85848N23, parcel);
                return new jvg1(iM85840F25, arrayListM85871q2, ieg1Var2);
            case 25:
                int iM85848N24 = vkf1.m85848N(parcel);
                String strM85867m24 = null;
                String strM85867m25 = null;
                String strM85867m26 = null;
                String strM85867m27 = null;
                String strM85867m28 = null;
                ArrayList arrayListM85871q3 = null;
                String strM85867m29 = null;
                String strM85867m30 = null;
                String strM85867m31 = null;
                byte[] bArrM85863i2 = null;
                String strM85867m32 = null;
                r6f1 r6f1Var = null;
                Integer numM85841G = null;
                Boolean boolM85879y = null;
                Network network = null;
                int iM85840F26 = 0;
                int iM85840F27 = 0;
                int iM85840F28 = 0;
                boolean zM85878x20 = false;
                int iM85840F29 = -1;
                while (parcel.dataPosition() < iM85848N24) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            strM85867m24 = vkf1.m85867m(i23, parcel);
                            break;
                        case 3:
                            strM85867m25 = vkf1.m85867m(i23, parcel);
                            break;
                        case 4:
                            strM85867m26 = vkf1.m85867m(i23, parcel);
                            break;
                        case 5:
                            strM85867m27 = vkf1.m85867m(i23, parcel);
                            break;
                        case 6:
                            strM85867m28 = vkf1.m85867m(i23, parcel);
                            break;
                        case 7:
                            iM85840F26 = vkf1.m85840F(i23, parcel);
                            break;
                        case '\b':
                            arrayListM85871q3 = vkf1.m85871q(parcel, i23, kld1.CREATOR);
                            break;
                        case '\t':
                            iM85840F27 = vkf1.m85840F(i23, parcel);
                            break;
                        case '\n':
                            iM85840F29 = vkf1.m85840F(i23, parcel);
                            break;
                        case 11:
                            strM85867m29 = vkf1.m85867m(i23, parcel);
                            break;
                        case '\f':
                            strM85867m30 = vkf1.m85867m(i23, parcel);
                            break;
                        case '\r':
                            iM85840F28 = vkf1.m85840F(i23, parcel);
                            break;
                        case 14:
                            strM85867m31 = vkf1.m85867m(i23, parcel);
                            break;
                        case 15:
                            bArrM85863i2 = vkf1.m85863i(i23, parcel);
                            break;
                        case 16:
                            strM85867m32 = vkf1.m85867m(i23, parcel);
                            break;
                        case 17:
                            zM85878x20 = vkf1.m85878x(i23, parcel);
                            break;
                        case 18:
                            r6f1Var = (r6f1) vkf1.m85866l(parcel, i23, r6f1.CREATOR);
                            break;
                        case 19:
                            numM85841G = vkf1.m85841G(i23, parcel);
                            break;
                        case 20:
                            boolM85879y = vkf1.m85879y(i23, parcel);
                            break;
                        case 21:
                            network = (Network) vkf1.m85866l(parcel, i23, Network.CREATOR);
                            break;
                        default:
                            vkf1.m85844J(i23, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N24, parcel);
                return new CastDevice(strM85867m24, strM85867m25, strM85867m26, strM85867m27, strM85867m28, iM85840F26, arrayListM85871q3, iM85840F27, iM85840F29, strM85867m29, strM85867m30, iM85840F28, strM85867m31, bArrM85863i2, strM85867m32, zM85878x20, r6f1Var, numM85841G, boolM85879y, network);
            case 26:
                int iM85848N25 = vkf1.m85848N(parcel);
                boolean zM85878x21 = false;
                upg1[] upg1VarArr = null;
                z0g1 z0g1Var4 = null;
                z0g1 z0g1Var5 = null;
                String strM85867m33 = null;
                String strM85867m34 = null;
                float fM85836B9 = 0.0f;
                while (parcel.dataPosition() < iM85848N25) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            upg1VarArr = (upg1[]) vkf1.m85870p(parcel, i24, upg1.CREATOR);
                            break;
                        case 3:
                            z0g1Var4 = (z0g1) vkf1.m85866l(parcel, i24, z0g1.CREATOR);
                            break;
                        case 4:
                            z0g1Var5 = (z0g1) vkf1.m85866l(parcel, i24, z0g1.CREATOR);
                            break;
                        case 5:
                            strM85867m33 = vkf1.m85867m(i24, parcel);
                            break;
                        case 6:
                            fM85836B9 = vkf1.m85836B(i24, parcel);
                            break;
                        case 7:
                            strM85867m34 = vkf1.m85867m(i24, parcel);
                            break;
                        case '\b':
                            zM85878x21 = vkf1.m85878x(i24, parcel);
                            break;
                        default:
                            vkf1.m85844J(i24, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N25, parcel);
                return new eyg1(upg1VarArr, z0g1Var4, z0g1Var5, strM85867m33, fM85836B9, strM85867m34, zM85878x21);
            case 27:
                int iM85848N26 = vkf1.m85848N(parcel);
                int iM85840F30 = 0;
                int iM85840F31 = 0;
                int iM85840F32 = 0;
                int iM85840F33 = 0;
                int iM85840F34 = 0;
                int iM85840F35 = 0;
                int iM85840F36 = 0;
                int iM85840F37 = 0;
                int iM85840F38 = 0;
                int iM85840F39 = 0;
                int iM85840F40 = 0;
                int iM85840F41 = 0;
                int iM85840F42 = 0;
                int iM85840F43 = 0;
                int iM85840F44 = 0;
                int iM85840F45 = 0;
                int iM85840F46 = 0;
                int iM85840F47 = 0;
                int iM85840F48 = 0;
                int iM85840F49 = 0;
                int iM85840F50 = 0;
                int iM85840F51 = 0;
                int iM85840F52 = 0;
                int iM85840F53 = 0;
                int iM85840F54 = 0;
                int iM85840F55 = 0;
                int iM85840F56 = 0;
                boolean zM85878x22 = false;
                boolean zM85878x23 = false;
                ArrayList arrayListM85869o3 = null;
                int[] iArrM85864j3 = null;
                String strM85867m35 = null;
                IBinder iBinderM85839E4 = null;
                long jM85842H2 = 0;
                while (parcel.dataPosition() < iM85848N26) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            arrayListM85869o3 = vkf1.m85869o(i25, parcel);
                            break;
                        case 3:
                            iArrM85864j3 = vkf1.m85864j(i25, parcel);
                            break;
                        case 4:
                            jM85842H2 = vkf1.m85842H(i25, parcel);
                            break;
                        case 5:
                            strM85867m35 = vkf1.m85867m(i25, parcel);
                            break;
                        case 6:
                            iM85840F30 = vkf1.m85840F(i25, parcel);
                            break;
                        case 7:
                            iM85840F31 = vkf1.m85840F(i25, parcel);
                            break;
                        case '\b':
                            iM85840F32 = vkf1.m85840F(i25, parcel);
                            break;
                        case '\t':
                            iM85840F33 = vkf1.m85840F(i25, parcel);
                            break;
                        case '\n':
                            iM85840F34 = vkf1.m85840F(i25, parcel);
                            break;
                        case 11:
                            iM85840F35 = vkf1.m85840F(i25, parcel);
                            break;
                        case '\f':
                            iM85840F36 = vkf1.m85840F(i25, parcel);
                            break;
                        case '\r':
                            iM85840F37 = vkf1.m85840F(i25, parcel);
                            break;
                        case 14:
                            iM85840F38 = vkf1.m85840F(i25, parcel);
                            break;
                        case 15:
                            iM85840F39 = vkf1.m85840F(i25, parcel);
                            break;
                        case 16:
                            iM85840F40 = vkf1.m85840F(i25, parcel);
                            break;
                        case 17:
                            iM85840F41 = vkf1.m85840F(i25, parcel);
                            break;
                        case 18:
                            iM85840F42 = vkf1.m85840F(i25, parcel);
                            break;
                        case 19:
                            iM85840F43 = vkf1.m85840F(i25, parcel);
                            break;
                        case 20:
                            iM85840F44 = vkf1.m85840F(i25, parcel);
                            break;
                        case 21:
                            iM85840F45 = vkf1.m85840F(i25, parcel);
                            break;
                        case 22:
                            iM85840F46 = vkf1.m85840F(i25, parcel);
                            break;
                        case 23:
                            iM85840F47 = vkf1.m85840F(i25, parcel);
                            break;
                        case 24:
                            iM85840F48 = vkf1.m85840F(i25, parcel);
                            break;
                        case 25:
                            iM85840F49 = vkf1.m85840F(i25, parcel);
                            break;
                        case 26:
                            iM85840F50 = vkf1.m85840F(i25, parcel);
                            break;
                        case 27:
                            iM85840F51 = vkf1.m85840F(i25, parcel);
                            break;
                        case 28:
                            iM85840F52 = vkf1.m85840F(i25, parcel);
                            break;
                        case 29:
                            iM85840F53 = vkf1.m85840F(i25, parcel);
                            break;
                        case 30:
                            iM85840F54 = vkf1.m85840F(i25, parcel);
                            break;
                        case 31:
                            iM85840F55 = vkf1.m85840F(i25, parcel);
                            break;
                        case ' ':
                            iM85840F56 = vkf1.m85840F(i25, parcel);
                            break;
                        case '!':
                            iBinderM85839E4 = vkf1.m85839E(i25, parcel);
                            break;
                        case '\"':
                            zM85878x22 = vkf1.m85878x(i25, parcel);
                            break;
                        case '#':
                            zM85878x23 = vkf1.m85878x(i25, parcel);
                            break;
                        default:
                            vkf1.m85844J(i25, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N26, parcel);
                return new v0k0(arrayListM85869o3, iArrM85864j3, jM85842H2, strM85867m35, iM85840F30, iM85840F31, iM85840F32, iM85840F33, iM85840F34, iM85840F35, iM85840F36, iM85840F37, iM85840F38, iM85840F39, iM85840F40, iM85840F41, iM85840F42, iM85840F43, iM85840F44, iM85840F45, iM85840F46, iM85840F47, iM85840F48, iM85840F49, iM85840F50, iM85840F51, iM85840F52, iM85840F53, iM85840F54, iM85840F55, iM85840F56, iBinderM85839E4, zM85878x22, zM85878x23);
            case 28:
                int iM85848N27 = vkf1.m85848N(parcel);
                boolean zM85878x24 = false;
                ArrayList arrayListM85869o4 = null;
                while (parcel.dataPosition() < iM85848N27) {
                    int i26 = parcel.readInt();
                    char c12 = (char) i26;
                    if (c12 == 1) {
                        zM85878x24 = vkf1.m85878x(i26, parcel);
                    } else if (c12 != 2) {
                        vkf1.m85844J(i26, parcel);
                    } else {
                        arrayListM85869o4 = vkf1.m85869o(i26, parcel);
                    }
                }
                vkf1.m85872r(iM85848N27, parcel);
                return new p0h1(arrayListM85869o4, zM85878x24);
            default:
                int iM85848N28 = vkf1.m85848N(parcel);
                long jM85842H3 = 0;
                int iM85840F57 = 0;
                int iM85840F58 = 0;
                int iM85840F59 = 0;
                int iM85840F60 = 0;
                while (parcel.dataPosition() < iM85848N28) {
                    int i27 = parcel.readInt();
                    char c13 = (char) i27;
                    if (c13 == 1) {
                        iM85840F57 = vkf1.m85840F(i27, parcel);
                    } else if (c13 == 2) {
                        iM85840F58 = vkf1.m85840F(i27, parcel);
                    } else if (c13 == 3) {
                        iM85840F59 = vkf1.m85840F(i27, parcel);
                    } else if (c13 == 4) {
                        iM85840F60 = vkf1.m85840F(i27, parcel);
                    } else if (c13 != 5) {
                        vkf1.m85844J(i27, parcel);
                    } else {
                        jM85842H3 = vkf1.m85842H(i27, parcel);
                    }
                }
                vkf1.m85872r(iM85848N28, parcel);
                return new q5h1(iM85840F57, iM85840F58, iM85840F59, iM85840F60, jM85842H3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f77264a) {
            case 0:
                return new d7g1[i];
            case 1:
                return new j7g1[i];
            case 2:
                return new p7g1[i];
            case 3:
                return new v7g1[i];
            case 4:
                return new rul[i];
            case 5:
                return new q640[i];
            case 6:
                return new BinderWrapper[i];
            case 7:
                return new m8g1[i];
            case 8:
                return new s8g1[i];
            case 9:
                return new e9g1[i];
            case 10:
                return new dnc0[i];
            case 11:
                return new lbg1[i];
            case 12:
                return new afg1[i];
            case 13:
                return new yeg1[i];
            case 14:
                return new c0j[i];
            case 15:
                return new zkg1[i];
            case 16:
                return new blg1[i];
            case 17:
                return new eb10[i];
            case 18:
                return new wkg1[i];
            case 19:
                return new ebc[i];
            case 20:
                return new upg1[i];
            case 21:
                return new trg1[i];
            case 22:
                return new wsj0[i];
            case 23:
                return new qtg1[i];
            case 24:
                return new jvg1[i];
            case 25:
                return new CastDevice[i];
            case 26:
                return new eyg1[i];
            case 27:
                return new v0k0[i];
            case 28:
                return new p0h1[i];
            default:
                return new q5h1[i];
        }
    }
}
