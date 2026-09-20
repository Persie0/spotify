package p204p;

import android.net.Uri;
import com.spotify.appauthorization.builtinauth.model.FieldValidator$ValidationException;
import com.spotify.interapp.model.AppProtocol$Message;
import com.spotify.music.R;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PrefetchLevel;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gif1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f80188a;

    /* JADX INFO: renamed from: b */
    public static sd40 f80189b;

    /* JADX INFO: renamed from: a */
    public static final void m44790a(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-748787490);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | 384 | (xq00Var.m91768h(z) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fmx0 fmx0VarM47993b = hmx0.m47993b(20);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96866z = zsf1.m96866z(hdi.m47247x(nec.m64246i(r9g1.m75068p(mi21.m61842z(mi21.m61822f(1.0f, cxh0Var), null, 3), fmx0VarM47993b), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, kxf1.f127485a), false, null, null, null, eh00Var, 15), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224762e);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27616g, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96866z);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64971g;
            long j = leu.m58815a(xq00Var).f112824b.f138758b;
            ol80 ol80Var = new ol80(1);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(str, new cr70(1.0f, true), if71Var, j, null, null, 2, false, ol80Var, 0, null, xq00Var, i2 & 14, 0, 1712);
            if (z) {
                xq00Var.m91771i0(-458130827);
                y85.m93057b(rru.f202110c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224762e, 0.0f, 0.0f, 0.0f, 14)), leu.m58815a(xq00Var).f112824b.f138758b, 0L, false, xq00Var, rru.f202111d | 48, 48);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-457860600);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new xge(str, eh00Var, fxh0Var2, z, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m44791b(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00Var.m91775k0(403536879);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String strM54977L = k0e1.m54977L(R.string.inactive_chat_title, xq00Var);
            j15 j15Var = new j15(k0e1.m54977L(R.string.inactive_chat_subtitle, xq00Var));
            cxh0 cxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            zmg1.m96434a(strM54977L, j15Var, cxh0Var, null, xq00Var2, 384, 8);
            fxh0Var = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i6q(fxh0Var, i, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m44792c(f4m0 f4m0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1410457740);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(f4m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            fxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96864x = zsf1.m96864x(mi21.m61820d(1.0f, fxh0Var2), f4m0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96864x);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            p271.m68899b(null, 3, 0L, 0L, xq00Var, 48, 13);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iaa0(f4m0Var, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static vcg0 m44793d(Integer num, st91 st91Var) {
        return new vcg0(num, st91Var);
    }

    /* JADX INFO: renamed from: e */
    public static AppProtocol$Message m44794e(FieldValidator$ValidationException fieldValidator$ValidationException) {
        String message = fieldValidator$ValidationException.getMessage();
        if (message == null) {
            message = "";
        }
        return new AppProtocol$Message(message);
    }

    /* JADX INFO: renamed from: f */
    public static final String m44795f(String str) {
        return "spotify:list:listening-party:".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX INFO: renamed from: g */
    public static ff41 m44796g(String str) {
        String string;
        boolean zM43725i0;
        String path;
        List<String> pathSegments;
        if (!bm51.m29803n0(str, "spotify://", false)) {
            if (bm51.m29803n0(str, "spotify:", false)) {
                String strM29802m0 = bm51.m29802m0(str, "spotify:", "spotify:///");
                int iM88459I0 = wl51.m88459I0(strM29802m0, new char[]{'?', '#'}, 0, false);
                if (iM88459I0 == -1) {
                    iM88459I0 = strM29802m0.length();
                }
                int iM63437n = n0e1.m63437n(11, 0, strM29802m0.length());
                int iM63437n2 = n0e1.m63437n(iM88459I0, iM63437n, strM29802m0.length());
                StringBuilder sb = new StringBuilder(strM29802m0);
                while (iM63437n < iM63437n2) {
                    if (sb.charAt(iM63437n) == ':') {
                        sb.setCharAt(iM63437n, '/');
                    }
                    iM63437n++;
                }
                string = sb.toString();
            } else {
                string = str;
            }
            Uri uri = Uri.parse(string);
            if (uri != null) {
                String scheme = uri.getScheme();
                if (scheme != null) {
                    int iHashCode = scheme.hashCode();
                    if (iHashCode != -1998723398) {
                        zM43725i0 = iHashCode != 3213448 ? g6f.m43725i0(ff41.f68906e, uri.getHost()) : g6f.m43725i0(ff41.f68906e, uri.getHost());
                    } else if (scheme.equals("spotify")) {
                        zM43725i0 = true;
                    } else {
                        zM43725i0 = false;
                    }
                } else {
                    zM43725i0 = false;
                }
                if (zM43725i0 && (path = uri.getPath()) != null && !wl51.m88496t0(path, "//", false) && (pathSegments = uri.getPathSegments()) != null && !pathSegments.isEmpty()) {
                    String str2 = (String) g6f.m43745s0(pathSegments);
                    String strSubstring = (str2 != null && bm51.m29803n0(str2, "intl-", false)) ? str2.substring(5) : null;
                    if (strSubstring != null) {
                        pathSegments = g6f.m43729k0(pathSegments, 1);
                    }
                    if (!pathSegments.isEmpty()) {
                        mec0 mec0Var = new mec0();
                        Set<String> queryParameterNames = uri.getQueryParameterNames();
                        if (queryParameterNames != null) {
                            for (String str3 : queryParameterNames) {
                                String queryParameter = uri.getQueryParameter(str3);
                                if (queryParameter != null) {
                                    mec0Var.put(str3, queryParameter);
                                }
                            }
                        }
                        if (strSubstring != null) {
                            mec0Var.put("intl", strSubstring);
                        }
                        return new ff41(str, pathSegments, mec0Var.m61540b(), uri.getFragment());
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final EsPreparePlayOptions$PreparePlayOptions m44797h(PreparePlayOptions preparePlayOptions) {
        nnw nnwVar;
        qnw qnwVar;
        onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
        if (preparePlayOptions.playbackId().mo49279c()) {
            onwVarM17830E.m67437w(y85.m93077y((String) preparePlayOptions.playbackId().mo49278b()));
        }
        if (preparePlayOptions.alwaysPlaySomething().mo49279c()) {
            onwVarM17830E.m67433s(((Boolean) preparePlayOptions.alwaysPlaySomething().mo49278b()).booleanValue());
        }
        if (preparePlayOptions.skipTo().mo49279c()) {
            SkipToTrack skipToTrack = (SkipToTrack) preparePlayOptions.skipTo().mo49278b();
            xow xowVarM18009u = EsSkipToTrack$SkipToTrack.m18009u();
            xowVarM18009u.m91566q((String) skipToTrack.pageUrl().mo49280e(""));
            if (skipToTrack.pageIndex().mo49279c()) {
                umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
                umwVarM17777q.m83492m(((Number) skipToTrack.pageIndex().mo49278b()).longValue());
                xowVarM18009u.m91565m((EsOptional$OptionalInt64) umwVarM17777q.build());
            }
            xowVarM18009u.m91568s((String) skipToTrack.trackUid().mo49280e(""));
            xowVarM18009u.m91569t((String) skipToTrack.trackUri().mo49280e(""));
            if (skipToTrack.trackIndex().mo49279c()) {
                umw umwVarM17777q2 = EsOptional$OptionalInt64.m17777q();
                umwVarM17777q2.m83492m(((Number) skipToTrack.trackIndex().mo49278b()).longValue());
                xowVarM18009u.m91567r((EsOptional$OptionalInt64) umwVarM17777q2.build());
            }
            onwVarM17830E.m67427C((EsSkipToTrack$SkipToTrack) xowVarM18009u.build());
        }
        if (preparePlayOptions.seekTo().mo49279c()) {
            umw umwVarM17777q3 = EsOptional$OptionalInt64.m17777q();
            umwVarM17777q3.m83492m(((Number) preparePlayOptions.seekTo().mo49278b()).longValue());
            onwVarM17830E.m67440z((EsOptional$OptionalInt64) umwVarM17777q3.build());
        }
        if (preparePlayOptions.seekToCreatorTimestamp().mo49279c()) {
            onwVarM17830E.m67425A((String) preparePlayOptions.seekToCreatorTimestamp().mo49278b());
        }
        if (preparePlayOptions.initiallyPaused().mo49279c()) {
            onwVarM17830E.m67435u(((Boolean) preparePlayOptions.initiallyPaused().mo49278b()).booleanValue());
        }
        if (preparePlayOptions.systemInitiated().mo49279c()) {
            onwVarM17830E.m67429E(((Boolean) preparePlayOptions.systemInitiated().mo49278b()).booleanValue());
        }
        if (preparePlayOptions.playerOptionsOverride().mo49279c()) {
            PlayerOptionOverrides playerOptionOverrides = (PlayerOptionOverrides) preparePlayOptions.playerOptionsOverride().mo49278b();
            njw njwVarM17688r = EsContextPlayerOptions$ContextPlayerOptionOverrides.m17688r();
            if (playerOptionOverrides.shufflingContext().mo49279c()) {
                tmw tmwVarM17771o = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o.m81146m(((Boolean) playerOptionOverrides.shufflingContext().mo49278b()).booleanValue());
                njwVarM17688r.m64643t((EsOptional$OptionalBoolean) tmwVarM17771o.build());
            }
            if (playerOptionOverrides.repeatingContext().mo49279c()) {
                tmw tmwVarM17771o2 = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o2.m81146m(((Boolean) playerOptionOverrides.repeatingContext().mo49278b()).booleanValue());
                njwVarM17688r.m64641r((EsOptional$OptionalBoolean) tmwVarM17771o2.build());
            }
            if (playerOptionOverrides.repeatingTrack().mo49279c()) {
                tmw tmwVarM17771o3 = EsOptional$OptionalBoolean.m17771o();
                tmwVarM17771o3.m81146m(((Boolean) playerOptionOverrides.repeatingTrack().mo49278b()).booleanValue());
                njwVarM17688r.m64642s((EsOptional$OptionalBoolean) tmwVarM17771o3.build());
            }
            njwVarM17688r.m64639m(playerOptionOverrides.modes());
            onwVarM17830E.m67438x((EsContextPlayerOptions$ContextPlayerOptionOverrides) njwVarM17688r.build());
        }
        if (preparePlayOptions.suppressions().mo49279c()) {
            onwVarM17830E.m67430m(((Suppressions) preparePlayOptions.suppressions().mo49278b()).providers());
        }
        if (preparePlayOptions.prefetchLevel().mo49279c()) {
            PrefetchLevel prefetchLevel = (PrefetchLevel) preparePlayOptions.prefetchLevel().mo49278b();
            int i = prefetchLevel == null ? -1 : brq0.f30160a[prefetchLevel.ordinal()];
            if (i == -1 || i == 1) {
                qnwVar = qnw.NONE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                qnwVar = qnw.MEDIA;
            }
            onwVarM17830E.m67439y(qnwVar);
        }
        if (preparePlayOptions.audioStream().mo49279c()) {
            AudioStream audioStream = (AudioStream) preparePlayOptions.audioStream().mo49278b();
            int i2 = audioStream == null ? -1 : brq0.f30161b[audioStream.ordinal()];
            if (i2 == -1 || i2 == 1) {
                nnwVar = nnw.DEFAULT;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                nnwVar = nnw.ALARM;
            }
            onwVarM17830E.m67434t(nnwVar);
        }
        if (preparePlayOptions.sessionId().mo49279c()) {
            onwVarM17830E.m67426B((String) preparePlayOptions.sessionId().mo49278b());
        }
        if (preparePlayOptions.license().mo49279c()) {
            onwVarM17830E.m67436v((String) preparePlayOptions.license().mo49278b());
        }
        onwVarM17830E.m67432r(preparePlayOptions.configurationOverride());
        return (EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build();
    }

    /* JADX INFO: renamed from: i */
    public static final jzl0 m44798i(File file, boolean z) {
        return new jzl0(new FileOutputStream(file, z), new au71());
    }

    /* JADX INFO: renamed from: j */
    public static jzl0 m44799j(File file) {
        return m44798i(file, false);
    }

    /* JADX INFO: renamed from: k */
    public static final ow40 m44800k(File file) {
        return new ow40(new FileInputStream(file), au71.f19881d);
    }

    /* JADX INFO: renamed from: l */
    public static final ow40 m44801l(InputStream inputStream) {
        return new ow40(inputStream, new au71());
    }

    /* JADX INFO: renamed from: m */
    public static final ro80 m44802m(Set set) {
        ro80 ro80VarM44508o = geg1.m44508o();
        if (set.contains(gt80.f84105a)) {
            ro80VarM44508o.add(new j2z());
            ro80VarM44508o.add(new k2z());
        } else if (set.contains(ft80.f73135a)) {
            ro80VarM44508o.add(new j2z());
        } else if (set.contains(lt80.f136724a)) {
            ro80VarM44508o.add(new k2z());
        }
        if (set.contains(ss80.f213529a)) {
            ro80VarM44508o.add(new h2z());
        }
        if (set.contains(mt80.f146986a)) {
            ro80VarM44508o.add(new l2z());
        }
        return geg1.m44506m(ro80VarM44508o);
    }

    /* JADX INFO: renamed from: n */
    public static j45 m44803n() {
        j45 j45Var = new j45(new cvf(-1, -1, 0, true), false);
        j45Var.f108596c = false;
        return j45Var;
    }
}
