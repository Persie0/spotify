package p204p;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class rfd0 {

    /* JADX INFO: renamed from: h */
    public static final String f198579h;

    /* JADX INFO: renamed from: i */
    public static final String f198580i;

    /* JADX INFO: renamed from: j */
    public static final String f198581j;

    /* JADX INFO: renamed from: k */
    public static final String f198582k;

    /* JADX INFO: renamed from: l */
    public static final String f198583l;

    /* JADX INFO: renamed from: m */
    public static final String f198584m;

    /* JADX INFO: renamed from: n */
    public static final String f198585n;

    /* JADX INFO: renamed from: a */
    public final Uri f198586a;

    /* JADX INFO: renamed from: b */
    public final String f198587b;

    /* JADX INFO: renamed from: c */
    public final String f198588c;

    /* JADX INFO: renamed from: d */
    public final int f198589d;

    /* JADX INFO: renamed from: e */
    public final int f198590e;

    /* JADX INFO: renamed from: f */
    public final String f198591f;

    /* JADX INFO: renamed from: g */
    public final String f198592g;

    static {
        String str = h0b1.f86200a;
        f198579h = Integer.toString(0, 36);
        f198580i = Integer.toString(1, 36);
        f198581j = Integer.toString(2, 36);
        f198582k = Integer.toString(3, 36);
        f198583l = Integer.toString(4, 36);
        f198584m = Integer.toString(5, 36);
        f198585n = Integer.toString(6, 36);
    }

    public rfd0(zwi zwiVar) {
        this.f198586a = (Uri) zwiVar.f286989c;
        this.f198587b = (String) zwiVar.f286993g;
        this.f198588c = (String) zwiVar.f286990d;
        this.f198589d = zwiVar.f286987a;
        this.f198590e = zwiVar.f286988b;
        this.f198591f = (String) zwiVar.f286991e;
        this.f198592g = (String) zwiVar.f286992f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfd0)) {
            return false;
        }
        rfd0 rfd0Var = (rfd0) obj;
        return this.f198586a.equals(rfd0Var.f198586a) && Objects.equals(this.f198587b, rfd0Var.f198587b) && Objects.equals(this.f198588c, rfd0Var.f198588c) && this.f198589d == rfd0Var.f198589d && this.f198590e == rfd0Var.f198590e && Objects.equals(this.f198591f, rfd0Var.f198591f) && Objects.equals(this.f198592g, rfd0Var.f198592g);
    }

    public final int hashCode() {
        int iHashCode = this.f198586a.hashCode() * 31;
        String str = this.f198587b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198588c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f198589d) * 31) + this.f198590e) * 31;
        String str3 = this.f198591f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f198592g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
