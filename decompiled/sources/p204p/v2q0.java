package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class v2q0 {

    /* JADX INFO: renamed from: a */
    public final k8n0 f236712a;

    /* JADX INFO: renamed from: b */
    public final dv71 f236713b;

    public v2q0(k8n0 k8n0Var, dv71 dv71Var) {
        this.f236712a = k8n0Var;
        this.f236713b = dv71Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r12 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r12 == r4) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m84524a(LinkedHashMap linkedHashMap, String str, tu71 tu71Var, boolean z, ibk ibkVar) {
        u2q0 u2q0Var;
        dv71 dv71Var;
        String str2;
        Long lM29808s0;
        long jLongValue;
        long j;
        Map map;
        Map map2;
        if (ibkVar instanceof u2q0) {
            u2q0Var = (u2q0) ibkVar;
            int i = u2q0Var.f226145g;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2q0Var.f226145g = i - Integer.MIN_VALUE;
            } else {
                u2q0Var = new u2q0(this, ibkVar);
            }
        } else {
            u2q0Var = new u2q0(this, ibkVar);
        }
        Object objM55752a = u2q0Var.f226143e;
        int i2 = u2q0Var.f226145g;
        if (i2 == 0) {
            bga.m29073P(objM55752a);
            k8n0 k8n0Var = this.f236712a;
            dv71Var = this.f236713b;
            yuk yukVar = yuk.f276404a;
            if (tu71Var != null) {
                j = tu71Var.f223785a;
                u2q0Var.f226139a = dv71Var;
                u2q0Var.f226140b = linkedHashMap;
                u2q0Var.f226141c = j;
                u2q0Var.f226145g = 1;
                objM55752a = k8n0Var.m55752a(j, str, u2q0Var);
            } else if (z) {
                dv71Var.getClass();
                if (((String) linkedHashMap.get("t")) != null && (str2 = (String) linkedHashMap.get("t")) != null && (lM29808s0 = bm51.m29808s0(10, str2)) != null) {
                    jLongValue = lM29808s0.longValue();
                    u2q0Var.f226139a = linkedHashMap;
                    u2q0Var.f226140b = dv71Var;
                    u2q0Var.f226141c = jLongValue;
                    u2q0Var.f226142d = jLongValue;
                    u2q0Var.f226145g = 2;
                    objM55752a = k8n0Var.m55752a(jLongValue, str, u2q0Var);
                }
            } else {
                dv71Var.getClass();
                linkedHashMap.remove("t");
            }
            map2 = linkedHashMap;
            map = linkedHashMap;
            return yukVar;
        }
        if (i2 == 1) {
            long j2 = u2q0Var.f226141c;
            Map map3 = (Map) u2q0Var.f226140b;
            dv71 dv71Var2 = (dv71) u2q0Var.f226139a;
            bga.m29073P(objM55752a);
            dv71Var = dv71Var2;
            map = map3;
            j = j2;
            map = linkedHashMap;
            dv71Var.getClass();
            dv71.m37047a(map, j, (Long) objM55752a);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = u2q0Var.f226142d;
            dv71 dv71Var3 = (dv71) u2q0Var.f226140b;
            Map map4 = (Map) u2q0Var.f226139a;
            bga.m29073P(objM55752a);
            dv71Var = dv71Var3;
            map2 = map4;
            jLongValue = j3;
            map2 = linkedHashMap;
            dv71Var.getClass();
            dv71.m37047a(map2, jLongValue, (Long) objM55752a);
        }
        return w2a1.f247311a;
    }
}
