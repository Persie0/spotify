package p204p;

import androidx.compose.p002ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ods {

    /* JADX INFO: renamed from: a */
    public static final float f164240a = ((float) 0.125d) / 18;

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[LOOP:0: B:23:0x0069->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0081 A[EDGE_INSN: B:54:0x0081->B:29:0x0081 BREAK  A[LOOP:0: B:23:0x0069->B:27:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:22:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m66758a(p204p.sb61 r12, long r13, p204p.ibk r15) {
        /*
            boolean r0 = r15 instanceof p204p.ycs
            if (r0 == 0) goto L13
            r0 = r15
            p.ycs r0 = (p204p.ycs) r0
            int r1 = r0.f271555d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271555d = r1
            goto L18
        L13:
            p.ycs r0 = new p.ycs
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f271554c
            int r1 = r0.f271555d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            p.qlv0 r12 = r0.f271553b
            p.sb61 r13 = r0.f271552a
            p204p.bga.m29073P(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5f
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            p204p.bga.m29073P(r15)
            p.ub61 r15 = r12.f207370e
            p.e6q0 r15 = r15.f228642R0
            boolean r15 = m66772o(r15, r13)
            if (r15 == 0) goto L44
            goto Lc4
        L44:
            p.qlv0 r15 = new p.qlv0
            r15.<init>()
            r15.f189932a = r13
        L4b:
            r0.f271552a = r12
            r0.f271553b = r15
            r0.f271555d = r2
            p.f6q0 r13 = p204p.f6q0.f66486b
            java.lang.Object r13 = r12.m77709a(r13, r0)
            p.yuk r14 = p204p.yuk.f276404a
            if (r13 != r14) goto L5c
            return r14
        L5c:
            r11 = r15
            r15 = r13
            r13 = r11
        L5f:
            p.e6q0 r15 = (p204p.e6q0) r15
            java.lang.Object r14 = r15.f56704a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L69:
            if (r5 >= r1) goto L80
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            p.k6q0 r7 = (p204p.k6q0) r7
            long r7 = r7.f119810a
            long r9 = r13.f189932a
            boolean r7 = p204p.pzb0.m71717o(r7, r9)
            if (r7 == 0) goto L7d
            goto L81
        L7d:
            int r5 = r5 + 1
            goto L69
        L80:
            r6 = r3
        L81:
            p.k6q0 r6 = (p204p.k6q0) r6
            if (r6 != 0) goto L87
            r6 = r3
            goto Lbb
        L87:
            boolean r14 = p204p.ex60.m40178l(r6)
            if (r14 == 0) goto Laf
            java.lang.Object r14 = r15.f56704a
            int r15 = r14.size()
        L93:
            if (r4 >= r15) goto La4
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            p.k6q0 r5 = (p204p.k6q0) r5
            boolean r5 = r5.f119813d
            if (r5 == 0) goto La1
            goto La5
        La1:
            int r4 = r4 + 1
            goto L93
        La4:
            r1 = r3
        La5:
            p.k6q0 r1 = (p204p.k6q0) r1
            if (r1 != 0) goto Laa
            goto Lbb
        Laa:
            long r14 = r1.f119810a
            r13.f189932a = r14
            goto Lc5
        Laf:
            long r14 = p204p.ex60.m40190x(r6, r2)
            r4 = 0
            boolean r14 = androidx.compose.p002ui.geometry.Offset.m253c(r14, r4)
            if (r14 != 0) goto Lc5
        Lbb:
            if (r6 == 0) goto Lc4
            boolean r12 = r6.m55612l()
            if (r12 != 0) goto Lc4
            return r6
        Lc4:
            return r3
        Lc5:
            r15 = r13
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66758a(p.sb61, long, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[LOOP:0: B:23:0x0069->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0081 A[EDGE_INSN: B:54:0x0081->B:29:0x0081 BREAK  A[LOOP:0: B:23:0x0069->B:27:0x007d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:22:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public static final java.lang.Object m66759b(p204p.sb61 r12, long r13, p204p.ly8 r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66759b(p.sb61, long, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3 A[LOOP:0: B:26:0x00be->B:30:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc A[EDGE_INSN: B:68:0x00dc->B:32:0x00dc BREAK  A[LOOP:0: B:26:0x00be->B:30:0x00d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0170 -> B:62:0x0176). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m66760c(p204p.sb61 r18, long r19, int r21, p204p.th00 r22, p204p.ly8 r23) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66760c(p.sb61, long, int, p.th00, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d1 A[LOOP:0: B:26:0x00bc->B:30:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00da A[EDGE_INSN: B:68:0x00da->B:32:0x00da BREAK  A[LOOP:0: B:26:0x00bc->B:30:0x00d1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016e -> B:62:0x0174). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public static final java.lang.Object m66761d(p204p.sb61 r18, long r19, p204p.th00 r21, p204p.ly8 r22) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66761d(p.sb61, long, p.th00, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [p.rlv0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: e */
    public static final Object m66762e(sb61 sb61Var, long j, ly8 ly8Var) {
        cds cdsVar;
        Object obj;
        k6q0 k6q0Var;
        nlv0 nlv0Var;
        if (ly8Var instanceof cds) {
            cdsVar = (cds) ly8Var;
            int i = cdsVar.f36942e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cdsVar.f36942e = i - Integer.MIN_VALUE;
            } else {
                cdsVar = new cds(ly8Var);
            }
        } else {
            cdsVar = new cds(ly8Var);
        }
        Object obj2 = cdsVar.f36941d;
        int i2 = cdsVar.f36942e;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                if (!m66772o(sb61Var.f207370e.f228642R0, j)) {
                    ?? r11 = sb61Var.f207370e.f228642R0.f56704a;
                    int size = r11.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r11.get(i3);
                        if (pzb0.m71717o(((k6q0) obj).f119810a, j)) {
                            break;
                        }
                        i3++;
                    }
                    k6q0Var = (k6q0) obj;
                    if (k6q0Var != null) {
                        rlv0 rlv0Var = new rlv0();
                        rlv0 rlv0Var2 = new rlv0();
                        rlv0Var2.f200373a = k6q0Var;
                        long jMo51231b = sb61Var.m77711c().mo51231b();
                        nlv0 nlv0Var2 = new nlv0();
                        th00 ddsVar = new dds(nlv0Var2, rlv0Var2, rlv0Var, null);
                        cdsVar.f36938a = k6q0Var;
                        cdsVar.f36939b = rlv0Var;
                        cdsVar.f36940c = nlv0Var2;
                        cdsVar.f36942e = 1;
                        Object objM77712d = sb61Var.m77712d(jMo51231b, ddsVar, cdsVar);
                        Object obj3 = yuk.f276404a;
                        if (objM77712d == obj3) {
                            return obj3;
                        }
                        nlv0Var = nlv0Var2;
                        j = rlv0Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nlv0Var = cdsVar.f36940c;
            rlv0 rlv0Var3 = cdsVar.f36939b;
            k6q0Var = cdsVar.f36938a;
            bga.m29073P(obj2);
            j = rlv0Var3;
            if (nlv0Var.f155174a) {
                k6q0 k6q0Var2 = (k6q0) j.f200373a;
                return k6q0Var2 == null ? k6q0Var : k6q0Var2;
            }
            return null;
        } catch (PointerEventTimeoutCancellationException unused) {
            k6q0 k6q0Var3 = (k6q0) j.f200373a;
            return k6q0Var3 == null ? k6q0Var : k6q0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf A[LOOP:0: B:26:0x00ba->B:30:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8 A[EDGE_INSN: B:68:0x00d8->B:32:0x00d8 BREAK  A[LOOP:0: B:26:0x00ba->B:30:0x00cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0163 -> B:62:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public static final java.lang.Object m66763f(p204p.sb61 r18, long r19, p204p.nk4 r21, p204p.ly8 r22) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66763f(p.sb61, long, p.nk4, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3 A[LOOP:0: B:26:0x00be->B:30:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc A[EDGE_INSN: B:68:0x00dc->B:32:0x00dc BREAK  A[LOOP:0: B:26:0x00be->B:30:0x00d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0173 -> B:62:0x0179). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public static final java.lang.Object m66764g(p204p.sb61 r18, long r19, int r21, p204p.jds r22, p204p.ly8 r23) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66764g(p.sb61, long, int, p.jds, p.ly8):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    public static final Object m66765h(fbk fbkVar, eh00 eh00Var, eh00 eh00Var2, gh00 gh00Var, th00 th00Var, o6q0 o6q0Var) {
        Object objM95926g = zdg1.m95926g(o6q0Var, new gds(new w73(13), new gqb(1, gh00Var), th00Var, eh00Var2, new t45(2, eh00Var), null), fbkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM95926g != yukVar) {
            objM95926g = w2a1Var;
        }
        return objM95926g == yukVar ? objM95926g : w2a1Var;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m66766i(o6q0 o6q0Var, gh00 gh00Var, eh00 eh00Var, th00 th00Var, fbk fbkVar, int i) {
        if ((i & 1) != 0) {
            gh00Var = new C2126mg(22);
        }
        gh00 gh00Var2 = gh00Var;
        if ((i & 2) != 0) {
            eh00Var = new w73(12);
        }
        return m66765h(fbkVar, eh00Var, new w73(12), gh00Var2, th00Var, o6q0Var);
    }

    /* JADX INFO: renamed from: j */
    public static final Object m66767j(fbk fbkVar, eh00 eh00Var, eh00 eh00Var2, gh00 gh00Var, th00 th00Var, o6q0 o6q0Var) {
        Object objM95926g = zdg1.m95926g(o6q0Var, new gds((fbk) null, eh00Var, eh00Var2, gh00Var, th00Var), fbkVar);
        return objM95926g == yuk.f276404a ? objM95926g : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m66768k(o6q0 o6q0Var, gh00 gh00Var, eh00 eh00Var, th00 th00Var, fbk fbkVar, int i) {
        if ((i & 1) != 0) {
            gh00Var = new C2126mg(22);
        }
        return m66767j(fbkVar, eh00Var, new w73(12), gh00Var, th00Var, o6q0Var);
    }

    /* JADX INFO: renamed from: l */
    public static Object m66769l(o6q0 o6q0Var, gh00 gh00Var, eh00 eh00Var, th00 th00Var, fbk fbkVar) {
        Object objM95926g = zdg1.m95926g(o6q0Var, new gds(gh00Var, th00Var, eh00Var, new w73(12), (fbk) null), fbkVar);
        return objM95926g == yuk.f276404a ? objM95926g : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: m */
    public static final java.lang.Object m66770m(p204p.sb61 r4, long r5, p204p.gh00 r7, p204p.ly8 r8) {
        /*
            boolean r0 = r8 instanceof p204p.kds
            if (r0 == 0) goto L13
            r0 = r8
            p.kds r0 = (p204p.kds) r0
            int r1 = r0.f121732d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121732d = r1
            goto L18
        L13:
            p.kds r0 = new p.kds
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f121731c
            int r1 = r0.f121732d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            p.gh00 r4 = r0.f121730b
            p.sb61 r5 = r0.f121729a
            p204p.bga.m29073P(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            p204p.bga.m29073P(r8)
        L36:
            r0.f121729a = r4
            r0.f121730b = r7
            r0.f121732d = r2
            java.lang.Object r8 = m66758a(r4, r5, r0)
            p.yuk r5 = p204p.yuk.f276404a
            if (r8 != r5) goto L45
            return r5
        L45:
            p.k6q0 r8 = (p204p.k6q0) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = p204p.ex60.m40178l(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f119810a
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66770m(p.sb61, long, p.gh00, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[LOOP:0: B:24:0x0087->B:28:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x009f A[EDGE_INSN: B:72:0x009f->B:30:0x009f BREAK  A[LOOP:0: B:24:0x0087->B:28:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:23:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: n */
    public static final java.lang.Object m66771n(p204p.sb61 r17, long r18, p204p.gh00 r20, p204p.ly8 r21) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66771n(p.sb61, long, p.gh00, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: o */
    public static final boolean m66772o(e6q0 e6q0Var, long j) {
        Object obj;
        ?? r6 = e6q0Var.f56704a;
        int size = r6.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (pzb0.m71717o(((k6q0) obj).f119810a, j)) {
                break;
            }
            i++;
        }
        k6q0 k6q0Var = (k6q0) obj;
        if (k6q0Var != null && k6q0Var.f119813d) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX INFO: renamed from: p */
    public static final float m66773p(pec1 pec1Var, int i) {
        return i == 2 ? pec1Var.mo51233g() * f164240a : pec1Var.mo51233g();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0451 -> B:92:0x03ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x048f -> B:165:0x0602). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05ec -> B:162:0x05f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0616 -> B:166:0x0603). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x0682 -> B:180:0x068a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x024b -> B:32:0x024e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02f1 -> B:32:0x024e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x034b -> B:78:0x03ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a5 -> B:75:0x03ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: q */
    public static final java.lang.Object m66774q(p204p.sb61 r28, p204p.k6q0 r29, p204p.w73 r30, p204p.gqb r31, p204p.th00 r32, p204p.eh00 r33, p204p.t45 r34, p204p.ly8 r35) {
        /*
            Method dump skipped, instruction units count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66774q(p.sb61, p.k6q0, p.w73, p.gqb, p.th00, p.eh00, p.t45, p.ly8):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e A[LOOP:0: B:25:0x0088->B:29:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a7 A[EDGE_INSN: B:73:0x00a7->B:31:0x00a7 BREAK  A[LOOP:0: B:25:0x0088->B:29:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:24:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: r */
    public static final java.lang.Object m66775r(p204p.sb61 r17, long r18, p204p.hds r20, p204p.ly8 r21) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ods.m66775r(p.sb61, long, p.hds, p.ly8):java.lang.Object");
    }
}
