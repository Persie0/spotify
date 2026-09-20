package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q1w0 implements z1w0 {

    /* JADX INFO: renamed from: a */
    public final boolean f184421a;

    /* JADX INFO: renamed from: b */
    public final boolean f184422b;

    /* JADX INFO: renamed from: c */
    public final PlayOrigin f184423c;

    /* JADX INFO: renamed from: d */
    public final uqw f184424d;

    /* JADX INFO: renamed from: e */
    public final hrw f184425e;

    /* JADX INFO: renamed from: f */
    public final lcu0 f184426f;

    public q1w0(scn scnVar, jdp0 jdp0Var, xre xreVar, boolean z, boolean z2, PlayOrigin playOrigin) {
        this.f184421a = z;
        this.f184422b = z2;
        this.f184423c = playOrigin;
        g3h1.m43504q(playOrigin);
        this.f184424d = scnVar.m77810d();
        this.f184425e = scnVar.m77807a();
        Flowable flowableMo53041b = jdp0Var.mo53041b();
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f184426f = new lcu0(13, new onc(flowableMo53041b), xreVar);
    }

    /* JADX INFO: renamed from: d */
    public static LoggingParams m71958d(String str, String str2) {
        LoggingParams.Builder builder = LoggingParams.builder();
        if (str != null) {
            builder.interactionId(str);
        }
        if (str2 == null) {
            str2 = "";
        }
        return builder.pageInstanceId(str2).build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m71959e(String str, String str2, ibk ibkVar) {
        k1w0 k1w0Var;
        if (ibkVar instanceof k1w0) {
            k1w0Var = (k1w0) ibkVar;
            int i = k1w0Var.f118441c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k1w0Var.f118441c = i - Integer.MIN_VALUE;
            } else {
                k1w0Var = new k1w0(this, ibkVar);
            }
        } else {
            k1w0Var = new k1w0(this, ibkVar);
        }
        Object objM96567o = k1w0Var.f118439a;
        int i2 = k1w0Var.f118441c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleMo48412a = this.f184425e.mo48412a(h8p0.m46836d(PauseCommand.builder().loggingParams(m71958d(str, str2)).options(CommandOptions.builder().systemInitiated(false).build()).pauseOrigin(PauseResumeOrigin.builder(this.f184423c.featureIdentifier()).build()).build()));
            k1w0Var.f118441c = 1;
            objM96567o = zn91.m96567o(singleMo48412a, k1w0Var);
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
        return qyg1.m74178H(((lcf) objM96567o).m58694d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public final Serializable m71960f(String str, String str2, List list, String str3, String str4, Long l, u1w0 u1w0Var, boolean z, ibk ibkVar) {
        l1w0 l1w0Var;
        Context contextBuild;
        if (ibkVar instanceof l1w0) {
            l1w0Var = (l1w0) ibkVar;
            int i = l1w0Var.f128835d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1w0Var.f128835d = i - Integer.MIN_VALUE;
            } else {
                l1w0Var = new l1w0(this, ibkVar);
            }
        } else {
            l1w0Var = new l1w0(this, ibkVar);
        }
        Object objM96567o = l1w0Var.f128833b;
        int i2 = l1w0Var.f128835d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            List listM42078u = str2 != null ? fm8.m42078u(str2, list) : g6f.m43714b1(list, Math.min(list.size(), 100));
            if (this.f184422b) {
                Context.Builder builder = Context.builder(str);
                ContextPage.Builder builder2 = ContextPage.builder();
                ArrayList arrayList = new ArrayList(i6f.m49804T(listM42078u, 10));
                Iterator it = listM42078u.iterator();
                while (it.hasNext()) {
                    arrayList.add(ContextTrack.create((String) it.next()).toBuilder().metadata(u1w0Var.m82231b()).build());
                }
                contextBuild = builder.pages(geg1.m44518y(builder2.tracks(arrayList).build())).metadata(kkc0.m56700m0(u1w0Var.m82230a(), c95.m31821M(pft0.m69840u(Context.Metadata.KEY_SORTING_CRITERIA, ContextTrack.Metadata.KEY_ADDED_AT)))).build();
            } else {
                Context.Builder builder3 = Context.fromUri(str).toBuilder();
                if (this.f184421a) {
                    ContextPage.Builder builder4 = ContextPage.builder();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM42078u, 10));
                    Iterator it2 = listM42078u.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(ContextTrack.create((String) it2.next()));
                    }
                    builder3 = builder3.pages(geg1.m44518y(builder4.tracks(arrayList2).build()));
                }
                contextBuild = builder3.metadata(kkc0.m56700m0(u1w0Var.m82230a(), c95.m31821M(pft0.m69840u(Context.Metadata.KEY_SORTING_CRITERIA, ContextTrack.Metadata.KEY_ADDED_AT)))).build();
            }
            PlayCommand.Builder builderLoggingParams = PlayCommand.builder(contextBuild, this.f184423c).loggingParams(m71958d(str3, str4));
            PreparePlayOptions.Builder builder5 = PreparePlayOptions.builder();
            if (str2 != null) {
                builder5.skipTo(SkipToTrack.fromUri(str2));
            }
            if (l != null) {
                builder5.seekTo(Long.valueOf(l.longValue()));
            }
            if (z) {
                builder5.initiallyPaused(true);
            }
            PreparePlayOptions.Builder builderSuppressions = builder5.suppressions(Suppressions.create(Collections.singleton(Suppressions.Providers.MFT)));
            PlayerOptionOverrides.Builder builder6 = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            Single singleM83821a = this.f184424d.m83821a(builderLoggingParams.options(builderSuppressions.playerOptionsOverride(builder6.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).systemInitiated(false).build()).build());
            l1w0Var.f128832a = str2;
            l1w0Var.f128835d = 1;
            objM96567o = zn91.m96567o(singleM83821a, l1w0Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = l1w0Var.f128832a;
            bga.m29073P(objM96567o);
        }
        lcf lcfVar = (lcf) objM96567o;
        if (lcfVar.m58694d()) {
            return str2 == null ? "" : str2;
        }
        String strM47110g = lcfVar.m58692a().m47110g();
        return new c6x0(new Exception(strM47110g != null ? strM47110g : ""));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: g */
    public final Object m71961g(String str, String str2, String str3, List list, String str4, String str5, u1w0 u1w0Var, ibk ibkVar) {
        m1w0 m1w0Var;
        ArrayList arrayList;
        List<String> listM42078u;
        ContextTrack contextTrackBuild;
        if (ibkVar instanceof m1w0) {
            m1w0Var = (m1w0) ibkVar;
            int i = m1w0Var.f139123c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1w0Var.f139123c = i - Integer.MIN_VALUE;
            } else {
                m1w0Var = new m1w0(this, ibkVar);
            }
        } else {
            m1w0Var = new m1w0(this, ibkVar);
        }
        Object objM96567o = m1w0Var.f139121a;
        int i2 = m1w0Var.f139123c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Context.Builder builder = Context.builder(str2);
            if (this.f184421a) {
                listM42078u = fm8.m42078u(str3, list);
            } else {
                arrayList = new ArrayList(list);
                if (!arrayList.contains(str3)) {
                    listM42078u = arrayList;
                    arrayList.add(0, str3);
                    listM42078u = arrayList;
                }
            }
            listM42078u = arrayList;
            ContextPage.Builder builder2 = ContextPage.builder();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(listM42078u, 10));
            for (String str6 : listM42078u) {
                Map<String, String> mapM82231b = wj50.m88271j(str6, str3) ? u1w0Var.m82231b() : nau.f152117a;
                if (str == null) {
                    contextTrackBuild = ContextTrack.builder(str6).metadata(mapM82231b).build();
                } else {
                    if (this.f184422b) {
                        ContextTrack.Builder builder3 = ContextTrack.create(str6).toBuilder();
                        LinkedHashMap linkedHashMapM56698k0 = kkc0.m56698k0(pft0.m69840u(ContextTrack.Metadata.KEY_SUBTITLE, str));
                        linkedHashMapM56698k0.putAll(mapM82231b);
                        contextTrackBuild = builder3.metadata(linkedHashMapM56698k0).build();
                    } else {
                        ContextTrack.Builder builder4 = ContextTrack.builder(str6);
                        LinkedHashMap linkedHashMapM56698k1 = kkc0.m56698k0(pft0.m69840u(ContextTrack.Metadata.KEY_SUBTITLE, str));
                        linkedHashMapM56698k1.putAll(mapM82231b);
                        contextTrackBuild = builder4.metadata(linkedHashMapM56698k1).build();
                    }
                    if (contextTrackBuild == null) {
                        contextTrackBuild = ContextTrack.builder(str6).metadata(mapM82231b).build();
                    }
                }
                arrayList2.add(contextTrackBuild);
            }
            builder.pages(geg1.m44518y(builder2.tracks(arrayList2).build()));
            PlayCommand.Builder builderLoggingParams = PlayCommand.create(builder.metadata(u1w0Var.m82230a()).build(), this.f184423c).toBuilder().loggingParams(m71958d(str4, str5));
            PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str3)).suppressions(Suppressions.create(Collections.singleton(Suppressions.Providers.MFT)));
            PlayerOptionOverrides.Builder builder5 = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            Single singleM83821a = this.f184424d.m83821a(builderLoggingParams.options(builderSuppressions.playerOptionsOverride(builder5.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).systemInitiated(false).build()).build());
            m1w0Var.f139123c = 1;
            objM96567o = zn91.m96567o(singleM83821a, m1w0Var);
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
        return qyg1.m74178H(((lcf) objM96567o).m58694d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m71962h(String str, String str2, ibk ibkVar) {
        n1w0 n1w0Var;
        if (ibkVar instanceof n1w0) {
            n1w0Var = (n1w0) ibkVar;
            int i = n1w0Var.f149552c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1w0Var.f149552c = i - Integer.MIN_VALUE;
            } else {
                n1w0Var = new n1w0(this, ibkVar);
            }
        } else {
            n1w0Var = new n1w0(this, ibkVar);
        }
        Object objM96567o = n1w0Var.f149550a;
        int i2 = n1w0Var.f149552c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleMo48412a = this.f184425e.mo48412a(h8p0.m46838f(ResumeCommand.builder().loggingParams(m71958d(str, str2)).options(CommandOptions.builder().systemInitiated(false).build()).resumeOrigin(PauseResumeOrigin.builder(this.f184423c.featureIdentifier()).build()).build()));
            n1w0Var.f149552c = 1;
            objM96567o = zn91.m96567o(singleMo48412a, n1w0Var);
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
        return qyg1.m74178H(((lcf) objM96567o).m58694d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m71963i(ibk ibkVar) {
        p1w0 p1w0Var;
        if (ibkVar instanceof p1w0) {
            p1w0Var = (p1w0) ibkVar;
            int i = p1w0Var.f173183c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p1w0Var.f173183c = i - Integer.MIN_VALUE;
            } else {
                p1w0Var = new p1w0(this, ibkVar);
            }
        } else {
            p1w0Var = new p1w0(this, ibkVar);
        }
        Object objM96567o = p1w0Var.f173181a;
        int i2 = p1w0Var.f173183c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleMo48412a = this.f184425e.mo48412a(h8p0.m46845m());
            p1w0Var.f173183c = 1;
            objM96567o = zn91.m96567o(singleMo48412a, p1w0Var);
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
        return qyg1.m74178H(((lcf) objM96567o).m58694d());
    }
}
