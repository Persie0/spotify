package p204p;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class xs6 {

    /* JADX INFO: renamed from: i */
    public static final xs6 f265509i = new C2120ma().m61233a();

    /* JADX INFO: renamed from: j */
    public static final String f265510j;

    /* JADX INFO: renamed from: k */
    public static final String f265511k;

    /* JADX INFO: renamed from: l */
    public static final String f265512l;

    /* JADX INFO: renamed from: m */
    public static final String f265513m;

    /* JADX INFO: renamed from: n */
    public static final String f265514n;

    /* JADX INFO: renamed from: o */
    public static final String f265515o;

    /* JADX INFO: renamed from: p */
    public static final String f265516p;

    /* JADX INFO: renamed from: a */
    public final int f265517a;

    /* JADX INFO: renamed from: b */
    public final int f265518b;

    /* JADX INFO: renamed from: c */
    public final int f265519c;

    /* JADX INFO: renamed from: d */
    public final int f265520d;

    /* JADX INFO: renamed from: e */
    public final int f265521e;

    /* JADX INFO: renamed from: f */
    public final boolean f265522f;

    /* JADX INFO: renamed from: g */
    public final boolean f265523g;

    /* JADX INFO: renamed from: h */
    public AudioAttributes f265524h;

    static {
        String str = h0b1.f86200a;
        f265510j = Integer.toString(0, 36);
        f265511k = Integer.toString(1, 36);
        f265512l = Integer.toString(2, 36);
        f265513m = Integer.toString(3, 36);
        f265514n = Integer.toString(4, 36);
        f265515o = Integer.toString(5, 36);
        f265516p = Integer.toString(6, 36);
    }

    public xs6(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.f265517a = i;
        this.f265518b = i2;
        this.f265519c = i3;
        this.f265520d = i4;
        this.f265521e = i5;
        this.f265522f = z;
        this.f265523g = z2;
    }

    /* JADX INFO: renamed from: a */
    public static xs6 m91965a(Bundle bundle) {
        C2120ma c2120ma = new C2120ma();
        String str = f265510j;
        if (bundle.containsKey(str)) {
            c2120ma.m61235c(bundle.getInt(str));
        }
        String str2 = f265511k;
        if (bundle.containsKey(str2)) {
            c2120ma.m61236d(bundle.getInt(str2));
        }
        String str3 = f265512l;
        if (bundle.containsKey(str3)) {
            c2120ma.m61240h(bundle.getInt(str3));
        }
        String str4 = f265513m;
        if (bundle.containsKey(str4)) {
            c2120ma.m61234b(bundle.getInt(str4));
        }
        String str5 = f265514n;
        if (bundle.containsKey(str5)) {
            c2120ma.m61239g(bundle.getInt(str5));
        }
        String str6 = f265515o;
        if (bundle.containsKey(str6)) {
            c2120ma.m61238f(bundle.getBoolean(str6));
        }
        String str7 = f265516p;
        if (bundle.containsKey(str7)) {
            c2120ma.m61237e(bundle.getBoolean(str7));
        }
        return c2120ma.m61233a();
    }

    /* JADX INFO: renamed from: b */
    public static xs6 m91966b(AudioAttributes audioAttributes) {
        C2120ma c2120ma = new C2120ma();
        c2120ma.m61235c(audioAttributes.getContentType());
        c2120ma.m61236d(audioAttributes.getFlags());
        c2120ma.m61240h(audioAttributes.getUsage());
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c2120ma.m61234b(audioAttributes.getAllowedCapturePolicy());
            c2120ma.m61237e(audioAttributes.areHapticChannelsMuted());
        }
        if (i >= 32) {
            c2120ma.m61239g(audioAttributes.getSpatializationBehavior());
            c2120ma.m61238f(audioAttributes.isContentSpatialized());
        }
        return c2120ma.m61233a();
    }

    /* JADX INFO: renamed from: c */
    public final AudioAttributes m91967c() {
        if (this.f265524h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f265517a).setFlags(this.f265518b).setUsage(this.f265519c);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                lzj.m60350a0(usage, this.f265520d);
                lzj.m60349a(usage, this.f265523g);
            }
            if (i >= 32) {
                ws6.m88876b(usage, this.f265521e);
                ws6.m88875a(usage, this.f265522f);
            }
            this.f265524h = usage.build();
        }
        return this.f265524h;
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m91968d() {
        Bundle bundle = new Bundle();
        int i = this.f265517a;
        if (i != 0) {
            bundle.putInt(f265510j, i);
        }
        int i2 = this.f265518b;
        if (i2 != 0) {
            bundle.putInt(f265511k, i2);
        }
        int i3 = this.f265519c;
        if (i3 != 1) {
            bundle.putInt(f265512l, i3);
        }
        int i4 = this.f265520d;
        if (i4 != 1) {
            bundle.putInt(f265513m, i4);
        }
        int i5 = this.f265521e;
        if (i5 != 0) {
            bundle.putInt(f265514n, i5);
        }
        boolean z = this.f265522f;
        if (z) {
            bundle.putBoolean(f265515o, z);
        }
        boolean z2 = this.f265523g;
        if (!z2) {
            bundle.putBoolean(f265516p, z2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xs6.class == obj.getClass()) {
            xs6 xs6Var = (xs6) obj;
            if (this.f265517a == xs6Var.f265517a && this.f265518b == xs6Var.f265518b && this.f265519c == xs6Var.f265519c && this.f265520d == xs6Var.f265520d && this.f265521e == xs6Var.f265521e && this.f265522f == xs6Var.f265522f && this.f265523g == xs6Var.f265523g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f265517a) * 31) + this.f265518b) * 31) + this.f265519c) * 31) + this.f265520d) * 31) + this.f265521e) * 31) + (this.f265522f ? 1 : 0)) * 31) + (this.f265523g ? 1 : 0);
    }
}
