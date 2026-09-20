package p204p;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class eb10 extends AbstractC2206o9 {
    public static final Parcelable.Creator<eb10> CREATOR = new g7g1(17);

    /* JADX INFO: renamed from: M0 */
    public static final Scope[] f57767M0 = new Scope[0];

    /* JADX INFO: renamed from: N0 */
    public static final gey[] f57768N0 = new gey[0];

    /* JADX INFO: renamed from: L0 */
    public final String f57769L0;

    /* JADX INFO: renamed from: X */
    public final boolean f57770X;

    /* JADX INFO: renamed from: Y */
    public final int f57771Y;

    /* JADX INFO: renamed from: Z */
    public boolean f57772Z;

    /* JADX INFO: renamed from: a */
    public final int f57773a;

    /* JADX INFO: renamed from: b */
    public final int f57774b;

    /* JADX INFO: renamed from: c */
    public final int f57775c;

    /* JADX INFO: renamed from: d */
    public String f57776d;

    /* JADX INFO: renamed from: e */
    public IBinder f57777e;

    /* JADX INFO: renamed from: f */
    public Scope[] f57778f;

    /* JADX INFO: renamed from: g */
    public Bundle f57779g;

    /* JADX INFO: renamed from: h */
    public Account f57780h;

    /* JADX INFO: renamed from: i */
    public gey[] f57781i;

    /* JADX INFO: renamed from: t */
    public gey[] f57782t;

    public eb10(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, gey[] geyVarArr, gey[] geyVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? f57767M0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        gey[] geyVarArr3 = f57768N0;
        geyVarArr = geyVarArr == null ? geyVarArr3 : geyVarArr;
        geyVarArr2 = geyVarArr2 == null ? geyVarArr3 : geyVarArr2;
        this.f57773a = i;
        this.f57774b = i2;
        this.f57775c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f57776d = "com.google.android.gms";
        } else {
            this.f57776d = str;
        }
        if (i < 2) {
            this.f57780h = iBinder != null ? AbstractBinderC1781dk.m36240d2(AbstractBinderC1781dk.m36239c2(iBinder)) : null;
        } else {
            this.f57777e = iBinder;
            this.f57780h = account;
        }
        this.f57778f = scopeArr;
        this.f57779g = bundle;
        this.f57781i = geyVarArr;
        this.f57782t = geyVarArr2;
        this.f57770X = z;
        this.f57771Y = i4;
        this.f57772Z = z2;
        this.f57769L0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g7g1.m43822a(this, parcel, i);
    }
}
