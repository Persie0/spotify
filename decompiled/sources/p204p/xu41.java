package p204p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class xu41 {

    /* JADX INFO: renamed from: a */
    public t531 f265991a;

    /* JADX INFO: renamed from: b */
    public boolean f265992b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f265993c;

    /* JADX INFO: renamed from: d */
    public final HashMap f265994d;

    /* JADX INFO: renamed from: e */
    public final HashMap f265995e;

    /* JADX INFO: renamed from: f */
    public final v6j f265996f;

    /* JADX INFO: renamed from: g */
    public int f265997g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f265998h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f265999i;

    /* JADX INFO: renamed from: j */
    public boolean f266000j;

    /* JADX INFO: renamed from: k */
    public final yqq f266001k;

    /* JADX INFO: renamed from: l */
    public long f266002l;

    public xu41(yqq yqqVar) {
        HashMap map = new HashMap();
        this.f265993c = map;
        this.f265994d = new HashMap();
        this.f265995e = new HashMap();
        v6j v6jVar = new v6j(this);
        this.f265996f = v6jVar;
        this.f265997g = 0;
        this.f265998h = new ArrayList();
        this.f265999i = new ArrayList();
        this.f266000j = true;
        v6jVar.f237876a = 0;
        map.put(0, v6jVar);
        this.f266001k = yqqVar;
        this.f266002l = e8j.m38111b(0, 0, 0, 0, 15);
        this.f265991a = new t531(this, 29);
    }

    /* JADX INFO: renamed from: a */
    public final void m92120a(Object obj) {
        this.f265998h.add(obj);
        this.f266000j = true;
    }

    /* JADX INFO: renamed from: b */
    public final v6j m92121b(Object obj) {
        HashMap map = this.f265993c;
        ulv0 ulv0Var = (ulv0) map.get(obj);
        Object obj2 = ulv0Var;
        if (ulv0Var == null) {
            v6j v6jVar = new v6j(this);
            map.put(obj, v6jVar);
            v6jVar.f237876a = obj;
            obj2 = v6jVar;
        }
        if (obj2 instanceof v6j) {
            return (v6j) obj2;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m92122c(Float f) {
        return Math.round(f.floatValue());
    }

    /* JADX INFO: renamed from: d */
    public final t531 m92123d() {
        return this.f265991a;
    }

    /* JADX INFO: renamed from: e */
    public final ma20 m92124e(int i, String str) {
        v6j v6jVarM92121b = m92121b(str);
        Object obj = v6jVarM92121b.f237880c;
        if (obj == null || !(obj instanceof ma20)) {
            ma20 ma20Var = new ma20(this);
            ma20Var.f141433b = i;
            ma20Var.f141438g = str;
            v6jVarM92121b.f237880c = ma20Var;
            v6jVarM92121b.mo61241a(ma20Var.mo48198b());
        }
        return (ma20) v6jVarM92121b.f237880c;
    }

    /* JADX INFO: renamed from: f */
    public final hq20 m92125f(int i) {
        hq20 r630Var;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.f265997g;
        this.f265997g = i2 + 1;
        String strM56832d = klh.m56832d(i2, "__", sb);
        HashMap map = this.f265994d;
        hq20 hq20Var = (hq20) map.get(strM56832d);
        hq20 hq20Var2 = hq20Var;
        if (hq20Var == null) {
            int i3 = 4;
            switch (edb.m38547C(i)) {
                case 0:
                    r630Var = new r630(this, 1);
                    break;
                case 1:
                    r630Var = new sfb1(this, 2);
                    break;
                case 2:
                    e93 e93Var = new e93(this, i3, 0);
                    e93Var.f57350o0 = 0.5f;
                    r630Var = e93Var;
                    break;
                case 3:
                    e93 e93Var2 = new e93(this, i3, 1);
                    e93Var2.f57350o0 = 0.5f;
                    r630Var = e93Var2;
                    break;
                case 4:
                    r630Var = new jx8(this, 5);
                    break;
                case 5:
                default:
                    r630Var = new hq20(this, i);
                    break;
                case 6:
                case 7:
                    r630Var = new wmz(this, i);
                    break;
                case 8:
                case 9:
                case 10:
                    r630Var = new g020(this, i);
                    break;
            }
            r630Var.f237876a = strM56832d;
            map.put(strM56832d, r630Var);
            hq20Var2 = r630Var;
        }
        return hq20Var2;
    }

    /* JADX INFO: renamed from: g */
    public final r630 m92126g() {
        return (r630) m92125f(1);
    }

    /* JADX INFO: renamed from: h */
    public final void m92127h(String str) {
        m92124e(0, str);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m92128i() {
        return this.f265992b;
    }

    /* JADX INFO: renamed from: j */
    public final sfb1 m92129j() {
        return (sfb1) m92125f(2);
    }

    /* JADX INFO: renamed from: k */
    public final void m92130k(String str) {
        m92124e(1, str);
    }
}
