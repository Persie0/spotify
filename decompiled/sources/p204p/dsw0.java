package p204p;

import android.net.Uri;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public final class dsw0 {

    /* JADX INFO: renamed from: a */
    public final xre f52648a;

    /* JADX INFO: renamed from: b */
    public final m500 f52649b;

    /* JADX INFO: renamed from: c */
    public final Flowable f52650c;

    /* JADX INFO: renamed from: d */
    public final uw00 f52651d;

    /* JADX INFO: renamed from: e */
    public final dtw0 f52652e;

    /* JADX INFO: renamed from: f */
    public final z9j0 f52653f;

    /* JADX INFO: renamed from: g */
    public final boolean f52654g;

    public dsw0(xre xreVar, m500 m500Var, Flowable flowable, uw00 uw00Var, dtw0 dtw0Var, z9j0 z9j0Var, boolean z) {
        this.f52648a = xreVar;
        this.f52649b = m500Var;
        this.f52650c = flowable;
        this.f52651d = uw00Var;
        this.f52652e = dtw0Var;
        this.f52653f = z9j0Var;
        this.f52654g = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Serializable m36783a(dsw0 dsw0Var, ibk ibkVar) {
        bsw0 bsw0Var;
        Serializable c6x0Var;
        if (ibkVar instanceof bsw0) {
            bsw0Var = (bsw0) ibkVar;
            int i = bsw0Var.f30413c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bsw0Var.f30413c = i - Integer.MIN_VALUE;
            } else {
                bsw0Var = new bsw0(dsw0Var, ibkVar);
            }
        } else {
            bsw0Var = new bsw0(dsw0Var, ibkVar);
        }
        Object objM96567o = bsw0Var.f30411a;
        int i2 = bsw0Var.f30413c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM84079a = dsw0Var.f52651d.m84079a();
                bsw0Var.f30413c = 1;
                objM96567o = zn91.m96567o(singleM84079a, bsw0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            c6x0Var = (Boolean) objM96567o;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return c6x0Var instanceof c6x0 ? Boolean.FALSE : c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m36784b(dsw0 dsw0Var, String str, Map map, ibk ibkVar) {
        csw0 csw0Var;
        Object c6x0Var;
        if (ibkVar instanceof csw0) {
            csw0Var = (csw0) ibkVar;
            int i = csw0Var.f41711e;
            if ((i & Integer.MIN_VALUE) != 0) {
                csw0Var.f41711e = i - Integer.MIN_VALUE;
            } else {
                csw0Var = new csw0(dsw0Var, ibkVar);
            }
        } else {
            csw0Var = new csw0(dsw0Var, ibkVar);
        }
        Object objM96567o = csw0Var.f41709c;
        int i2 = csw0Var.f41711e;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleTimeout = dsw0Var.f52650c.m23327A().timeout(1L, TimeUnit.SECONDS, Single.error(new TimeoutException()));
                csw0Var.f41707a = str;
                csw0Var.f41708b = map;
                csw0Var.f41711e = 1;
                objM96567o = zn91.m96567o(singleTimeout, csw0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = csw0Var.f41708b;
                str = csw0Var.f41707a;
                bga.m29073P(objM96567o);
            }
            c6x0Var = (PlayerState) objM96567o;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        PlayerState playerState = (PlayerState) c6x0Var;
        if (playerState == null || !hdi.m47210B(playerState).equals(str)) {
            dsw0Var.m36787e(str, map, null);
        } else {
            ((wy3) dsw0Var.f52648a).getClass();
            Long l = (Long) playerState.position(System.currentTimeMillis()).mo49283h();
            dsw0Var.m36787e(str, map, l != null ? new Integer((int) (l.longValue() / ((long) 1000))) : null);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public final f5k m36786c(String str, voc1 voc1Var, Map map) {
        return new f5k("reporting_report", (wwu) ruu.f202910c, (c5k) null, Integer.valueOf(R.string.options_menu_report), (String) null, false, (p221) null, new e5k(new v4k(3), 1, new d5k(gkw0.f80922O0, new p9v0(str, 15)), new eeu0((Object) this, (Object) voc1Var, (Object) map, str, 9)), 244);
    }

    /* JADX INFO: renamed from: e */
    public final void m36787e(String str, Map map, Integer num) {
        if (!this.f52654g) {
            mec0 mec0Var = new mec0();
            mec0Var.putAll(map);
            if (num != null) {
                mec0Var.put("playback_timestamp", String.valueOf(num.intValue()));
            }
            mec0 mec0VarM61540b = mec0Var.m61540b();
            if (mec0VarM61540b.isEmpty()) {
                mec0VarM61540b = null;
            }
            String strM73233l = qlk.m73233l(str, mec0VarM61540b);
            this.f52652e.m36866a(this.f52649b.getApplication(), str, strM73233l);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xoc1.f263880F1.f243453a);
        sb.append("?uri=");
        sb.append(Uri.encode(str));
        if (num != null) {
            int iIntValue = num.intValue();
            sb.append("&playback_timestamp=");
            sb.append(iIntValue);
        }
        String string = sb.toString();
        if (string == null) {
            throw new IllegalStateException("uri was not set!");
        }
        this.f52653f.mo63651f(new p6j0(string, "", false, false, 0, 0, false, null, null, null));
    }
}
