package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes2.dex */
public final class luh0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137093a;

    public /* synthetic */ luh0(int i) {
        this.f137093a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f137093a) {
            case 0:
                return new uvh0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                s6j0 s6j0VarM58987n = lhg1.m58987n(parcel);
                y8j0 y8j0VarCreateFromParcel = parcel.readInt() == 0 ? null : y8j0.CREATOR.createFromParcel(parcel);
                int iM62693r = ms2.m62693r(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new xvh0(s6j0VarM58987n, y8j0VarCreateFromParcel, iM62693r, arrayList, parcel.readString(), sli0.m78480g(parcel));
            case 2:
                return new oui0(parcel.readInt(), parcel.readInt(), parcel.readString(), (b370) parcel.readParcelable(oui0.class.getClassLoader()));
            case 3:
                return new qsj0(parcel.readString(), (gw71) parcel.readParcelable(qsj0.class.getClassLoader()), parcel.readString(), vsj0.CREATOR.createFromParcel(parcel), (tvj0) parcel.readParcelable(qsj0.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), g0f0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 4:
                parcel.readInt();
                return ttm0.f223644a;
            case 5:
                return new vum0(parcel.readInt());
            case 6:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iM9h = 0;
                while (iM9h != i3) {
                    iM9h = AbstractC0000a.m9h(fwm0.class, parcel, arrayList2, iM9h, 1);
                }
                return new fwm0(arrayList2, (p4v0) parcel.readParcelable(fwm0.class.getClassLoader()));
            case 7:
                return new nen0(parcel.readString(), parcel.readDouble());
            case 8:
                return new c3o0(parcel.readInt(), parcel.readInt(), parcel.readString(), (b370) parcel.readParcelable(c3o0.class.getClassLoader()));
            case 9:
                return new PlaybackStateCompat(parcel);
            case 10:
                int iM93098c = y8a0.m93098c(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iM9h2 = 0;
                while (true) {
                    boolean z = true;
                    if (iM9h2 == i4) {
                        String string = parcel.readString();
                        if (parcel.readInt() == 0) {
                            z = false;
                        }
                        return new qxr0(iM93098c, arrayList3, string, z, parcel.readInt() != 0, parcel.readInt(), z0k0.m95068e(parcel.readString()));
                    }
                    iM9h2 = AbstractC0000a.m9h(qxr0.class, parcel, arrayList3, iM9h2, 1);
                }
                break;
            case 11:
                return new n1s0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new uyu0(parcel.readString(), parcel.readString());
            case 13:
                return new a1x0(parcel.readInt(), o7t0.m66390d(parcel.readString()));
            case 14:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iM31715d = 0;
                while (iM31715d != i6) {
                    iM31715d = c7h0.m31715d(wit0.CREATOR, parcel, arrayList4, iM31715d, 1);
                }
                return new xkx0(string2, string3, string4, string5, arrayListCreateStringArrayList, i5, arrayList4, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 15:
                return new aox0(parcel.readString(), parcel.readString(), parcel.readDouble());
            case 16:
                return new a421((z321) parcel.readParcelable(a421.class.getClassLoader()), rk7.valueOf(parcel.readString()));
            case 17:
                return new hs61(parcel.readString(), parcel.readString(), parcel.readInt());
            case 18:
                return new voc1(parcel.readString());
            case 19:
                int iM85848N = vkf1.m85848N(parcel);
                String strM85867m = null;
                String strM85867m2 = null;
                String strM85867m3 = null;
                String strM85867m4 = null;
                String strM85867m5 = null;
                String strM85867m6 = null;
                String strM85867m7 = null;
                String strM85867m8 = null;
                String strM85867m9 = null;
                j4b1 j4b1Var = null;
                long jM85842H = 0;
                long jM85842H2 = 0;
                while (parcel.dataPosition() < iM85848N) {
                    int iM85838D = vkf1.m85838D(parcel);
                    switch (vkf1.m85874t(iM85838D)) {
                        case 2:
                            strM85867m = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 3:
                            strM85867m2 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 4:
                            jM85842H = vkf1.m85842H(iM85838D, parcel);
                            break;
                        case 5:
                            strM85867m3 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 6:
                            strM85867m4 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 7:
                            strM85867m5 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 8:
                            strM85867m6 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 9:
                            strM85867m7 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 10:
                            strM85867m8 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 11:
                            jM85842H2 = vkf1.m85842H(iM85838D, parcel);
                            break;
                        case 12:
                            strM85867m9 = vkf1.m85867m(iM85838D, parcel);
                            break;
                        case 13:
                            j4b1Var = (j4b1) vkf1.m85866l(parcel, iM85838D, j4b1.CREATOR);
                            break;
                        default:
                            vkf1.m85844J(iM85838D, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N, parcel);
                return new ih0(strM85867m, strM85867m2, jM85842H, strM85867m3, strM85867m4, strM85867m5, strM85867m6, strM85867m7, strM85867m8, jM85842H2, strM85867m9, j4b1Var);
            case 20:
                int iM85848N2 = vkf1.m85848N(parcel);
                byte bM85880z = -1;
                byte bM85880z2 = -1;
                byte bM85880z3 = -1;
                byte bM85880z4 = -1;
                byte bM85880z5 = -1;
                byte bM85880z6 = -1;
                byte bM85880z7 = -1;
                byte bM85880z8 = -1;
                byte bM85880z9 = -1;
                byte bM85880z10 = -1;
                byte bM85880z11 = -1;
                byte bM85880z12 = -1;
                int iM85840F = 0;
                CameraPosition cameraPosition = null;
                Float fM85837C = null;
                Float fM85837C2 = null;
                LatLngBounds latLngBounds = null;
                Integer numM85841G = null;
                String strM85867m10 = null;
                while (parcel.dataPosition() < iM85848N2) {
                    int iM85838D2 = vkf1.m85838D(parcel);
                    switch (vkf1.m85874t(iM85838D2)) {
                        case 2:
                            bM85880z = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 3:
                            bM85880z2 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 4:
                            iM85840F = vkf1.m85840F(iM85838D2, parcel);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) vkf1.m85866l(parcel, iM85838D2, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bM85880z3 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 7:
                            bM85880z4 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 8:
                            bM85880z5 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 9:
                            bM85880z6 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 10:
                            bM85880z7 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 11:
                            bM85880z8 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 12:
                            bM85880z9 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 13:
                        default:
                            vkf1.m85844J(iM85838D2, parcel);
                            break;
                        case 14:
                            bM85880z10 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 15:
                            bM85880z11 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 16:
                            fM85837C = vkf1.m85837C(iM85838D2, parcel);
                            break;
                        case 17:
                            fM85837C2 = vkf1.m85837C(iM85838D2, parcel);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) vkf1.m85866l(parcel, iM85838D2, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            bM85880z12 = vkf1.m85880z(iM85838D2, parcel);
                            break;
                        case 20:
                            numM85841G = vkf1.m85841G(iM85838D2, parcel);
                            break;
                        case 21:
                            strM85867m10 = vkf1.m85867m(iM85838D2, parcel);
                            break;
                    }
                }
                vkf1.m85872r(iM85848N2, parcel);
                return new GoogleMapOptions(bM85880z, bM85880z2, iM85840F, cameraPosition, bM85880z3, bM85880z4, bM85880z5, bM85880z6, bM85880z7, bM85880z8, bM85880z9, bM85880z10, bM85880z11, fM85837C, fM85837C2, latLngBounds, bM85880z12, numM85841G, strM85867m10);
            default:
                int iM85848N3 = vkf1.m85848N(parcel);
                long jM85842H3 = 0;
                long jM85842H4 = 0;
                long jM85842H5 = 0;
                String strM85867m11 = null;
                String strM85867m12 = null;
                while (parcel.dataPosition() < iM85848N3) {
                    int iM85838D3 = vkf1.m85838D(parcel);
                    int iM85874t = vkf1.m85874t(iM85838D3);
                    if (iM85874t == 2) {
                        jM85842H3 = vkf1.m85842H(iM85838D3, parcel);
                    } else if (iM85874t == 3) {
                        jM85842H4 = vkf1.m85842H(iM85838D3, parcel);
                    } else if (iM85874t == 4) {
                        strM85867m11 = vkf1.m85867m(iM85838D3, parcel);
                    } else if (iM85874t == 5) {
                        strM85867m12 = vkf1.m85867m(iM85838D3, parcel);
                    } else if (iM85874t != 6) {
                        vkf1.m85844J(iM85838D3, parcel);
                    } else {
                        jM85842H5 = vkf1.m85842H(iM85838D3, parcel);
                    }
                }
                vkf1.m85872r(iM85848N3, parcel);
                return new nh0(jM85842H3, jM85842H4, jM85842H5, strM85867m11, strM85867m12);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f137093a) {
            case 0:
                return new uvh0[i];
            case 1:
                return new xvh0[i];
            case 2:
                return new oui0[i];
            case 3:
                return new qsj0[i];
            case 4:
                return new ttm0[i];
            case 5:
                return new vum0[i];
            case 6:
                return new fwm0[i];
            case 7:
                return new nen0[i];
            case 8:
                return new c3o0[i];
            case 9:
                return new PlaybackStateCompat[i];
            case 10:
                return new qxr0[i];
            case 11:
                return new n1s0[i];
            case 12:
                return new uyu0[i];
            case 13:
                return new a1x0[i];
            case 14:
                return new xkx0[i];
            case 15:
                return new aox0[i];
            case 16:
                return new a421[i];
            case 17:
                return new hs61[i];
            case 18:
                return new voc1[i];
            case 19:
                return new ih0[i];
            case 20:
                return new GoogleMapOptions[i];
            default:
                return new nh0[i];
        }
    }
}
