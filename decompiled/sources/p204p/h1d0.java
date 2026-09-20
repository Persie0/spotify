package p204p;

import com.google.protobuf.Timestamp;
import com.spotify.player.model.PlayerState;
import com.spotify.savetospotify.p145v1.HttpCreateEpisodeRequest;
import com.spotify.savetospotify.p145v1.HttpCreateEpisodeResponse;
import com.spotify.savetospotify.p145v1.HttpEpisodeReadinessResponse;
import com.spotify.savetospotify.p145v1.HttpGetShowResponse;
import com.spotify.savetospotify.p145v1.HttpListShowsResponse;
import com.spotify.savetospotify.p145v1.HttpMultipartUploadUrl;
import com.spotify.savetospotify.p145v1.HttpShowSummary;
import com.spotify.savetospotify.p145v1.HttpUpdateShowPlaybackControlRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
public final class h1d0 {

    /* JADX INFO: renamed from: a */
    public final un51 f86569a;

    /* JADX INFO: renamed from: b */
    public final vpx f86570b;

    /* JADX INFO: renamed from: c */
    public final yz80 f86571c;

    /* JADX INFO: renamed from: d */
    public final wt80 f86572d;

    /* JADX INFO: renamed from: e */
    public final qxr f86573e;

    /* JADX INFO: renamed from: f */
    public final Flowable f86574f;

    /* JADX INFO: renamed from: g */
    public final fk60 f86575g;

    /* JADX INFO: renamed from: h */
    public z5a1 f86576h;

    public h1d0(un51 un51Var, vpx vpxVar, yz80 yz80Var, wt80 wt80Var, qxr qxrVar, Flowable flowable, fk60 fk60Var) {
        this.f86569a = un51Var;
        this.f86570b = vpxVar;
        this.f86571c = yz80Var;
        this.f86572d = wt80Var;
        this.f86573e = qxrVar;
        this.f86574f = flowable;
        this.f86575g = fk60Var;
        jqv0 jqv0Var = qpv0.f191387a;
        pag1.m69487w(new rko(new txr(jqv0Var.mo54112b(v140.class)), 1, r0d0.f194462e, new pko(r0d0.f194459c), r0d0.f194463f), r0d0.f194461d);
        pag1.m69487w(new rko(new txr(jqv0Var.mo54112b(erc1.class)), 1, r0d0.f194464g, new pko(r0d0.f194466i), r0d0.f194465h), r0d0.f194467t);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0106 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:12:0x0023, B:40:0x0087, B:41:0x0089, B:59:0x00c8, B:60:0x00db, B:62:0x00e1, B:63:0x00f8, B:48:0x00a9, B:52:0x00b4, B:56:0x00bf, B:67:0x0100, B:69:0x0106, B:70:0x010c, B:71:0x010d, B:21:0x0038, B:24:0x0051, B:28:0x005c, B:30:0x0064, B:33:0x006b, B:34:0x006e, B:35:0x0074, B:25:0x0054, B:26:0x0059, B:27:0x005a), top: B:76:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:71:0x010d A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:12:0x0023, B:40:0x0087, B:41:0x0089, B:59:0x00c8, B:60:0x00db, B:62:0x00e1, B:63:0x00f8, B:48:0x00a9, B:52:0x00b4, B:56:0x00bf, B:67:0x0100, B:69:0x0106, B:70:0x010c, B:71:0x010d, B:21:0x0038, B:24:0x0051, B:28:0x005c, B:30:0x0064, B:33:0x006b, B:34:0x006e, B:35:0x0074, B:25:0x0054, B:26:0x0059, B:27:0x005a), top: B:76:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m46417a(String str, String str2, zxd0 zxd0Var, int i, String str3, ibk ibkVar) {
        v0d0 v0d0Var;
        yxd0 yxd0Var;
        h1d0 h1d0Var;
        if (ibkVar instanceof v0d0) {
            v0d0Var = (v0d0) ibkVar;
            int i2 = v0d0Var.f235969d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0d0Var.f235969d = i2 - Integer.MIN_VALUE;
            } else {
                v0d0Var = new v0d0(this, ibkVar);
            }
        } else {
            v0d0Var = new v0d0(this, ibkVar);
        }
        Object objM83518f = v0d0Var.f235967b;
        int i3 = v0d0Var.f235969d;
        int i4 = 1;
        try {
            if (i3 == 0) {
                bga.m29073P(objM83518f);
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(str).m35710h();
                zg30 zg30VarM20433r = HttpCreateEpisodeRequest.m20433r();
                zg30VarM20433r.m96045s(str2);
                int iOrdinal = zxd0Var.ordinal();
                if (iOrdinal == 0) {
                    yxd0Var = yxd0.EPISODE_AUDIO;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yxd0Var = yxd0.EPISODE_VIDEO;
                }
                zg30VarM20433r.m96044r(yxd0Var);
                zg30VarM20433r.m96042m(i);
                if (str3 != null && !wl51.m88460J0(str3)) {
                    zg30VarM20433r.m96043q(str3);
                }
                HttpCreateEpisodeRequest httpCreateEpisodeRequest = (HttpCreateEpisodeRequest) zg30VarM20433r.build();
                try {
                    un51 un51Var = this.f86569a;
                    wj50.m88279p(httpCreateEpisodeRequest);
                    v0d0Var.f235966a = this;
                    v0d0Var.f235969d = 1;
                    objM83518f = un51Var.m83518f(strM35710h, httpCreateEpisodeRequest, v0d0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM83518f == yukVar) {
                        return yukVar;
                    }
                    h1d0Var = this;
                } catch (HttpException e) {
                    e = e;
                    h1d0Var = this;
                    if (e.f288164a == 429) {
                        throw j1d0.m52124a(e, h1d0Var.f86575g);
                    }
                    throw e;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h1d0Var = v0d0Var.f235966a;
                try {
                    bga.m29073P(objM83518f);
                } catch (HttpException e2) {
                    e = e2;
                    if (e.f288164a == 429) {
                        throw j1d0.m52124a(e, h1d0Var.f86575g);
                    }
                    throw e;
                }
            }
            HttpCreateEpisodeResponse httpCreateEpisodeResponse = (HttpCreateEpisodeResponse) objM83518f;
            String strM20435o = httpCreateEpisodeResponse.m20435o();
            String strM20434n = httpCreateEpisodeResponse.m20434n();
            String status = httpCreateEpisodeResponse.getStatus();
            int iHashCode = status.hashCode();
            if (iHashCode != -269267423) {
                if (iHashCode != 77848963) {
                    i4 = (iHashCode == 907287315 && status.equals("PROCESSING")) ? 2 : 4;
                } else if (status.equals("READY")) {
                    i4 = 3;
                }
            } else if (!status.equals("UPLOADING")) {
            }
            ae50<HttpMultipartUploadUrl> ae50VarM20436p = httpCreateEpisodeResponse.m20436p();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM20436p, 10));
            for (HttpMultipartUploadUrl httpMultipartUploadUrl : ae50VarM20436p) {
                arrayList.add(new lai0(httpMultipartUploadUrl.m20441o(), httpMultipartUploadUrl.m20440n()));
            }
            return new b6l(i4, strM20435o, strM20434n, arrayList);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m46418b(ibk ibkVar) {
        w0d0 w0d0Var;
        if (ibkVar instanceof w0d0) {
            w0d0Var = (w0d0) ibkVar;
            int i = w0d0Var.f246702c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0d0Var.f246702c = i - Integer.MIN_VALUE;
            } else {
                w0d0Var = new w0d0(this, ibkVar);
            }
        } else {
            w0d0Var = new w0d0(this, ibkVar);
        }
        Object objM96567o = w0d0Var.f246700a;
        int i2 = w0d0Var.f246702c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleTimeout = this.f86574f.m23327A().timeout(250L, TimeUnit.MILLISECONDS);
                w0d0Var.f246702c = 1;
                objM96567o = zn91.m96567o(singleTimeout, w0d0Var);
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
            String strM47210B = hdi.m47210B((PlayerState) objM96567o);
            if (wl51.m88460J0(strM47210B)) {
                return null;
            }
            return strM47210B;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r10 == r6) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46419c(String str, String str2, ibk ibkVar) {
        x0d0 x0d0Var;
        Object c6x0Var;
        Object obj;
        Object obj2;
        if (ibkVar instanceof x0d0) {
            x0d0Var = (x0d0) ibkVar;
            int i = x0d0Var.f256866f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0d0Var.f256866f = i - Integer.MIN_VALUE;
            } else {
                x0d0Var = new x0d0(this, ibkVar);
            }
        } else {
            x0d0Var = new x0d0(this, ibkVar);
        }
        Object objM63326w = x0d0Var.f256864d;
        int i2 = x0d0Var.f256866f;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(objM63326w);
                    un51 un51Var = this.f86569a;
                    Set set = dd41.f47702f;
                    String strM35710h = r46.m74726U(str).m35710h();
                    x0d0Var.f256861a = str;
                    x0d0Var.f256862b = str2;
                    x0d0Var.f256863c = null;
                    x0d0Var.f256866f = 1;
                    str = str;
                    if (un51Var.m83524l(strM35710h, x0d0Var) == yukVar) {
                    }
                    return yukVar;
                }
                if (i2 == 1) {
                    str2 = x0d0Var.f256862b;
                    String str3 = x0d0Var.f256861a;
                    bga.m29073P(objM63326w);
                    str = str3;
                } else if (i2 == 2) {
                    Object obj3 = x0d0Var.f256863c;
                    str2 = x0d0Var.f256862b;
                    bga.m29073P(objM63326w);
                    obj2 = obj3;
                    yz80 yz80Var = this.f86571c;
                    rg61 rg61Var = rg61.f198862a;
                    x0d0Var.f256861a = null;
                    x0d0Var.f256862b = null;
                    x0d0Var.f256863c = obj2;
                    x0d0Var.f256866f = 3;
                    objM63326w = ((n090) yz80Var).m63326w(str2, rg61Var, x0d0Var);
                    str = obj2;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = x0d0Var.f256863c;
                    bga.m29073P(objM63326w);
                    str = obj4;
                }
                return str;
                c6x0Var = w2a1.f247311a;
                obj = str;
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
            obj = str;
        }
        if (c6x0Var instanceof c6x0) {
            return c6x0Var;
        }
        z0d0 z0d0Var = new z0d0(this, str2, Collections.singletonList(obj), null);
        x0d0Var.f256861a = null;
        x0d0Var.f256862b = str2;
        x0d0Var.f256863c = c6x0Var;
        x0d0Var.f256866f = 2;
        if (kk40.m56684z(z0d0Var, x0d0Var) != yukVar) {
            obj2 = c6x0Var;
            yz80 yz80Var2 = this.f86571c;
            rg61 rg61Var2 = rg61.f198862a;
            x0d0Var.f256861a = null;
            x0d0Var.f256862b = null;
            x0d0Var.f256863c = obj2;
            x0d0Var.f256866f = 3;
            objM63326w = ((n090) yz80Var2).m63326w(str2, rg61Var2, x0d0Var);
            str = obj2;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (p204p.zn91.m96565n(r11, r0) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r11 == r6) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v8, types: [p.n090] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46420d(String str, ibk ibkVar) {
        a1d0 a1d0Var;
        ?? r1;
        Object c6x0Var;
        if (ibkVar instanceof a1d0) {
            a1d0Var = (a1d0) ibkVar;
            int i = a1d0Var.f11390e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1d0Var.f11390e = i - Integer.MIN_VALUE;
            } else {
                a1d0Var = new a1d0(this, ibkVar);
            }
        } else {
            a1d0Var = new a1d0(this, ibkVar);
        }
        Object objM63326w = a1d0Var.f11388c;
        ?? r2 = a1d0Var.f11390e;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (r2 == 0) {
                        bga.m29073P(objM63326w);
                        un51 un51Var = this.f86569a;
                        Set set = dd41.f47702f;
                        String strM35710h = r46.m74726U(str).m35710h();
                        a1d0Var.f11386a = str;
                        a1d0Var.f11387b = null;
                        a1d0Var.f11390e = 1;
                        str = str;
                        if (un51Var.m83523k(strM35710h, a1d0Var) == yukVar) {
                        }
                        r2 = r1;
                        str = c6x0Var;
                        return yukVar;
                    }
                    if (r2 == 1) {
                        String str2 = a1d0Var.f11386a;
                        bga.m29073P(objM63326w);
                        str = str2;
                    } else if (r2 == 2) {
                        Object obj = a1d0Var.f11387b;
                        String str3 = a1d0Var.f11386a;
                        bga.m29073P(objM63326w);
                        r2 = str3;
                        str = obj;
                        r2 = r1;
                        str = c6x0Var;
                        yz80 yz80Var = this.f86571c;
                        rg61 rg61Var = rg61.f198862a;
                        a1d0Var.f11386a = null;
                        a1d0Var.f11387b = str;
                        a1d0Var.f11390e = 3;
                        objM63326w = ((n090) yz80Var).m63326w(r2, rg61Var, a1d0Var);
                        str = str;
                    } else {
                        if (r2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = a1d0Var.f11387b;
                        bga.m29073P(objM63326w);
                        str = obj2;
                    }
                    return str;
                    r1 = str;
                    c6x0Var = w2a1.f247311a;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            r1 = str;
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            return c6x0Var;
        }
        Completable completableM86176a = this.f86570b.m86176a(Collections.singletonList(r1), fs11.class);
        a1d0Var.f11386a = r1;
        a1d0Var.f11387b = c6x0Var;
        a1d0Var.f11390e = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m46421e(String str) {
        k35 k35Var = new k35(new txr(qpv0.f191387a.mo54112b(fgk0.class)), str);
        rlv0 rlv0Var = new rlv0();
        rlv0Var.f200373a = this.f86573e.mo24861c(new gpc0(rlv0Var, this, k35Var, 1));
        z5a1 z5a1Var = this.f86576h;
        if (z5a1Var != null) {
            z5a1Var.dispose();
        }
        z5a1 z5a1Var2 = (z5a1) rlv0Var.f200373a;
        this.f86576h = z5a1Var2;
        pjo pjoVar = (pjo) z5a1Var2.mo28289a(Collections.singleton(k35Var)).get(k35Var);
        if (pjoVar == null || (pjoVar instanceof njo)) {
            return;
        }
        ((z5a1) rlv0Var.f200373a).dispose();
        if (this.f86576h == rlv0Var.f200373a) {
            this.f86576h = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m46422f(Set set, ibk ibkVar) {
        b1d0 b1d0Var;
        if (ibkVar instanceof b1d0) {
            b1d0Var = (b1d0) ibkVar;
            int i = b1d0Var.f22298d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1d0Var.f22298d = i - Integer.MIN_VALUE;
            } else {
                b1d0Var = new b1d0(this, ibkVar);
            }
        } else {
            b1d0Var = new b1d0(this, ibkVar);
        }
        Object objM46418b = b1d0Var.f22296b;
        int i2 = b1d0Var.f22298d;
        if (i2 == 0) {
            bga.m29073P(objM46418b);
            b1d0Var.f22295a = set;
            b1d0Var.f22298d = 1;
            objM46418b = m46418b(b1d0Var);
            Object obj = yuk.f276404a;
            if (objM46418b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = b1d0Var.f22295a;
            bga.m29073P(objM46418b);
        }
        String str = (String) objM46418b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (str == null || !set.contains(str)) {
            return w2a1Var;
        }
        try {
            m46421e(str);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Serializable m46423g(String str, ibk ibkVar) {
        c1d0 c1d0Var;
        if (ibkVar instanceof c1d0) {
            c1d0Var = (c1d0) ibkVar;
            int i = c1d0Var.f33057c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1d0Var.f33057c = i - Integer.MIN_VALUE;
            } else {
                c1d0Var = new c1d0(this, ibkVar);
            }
        } else {
            c1d0Var = new c1d0(this, ibkVar);
        }
        Object objM83520h = c1d0Var.f33055a;
        int i2 = c1d0Var.f33057c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83520h);
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(str).m35710h();
                un51 un51Var = this.f86569a;
                c1d0Var.f33057c = 1;
                objM83520h = un51Var.m83520h(strM35710h, c1d0Var);
                yuk yukVar = yuk.f276404a;
                if (objM83520h == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83520h);
            }
            int iOrdinal = ((HttpEpisodeReadinessResponse) objM83520h).m20437n().ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 3 ? q6w.f185931a : q6w.f185933c;
            }
            return q6w.f185932b;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m46424h(ibk ibkVar) {
        d1d0 d1d0Var;
        if (ibkVar instanceof d1d0) {
            d1d0Var = (d1d0) ibkVar;
            int i = d1d0Var.f44239c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d1d0Var.f44239c = i - Integer.MIN_VALUE;
            } else {
                d1d0Var = new d1d0(this, ibkVar);
            }
        } else {
            d1d0Var = new d1d0(this, ibkVar);
        }
        Object objM83522j = d1d0Var.f44237a;
        int i2 = d1d0Var.f44239c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83522j);
                un51 un51Var = this.f86569a;
                d1d0Var.f44239c = 1;
                objM83522j = un51Var.m83522j(d1d0Var);
                yuk yukVar = yuk.f276404a;
                if (objM83522j == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83522j);
            }
            HttpShowSummary httpShowSummary = (HttpShowSummary) g6f.m43745s0(((HttpListShowsResponse) objM83522j).m20439n());
            if (httpShowSummary == null) {
                return null;
            }
            String strM20443o = httpShowSummary.m20443o();
            String title = httpShowSummary.getTitle();
            Timestamp createdAt = httpShowSummary.getCreatedAt();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(createdAt.m1969s());
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long millis2 = timeUnit2.toMillis(createdAt.m1968r()) + millis;
            Timestamp timestampM20442n = httpShowSummary.m20442n();
            return new zj11(strM20443o, millis2, timeUnit2.toMillis(timestampM20442n.m1968r()) + timeUnit.toMillis(timestampM20442n.m1969s()), title);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Serializable m46425i(String str, ibk ibkVar) {
        e1d0 e1d0Var;
        if (ibkVar instanceof e1d0) {
            e1d0Var = (e1d0) ibkVar;
            int i = e1d0Var.f55182c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e1d0Var.f55182c = i - Integer.MIN_VALUE;
            } else {
                e1d0Var = new e1d0(this, ibkVar);
            }
        } else {
            e1d0Var = new e1d0(this, ibkVar);
        }
        Object objM83519g = e1d0Var.f55180a;
        int i2 = e1d0Var.f55182c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM83519g);
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(str).m35710h();
                un51 un51Var = this.f86569a;
                e1d0Var.f55182c = 1;
                objM83519g = un51Var.m83519g(strM35710h, e1d0Var);
                yuk yukVar = yuk.f276404a;
                if (objM83519g == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83519g);
            }
            return i1d0.f97481a[((HttpGetShowResponse) objM83519g).m20438n().ordinal()] == 1 ? mwo0.f147836b : mwo0.f147835a;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cb A[Catch: Exception -> 0x0039, CancellationException -> 0x003c, TryCatch #2 {CancellationException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:72:0x0138, B:24:0x0049, B:69:0x0127, B:27:0x0050, B:66:0x0118, B:28:0x0055, B:47:0x00c5, B:49:0x00cb, B:52:0x00d1, B:54:0x00d7, B:55:0x00e6, B:57:0x00ec, B:60:0x00fb, B:61:0x00fd, B:63:0x0103, B:31:0x005b, B:44:0x00a0, B:34:0x0063, B:37:0x0079, B:41:0x0084, B:38:0x007c, B:39:0x0081, B:40:0x0082), top: B:77:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[Catch: Exception -> 0x0039, CancellationException -> 0x003c, TryCatch #2 {CancellationException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:72:0x0138, B:24:0x0049, B:69:0x0127, B:27:0x0050, B:66:0x0118, B:28:0x0055, B:47:0x00c5, B:49:0x00cb, B:52:0x00d1, B:54:0x00d7, B:55:0x00e6, B:57:0x00ec, B:60:0x00fb, B:61:0x00fd, B:63:0x0103, B:31:0x005b, B:44:0x00a0, B:34:0x0063, B:37:0x0079, B:41:0x0084, B:38:0x007c, B:39:0x0081, B:40:0x0082), top: B:77:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0103 A[Catch: Exception -> 0x0039, CancellationException -> 0x003c, TryCatch #2 {CancellationException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:72:0x0138, B:24:0x0049, B:69:0x0127, B:27:0x0050, B:66:0x0118, B:28:0x0055, B:47:0x00c5, B:49:0x00cb, B:52:0x00d1, B:54:0x00d7, B:55:0x00e6, B:57:0x00ec, B:60:0x00fb, B:61:0x00fd, B:63:0x0103, B:31:0x005b, B:44:0x00a0, B:34:0x0063, B:37:0x0079, B:41:0x0084, B:38:0x007c, B:39:0x0081, B:40:0x0082), top: B:77:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118 A[Catch: Exception -> 0x0039, CancellationException -> 0x003c, PHI: r3
      0x0118: PHI (r3v11 ??) = (r3v20 ??), (r3v21 ??) binds: [B:64:0x0115, B:27:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:72:0x0138, B:24:0x0049, B:69:0x0127, B:27:0x0050, B:66:0x0118, B:28:0x0055, B:47:0x00c5, B:49:0x00cb, B:52:0x00d1, B:54:0x00d7, B:55:0x00e6, B:57:0x00ec, B:60:0x00fb, B:61:0x00fd, B:63:0x0103, B:31:0x005b, B:44:0x00a0, B:34:0x0063, B:37:0x0079, B:41:0x0084, B:38:0x007c, B:39:0x0081, B:40:0x0082), top: B:77:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127 A[Catch: Exception -> 0x0039, CancellationException -> 0x003c, PHI: r3
      0x0127: PHI (r3v12 ??) = (r3v18 ??), (r3v19 ??) binds: [B:67:0x0124, B:24:0x0049] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x003c, Exception -> 0x0039, blocks: (B:15:0x0034, B:72:0x0138, B:24:0x0049, B:69:0x0127, B:27:0x0050, B:66:0x0118, B:28:0x0055, B:47:0x00c5, B:49:0x00cb, B:52:0x00d1, B:54:0x00d7, B:55:0x00e6, B:57:0x00ec, B:60:0x00fb, B:61:0x00fd, B:63:0x0103, B:31:0x005b, B:44:0x00a0, B:34:0x0063, B:37:0x0079, B:41:0x0084, B:38:0x007c, B:39:0x0081, B:40:0x0082), top: B:77:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
    
        if (m46422f(r0, r2) == r10) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [p.vpx] */
    /* JADX WARN: Type inference failed for: r17v0, types: [p.h1d0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [p.lau] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46426j(String str, mwo0 mwo0Var, ibk ibkVar) {
        f1d0 f1d0Var;
        lwo0 lwo0Var;
        String str2;
        p2x0 p2x0Var;
        m2x0 m2x0Var;
        ?? arrayList;
        Completable completableM86176a;
        List list;
        ?? r3;
        ?? r4;
        if (ibkVar instanceof f1d0) {
            f1d0Var = (f1d0) ibkVar;
            int i = f1d0Var.f64876e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1d0Var.f64876e = i - Integer.MIN_VALUE;
            } else {
                f1d0Var = new f1d0(this, ibkVar);
            }
        } else {
            f1d0Var = new f1d0(this, ibkVar);
        }
        Object objM62844i = f1d0Var.f64874c;
        int i2 = f1d0Var.f64876e;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM62844i);
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(str).m35710h();
                mh30 mh30VarM20445o = HttpUpdateShowPlaybackControlRequest.m20445o();
                int iOrdinal = mwo0Var.ordinal();
                if (iOrdinal == 0) {
                    lwo0Var = lwo0.PLAYBACK_CONTROL_DEFAULT;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lwo0Var = lwo0.PLAYBACK_CONTROL_CHAPTER_SKIP;
                }
                mh30VarM20445o.m61735m(lwo0Var);
                HttpUpdateShowPlaybackControlRequest httpUpdateShowPlaybackControlRequest = (HttpUpdateShowPlaybackControlRequest) mh30VarM20445o.build();
                un51 un51Var = this.f86569a;
                wj50.m88279p(httpUpdateShowPlaybackControlRequest);
                str2 = str;
                f1d0Var.f64872a = str2;
                f1d0Var.f64876e = 1;
                if (un51Var.m83517e(strM35710h, httpUpdateShowPlaybackControlRequest, f1d0Var) == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                String str3 = f1d0Var.f64872a;
                bga.m29073P(objM62844i);
                str2 = str3;
            } else if (i2 == 2) {
                bga.m29073P(objM62844i);
                p2x0Var = (p2x0) objM62844i;
                if (p2x0Var instanceof m2x0) {
                    m2x0Var = (m2x0) p2x0Var;
                } else {
                    m2x0Var = null;
                }
                if (m2x0Var != null || (list = (List) m2x0Var.f139474a) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((dx80) it.next()).f53899c);
                    }
                }
                if (arrayList == 0) {
                    arrayList = lau.f131415a;
                }
                if (!arrayList.isEmpty()) {
                    completableM86176a = this.f86570b.m86176a(arrayList, fgk0.class);
                    f1d0Var.f64872a = null;
                    f1d0Var.f64873b = arrayList;
                    f1d0Var.f64876e = 3;
                    if (zn91.m96565n(completableM86176a, f1d0Var) == yukVar) {
                        r3 = arrayList;
                    } else {
                        r3 = arrayList;
                        f1d0Var.f64872a = null;
                        f1d0Var.f64873b = r3;
                        f1d0Var.f64876e = 4;
                        r4 = r3;
                        if (njg1.m64619l(2000L, f1d0Var) != yukVar) {
                            Set setM43736n1 = g6f.m43736n1(r4);
                            f1d0Var.f64872a = null;
                            f1d0Var.f64873b = null;
                            f1d0Var.f64876e = 5;
                        }
                    }
                    return yukVar;
                }
            } else {
                if (i2 == 3) {
                    List list2 = f1d0Var.f64873b;
                    bga.m29073P(objM62844i);
                    r3 = list2;
                    r3 = arrayList;
                    f1d0Var.f64872a = null;
                    f1d0Var.f64873b = r3;
                    f1d0Var.f64876e = 4;
                    r4 = r3;
                    if (njg1.m64619l(2000L, f1d0Var) != yukVar) {
                        Set setM43736n2 = g6f.m43736n1(r4);
                        f1d0Var.f64872a = null;
                        f1d0Var.f64873b = null;
                        f1d0Var.f64876e = 5;
                    }
                    return yukVar;
                }
                if (i2 == 4) {
                    List list3 = f1d0Var.f64873b;
                    bga.m29073P(objM62844i);
                    r4 = list3;
                    Set setM43736n3 = g6f.m43736n1(r4);
                    f1d0Var.f64872a = null;
                    f1d0Var.f64873b = null;
                    f1d0Var.f64876e = 5;
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM62844i);
                }
            }
            return w2a1.f247311a;
            wt80 wt80Var = this.f86572d;
            ex80 ex80Var = new ex80(str2, new e490(true), null, new b5u0(0, 20), 4);
            f1d0Var.f64872a = null;
            f1d0Var.f64876e = 2;
            objM62844i = ((mu80) wt80Var).m62844i(ex80Var, f1d0Var);
            if (objM62844i != yukVar) {
                p2x0Var = (p2x0) objM62844i;
                if (p2x0Var instanceof m2x0) {
                    m2x0Var = (m2x0) p2x0Var;
                } else {
                    m2x0Var = null;
                }
                if (m2x0Var != null) {
                    arrayList = 0;
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = lau.f131415a;
                }
                if (!arrayList.isEmpty()) {
                    completableM86176a = this.f86570b.m86176a(arrayList, fgk0.class);
                    f1d0Var.f64872a = null;
                    f1d0Var.f64873b = arrayList;
                    f1d0Var.f64876e = 3;
                    if (zn91.m96565n(completableM86176a, f1d0Var) == yukVar) {
                        r3 = arrayList;
                    } else {
                        r3 = arrayList;
                        f1d0Var.f64872a = null;
                        f1d0Var.f64873b = r3;
                        f1d0Var.f64876e = 4;
                        r4 = r3;
                        if (njg1.m64619l(2000L, f1d0Var) != yukVar) {
                            Set setM43736n4 = g6f.m43736n1(r4);
                            f1d0Var.f64872a = null;
                            f1d0Var.f64873b = null;
                            f1d0Var.f64876e = 5;
                        }
                    }
                }
                return w2a1.f247311a;
            }
            return yukVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new c6x0(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m46427k(List list, byte[] bArr, String str, gh00 gh00Var, ibk ibkVar) {
        g1d0 g1d0Var;
        if (ibkVar instanceof g1d0) {
            g1d0Var = (g1d0) ibkVar;
            int i = g1d0Var.f75595c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g1d0Var.f75595c = i - Integer.MIN_VALUE;
            } else {
                g1d0Var = new g1d0(this, ibkVar);
            }
        } else {
            g1d0Var = new g1d0(this, ibkVar);
        }
        Object obj = g1d0Var.f75593a;
        int i2 = g1d0Var.f75595c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                n5q n5qVar = xsr.f265651a;
                tlp tlpVar = tlp.f221498c;
                kp1 kp1Var = new kp1(28, str, list, bArr, gh00Var, (fbk) null);
                g1d0Var.f75595c = 1;
                Object objM89557A = x0h1.m89557A(tlpVar, kp1Var, g1d0Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
