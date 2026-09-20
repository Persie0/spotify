package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ebc extends AbstractC2206o9 {
    public static final Parcelable.Creator<ebc> CREATOR;

    /* JADX INFO: renamed from: Q0 */
    public static final yeg1 f57879Q0 = new yeg1(false);

    /* JADX INFO: renamed from: R0 */
    public static final blg1 f57880R0 = new blg1(0);

    /* JADX INFO: renamed from: S0 */
    public static final wac f57881S0;

    /* JADX INFO: renamed from: L0 */
    public final boolean f57882L0;

    /* JADX INFO: renamed from: M0 */
    public final yeg1 f57883M0;

    /* JADX INFO: renamed from: N0 */
    public blg1 f57884N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f57885O0;

    /* JADX INFO: renamed from: P0 */
    public final boolean f57886P0;

    /* JADX INFO: renamed from: X */
    public final boolean f57887X;

    /* JADX INFO: renamed from: Y */
    public final List f57888Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f57889Z;

    /* JADX INFO: renamed from: a */
    public final String f57890a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f57891b;

    /* JADX INFO: renamed from: c */
    public final boolean f57892c;

    /* JADX INFO: renamed from: d */
    public final kn70 f57893d;

    /* JADX INFO: renamed from: e */
    public final boolean f57894e;

    /* JADX INFO: renamed from: f */
    public final wac f57895f;

    /* JADX INFO: renamed from: g */
    public final boolean f57896g;

    /* JADX INFO: renamed from: h */
    public final double f57897h;

    /* JADX INFO: renamed from: i */
    public final boolean f57898i;

    /* JADX INFO: renamed from: t */
    public final boolean f57899t;

    static {
        zmn0 zmn0Var = new zmn0(10);
        zmn0Var.m96466A();
        zmn0Var.m96467B();
        f57881S0 = zmn0Var.m96479l();
        CREATOR = new g7g1(19);
    }

    public ebc(String str, ArrayList arrayList, boolean z, kn70 kn70Var, boolean z2, wac wacVar, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, yeg1 yeg1Var, blg1 blg1Var, boolean z9, boolean z10) {
        this.f57890a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f57891b = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f57892c = z;
        this.f57893d = kn70Var == null ? new kn70() : kn70Var;
        this.f57894e = z2;
        this.f57895f = wacVar;
        this.f57896g = z3;
        this.f57897h = d;
        this.f57898i = z4;
        this.f57899t = z5;
        this.f57887X = z6;
        this.f57888Y = arrayList2;
        this.f57889Z = z7;
        this.f57882L0 = z8;
        this.f57883M0 = yeg1Var;
        this.f57884N0 = blg1Var;
        this.f57885O0 = z9;
        this.f57886P0 = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26308N(parcel, 2, this.f57890a);
        alf1.m26310P(parcel, 3, Collections.unmodifiableList(this.f57891b));
        alf1.m26295A(parcel, 4, this.f57892c);
        alf1.m26307M(parcel, 5, this.f57893d, i);
        alf1.m26295A(parcel, 6, this.f57894e);
        alf1.m26307M(parcel, 7, this.f57895f, i);
        alf1.m26295A(parcel, 8, this.f57896g);
        alf1.m26299E(parcel, this.f57897h);
        alf1.m26295A(parcel, 10, this.f57898i);
        alf1.m26295A(parcel, 11, this.f57899t);
        alf1.m26295A(parcel, 12, this.f57887X);
        alf1.m26310P(parcel, 13, Collections.unmodifiableList(this.f57888Y));
        alf1.m26295A(parcel, 14, this.f57889Z);
        alf1.m26302H(parcel, 15, 0);
        alf1.m26295A(parcel, 16, this.f57882L0);
        alf1.m26307M(parcel, 17, this.f57883M0, i);
        alf1.m26307M(parcel, 18, this.f57884N0, i);
        alf1.m26295A(parcel, 19, this.f57885O0);
        alf1.m26295A(parcel, 20, this.f57886P0);
        alf1.m26331n(iM26329l, parcel);
    }
}
