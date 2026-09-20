package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes6.dex */
public final class yuc1 implements l950 {

    /* JADX INFO: renamed from: o */
    public static final long f276308o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f276309p = 0;

    /* JADX INFO: renamed from: a */
    public final x610 f276310a;

    /* JADX INFO: renamed from: b */
    public final x0s f276311b;

    /* JADX INFO: renamed from: c */
    public final oyp0 f276312c;

    /* JADX INFO: renamed from: d */
    public final Flowable f276313d;

    /* JADX INFO: renamed from: e */
    public final voi f276314e;

    /* JADX INFO: renamed from: f */
    public final l3v f276315f;

    /* JADX INFO: renamed from: g */
    public final whp f276316g;

    /* JADX INFO: renamed from: h */
    public final lqi0 f276317h;

    /* JADX INFO: renamed from: i */
    public final sy31 f276318i;

    /* JADX INFO: renamed from: j */
    public final xuk f276319j;

    /* JADX INFO: renamed from: k */
    public di41 f276320k;

    /* JADX INFO: renamed from: l */
    public final yab f276321l;

    /* JADX INFO: renamed from: m */
    public final nnc f276322m;

    /* JADX INFO: renamed from: n */
    public final qp20 f276323n;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f276308o = jwg1.m54449D(5, ils.SECONDS);
    }

    public yuc1(x610 x610Var, x0s x0sVar, oyp0 oyp0Var, Flowable flowable, voi voiVar, l3v l3vVar, whp whpVar, lqi0 lqi0Var, sy31 sy31Var, c9k c9kVar) {
        this.f276310a = x610Var;
        this.f276311b = x0sVar;
        this.f276312c = oyp0Var;
        this.f276313d = flowable;
        this.f276314e = voiVar;
        this.f276315f = l3vVar;
        this.f276316g = whpVar;
        this.f276317h = lqi0Var;
        this.f276318i = sy31Var;
        this.f276319j = c9kVar;
        xc30 xc30Var = (xc30) sy31Var;
        this.f276321l = k0e1.m54985d(xc30Var.f260064a.f247730k);
        this.f276322m = xtm0.m92074U(mvl0.m62953p(k0e1.m54985d(xc30Var.f260064a.f247730k)), new C2102lt((fbk) null, xc30Var, 13));
        this.f276323n = new qp20(((xc30) sy31Var).f260077n, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r7.m94653i(r0) == r6) goto L26;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m94650f(yuc1 yuc1Var, ibk ibkVar) {
        tuc1 tuc1Var;
        if (ibkVar instanceof tuc1) {
            tuc1Var = (tuc1) ibkVar;
            int i = tuc1Var.f223829c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tuc1Var.f223829c = i - Integer.MIN_VALUE;
            } else {
                tuc1Var = new tuc1(yuc1Var, ibkVar);
            }
        } else {
            tuc1Var = new tuc1(yuc1Var, ibkVar);
        }
        Object obj = tuc1Var.f223827a;
        int i2 = tuc1Var.f223829c;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            x610 x610Var = yuc1Var.f276310a;
            tuc1Var.f223829c = 1;
            if (x610.m90058t(x610Var, null, null, tuc1Var, 3) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else if (i2 == 2) {
            bga.m29073P(obj);
            tuc1Var.f223829c = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        ((zv41) yuc1Var.f276317h).m97091m(null, rb50.f197474a);
        sy31 sy31Var = yuc1Var.f276318i;
        tuc1Var.f223829c = 2;
        if (((xc30) sy31Var).m90345e(tuc1Var) != obj2) {
            tuc1Var.f223829c = 3;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (r12.m68557z((java.lang.String) r13, r3, r4, r5, r0, p204p.m921.f141201c, r8) == r9) goto L53;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m94651g(yuc1 yuc1Var, ibk ibkVar) {
        uuc1 uuc1Var;
        String strSessionId;
        String strM93278o;
        String str;
        String str2;
        sy31 sy31Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (ibkVar instanceof uuc1) {
            uuc1Var = (uuc1) ibkVar;
            int i = uuc1Var.f234157g;
            if ((i & Integer.MIN_VALUE) != 0) {
                uuc1Var.f234157g = i - Integer.MIN_VALUE;
            } else {
                uuc1Var = new uuc1(yuc1Var, ibkVar);
            }
        } else {
            uuc1Var = new uuc1(yuc1Var, ibkVar);
        }
        uuc1 uuc1Var2 = uuc1Var;
        Object objM56346i = uuc1Var2.f234155e;
        int i2 = uuc1Var2.f234157g;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56346i);
            Flowable flowable = yuc1Var.f276313d;
            uuc1Var2.f234157g = 1;
            objM56346i = kgg1.m56346i(flowable, 1, uuc1Var2);
            if (objM56346i != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM56346i);
        } else {
            if (i2 == 2) {
                str2 = uuc1Var2.f234154d;
                str = uuc1Var2.f234153c;
                strM93278o = uuc1Var2.f234152b;
                strSessionId = uuc1Var2.f234151a;
                bga.m29073P(objM56346i);
                ((zv41) yuc1Var.f276317h).m97091m(null, rb50.f197474a);
                sy31Var = yuc1Var.f276318i;
                uuc1Var2.f234151a = strSessionId;
                uuc1Var2.f234152b = strM93278o;
                uuc1Var2.f234153c = str;
                uuc1Var2.f234154d = str2;
                uuc1Var2.f234157g = 3;
                if (((xc30) sy31Var).m90345e(uuc1Var2) != yukVar) {
                    str3 = str;
                    str4 = strM93278o;
                    str5 = strSessionId;
                    uuc1Var2.f234151a = str5;
                    uuc1Var2.f234152b = str4;
                    uuc1Var2.f234153c = str3;
                    uuc1Var2.f234154d = str2;
                    uuc1Var2.f234157g = 4;
                    objM56346i = kk40.m56684z(new oj71(yuc1Var, fbkVar, 26), uuc1Var2);
                    if (objM56346i != yukVar) {
                        String str8 = str5;
                        str6 = str3;
                        str7 = str8;
                        oyp0 oyp0Var = yuc1Var.f276312c;
                        wj50.m88279p(str7);
                        uuc1Var2.f234151a = null;
                        uuc1Var2.f234152b = null;
                        uuc1Var2.f234153c = null;
                        uuc1Var2.f234154d = null;
                        uuc1Var2.f234157g = 5;
                    }
                }
                return yukVar;
            }
            if (i2 == 3) {
                str2 = uuc1Var2.f234154d;
                str3 = uuc1Var2.f234153c;
                str4 = uuc1Var2.f234152b;
                str5 = uuc1Var2.f234151a;
                bga.m29073P(objM56346i);
                uuc1Var2.f234151a = str5;
                uuc1Var2.f234152b = str4;
                uuc1Var2.f234153c = str3;
                uuc1Var2.f234154d = str2;
                uuc1Var2.f234157g = 4;
                objM56346i = kk40.m56684z(new oj71(yuc1Var, fbkVar, 26), uuc1Var2);
                if (objM56346i != yukVar) {
                    String str9 = str5;
                    str6 = str3;
                    str7 = str9;
                    oyp0 oyp0Var2 = yuc1Var.f276312c;
                    wj50.m88279p(str7);
                    uuc1Var2.f234151a = null;
                    uuc1Var2.f234152b = null;
                    uuc1Var2.f234153c = null;
                    uuc1Var2.f234154d = null;
                    uuc1Var2.f234157g = 5;
                }
                return yukVar;
            }
            if (i2 == 4) {
                str2 = uuc1Var2.f234154d;
                String str10 = uuc1Var2.f234153c;
                String str11 = uuc1Var2.f234152b;
                String str12 = uuc1Var2.f234151a;
                bga.m29073P(objM56346i);
                str4 = str11;
                str7 = str12;
                str6 = str10;
                oyp0 oyp0Var3 = yuc1Var.f276312c;
                wj50.m88279p(str7);
                uuc1Var2.f234151a = null;
                uuc1Var2.f234152b = null;
                uuc1Var2.f234153c = null;
                uuc1Var2.f234154d = null;
                uuc1Var2.f234157g = 5;
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56346i);
            }
        }
        return w2a1.f247311a;
        PlayerState playerState = (PlayerState) objM56346i;
        strSessionId = playerState.sessionId();
        strM93278o = ybg1.m93278o(yuc1Var.f276314e);
        ContextTrack contextTrackM93279p = ybg1.m93279p(playerState);
        String str13 = contextTrackM93279p != null ? (String) contextTrackM93279p.metadata().get("segment") : null;
        if (str13 == null) {
            str13 = "";
        }
        ContextTrack contextTrackM93279p2 = ybg1.m93279p(playerState);
        String strUri = contextTrackM93279p2 != null ? contextTrackM93279p2.uri() : null;
        if (strUri == null) {
            strUri = "";
        }
        x0s x0sVar = yuc1Var.f276311b;
        uuc1Var2.f234151a = strSessionId;
        uuc1Var2.f234152b = strM93278o;
        uuc1Var2.f234153c = str13;
        uuc1Var2.f234154d = strUri;
        uuc1Var2.f234157g = 2;
        if (x0sVar.m89608a(uuc1Var2) != yukVar) {
            str = str13;
            str2 = strUri;
            ((zv41) yuc1Var.f276317h).m97091m(null, rb50.f197474a);
            sy31Var = yuc1Var.f276318i;
            uuc1Var2.f234151a = strSessionId;
            uuc1Var2.f234152b = strM93278o;
            uuc1Var2.f234153c = str;
            uuc1Var2.f234154d = str2;
            uuc1Var2.f234157g = 3;
            if (((xc30) sy31Var).m90345e(uuc1Var2) != yukVar) {
                str3 = str;
                str4 = strM93278o;
                str5 = strSessionId;
                uuc1Var2.f234151a = str5;
                uuc1Var2.f234152b = str4;
                uuc1Var2.f234153c = str3;
                uuc1Var2.f234154d = str2;
                uuc1Var2.f234157g = 4;
                objM56346i = kk40.m56684z(new oj71(yuc1Var, fbkVar, 26), uuc1Var2);
                if (objM56346i != yukVar) {
                    String str14 = str5;
                    str6 = str3;
                    str7 = str14;
                    oyp0 oyp0Var4 = yuc1Var.f276312c;
                    wj50.m88279p(str7);
                    uuc1Var2.f234151a = null;
                    uuc1Var2.f234152b = null;
                    uuc1Var2.f234153c = null;
                    uuc1Var2.f234154d = null;
                    uuc1Var2.f234157g = 5;
                }
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m94652h(yuc1 yuc1Var, ibk ibkVar) {
        xuc1 xuc1Var;
        if (ibkVar instanceof xuc1) {
            xuc1Var = (xuc1) ibkVar;
            int i = xuc1Var.f266080c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xuc1Var.f266080c = i - Integer.MIN_VALUE;
            } else {
                xuc1Var = new xuc1(yuc1Var, ibkVar);
            }
        } else {
            xuc1Var = new xuc1(yuc1Var, ibkVar);
        }
        Object objM86756u = xuc1Var.f266078a;
        int i2 = xuc1Var.f266080c;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            qp20 qp20Var = new qp20(((xc30) yuc1Var.f276318i).f260077n, 2);
            ro01 ro01Var = new ro01(2, 28, null);
            xuc1Var.f266080c = 1;
            objM86756u = vyf1.m86756u(qp20Var, ro01Var, xuc1Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        oy31 oy31Var = (oy31) objM86756u;
        if (oy31Var instanceof my31) {
            return ((my31) oy31Var).f148303a;
        }
        throw new IllegalStateException("No transcript received from Hovercraft");
    }

    @Override // p204p.l950
    /* JADX INFO: renamed from: a */
    public final fiz mo44003a() {
        return this.f276323n;
    }

    @Override // p204p.l950
    /* JADX INFO: renamed from: c */
    public final fiz mo44004c() {
        return this.f276321l;
    }

    @Override // p204p.m950
    public final void cancel() {
        di41 di41Var = this.f276320k;
        fbk fbkVar = null;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        ((xc30) this.f276318i).m90342b();
        rnj0 rnj0Var = rnj0.f200934b;
        suc1 suc1Var = new suc1(this, fbkVar, 0);
        x0h1.m89577t(this.f276319j, rnj0.f200934b, 1, suc1Var);
    }

    @Override // p204p.l950
    /* JADX INFO: renamed from: d */
    public final void mo44005d() {
        if (this.f276320k != null) {
            throw new IllegalStateException("This interaction is already in progress");
        }
        this.f276320k = x0h1.m89578u(this.f276319j, null, 0, new w9a1(this, null, 17), 3);
    }

    @Override // p204p.l950
    /* JADX INFO: renamed from: e */
    public final fiz mo44006e() {
        return this.f276322m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r4.m90341a(r0) == r5) goto L23;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m94653i(ibk ibkVar) {
        wuc1 wuc1Var;
        if (ibkVar instanceof wuc1) {
            wuc1Var = (wuc1) ibkVar;
            int i = wuc1Var.f255141c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wuc1Var.f255141c = i - Integer.MIN_VALUE;
            } else {
                wuc1Var = new wuc1(this, ibkVar);
            }
        } else {
            wuc1Var = new wuc1(this, ibkVar);
        }
        Object objM86755t = wuc1Var.f255139a;
        int i2 = wuc1Var.f255141c;
        sy31 sy31Var = this.f276318i;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            xjz0 xjz0Var = new xjz0(new qp20(((xc30) sy31Var).f260077n, 2), 26);
            wuc1Var.f255141c = 1;
            objM86755t = vyf1.m86755t(xjz0Var, wuc1Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        ((zv41) this.f276317h).m97091m(null, ub50.f228632a);
        return w2a1.f247311a;
        if (((oy31) objM86755t) instanceof ly31) {
            throw new IllegalStateException("Speech recognition failed");
        }
        xc30 xc30Var = (xc30) sy31Var;
        xc30Var.m90346g();
        wuc1Var.f255141c = 2;
    }
}
