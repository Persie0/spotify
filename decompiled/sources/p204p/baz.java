package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class baz implements em7 {

    /* JADX INFO: renamed from: a */
    public final dmu f25361a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f25362b;

    /* JADX INFO: renamed from: c */
    public final l6n0 f25363c;

    /* JADX INFO: renamed from: d */
    public final c9k f25364d;

    public baz(dmu dmuVar, qwx0 qwx0Var, l6n0 l6n0Var, luk lukVar) {
        this.f25361a = dmuVar;
        this.f25362b = qwx0Var;
        this.f25363c = l6n0Var;
        this.f25364d = kk40.m56661c(cct.m32296A(lukVar, new uuk("FirebaseAnalyticsManager")));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m28601b(baz bazVar, ibk ibkVar) {
        z9z z9zVar;
        if (ibkVar instanceof z9z) {
            z9zVar = (z9z) ibkVar;
            int i = z9zVar.f280935c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9zVar.f280935c = i - Integer.MIN_VALUE;
            } else {
                z9zVar = new z9z(bazVar, ibkVar);
            }
        } else {
            z9zVar = new z9z(bazVar, ibkVar);
        }
        Object obj = z9zVar.f280933a;
        int i2 = z9zVar.f280935c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        yab yabVarM54985d = k0e1.m54985d(((rwx0) bazVar.f25362b).m76591b("allow-advertising-id-transmission").map(t6x0.f217627T0));
        z9zVar.f280935c = 1;
        Object objM86755t = vyf1.m86755t(yabVarM54985d, z9zVar);
        yuk yukVar = yuk.f276404a;
        return objM86755t == yukVar ? yukVar : objM86755t;
    }

    @Override // p204p.em7
    /* JADX INFO: renamed from: a */
    public final void mo24337a(sk7 sk7Var) {
        x0h1.m89578u(this.f25364d, null, 0, new nd0(this, sk7Var, null, 15), 3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:19:0x0042, B:22:0x0057, B:16:0x003a), top: B:31:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0064 -> B:27:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final java.lang.Object m28602c(long r8, p204p.ibk r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p204p.aaz
            if (r0 == 0) goto L13
            r0 = r10
            p.aaz r0 = (p204p.aaz) r0
            int r1 = r0.f13955e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13955e = r1
            goto L18
        L13:
            p.aaz r0 = new p.aaz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f13953c
            int r1 = r0.f13955e
            r2 = 1
            r3 = 2
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2e
            long r8 = r0.f13951a
            p.baz r1 = r0.f13952b
            p204p.bga.m29073P(r10)
            goto L67
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r8 = r0.f13951a
            p.baz r1 = r0.f13952b
            p204p.bga.m29073P(r10)     // Catch: java.lang.Exception -> L5a
            goto L57
        L3e:
            p204p.bga.m29073P(r10)
            r1 = r7
        L42:
            p.l6n0 r10 = r1.f25363c     // Catch: java.lang.Exception -> L5a
            p.k6n0 r5 = p204p.k6n0.GOOGLE_ANALYTICS     // Catch: java.lang.Exception -> L5a
            io.reactivex.rxjava3.core.Single r10 = r10.m58378a(r5)     // Catch: java.lang.Exception -> L5a
            r0.f13952b = r1     // Catch: java.lang.Exception -> L5a
            r0.f13951a = r8     // Catch: java.lang.Exception -> L5a
            r0.f13955e = r2     // Catch: java.lang.Exception -> L5a
            java.lang.Object r10 = p204p.zn91.m96567o(r10, r0)     // Catch: java.lang.Exception -> L5a
            if (r10 != r4) goto L57
            goto L66
        L57:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L5a
            goto L68
        L5a:
            r0.f13952b = r1
            r0.f13951a = r8
            r0.f13955e = r3
            java.lang.Object r10 = p204p.njg1.m64619l(r8, r0)
            if (r10 != r4) goto L67
        L66:
            return r4
        L67:
            r10 = 0
        L68:
            if (r10 != 0) goto L6d
            long r5 = (long) r3
            long r8 = r8 * r5
            goto L42
        L6d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.baz.m28602c(long, p.ibk):java.lang.Object");
    }
}
