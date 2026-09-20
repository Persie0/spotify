package p204p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class m0b {

    /* JADX INFO: renamed from: a */
    public final er70 f138612a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f138613b;

    /* JADX INFO: renamed from: c */
    public final er70 f138614c;

    /* JADX INFO: renamed from: d */
    public final er70 f138615d;

    /* JADX INFO: renamed from: e */
    public final er70 f138616e;

    /* JADX INFO: renamed from: f */
    public final rvw0 f138617f;

    /* JADX INFO: renamed from: g */
    public final q8l0 f138618g;

    /* JADX INFO: renamed from: h */
    public final zuv f138619h;

    /* JADX INFO: renamed from: i */
    public Disposable f138620i;

    /* JADX INFO: renamed from: j */
    public final e0b f138621j;

    public m0b(er70 er70Var, i4t0 i4t0Var, er70 er70Var2, er70 er70Var3, er70 er70Var4, rvw0 rvw0Var, q8l0 q8l0Var, bs11 bs11Var, zuv zuvVar, ewk0 ewk0Var, mjp0 mjp0Var, String str, q040 q040Var, nbm0 nbm0Var, qwx0 qwx0Var, hc80 hc80Var, xre xreVar) {
        this.f138612a = er70Var;
        this.f138613b = i4t0Var;
        this.f138614c = er70Var2;
        this.f138615d = er70Var3;
        this.f138616e = er70Var4;
        this.f138617f = rvw0Var;
        this.f138618g = q8l0Var;
        this.f138619h = zuvVar;
        this.f138621j = new e0b(i4t0Var, ewk0Var, nbm0Var, qwx0Var, xreVar, mjp0Var, str, q040Var, bs11Var, hc80Var);
        hc80Var.getLifecycle().mo31986a(new g0b(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m60453a(ibk ibkVar) {
        h0b h0bVar;
        if (ibkVar instanceof h0b) {
            h0bVar = (h0b) ibkVar;
            int i = h0bVar.f86197c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0bVar.f86197c = i - Integer.MIN_VALUE;
            } else {
                h0bVar = new h0b(this, ibkVar);
            }
        } else {
            h0bVar = new h0b(this, ibkVar);
        }
        Object objM96567o = h0bVar.f86195a;
        int i2 = h0bVar.f86197c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleMo48412a = ((p8p0) this.f138614c.get()).mo48412a(h8p0.m46835c(((PlayOrigin) this.f138613b.get()).featureIdentifier(), false));
            h0bVar.f86197c = 1;
            objM96567o = zn91.m96567o(singleMo48412a, h0bVar);
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
        return objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0230  */
    /* JADX WARN: Code duplicated, block: B:103:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x0247 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:108:0x0248  */
    /* JADX WARN: Code duplicated, block: B:110:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x026f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x020a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x020e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x021b  */
    /* JADX WARN: Code duplicated, block: B:99:0x021f  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0269, code lost:
    
        if (r1 == r14) goto L112;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x009a, please report this as an issue */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m60454b(n0b n0bVar, ibk ibkVar) {
        i0b i0bVar;
        n0b n0bVar2;
        String strM63335c;
        Object objM86757v;
        n0b n0bVar3;
        o8l0 o8l0Var;
        e0b e0bVar;
        n0b n0bVar4;
        String strM63335c2;
        PreparePlayOptions.Builder builderSuppressions;
        Long lM63338f;
        kbm0 kbm0Var;
        String str;
        d850 d850VarM63336d;
        String str2;
        Object q8kVar;
        z650 z650Var;
        long jLongValue;
        String strM63339g;
        d850 d850VarM63336d2;
        String str3;
        z650 z650Var2;
        String strM63339g2;
        d850 d850VarM63336d3;
        z650 z650Var3;
        Object objM60455c;
        m0b m0bVar;
        if (ibkVar instanceof i0b) {
            i0bVar = (i0b) ibkVar;
            int i = i0bVar.f97197f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0bVar.f97197f = i - Integer.MIN_VALUE;
            } else {
                i0bVar = new i0b(this, ibkVar);
            }
        } else {
            i0bVar = new i0b(this, ibkVar);
        }
        i0b i0bVar2 = i0bVar;
        Object objM60457e = i0bVar2.f97195d;
        int i2 = i0bVar2.f97197f;
        yuk yukVar = yuk.f276404a;
        switch (i2) {
            case 0:
                bga.m29073P(objM60457e);
                Disposable disposable = this.f138620i;
                if (disposable != null) {
                    disposable.dispose();
                }
                this.f138620i = null;
                i0bVar2.f97197f = 1;
                objM60457e = m60457e(n0bVar, i0bVar2);
                if (objM60457e != yukVar) {
                    n0bVar2 = (n0b) objM60457e;
                    strM63335c = n0bVar2.m63335c();
                    fiz fizVarM72336a = this.f138618g.m72336a(strM63335c);
                    i0bVar2.f97192a = n0bVar2;
                    i0bVar2.f97193b = strM63335c;
                    i0bVar2.f97197f = 2;
                    objM86757v = vyf1.m86757v(fizVarM72336a, i0bVar2);
                    if (objM86757v != yukVar) {
                        n0bVar3 = n0bVar2;
                        objM60457e = objM86757v;
                        o8l0Var = (o8l0) objM60457e;
                        e0bVar = this.f138621j;
                        if (o8l0Var != null) {
                            if (!(o8l0Var instanceof n8l0)) {
                                o8l0Var = null;
                            }
                            if (o8l0Var != null) {
                                e0bVar.getClass();
                                strM63335c2 = n0bVar3.m63335c();
                                e0bVar.f54921b.getClass();
                                if (ewk0.m40146b(strM63335c2)) {
                                    d850VarM63336d2 = n0bVar3.m63336d();
                                    if (d850VarM63336d2 != null || (z650Var2 = d850VarM63336d2.f46380a) == null) {
                                        str3 = null;
                                    } else {
                                        str3 = z650Var2.f279709a;
                                    }
                                    q8kVar = new f4b(str3 != null ? str3 : "");
                                } else {
                                    PlayCommand.Builder builderContext = PlayCommand.Builder.builder().context(Context.fromUri(n0bVar3.m63335c()).toBuilder().metadata(c95.m31821M(pft0.m69840u(Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false"))).build());
                                    builderSuppressions = PreparePlayOptions.Builder.builder().alwaysPlaySomething(true).suppressions(Collections.singleton(Suppressions.Providers.MFT));
                                    if (e0b.m37485c(n0bVar3, e0bVar.f54930k)) {
                                        strM63339g = n0bVar3.m63339g();
                                        if (strM63339g == null) {
                                            strM63339g = "";
                                        }
                                        builderSuppressions.skipTo(SkipToTrack.fromUri(strM63339g));
                                    }
                                    lM63338f = n0bVar3.m63338f();
                                    if (lM63338f != null) {
                                        jLongValue = lM63338f.longValue();
                                        if (jLongValue > 0) {
                                            builderSuppressions.seekTo(Long.valueOf(jLongValue));
                                        }
                                    }
                                    builderContext.options(builderSuppressions.build());
                                    builderContext.playOrigin((PlayOrigin) e0bVar.f54920a.get());
                                    LoggingParams.Builder builder = LoggingParams.builder();
                                    ((wy3) e0bVar.f54924e).getClass();
                                    LoggingParams.Builder builderCommandInitiatedTime = builder.commandInitiatedTime(Long.valueOf(System.currentTimeMillis()));
                                    kbm0Var = e0bVar.f54922c.get();
                                    if (kbm0Var != null) {
                                        str = kbm0Var.f121231a;
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        str = "";
                                    }
                                    LoggingParams.Builder builderPageInstanceId = builderCommandInitiatedTime.pageInstanceId(str);
                                    d850VarM63336d = n0bVar3.m63336d();
                                    if (d850VarM63336d != null || (z650Var = d850VarM63336d.f46380a) == null) {
                                        str2 = null;
                                    } else {
                                        str2 = z650Var.f279709a;
                                    }
                                    builderContext.loggingParams(builderPageInstanceId.interactionId(str2 != null ? str2 : "").commandId("on-demand-new-releases-play").build());
                                    q8kVar = new q8k(builderContext.build());
                                }
                                Objects.toString(q8kVar);
                                if (!(q8kVar instanceof nu80)) {
                                    wt80 wt80Var = (wt80) this.f138615d.get();
                                    nu80 nu80Var = (nu80) q8kVar;
                                    EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b = nu80Var.m65681b();
                                    EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c = nu80Var.m65682c();
                                    EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d = nu80Var.m65683d();
                                    st80 st80VarM65680a = nu80Var.m65680a();
                                    i0bVar2.f97192a = null;
                                    i0bVar2.f97193b = null;
                                    i0bVar2.f97194c = this;
                                    i0bVar2.f97197f = 4;
                                    objM60457e = wt80.m88912b(wt80Var, strM63335c, st80VarM65680a, esPreparePlayOptions$PreparePlayOptionsM65683d, esPlayOrigin$PlayOriginM65682c, null, null, esLoggingParams$LoggingParamsM65681b, null, i0bVar2, 176);
                                    if (objM60457e != yukVar) {
                                        m0bVar = this;
                                        m0bVar.getClass();
                                        rlv0 rlv0Var = new rlv0();
                                        rlv0Var.f200373a = lcf.m58691f();
                                        ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var, 4), new C2113m3(rlv0Var, 5));
                                        return (lcf) rlv0Var.f200373a;
                                    }
                                } else if (q8kVar instanceof q8k) {
                                    strM63339g2 = n0bVar3.m63339g();
                                    if (strM63339g2 != null) {
                                        if (strM63339g2.length() <= 0) {
                                            strM63339g2 = null;
                                        }
                                        if (strM63339g2 != null) {
                                            strM63335c = strM63339g2;
                                        }
                                    }
                                    boolean zM63341i = n0bVar3.m63341i();
                                    PlayCommand playCommandM72335a = ((q8k) q8kVar).m72335a();
                                    d850VarM63336d3 = n0bVar3.m63336d();
                                    if (d850VarM63336d3 != null) {
                                        z650Var3 = d850VarM63336d3.f46380a;
                                    } else {
                                        z650Var3 = null;
                                    }
                                    i0bVar2.f97192a = null;
                                    i0bVar2.f97193b = null;
                                    i0bVar2.f97197f = 5;
                                    objM60455c = m60455c(strM63335c, zM63341i, playCommandM72335a, z650Var3, i0bVar2);
                                    if (objM60455c != yukVar) {
                                        return objM60455c;
                                    }
                                } else {
                                    if (!(q8kVar instanceof f4b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Single singleM79413e = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                                    i0bVar2.f97192a = null;
                                    i0bVar2.f97193b = null;
                                    i0bVar2.f97197f = 6;
                                    objM60457e = zn91.m96567o(singleM79413e, i0bVar2);
                                }
                            }
                        }
                        i0bVar2.f97192a = n0bVar3;
                        i0bVar2.f97193b = strM63335c;
                        i0bVar2.f97197f = 3;
                        objM60457e = e0bVar.m37486a(n0bVar3, i0bVar2);
                        if (objM60457e != yukVar) {
                            n0bVar4 = n0bVar3;
                            q8kVar = (f0b) objM60457e;
                            n0bVar3 = n0bVar4;
                            Objects.toString(q8kVar);
                            if (!(q8kVar instanceof nu80)) {
                                wt80 wt80Var2 = (wt80) this.f138615d.get();
                                nu80 nu80Var2 = (nu80) q8kVar;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b2 = nu80Var2.m65681b();
                                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c2 = nu80Var2.m65682c();
                                EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d2 = nu80Var2.m65683d();
                                st80 st80VarM65680a2 = nu80Var2.m65680a();
                                i0bVar2.f97192a = null;
                                i0bVar2.f97193b = null;
                                i0bVar2.f97194c = this;
                                i0bVar2.f97197f = 4;
                                objM60457e = wt80.m88912b(wt80Var2, strM63335c, st80VarM65680a2, esPreparePlayOptions$PreparePlayOptionsM65683d2, esPlayOrigin$PlayOriginM65682c2, null, null, esLoggingParams$LoggingParamsM65681b2, null, i0bVar2, 176);
                                if (objM60457e != yukVar) {
                                    m0bVar = this;
                                    m0bVar.getClass();
                                    rlv0 rlv0Var2 = new rlv0();
                                    rlv0Var2.f200373a = lcf.m58691f();
                                    ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var2, 4), new C2113m3(rlv0Var2, 5));
                                    return (lcf) rlv0Var2.f200373a;
                                }
                            } else if (q8kVar instanceof q8k) {
                                strM63339g2 = n0bVar3.m63339g();
                                if (strM63339g2 != null) {
                                    if (strM63339g2.length() <= 0) {
                                        strM63339g2 = null;
                                    }
                                    if (strM63339g2 != null) {
                                        strM63335c = strM63339g2;
                                    }
                                }
                                boolean zM63341i2 = n0bVar3.m63341i();
                                PlayCommand playCommandM72335a2 = ((q8k) q8kVar).m72335a();
                                d850VarM63336d3 = n0bVar3.m63336d();
                                if (d850VarM63336d3 != null) {
                                    z650Var3 = d850VarM63336d3.f46380a;
                                } else {
                                    z650Var3 = null;
                                }
                                i0bVar2.f97192a = null;
                                i0bVar2.f97193b = null;
                                i0bVar2.f97197f = 5;
                                objM60455c = m60455c(strM63335c, zM63341i2, playCommandM72335a2, z650Var3, i0bVar2);
                                if (objM60455c != yukVar) {
                                    return objM60455c;
                                }
                            } else {
                                if (!(q8kVar instanceof f4b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Single singleM79413e2 = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                                i0bVar2.f97192a = null;
                                i0bVar2.f97193b = null;
                                i0bVar2.f97197f = 6;
                                objM60457e = zn91.m96567o(singleM79413e2, i0bVar2);
                            }
                        }
                    }
                    break;
                }
                return yukVar;
            case 1:
                bga.m29073P(objM60457e);
                n0bVar2 = (n0b) objM60457e;
                strM63335c = n0bVar2.m63335c();
                fiz fizVarM72336a2 = this.f138618g.m72336a(strM63335c);
                i0bVar2.f97192a = n0bVar2;
                i0bVar2.f97193b = strM63335c;
                i0bVar2.f97197f = 2;
                objM86757v = vyf1.m86757v(fizVarM72336a2, i0bVar2);
                if (objM86757v != yukVar) {
                    n0bVar3 = n0bVar2;
                    objM60457e = objM86757v;
                    o8l0Var = (o8l0) objM60457e;
                    e0bVar = this.f138621j;
                    if (o8l0Var != null) {
                        if (!(o8l0Var instanceof n8l0)) {
                            o8l0Var = null;
                        }
                        if (o8l0Var != null) {
                            e0bVar.getClass();
                            strM63335c2 = n0bVar3.m63335c();
                            e0bVar.f54921b.getClass();
                            if (ewk0.m40146b(strM63335c2)) {
                                d850VarM63336d2 = n0bVar3.m63336d();
                                if (d850VarM63336d2 != null) {
                                    str3 = null;
                                } else {
                                    str3 = null;
                                }
                                q8kVar = new f4b(str3 != null ? str3 : "");
                            } else {
                                PlayCommand.Builder builderContext2 = PlayCommand.Builder.builder().context(Context.fromUri(n0bVar3.m63335c()).toBuilder().metadata(c95.m31821M(pft0.m69840u(Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false"))).build());
                                builderSuppressions = PreparePlayOptions.Builder.builder().alwaysPlaySomething(true).suppressions(Collections.singleton(Suppressions.Providers.MFT));
                                if (e0b.m37485c(n0bVar3, e0bVar.f54930k)) {
                                    strM63339g = n0bVar3.m63339g();
                                    if (strM63339g == null) {
                                        strM63339g = "";
                                    }
                                    builderSuppressions.skipTo(SkipToTrack.fromUri(strM63339g));
                                }
                                lM63338f = n0bVar3.m63338f();
                                if (lM63338f != null) {
                                    jLongValue = lM63338f.longValue();
                                    if (jLongValue > 0) {
                                        builderSuppressions.seekTo(Long.valueOf(jLongValue));
                                    }
                                }
                                builderContext2.options(builderSuppressions.build());
                                builderContext2.playOrigin((PlayOrigin) e0bVar.f54920a.get());
                                LoggingParams.Builder builder2 = LoggingParams.builder();
                                ((wy3) e0bVar.f54924e).getClass();
                                LoggingParams.Builder builderCommandInitiatedTime2 = builder2.commandInitiatedTime(Long.valueOf(System.currentTimeMillis()));
                                kbm0Var = e0bVar.f54922c.get();
                                if (kbm0Var != null) {
                                    str = kbm0Var.f121231a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                LoggingParams.Builder builderPageInstanceId2 = builderCommandInitiatedTime2.pageInstanceId(str);
                                d850VarM63336d = n0bVar3.m63336d();
                                if (d850VarM63336d != null) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                }
                                builderContext2.loggingParams(builderPageInstanceId2.interactionId(str2 != null ? str2 : "").commandId("on-demand-new-releases-play").build());
                                q8kVar = new q8k(builderContext2.build());
                            }
                            Objects.toString(q8kVar);
                            if (!(q8kVar instanceof nu80)) {
                                wt80 wt80Var3 = (wt80) this.f138615d.get();
                                nu80 nu80Var3 = (nu80) q8kVar;
                                EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b3 = nu80Var3.m65681b();
                                EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c3 = nu80Var3.m65682c();
                                EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d3 = nu80Var3.m65683d();
                                st80 st80VarM65680a3 = nu80Var3.m65680a();
                                i0bVar2.f97192a = null;
                                i0bVar2.f97193b = null;
                                i0bVar2.f97194c = this;
                                i0bVar2.f97197f = 4;
                                objM60457e = wt80.m88912b(wt80Var3, strM63335c, st80VarM65680a3, esPreparePlayOptions$PreparePlayOptionsM65683d3, esPlayOrigin$PlayOriginM65682c3, null, null, esLoggingParams$LoggingParamsM65681b3, null, i0bVar2, 176);
                                if (objM60457e != yukVar) {
                                    m0bVar = this;
                                    m0bVar.getClass();
                                    rlv0 rlv0Var3 = new rlv0();
                                    rlv0Var3.f200373a = lcf.m58691f();
                                    ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var3, 4), new C2113m3(rlv0Var3, 5));
                                    return (lcf) rlv0Var3.f200373a;
                                }
                            } else if (q8kVar instanceof q8k) {
                                strM63339g2 = n0bVar3.m63339g();
                                if (strM63339g2 != null) {
                                    if (strM63339g2.length() <= 0) {
                                        strM63339g2 = null;
                                    }
                                    if (strM63339g2 != null) {
                                        strM63335c = strM63339g2;
                                    }
                                }
                                boolean zM63341i3 = n0bVar3.m63341i();
                                PlayCommand playCommandM72335a3 = ((q8k) q8kVar).m72335a();
                                d850VarM63336d3 = n0bVar3.m63336d();
                                if (d850VarM63336d3 != null) {
                                    z650Var3 = d850VarM63336d3.f46380a;
                                } else {
                                    z650Var3 = null;
                                }
                                i0bVar2.f97192a = null;
                                i0bVar2.f97193b = null;
                                i0bVar2.f97197f = 5;
                                objM60455c = m60455c(strM63335c, zM63341i3, playCommandM72335a3, z650Var3, i0bVar2);
                                if (objM60455c != yukVar) {
                                    return objM60455c;
                                }
                            } else {
                                if (!(q8kVar instanceof f4b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Single singleM79413e3 = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                                i0bVar2.f97192a = null;
                                i0bVar2.f97193b = null;
                                i0bVar2.f97197f = 6;
                                objM60457e = zn91.m96567o(singleM79413e3, i0bVar2);
                            }
                        }
                    }
                    i0bVar2.f97192a = n0bVar3;
                    i0bVar2.f97193b = strM63335c;
                    i0bVar2.f97197f = 3;
                    objM60457e = e0bVar.m37486a(n0bVar3, i0bVar2);
                    if (objM60457e != yukVar) {
                        n0bVar4 = n0bVar3;
                        q8kVar = (f0b) objM60457e;
                        n0bVar3 = n0bVar4;
                        Objects.toString(q8kVar);
                        if (!(q8kVar instanceof nu80)) {
                            wt80 wt80Var4 = (wt80) this.f138615d.get();
                            nu80 nu80Var4 = (nu80) q8kVar;
                            EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b4 = nu80Var4.m65681b();
                            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c4 = nu80Var4.m65682c();
                            EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d4 = nu80Var4.m65683d();
                            st80 st80VarM65680a4 = nu80Var4.m65680a();
                            i0bVar2.f97192a = null;
                            i0bVar2.f97193b = null;
                            i0bVar2.f97194c = this;
                            i0bVar2.f97197f = 4;
                            objM60457e = wt80.m88912b(wt80Var4, strM63335c, st80VarM65680a4, esPreparePlayOptions$PreparePlayOptionsM65683d4, esPlayOrigin$PlayOriginM65682c4, null, null, esLoggingParams$LoggingParamsM65681b4, null, i0bVar2, 176);
                            if (objM60457e != yukVar) {
                                m0bVar = this;
                                m0bVar.getClass();
                                rlv0 rlv0Var4 = new rlv0();
                                rlv0Var4.f200373a = lcf.m58691f();
                                ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var4, 4), new C2113m3(rlv0Var4, 5));
                                return (lcf) rlv0Var4.f200373a;
                            }
                        } else if (q8kVar instanceof q8k) {
                            strM63339g2 = n0bVar3.m63339g();
                            if (strM63339g2 != null) {
                                if (strM63339g2.length() <= 0) {
                                    strM63339g2 = null;
                                }
                                if (strM63339g2 != null) {
                                    strM63335c = strM63339g2;
                                }
                            }
                            boolean zM63341i4 = n0bVar3.m63341i();
                            PlayCommand playCommandM72335a4 = ((q8k) q8kVar).m72335a();
                            d850VarM63336d3 = n0bVar3.m63336d();
                            if (d850VarM63336d3 != null) {
                                z650Var3 = d850VarM63336d3.f46380a;
                            } else {
                                z650Var3 = null;
                            }
                            i0bVar2.f97192a = null;
                            i0bVar2.f97193b = null;
                            i0bVar2.f97197f = 5;
                            objM60455c = m60455c(strM63335c, zM63341i4, playCommandM72335a4, z650Var3, i0bVar2);
                            if (objM60455c != yukVar) {
                                return objM60455c;
                            }
                        } else {
                            if (!(q8kVar instanceof f4b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Single singleM79413e4 = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                            i0bVar2.f97192a = null;
                            i0bVar2.f97193b = null;
                            i0bVar2.f97197f = 6;
                            objM60457e = zn91.m96567o(singleM79413e4, i0bVar2);
                        }
                    }
                    break;
                }
                return yukVar;
            case 2:
                strM63335c = i0bVar2.f97193b;
                n0bVar3 = i0bVar2.f97192a;
                bga.m29073P(objM60457e);
                o8l0Var = (o8l0) objM60457e;
                e0bVar = this.f138621j;
                if (o8l0Var != null) {
                    if (!(o8l0Var instanceof n8l0)) {
                        o8l0Var = null;
                    }
                    if (o8l0Var != null) {
                        e0bVar.getClass();
                        strM63335c2 = n0bVar3.m63335c();
                        e0bVar.f54921b.getClass();
                        if (ewk0.m40146b(strM63335c2)) {
                            d850VarM63336d2 = n0bVar3.m63336d();
                            if (d850VarM63336d2 != null) {
                                str3 = null;
                            } else {
                                str3 = null;
                            }
                            q8kVar = new f4b(str3 != null ? str3 : "");
                        } else {
                            PlayCommand.Builder builderContext3 = PlayCommand.Builder.builder().context(Context.fromUri(n0bVar3.m63335c()).toBuilder().metadata(c95.m31821M(pft0.m69840u(Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false"))).build());
                            builderSuppressions = PreparePlayOptions.Builder.builder().alwaysPlaySomething(true).suppressions(Collections.singleton(Suppressions.Providers.MFT));
                            if (e0b.m37485c(n0bVar3, e0bVar.f54930k)) {
                                strM63339g = n0bVar3.m63339g();
                                if (strM63339g == null) {
                                    strM63339g = "";
                                }
                                builderSuppressions.skipTo(SkipToTrack.fromUri(strM63339g));
                            }
                            lM63338f = n0bVar3.m63338f();
                            if (lM63338f != null) {
                                jLongValue = lM63338f.longValue();
                                if (jLongValue > 0) {
                                    builderSuppressions.seekTo(Long.valueOf(jLongValue));
                                }
                            }
                            builderContext3.options(builderSuppressions.build());
                            builderContext3.playOrigin((PlayOrigin) e0bVar.f54920a.get());
                            LoggingParams.Builder builder3 = LoggingParams.builder();
                            ((wy3) e0bVar.f54924e).getClass();
                            LoggingParams.Builder builderCommandInitiatedTime3 = builder3.commandInitiatedTime(Long.valueOf(System.currentTimeMillis()));
                            kbm0Var = e0bVar.f54922c.get();
                            if (kbm0Var != null) {
                                str = kbm0Var.f121231a;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            LoggingParams.Builder builderPageInstanceId3 = builderCommandInitiatedTime3.pageInstanceId(str);
                            d850VarM63336d = n0bVar3.m63336d();
                            if (d850VarM63336d != null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            builderContext3.loggingParams(builderPageInstanceId3.interactionId(str2 != null ? str2 : "").commandId("on-demand-new-releases-play").build());
                            q8kVar = new q8k(builderContext3.build());
                        }
                        Objects.toString(q8kVar);
                        if (!(q8kVar instanceof nu80)) {
                            wt80 wt80Var5 = (wt80) this.f138615d.get();
                            nu80 nu80Var5 = (nu80) q8kVar;
                            EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b5 = nu80Var5.m65681b();
                            EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c5 = nu80Var5.m65682c();
                            EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d5 = nu80Var5.m65683d();
                            st80 st80VarM65680a5 = nu80Var5.m65680a();
                            i0bVar2.f97192a = null;
                            i0bVar2.f97193b = null;
                            i0bVar2.f97194c = this;
                            i0bVar2.f97197f = 4;
                            objM60457e = wt80.m88912b(wt80Var5, strM63335c, st80VarM65680a5, esPreparePlayOptions$PreparePlayOptionsM65683d5, esPlayOrigin$PlayOriginM65682c5, null, null, esLoggingParams$LoggingParamsM65681b5, null, i0bVar2, 176);
                            if (objM60457e != yukVar) {
                                m0bVar = this;
                                m0bVar.getClass();
                                rlv0 rlv0Var5 = new rlv0();
                                rlv0Var5.f200373a = lcf.m58691f();
                                ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var5, 4), new C2113m3(rlv0Var5, 5));
                                return (lcf) rlv0Var5.f200373a;
                            }
                        } else if (q8kVar instanceof q8k) {
                            strM63339g2 = n0bVar3.m63339g();
                            if (strM63339g2 != null) {
                                if (strM63339g2.length() <= 0) {
                                    strM63339g2 = null;
                                }
                                if (strM63339g2 != null) {
                                    strM63335c = strM63339g2;
                                }
                            }
                            boolean zM63341i5 = n0bVar3.m63341i();
                            PlayCommand playCommandM72335a5 = ((q8k) q8kVar).m72335a();
                            d850VarM63336d3 = n0bVar3.m63336d();
                            if (d850VarM63336d3 != null) {
                                z650Var3 = d850VarM63336d3.f46380a;
                            } else {
                                z650Var3 = null;
                            }
                            i0bVar2.f97192a = null;
                            i0bVar2.f97193b = null;
                            i0bVar2.f97197f = 5;
                            objM60455c = m60455c(strM63335c, zM63341i5, playCommandM72335a5, z650Var3, i0bVar2);
                            if (objM60455c != yukVar) {
                                return objM60455c;
                            }
                        } else {
                            if (!(q8kVar instanceof f4b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Single singleM79413e5 = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                            i0bVar2.f97192a = null;
                            i0bVar2.f97193b = null;
                            i0bVar2.f97197f = 6;
                            objM60457e = zn91.m96567o(singleM79413e5, i0bVar2);
                        }
                        break;
                    }
                    return yukVar;
                }
                i0bVar2.f97192a = n0bVar3;
                i0bVar2.f97193b = strM63335c;
                i0bVar2.f97197f = 3;
                objM60457e = e0bVar.m37486a(n0bVar3, i0bVar2);
                if (objM60457e != yukVar) {
                    n0bVar4 = n0bVar3;
                    q8kVar = (f0b) objM60457e;
                    n0bVar3 = n0bVar4;
                    Objects.toString(q8kVar);
                    if (!(q8kVar instanceof nu80)) {
                        wt80 wt80Var6 = (wt80) this.f138615d.get();
                        nu80 nu80Var6 = (nu80) q8kVar;
                        EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b6 = nu80Var6.m65681b();
                        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c6 = nu80Var6.m65682c();
                        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d6 = nu80Var6.m65683d();
                        st80 st80VarM65680a6 = nu80Var6.m65680a();
                        i0bVar2.f97192a = null;
                        i0bVar2.f97193b = null;
                        i0bVar2.f97194c = this;
                        i0bVar2.f97197f = 4;
                        objM60457e = wt80.m88912b(wt80Var6, strM63335c, st80VarM65680a6, esPreparePlayOptions$PreparePlayOptionsM65683d6, esPlayOrigin$PlayOriginM65682c6, null, null, esLoggingParams$LoggingParamsM65681b6, null, i0bVar2, 176);
                        if (objM60457e != yukVar) {
                            m0bVar = this;
                            m0bVar.getClass();
                            rlv0 rlv0Var6 = new rlv0();
                            rlv0Var6.f200373a = lcf.m58691f();
                            ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var6, 4), new C2113m3(rlv0Var6, 5));
                            return (lcf) rlv0Var6.f200373a;
                        }
                    } else if (q8kVar instanceof q8k) {
                        strM63339g2 = n0bVar3.m63339g();
                        if (strM63339g2 != null) {
                            if (strM63339g2.length() <= 0) {
                                strM63339g2 = null;
                            }
                            if (strM63339g2 != null) {
                                strM63335c = strM63339g2;
                            }
                        }
                        boolean zM63341i6 = n0bVar3.m63341i();
                        PlayCommand playCommandM72335a6 = ((q8k) q8kVar).m72335a();
                        d850VarM63336d3 = n0bVar3.m63336d();
                        if (d850VarM63336d3 != null) {
                            z650Var3 = d850VarM63336d3.f46380a;
                        } else {
                            z650Var3 = null;
                        }
                        i0bVar2.f97192a = null;
                        i0bVar2.f97193b = null;
                        i0bVar2.f97197f = 5;
                        objM60455c = m60455c(strM63335c, zM63341i6, playCommandM72335a6, z650Var3, i0bVar2);
                        if (objM60455c != yukVar) {
                            return objM60455c;
                        }
                    } else {
                        if (!(q8kVar instanceof f4b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Single singleM79413e6 = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                        i0bVar2.f97192a = null;
                        i0bVar2.f97193b = null;
                        i0bVar2.f97197f = 6;
                        objM60457e = zn91.m96567o(singleM79413e6, i0bVar2);
                    }
                    break;
                }
                return yukVar;
            case 3:
                strM63335c = i0bVar2.f97193b;
                n0bVar4 = i0bVar2.f97192a;
                bga.m29073P(objM60457e);
                q8kVar = (f0b) objM60457e;
                n0bVar3 = n0bVar4;
                Objects.toString(q8kVar);
                if (!(q8kVar instanceof nu80)) {
                    if (q8kVar instanceof q8k) {
                        strM63339g2 = n0bVar3.m63339g();
                        if (strM63339g2 != null) {
                            if (strM63339g2.length() <= 0) {
                                strM63339g2 = null;
                            }
                            if (strM63339g2 != null) {
                                strM63335c = strM63339g2;
                            }
                        }
                        boolean zM63341i7 = n0bVar3.m63341i();
                        PlayCommand playCommandM72335a7 = ((q8k) q8kVar).m72335a();
                        d850VarM63336d3 = n0bVar3.m63336d();
                        if (d850VarM63336d3 != null) {
                            z650Var3 = d850VarM63336d3.f46380a;
                        } else {
                            z650Var3 = null;
                        }
                        i0bVar2.f97192a = null;
                        i0bVar2.f97193b = null;
                        i0bVar2.f97197f = 5;
                        objM60455c = m60455c(strM63335c, zM63341i7, playCommandM72335a7, z650Var3, i0bVar2);
                        if (objM60455c != yukVar) {
                            return objM60455c;
                        }
                    } else {
                        if (!(q8kVar instanceof f4b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Single singleM79413e7 = ((suo0) this.f138616e.get()).m79413e(((f4b) q8kVar).m40724a());
                        i0bVar2.f97192a = null;
                        i0bVar2.f97193b = null;
                        i0bVar2.f97197f = 6;
                        objM60457e = zn91.m96567o(singleM79413e7, i0bVar2);
                    }
                    break;
                } else {
                    wt80 wt80Var7 = (wt80) this.f138615d.get();
                    nu80 nu80Var7 = (nu80) q8kVar;
                    EsLoggingParams$LoggingParams esLoggingParams$LoggingParamsM65681b7 = nu80Var7.m65681b();
                    EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOriginM65682c7 = nu80Var7.m65682c();
                    EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM65683d7 = nu80Var7.m65683d();
                    st80 st80VarM65680a7 = nu80Var7.m65680a();
                    i0bVar2.f97192a = null;
                    i0bVar2.f97193b = null;
                    i0bVar2.f97194c = this;
                    i0bVar2.f97197f = 4;
                    objM60457e = wt80.m88912b(wt80Var7, strM63335c, st80VarM65680a7, esPreparePlayOptions$PreparePlayOptionsM65683d7, esPlayOrigin$PlayOriginM65682c7, null, null, esLoggingParams$LoggingParamsM65681b7, null, i0bVar2, 176);
                    if (objM60457e != yukVar) {
                        m0bVar = this;
                        m0bVar.getClass();
                        rlv0 rlv0Var7 = new rlv0();
                        rlv0Var7.f200373a = lcf.m58691f();
                        ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var7, 4), new C2113m3(rlv0Var7, 5));
                        return (lcf) rlv0Var7.f200373a;
                    }
                }
                return yukVar;
            case 4:
                m0bVar = i0bVar2.f97194c;
                bga.m29073P(objM60457e);
                m0bVar.getClass();
                rlv0 rlv0Var8 = new rlv0();
                rlv0Var8.f200373a = lcf.m58691f();
                ((p2x0) objM60457e).m68969b(new C2113m3(rlv0Var8, 4), new C2113m3(rlv0Var8, 5));
                return (lcf) rlv0Var8.f200373a;
            case 5:
                bga.m29073P(objM60457e);
                return objM60457e;
            case 6:
                bga.m29073P(objM60457e);
                return (lcf) objM60457e;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m60455c(String str, boolean z, PlayCommand playCommand, z650 z650Var, ibk ibkVar) {
        j0b j0bVar;
        if (ibkVar instanceof j0b) {
            j0bVar = (j0b) ibkVar;
            int i = j0bVar.f107408f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0bVar.f107408f = i - Integer.MIN_VALUE;
            } else {
                j0bVar = new j0b(this, ibkVar);
            }
        } else {
            j0bVar = new j0b(this, ibkVar);
        }
        Object obj = j0bVar.f107406d;
        int i2 = j0bVar.f107408f;
        rvw0 rvw0Var = this.f138617f;
        if (i2 == 0) {
            bga.m29073P(obj);
            yuk yukVar = yuk.f276404a;
            if (z) {
                j0bVar.f107403a = str;
                j0bVar.f107404b = playCommand;
                j0bVar.f107405c = z650Var;
                j0bVar.f107408f = 2;
                Object objM76493f = rvw0Var.m76493f(str, j0bVar);
                if (objM76493f != yukVar) {
                    obj = objM76493f;
                }
            } else {
                Single singleM83821a = ((uqw) this.f138612a.get()).m83821a(playCommand);
                j0bVar.f107403a = null;
                j0bVar.f107404b = null;
                j0bVar.f107405c = null;
                j0bVar.f107408f = 1;
                Object objM96567o = zn91.m96567o(singleM83821a, j0bVar);
                if (objM96567o != yukVar) {
                    return objM96567o;
                }
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
            return obj;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z650Var = j0bVar.f107405c;
        playCommand = j0bVar.f107404b;
        str = j0bVar.f107403a;
        bga.m29073P(obj);
        eob1 eob1Var = (eob1) obj;
        if (wj50.m88271j(eob1Var, dob1.f51007c)) {
            this.f138620i = rvw0Var.m76500p(playCommand, str, z650Var);
            return lcf.m58691f();
        }
        if (wj50.m88271j(eob1Var, dob1.f51005a) || wj50.m88271j(eob1Var, dob1.f51006b)) {
            return lcf.m58690b("");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m60456d(ibk ibkVar) {
        k0b k0bVar;
        if (ibkVar instanceof k0b) {
            k0bVar = (k0b) ibkVar;
            int i = k0bVar.f117953c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k0bVar.f117953c = i - Integer.MIN_VALUE;
            } else {
                k0bVar = new k0b(this, ibkVar);
            }
        } else {
            k0bVar = new k0b(this, ibkVar);
        }
        Object objM96567o = k0bVar.f117951a;
        int i2 = k0bVar.f117953c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleMo48412a = ((p8p0) this.f138614c.get()).mo48412a(h8p0.m46837e(((PlayOrigin) this.f138613b.get()).featureIdentifier(), false));
            k0bVar.f117953c = 1;
            objM96567o = zn91.m96567o(singleMo48412a, k0bVar);
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
        return objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m60457e(n0b n0bVar, ibk ibkVar) {
        l0b l0bVar;
        mgz0 mgz0VarM76461b;
        String strM63334b;
        String strM63339g;
        if (ibkVar instanceof l0b) {
            l0bVar = (l0b) ibkVar;
            int i = l0bVar.f128354d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l0bVar.f128354d = i - Integer.MIN_VALUE;
            } else {
                l0bVar = new l0b(this, ibkVar);
            }
        } else {
            l0bVar = new l0b(this, ibkVar);
        }
        Object objM97078a = l0bVar.f128352b;
        int i2 = l0bVar.f128354d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM97078a);
                zuv zuvVar = this.f138619h;
                if (zuvVar == null || (strM63334b = n0bVar.m63334b()) == null || (strM63339g = n0bVar.m63339g()) == null || n0bVar.m63338f() != null) {
                    return n0bVar;
                }
                l0bVar.f128351a = n0bVar;
                l0bVar.f128354d = 1;
                objM97078a = zuvVar.m97078a(strM63339g, strM63334b, l0bVar);
                yuk yukVar = yuk.f276404a;
                if (objM97078a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n0bVar = l0bVar.f128351a;
                bga.m29073P(objM97078a);
            }
            mgz0VarM76461b = ((ruv) objM97078a).m76461b();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            mgz0VarM76461b = null;
        }
        return mgz0VarM76461b != null ? n0b.m63333a(n0bVar, null, qyg1.m74181K(mgz0VarM76461b.m61734c()), 191) : n0bVar;
    }
}
