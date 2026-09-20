package p204p;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ctj0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f41894a;

    /* JADX INFO: renamed from: b */
    public IconCompat f41895b;

    /* JADX INFO: renamed from: c */
    public final tdw0[] f41896c;

    /* JADX INFO: renamed from: d */
    public final boolean f41897d;

    /* JADX INFO: renamed from: e */
    public final boolean f41898e;

    /* JADX INFO: renamed from: f */
    public final int f41899f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f41900g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f41901h;

    public ctj0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, tdw0[] tdw0VarArr, tdw0[] tdw0VarArr2, boolean z, boolean z2) {
        this.f41898e = true;
        this.f41895b = iconCompat;
        if (iconCompat != null && iconCompat.m396j() == 2) {
            this.f41899f = iconCompat.m394h();
        }
        this.f41900g = ktj0.m57322d(charSequence);
        this.f41901h = pendingIntent;
        this.f41894a = bundle == null ? new Bundle() : bundle;
        this.f41896c = tdw0VarArr;
        this.f41897d = z;
        this.f41898e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final IconCompat m33845a() {
        int i;
        if (this.f41895b == null && (i = this.f41899f) != 0) {
            this.f41895b = IconCompat.m393g(null, "", i);
        }
        return this.f41895b;
    }
}
