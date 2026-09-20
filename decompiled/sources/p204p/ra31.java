package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ra31 extends s4x0 implements th00 {

    /* JADX INFO: renamed from: b */
    public long[] f197179b;

    /* JADX INFO: renamed from: c */
    public int f197180c;

    /* JADX INFO: renamed from: d */
    public int f197181d;

    /* JADX INFO: renamed from: e */
    public int f197182e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f197183f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ sa31 f197184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra31(sa31 sa31Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f197184g = sa31Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        ra31 ra31Var = new ra31(this.f197184g, fbkVar);
        ra31Var.f197183f = obj;
        return ra31Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((ra31) create((vsz0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:37:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0097
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.ly8
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            p.sa31 r1 = r0.f197184g
            long r2 = r1.f207126a
            long r4 = r1.f207128c
            long r6 = r1.f207127b
            int r8 = r0.f197182e
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            p.yuk r11 = p204p.yuk.f276404a
            if (r8 == 0) goto L4d
            if (r8 == r10) goto L3e
            if (r8 == r13) goto L34
            if (r8 != r12) goto L2c
            int r1 = r0.f197180c
            java.lang.Object r6 = r0.f197183f
            p.vsz0 r6 = (p204p.vsz0) r6
            p204p.bga.m29073P(r23)
            r7 = r12
            goto Lbf
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r1 = r0.f197180c
            java.lang.Object r8 = r0.f197183f
            p.vsz0 r8 = (p204p.vsz0) r8
            p204p.bga.m29073P(r23)
            goto L95
        L3e:
            int r1 = r0.f197181d
            int r8 = r0.f197180c
            long[] r15 = r0.f197179b
            java.lang.Object r12 = r0.f197183f
            p.vsz0 r12 = (p204p.vsz0) r12
            p204p.bga.m29073P(r23)
            int r8 = r8 + r10
            goto L5b
        L4d:
            p204p.bga.m29073P(r23)
            java.lang.Object r8 = r0.f197183f
            r12 = r8
            p.vsz0 r12 = (p204p.vsz0) r12
            long[] r15 = r1.f207129d
            if (r15 == 0) goto L72
            int r1 = r15.length
            r8 = 0
        L5b:
            if (r8 >= r1) goto L72
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f197183f = r12
            r0.f197179b = r15
            r0.f197180c = r8
            r0.f197181d = r1
            r0.f197182e = r10
            r12.m86367b(r4, r0)
            return r11
        L72:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r12
            r1 = 0
        L78:
            if (r1 >= r14) goto L97
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L95
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f197183f = r8
            r0.f197179b = r9
            r0.f197180c = r1
            r0.f197182e = r13
            r8.m86367b(r2, r0)
            return r11
        L95:
            int r1 = r1 + r10
            goto L78
        L97:
            r12 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc2
            r6 = r12
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc2
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbd
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f197183f = r6
            r0.f197179b = r9
            r0.f197180c = r15
            r7 = 3
            r0.f197182e = r7
            r6.m86367b(r1, r0)
            return r11
        Lbd:
            r7 = 3
            r1 = r15
        Lbf:
            int r15 = r1 + 1
            goto L9e
        Lc2:
            p.w2a1 r1 = p204p.w2a1.f247311a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ra31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
