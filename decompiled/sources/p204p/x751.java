package p204p;

import android.content.Context;
import com.spotify.storage.localstorageapi.CacheMovingWorker;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public final class x751 extends d1y {

    /* JADX INFO: renamed from: c */
    public final Context f258827c;

    /* JADX INFO: renamed from: d */
    public final af41 f258828d;

    /* JADX INFO: renamed from: e */
    public final b4i0 f258829e;

    /* JADX INFO: renamed from: f */
    public final prv0 f258830f;

    public x751(Context context, af41 af41Var, b4i0 b4i0Var, prv0 prv0Var) {
        this.f258827c = context;
        this.f258828d = af41Var;
        this.f258829e = b4i0Var;
        this.f258830f = prv0Var;
    }

    @Override // p204p.d1y
    /* JADX INFO: renamed from: a */
    public final Object mo34674a(ibk ibkVar) {
        String strMo48710e = ((bf41) this.f258828d).f26565k.mo48710e(bf41.f26547s, null);
        return strMo48710e != null ? new ed01(strMo48710e) : new dd01(0, null);
    }

    @Override // p204p.d1y
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo34675c(Object obj, Object obj2, d850 d850Var, c1y c1yVar) {
        return m90142d((String) obj, (String) obj2, c1yVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[PHI: r1 r5
      0x0050: PHI (r1v19 long) = (r1v18 long), (r1v26 long) binds: [B:33:0x0135, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r5v10 java.lang.String) = (r5v9 java.lang.String), (r5v13 java.lang.String) binds: [B:33:0x0135, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0143, code lost:
    
        if (r3 == r15) goto L37;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m90142d(String str, String str2, ibk ibkVar) {
        v751 v751Var;
        Long lM70736d;
        long jLongValue;
        int i;
        fbk fbkVar;
        String str3;
        long j;
        yab yabVarM65827f;
        ro01 ro01Var;
        String str4;
        int i2;
        String str5 = str2;
        if (ibkVar instanceof v751) {
            v751Var = (v751) ibkVar;
            int i3 = v751Var.f238066e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v751Var.f238066e = i3 - Integer.MIN_VALUE;
            } else {
                v751Var = new v751(this, ibkVar);
            }
        } else {
            v751Var = new v751(this, ibkVar);
        }
        Object objMo34674a = v751Var.f238064c;
        int i4 = v751Var.f238066e;
        int i5 = 10;
        Context context = this.f258827c;
        int i6 = 1;
        Object obj = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(objMo34674a);
            if (str == null || (lM70736d = this.f258830f.m70736d(str)) == null) {
                return new dd01(0, null);
            }
            jLongValue = lM70736d.longValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("volume", str5);
            linkedHashMap.put("estimated-size", lM70736d);
            sco scoVar = new sco(linkedHashMap);
            n0e1.m63412T(scoVar);
            jbb jbbVar = (jbb) l0e1.m57799S(context).m55007t("cache_moving_worker", 2, (lnl0) ((knl0) new knl0(CacheMovingWorker.class).m31262i(scoVar)).m31255b()).f30112b;
            v751Var.f238062a = str5;
            v751Var.f238063b = jLongValue;
            v751Var.f238066e = 1;
            if (n0e1.m63423c(jbbVar, v751Var) != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            long j2 = v751Var.f238063b;
            String str6 = v751Var.f238062a;
            bga.m29073P(objMo34674a);
            jLongValue = j2;
            str5 = str6;
        } else {
            if (i4 == 2) {
                j = v751Var.f238063b;
                str3 = v751Var.f238062a;
                bga.m29073P(objMo34674a);
                i = 2;
                fbkVar = null;
                yabVarM65827f = nxf1.m65827f(new mt31(this.f258829e, fbkVar, 15));
                ro01Var = new ro01(i, i5, fbkVar);
                v751Var.f238062a = str3;
                v751Var.f238063b = j;
                v751Var.f238066e = 3;
                if (vyf1.m86758w(yabVarM65827f, ro01Var, v751Var) != obj) {
                    long j3 = j;
                    str4 = str3;
                    v751Var.f238062a = str4;
                    v751Var.f238063b = j3;
                    v751Var.f238066e = 4;
                    objMo34674a = mo34674a(v751Var);
                }
                return obj;
            }
            if (i4 == 3) {
                j = v751Var.f238063b;
                str3 = v751Var.f238062a;
                bga.m29073P(objMo34674a);
                long j4 = j;
                str4 = str3;
                v751Var.f238062a = str4;
                v751Var.f238063b = j4;
                v751Var.f238066e = 4;
                objMo34674a = mo34674a(v751Var);
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = v751Var.f238062a;
                bga.m29073P(objMo34674a);
            }
        }
        fd01 fd01Var = (fd01) objMo34674a;
        ed01 ed01Var = fd01Var instanceof ed01 ? (ed01) fd01Var : null;
        if (ed01Var != null) {
            i2 = 0;
            if (!bm51.m29803n0((String) ed01Var.f58419a, str4, false)) {
                ed01Var = null;
            }
            if (ed01Var != null) {
                return ed01Var;
            }
        } else {
            i2 = 0;
        }
        return new dd01(i2, null);
        l0e1 l0e1VarM57799S = l0e1.m57799S(context);
        o1e1 o1e1VarMo1155F = l0e1VarM57799S.f128405B0.mo1155F();
        luk lukVar = l0e1VarM57799S.f128406C0.f160372b;
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        ojx0VarM50495m.mo38269L0(1, "cache_moving_worker");
        fiz fizVarM34374j = cyf1.m34374j(mvl0.m62953p(new ah40(epv0.m39692l(o1e1VarMo1155F.f160711a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new C2245p6(new n1e1(o1e1VarMo1155F, ojx0VarM50495m, i6), i5)), i6)), lukVar);
        i = 2;
        fbkVar = null;
        ro01 ro01Var2 = new ro01(i, 9, fbkVar);
        v751Var.f238062a = str5;
        v751Var.f238063b = jLongValue;
        v751Var.f238066e = 2;
        if (vyf1.m86758w(fizVarM34374j, ro01Var2, v751Var) != obj) {
            str3 = str5;
            j = jLongValue;
            yabVarM65827f = nxf1.m65827f(new mt31(this.f258829e, fbkVar, 15));
            ro01Var = new ro01(i, i5, fbkVar);
            v751Var.f238062a = str3;
            v751Var.f238063b = j;
            v751Var.f238066e = 3;
            if (vyf1.m86758w(yabVarM65827f, ro01Var, v751Var) != obj) {
                long j5 = j;
                str4 = str3;
                v751Var.f238062a = str4;
                v751Var.f238063b = j5;
                v751Var.f238066e = 4;
                objMo34674a = mo34674a(v751Var);
            }
        }
        return obj;
    }
}
