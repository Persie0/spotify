package p204p;

import com.spotify.automix.esperanto.proto.EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class x041 {

    /* JADX INFO: renamed from: n */
    public static final PlaylistRequestDecorationPolicy f256798n;

    /* JADX INFO: renamed from: a */
    public final wt80 f256799a;

    /* JADX INFO: renamed from: b */
    public final j7y0 f256800b;

    /* JADX INFO: renamed from: c */
    public final prv0 f256801c;

    /* JADX INFO: renamed from: d */
    public final jdr0 f256802d;

    /* JADX INFO: renamed from: e */
    public final n6q f256803e;

    /* JADX INFO: renamed from: f */
    public final sbm f256804f;

    /* JADX INFO: renamed from: g */
    public final r791 f256805g;

    /* JADX INFO: renamed from: h */
    public final sr6 f256806h;

    /* JADX INFO: renamed from: i */
    public final lz31 f256807i;

    /* JADX INFO: renamed from: j */
    public final q831 f256808j;

    /* JADX INFO: renamed from: k */
    public final ruk f256809k;

    /* JADX INFO: renamed from: l */
    public final nc2 f256810l;

    /* JADX INFO: renamed from: m */
    public final luk f256811m;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26440v();
        top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57346D(TrackDecorationPolicy.newBuilder().setLink(true).setPlayable(true));
        top0VarM18421v.m81217y((PlaylistTrackDecorationPolicy) ktp0VarM18427E.build());
        f256798n = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public x041(wt80 wt80Var, j7y0 j7y0Var, prv0 prv0Var, jdr0 jdr0Var, n6q n6qVar, sbm sbmVar, r791 r791Var, r991 r991Var, sr6 sr6Var, lz31 lz31Var, q831 q831Var, ruk rukVar, nc2 nc2Var, luk lukVar) {
        this.f256799a = wt80Var;
        this.f256800b = j7y0Var;
        this.f256801c = prv0Var;
        this.f256802d = jdr0Var;
        this.f256803e = n6qVar;
        this.f256804f = sbmVar;
        this.f256805g = r791Var;
        this.f256806h = sr6Var;
        this.f256807i = lz31Var;
        this.f256808j = q831Var;
        this.f256809k = rukVar;
        this.f256810l = nc2Var;
        this.f256811m = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x011c -> B:52:0x0120). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m89495a(p204p.x041 r12, p204p.niz r13, p204p.oz31 r14, p204p.ibk r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.x041.m89495a(p.x041, p.niz, p.oz31, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        if (r12.emit(r11, r0) == r7) goto L37;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m89496b(x041 x041Var, niz nizVar, qz31 qz31Var, ibk ibkVar) {
        e041 e041Var;
        y791 y791Var;
        niz nizVar2;
        bcm bcmVar;
        z891 z891Var;
        Object objM89502g;
        z891 z891Var2;
        if (ibkVar instanceof e041) {
            e041Var = (e041) ibkVar;
            int i = e041Var.f54852g;
            if ((i & Integer.MIN_VALUE) != 0) {
                e041Var.f54852g = i - Integer.MIN_VALUE;
            } else {
                e041Var = new e041(x041Var, ibkVar);
            }
        } else {
            e041Var = new e041(x041Var, ibkVar);
        }
        Object objM87675b = e041Var.f54850e;
        int i2 = e041Var.f54852g;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM87675b);
            sbm sbmVar = x041Var.f256804f;
            String str = qz31Var.f194104a;
            String str2 = qz31Var.f194105b;
            String str3 = qz31Var.f194106c;
            e041Var.f54846a = nizVar;
            e041Var.f54847b = qz31Var;
            e041Var.f54852g = 1;
            objM87675b = ((wbm) sbmVar).m87675b(str, str2, str3, e041Var);
            if (objM87675b != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            qz31Var = e041Var.f54847b;
            nizVar = e041Var.f54846a;
            bga.m29073P(objM87675b);
        } else {
            if (i2 == 2) {
                bcmVar = e041Var.f54848c;
                qz31Var = e041Var.f54847b;
                nizVar2 = e041Var.f54846a;
                bga.m29073P(objM87675b);
                z891Var = (z891) objM87675b;
                xbm xbmVar = bcmVar.f25913a;
                Float f = new Float(qz31Var.f194107d);
                e041Var.f54846a = nizVar2;
                e041Var.f54847b = null;
                e041Var.f54848c = null;
                e041Var.f54849d = z891Var;
                e041Var.f54852g = 3;
                objM89502g = x041Var.m89502g(xbmVar, null, f, e041Var);
                if (objM89502g != obj) {
                    objM87675b = objM89502g;
                    z891Var2 = z891Var;
                    nizVar = nizVar2;
                    y791Var = new y791((z891) objM87675b, z891Var2);
                    v141 v141Var = new v141(y791Var);
                    e041Var.f54846a = null;
                    e041Var.f54847b = null;
                    e041Var.f54848c = null;
                    e041Var.f54849d = null;
                    e041Var.f54852g = 4;
                }
                return obj;
            }
            if (i2 == 3) {
                z891Var2 = e041Var.f54849d;
                nizVar = e041Var.f54846a;
                bga.m29073P(objM87675b);
                y791Var = new y791((z891) objM87675b, z891Var2);
                v141 v141Var2 = new v141(y791Var);
                e041Var.f54846a = null;
                e041Var.f54847b = null;
                e041Var.f54848c = null;
                e041Var.f54849d = null;
                e041Var.f54852g = 4;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87675b);
            }
        }
        return w2a1.f247311a;
        bcm bcmVar2 = (bcm) objM87675b;
        if (x041Var.f256807i.f138253e) {
            xbm xbmVar2 = bcmVar2.f25914b;
            Float f2 = new Float(qz31Var.f194107d);
            e041Var.f54846a = nizVar;
            e041Var.f54847b = qz31Var;
            e041Var.f54848c = bcmVar2;
            e041Var.f54852g = 2;
            Object objM89502g2 = x041Var.m89502g(xbmVar2, f2, null, e041Var);
            if (objM89502g2 != obj) {
                nizVar2 = nizVar;
                bcmVar = bcmVar2;
                objM87675b = objM89502g2;
                z891Var = (z891) objM87675b;
                xbm xbmVar3 = bcmVar.f25913a;
                Float f3 = new Float(qz31Var.f194107d);
                e041Var.f54846a = nizVar2;
                e041Var.f54847b = null;
                e041Var.f54848c = null;
                e041Var.f54849d = z891Var;
                e041Var.f54852g = 3;
                objM89502g = x041Var.m89502g(xbmVar3, null, f3, e041Var);
                if (objM89502g != obj) {
                    objM87675b = objM89502g;
                    z891Var2 = z891Var;
                    nizVar = nizVar2;
                    y791Var = new y791((z891) objM87675b, z891Var2);
                    v141 v141Var3 = new v141(y791Var);
                    e041Var.f54846a = null;
                    e041Var.f54847b = null;
                    e041Var.f54848c = null;
                    e041Var.f54849d = null;
                    e041Var.f54852g = 4;
                }
            }
        } else {
            y791Var = new y791(m89501i(x041Var, bcmVar2.f25913a, null, new Float(qz31Var.f194107d), 2), m89501i(x041Var, bcmVar2.f25914b, new Float(qz31Var.f194107d), null, 4));
            v141 v141Var4 = new v141(y791Var);
            e041Var.f54846a = null;
            e041Var.f54847b = null;
            e041Var.f54848c = null;
            e041Var.f54849d = null;
            e041Var.f54852g = 4;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m89497c(x041 x041Var, niz nizVar, sz31 sz31Var, ibk ibkVar) {
        g041 g041Var;
        if (ibkVar instanceof g041) {
            g041Var = (g041) ibkVar;
            int i = g041Var.f75270d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g041Var.f75270d = i - Integer.MIN_VALUE;
            } else {
                g041Var = new g041(x041Var, ibkVar);
            }
        } else {
            g041Var = new g041(x041Var, ibkVar);
        }
        Object objM62843h = g041Var.f75268b;
        int i2 = g041Var.f75270d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM62843h);
            wt80 wt80Var = x041Var.f256799a;
            String str = sz31Var.f215379a;
            String str2 = sz31Var.f215380b;
            g041Var.f75267a = nizVar;
            g041Var.f75270d = 1;
            objM62843h = ((mu80) wt80Var).m62843h(str, str2, f256798n, g041Var);
            if (objM62843h != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM62843h);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62843h);
            return w2a1Var;
        }
        nizVar = g041Var.f75267a;
        bga.m29073P(objM62843h);
        p2x0 p2x0Var = (p2x0) objM62843h;
        if (!(p2x0Var instanceof m2x0)) {
            g041Var.f75267a = null;
            g041Var.f75270d = 3;
            if (nizVar.emit(k141.f118203a, g041Var) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        nw80 nw80Var = (nw80) ((m2x0) p2x0Var).f139474a;
        String str3 = (String) nw80Var.f159053g.get("item.speed");
        t141 t141Var = new t141(nw80Var.f159049c, str3 != null ? bm51.m29806q0(str3) : null, nw80Var.m65751b());
        g041Var.f75267a = null;
        g041Var.f75270d = 2;
        if (nizVar.emit(t141Var, g041Var) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m89498d(x041 x041Var, tz31 tz31Var, ibk ibkVar) {
        h041 h041Var;
        if (ibkVar instanceof h041) {
            h041Var = (h041) ibkVar;
            int i = h041Var.f86148c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h041Var.f86148c = i - Integer.MIN_VALUE;
            } else {
                h041Var = new h041(x041Var, ibkVar);
            }
        } else {
            h041Var = new h041(x041Var, ibkVar);
        }
        Object obj = h041Var.f86146a;
        int i2 = h041Var.f86148c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                prv0 prv0Var = x041Var.f256801c;
                String str = tz31Var.f225139a;
                double d = tz31Var.f225140b;
                h041Var.f86148c = 1;
                Object objM70738f = prv0Var.m70738f(str, d, h041Var);
                yuk yukVar = yuk.f276404a;
                if (objM70738f == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m89499e(x041 x041Var, niz nizVar, uz31 uz31Var, ibk ibkVar) {
        v041 v041Var;
        Object objM52666a;
        if (ibkVar instanceof v041) {
            v041Var = (v041) ibkVar;
            int i = v041Var.f235916d;
            if ((i & Integer.MIN_VALUE) != 0) {
                v041Var.f235916d = i - Integer.MIN_VALUE;
            } else {
                v041Var = new v041(x041Var, ibkVar);
            }
        } else {
            v041Var = new v041(x041Var, ibkVar);
        }
        Object obj = v041Var.f235914b;
        int i2 = v041Var.f235916d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            j7y0 j7y0Var = x041Var.f256800b;
            String str = uz31Var.f235416a;
            String str2 = uz31Var.f235417b;
            v041Var.f235913a = nizVar;
            v041Var.f235916d = 1;
            objM52666a = j7y0Var.m52666a(str, str2, v041Var);
            if (objM52666a != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        nizVar = v041Var.f235913a;
        bga.m29073P(obj);
        objM52666a = ((s6x0) obj).f206218a;
        if (objM52666a instanceof c6x0) {
            v041Var.f235913a = null;
            v041Var.f235916d = 3;
            if (nizVar.emit(q141.f184208a, v041Var) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        v041Var.f235913a = null;
        v041Var.f235916d = 2;
        if (nizVar.emit(r141.f194763a, v041Var) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m89500f(x041 x041Var, niz nizVar, vz31 vz31Var, ibk ibkVar) {
        w041 w041Var;
        Object objM52667b;
        if (ibkVar instanceof w041) {
            w041Var = (w041) ibkVar;
            int i = w041Var.f246641d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w041Var.f246641d = i - Integer.MIN_VALUE;
            } else {
                w041Var = new w041(x041Var, ibkVar);
            }
        } else {
            w041Var = new w041(x041Var, ibkVar);
        }
        Object obj = w041Var.f246639b;
        int i2 = w041Var.f246641d;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            j7y0 j7y0Var = x041Var.f256800b;
            String str = vz31Var.f246374a;
            String str2 = vz31Var.f246375b;
            float f = vz31Var.f246376c;
            w041Var.f246638a = nizVar;
            w041Var.f246641d = 1;
            objM52667b = j7y0Var.m52667b(str, str2, f, w041Var);
            if (objM52667b != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        nizVar = w041Var.f246638a;
        bga.m29073P(obj);
        objM52667b = ((s6x0) obj).f206218a;
        if (objM52667b instanceof c6x0) {
            w041Var.f246638a = null;
            w041Var.f246641d = 3;
            if (nizVar.emit(q141.f184208a, w041Var) == yukVar) {
                return yukVar;
            }
            return w2a1Var;
        }
        w041Var.f246638a = null;
        w041Var.f246641d = 2;
        if (nizVar.emit(r141.f194763a, w041Var) == yukVar) {
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: i */
    public static z891 m89501i(x041 x041Var, xbm xbmVar, Float f, Float f2, int i) {
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            f2 = null;
        }
        if (xbmVar == null) {
            return u891.f227877a;
        }
        return !xbmVar.f259947e ? x041Var.m89504j(xbmVar, f, f2) : new w891(xbmVar.f259944b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m89502g(xbm xbmVar, Float f, Float f2, ibk ibkVar) {
        c041 c041Var;
        if (ibkVar instanceof c041) {
            c041Var = (c041) ibkVar;
            int i = c041Var.f32682d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c041Var.f32682d = i - Integer.MIN_VALUE;
            } else {
                c041Var = new c041(this, ibkVar);
            }
        } else {
            c041Var = new c041(this, ibkVar);
        }
        Object objM79053b = c041Var.f32680b;
        int i2 = c041Var.f32682d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79053b);
                if (xbmVar == null) {
                    return u891.f227877a;
                }
                if (!xbmVar.f259947e) {
                    return m89504j(xbmVar, f, f2);
                }
                hiw hiwVarM3662q = EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest.m3662q();
                hiwVarM3662q.m47641r(xbmVar.f259946d);
                if (f != null) {
                    hiwVarM3662q.m47639m(f.floatValue());
                }
                if (f2 != null) {
                    hiwVarM3662q.m47640q(f2.floatValue());
                }
                EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest = (EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest) hiwVarM3662q.build();
                sr6 sr6Var = this.f256806h;
                wj50.m88279p(esAutomix$AdjustTransitionRecipeForItemSpeedsRequest);
                c041Var.f32679a = xbmVar;
                c041Var.f32682d = 1;
                objM79053b = sr6Var.m79053b(esAutomix$AdjustTransitionRecipeForItemSpeedsRequest, c041Var);
                yuk yukVar = yuk.f276404a;
                if (objM79053b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xbmVar = c041Var.f32679a;
                bga.m29073P(objM79053b);
            }
            String strM3664n = ((EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse) objM79053b).m3664n();
            wj50.m88279p(strM3664n);
            return strM3664n.length() == 0 ? new y891(xbmVar.f259944b) : new v891(xbmVar.f259944b, strM3664n, xbmVar.f259946d);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new y891(xbmVar.f259944b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r7.emit(r9, r0) == r4) goto L25;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89503h(niz nizVar, rz31 rz31Var, ibk ibkVar) {
        f041 f041Var;
        if (ibkVar instanceof f041) {
            f041Var = (f041) ibkVar;
            int i = f041Var.f64543d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f041Var.f64543d = i - Integer.MIN_VALUE;
            } else {
                f041Var = new f041(this, ibkVar);
            }
        } else {
            f041Var = new f041(this, ibkVar);
        }
        Object objM53043a = f041Var.f64541b;
        int i2 = f041Var.f64543d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                nizVar = f041Var.f64540a;
                bga.m29073P(objM53043a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM53043a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM53043a);
        String str = rz31Var.f204051a;
        String str2 = rz31Var.f204052b;
        String str3 = rz31Var.f204053c;
        f041Var.f64540a = nizVar;
        f041Var.f64543d = 1;
        objM53043a = this.f256802d.m53043a(str, str2, str3, f041Var);
        if (objM53043a != yukVar) {
        }
        return yukVar;
        kdr0 kdr0Var = (kdr0) objM53043a;
        o141 o141Var = new o141(kdr0Var != null ? new hdr0(kdr0Var.f121726a, kdr0Var.f121727b, kdr0Var.f121728c) : null);
        f041Var.f64540a = null;
        f041Var.f64543d = 2;
    }

    /* JADX INFO: renamed from: j */
    public final z891 m89504j(xbm xbmVar, Float f, Float f2) {
        b791 b791VarM75016a = r991.m75016a(xbmVar.f259946d);
        if (b791VarM75016a == null) {
            return u891.f227877a;
        }
        rzl0 rzl0Var = b791VarM75016a.f24196b;
        return new x891(xbmVar.f259944b, r991.m75018c(b791.m28366c(b791VarM75016a, null, rzl0.m76819c(rzl0Var, null, null, null, null, null, null, null, 0, 0, 0, null, null, 0.0f, 0.0f, f != null ? f.floatValue() : rzl0Var.f204169P0, f2 != null ? f2.floatValue() : b791VarM75016a.f24196b.f204170Q0, 131071), false, false, 13)), xbmVar.f259946d);
    }
}
