package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class eqi0 extends s4x0 implements th00 {

    /* JADX INFO: renamed from: X */
    public /* synthetic */ Object f61896X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ fqi0 f61897Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ j310 f61898Z;

    /* JADX INFO: renamed from: b */
    public j310 f61899b;

    /* JADX INFO: renamed from: c */
    public fqi0 f61900c;

    /* JADX INFO: renamed from: d */
    public long[] f61901d;

    /* JADX INFO: renamed from: e */
    public int f61902e;

    /* JADX INFO: renamed from: f */
    public int f61903f;

    /* JADX INFO: renamed from: g */
    public int f61904g;

    /* JADX INFO: renamed from: h */
    public int f61905h;

    /* JADX INFO: renamed from: i */
    public long f61906i;

    /* JADX INFO: renamed from: t */
    public int f61907t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqi0(fqi0 fqi0Var, j310 j310Var, fbk fbkVar) {
        super(2, fbkVar);
        this.f61897Y = fqi0Var;
        this.f61898Z = j310Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        eqi0 eqi0Var = new eqi0(this.f61897Y, this.f61898Z, fbkVar);
        eqi0Var.f61896X = obj;
        return eqi0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((eqi0) create((vsz0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009a  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p204p.ly8
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f61907t
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f61905h
            int r5 = r0.f61904g
            long r6 = r0.f61906i
            int r8 = r0.f61903f
            int r9 = r0.f61902e
            long[] r10 = r0.f61901d
            p.fqi0 r11 = r0.f61900c
            p.j310 r12 = r0.f61899b
            java.lang.Object r13 = r0.f61896X
            p.vsz0 r13 = (p204p.vsz0) r13
            p204p.bga.m29073P(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            p204p.bga.m29073P(r21)
            java.lang.Object r1 = r0.f61896X
            p.vsz0 r1 = (p204p.vsz0) r1
            p.fqi0 r5 = r0.f61897Y
            p.dqi0 r6 = r5.f72225b
            long[] r6 = r6.f52018a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            p.j310 r8 = r0.f61898Z
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f108259b = r2
            p.dqi0 r3 = r11.f72225b
            java.lang.Object[] r3 = r3.f52019b
            r2 = r3[r2]
            r0.f61896X = r13
            r0.f61899b = r12
            r0.f61900c = r11
            r0.f61901d = r10
            r0.f61902e = r9
            r0.f61903f = r8
            r0.f61906i = r6
            r0.f61904g = r5
            r0.f61905h = r1
            r0.f61907t = r4
            r13.m86367b(r2, r0)
            p.yuk r1 = p204p.yuk.f276404a
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            p.w2a1 r1 = p204p.w2a1.f247311a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.eqi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
