package p204p;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes11.dex */
public class bm60 extends AbstractC1887g7 {

    /* JADX INFO: renamed from: f */
    public final nl60 f28384f;

    /* JADX INFO: renamed from: g */
    public final ktz0 f28385g;

    /* JADX INFO: renamed from: h */
    public int f28386h;

    /* JADX INFO: renamed from: i */
    public boolean f28387i;

    public /* synthetic */ bm60(fk60 fk60Var, nl60 nl60Var, String str, int i) {
        this(fk60Var, nl60Var, (i & 4) != 0 ? null : str, (ktz0) null);
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public nl60 mo29809G() {
        return this.f28384f;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m29811R(ktz0 ktz0Var, int i) {
        boolean z = (this.f77148c.f70477a.f189469f || ktz0Var.mo33227j(i) || !ktz0Var.mo33225h(i).mo57365b()) ? false : true;
        this.f28387i = z;
        return z;
    }

    @Override // p204p.AbstractC1887g7, p204p.fro
    /* JADX INFO: renamed from: X */
    public final boolean mo29812X() {
        return !this.f28387i && super.mo29812X();
    }

    @Override // p204p.AbstractC1887g7, p204p.frh
    /* JADX INFO: renamed from: a */
    public void mo29813a(ktz0 ktz0Var) {
        Set setM77309l0;
        fk60 fk60Var = this.f77148c;
        if (q191.m71916z(fk60Var, ktz0Var) || (ktz0Var.getKind() instanceof v8q0)) {
            return;
        }
        q191.m71883A(fk60Var, ktz0Var);
        if (this.f77150e.f189474k) {
            Set setM92165d = xuf1.m92165d(ktz0Var);
            Map map = (Map) fk60Var.f70479c.f183155a.get(ktz0Var);
            Object obj = map != null ? map.get(q191.f184271a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = gbu.f78413a;
            }
            setM77309l0 = s601.m77309l0(setM92165d, setKeySet);
        } else {
            setM77309l0 = xuf1.m92165d(ktz0Var);
        }
        for (String str : mo29809G().f155012a.keySet()) {
            if (!setM77309l0.contains(str) && !wj50.m88271j(str, this.f77149d)) {
                throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36608h('\'', "Encountered an unknown key '", str), m43775J(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, mo29809G().toString()).toString() : null));
            }
        }
    }

    @Override // p204p.AbstractC1887g7, p204p.fro
    /* JADX INFO: renamed from: b */
    public final frh mo29814b(ktz0 ktz0Var) {
        ktz0 ktz0Var2 = this.f28385g;
        if (ktz0Var != ktz0Var2) {
            return super.mo29814b(ktz0Var);
        }
        yk60 yk60VarM43779g = m43779g();
        String strMo33226i = ktz0Var2.mo33226i();
        boolean z = yk60VarM43779g instanceof nl60;
        fk60 fk60Var = this.f77148c;
        if (z) {
            return new bm60(fk60Var, (nl60) yk60VarM43779g, this.f77149d, ktz0Var2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jqv0 jqv0Var = qpv0.f191387a;
        sb.append(jqv0Var.mo54112b(nl60.class).mo29111F());
        sb.append(", but had ");
        sb.append(jqv0Var.mo54112b(yk60VarM43779g.getClass()).mo29111F());
        throw new JsonDecodingException(fpg1.m42364t(-1, dq60.m36616p(" as the serialized body of ", strMo33226i, sb), m43775J(), null, fk60Var.f70477a.f189476m ? fpg1.m42367w(-1, yk60VarM43779g.toString()).toString() : null));
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: e */
    public yk60 mo29815e(String str) {
        return (yk60) kkc0.m56692e0(str, mo29809G());
    }

    @Override // p204p.frh
    /* JADX INFO: renamed from: p */
    public int mo29816p(ktz0 ktz0Var) {
        while (this.f28386h < ktz0Var.mo33222e()) {
            int i = this.f28386h;
            this.f28386h = i + 1;
            String strM43773E = m43773E(ktz0Var, i);
            int i2 = this.f28386h - 1;
            this.f28387i = false;
            if (mo29809G().containsKey(strM43773E) || m29811R(ktz0Var, i2)) {
                if (this.f77150e.f189471h) {
                    boolean zMo33227j = ktz0Var.mo33227j(i2);
                    ktz0 ktz0VarMo33225h = ktz0Var.mo33225h(i2);
                    if (!zMo33227j || ktz0VarMo33225h.mo57365b() || !(((yk60) mo29809G().get(strM43773E)) instanceof kl60)) {
                        if (wj50.m88271j(ktz0VarMo33225h.getKind(), otz0.f170119z0) && (!ktz0VarMo33225h.mo57365b() || !(((yk60) mo29809G().get(strM43773E)) instanceof kl60))) {
                            yk60 yk60Var = (yk60) mo29809G().get(strM43773E);
                            sl60 sl60Var = yk60Var instanceof sl60 ? (sl60) yk60Var : null;
                            String strM96304f = sl60Var != null ? zk60.m96304f(sl60Var) : null;
                            if (strM96304f != null) {
                                fk60 fk60Var = this.f77148c;
                                int iM71914x = q191.m71914x(ktz0VarMo33225h, fk60Var, strM96304f);
                                boolean z = !fk60Var.f70477a.f189469f && ktz0VarMo33225h.mo57365b();
                                if (iM71914x != -3 || ((!zMo33227j && !z) || m29811R(ktz0Var, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.AbstractC1887g7
    /* JADX INFO: renamed from: z */
    public String mo29817z(ktz0 ktz0Var, int i) {
        fk60 fk60Var = this.f77148c;
        q191.m71883A(fk60Var, ktz0Var);
        String strMo33223f = ktz0Var.mo33223f(i);
        if (this.f77150e.f189474k && !mo29809G().f155012a.keySet().contains(strMo33223f)) {
            pxq pxqVar = fk60Var.f70479c;
            C2570xf c2570xf = new C2570xf(18, ktz0Var, fk60Var);
            ConcurrentHashMap concurrentHashMap = pxqVar.f183155a;
            Map map = (Map) concurrentHashMap.get(ktz0Var);
            Object obj = null;
            iw3 iw3Var = q191.f184271a;
            Object objInvoke = map != null ? map.get(iw3Var) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = c2570xf.invoke();
                Object objM55313q = concurrentHashMap.get(ktz0Var);
                if (objM55313q == null) {
                    objM55313q = k3u0.m55313q(2);
                    concurrentHashMap.put(ktz0Var, objM55313q);
                }
                ((Map) objM55313q).put(iw3Var, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : mo29809G().f155012a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strMo33223f;
    }

    public bm60(fk60 fk60Var, nl60 nl60Var, String str, ktz0 ktz0Var) {
        super(str, fk60Var);
        this.f28384f = nl60Var;
        this.f28385g = ktz0Var;
    }
}
