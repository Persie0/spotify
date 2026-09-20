package p204p;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzap;
import com.spotify.player.model.ContextTrack;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class dhf1 extends orf1 {

    /* JADX INFO: renamed from: u */
    public static final String f49084u;

    /* JADX INFO: renamed from: e */
    public long f49085e;

    /* JADX INFO: renamed from: f */
    public ptd0 f49086f;

    /* JADX INFO: renamed from: g */
    public Long f49087g;

    /* JADX INFO: renamed from: h */
    public dxc1 f49088h;

    /* JADX INFO: renamed from: i */
    public int f49089i;

    /* JADX INFO: renamed from: j */
    public final shf1 f49090j;

    /* JADX INFO: renamed from: k */
    public final shf1 f49091k;

    /* JADX INFO: renamed from: l */
    public final shf1 f49092l;

    /* JADX INFO: renamed from: m */
    public final shf1 f49093m;

    /* JADX INFO: renamed from: n */
    public final shf1 f49094n;

    /* JADX INFO: renamed from: o */
    public final shf1 f49095o;

    /* JADX INFO: renamed from: p */
    public final shf1 f49096p;

    /* JADX INFO: renamed from: q */
    public final shf1 f49097q;

    /* JADX INFO: renamed from: r */
    public final shf1 f49098r;

    /* JADX INFO: renamed from: s */
    public final shf1 f49099s;

    /* JADX INFO: renamed from: t */
    public final shf1 f49100t;

    static {
        Pattern pattern = acc.f14312a;
        f49084u = "urn:x-cast:com.google.cast.media";
    }

    public dhf1() {
        super(f49084u);
        this.f49089i = -1;
        shf1 shf1Var = new shf1(86400000L, "load");
        this.f49090j = shf1Var;
        shf1 shf1Var2 = new shf1(86400000L, ContextTrack.TrackAction.PAUSE);
        this.f49091k = shf1Var2;
        shf1 shf1Var3 = new shf1(86400000L, "play");
        this.f49092l = shf1Var3;
        shf1 shf1Var4 = new shf1(86400000L, ContextTrack.TrackAction.STOP);
        shf1 shf1Var5 = new shf1(10000L, "seek");
        this.f49093m = shf1Var5;
        shf1 shf1Var6 = new shf1(86400000L, "volume");
        this.f49094n = shf1Var6;
        shf1 shf1Var7 = new shf1(86400000L, "mute");
        this.f49095o = shf1Var7;
        shf1 shf1Var8 = new shf1(86400000L, "status");
        this.f49096p = shf1Var8;
        shf1 shf1Var9 = new shf1(86400000L, "activeTracks");
        shf1 shf1Var10 = new shf1(86400000L, "trackStyle");
        shf1 shf1Var11 = new shf1(86400000L, "queueInsert");
        shf1 shf1Var12 = new shf1(86400000L, "queueUpdate");
        this.f49097q = shf1Var12;
        shf1 shf1Var13 = new shf1(86400000L, "queueRemove");
        shf1 shf1Var14 = new shf1(86400000L, "queueReorder");
        shf1 shf1Var15 = new shf1(86400000L, "queueFetchItemIds");
        this.f49098r = shf1Var15;
        shf1 shf1Var16 = new shf1(86400000L, "queueFetchItemRange");
        this.f49100t = shf1Var16;
        this.f49099s = new shf1(86400000L, "queueFetchItems");
        shf1 shf1Var17 = new shf1(86400000L, "setPlaybackRate");
        shf1 shf1Var18 = new shf1(86400000L, "skipAd");
        m67690a(shf1Var);
        m67690a(shf1Var2);
        m67690a(shf1Var3);
        m67690a(shf1Var4);
        m67690a(shf1Var5);
        m67690a(shf1Var6);
        m67690a(shf1Var7);
        m67690a(shf1Var8);
        m67690a(shf1Var9);
        m67690a(shf1Var10);
        m67690a(shf1Var11);
        m67690a(shf1Var12);
        m67690a(shf1Var13);
        m67690a(shf1Var14);
        m67690a(shf1Var15);
        m67690a(shf1Var16);
        m67690a(shf1Var16);
        m67690a(shf1Var17);
        m67690a(shf1Var18);
        m36037m();
    }

    /* JADX INFO: renamed from: h */
    public static int[] m36027h(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: n */
    public static dvb1 m36028n(JSONObject jSONObject) {
        MediaError.m1486k(jSONObject);
        dvb1 dvb1Var = new dvb1();
        Pattern pattern = acc.f14312a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return dvb1Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m36029d(lhf1 lhf1Var, int i) {
        JSONObject jSONObject = new JSONObject();
        long jM67692c = m67692c();
        try {
            jSONObject.put("requestId", jM67692c);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", m36030e());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.f49089i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        m67691b(jM67692c, jSONObject.toString());
        this.f49097q.m78129a(jM67692c, new bka1(this, lhf1Var));
    }

    /* JADX INFO: renamed from: e */
    public final long m36030e() throws zzap {
        ptd0 ptd0Var = this.f49086f;
        if (ptd0Var != null) {
            return ptd0Var.f181120b;
        }
        throw new zzap();
    }

    /* JADX INFO: renamed from: f */
    public final long m36031f(double d, long j, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f49085e;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (jElapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public final void m36032g(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f49089i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.f168556a.m83850c(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m36033i() {
        dxc1 dxc1Var = this.f49088h;
        if (dxc1Var != null) {
            ydw0 ydw0Var = (ydw0) dxc1Var.f53930b;
            ydw0Var.getClass();
            Iterator it = ydw0Var.f271872i.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (!ydw0Var.m93504g() && ydw0Var.m93504g()) {
                    throw null;
                }
                throw null;
            }
            Iterator it2 = ydw0Var.f271870g.iterator();
            if (it2.hasNext()) {
                throw ikc0.m50937i(it2);
            }
            for (aqg1 aqg1Var : ydw0Var.f271871h) {
                switch (aqg1Var.f18251a) {
                    case 0:
                        ffd0 ffd0Var = (ffd0) aqg1Var.f18252b;
                        long jM41523h = ffd0Var.m41523h();
                        if (jM41523h != ffd0Var.f68974a) {
                            ffd0Var.f68974a = jM41523h;
                            ffd0Var.m41519d();
                            if (ffd0Var.f68974a != 0) {
                                ffd0Var.m41520e();
                            }
                        }
                        break;
                    case 1:
                        obc obcVar = (obc) aqg1Var.f18252b;
                        ydw0 ydw0Var2 = obcVar.f163607j;
                        ptd0 ptd0VarM93501d = ydw0Var2 != null ? ydw0Var2.m93501d() : null;
                        c4d1 c4d1Var = obcVar.f163609l;
                        if (c4d1Var != null && ptd0VarM93501d != null) {
                            u6f1 u6f1VarM68532E = ((oyp0) c4d1Var.f33927b).m68532E();
                            xhy0 xhy0Var = new xhy0();
                            xhy0Var.f261731a = ptd0VarM93501d.f181123e;
                            kf9 kf9Var = new kf9();
                            kf9Var.f122108c = xhy0Var.f261731a;
                            kf9Var.f122106a = System.currentTimeMillis();
                            kf9 kf9Var2 = u6f1VarM68532E.f227336m;
                            if (kf9Var2 == null || kf9Var2.f122108c != 2) {
                                kf9Var.f122107b = u6f1VarM68532E.f227331h;
                                u6f1VarM68532E.f227336m = kf9Var;
                            }
                        }
                        break;
                    default:
                        ((s0h1) aqg1Var.f18252b).m76874c();
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m36034j() {
        dxc1 dxc1Var = this.f49088h;
        if (dxc1Var != null) {
            ydw0 ydw0Var = (ydw0) dxc1Var.f53930b;
            ydw0Var.getClass();
            Iterator it = ydw0Var.f271870g.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
            for (aqg1 aqg1Var : ydw0Var.f271871h) {
                switch (aqg1Var.f18251a) {
                    case 2:
                        ((s0h1) aqg1Var.f18252b).m76874c();
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m36035k() {
        dxc1 dxc1Var = this.f49088h;
        if (dxc1Var != null) {
            ydw0 ydw0Var = (ydw0) dxc1Var.f53930b;
            Iterator it = ydw0Var.f271870g.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
            for (aqg1 aqg1Var : ydw0Var.f271871h) {
                switch (aqg1Var.f18251a) {
                    case 2:
                        ((s0h1) aqg1Var.f18252b).m76874c();
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m36036l() {
        dxc1 dxc1Var = this.f49088h;
        if (dxc1Var != null) {
            ydw0 ydw0Var = (ydw0) dxc1Var.f53930b;
            Iterator it = ydw0Var.f271870g.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
            for (aqg1 aqg1Var : ydw0Var.f271871h) {
                switch (aqg1Var.f18251a) {
                    case 2:
                        ((s0h1) aqg1Var.f18252b).m76874c();
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m36037m() {
        this.f49085e = 0L;
        this.f49086f = null;
        Iterator it = this.f168559d.iterator();
        while (it.hasNext()) {
            ((shf1) it.next()).m78133e();
        }
    }

    /* JADX INFO: renamed from: o */
    public final long m36038o() {
        khd0 khd0Var;
        ptd0 ptd0Var = this.f49086f;
        MediaInfo mediaInfo = ptd0Var == null ? null : ptd0Var.f181119a;
        long jM36031f = 0;
        if (mediaInfo != null && ptd0Var != null) {
            Long l = this.f49087g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    ptd0 ptd0Var2 = this.f49086f;
                    if (ptd0Var2.f181112S0 != null) {
                        long jLongValue = l.longValue();
                        ptd0 ptd0Var3 = this.f49086f;
                        if (ptd0Var3 != null && (khd0Var = ptd0Var3.f181112S0) != null) {
                            long j = khd0Var.f122614b;
                            jM36031f = !khd0Var.f122616d ? m36031f(1.0d, j, -1L) : j;
                        }
                        return Math.min(jLongValue, jM36031f);
                    }
                    MediaInfo mediaInfo2 = ptd0Var2 == null ? null : ptd0Var2.f181119a;
                    if ((mediaInfo2 != null ? mediaInfo2.f1799e : 0L) >= 0) {
                        long jLongValue2 = l.longValue();
                        ptd0 ptd0Var4 = this.f49086f;
                        MediaInfo mediaInfo3 = ptd0Var4 != null ? ptd0Var4.f181119a : null;
                        return Math.min(jLongValue2, mediaInfo3 != null ? mediaInfo3.f1799e : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.f49085e != 0) {
                double d = ptd0Var.f181122d;
                long j2 = ptd0Var.f181125g;
                return (d == 0.0d || ptd0Var.f181123e != 2) ? j2 : m36031f(d, j2, mediaInfo.f1799e);
            }
        }
        return 0L;
    }
}
