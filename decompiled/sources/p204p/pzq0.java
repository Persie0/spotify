package p204p;

import android.net.Uri;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class pzq0 {

    /* JADX INFO: renamed from: k */
    public static final PlaylistRequestDecorationPolicy f183776k;

    /* JADX INFO: renamed from: l */
    public static final qt80 f183777l;

    /* JADX INFO: renamed from: a */
    public final klf0 f183778a;

    /* JADX INFO: renamed from: b */
    public final wt80 f183779b;

    /* JADX INFO: renamed from: c */
    public final ov80 f183780c;

    /* JADX INFO: renamed from: d */
    public final fjf0 f183781d;

    /* JADX INFO: renamed from: e */
    public final t5g0 f183782e;

    /* JADX INFO: renamed from: f */
    public final kv91 f183783f;

    /* JADX INFO: renamed from: g */
    public final x0h0 f183784g;

    /* JADX INFO: renamed from: h */
    public final kq11 f183785h;

    /* JADX INFO: renamed from: i */
    public final kuf0 f183786i;

    /* JADX INFO: renamed from: j */
    public final lsi0 f183787j = msi0.m62770a();

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57344B();
        top0VarM18421v.m81218z(ktp0VarM18427E);
        f183776k = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
        f183777l = new qt80(Collections.singleton(in80.f103923d));
    }

    public pzq0(klf0 klf0Var, wt80 wt80Var, ov80 ov80Var, fjf0 fjf0Var, t5g0 t5g0Var, kv91 kv91Var, x0h0 x0h0Var, kq11 kq11Var, kuf0 kuf0Var) {
        this.f183778a = klf0Var;
        this.f183779b = wt80Var;
        this.f183780c = ov80Var;
        this.f183781d = fjf0Var;
        this.f183782e = t5g0Var;
        this.f183783f = kv91Var;
        this.f183784g = x0h0Var;
        this.f183785h = kq11Var;
        this.f183786i = kuf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        if (r12 == r9) goto L39;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71760a(amf0 amf0Var, ibk ibkVar) {
        mzq0 mzq0Var;
        izq0 izq0VarM71761b;
        if (ibkVar instanceof mzq0) {
            mzq0Var = (mzq0) ibkVar;
            int i = mzq0Var.f148765d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mzq0Var.f148765d = i - Integer.MIN_VALUE;
            } else {
                mzq0Var = new mzq0(this, ibkVar);
            }
        } else {
            mzq0Var = new mzq0(this, ibkVar);
        }
        Object objM71765f = mzq0Var.f148763b;
        int i2 = mzq0Var.f148765d;
        duf0 duf0Var = duf0.f53052a;
        kuf0 kuf0Var = this.f183786i;
        Object obj = w2a1.f247311a;
        lsi0 lsi0Var = this.f183787j;
        Object obj2 = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM71765f);
                    if (!lsi0Var.m59837g()) {
                        return obj;
                    }
                    if (this.f183782e.f217299c) {
                        lsi0Var.mo54249c(null);
                        return obj;
                    }
                    kq11 kq11Var = this.f183785h;
                    mzq0Var.f148762a = amf0Var;
                    mzq0Var.f148765d = 1;
                    Object objM89240h = ((wxf0) ((nxf0) kq11Var.f125200b)).m89240h(mzq0Var);
                    if (objM89240h != obj2) {
                        objM89240h = obj;
                    }
                    if (objM89240h != obj2) {
                    }
                    return obj2;
                }
                if (i2 == 1) {
                    amf0Var = mzq0Var.f148762a;
                    bga.m29073P(objM71765f);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    amf0Var = mzq0Var.f148762a;
                    bga.m29073P(objM71765f);
                }
                kzq0 kzq0Var = (kzq0) objM71765f;
                if (kzq0Var == null) {
                    kuf0.m57390a(kuf0Var, duf0Var);
                    lsi0Var.mo54249c(null);
                    return obj;
                }
                boolean zM71764e = m71764e(amf0Var, kzq0Var);
                if (!zM71764e && (kzq0Var instanceof jzq0) && this.f183781d.f70251f0 && (izq0VarM71761b = m71761b(amf0Var)) != null) {
                    zM71764e = m71764e(amf0Var, izq0VarM71761b);
                }
                if (!zM71764e) {
                    kuf0.m57390a(kuf0Var, duf0Var);
                }
                lsi0Var.mo54249c(null);
                return obj;
                mzq0Var.f148762a = amf0Var;
                mzq0Var.f148765d = 2;
                objM71765f = m71765f(amf0Var, mzq0Var);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                kuf0.m57390a(kuf0Var, duf0Var);
                lsi0Var.mo54249c(null);
                return obj;
            }
        } catch (Throwable th) {
            lsi0Var.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final izq0 m71761b(amf0 amf0Var) {
        Object c6x0Var;
        if (this.f183782e.f217298b == null) {
            return null;
        }
        String string = new Uri.Builder().scheme("spotify").authority("internal").path("bridge-tracks-curation").appendQueryParameter("playlist", amf0Var.f17131a).appendQueryParameter("trackARowId", amf0Var.f17132b).build().toString();
        tk6 tk6Var = new tk6(string);
        try {
            c6x0Var = new izq0(tk6Var, "spotify:assisted-curation?context=" + Uri.encode(string) + "&mode=selection");
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return (izq0) (c6x0Var instanceof c6x0 ? null : c6x0Var);
    }

    /* JADX INFO: renamed from: c */
    public final jzq0 m71762c(amf0 amf0Var) {
        Object c6x0Var;
        if (this.f183782e.f217297a == null) {
            return null;
        }
        kl70 kl70Var = new kl70(amf0Var.f17131a, amf0Var.f17132b, amf0Var.f17133c, amf0Var.f17134d);
        try {
            c6x0Var = new jzq0(kl70Var, (String) sg70.f208757f.invoke(kl70Var));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        return (jzq0) (c6x0Var instanceof c6x0 ? null : c6x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r2 == r7) goto L28;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m71763d(amf0 amf0Var, ibk ibkVar) {
        nzq0 nzq0Var;
        amf0 amf0Var2 = amf0Var;
        if (ibkVar instanceof nzq0) {
            nzq0Var = (nzq0) ibkVar;
            int i = nzq0Var.f160141d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nzq0Var.f160141d = i - Integer.MIN_VALUE;
            } else {
                nzq0Var = new nzq0(this, ibkVar);
            }
        } else {
            nzq0Var = new nzq0(this, ibkVar);
        }
        Object objM35087j = nzq0Var.f160139b;
        int i2 = nzq0Var.f160141d;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM35087j);
                d670 d670VarM51212a = this.f183780c.f170445a.m51212a(this.f183778a.f123893f);
                String str = amf0Var2.f17131a;
                nzq0Var.f160138a = amf0Var2;
                nzq0Var.f160141d = 1;
                objM35087j = d670VarM51212a.m35087j(str, nzq0Var);
                if (objM35087j == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                amf0Var2 = nzq0Var.f160138a;
                bga.m29073P(objM35087j);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                amf0Var2 = nzq0Var.f160138a;
                bga.m29073P(objM35087j);
            }
            qu80 qu80Var = (qu80) ((p2x0) objM35087j).m68971d();
            Iterator it = qu80Var.f192598d.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (wj50.m88271j(((nw80) it.next()).f159047a, amf0Var2.f17132b)) {
                    break;
                }
                i3++;
            }
            if (i3 < 0) {
                return lzq0.f138413c;
            }
            return Math.max(0, qu80Var.f192598d.size() - (i3 + 2)) >= this.f183781d.f70253g0 ? lzq0.f138411a : lzq0.f138412b;
            Set set = (Set) objM35087j;
            fiz fizVarM62846k = ((mu80) this.f183779b).m62846k(amf0Var2.f17131a, new st80(f183776k, null, set, false, f183777l, a5u0.f12598a, null, 0, null, 458));
            nzq0Var.f160138a = amf0Var2;
            nzq0Var.f160141d = 2;
            objM35087j = vyf1.m86755t(fizVarM62846k, nzq0Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return lzq0.f138414d;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m71764e(amf0 amf0Var, kzq0 kzq0Var) {
        Object c6x0Var;
        p7x0 p7x0Var;
        p7x0 p7x0Var2;
        z650 z650Var;
        String uri = kzq0Var.getUri();
        String str = null;
        try {
            kv91 kv91Var = this.f183783f;
            st91 st91VarMo24361d = this.f183784g.mo24361d();
            String str2 = amf0Var.f17133c;
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-overlap-edit-page-track-row";
            yt91VarM50626j.f276052f = "2.2.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276050d = str2;
            yt91 yt91VarM96903c = yt91VarM50626j.m94607a().m96903c();
            yt91VarM96903c.f276055i.add(new bu91("swap_button", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            dv91 dv91Var = new dv91("hit", 1);
            String string = uri != null ? uri.toString() : null;
            if (string == null) {
                string = "";
            }
            c6x0Var = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91VarMo24361d, System.currentTimeMillis()), null);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        d850 d850Var = (d850) c6x0Var;
        if (d850Var != null && (z650Var = d850Var.f46380a) != null) {
            str = z650Var.f279709a;
        }
        boolean z = kzq0Var instanceof jzq0;
        t5g0 t5g0Var = this.f183782e;
        if (z) {
            kl70 kl70Var = ((jzq0) kzq0Var).f117777a;
            if (!t5g0Var.f217299c && (p7x0Var2 = t5g0Var.f217297a) != null) {
                p7x0Var2.mo25060a(kl70Var, str);
                t5g0Var.f217299c = true;
                return true;
            }
        } else {
            if (!(kzq0Var instanceof izq0)) {
                throw new NoWhenBranchMatchedException();
            }
            tk6 tk6Var = ((izq0) kzq0Var).f107279a;
            if (!t5g0Var.f217299c && (p7x0Var = t5g0Var.f217298b) != null) {
                p7x0Var.mo25060a(tk6Var, str);
                t5g0Var.f217299c = true;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m71765f(amf0 amf0Var, ibk ibkVar) {
        ozq0 ozq0Var;
        boolean z = this.f183781d.f70251f0;
        if (ibkVar instanceof ozq0) {
            ozq0Var = (ozq0) ibkVar;
            int i = ozq0Var.f172346d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozq0Var.f172346d = i - Integer.MIN_VALUE;
            } else {
                ozq0Var = new ozq0(this, ibkVar);
            }
        } else {
            ozq0Var = new ozq0(this, ibkVar);
        }
        Object objM71763d = ozq0Var.f172344b;
        int i2 = ozq0Var.f172346d;
        if (i2 == 0) {
            bga.m29073P(objM71763d);
            ozq0Var.f172343a = amf0Var;
            ozq0Var.f172346d = 1;
            objM71763d = m71763d(amf0Var, ozq0Var);
            Object obj = yuk.f276404a;
            if (objM71763d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            amf0Var = ozq0Var.f172343a;
            bga.m29073P(objM71763d);
        }
        int iOrdinal = ((lzq0) objM71763d).ordinal();
        if (iOrdinal == 0) {
            jzq0 jzq0VarM71762c = m71762c(amf0Var);
            if (jzq0VarM71762c != null) {
                return jzq0VarM71762c;
            }
            izq0 izq0VarM71761b = m71761b(amf0Var);
            if (z) {
                return izq0VarM71761b;
            }
            return null;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                izq0 izq0VarM71761b2 = m71761b(amf0Var);
                if (z) {
                    return izq0VarM71761b2;
                }
                return null;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return z ? m71761b(amf0Var) : m71762c(amf0Var);
    }
}
