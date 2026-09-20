package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zl00 {

    /* JADX INFO: renamed from: a */
    public final er70 f283882a;

    /* JADX INFO: renamed from: b */
    public final luk f283883b;

    /* JADX INFO: renamed from: c */
    public final wg61 f283884c = new wg61(new nry(this, 13));

    /* JADX INFO: renamed from: d */
    public lg21 f283885d;

    public zl00(er70 er70Var, luk lukVar) {
        this.f283882a = er70Var;
        this.f283883b = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0081 -> B:28:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m96349a(p204p.zl00 r7, p204p.ibk r8) {
        /*
            p.wg61 r0 = r7.f283884c
            boolean r1 = r8 instanceof p204p.wl00
            if (r1 == 0) goto L15
            r1 = r8
            p.wl00 r1 = (p204p.wl00) r1
            int r2 = r1.f252339e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f252339e = r2
            goto L1a
        L15:
            p.wl00 r1 = new p.wl00
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.f252337c
            int r2 = r1.f252339e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r2 = r1.f252336b
            int r4 = r1.f252335a
            p204p.bga.m29073P(r8)
            goto L84
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p204p.bga.m29073P(r8)
            p.lg21 r8 = r7.f283885d
            if (r8 == 0) goto L4d
            p.sy71 r8 = r8.f133058d
            p.zv41 r8 = r8.f215176b
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4d
            p.lg21 r7 = r7.f283885d
            return r7
        L4d:
            r8 = 0
            r2 = 3
            r4 = r2
            r2 = r8
        L51:
            if (r2 >= r4) goto L86
            p.er70 r8 = r7.f283882a
            java.lang.Object r8 = r8.get()
            p.r7i0 r8 = (p204p.r7i0) r8
            java.lang.Object r5 = r0.getValue()
            p.s9p0 r5 = (p204p.s9p0) r5
            r8.mo32673a(r5)
            java.lang.Object r8 = r0.getValue()
            p.s9p0 r8 = (p204p.s9p0) r8
            p.lg21 r8 = r8.m77588a()
            r7.f283885d = r8
            if (r8 == 0) goto L73
            return r8
        L73:
            r1.f252335a = r4
            r1.f252336b = r2
            r1.f252339e = r3
            r5 = 200(0xc8, double:9.9E-322)
            java.lang.Object r8 = p204p.njg1.m64619l(r5, r1)
            p.yuk r5 = p204p.yuk.f276404a
            if (r8 != r5) goto L84
            return r5
        L84:
            int r2 = r2 + r3
            goto L51
        L86:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zl00.m96349a(p.zl00, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static k7i0 m96350b(String str, boolean z) {
        return new k7i0(str, new j7i0(si51.f209361d, null, null, "music-guesser", null, null, 502), z, (i7i0) null, 0L, (h7i0) null, (String) null, true, 0, 760);
    }

    /* JADX INFO: renamed from: c */
    public final Object m96351c(String str, ibk ibkVar) throws Throwable {
        Object objM89557A = x0h1.m89557A(this.f283883b, new xl00(this, str, null, 0), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m96352d(String str, ibk ibkVar) throws Throwable {
        Object objM89557A = x0h1.m89557A(this.f283883b, new dbz(this, str, null, 12), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }
}
