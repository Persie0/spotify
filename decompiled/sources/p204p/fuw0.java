package p204p;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class fuw0 {

    /* JADX INFO: renamed from: l */
    public static final char[] f73586l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f73587m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f73588a;

    /* JADX INFO: renamed from: b */
    public final ph30 f73589b;

    /* JADX INFO: renamed from: c */
    public String f73590c;

    /* JADX INFO: renamed from: d */
    public rth f73591d;

    /* JADX INFO: renamed from: e */
    public final ztw0 f73592e = new ztw0();

    /* JADX INFO: renamed from: f */
    public final sep f73593f;

    /* JADX INFO: renamed from: g */
    public ayd0 f73594g;

    /* JADX INFO: renamed from: h */
    public final boolean f73595h;

    /* JADX INFO: renamed from: i */
    public final oge0 f73596i;

    /* JADX INFO: renamed from: j */
    public final i5z f73597j;

    /* JADX INFO: renamed from: k */
    public euw0 f73598k;

    public fuw0(String str, ph30 ph30Var, String str2, sn20 sn20Var, ayd0 ayd0Var, boolean z, boolean z2, boolean z3) {
        this.f73588a = str;
        this.f73589b = ph30Var;
        this.f73590c = str2;
        this.f73594g = ayd0Var;
        this.f73595h = z;
        if (sn20Var != null) {
            this.f73593f = sn20Var.m78536e();
        } else {
            this.f73593f = new sep(1, false);
        }
        if (z2) {
            this.f73597j = new i5z();
        } else if (z3) {
            oge0 oge0Var = new oge0();
            this.f73596i = oge0Var;
            oge0Var.m66893p(kai0.f120909g);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m42751a(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                urv0 urv0Var = ayd0.f21209e;
                this.f73594g = zn91.m96520H(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(edb.m38564m("Malformed content type: ", str2), e);
            }
        }
        sep sepVar = this.f73593f;
        if (!z) {
            sepVar.m77929c(str, str2);
            return;
        }
        sepVar.getClass();
        q0f1.m71819F(str);
        q0f1.m71841p(sepVar, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m42752b(String str, String str2, boolean z) {
        rth rthVar;
        String str3 = this.f73590c;
        if (str3 != null) {
            ph30 ph30Var = this.f73589b;
            ph30Var.getClass();
            try {
                rthVar = new rth();
                rthVar.m76391l(ph30Var, str3);
            } catch (IllegalArgumentException unused) {
                rthVar = null;
            }
            this.f73591d = rthVar;
            if (rthVar == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + ph30Var + ", Relative: " + this.f73590c);
            }
            this.f73590c = null;
        }
        if (!z) {
            this.f73591d.m76381b(str, str2);
            return;
        }
        rth rthVar2 = this.f73591d;
        if (rthVar2.f202589d == null) {
            rthVar2.f202589d = new ArrayList();
        }
        ArrayList arrayList = rthVar2.f202589d;
        wj50.m88279p(arrayList);
        arrayList.add(g0b1.m43267i(str, 0, 0, 83, " \"'<>#&="));
        ArrayList arrayList2 = rthVar2.f202589d;
        wj50.m88279p(arrayList2);
        arrayList2.add(str2 != null ? g0b1.m43267i(str2, 0, 0, 83, " \"'<>#&=") : null);
    }
}
