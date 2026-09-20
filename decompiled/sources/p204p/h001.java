package p204p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h001 {

    /* JADX INFO: renamed from: d */
    public static final String f86090d;

    /* JADX INFO: renamed from: e */
    public static final String f86091e;

    /* JADX INFO: renamed from: f */
    public static final String f86092f;

    /* JADX INFO: renamed from: a */
    public final int f86093a;

    /* JADX INFO: renamed from: b */
    public final String f86094b;

    /* JADX INFO: renamed from: c */
    public final Bundle f86095c;

    static {
        String str = h0b1.f86200a;
        f86090d = Integer.toString(0, 36);
        f86091e = Integer.toString(1, 36);
        f86092f = Integer.toString(2, 36);
    }

    public h001(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }

    /* JADX INFO: renamed from: a */
    public static h001 m46234a(Bundle bundle) {
        int i = bundle.getInt(f86090d, 1000);
        String string = bundle.getString(f86091e, "");
        Bundle bundleM46328p = h0b1.m46328p(bundle.getBundle(f86092f));
        if (bundleM46328p == null) {
            bundleM46328p = Bundle.EMPTY;
        }
        return new h001(string, i, bundleM46328p);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m46235b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f86090d, this.f86093a);
        bundle.putString(f86091e, this.f86094b);
        Bundle bundle2 = this.f86095c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f86092f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h001)) {
            return false;
        }
        h001 h001Var = (h001) obj;
        return this.f86093a == h001Var.f86093a && Objects.equals(this.f86094b, h001Var.f86094b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f86093a), this.f86094b);
    }

    public h001(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        c95.m31843i(z);
        this.f86093a = i;
        this.f86094b = str;
        this.f86095c = bundle;
    }
}
