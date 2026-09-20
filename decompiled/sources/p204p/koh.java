package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class koh implements xb70 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f124798a;

    public koh(int i) {
        switch (i) {
            case 1:
                this.f124798a = new ArrayList();
                break;
            default:
                this.f124798a = new ArrayList();
                break;
        }
    }

    @Override // p204p.xb70
    /* JADX INFO: renamed from: b */
    public void mo56990b(Object obj) {
        if (obj instanceof String) {
            this.f124798a.add((String) obj);
        }
    }

    @Override // p204p.xb70
    /* JADX INFO: renamed from: c */
    public void mo56991c() {
        mo51411l((String[]) this.f124798a.toArray(new String[0]));
    }

    @Override // p204p.xb70
    /* JADX INFO: renamed from: e */
    public wb70 mo56993e(vfe vfeVar) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m56994f(int i, zq00 zq00Var, Object obj) {
        ArrayList arrayListM96708d = zq00Var.m96708d();
        boolean z = false;
        if (arrayListM96708d != null) {
            int size = arrayListM96708d.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = arrayListM96708d.get(i2);
                if (obj2 instanceof rq00) {
                    if (obj2.equals(obj)) {
                        m56995g(zq00Var.m96709e(), zq00Var, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof zq00)) {
                        throw new IllegalStateException(s571.m77249h(obj2, "Unexpected child source info "));
                    }
                    if (m56994f(i, (zq00) obj2, obj)) {
                        m56995g(zq00Var.m96709e(), zq00Var, obj2);
                        return true;
                    }
                }
            }
        } else {
            if (!zq00Var.m96705a()) {
                m56995g(i, zq00Var, null);
                return true;
            }
            int iM96707c = zq00Var.m96707c();
            int iM96706b = zq00Var.m96706b();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iM96707c <= iIntValue && iIntValue < iM96706b) || (iM96707c == iM96706b && iM96707c == number.intValue())) {
                    z = true;
                }
                if (z) {
                    m56995g(zq00Var.m96709e(), zq00Var, null);
                }
                return z;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m56995g(int i, zq00 zq00Var, Object obj) {
        this.f124798a.add(new loh(i, null, null));
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo48698h(rq00 rq00Var);

    /* JADX INFO: renamed from: i */
    public void m56996i(int i, Object obj, zq00 zq00Var, Object obj2) {
        if (wj50.m88271j(obj, t6x0.f217647t)) {
            m56995g(i, zq00Var, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public zq00 m56997j(Object obj) {
        if (obj instanceof rq00) {
            return mo48699k((rq00) obj);
        }
        if (obj instanceof zq00) {
            return (zq00) obj;
        }
        throw new IllegalStateException(s571.m77249h(obj, "Unexpected child source info "));
    }

    /* JADX INFO: renamed from: k */
    public abstract zq00 mo48699k(rq00 rq00Var);

    /* JADX INFO: renamed from: l */
    public abstract void mo51411l(String[] strArr);

    @Override // p204p.xb70
    /* JADX INFO: renamed from: a */
    public void mo56989a(yfe yfeVar) {
    }

    @Override // p204p.xb70
    /* JADX INFO: renamed from: d */
    public void mo56992d(vfe vfeVar, qti0 qti0Var) {
    }
}
