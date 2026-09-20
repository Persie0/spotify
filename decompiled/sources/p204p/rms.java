package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rms implements dut {

    /* JADX INFO: renamed from: a */
    public final e940 f200608a;

    /* JADX INFO: renamed from: b */
    public final boolean f200609b;

    /* JADX INFO: renamed from: c */
    public final xiz f200610c;

    /* JADX INFO: renamed from: d */
    public final j2a1 f200611d = new j2a1();

    /* JADX INFO: renamed from: e */
    public final cph f200612e;

    public rms(e940 e940Var, boolean z) {
        this.f200608a = e940Var;
        this.f200609b = z;
        int i = 3;
        this.f200610c = axf1.m27398m(new mcs(this, i), jks.f113403i, pks.f178538c, null, null, 24);
        fyf fyfVar = new fyf(new m7q(this, 18), true, -670035520);
        wpi0 wpi0Var = xwt.f266743a;
        this.f200612e = new cph(fyfVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008b -> B:24:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e */
    public static final java.lang.Object m75974e(p204p.rms r9, java.util.Map r10, p204p.ibk r11) {
        /*
            boolean r0 = r11 instanceof p204p.qms
            if (r0 == 0) goto L13
            r0 = r11
            p.qms r0 = (p204p.qms) r0
            int r1 = r0.f190395i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190395i = r1
            goto L18
        L13:
            p.qms r0 = new p.qms
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f190393g
            int r1 = r0.f190395i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            int r10 = r0.f190392f
            int r1 = r0.f190391e
            int r4 = r0.f190390d
            java.lang.String r5 = r0.f190389c
            java.util.Iterator r6 = r0.f190388b
            java.util.Collection r7 = r0.f190387a
            java.util.Collection r7 = (java.util.Collection) r7
            p204p.bga.m29073P(r11)     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            goto L8e
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.util.ArrayList r11 = p204p.yds.m93485o(r11)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r6 = r10
            r7 = r11
            r10 = r3
            r1 = r10
            r4 = r1
        L4d:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L9d
            java.lang.Object r11 = r6.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r5 = r11.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            p.e940 r8 = r9.f200608a     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            p.lxe r11 = r8.mo24613j(r11)     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r11.f137801g = r3     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            io.reactivex.rxjava3.core.Single r11 = r11.m60183i()     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.getClass()     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190387a = r8     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190388b = r6     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190389c = r5     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190390d = r4     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190391e = r1     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190392f = r10     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r0.f190395i = r2     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            java.lang.Object r11 = p204p.zn91.m96567o(r11, r0)     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            p.yuk r8 = p204p.yuk.f276404a
            if (r11 != r8) goto L8e
            goto La3
        L8e:
            p.pqm0 r8 = new p.pqm0     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            r8.<init>(r5, r11)     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> L9b
            goto L95
        L94:
            r8 = 0
        L95:
            if (r8 == 0) goto L4d
            r7.add(r8)
            goto L4d
        L9b:
            r9 = move-exception
            throw r9
        L9d:
            java.util.List r7 = (java.util.List) r7
            java.util.Map r8 = p204p.kkc0.m56705r0(r7)
        La3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.rms.m75974e(p.rms, java.util.Map, p.ibk):java.lang.Object");
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f200611d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f200612e;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f200610c;
    }
}
