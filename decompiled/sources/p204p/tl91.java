package p204p;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
public final class tl91 {

    /* JADX INFO: renamed from: a */
    public String f221397a;

    /* JADX INFO: renamed from: b */
    public int f221398b;

    /* JADX INFO: renamed from: c */
    public boolean f221399c;

    /* JADX INFO: renamed from: d */
    public int f221400d;

    /* JADX INFO: renamed from: e */
    public boolean f221401e;

    /* JADX INFO: renamed from: k */
    public float f221407k;

    /* JADX INFO: renamed from: l */
    public String f221408l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f221411o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f221412p;

    /* JADX INFO: renamed from: r */
    public p571 f221414r;

    /* JADX INFO: renamed from: t */
    public String f221416t;

    /* JADX INFO: renamed from: u */
    public String f221417u;

    /* JADX INFO: renamed from: v */
    public String f221418v;

    /* JADX INFO: renamed from: f */
    public int f221402f = -1;

    /* JADX INFO: renamed from: g */
    public int f221403g = -1;

    /* JADX INFO: renamed from: h */
    public int f221404h = -1;

    /* JADX INFO: renamed from: i */
    public int f221405i = -1;

    /* JADX INFO: renamed from: j */
    public int f221406j = -1;

    /* JADX INFO: renamed from: m */
    public int f221409m = -1;

    /* JADX INFO: renamed from: n */
    public int f221410n = -1;

    /* JADX INFO: renamed from: q */
    public int f221413q = -1;

    /* JADX INFO: renamed from: s */
    public float f221415s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m81042a(tl91 tl91Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (tl91Var != null) {
            if (!this.f221399c && tl91Var.f221399c) {
                this.f221398b = tl91Var.f221398b;
                this.f221399c = true;
            }
            if (this.f221404h == -1) {
                this.f221404h = tl91Var.f221404h;
            }
            if (this.f221405i == -1) {
                this.f221405i = tl91Var.f221405i;
            }
            if (this.f221397a == null && (str = tl91Var.f221397a) != null) {
                this.f221397a = str;
            }
            if (this.f221402f == -1) {
                this.f221402f = tl91Var.f221402f;
            }
            if (this.f221403g == -1) {
                this.f221403g = tl91Var.f221403g;
            }
            if (this.f221410n == -1) {
                this.f221410n = tl91Var.f221410n;
            }
            if (this.f221411o == null && (alignment2 = tl91Var.f221411o) != null) {
                this.f221411o = alignment2;
            }
            if (this.f221412p == null && (alignment = tl91Var.f221412p) != null) {
                this.f221412p = alignment;
            }
            if (this.f221413q == -1) {
                this.f221413q = tl91Var.f221413q;
            }
            if (this.f221406j == -1) {
                this.f221406j = tl91Var.f221406j;
                this.f221407k = tl91Var.f221407k;
            }
            if (this.f221414r == null) {
                this.f221414r = tl91Var.f221414r;
            }
            if (this.f221415s == Float.MAX_VALUE) {
                this.f221415s = tl91Var.f221415s;
            }
            if (this.f221416t == null) {
                this.f221416t = tl91Var.f221416t;
            }
            if (this.f221417u == null) {
                this.f221417u = tl91Var.f221417u;
            }
            if (this.f221418v == null) {
                this.f221418v = tl91Var.f221418v;
            }
            if (!this.f221401e && tl91Var.f221401e) {
                this.f221400d = tl91Var.f221400d;
                this.f221401e = true;
            }
            if (this.f221409m != -1 || (i = tl91Var.f221409m) == -1) {
                return;
            }
            this.f221409m = i;
        }
    }
}
