package p204p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sep implements xut, v8j {

    /* JADX INFO: renamed from: a */
    public ArrayList f208338a;

    public sep(int i, boolean z) {
        switch (i) {
            case 1:
                this.f208338a = new ArrayList(20);
                break;
            case 3:
                this.f208338a = new ArrayList(32);
                break;
            case 6:
                List<String> listM46715L = h6f.m46715L("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha");
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM46715L, 10));
                for (String str : listM46715L) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
                    sb.append("https://");
                    sb.append(str);
                    sb.append("/");
                    arrayList.add(sb.toString());
                }
                this.f208338a = arrayList;
                break;
            default:
                this.f208338a = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m77924A(String str) {
        ArrayList arrayList = this.f208338a;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m77925B(String str, String str2) {
        q0f1.m71819F(str);
        q0f1.m71820H(str2, str);
        m77924A(str);
        q0f1.m71841p(this, str, str2);
    }

    /* JADX INFO: renamed from: C */
    public void m77926C(float f) {
        this.f208338a.add(new tcn0(f));
    }

    /* JADX INFO: renamed from: D */
    public void m77927D(float f) {
        this.f208338a.add(new scn0(f));
    }

    @Override // p204p.xut
    /* JADX INFO: renamed from: a */
    public void mo67301a(i7t0 i7t0Var, gh00 gh00Var) {
        this.f208338a.add(pgg1.m69886i(i7t0Var, gh00Var));
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        this.f208338a.add((z0m) obj);
    }

    /* JADX INFO: renamed from: b */
    public void m77928b(Object obj) {
        ArrayList arrayList = this.f208338a;
        jg31.m53269g(obj, "Set contributions cannot be null");
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: c */
    public void m77929c(String str, String str2) {
        q0f1.m71819F(str);
        q0f1.m71820H(str2, str);
        q0f1.m71841p(this, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public void m77930d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.f208338a == null) {
                this.f208338a = new ArrayList();
            }
            if (!this.f208338a.contains(str)) {
                this.f208338a.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m77931e(String str) {
        int iM88457G0 = wl51.m88457G0(str, ':', 1, 4);
        if (iM88457G0 != -1) {
            q0f1.m71841p(this, str.substring(0, iM88457G0), str.substring(iM88457G0 + 1));
        } else if (str.charAt(0) == ':') {
            q0f1.m71841p(this, "", str.substring(1));
        } else {
            q0f1.m71841p(this, "", str);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m77932f(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        this.f208338a.add(new bcn0(f, f2, 0.0f, z, z2, f3, f4));
    }

    /* JADX INFO: renamed from: g */
    public void m77933g(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        this.f208338a.add(new kcn0(f, f2, 0.0f, z, z2, f3, f4));
    }

    /* JADX INFO: renamed from: h */
    public Set m77934h() {
        ArrayList arrayList = this.f208338a;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
    }

    /* JADX INFO: renamed from: i */
    public sn20 m77935i() {
        return new sn20((String[]) this.f208338a.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: j */
    public omd0 m77936j() {
        if (this.f208338a == null) {
            return omd0.f167017c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f208338a);
        return new omd0(bundle, this.f208338a);
    }

    /* JADX INFO: renamed from: k */
    public void m77937k() {
        this.f208338a.add(ccn0.f36584c);
    }

    /* JADX INFO: renamed from: l */
    public void m77938l(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f208338a.add(new dcn0(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: m */
    public void m77939m(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f208338a.add(new lcn0(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: n */
    public String m77940n(String str) {
        ArrayList arrayList = this.f208338a;
        int size = arrayList.size() - 2;
        int iM92097r = xtm0.m92097r(size, 0, -2);
        if (iM92097r > size) {
            return null;
        }
        while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
            if (size == iM92097r) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    /* JADX INFO: renamed from: o */
    public void m77941o(float f) {
        this.f208338a.add(new ecn0(f));
    }

    /* JADX INFO: renamed from: p */
    public void m77942p(float f) {
        this.f208338a.add(new mcn0(f));
    }

    /* JADX INFO: renamed from: q */
    public void m77943q(float f, float f2) {
        this.f208338a.add(new fcn0(f, f2));
    }

    /* JADX INFO: renamed from: r */
    public void m77944r(float f, float f2) {
        this.f208338a.add(new ncn0(f, f2));
    }

    /* JADX INFO: renamed from: s */
    public void m77945s(float f, float f2) {
        this.f208338a.add(new gcn0(f, f2));
    }

    /* JADX INFO: renamed from: t */
    public void m77946t(float f, float f2) {
        this.f208338a.add(new ocn0(f, f2));
    }

    /* JADX INFO: renamed from: u */
    public void m77947u(float f, float f2, float f3, float f4) {
        this.f208338a.add(new hcn0(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: v */
    public void m77948v(float f, float f2, float f3, float f4) {
        this.f208338a.add(new pcn0(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: w */
    public void m77949w(float f, float f2, float f3, float f4) {
        this.f208338a.add(new icn0(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: x */
    public void m77950x(float f, float f2, float f3, float f4) {
        this.f208338a.add(new qcn0(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: y */
    public void m77951y(float f, float f2) {
        this.f208338a.add(new jcn0(f, f2));
    }

    /* JADX INFO: renamed from: z */
    public void m77952z(float f, float f2) {
        this.f208338a.add(new rcn0(f, f2));
    }

    public sep(int i) {
        this.f208338a = new ArrayList(i);
    }

    public sep(omd0 omd0Var) {
        if (omd0Var != null) {
            omd0Var.m67344a();
            if (omd0Var.f167019b.isEmpty()) {
                return;
            }
            this.f208338a = new ArrayList(omd0Var.f167019b);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
}
