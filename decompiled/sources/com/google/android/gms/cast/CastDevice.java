package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p204p.AbstractC2206o9;
import p204p.acc;
import p204p.alf1;
import p204p.edb;
import p204p.g7g1;
import p204p.gyf1;
import p204p.r6f1;
import p204p.xhy0;

/* JADX INFO: loaded from: classes.dex */
public class CastDevice extends AbstractC2206o9 implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new g7g1(25);

    /* JADX INFO: renamed from: L0 */
    public final String f1760L0;

    /* JADX INFO: renamed from: M0 */
    public final byte[] f1761M0;

    /* JADX INFO: renamed from: N0 */
    public final String f1762N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f1763O0;

    /* JADX INFO: renamed from: P0 */
    public final r6f1 f1764P0;

    /* JADX INFO: renamed from: Q0 */
    public final Integer f1765Q0;

    /* JADX INFO: renamed from: R0 */
    public final Boolean f1766R0;

    /* JADX INFO: renamed from: S0 */
    public final Network f1767S0;

    /* JADX INFO: renamed from: X */
    public final String f1768X;

    /* JADX INFO: renamed from: Y */
    public final String f1769Y;

    /* JADX INFO: renamed from: Z */
    public final int f1770Z;

    /* JADX INFO: renamed from: a */
    public final String f1771a;

    /* JADX INFO: renamed from: b */
    public final String f1772b;

    /* JADX INFO: renamed from: c */
    public final InetAddress f1773c;

    /* JADX INFO: renamed from: d */
    public final String f1774d;

    /* JADX INFO: renamed from: e */
    public final String f1775e;

    /* JADX INFO: renamed from: f */
    public final String f1776f;

    /* JADX INFO: renamed from: g */
    public final int f1777g;

    /* JADX INFO: renamed from: h */
    public final List f1778h;

    /* JADX INFO: renamed from: i */
    public final xhy0 f1779i;

    /* JADX INFO: renamed from: t */
    public final int f1780t;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, r6f1 r6f1Var, Integer num, Boolean bool, Network network) {
        this.f1771a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.f1772b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f1773c = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                new StringBuilder(this.f1772b.length() + 48 + String.valueOf(e.getMessage()).length());
            }
        }
        this.f1774d = str3 == null ? "" : str3;
        this.f1775e = str4 == null ? "" : str4;
        this.f1776f = str5 == null ? "" : str5;
        this.f1777g = i;
        this.f1778h = arrayList == null ? new ArrayList() : arrayList;
        this.f1780t = i3;
        this.f1768X = str6 == null ? "" : str6;
        this.f1769Y = str7;
        this.f1770Z = i4;
        this.f1760L0 = str8;
        this.f1761M0 = bArr;
        this.f1762N0 = str9;
        this.f1763O0 = z;
        this.f1764P0 = r6f1Var;
        this.f1765Q0 = num;
        this.f1766R0 = bool;
        this.f1767S0 = network;
        this.f1779i = new xhy0(i2);
    }

    /* JADX INFO: renamed from: M */
    public static CastDevice m1481M(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean equals(Object obj) {
        int i;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr2 = castDevice.f1761M0;
        int i2 = castDevice.f1777g;
        String str = castDevice.f1776f;
        String str2 = castDevice.f1771a;
        String str3 = this.f1771a;
        if (str3 == null) {
            return str2 == null;
        }
        if (acc.m25453c(str3, str2) && acc.m25453c(this.f1773c, castDevice.f1773c) && acc.m25453c(this.f1775e, castDevice.f1775e) && acc.m25453c(this.f1774d, castDevice.f1774d)) {
            String str4 = this.f1776f;
            if (acc.m25453c(str4, str) && (i = this.f1777g) == i2 && acc.m25453c(this.f1778h, castDevice.f1778h) && this.f1779i.m91068a() == castDevice.f1779i.m91068a() && this.f1780t == castDevice.f1780t && acc.m25453c(this.f1768X, castDevice.f1768X) && acc.m25453c(Integer.valueOf(this.f1770Z), Integer.valueOf(castDevice.f1770Z)) && acc.m25453c(this.f1760L0, castDevice.f1760L0) && acc.m25453c(this.f1769Y, castDevice.f1769Y) && acc.m25453c(str4, str) && i == i2 && ((((bArr = this.f1761M0) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && acc.m25453c(this.f1762N0, castDevice.f1762N0) && this.f1763O0 == castDevice.f1763O0 && acc.m25453c(m1483n0(), castDevice.m1483n0()))) {
                if (acc.m25453c(Boolean.valueOf(m1485r0()), Boolean.valueOf(castDevice.m1485r0() && acc.m25453c(this.f1767S0, castDevice.f1767S0)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1771a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final String m1482k() {
        String str = this.f1771a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    /* JADX INFO: renamed from: n0 */
    public final r6f1 m1483n0() {
        r6f1 r6f1Var = this.f1764P0;
        return (r6f1Var == null && this.f1779i.m91071h()) ? gyf1.m46134B() : r6f1Var;
    }

    /* JADX INFO: renamed from: q0 */
    public final int m1484q0() {
        xhy0 xhy0Var = this.f1779i;
        if (xhy0Var.m91069c(64)) {
            return 4;
        }
        if (xhy0Var.m91070g()) {
            return 3;
        }
        if (xhy0Var.m91071h()) {
            return 5;
        }
        return xhy0Var.m91069c(1) ? 2 : 1;
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m1485r0() {
        Boolean bool = this.f1766R0;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.f1780t;
        return i != -1 && (i & 2) > 0;
    }

    public final String toString() {
        String strConcat;
        xhy0 xhy0Var = this.f1779i;
        if (xhy0Var.m91069c(64)) {
            strConcat = "[dynamic group]";
        } else if (xhy0Var.m91070g()) {
            strConcat = "[static group]";
        } else {
            strConcat = xhy0Var.m91071h() ? "[speaker pair]" : "";
        }
        if (xhy0Var.m91069c(262144)) {
            strConcat = strConcat.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = acc.f14312a;
        String str = this.f1774d;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
            }
        }
        StringBuilder sbM38573v = edb.m38573v("\"", str, "\" (", this.f1771a, ") ");
        sbM38573v.append(strConcat);
        return sbM38573v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26308N(parcel, 2, this.f1771a);
        alf1.m26308N(parcel, 3, this.f1772b);
        alf1.m26308N(parcel, 4, this.f1774d);
        alf1.m26308N(parcel, 5, this.f1775e);
        alf1.m26308N(parcel, 6, this.f1776f);
        alf1.m26302H(parcel, 7, this.f1777g);
        alf1.m26312R(parcel, 8, Collections.unmodifiableList(this.f1778h));
        alf1.m26302H(parcel, 9, this.f1779i.m91068a());
        alf1.m26302H(parcel, 10, this.f1780t);
        alf1.m26308N(parcel, 11, this.f1768X);
        alf1.m26308N(parcel, 12, this.f1769Y);
        alf1.m26302H(parcel, 13, this.f1770Z);
        alf1.m26308N(parcel, 14, this.f1760L0);
        alf1.m26298D(parcel, 15, this.f1761M0);
        alf1.m26308N(parcel, 16, this.f1762N0);
        alf1.m26295A(parcel, 17, this.f1763O0);
        alf1.m26307M(parcel, 18, m1483n0(), i);
        alf1.m26304J(parcel, 19, this.f1765Q0);
        alf1.m26296B(parcel, 20, Boolean.valueOf(m1485r0()));
        alf1.m26307M(parcel, 21, this.f1767S0, i);
        alf1.m26331n(iM26329l, parcel);
    }
}
