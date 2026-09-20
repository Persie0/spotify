package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class yw81 implements dn81 {

    /* JADX INFO: renamed from: a */
    public final z6m f276918a;

    /* JADX INFO: renamed from: b */
    public final h7u f276919b;

    /* JADX INFO: renamed from: c */
    public final boolean f276920c;

    /* JADX INFO: renamed from: d */
    public final long f276921d;

    /* JADX INFO: renamed from: e */
    public final wg61 f276922e;

    /* JADX INFO: renamed from: f */
    public final tjo f276923f;

    public yw81(opx opxVar, bb3 bb3Var, z6m z6mVar, h7u h7uVar) {
        v7z0 v7z0Var = new v7z0(opxVar, 14);
        boolean zM46912e = ((ha4) bb3Var.f25411a.getValue()).m46912e();
        this.f276918a = z6mVar;
        this.f276919b = h7uVar;
        this.f276920c = zM46912e;
        this.f276921d = 5000L;
        this.f276922e = new wg61(v7z0Var);
        this.f276923f = pag1.m69487w(new rko(new jqx(qpv0.f191387a.mo54112b(us6.class)), 1, qp81.f191204a1, new pko(qp81.f191201Y0), qp81.f191206b1), qp81.f191203Z0);
    }

    @Override // p204p.dn81
    /* JADX INFO: renamed from: a */
    public final Single mo36056a(List list) {
        return mo36057b(list).map(pnq0.f179492V0).map(new w3y0(list)).onErrorReturn(new i08(3, list));
    }

    @Override // p204p.dn81
    /* JADX INFO: renamed from: b */
    public final Single mo36057b(List list) {
        if (list.isEmpty()) {
            Single singleJust = Single.just(nau.f152117a);
            wj50.m88279p(singleJust);
            return singleJust;
        }
        Single singleOnErrorReturn = vjf1.m85770t(dau.f47107a, new xw61(list, this, (fbk) null, 17)).onErrorReturn(onq0.f167324S0);
        wj50.m88279p(singleOnErrorReturn);
        return singleOnErrorReturn;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: Exception -> 0x0034, CancellationException -> 0x0037, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0037, Exception -> 0x0034, blocks: (B:12:0x002f, B:40:0x00af, B:33:0x008a, B:35:0x0090, B:29:0x006e, B:32:0x007f), top: B:46:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ae -> B:40:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m94784c(java.util.ArrayList r9, p204p.ibk r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p204p.vw81
            if (r0 == 0) goto L13
            r0 = r10
            p.vw81 r0 = (p204p.vw81) r0
            int r1 = r0.f245438i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245438i = r1
            goto L18
        L13:
            p.vw81 r0 = new p.vw81
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f245436g
            int r1 = r0.f245438i
            p.nau r2 = p204p.nau.f152117a
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 != r3) goto L3a
            int r9 = r0.f245435f
            int r1 = r0.f245434e
            java.lang.Object r4 = r0.f245433d
            java.util.Map r5 = r0.f245432c
            java.util.Iterator r6 = r0.f245431b
            java.util.Map r7 = r0.f245430a
            p204p.bga.m29073P(r10)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            goto Laf
        L34:
            r9 = move-exception
            goto Lb7
        L37:
            r9 = move-exception
            goto Lc1
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            p204p.bga.m29073P(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r9.next()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            p.z6m r5 = r8.f276918a
            boolean r4 = r5.m95510a(r4)
            if (r4 == 0) goto L4e
            r10.add(r1)
            goto L4e
        L67:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L6e
            return r2
        L6e:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r1 = 10
            int r1 = p204p.i6f.m49804T(r10, r1)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            int r1 = p204p.c95.m31820L(r1)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r4 = 16
            if (r1 >= r4) goto L7f
            r1 = r4
        L7f:
            r9.<init>(r1)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r1 = 0
            r5 = r9
            r6 = r10
            r9 = r1
        L8a:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            if (r10 == 0) goto Lb6
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245430a = r5     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245431b = r6     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245432c = r5     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245433d = r4     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245434e = r1     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245435f = r9     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r0.f245438i = r3     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            java.lang.Object r10 = r8.m94786e(r10, r0)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            p.yuk r7 = p204p.yuk.f276404a
            if (r10 != r7) goto Lae
            return r7
        Lae:
            r7 = r5
        Laf:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r5.put(r4, r10)     // Catch: java.lang.Exception -> L34 java.util.concurrent.CancellationException -> L37
            r5 = r7
            goto L8a
        Lb6:
            return r5
        Lb7:
            java.lang.String r10 = "TraitResolver: Failed to resolve curation trait URI associations"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.spotify.base.java.logging.Logger.m3966b(r10, r9)
            return r2
        Lc1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.yw81.m94784c(java.util.ArrayList, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m94785d(String str, ibk ibkVar) {
        ww81 ww81Var;
        if (ibkVar instanceof ww81) {
            ww81Var = (ww81) ibkVar;
            int i = ww81Var.f255732c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww81Var.f255732c = i - Integer.MIN_VALUE;
            } else {
                ww81Var = new ww81(this, ibkVar);
            }
        } else {
            ww81Var = new ww81(this, ibkVar);
        }
        Object objM76980u = ww81Var.f255730a;
        int i2 = ww81Var.f255732c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                long j = this.f276921d;
                uw81 uw81Var = new uw81(this, str, fbkVar, 1);
                ww81Var.f255732c = 1;
                objM76980u = s1h1.m76980u(j, uw81Var, ww81Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            return (String) objM76980u;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m94786e(String str, ibk ibkVar) {
        xw81 xw81Var;
        String str2;
        if (ibkVar instanceof xw81) {
            xw81Var = (xw81) ibkVar;
            int i = xw81Var.f266617c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw81Var.f266617c = i - Integer.MIN_VALUE;
            } else {
                xw81Var = new xw81(this, ibkVar);
            }
        } else {
            xw81Var = new xw81(this, ibkVar);
        }
        Object objM46805w = xw81Var.f266615a;
        int i2 = xw81Var.f266617c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM46805w);
                h7u h7uVar = this.f276919b;
                xw81Var.f266617c = 1;
                objM46805w = h7uVar.m46805w(str, "aligned_curation", xw81Var);
                yuk yukVar = yuk.f276404a;
                if (objM46805w == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46805w);
            }
            n4m n4mVar = (n4m) objM46805w;
            if (n4mVar == null || (str2 = n4mVar.f150383a) == null || str2.length() == 0) {
                return null;
            }
            return str2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }
}
