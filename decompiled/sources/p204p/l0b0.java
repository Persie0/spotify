package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class l0b0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128355a;

    public /* synthetic */ l0b0(int i) {
        this.f128355a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.f128355a) {
            case 0:
                return new m0b0((ep10) parcel.readParcelable(m0b0.class.getClassLoader()), parcel.readString(), parcel.readString());
            case 1:
                return new n0b0(parcel.readString());
            case 2:
                return new o0b0(parcel.readString());
            case 3:
                return new p0b0(parcel.readString(), parcel.readString());
            case 4:
                return new q0b0(parcel.readString(), parcel.readString());
            case 5:
                return new r0b0(parcel.readString(), (eg7) parcel.readParcelable(r0b0.class.getClassLoader()));
            case 6:
                return new s0b0(i7n0.CREATOR.createFromParcel(parcel));
            case 7:
                return new t0b0(parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                return new u0b0(parcel.readString(), parcel.readString());
            case 9:
                return new v0b0(parcel.readString(), parcel.readString());
            case 10:
                return new f4b0(h4b0.valueOf(parcel.readString()));
            case 11:
                return new g4b0(f4b0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : zq9.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? zq9.CREATOR.createFromParcel(parcel) : null);
            case 12:
                return new q4b0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            case 13:
                String string = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int iM75732f = 0;
                while (iM75732f != i2) {
                    iM75732f = rkh0.m75732f(parcel, linkedHashMap, parcel.readString(), iM75732f, 1);
                }
                return new i8b0(string, linkedHashMap);
            case 14:
                o8b0 o8b0Var = new o8b0(parcel);
                o8b0Var.f162761a = parcel.readString();
                o8b0Var.f162763c = parcel.readFloat();
                o8b0Var.f162764d = parcel.readInt() == 1;
                o8b0Var.f162765e = parcel.readString();
                o8b0Var.f162766f = parcel.readInt();
                o8b0Var.f162767g = parcel.readInt();
                return o8b0Var;
            case 15:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iM31715d = 0;
                while (iM31715d != i3) {
                    iM31715d = c7h0.m31715d(rab0.CREATOR, parcel, arrayList, iM31715d, 1);
                }
                int iM93117v = y8a0.m93117v(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iM31715d2 = 0;
                while (iM31715d2 != i4) {
                    iM31715d2 = c7h0.m31715d(uab0.CREATOR, parcel, arrayList2, iM31715d2, 1);
                }
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                sab0 sab0VarCreateFromParcel = sab0.CREATOR.createFromParcel(parcel);
                vab0 vab0VarCreateFromParcel = vab0.CREATOR.createFromParcel(parcel);
                String string3 = parcel.readString();
                if (string3 == null) {
                    throw new NullPointerException("Name is null");
                }
                if (string3.equals("NONE")) {
                    i = 1;
                } else if (string3.equals("UNCAPPED")) {
                    i = 2;
                } else {
                    if (!string3.equals("CAPPED")) {
                        throw new IllegalArgumentException("No enum constant com.spotify.lyrics.data.model.Lyrics.CapStatus.".concat(string3));
                    }
                    i = 3;
                }
                return new wab0(arrayList, iM93117v, arrayList2, string2, z, sab0VarCreateFromParcel, vab0VarCreateFromParcel, i, parcel.createStringArrayList());
            case 16:
                long j = parcel.readLong();
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iM31715d3 = 0;
                while (iM31715d3 != i5) {
                    iM31715d3 = c7h0.m31715d(tab0.CREATOR, parcel, arrayList3, iM31715d3, 1);
                }
                return new rab0(j, string4, arrayList3);
            case 17:
                return new sab0(parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                return new tab0(parcel.readInt(), parcel.readInt());
            case 19:
                return new uab0(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
            case 20:
                return new vab0(parcel.readInt() != 0);
            case 21:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
                int iM75732f2 = 0;
                while (iM75732f2 != i6) {
                    iM75732f2 = rkh0.m75732f(parcel, linkedHashMap2, parcel.readString(), iM75732f2, 1);
                }
                return new mbb0(string5, string6, string7, opo.m67547D(linkedHashMap2), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), y8a0.m93118w(parcel.readString()), udb0.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 22:
                return new sbb0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 23:
                int i7 = parcel.readInt();
                String string8 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                return new vcb0(i7, string8, arrayList4, (sbb0) parcel.readParcelable(vcb0.class.getClassLoader()), parcel.readString());
            case 24:
                return new cdb0((xr01) parcel.readParcelable(cdb0.class.getClassLoader()), parcel.readInt(), (e081) parcel.readParcelable(cdb0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString());
            case 25:
                xf81 xf81Var = (xf81) parcel.readParcelable(cgb0.class.getClassLoader());
                String string9 = parcel.readString();
                fnb0 fnb0Var = (fnb0) parcel.readParcelable(cgb0.class.getClassLoader());
                sbb0 sbb0Var = (sbb0) parcel.readParcelable(cgb0.class.getClassLoader());
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                yc91 yc91Var = (yc91) parcel.readParcelable(cgb0.class.getClassLoader());
                String string10 = parcel.readString();
                rd21 rd21Var = (rd21) parcel.readParcelable(cgb0.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i10);
                int iM9h = 0;
                while (iM9h != i10) {
                    iM9h = AbstractC0000a.m9h(cgb0.class, parcel, arrayList5, iM9h, 1);
                }
                return new cgb0(xf81Var, string9, fnb0Var, sbb0Var, z2, z3, z4, yc91Var, string10, rd21Var, arrayList5, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (auh0) parcel.readParcelable(cgb0.class.getClassLoader()), (auh0) parcel.readParcelable(cgb0.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : vtw0.CREATOR.createFromParcel(parcel), (nh3) parcel.readParcelable(cgb0.class.getClassLoader()));
            case 26:
                return new kgb0(parcel.readInt() != 0, (zth0) parcel.readParcelable(kgb0.class.getClassLoader()), parcel.readInt());
            case 27:
                int i11 = fk80.CREATOR.createFromParcel(parcel).f70497a;
                String string11 = parcel.readString();
                long j2 = parcel.readLong();
                int i12 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i12);
                int iM9h2 = 0;
                while (iM9h2 != i12) {
                    iM9h2 = AbstractC0000a.m9h(kib0.class, parcel, arrayList6, iM9h2, 1);
                }
                return new kib0(i11, string11, j2, arrayList6);
            case 28:
                return new pib0((s7f) parcel.readParcelable(pib0.class.getClassLoader()));
            default:
                return new qib0(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f128355a) {
            case 0:
                return new m0b0[i];
            case 1:
                return new n0b0[i];
            case 2:
                return new o0b0[i];
            case 3:
                return new p0b0[i];
            case 4:
                return new q0b0[i];
            case 5:
                return new r0b0[i];
            case 6:
                return new s0b0[i];
            case 7:
                return new t0b0[i];
            case 8:
                return new u0b0[i];
            case 9:
                return new v0b0[i];
            case 10:
                return new f4b0[i];
            case 11:
                return new g4b0[i];
            case 12:
                return new q4b0[i];
            case 13:
                return new i8b0[i];
            case 14:
                return new o8b0[i];
            case 15:
                return new wab0[i];
            case 16:
                return new rab0[i];
            case 17:
                return new sab0[i];
            case 18:
                return new tab0[i];
            case 19:
                return new uab0[i];
            case 20:
                return new vab0[i];
            case 21:
                return new mbb0[i];
            case 22:
                return new sbb0[i];
            case 23:
                return new vcb0[i];
            case 24:
                return new cdb0[i];
            case 25:
                return new cgb0[i];
            case 26:
                return new kgb0[i];
            case 27:
                return new kib0[i];
            case 28:
                return new pib0[i];
            default:
                return new qib0[i];
        }
    }
}
