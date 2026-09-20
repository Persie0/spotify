package p204p;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class onx {

    /* JADX INFO: renamed from: a */
    public final long f167378a;

    /* JADX INFO: renamed from: b */
    public final long f167379b;

    /* JADX INFO: renamed from: c */
    public final int f167380c;

    /* JADX INFO: renamed from: d */
    public final int f167381d;

    /* JADX INFO: renamed from: e */
    public final int f167382e;

    /* JADX INFO: renamed from: f */
    public final String f167383f;

    /* JADX INFO: renamed from: g */
    public final String f167384g;

    /* JADX INFO: renamed from: h */
    public final int f167385h;

    /* JADX INFO: renamed from: i */
    public final p7f f167386i;

    /* JADX INFO: renamed from: j */
    public final int f167387j;

    /* JADX INFO: renamed from: k */
    public final int f167388k;

    /* JADX INFO: renamed from: l */
    public final int f167389l;

    /* JADX INFO: renamed from: m */
    public final String f167390m;

    /* JADX INFO: renamed from: n */
    public final String f167391n;

    /* JADX INFO: renamed from: o */
    public final int f167392o;

    /* JADX INFO: renamed from: p */
    public final ExportException f167393p;

    /* JADX INFO: renamed from: q */
    public final pf40 f167394q;

    public onx(wsv0 wsv0Var, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, p7f p7fVar, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.f167394q = wsv0Var;
        this.f167378a = j;
        this.f167379b = j2;
        this.f167380c = i;
        this.f167381d = i2;
        this.f167382e = i3;
        this.f167383f = str;
        this.f167384g = str2;
        this.f167385h = i4;
        this.f167386i = p7fVar;
        this.f167387j = i5;
        this.f167388k = i6;
        this.f167389l = i7;
        this.f167390m = str3;
        this.f167391n = str4;
        this.f167392o = i8;
        this.f167393p = exportException;
        m67441a(str2, i8, wsv0Var, 1);
        m67441a(str4, i8, wsv0Var, 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m67441a(String str, int i, wsv0 wsv0Var, int i2) {
        if (str == null || i == 1) {
            return;
        }
        char c = 0;
        kf40 kf40VarListIterator = wsv0Var.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            nnx nnxVar = (nnx) kf40VarListIterator.next();
            if ((i2 == 1 ? nnxVar.f156508d : nnxVar.f156509e) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onx)) {
            return false;
        }
        onx onxVar = (onx) obj;
        return Objects.equals(this.f167394q, onxVar.f167394q) && this.f167378a == onxVar.f167378a && this.f167379b == onxVar.f167379b && this.f167380c == onxVar.f167380c && this.f167381d == onxVar.f167381d && this.f167382e == onxVar.f167382e && Objects.equals(this.f167383f, onxVar.f167383f) && Objects.equals(this.f167384g, onxVar.f167384g) && this.f167385h == onxVar.f167385h && Objects.equals(this.f167386i, onxVar.f167386i) && this.f167387j == onxVar.f167387j && this.f167388k == onxVar.f167388k && this.f167389l == onxVar.f167389l && Objects.equals(this.f167390m, onxVar.f167390m) && Objects.equals(this.f167391n, onxVar.f167391n) && this.f167392o == onxVar.f167392o && Objects.equals(this.f167393p, onxVar.f167393p);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f167393p) + ((((Objects.hashCode(this.f167391n) + ((Objects.hashCode(this.f167390m) + ((((((((Objects.hashCode(this.f167386i) + ((((Objects.hashCode(this.f167384g) + ((Objects.hashCode(this.f167383f) + (((((((((((Objects.hashCode(this.f167394q) * 31) + ((int) this.f167378a)) * 31) + ((int) this.f167379b)) * 31) + this.f167380c) * 31) + this.f167381d) * 31) + this.f167382e) * 31)) * 31)) * 31) + this.f167385h) * 31)) * 31) + this.f167387j) * 31) + this.f167388k) * 31) + this.f167389l) * 31)) * 31)) * 31) + this.f167392o) * 31);
    }
}
