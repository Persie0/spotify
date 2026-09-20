package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pfd0 {

    /* JADX INFO: renamed from: d */
    public static final pfd0 f177032d = new pfd0(new d670());

    /* JADX INFO: renamed from: e */
    public static final String f177033e;

    /* JADX INFO: renamed from: f */
    public static final String f177034f;

    /* JADX INFO: renamed from: g */
    public static final String f177035g;

    /* JADX INFO: renamed from: a */
    public final Uri f177036a;

    /* JADX INFO: renamed from: b */
    public final String f177037b;

    /* JADX INFO: renamed from: c */
    public final Bundle f177038c;

    static {
        String str = h0b1.f86200a;
        f177033e = Integer.toString(0, 36);
        f177034f = Integer.toString(1, 36);
        f177035g = Integer.toString(2, 36);
    }

    public pfd0(d670 d670Var) {
        this.f177036a = (Uri) d670Var.f45617b;
        this.f177037b = (String) d670Var.f45618c;
        this.f177038c = (Bundle) d670Var.f45619d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfd0)) {
            return false;
        }
        pfd0 pfd0Var = (pfd0) obj;
        if (Objects.equals(this.f177036a, pfd0Var.f177036a) && Objects.equals(this.f177037b, pfd0Var.f177037b)) {
            if ((this.f177038c == null) == (pfd0Var.f177038c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f177036a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f177037b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f177038c != null ? 1 : 0);
    }
}
