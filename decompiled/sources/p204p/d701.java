package p204p;

import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d701 {

    /* JADX INFO: renamed from: c */
    public static final sgq0 f45945c = p271.m68909l("firebase_sessions_enabled");

    /* JADX INFO: renamed from: d */
    public static final sgq0 f45946d = p271.m68911n("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: e */
    public static final sgq0 f45947e = p271.m68917t("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f */
    public static final sgq0 f45948f = p271.m68917t("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g */
    public static final sgq0 f45949g = p271.m68920w("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a */
    public final wko f45950a;

    /* JADX INFO: renamed from: b */
    public wxz0 f45951b;

    public d701(wko wkoVar) {
        this.f45950a = wkoVar;
        x0h1.m89580w(new xay0(this, (fbk) null, 20));
    }

    /* JADX INFO: renamed from: a */
    public static final void m35160a(d701 d701Var, qpi0 qpi0Var) {
        d701Var.getClass();
        Boolean bool = (Boolean) qpi0Var.f191326a.get(f45945c);
        LinkedHashMap linkedHashMap = qpi0Var.f191326a;
        d701Var.f45951b = new wxz0(bool, (Double) linkedHashMap.get(f45946d), (Integer) linkedHashMap.get(f45947e), (Integer) linkedHashMap.get(f45948f), (Long) linkedHashMap.get(f45949g));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m35161b() {
        wxz0 wxz0Var = this.f45951b;
        if (wxz0Var == null) {
            wj50.m88260d0("sessionConfigs");
            throw null;
        }
        Long l = wxz0Var.f256165e;
        if (wxz0Var != null) {
            Integer num = wxz0Var.f256164d;
            return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        wj50.m88260d0("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m35162c(sgq0 sgq0Var, Object obj, ibk ibkVar) {
        c701 c701Var;
        if (ibkVar instanceof c701) {
            c701Var = (c701) ibkVar;
            int i = c701Var.f34694c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c701Var.f34694c = i - Integer.MIN_VALUE;
            } else {
                c701Var = new c701(this, ibkVar);
            }
        } else {
            c701Var = new c701(this, ibkVar);
        }
        Object obj2 = c701Var.f34692a;
        int i2 = c701Var.f34694c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                wko wkoVar = this.f45950a;
                kbi0 kbi0Var = new kbi0(obj, sgq0Var, this, (fbk) null, 21);
                c701Var.f34694c = 1;
                Object objM36824p = dt71.m36824p(wkoVar, kbi0Var, c701Var);
                yuk yukVar = yuk.f276404a;
                if (objM36824p == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
        } catch (IOException e) {
            e.toString();
        }
        return w2a1.f247311a;
    }
}
