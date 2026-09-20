package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class r6d0 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final r6d0 f196240a = new r6d0();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f196241b;

    static {
        ktz0[] ktz0VarArr = new ktz0[0];
        if (wl51.m88460J0("MeasuredLoudness")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        cge cgeVar = new cge("MeasuredLoudness");
        eer0 eer0Var = yhz.f272998b;
        cgeVar.m32690a("loudness", eer0Var, false);
        cgeVar.m32690a("true_peak", eer0Var, false);
        cgeVar.m32690a("max_momentary_loudness", eer0Var, false);
        f196241b = new mtz0("MeasuredLoudness", in51.f103873z0, cgeVar.f37644c.size(), bk5.m29620k1(ktz0VarArr), cgeVar);
    }

    /* JADX INFO: renamed from: a */
    public static float m74852a(nl60 nl60Var, String str) {
        yk60 yk60Var = (yk60) nl60Var.get(str);
        if (yk60Var == null) {
            return 0.0f;
        }
        sl60 sl60VarM96309k = zk60.m96309k(yk60Var);
        String strMo47869a = sl60VarM96309k.mo47869a();
        if (wj50.m88271j(strMo47869a, "Infinity")) {
            return Float.MAX_VALUE;
        }
        if (wj50.m88271j(strMo47869a, "-Infinity")) {
            return Float.MIN_VALUE;
        }
        Float fM29806q0 = bm51.m29806q0(sl60VarM96309k.mo47869a());
        if (fM29806q0 == null) {
            return 0.0f;
        }
        if (Float.isNaN(fM29806q0.floatValue())) {
            fM29806q0 = null;
        }
        if (fM29806q0 != null) {
            return fM29806q0.floatValue();
        }
        return 0.0f;
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        if (!(froVar instanceof vk60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        yk60 yk60VarMo43785m = ((vk60) froVar).mo43785m();
        nl60 nl60Var = yk60VarMo43785m instanceof nl60 ? (nl60) yk60VarMo43785m : null;
        return nl60Var == null ? new q6d0(0.0f, 0.0f, 0.0f) : new q6d0(m74852a(nl60Var, "loudness"), m74852a(nl60Var, "true_peak"), m74852a(nl60Var, "max_momentary_loudness"));
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f196241b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        q6d0 q6d0Var = (q6d0) obj;
        if (!(deuVar instanceof dl60)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((dl60) deuVar).mo36345R(new nl60(linkedHashMap));
    }
}
