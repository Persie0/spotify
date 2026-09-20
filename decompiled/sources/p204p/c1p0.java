package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c1p0 implements a1p0 {

    /* JADX INFO: renamed from: f */
    public static final Set f33168f;

    /* JADX INFO: renamed from: g */
    public static final List f33169g;

    /* JADX INFO: renamed from: a */
    public final ayh0 f33170a;

    /* JADX INFO: renamed from: b */
    public final ulp f33171b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f33172c;

    /* JADX INFO: renamed from: d */
    public final Object f33173d;

    /* JADX INFO: renamed from: e */
    public b1p0 f33174e;

    static {
        new si5(20);
        f33168f = Collections.singleton("ubi.interaction_id");
        f33169g = h6f.m46715L("playback.id", "playback.clip_uri", "playback.content_type");
    }

    public c1p0(ayh0 ayh0Var, ulp ulpVar) {
        tnk0 tnk0Var = tnk0.f221995a;
        this.f33170a = ayh0Var;
        this.f33171b = ulpVar;
        this.f33173d = new Object();
    }

    /* JADX INFO: renamed from: c */
    public static void m31268c(c1p0 c1p0Var, String str, gwo0 gwo0Var, String str2, Long l, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        synchronized (c1p0Var.f33173d) {
            try {
                b1p0 b1p0Var = c1p0Var.f33174e;
                if (b1p0Var == null) {
                    return;
                }
                if (si5.m78174x(b1p0Var.m27918c(), gwo0Var) != 1) {
                    return;
                }
                si5.m78169i(b1p0Var.m27918c(), gwo0Var);
                b1p0Var.m27918c().setAttribute(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
                if (str2 != null) {
                    b1p0Var.m27918c().setAttribute("error", str2);
                }
                if (l != null) {
                    b1p0Var.m27916a().mo27275a(l);
                    b1p0Var.m27917b().mo27275a(l);
                    b1p0Var.m27919d().mo51100a(l.longValue());
                    b1p0Var.m27918c().mo33385a(l.longValue());
                } else {
                    b1p0Var.m27916a().mo27275a(null);
                    b1p0Var.m27917b().mo27275a(null);
                    b1p0Var.m27919d().stop();
                    b1p0Var.m27918c().stop();
                }
                c1p0Var.f33174e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31269b() {
        synchronized (this.f33173d) {
            b1p0 b1p0Var = this.f33174e;
            if (b1p0Var == null) {
                return;
            }
            b1p0Var.m27916a().mo27275a(null);
            b1p0Var.m27917b().mo27275a(null);
            b1p0Var.m27919d().stop();
            b1p0Var.m27918c().cancel();
            this.f33174e = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m31270d(String str, gwo0 gwo0Var) {
        Integer numM29807r0;
        if (this.f33172c) {
            if (!this.f33171b.m83401c()) {
                m31269b();
                return;
            }
            if (!str.equals("timeline_conductor_media_skipped")) {
                m31268c(this, "failed", gwo0Var, str, null, 8);
                return;
            }
            synchronized (this.f33173d) {
                try {
                    b1p0 b1p0Var = this.f33174e;
                    if (b1p0Var == null) {
                        return;
                    }
                    Iterator it = f33169g.iterator();
                    while (it.hasNext()) {
                        b1p0Var.m27918c().setAttribute((String) it.next(), "");
                    }
                    String str2 = (String) b1p0Var.m27918c().getAttributes().get("playback.skipped_clip_count");
                    b1p0Var.m27918c().setAttribute("playback.skipped_clip_count", String.valueOf(((str2 == null || (numM29807r0 = bm51.m29807r0(str2)) == null) ? 0 : numM29807r0.intValue()) + 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m31271e(long j, gwo0 gwo0Var) {
        if (this.f33172c) {
            if (this.f33171b.m83401c()) {
                m31268c(this, "rendered", gwo0Var, null, Long.valueOf(j), 4);
            } else {
                m31269b();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m31272f(String str, gwo0 gwo0Var, hff0 hff0Var, Long l) {
        if (this.f33172c) {
            if (!this.f33171b.m83401c()) {
                m31269b();
                return;
            }
            long jLongValue = l != null ? l.longValue() : this.f33170a.m27521a();
            synchronized (this.f33173d) {
                try {
                    b1p0 b1p0Var = this.f33174e;
                    if (b1p0Var != null) {
                        int iM78174x = si5.m78174x(b1p0Var.m27918c(), gwo0Var);
                        if (iM78174x != 1 && (iM78174x != 3 || hff0Var != hff0.f90728a)) {
                            if (hff0Var == hff0.f90728a) {
                                return;
                            }
                            b1p0Var.m27918c().setAttribute(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "superseded");
                            b1p0Var.m27916a().mo27275a(Long.valueOf(jLongValue));
                            b1p0Var.m27917b().mo27275a(Long.valueOf(jLongValue));
                            b1p0Var.m27919d().mo51100a(jLongValue);
                            b1p0Var.m27918c().mo33385a(jLongValue);
                        }
                        si5.m78175y(b1p0Var.m27918c(), gwo0Var);
                        si5.m78169i(b1p0Var.m27918c(), gwo0Var);
                        b1p0Var.m27916a().mo27275a(Long.valueOf(jLongValue));
                        this.f33174e = new b1p0(b1p0Var.m27918c(), b1p0Var.m27919d(), b1p0Var.m27917b(), b1p0Var.m27919d().mo51102c(Long.valueOf(jLongValue), str));
                        return;
                    }
                    tnk0 tnk0Var = tnk0.f221995a;
                    udy0 udy0VarMo75876t = tnk0Var.mo75876t("playback.start");
                    udy0VarMo75876t.mo33388d(jLongValue);
                    udy0VarMo75876t.setAttribute("capture.coverage", "partial");
                    udy0VarMo75876t.setAttribute("capture.callsite", str);
                    si5.m78169i(udy0VarMo75876t, gwo0Var);
                    pa81 pa81VarM83565m = unk0.m83565m(tnk0Var, "playback.start", null, 6);
                    this.f33174e = new b1p0(udy0VarMo75876t, pa81VarM83565m, pa81VarM83565m.mo51102c(Long.valueOf(jLongValue), "playback.start"), pa81VarM83565m.mo51102c(Long.valueOf(jLongValue), str));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
