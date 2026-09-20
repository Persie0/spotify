package p204p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes6.dex */
public final class f2d0 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final f2d0 f65152a = new f2d0();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f65153b = gjg1.m44906D("com.spotify.deeplink.deferreddeeplink.MatchResponse", new ktz0[0], r0d0.f194454Z);

    /* JADX INFO: renamed from: a */
    public static sl60 m40582a(String str, yk60 yk60Var) {
        sl60 sl60Var = yk60Var instanceof sl60 ? (sl60) yk60Var : null;
        if (sl60Var != null) {
            return sl60Var;
        }
        throw new SerializationException("Expected a primitive for ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m40583b(nl60 nl60Var, String str, String str2) {
        yk60 yk60Var = nl60Var.containsKey(str) ? (yk60) kkc0.m56692e0(str, nl60Var) : (yk60) nl60Var.get(str2);
        if (yk60Var != null) {
            if (yk60Var instanceof kl60) {
                yk60Var = null;
            }
            if (yk60Var != null) {
                sl60 sl60VarM40582a = m40582a(str, yk60Var);
                if (sl60VarM40582a.mo47870b() || bm51.m29805p0(sl60VarM40582a.mo47869a()) != null) {
                    return sl60VarM40582a.mo47869a();
                }
                throw new SerializationException("Expected a string for ".concat(str));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        boolean zBooleanValue;
        double dDoubleValue;
        Boolean bool = null;
        vk60 vk60Var = froVar instanceof vk60 ? (vk60) froVar : null;
        if (vk60Var == null) {
            throw new SerializationException("JSON required");
        }
        yk60 yk60VarMo43785m = vk60Var.mo43785m();
        nl60 nl60Var = yk60VarMo43785m instanceof nl60 ? (nl60) yk60VarMo43785m : null;
        if (nl60Var == null) {
            throw new SerializationException("Expected a JSON object");
        }
        yk60 yk60Var = (yk60) nl60Var.get("matched");
        if (yk60Var == null) {
            zBooleanValue = false;
        } else {
            if (yk60Var instanceof kl60) {
                yk60Var = null;
            }
            if (yk60Var != null) {
                sl60 sl60VarM40582a = m40582a("matched", yk60Var);
                if (sl60VarM40582a.mo47870b()) {
                    throw new SerializationException("Expected a boolean for matched");
                }
                it40 it40Var = zk60.f283668a;
                String strMo47869a = sl60VarM40582a.mo47869a();
                String[] strArr = nl51.f155008a;
                if (strMo47869a.equalsIgnoreCase("true")) {
                    bool = Boolean.TRUE;
                } else if (strMo47869a.equalsIgnoreCase("false")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    throw new SerializationException("Expected a boolean for matched");
                }
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        }
        boolean z = zBooleanValue;
        String strM40583b = m40583b(nl60Var, "deep_link", "deepLink");
        String strM40583b2 = m40583b(nl60Var, "match_method", "matchMethod");
        yk60 yk60Var2 = nl60Var.containsKey("match_confidence") ? (yk60) kkc0.m56692e0("match_confidence", nl60Var) : (yk60) nl60Var.get("matchConfidence");
        if (yk60Var2 == null || (yk60Var2 instanceof kl60)) {
            dDoubleValue = 0.0d;
        } else {
            sl60 sl60VarM40582a2 = m40582a("match_confidence", yk60Var2);
            it40 it40Var2 = zk60.f283668a;
            Double dM29805p0 = bm51.m29805p0(sl60VarM40582a2.mo47869a());
            if (dM29805p0 == null) {
                throw new SerializationException("Expected a double for match_confidence");
            }
            dDoubleValue = dM29805p0.doubleValue();
            if (Math.abs(dDoubleValue) > Double.MAX_VALUE) {
                throw new SerializationException("Expected a finite double for match_confidence");
            }
        }
        return new e2d0(z, strM40583b, strM40583b2, dDoubleValue, m40583b(nl60Var, "click_id", "clickId"), m40583b(nl60Var, "match_id", "matchId"));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f65153b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        e2d0 e2d0Var = (e2d0) obj;
        dl60 dl60Var = deuVar instanceof dl60 ? (dl60) deuVar : null;
        if (dl60Var == null) {
            throw new SerializationException("JSON required");
        }
        ol60 ol60Var = new ol60();
        ol60Var.m67278b("matched", zk60.m96299a(Boolean.valueOf(e2d0Var.f55429a)));
        String str = e2d0Var.f55430b;
        if (str != null) {
            ang1.m26508q(ol60Var, "deep_link", str);
        }
        String str2 = e2d0Var.f55431c;
        if (str2 != null) {
            ang1.m26508q(ol60Var, "match_method", str2);
        }
        ang1.m26507p(ol60Var, "match_confidence", Double.valueOf(e2d0Var.f55432d));
        String str3 = e2d0Var.f55433e;
        if (str3 != null) {
            ang1.m26508q(ol60Var, "click_id", str3);
        }
        String str4 = e2d0Var.f55434f;
        if (str4 != null) {
            ang1.m26508q(ol60Var, "match_id", str4);
        }
        dl60Var.mo36345R(ol60Var.m67277a());
    }
}
