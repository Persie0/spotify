package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kyi0 {

    /* JADX INFO: renamed from: a */
    public final aaj0 f127869a;

    /* JADX INFO: renamed from: b */
    public final int f127870b;

    /* JADX INFO: renamed from: c */
    public final String f127871c;

    /* JADX INFO: renamed from: d */
    public final Map f127872d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f127873e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f127874f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f127875g;

    public kyi0(aaj0 aaj0Var, up60 up60Var, Map map) throws Throwable {
        String str;
        int iM43458q = up60Var != null ? g391.m43458q(qjg1.m72925q(up60Var)) : -1;
        if (up60Var != null) {
            rr60 rr60VarM72925q = qjg1.m72925q(up60Var);
            onx0 onx0Var = new onx0(rr60VarM72925q, 1);
            if (rr60VarM72925q instanceof x8q0) {
                onx0Var.invoke();
                throw null;
            }
            pzs0 pzs0Var = new pzs0(rr60VarM72925q);
            r6w0 r6w0Var = new r6w0(pzs0Var, 16);
            int iMo33222e = rr60VarM72925q.getDescriptor().mo33222e();
            for (int i = 0; i < iMo33222e; i++) {
                String strMo33223f = rr60VarM72925q.getDescriptor().mo33223f(i);
                ozi0 ozi0VarM43454m = g391.m43454m(rr60VarM72925q.getDescriptor().mo33225h(i), map);
                if (ozi0VarM43454m == null) {
                    throw new IllegalArgumentException(g391.m43467z(strMo33223f, rr60VarM72925q.getDescriptor().mo33225h(i).mo33226i(), rr60VarM72925q.getDescriptor().mo33226i(), map.toString()));
                }
                r6w0Var.mo24510D0(Integer.valueOf(i), strMo33223f, ozi0VarM43454m);
            }
            str = ((String) pzs0Var.f183795c) + ((String) pzs0Var.f183796d) + ((String) pzs0Var.f183797e);
        } else {
            str = null;
        }
        this(aaj0Var, iM43458q, str);
        if (up60Var != null) {
            rr60 rr60VarM72925q2 = qjg1.m72925q(up60Var);
            onx0 onx0Var2 = new onx0(rr60VarM72925q2, 0);
            if (rr60VarM72925q2 instanceof x8q0) {
                onx0Var2.invoke();
                throw null;
            }
            int iMo33222e2 = rr60VarM72925q2.getDescriptor().mo33222e();
            ArrayList<evi0> arrayList = new ArrayList(iMo33222e2);
            for (int i2 = 0; i2 < iMo33222e2; i2++) {
                String strMo33223f2 = rr60VarM72925q2.getDescriptor().mo33223f(i2);
                pxi0 pxi0Var = new pxi0();
                ktz0 ktz0VarMo33225h = rr60VarM72925q2.getDescriptor().mo33225h(i2);
                boolean zMo57365b = ktz0VarMo33225h.mo57365b();
                ozi0 ozi0VarM43454m2 = g391.m43454m(ktz0VarMo33225h, map);
                if (ozi0VarM43454m2 == null) {
                    throw new IllegalArgumentException(g391.m43467z(strMo33223f2, ktz0VarMo33225h.mo33226i(), rr60VarM72925q2.getDescriptor().mo33226i(), map.toString()));
                }
                pxi0Var.f182313d = ozi0VarM43454m2;
                pxi0Var.f182310a = zMo57365b;
                if (rr60VarM72925q2.getDescriptor().mo33227j(i2)) {
                    pxi0Var.f182312c = true;
                }
                arrayList.add(new evi0(strMo33223f2, pxi0Var.m71383a()));
            }
            for (evi0 evi0Var : arrayList) {
                this.f127873e.put(evi0Var.f63276a, evi0Var.f63277b);
            }
        }
        this.f127872d = map;
    }

    /* JADX INFO: renamed from: a */
    public jyi0 mo42007a() {
        jyi0 jyi0VarMo42008b = mo42008b();
        jyi0VarMo42008b.f117417d = null;
        for (Map.Entry entry : this.f127873e.entrySet()) {
            jyi0VarMo42008b.f117420g.put((String) entry.getKey(), (qxi0) entry.getValue());
        }
        Iterator it = this.f127874f.iterator();
        while (it.hasNext()) {
            jyi0VarMo42008b.m54790a((gyi0) it.next());
        }
        for (Map.Entry entry2 : this.f127875g.entrySet()) {
            jyi0VarMo42008b.m54797l(((Number) entry2.getKey()).intValue(), (oxi0) entry2.getValue());
        }
        String str = this.f127871c;
        if (str != null) {
            jyi0VarMo42008b.m54798n(str);
        }
        int i = this.f127870b;
        if (i != -1) {
            jyi0VarMo42008b.f117421h = i;
            jyi0VarMo42008b.f117416c = null;
        }
        return jyi0VarMo42008b;
    }

    /* JADX INFO: renamed from: b */
    public jyi0 mo42008b() {
        return this.f127869a.mo25252a();
    }

    public kyi0(aaj0 aaj0Var, int i, String str) {
        this.f127869a = aaj0Var;
        this.f127870b = i;
        this.f127871c = str;
        this.f127873e = new LinkedHashMap();
        this.f127874f = new ArrayList();
        this.f127875g = new LinkedHashMap();
    }
}
