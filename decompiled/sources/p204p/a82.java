package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a82 {

    /* JADX INFO: renamed from: a */
    public final d4e f13171a;

    /* JADX INFO: renamed from: b */
    public final z3e f13172b;

    /* JADX INFO: renamed from: c */
    public final f1b0 f13173c;

    public a82(d4e d4eVar, z3e z3eVar, f1b0 f1b0Var) {
        this.f13171a = d4eVar;
        this.f13172b = z3eVar;
        this.f13173c = f1b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[PHI: r1 r8
      0x005a: PHI (r1v6 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:29:0x0057, B:46:0x009e, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r8v6 long) = (r8v0 long), (r8v4 long), (r8v9 long) binds: [B:29:0x0057, B:46:0x009e, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[Catch: Exception -> 0x003e, CancellationException -> 0x0040, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0040, Exception -> 0x003e, blocks: (B:32:0x0064, B:35:0x0073, B:42:0x0084, B:16:0x003a), top: B:51:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073 A[Catch: Exception -> 0x003e, CancellationException -> 0x0040, PHI: r1 r8 r10
      0x0073: PHI (r1v5 java.lang.String) = (r1v6 java.lang.String), (r1v7 java.lang.String) binds: [B:33:0x0070, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r8v5 long) = (r8v6 long), (r8v7 long) binds: [B:33:0x0070, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r10v10 java.lang.Object) = (r10v18 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x0070, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0040, Exception -> 0x003e, blocks: (B:32:0x0064, B:35:0x0073, B:42:0x0084, B:16:0x003a), top: B:51:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084 A[Catch: Exception -> 0x003e, CancellationException -> 0x0040, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0040, Exception -> 0x003e, blocks: (B:32:0x0064, B:35:0x0073, B:42:0x0084, B:16:0x003a), top: B:51:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x009e -> B:30:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m25008a(long r8, p204p.ibk r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p204p.z72
            if (r0 == 0) goto L13
            r0 = r10
            p.z72 r0 = (p204p.z72) r0
            int r1 = r0.f280077e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280077e = r1
            goto L18
        L13:
            p.z72 r0 = new p.z72
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f280075c
            int r1 = r0.f280077e
            r2 = 1
            r3 = 2
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 == 0) goto L42
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2e
            long r8 = r0.f280073a
            java.lang.String r1 = r0.f280074b
            p204p.bga.m29073P(r10)
            goto L5a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            long r8 = r0.f280073a
            java.lang.String r1 = r0.f280074b
            p204p.bga.m29073P(r10)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            goto L73
        L3e:
            r10 = move-exception
            goto L8c
        L40:
            r8 = move-exception
            goto La1
        L42:
            p204p.bga.m29073P(r10)
            p.d4e r10 = r7.f13171a
            p.e4e r10 = (p204p.e4e) r10
            p.c4e r10 = r10.m37771b()
            if (r10 == 0) goto La2
            int r1 = r10.f33928a
            if (r1 != r3) goto L54
            goto L55
        L54:
            r10 = 0
        L55:
            if (r10 == 0) goto La2
            java.lang.String r10 = r10.f33929b
            r1 = r10
        L5a:
            p.juk r10 = r0.getContext()
            boolean r10 = p204p.qlg1.m73191G(r10)
            if (r10 == 0) goto La2
            p.z3e r10 = r7.f13172b     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            r0.f280074b = r1     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            r0.f280073a = r8     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            r0.f280077e = r2     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            java.lang.Object r10 = r10.m95271b(r1, r0)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            if (r10 != r4) goto L73
            goto La0
        L73:
            p.vxm0 r10 = (p204p.vxm0) r10     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            int r10 = r10.f245787f     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            int r10 = p204p.edb.m38547C(r10)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            if (r10 == r3) goto L84
            r5 = 3
            if (r10 == r5) goto La2
            r5 = 4
            if (r10 == r5) goto L84
            goto L94
        L84:
            p.f1b0 r10 = r7.f13173c     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            p.sh7 r5 = p204p.sh7.f209121N0     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            r10.m40532a(r5)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L40
            goto La2
        L8c:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "AgeAssurance session poll failed"
            com.spotify.base.java.logging.Logger.m3967c(r10, r6, r5)
        L94:
            r0.f280074b = r1
            r0.f280073a = r8
            r0.f280077e = r3
            java.lang.Object r10 = p204p.njg1.m64619l(r8, r0)
            if (r10 != r4) goto L5a
        La0:
            return r4
        La1:
            throw r8
        La2:
            p.w2a1 r8 = p204p.w2a1.f247311a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.a82.m25008a(long, p.ibk):java.lang.Object");
    }
}
