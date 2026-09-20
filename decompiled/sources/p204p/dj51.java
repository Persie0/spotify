package p204p;

import androidx.car.app.model.Alert;
import com.google.protobuf.Timestamp;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.ContextTrack;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass$StreamReportingAttribution;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamEndRequestOuterClass$StreamEndRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamHandleOuterClass$StreamHandle;
import com.spotify.stream_reporting_esperanto.proto.StreamProgressRequestOuterClass$StreamProgressRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass$StreamSeekRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass$StreamStartResponse;
import com.spotify.streamreporting.streamreportingesperanto.StreamReportingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class dj51 implements gh50, ozo0 {

    /* JADX INFO: renamed from: L0 */
    public boolean f49565L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f49566M0;

    /* JADX INFO: renamed from: N0 */
    public StreamHandleOuterClass$StreamHandle f49567N0;

    /* JADX INFO: renamed from: O0 */
    public long f49568O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f49569P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f49570Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f49571R0;

    /* JADX INFO: renamed from: S0 */
    public float f49572S0;

    /* JADX INFO: renamed from: T0 */
    public vk51 f49573T0;

    /* JADX INFO: renamed from: U0 */
    public dyd0 f49574U0;

    /* JADX INFO: renamed from: V0 */
    public String f49575V0;

    /* JADX INFO: renamed from: W0 */
    public String f49576W0;

    /* JADX INFO: renamed from: X */
    public yzo0 f49577X;

    /* JADX INFO: renamed from: X0 */
    public boolean f49578X0;

    /* JADX INFO: renamed from: Y */
    public ujx f49579Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f49580Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f49581Z;

    /* JADX INFO: renamed from: Z0 */
    public in71 f49582Z0;

    /* JADX INFO: renamed from: a */
    public final sr6 f49583a;

    /* JADX INFO: renamed from: a1 */
    public yzo0 f49584a1;

    /* JADX INFO: renamed from: b */
    public final mlr0 f49585b;

    /* JADX INFO: renamed from: b1 */
    public boolean f49586b1;

    /* JADX INFO: renamed from: c */
    public final xre f49587c;

    /* JADX INFO: renamed from: c1 */
    public pnl0 f49588c1;

    /* JADX INFO: renamed from: d */
    public final azu0 f49589d;

    /* JADX INFO: renamed from: d1 */
    public boolean f49590d1;

    /* JADX INFO: renamed from: e */
    public final String f49591e;

    /* JADX INFO: renamed from: e1 */
    public zmn0 f49592e1;

    /* JADX INFO: renamed from: f */
    public final luk f49593f;

    /* JADX INFO: renamed from: f1 */
    public int f49594f1;

    /* JADX INFO: renamed from: g */
    public final boolean f49595g;

    /* JADX INFO: renamed from: h */
    public final bqa f49596h = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);

    /* JADX INFO: renamed from: i */
    public final c9k f49597i;

    /* JADX INFO: renamed from: t */
    public final di41 f49598t;

    public dj51(String str, sr6 sr6Var, xre xreVar, luk lukVar, luk lukVar2, mlr0 mlr0Var, azu0 azu0Var, boolean z) {
        this.f49583a = sr6Var;
        this.f49585b = mlr0Var;
        this.f49587c = xreVar;
        this.f49589d = azu0Var;
        this.f49591e = str;
        this.f49593f = lukVar2;
        this.f49595g = z;
        c9k c9kVarM16o = AbstractC0000a.m16o(lukVar);
        this.f49597i = c9kVarM16o;
        this.f49598t = x0h1.m89578u(c9kVarM16o, null, 0, new v831(this, null, 15), 3);
        this.f49594f1 = 1;
        this.f49573T0 = vk51.UNKNOWN;
        this.f49574U0 = dyd0.MEDIA_TYPE_UNKNOWN;
        this.f49578X0 = true;
        this.f49580Y0 = true;
        this.f49586b1 = this.f49581Z;
    }

    /* JADX INFO: renamed from: T */
    public static String m36161T(dj51 dj51Var, String str) {
        yzo0 yzo0Var = dj51Var.f49577X;
        wj50.m88279p(yzo0Var);
        Map mapM56701n0 = (Map) ((gh00) dj51Var.f49589d.f21690b).invoke(yzo0Var);
        if (!mapM56701n0.containsKey("playback_id")) {
            mapM56701n0 = kkc0.m56701n0(mapM56701n0, new pqm0("playback_id", axf1.m27406u(yzo0Var)));
        }
        String str2 = (String) mapM56701n0.get(str);
        return str2 == null ? (String) yzo0Var.f277859a.f128768d.get(str) : str2;
    }

    /* JADX INFO: renamed from: y */
    public static Timestamp m36162y(long j) {
        lu71 lu71VarM1966t = Timestamp.m1966t();
        long j2 = 1000;
        lu71VarM1966t.m59943q(j / j2);
        lu71VarM1966t.m59942m((int) TimeUnit.MILLISECONDS.toNanos(j % j2));
        return (Timestamp) lu71VarM1966t.build();
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: E */
    public final void mo28573E(float f, long j, long j2) {
        if (this.f49565L0) {
            this.f49568O0 = j;
            this.f49572S0 = f;
            m36165S(j, j2);
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: F */
    public final void mo36163F(VideoSurfaceView videoSurfaceView, long j, long j2) {
        int i;
        eac1 configuration;
        if (this.f49565L0) {
            this.f49571R0 = videoSurfaceView != null ? videoSurfaceView.isFullscreen : false;
            String str = (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null) ? null : ((v8k) configuration).f238595a;
            if (str == null || wl51.m88460J0(str)) {
                i = 1;
            } else if (str.equals("fullscreen")) {
                i = 2;
            } else if (str.equals("now-playing-bar")) {
                i = 3;
            } else if (str.equals("now-playing-sidebar")) {
                i = 4;
            } else if (str.equals("now-playing-view")) {
                i = 5;
            } else if (str.equals("now-playing-view-vertical-portrait")) {
                i = 6;
            } else {
                i = str.equals("picture-in-picture") ? 7 : 8;
            }
            this.f49594f1 = i;
            this.f49568O0 = j;
            m36165S(j, j2);
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: G */
    public final void mo29149G(long j, long j2) {
        if (this.f49565L0) {
            this.f49569P0 = false;
            this.f49586b1 = true;
            this.f49568O0 = j;
            m36165S(j, j2);
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: M */
    public final void mo29150M(long j, long j2) {
        if (this.f49565L0) {
            this.f49568O0 = j;
            this.f49569P0 = true;
            m36165S(j, j2);
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: P */
    public final void mo36164P(long j, long j2, boolean z) {
        if (this.f49565L0) {
            this.f49580Y0 = !z;
            this.f49568O0 = j;
            m36165S(j, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    @Override // p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public final void mo25537Q(clq clqVar, int i, long j, long j2) {
        int iM38547C;
        String str;
        String str2;
        if (this.f49565L0) {
            in71 in71Var = this.f49582Z0;
            if (in71Var != null) {
                ujx ujxVar = this.f49579Y;
                if (ujxVar != null) {
                    ujxVar.m83298c(in71Var);
                }
                this.f49582Z0 = null;
            }
            this.f49568O0 = j;
            boolean z = this.f49586b1;
            bqa bqaVar = this.f49596h;
            if (z && !this.f49566M0) {
                bqaVar.mo30231j(new qj51(m36177w(j, j2)));
            }
            pnl0 pnl0Var = this.f49588c1;
            if (pnl0Var != null) {
                long j3 = pnl0Var.f179433a;
                boolean z2 = pnl0Var.f179434b;
                bqaVar.mo30231j(new li51(m36171a(j3, j2)));
                mj51 mj51VarM21655s = StreamSeekRequestOuterClass$StreamSeekRequest.m21655s();
                mj51VarM21655s.m61926q(j3);
                mj51VarM21655s.m61929t(j);
                mj51VarM21655s.m61925m(m36162y(j2));
                mj51VarM21655s.m61927r(!z2);
                bqaVar.mo30231j(new kj51(mj51VarM21655s));
            }
            bqaVar.mo30231j(new li51(m36171a(j, j2)));
            yzo0 yzo0Var = this.f49584a1;
            if (yzo0Var != null) {
                Map mapM56701n0 = (Map) ((gh00) this.f49589d.f21690b).invoke(yzo0Var);
                if (!mapM56701n0.containsKey("playback_id")) {
                    mapM56701n0 = kkc0.m56701n0(mapM56701n0, new pqm0("playback_id", axf1.m27406u(yzo0Var)));
                }
                str2 = (String) mapM56701n0.get("endvideo_reason_start");
                if (str2 == null) {
                    str2 = (String) yzo0Var.f277859a.f128768d.get("endvideo_reason_start");
                }
                if (str2 == null) {
                    iM38547C = edb.m38547C(i);
                    if (iM38547C != 0) {
                        str = "trackdone";
                    } else if (iM38547C == 1) {
                        str = "endplay";
                    } else if (iM38547C != 2 || iM38547C == 3 || iM38547C == 4) {
                        str = "trackerror";
                    } else {
                        if (iM38547C != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "endplay";
                    }
                    str2 = str;
                }
            } else {
                iM38547C = edb.m38547C(i);
                if (iM38547C != 0) {
                    str = "trackdone";
                } else if (iM38547C == 1) {
                    str = "endplay";
                } else {
                    if (iM38547C != 2) {
                    }
                    str = "trackerror";
                }
                str2 = str;
            }
            ai51 ai51VarM21635q = StreamEndRequestOuterClass$StreamEndRequest.m21635q();
            ai51VarM21635q.m26063q(jcg1.m53001u(str2));
            ai51VarM21635q.m26062m(m36162y(j2));
            bqaVar.mo30231j(new yh51(ai51VarM21635q, clqVar.m33294c()));
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: R */
    public final void mo29151R(long j, long j2) {
        if (this.f49565L0) {
            String strM36161T = m36161T(this, ContextTrack.Metadata.KEY_INTERACTION_ID);
            if (strM36161T == null) {
                strM36161T = "";
            }
            this.f49575V0 = strM36161T;
            String strM36161T2 = m36161T(this, ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID);
            this.f49576W0 = strM36161T2 != null ? strM36161T2 : "";
            this.f49568O0 = j;
            this.f49596h.mo30231j(new qj51(m36177w(j, j2)));
            this.f49566M0 = true;
            m36165S(this.f49568O0, j2);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m36165S(long j, long j2) {
        if (this.f49566M0 && this.f49588c1 == null) {
            this.f49596h.mo30231j(new li51(m36171a(j, j2)));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m36166U(StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse, int i) {
        String str;
        if (statusResponseOuterClass$StatusResponse == null || statusResponseOuterClass$StatusResponse.m21631o() != c151.SUCCESS) {
            c151 c151VarM21631o = statusResponseOuterClass$StatusResponse != null ? statusResponseOuterClass$StatusResponse.m21631o() : c151.UNRECOGNIZED;
            if (i == 1) {
                str = "StreamStart";
            } else if (i == 2) {
                str = "StreamProgress";
            } else if (i != 3) {
                str = i != 4 ? "null" : "StreamEnd";
            } else {
                str = "StreamSeek";
            }
            StreamReportingException streamReportingException = new StreamReportingException(c151VarM21631o, "Error returned from StreamReportingService.".concat(str));
            zmn0 zmn0Var = this.f49592e1;
            if (zmn0Var == null || !zmn0Var.f284322b) {
                return;
            }
            ((b2p0) zmn0Var.f284323c).invoke(streamReportingException);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m36167V(ai51 ai51Var, n95 n95Var, fbk fbkVar) {
        zi51 zi51Var;
        if (fbkVar instanceof zi51) {
            zi51Var = (zi51) fbkVar;
            int i = zi51Var.f283085d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zi51Var.f283085d = i - Integer.MIN_VALUE;
            } else {
                zi51Var = new zi51(this, fbkVar);
            }
        } else {
            zi51Var = new zi51(this, fbkVar);
        }
        Object objM89557A = zi51Var.f283083b;
        int i2 = zi51Var.f283085d;
        w2a1 w2a1Var = w2a1.f247311a;
        c9k c9kVar = this.f49597i;
        di41 di41Var = this.f49598t;
        bqa bqaVar = this.f49596h;
        fbk fbkVar2 = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                if (this.f49567N0 == null) {
                    n95Var.m63912z();
                    return w2a1Var;
                }
                luk lukVar = this.f49593f;
                mt31 mt31Var = new mt31(this, ai51Var, fbkVar2, 16);
                zi51Var.f283082a = n95Var;
                zi51Var.f283085d = 1;
                objM89557A = x0h1.m89557A(lukVar, mt31Var, zi51Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n95Var = zi51Var.f283082a;
                bga.m29073P(objM89557A);
            }
            m36166U((StatusResponseOuterClass$StatusResponse) objM89557A, 4);
        } catch (CancellationException e) {
            try {
                throw e;
            } catch (Throwable th) {
                bqaVar.mo30210A(null);
                di41Var.mo26601e(null);
                kk40.m56680v(c9kVar, null);
                this.f49567N0 = null;
                this.f49566M0 = false;
                n95Var.m63912z();
                throw th;
            }
        } catch (Throwable unused) {
        }
        bqaVar.mo30210A(null);
        di41Var.mo26601e(null);
        kk40.m56680v(c9kVar, null);
        this.f49567N0 = null;
        this.f49566M0 = false;
        n95Var.m63912z();
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: W */
    public final Object m36168W(ni51 ni51Var, fbk fbkVar) {
        aj51 aj51Var;
        if (fbkVar instanceof aj51) {
            aj51Var = (aj51) fbkVar;
            int i = aj51Var.f16175c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aj51Var.f16175c = i - Integer.MIN_VALUE;
            } else {
                aj51Var = new aj51(this, fbkVar);
            }
        } else {
            aj51Var = new aj51(this, fbkVar);
        }
        Object objM89557A = aj51Var.f16173a;
        int i2 = aj51Var.f16175c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                if (this.f49567N0 != null) {
                    luk lukVar = this.f49593f;
                    mt31 mt31Var = new mt31(this, ni51Var, null, 17);
                    aj51Var.f16175c = 1;
                    objM89557A = x0h1.m89557A(lukVar, mt31Var, aj51Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
            m36166U((StatusResponseOuterClass$StatusResponse) objM89557A, 2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X */
    public final Object m36169X(mj51 mj51Var, fbk fbkVar) {
        bj51 bj51Var;
        if (fbkVar instanceof bj51) {
            bj51Var = (bj51) fbkVar;
            int i = bj51Var.f27621c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bj51Var.f27621c = i - Integer.MIN_VALUE;
            } else {
                bj51Var = new bj51(this, fbkVar);
            }
        } else {
            bj51Var = new bj51(this, fbkVar);
        }
        Object objM89557A = bj51Var.f27619a;
        int i2 = bj51Var.f27621c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                if (this.f49567N0 != null) {
                    luk lukVar = this.f49593f;
                    mt31 mt31Var = new mt31(this, mj51Var, null, 18);
                    bj51Var.f27621c = 1;
                    objM89557A = x0h1.m89557A(lukVar, mt31Var, bj51Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
            m36166U((StatusResponseOuterClass$StatusResponse) objM89557A, 3);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y */
    public final Object m36170Y(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, fbk fbkVar) {
        cj51 cj51Var;
        if (fbkVar instanceof cj51) {
            cj51Var = (cj51) fbkVar;
            int i = cj51Var.f38513c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj51Var.f38513c = i - Integer.MIN_VALUE;
            } else {
                cj51Var = new cj51(this, fbkVar);
            }
        } else {
            cj51Var = new cj51(this, fbkVar);
        }
        Object objM89557A = cj51Var.f38511a;
        int i2 = cj51Var.f38513c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                if (this.f49567N0 == null) {
                    luk lukVar = this.f49593f;
                    mt31 mt31Var = new mt31(this, streamStartRequestOuterClass$StreamStartRequest, null, 19);
                    cj51Var.f38513c = 1;
                    objM89557A = x0h1.m89557A(lukVar, mt31Var, cj51Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
            StreamStartResponseOuterClass$StreamStartResponse streamStartResponseOuterClass$StreamStartResponse = (StreamStartResponseOuterClass$StreamStartResponse) objM89557A;
            this.f49567N0 = streamStartResponseOuterClass$StreamStartResponse.m21695o();
            m36166U(streamStartResponseOuterClass$StreamStartResponse.m21694n(), 1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: a */
    public final ni51 m36171a(long j, long j2) {
        ni51 ni51VarM21649y = StreamProgressRequestOuterClass$StreamProgressRequest.m21649y();
        ni51VarM21649y.m64555q(j);
        ni51VarM21649y.m64559u(this.f49569P0);
        boolean z = this.f49578X0;
        int i = 0;
        dyd0 dyd0Var = dyd0.AUDIO;
        ni51VarM21649y.m64560v(z && this.f49574U0 != dyd0Var);
        ni51VarM21649y.m64556r(this.f49580Y0);
        ni51VarM21649y.m64557s(this.f49570Q0);
        ni51VarM21649y.m64558t(this.f49571R0);
        int i2 = this.f49594f1;
        if (this.f49578X0 && this.f49574U0 != dyd0Var) {
            i = i2;
        }
        ni51VarM21649y.m64564z(jcg1.m52980A(i != 0 ? i : 1));
        ni51VarM21649y.m64561w(this.f49572S0);
        ni51VarM21649y.m64562x(this.f49569P0 ? f4p0.PAUSED : f4p0.ACTIVE);
        ni51VarM21649y.m64554m(m36162y(j2));
        return ni51VarM21649y;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: d */
    public final void mo28577d(long j, long j2, boolean z) {
        if (this.f49565L0) {
            this.f49570Q0 = z;
            this.f49568O0 = j;
            if (z) {
                this.f49571R0 = false;
            }
            m36165S(j, j2);
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: h */
    public final void mo36172h(yzo0 yzo0Var) {
        if (this.f49565L0) {
            this.f49584a1 = yzo0Var;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: i */
    public final void mo36173i(int i, vk51 vk51Var, long j) {
        dyd0 dyd0Var;
        if (this.f49565L0) {
            this.f49573T0 = vk51Var;
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                dyd0Var = dyd0.MEDIA_TYPE_UNKNOWN;
            } else if (iM38547C == 1) {
                dyd0Var = dyd0.AUDIO;
            } else {
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dyd0Var = dyd0.VIDEO;
            }
            this.f49574U0 = dyd0Var;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: j */
    public final void mo33818j(long j, long j2) {
        if (this.f49565L0) {
            in71 in71Var = this.f49582Z0;
            if (in71Var != null) {
                ujx ujxVar = this.f49579Y;
                if (ujxVar != null) {
                    ujxVar.m83298c(in71Var);
                }
                this.f49582Z0 = null;
            }
            ujx ujxVar2 = this.f49579Y;
            this.f49582Z0 = ujxVar2 != null ? ujxVar2.m83296a(j, new po11(this, 13)) : null;
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: k */
    public final void mo27128k(boolean z, boolean z2, float f, long j) {
        this.f49570Q0 = z;
        this.f49578X0 = !z2;
        this.f49572S0 = f;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: l */
    public final void mo36174l(long j, long j2, long j3, boolean z) {
        if (this.f49565L0) {
            this.f49588c1 = null;
            this.f49568O0 = j2;
            m36165S(j, j3);
            if (this.f49566M0) {
                mj51 mj51VarM21655s = StreamSeekRequestOuterClass$StreamSeekRequest.m21655s();
                mj51VarM21655s.m61926q(j);
                mj51VarM21655s.m61929t(j2);
                mj51VarM21655s.m61925m(m36162y(j3));
                mj51VarM21655s.m61927r(!z);
                this.f49596h.mo30231j(new kj51(mj51VarM21655s));
            }
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: n */
    public final void mo28578n(long j, long j2, boolean z) {
        if (this.f49565L0) {
            this.f49578X0 = !z;
            this.f49568O0 = j;
            m36165S(j, j2);
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: p */
    public final void mo36175p(long j, long j2, long j3, boolean z) {
        if (this.f49565L0 && this.f49588c1 == null) {
            this.f49588c1 = new pnl0(j, z);
        }
    }

    @Override // p204p.gh50
    /* JADX INFO: renamed from: u */
    public final void mo36176u() {
        gh00 gh00Var;
        yzo0 yzo0Var = this.f49577X;
        if (yzo0Var == null || (gh00Var = (gh00) this.f49589d.f21691c) == null) {
            return;
        }
        gh00Var.invoke(yzo0Var);
    }

    /* JADX INFO: renamed from: w */
    public final StreamStartRequestOuterClass$StreamStartRequest m36177w(long j, long j2) {
        if (this.f49595g && !this.f49590d1) {
            List listM46715L = h6f.m46715L(new pqm0("playback_id", m36161T(this, "playback_id")), new pqm0(ContextTrack.Metadata.KEY_INTERACTION_ID, m36161T(this, ContextTrack.Metadata.KEY_INTERACTION_ID)), new pqm0(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID, m36161T(this, ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID)), new pqm0("content_uri", m36161T(this, "endvideo_track_uri")));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM46715L) {
                String str = (String) ((pqm0) obj).f180351b;
                if (str == null || str.length() == 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((pqm0) it.next()).f180350a);
            }
            if (!arrayList2.isEmpty()) {
                ydj.m93454m("Multiplayer playback started with missing or empty stream reporting fields: ", g6f.m43753y0(arrayList2, null, null, null, null, 63));
            }
        }
        this.f49590d1 = true;
        sj51 sj51VarM21679X = StreamStartRequestOuterClass$StreamStartRequest.m21679X();
        String strM36161T = m36161T(this, "playback_id");
        if (strM36161T != null) {
            sj51VarM21679X.m78288N(y85.m93077y(strM36161T));
        } else {
            sj51VarM21679X.m78301q();
        }
        sj51VarM21679X.m78289O();
        yzo0 yzo0Var = this.f49577X;
        wj50.m88279p(yzo0Var);
        sj51VarM21679X.m78298X(yzo0Var.f277862d);
        String strM36161T2 = m36161T(this, "endvideo_track_uri");
        if (strM36161T2 == null) {
            strM36161T2 = "";
        }
        sj51VarM21679X.m78307w(strM36161T2);
        String strM36161T3 = m36161T(this, "endvideo_context_uri");
        if (strM36161T3 == null) {
            strM36161T3 = "";
        }
        sj51VarM21679X.m78286L(strM36161T3);
        String strM36161T4 = m36161T(this, "endvideo_provider");
        if (strM36161T4 == null) {
            strM36161T4 = "";
        }
        sj51VarM21679X.m78293S(strM36161T4);
        String strM36161T5 = m36161T(this, "endvideo_referrer_identifier");
        if (strM36161T5 == null) {
            strM36161T5 = "";
        }
        sj51VarM21679X.m78295U(strM36161T5);
        sj51VarM21679X.m78297W(jcg1.m53003w((String) this.f49585b.f144913b.mo49283h()));
        String strM36161T6 = m36161T(this, "endvideo_device_identifier");
        if (strM36161T6 == null) {
            strM36161T6 = "";
        }
        sj51VarM21679X.m78305u(strM36161T6);
        String str2 = this.f49576W0;
        if (str2 == null) {
            str2 = "";
        }
        sj51VarM21679X.m78285K(str2);
        String str3 = this.f49575V0;
        if (str3 == null) {
            str3 = "";
        }
        sj51VarM21679X.m78276B(str3);
        sj51VarM21679X.m78294T(jcg1.m53001u(m36161T(this, "endvideo_reason_start")));
        sj51VarM21679X.m78279E(wj50.m88271j(m36161T(this, "endvideo_is_shuffling_context"), "true"));
        yzo0 yzo0Var2 = this.f49577X;
        wj50.m88279p(yzo0Var2);
        String strM36161T7 = m36161T(this, ContextTrack.Metadata.KEY_MEDIA_MANIFEST_ID);
        if (strM36161T7 == null) {
            strM36161T7 = "";
        }
        String strM93816v = yif1.m93816v(yzo0Var2.f277859a.f128765a);
        if (strM93816v != null) {
            strM36161T7 = strM93816v;
        }
        sj51VarM21679X.m78281G(strM36161T7);
        sj51VarM21679X.m78282H(this.f49574U0);
        sj51VarM21679X.m78290P(j2);
        sj51VarM21679X.m78296V(j);
        int i = 0;
        sj51VarM21679X.m78278D(this.f49573T0 == vk51.LIVE);
        sj51VarM21679X.m78306v(this.f49573T0 == vk51.OFFLINE);
        sj51VarM21679X.m78303s(wj50.m88271j(m36161T(this, "endvideo_is_client_offline"), "true"));
        String strM36161T8 = m36161T(this, "endvideo_feature_uuid");
        if (strM36161T8 == null) {
            strM36161T8 = "";
        }
        sj51VarM21679X.m78275A(strM36161T8);
        String strM36161T9 = m36161T(this, "endvideo_decision_id");
        if (strM36161T9 == null) {
            strM36161T9 = "";
        }
        sj51VarM21679X.m78309y(strM36161T9);
        String strM36161T10 = m36161T(this, "endvideo_play_context_decision_id");
        if (strM36161T10 == null) {
            strM36161T10 = "";
        }
        sj51VarM21679X.m78287M(strM36161T10);
        sj51VarM21679X.m78304t(m36162y(j2));
        sj51VarM21679X.m78277C(this.f49580Y0);
        boolean z = this.f49578X0;
        dyd0 dyd0Var = dyd0.AUDIO;
        sj51VarM21679X.m78280F(z && this.f49574U0 != dyd0Var);
        int i2 = this.f49594f1;
        if (this.f49578X0 && this.f49574U0 != dyd0Var) {
            i = i2;
        }
        sj51VarM21679X.m78299Y(jcg1.m52980A(i != 0 ? i : 1));
        String strM36161T11 = m36161T(this, "endvideo_session_id");
        sj51VarM21679X.m78291Q(strM36161T11 != null ? strM36161T11 : "");
        sj51VarM21679X.m78300m(this.f49591e);
        String strM36161T12 = m36161T(this, "preview_impression_uri");
        if (strM36161T12 != null) {
            sj51VarM21679X.m78292R(strM36161T12);
        }
        String strM36161T13 = m36161T(this, "on_demand_type");
        if (strM36161T13 != null) {
            sj51VarM21679X.m78283I(strM36161T13);
        }
        String strM36161T14 = m36161T(this, "entrypoint_uri");
        if (strM36161T14 != null) {
            sj51VarM21679X.m78310z(strM36161T14);
        }
        StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttributionM82635p = u9g1.m82635p(new hmv(1, this, dj51.class, "getMetadata", "getMetadata(Ljava/lang/String;Lcom/spotify/betamax/player/PlaybackIdentity;)Ljava/lang/String;", 0, 4));
        if (streamReportingAttributionOuterClass$StreamReportingAttributionM82635p != null) {
            sj51VarM21679X.m78302r(streamReportingAttributionOuterClass$StreamReportingAttributionM82635p);
        }
        sj51VarM21679X.m78284J(pvl0.ORCHESTRATION_STACK_MULTIPLAYER);
        return (StreamStartRequestOuterClass$StreamStartRequest) sj51VarM21679X.build();
    }
}
