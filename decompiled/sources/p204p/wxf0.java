package p204p;

import com.spotify.automix.proto.PreviewOuterClass$Preview;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsResume$ResumeRequest;
import com.spotify.player.esperanto.proto.EsSignalRequest$SignalRequest;
import com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest;
import com.spotify.player.esperanto.proto.EsStop$StopRequest;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes9.dex */
public final class wxf0 implements nxf0 {

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f256025c = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final xre f256026a;

    /* JADX INFO: renamed from: b */
    public final sr6 f256027b;

    public wxf0(xre xreVar, sr6 sr6Var) {
        this.f256026a = xreVar;
        this.f256027b = sr6Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m89234b(int i) {
        if (f256025c.get() != i) {
            throw new oxf0("Preview command superseded by a newer play or stop command");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m89235c() {
        f256025c.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0128  */
    /* JADX WARN: Code duplicated, block: B:37:0x017e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0183  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m89236d(b791 b791Var, String str, String str2, String str3, ibk ibkVar) {
        qxf0 qxf0Var;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams;
        b791 b791Var2;
        String str4;
        String str5;
        int i;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams2;
        String str6;
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams3;
        String str7;
        o9r0 o9r0VarM3748z;
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState2;
        Object objM79082p0;
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState3;
        if (ibkVar instanceof qxf0) {
            qxf0Var = (qxf0) ibkVar;
            int i2 = qxf0Var.f193673i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qxf0Var.f193673i = i2 - Integer.MIN_VALUE;
            } else {
                qxf0Var = new qxf0(this, ibkVar);
            }
        } else {
            qxf0Var = new qxf0(this, ibkVar);
        }
        Object obj = qxf0Var.f193671g;
        int i3 = qxf0Var.f193673i;
        sr6 sr6Var = this.f256027b;
        Object obj2 = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj);
            int iIncrementAndGet = f256025c.incrementAndGet();
            ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
            if (str != null) {
                ilwVarM17768t.m51043m(str);
            }
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            ilwVarM17768t.m51044q(xgg1.m90662N1("PLAYLIST_OVERLAP_EDIT_PAGE", "playlist/overlap-edit-page", 1417, "playlist").f36166c);
            umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
            ((wy3) this.f256026a).getClass();
            umwVarM17777q.m83492m(System.currentTimeMillis());
            ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
            esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
            evi eviVarM79023B = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
            b791Var2 = b791Var;
            qxf0Var.f193665a = b791Var2;
            str4 = str2;
            qxf0Var.f193666b = str4;
            str5 = str3;
            qxf0Var.f193667c = str5;
            qxf0Var.f193668d = esLoggingParams$LoggingParams;
            qxf0Var.f193670f = iIncrementAndGet;
            qxf0Var.f193673i = 1;
            Object objM86755t = vyf1.m86755t(eviVarM79023B, qxf0Var);
            if (objM86755t != obj2) {
                obj = objM86755t;
                i = iIncrementAndGet;
            }
            return obj2;
        }
        if (i3 == 1) {
            i = qxf0Var.f193670f;
            esLoggingParams$LoggingParams = qxf0Var.f193668d;
            String str8 = qxf0Var.f193667c;
            String str9 = qxf0Var.f193666b;
            b791 b791Var3 = qxf0Var.f193665a;
            bga.m29073P(obj);
            str4 = str9;
            b791Var2 = b791Var3;
            str5 = str8;
        } else {
            if (i3 == 2) {
                i = qxf0Var.f193670f;
                esContextPlayerState$ContextPlayerState = qxf0Var.f193669e;
                esLoggingParams$LoggingParams2 = qxf0Var.f193668d;
                String str10 = qxf0Var.f193667c;
                String str11 = qxf0Var.f193666b;
                b791 b791Var4 = qxf0Var.f193665a;
                bga.m29073P(obj);
                str5 = str10;
                str6 = str11;
                b791Var2 = b791Var4;
                m89234b(i);
                wj50.m88279p(esLoggingParams$LoggingParams2);
                qxf0Var.f193665a = b791Var2;
                qxf0Var.f193666b = str6;
                qxf0Var.f193667c = str5;
                qxf0Var.f193668d = esLoggingParams$LoggingParams2;
                qxf0Var.f193669e = esContextPlayerState$ContextPlayerState;
                qxf0Var.f193670f = i;
                qxf0Var.f193673i = 3;
                if (m89237e(esLoggingParams$LoggingParams2, i, qxf0Var) != obj2) {
                    esLoggingParams$LoggingParams3 = esLoggingParams$LoggingParams2;
                    str7 = str5;
                    m89234b(i);
                    wj50.m88279p(esLoggingParams$LoggingParams3);
                    qxf0Var.f193665a = null;
                    qxf0Var.f193666b = null;
                    qxf0Var.f193667c = null;
                    qxf0Var.f193668d = null;
                    qxf0Var.f193669e = esContextPlayerState$ContextPlayerState;
                    qxf0Var.f193670f = i;
                    qxf0Var.f193673i = 4;
                    tow towVarM17992q = EsSignalRequest$SignalRequest.m17992q();
                    towVarM17992q.m81225r("automix-preview");
                    qx8 qx8Var = sx8.f214837e;
                    rzl0 rzl0Var = b791Var2.f24196b;
                    double d = rzl0Var.f204169P0;
                    double d2 = rzl0Var.f204170Q0;
                    o9r0VarM3748z = PreviewOuterClass$Preview.m3748z();
                    o9r0VarM3748z.m66488q();
                    o9r0VarM3748z.m66495x();
                    o9r0VarM3748z.m66494w();
                    rzl0 rzl0Var2 = b791Var2.f24196b;
                    esContextPlayerState$ContextPlayerState2 = esContextPlayerState$ContextPlayerState;
                    o9r0VarM3748z.m66496y(rzl0Var2.f204174a);
                    o9r0VarM3748z.m66497z(rzl0Var2.f204175b);
                    o9r0VarM3748z.m66492u(rzl0Var2.f204176c);
                    o9r0VarM3748z.m66493v(rzl0Var2.f204177d);
                    o9r0VarM3748z.m66486A(srz.m79140Q(b791Var2));
                    if (str6 != null) {
                        o9r0VarM3748z.m66489r(str6);
                    }
                    if (str7 != null) {
                        o9r0VarM3748z.m66487m(str7);
                    }
                    o9r0VarM3748z.m66490s(d);
                    o9r0VarM3748z.m66491t(d2);
                    towVarM17992q.m81224q(sx8.m79587c(qx8Var, ((PreviewOuterClass$Preview) o9r0VarM3748z.build()).toByteArray()));
                    towVarM17992q.m81223m(esLoggingParams$LoggingParams3);
                    objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q.build(), qxf0Var);
                    if (objM79082p0 != obj2) {
                        objM79082p0 = w2a1.f247311a;
                    }
                    if (objM79082p0 != obj2) {
                        esContextPlayerState$ContextPlayerState3 = esContextPlayerState$ContextPlayerState2;
                    }
                }
                return obj2;
            }
            if (i3 == 3) {
                i = qxf0Var.f193670f;
                esContextPlayerState$ContextPlayerState = qxf0Var.f193669e;
                esLoggingParams$LoggingParams3 = qxf0Var.f193668d;
                str7 = qxf0Var.f193667c;
                str6 = qxf0Var.f193666b;
                b791Var2 = qxf0Var.f193665a;
                bga.m29073P(obj);
                m89234b(i);
                wj50.m88279p(esLoggingParams$LoggingParams3);
                qxf0Var.f193665a = null;
                qxf0Var.f193666b = null;
                qxf0Var.f193667c = null;
                qxf0Var.f193668d = null;
                qxf0Var.f193669e = esContextPlayerState$ContextPlayerState;
                qxf0Var.f193670f = i;
                qxf0Var.f193673i = 4;
                tow towVarM17992q2 = EsSignalRequest$SignalRequest.m17992q();
                towVarM17992q2.m81225r("automix-preview");
                qx8 qx8Var2 = sx8.f214837e;
                rzl0 rzl0Var3 = b791Var2.f24196b;
                double d3 = rzl0Var3.f204169P0;
                double d4 = rzl0Var3.f204170Q0;
                o9r0VarM3748z = PreviewOuterClass$Preview.m3748z();
                o9r0VarM3748z.m66488q();
                o9r0VarM3748z.m66495x();
                o9r0VarM3748z.m66494w();
                rzl0 rzl0Var4 = b791Var2.f24196b;
                esContextPlayerState$ContextPlayerState2 = esContextPlayerState$ContextPlayerState;
                o9r0VarM3748z.m66496y(rzl0Var4.f204174a);
                o9r0VarM3748z.m66497z(rzl0Var4.f204175b);
                o9r0VarM3748z.m66492u(rzl0Var4.f204176c);
                o9r0VarM3748z.m66493v(rzl0Var4.f204177d);
                o9r0VarM3748z.m66486A(srz.m79140Q(b791Var2));
                if (str6 != null) {
                    o9r0VarM3748z.m66489r(str6);
                }
                if (str7 != null) {
                    o9r0VarM3748z.m66487m(str7);
                }
                o9r0VarM3748z.m66490s(d3);
                o9r0VarM3748z.m66491t(d4);
                towVarM17992q2.m81224q(sx8.m79587c(qx8Var2, ((PreviewOuterClass$Preview) o9r0VarM3748z.build()).toByteArray()));
                towVarM17992q2.m81223m(esLoggingParams$LoggingParams3);
                objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q2.build(), qxf0Var);
                if (objM79082p0 != obj2) {
                    objM79082p0 = w2a1.f247311a;
                }
                if (objM79082p0 != obj2) {
                    esContextPlayerState$ContextPlayerState3 = esContextPlayerState$ContextPlayerState2;
                }
                return obj2;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            esContextPlayerState$ContextPlayerState3 = qxf0Var.f193669e;
            bga.m29073P(obj);
        }
        return Boolean.valueOf(srz.m79156n(esContextPlayerState$ContextPlayerState3));
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState4 = (EsContextPlayerState$ContextPlayerState) obj;
        m89234b(i);
        Integer num = new Integer(i);
        qxf0Var.f193665a = b791Var2;
        qxf0Var.f193666b = str4;
        qxf0Var.f193667c = str5;
        qxf0Var.f193668d = esLoggingParams$LoggingParams;
        qxf0Var.f193669e = esContextPlayerState$ContextPlayerState4;
        qxf0Var.f193670f = i;
        qxf0Var.f193673i = 2;
        if (m89243k(false, num, qxf0Var) != obj2) {
            esLoggingParams$LoggingParams2 = esLoggingParams$LoggingParams;
            str6 = str4;
            esContextPlayerState$ContextPlayerState = esContextPlayerState$ContextPlayerState4;
            m89234b(i);
            wj50.m88279p(esLoggingParams$LoggingParams2);
            qxf0Var.f193665a = b791Var2;
            qxf0Var.f193666b = str6;
            qxf0Var.f193667c = str5;
            qxf0Var.f193668d = esLoggingParams$LoggingParams2;
            qxf0Var.f193669e = esContextPlayerState$ContextPlayerState;
            qxf0Var.f193670f = i;
            qxf0Var.f193673i = 3;
            if (m89237e(esLoggingParams$LoggingParams2, i, qxf0Var) != obj2) {
                esLoggingParams$LoggingParams3 = esLoggingParams$LoggingParams2;
                str7 = str5;
                m89234b(i);
                wj50.m88279p(esLoggingParams$LoggingParams3);
                qxf0Var.f193665a = null;
                qxf0Var.f193666b = null;
                qxf0Var.f193667c = null;
                qxf0Var.f193668d = null;
                qxf0Var.f193669e = esContextPlayerState$ContextPlayerState;
                qxf0Var.f193670f = i;
                qxf0Var.f193673i = 4;
                tow towVarM17992q3 = EsSignalRequest$SignalRequest.m17992q();
                towVarM17992q3.m81225r("automix-preview");
                qx8 qx8Var3 = sx8.f214837e;
                rzl0 rzl0Var5 = b791Var2.f24196b;
                double d5 = rzl0Var5.f204169P0;
                double d6 = rzl0Var5.f204170Q0;
                o9r0VarM3748z = PreviewOuterClass$Preview.m3748z();
                o9r0VarM3748z.m66488q();
                o9r0VarM3748z.m66495x();
                o9r0VarM3748z.m66494w();
                rzl0 rzl0Var6 = b791Var2.f24196b;
                esContextPlayerState$ContextPlayerState2 = esContextPlayerState$ContextPlayerState;
                o9r0VarM3748z.m66496y(rzl0Var6.f204174a);
                o9r0VarM3748z.m66497z(rzl0Var6.f204175b);
                o9r0VarM3748z.m66492u(rzl0Var6.f204176c);
                o9r0VarM3748z.m66493v(rzl0Var6.f204177d);
                o9r0VarM3748z.m66486A(srz.m79140Q(b791Var2));
                if (str6 != null) {
                    o9r0VarM3748z.m66489r(str6);
                }
                if (str7 != null) {
                    o9r0VarM3748z.m66487m(str7);
                }
                o9r0VarM3748z.m66490s(d5);
                o9r0VarM3748z.m66491t(d6);
                towVarM17992q3.m81224q(sx8.m79587c(qx8Var3, ((PreviewOuterClass$Preview) o9r0VarM3748z.build()).toByteArray()));
                towVarM17992q3.m81223m(esLoggingParams$LoggingParams3);
                objM79082p0 = sr6Var.m79082p0((EsSignalRequest$SignalRequest) towVarM17992q3.build(), qxf0Var);
                if (objM79082p0 != obj2) {
                    objM79082p0 = w2a1.f247311a;
                }
                if (objM79082p0 != obj2) {
                    esContextPlayerState$ContextPlayerState3 = esContextPlayerState$ContextPlayerState2;
                    return Boolean.valueOf(srz.m79156n(esContextPlayerState$ContextPlayerState3));
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m89237e(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, int i, ibk ibkVar) {
        rxf0 rxf0Var;
        if (ibkVar instanceof rxf0) {
            rxf0Var = (rxf0) ibkVar;
            int i2 = rxf0Var.f203590e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rxf0Var.f203590e = i2 - Integer.MIN_VALUE;
            } else {
                rxf0Var = new rxf0(this, ibkVar);
            }
        } else {
            rxf0Var = new rxf0(this, ibkVar);
        }
        Object objM86755t = rxf0Var.f203588c;
        int i3 = rxf0Var.f203590e;
        w2a1 w2a1Var = w2a1.f247311a;
        sr6 sr6Var = this.f256027b;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM86755t);
            evi eviVarM79023B = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
            rxf0Var.f203586a = esLoggingParams$LoggingParams;
            rxf0Var.f203587b = i;
            rxf0Var.f203590e = 1;
            objM86755t = vyf1.m86755t(eviVarM79023B, rxf0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return w2a1Var;
        }
        i = rxf0Var.f203587b;
        esLoggingParams$LoggingParams = rxf0Var.f203586a;
        bga.m29073P(objM86755t);
        m89234b(i);
        String strM17731s = ((EsContextPlayerState$ContextPlayerState) objM86755t).m17731s();
        if (strM17731s == null || wl51.m88460J0(strM17731s)) {
            ymw ymwVarM17793q = EsPlay$PlayRequest.m17793q();
            ymwVarM17793q.m94206m(esLoggingParams$LoggingParams);
            mnw mnwVarM17826q = EsPreparePlay$PreparePlayRequest.m17826q();
            hjw hjwVarM17675t = EsContext$Context.m17675t();
            hjwVarM17675t.m47727t("spotify:mixing:preview");
            hjwVarM17675t.m47728u("spotify:mixing:preview");
            mnwVarM17826q.m62368m((EsContext$Context) hjwVarM17675t.build());
            onw onwVarM17830E = EsPreparePlayOptions$PreparePlayOptions.m17830E();
            onwVarM17830E.m67435u(false);
            mnwVarM17826q.m62369q((EsPreparePlayOptions$PreparePlayOptions) onwVarM17830E.build());
            ymwVarM17793q.m94208r((EsPreparePlay$PreparePlayRequest) mnwVarM17826q.build());
            EsPlay$PlayRequest esPlay$PlayRequest = (EsPlay$PlayRequest) ymwVarM17793q.build();
            wj50.m88279p(esPlay$PlayRequest);
            rxf0Var.f203586a = null;
            rxf0Var.f203587b = i;
            rxf0Var.f203590e = 2;
            if (sr6Var.m79042R(esPlay$PlayRequest, rxf0Var) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: f */
    public final Object m89238f(uxf0 uxf0Var) {
        how howVarM17953q = EsResume$ResumeRequest.m17953q();
        wmw wmwVarM17784o = EsPauseresumeOrigin$PauseResumeOrigin.m17784o();
        wmwVarM17784o.m88569m("Mixing");
        howVarM17953q.m48107r((EsPauseresumeOrigin$PauseResumeOrigin) wmwVarM17784o.build());
        xiw xiwVarM17668r = EsCommandOptions$CommandOptions.m17668r();
        xiwVarM17668r.m91163s(false);
        howVarM17953q.m48106q((EsCommandOptions$CommandOptions) xiwVarM17668r.build());
        Object objM79062f0 = this.f256027b.m79062f0((EsResume$ResumeRequest) howVarM17953q.build(), uxf0Var);
        return objM79062f0 == yuk.f276404a ? objM79062f0 : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final vjz m89239g() {
        return new vjz(gyf1.m46146l(mvl0.m62953p(new rbe(this.f256027b.m79023B(EsGetStateRequest$GetStateRequest.m17761p()), 1)), 200L), new bm70(3, 18, (fbk) null), 7);
    }

    /* JADX INFO: renamed from: h */
    public final Object m89240h(ibk ibkVar) {
        Object objM89241i = m89241i(ibkVar);
        return objM89241i == yuk.f276404a ? objM89241i : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m89241i(ibk ibkVar) {
        txf0 txf0Var;
        if (ibkVar instanceof txf0) {
            txf0Var = (txf0) ibkVar;
            int i = txf0Var.f224697c;
            if ((i & Integer.MIN_VALUE) != 0) {
                txf0Var.f224697c = i - Integer.MIN_VALUE;
            } else {
                txf0Var = new txf0(this, ibkVar);
            }
        } else {
            txf0Var = new txf0(this, ibkVar);
        }
        Object objM89243k = txf0Var.f224695a;
        int i2 = txf0Var.f224697c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89243k);
                Integer num = new Integer(f256025c.incrementAndGet());
                txf0Var.f224697c = 1;
                objM89243k = m89243k(false, num, txf0Var);
                Object obj = yuk.f276404a;
                if (objM89243k == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89243k);
            }
            pxf0 pxf0Var = (pxf0) objM89243k;
            Boolean boolValueOf = Boolean.valueOf(pxf0Var.f182297a);
            if (pxf0Var.f182298b) {
                return null;
            }
            return boolValueOf;
        } catch (oxf0 unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (m89238f(r0) == r4) goto L28;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89242j(boolean z, ibk ibkVar) {
        uxf0 uxf0Var;
        int iIncrementAndGet;
        Object objM89243k;
        if (ibkVar instanceof uxf0) {
            uxf0Var = (uxf0) ibkVar;
            int i = uxf0Var.f234918e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxf0Var.f234918e = i - Integer.MIN_VALUE;
            } else {
                uxf0Var = new uxf0(this, ibkVar);
            }
        } else {
            uxf0Var = new uxf0(this, ibkVar);
        }
        Object obj = uxf0Var.f234916c;
        int i2 = uxf0Var.f234918e;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                iIncrementAndGet = f256025c.incrementAndGet();
                Integer num = new Integer(iIncrementAndGet);
                uxf0Var.f234914a = z;
                uxf0Var.f234915b = iIncrementAndGet;
                uxf0Var.f234918e = 1;
                objM89243k = m89243k(z, num, uxf0Var);
                if (objM89243k == obj2) {
                }
                return obj2;
            }
            if (i2 == 1) {
                int i3 = uxf0Var.f234915b;
                boolean z2 = uxf0Var.f234914a;
                bga.m29073P(obj);
                iIncrementAndGet = i3;
                z = z2;
                objM89243k = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
            if (!((pxf0) objM89243k).f182299c && z) {
                m89234b(iIncrementAndGet);
                uxf0Var.f234914a = z;
                uxf0Var.f234915b = iIncrementAndGet;
                uxf0Var.f234918e = 2;
            }
        } catch (oxf0 unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public final Object m89243k(boolean z, Integer num, ibk ibkVar) {
        vxf0 vxf0Var;
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams;
        Integer num2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (ibkVar instanceof vxf0) {
            vxf0Var = (vxf0) ibkVar;
            int i = vxf0Var.f245735g;
            if ((i & Integer.MIN_VALUE) != 0) {
                vxf0Var.f245735g = i - Integer.MIN_VALUE;
            } else {
                vxf0Var = new vxf0(this, ibkVar);
            }
        } else {
            vxf0Var = new vxf0(this, ibkVar);
        }
        Object objM86755t = vxf0Var.f245733e;
        int i2 = vxf0Var.f245735g;
        sr6 sr6Var = this.f256027b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            ilw ilwVarM17768t = EsLoggingParams$LoggingParams.m17768t();
            umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
            ((wy3) this.f256026a).getClass();
            umwVarM17777q.m83492m(System.currentTimeMillis());
            ilwVarM17768t.m51046s((EsOptional$OptionalInt64) umwVarM17777q.build());
            esLoggingParams$LoggingParams = (EsLoggingParams$LoggingParams) ilwVarM17768t.build();
            evi eviVarM79023B = sr6Var.m79023B(EsGetStateRequest$GetStateRequest.m17761p());
            num2 = num;
            vxf0Var.f245731c = num2;
            vxf0Var.f245732d = esLoggingParams$LoggingParams;
            z2 = z;
            vxf0Var.f245729a = z2;
            vxf0Var.f245735g = 1;
            objM86755t = vyf1.m86755t(eviVarM79023B, vxf0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z5 = vxf0Var.f245730b;
                bga.m29073P(objM86755t);
                return new pxf0(z5, true, true);
            }
            if (i2 == 3) {
                z4 = vxf0Var.f245730b;
                bga.m29073P(objM86755t);
                return new pxf0(z4, true, false);
            }
            if (i2 == 4) {
                z3 = vxf0Var.f245730b;
                bga.m29073P(objM86755t);
                return new pxf0(z3, false, false);
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = vxf0Var.f245730b;
            bga.m29073P(objM86755t);
            return new pxf0(z3, false, false);
        }
        boolean z6 = vxf0Var.f245729a;
        esLoggingParams$LoggingParams = vxf0Var.f245732d;
        Integer num3 = vxf0Var.f245731c;
        bga.m29073P(objM86755t);
        z2 = z6;
        num2 = num3;
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState = (EsContextPlayerState$ContextPlayerState) objM86755t;
        if (num2 != null) {
            m89234b(num2.intValue());
        }
        boolean zM79156n = srz.m79156n(esContextPlayerState$ContextPlayerState);
        if (srz.m79150h(esContextPlayerState$ContextPlayerState)) {
            if (esContextPlayerState$ContextPlayerState.getSignalsList().contains("stop-automix-preview")) {
                tow towVarM17992q = EsSignalRequest$SignalRequest.m17992q();
                towVarM17992q.m81225r("stop-automix-preview");
                towVarM17992q.m81224q(z2 ? "true" : "false");
                towVarM17992q.m81223m(esLoggingParams$LoggingParams);
                EsSignalRequest$SignalRequest esSignalRequest$SignalRequest = (EsSignalRequest$SignalRequest) towVarM17992q.build();
                vxf0Var.f245731c = null;
                vxf0Var.f245732d = null;
                vxf0Var.f245729a = z2;
                vxf0Var.f245730b = zM79156n;
                vxf0Var.f245735g = 2;
                if (sr6Var.m79082p0(esSignalRequest$SignalRequest, vxf0Var) != yukVar) {
                    z5 = zM79156n;
                    return new pxf0(z5, true, true);
                }
            } else {
                EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequestM17996q = EsSkipNext$SkipNextRequest.m17996q();
                vxf0Var.f245731c = null;
                vxf0Var.f245732d = null;
                vxf0Var.f245729a = z2;
                vxf0Var.f245730b = zM79156n;
                vxf0Var.f245735g = 3;
                if (sr6Var.m79084q0(esSkipNext$SkipNextRequestM17996q, vxf0Var) != yukVar) {
                    z4 = zM79156n;
                    return new pxf0(z4, true, false);
                }
            }
        } else if (esContextPlayerState$ContextPlayerState.m17726Y()) {
            vmw vmwVarM17782q = EsPause$PauseRequest.m17782q();
            wmw wmwVarM17784o = EsPauseresumeOrigin$PauseResumeOrigin.m17784o();
            wmwVarM17784o.m88569m("Mixing");
            vmwVarM17782q.m86023r((EsPauseresumeOrigin$PauseResumeOrigin) wmwVarM17784o.build());
            xiw xiwVarM17668r = EsCommandOptions$CommandOptions.m17668r();
            xiwVarM17668r.m91163s(false);
            vmwVarM17782q.m86022q((EsCommandOptions$CommandOptions) xiwVarM17668r.build());
            EsPause$PauseRequest esPause$PauseRequest = (EsPause$PauseRequest) vmwVarM17782q.build();
            vxf0Var.f245731c = null;
            vxf0Var.f245732d = null;
            vxf0Var.f245729a = z2;
            vxf0Var.f245730b = zM79156n;
            vxf0Var.f245735g = 5;
            objM86755t = sr6Var.m79041Q(esPause$PauseRequest, vxf0Var);
            if (objM86755t != yukVar) {
                z3 = zM79156n;
                return new pxf0(z3, false, false);
            }
        } else {
            EsStop$StopRequest esStop$StopRequestM18021o = EsStop$StopRequest.m18021o();
            vxf0Var.f245731c = null;
            vxf0Var.f245732d = null;
            vxf0Var.f245729a = z2;
            vxf0Var.f245730b = zM79156n;
            vxf0Var.f245735g = 4;
            objM86755t = sr6Var.m79092u0(esStop$StopRequestM18021o, vxf0Var);
            if (objM86755t != yukVar) {
                z3 = zM79156n;
                return new pxf0(z3, false, false);
            }
        }
        return yukVar;
    }
}
