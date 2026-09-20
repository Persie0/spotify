package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cu61 {

    /* JADX INFO: renamed from: a */
    public static final ww0 f42066a = new ww0(3, 28, null);

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m33879a(p204p.sb61 r5, boolean r6, p204p.f6q0 r7, p204p.fbk r8) {
        /*
            boolean r0 = r8 instanceof p204p.tt61
            if (r0 == 0) goto L13
            r0 = r8
            p.tt61 r0 = (p204p.tt61) r0
            int r1 = r0.f223546e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f223546e = r1
            goto L18
        L13:
            p.tt61 r0 = new p.tt61
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f223545d
            int r1 = r0.f223546e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.f223544c
            p.f6q0 r6 = r0.f223543b
            p.sb61 r7 = r0.f223542a
            p204p.bga.m29073P(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p204p.bga.m29073P(r8)
        L3a:
            r0.f223542a = r5
            r0.f223543b = r7
            r0.f223544c = r6
            r0.f223546e = r2
            java.lang.Object r8 = r5.m77709a(r7, r0)
            p.yuk r1 = p204p.yuk.f276404a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            p.e6q0 r8 = (p204p.e6q0) r8
            boolean r1 = m33884f(r8, r6)
            if (r1 == 0) goto L3a
            java.lang.Object r5 = r8.f56704a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.cu61.m33879a(p.sb61, boolean, p.f6q0, p.fbk):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m33880b(sb61 sb61Var, fbk fbkVar, int i) {
        return m33879a(sb61Var, (i & 1) != 0, (i & 2) != 0 ? f6q0.f66486b : f6q0.f66485a, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[LOOP:1: B:22:0x005f->B:26:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0061
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public static final java.lang.Object m33881c(p204p.sb61 r7, p204p.ibk r8) {
        /*
            boolean r0 = r8 instanceof p204p.ut61
            if (r0 == 0) goto L13
            r0 = r8
            p.ut61 r0 = (p204p.ut61) r0
            int r1 = r0.f233834c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233834c = r1
            goto L18
        L13:
            p.ut61 r0 = new p.ut61
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f233833b
            int r1 = r0.f233834c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            p.sb61 r7 = r0.f233832a
            p204p.bga.m29073P(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p204p.bga.m29073P(r8)
        L32:
            r0.f233832a = r7
            r0.f233834c = r2
            p.f6q0 r8 = p204p.f6q0.f66486b
            java.lang.Object r8 = r7.m77709a(r8, r0)
            p.yuk r1 = p204p.yuk.f276404a
            if (r8 != r1) goto L41
            return r1
        L41:
            p.e6q0 r8 = (p204p.e6q0) r8
            java.lang.Object r1 = r8.f56704a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4b:
            if (r5 >= r3) goto L59
            java.lang.Object r6 = r1.get(r5)
            p.k6q0 r6 = (p204p.k6q0) r6
            r6.m55602a()
            int r5 = r5 + 1
            goto L4b
        L59:
            java.lang.Object r8 = r8.f56704a
            int r1 = r8.size()
        L5f:
            if (r4 >= r1) goto L6f
            java.lang.Object r3 = r8.get(r4)
            p.k6q0 r3 = (p204p.k6q0) r3
            boolean r3 = r3.f119813d
            if (r3 == 0) goto L6c
            goto L32
        L6c:
            int r4 = r4 + 1
            goto L5f
        L6f:
            p.w2a1 r7 = p204p.w2a1.f247311a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.cu61.m33881c(p.sb61, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public static final Object m33882d(o6q0 o6q0Var, gh00 gh00Var, gh00 gh00Var2, vh00 vh00Var, gh00 gh00Var3, fbk fbkVar) {
        Object objM56684z = kk40.m56684z(new vns0(o6q0Var, gh00Var, gh00Var2, vh00Var, gh00Var3, (fbk) null), fbkVar);
        return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m33883e(o6q0 o6q0Var, gh00 gh00Var, gh00 gh00Var2, vh00 vh00Var, gh00 gh00Var3, fbk fbkVar, int i) {
        if ((i & 1) != 0) {
            gh00Var = null;
        }
        if ((i & 2) != 0) {
            gh00Var2 = null;
        }
        if ((i & 4) != 0) {
            vh00Var = f42066a;
        }
        if ((i & 8) != 0) {
            gh00Var3 = null;
        }
        return m33882d(o6q0Var, gh00Var, gh00Var2, vh00Var, gh00Var3, fbkVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static boolean m33884f(e6q0 e6q0Var, boolean z) {
        ?? r4 = e6q0Var.f56704a;
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            k6q0 k6q0Var = (k6q0) r4.get(i);
            if (!(z ? ex60.m40175i(k6q0Var) : ex60.m40176j(k6q0Var))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static di41 m33885g(xuk xukVar, tf60 tf60Var, th00 th00Var) {
        return x0h1.m89578u(xukVar, null, 4, new h431(tf60Var, th00Var, (fbk) null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:103:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:105:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:26:0x019f  */
    /* JADX WARN: Code duplicated, block: B:27:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x020d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0221  */
    /* JADX WARN: Code duplicated, block: B:43:0x0248  */
    /* JADX WARN: Code duplicated, block: B:46:0x0254  */
    /* JADX WARN: Code duplicated, block: B:48:0x0258  */
    /* JADX WARN: Code duplicated, block: B:49:0x025d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0261  */
    /* JADX WARN: Code duplicated, block: B:54:0x0267  */
    /* JADX WARN: Code duplicated, block: B:55:0x0274  */
    /* JADX WARN: Code duplicated, block: B:57:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0289  */
    /* JADX WARN: Code duplicated, block: B:61:0x0294  */
    /* JADX WARN: Code duplicated, block: B:64:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x02da  */
    /* JADX WARN: Code duplicated, block: B:72:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0303  */
    /* JADX WARN: Code duplicated, block: B:75:0x0307  */
    /* JADX WARN: Code duplicated, block: B:78:0x0324  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x032f  */
    /* JADX WARN: Code duplicated, block: B:83:0x034b  */
    /* JADX WARN: Code duplicated, block: B:86:0x035e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0385  */
    /* JADX WARN: Code duplicated, block: B:92:0x0391  */
    /* JADX WARN: Code duplicated, block: B:94:0x0395  */
    /* JADX WARN: Code duplicated, block: B:95:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v33, types: [p.k6q0] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r11v23, types: [p.k6q0] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, p.fbk, p.juk] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v8, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, p.k6q0] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r23v2, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, p.k6q0] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: h */
    public static final Object m33886h(sb61 sb61Var, xuk xukVar, k3r0 k3r0Var, gh00 gh00Var, gh00 gh00Var2, vh00 vh00Var, gh00 gh00Var3, ly8 ly8Var) {
        yt61 yt61Var;
        gh00 gh00Var4;
        gh00 gh00Var5;
        int i;
        Object objM33880b;
        xuk xukVar2;
        gh00 gh00Var6;
        k3r0 k3r0Var2;
        vh00 vh00Var2;
        w2a1 w2a1Var;
        k6q0 k6q0Var;
        ?? r15;
        di41 di41VarM89578u;
        k3r0 k3r0Var3;
        vh00 vh00Var3;
        Object objM33887i;
        sb61 sb61Var2;
        tf60 tf60Var;
        gh00 gh00Var7;
        gh00 gh00Var8;
        vh00 vh00Var4;
        Object objM33888j;
        gh00 gh00Var9;
        gh00 gh00Var10;
        gh00 gh00Var11;
        vh00 vh00Var5;
        k3r0 k3r0Var4;
        boolean z;
        k3r0 k3r0Var5;
        ?? r16;
        ?? r1;
        tf60 tf60VarM33885g;
        gh00 gh00Var12;
        vh00 vh00Var6;
        Object objM77713e;
        ?? r3;
        gh00 gh00Var13;
        gh00 gh00Var14;
        xuk xukVar3;
        vh00 vh00Var7;
        l2b0 l2b0Var;
        ?? r2;
        k3r0 k3r0Var6;
        xuk xukVar4;
        ?? r17;
        ?? r18;
        k6q0 k6q0Var2;
        di41 di41VarM89578u2;
        Object objM33887i2;
        tf60 tf60Var2;
        k6q0 k6q0Var3;
        ?? r5;
        k3r0 k3r0Var7;
        gh00 gh00Var15;
        gh00 gh00Var16;
        gh00 gh00Var17;
        tf60 tf60Var3;
        ?? r0;
        gh00 gh00Var18;
        k3r0 k3r0Var8;
        xuk xukVar5;
        ?? r19;
        ?? r110;
        ?? r11;
        ?? r4;
        ?? r111;
        l2b0 l2b0Var2;
        tf60 tf60Var4;
        xuk xukVar6;
        ?? r112;
        sb61 sb61Var3 = sb61Var;
        if (ly8Var instanceof yt61) {
            yt61Var = (yt61) ly8Var;
            int i2 = yt61Var.f276022X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yt61Var.f276022X = i2 - Integer.MIN_VALUE;
            } else {
                yt61Var = new yt61(ly8Var);
            }
        } else {
            yt61Var = new yt61(ly8Var);
        }
        Object objM33888j2 = yt61Var.f276032t;
        int i3 = yt61Var.f276022X;
        f6q0 f6q0Var = f6q0.f66486b;
        k2b0 k2b0Var = k2b0.f118587a;
        ww0 ww0Var = f42066a;
        w2a1 w2a1Var2 = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        switch (i3) {
            case 0:
                bga.m29073P(objM33888j2);
                yt61Var.f276023a = sb61Var3;
                yt61Var.f276024b = xukVar;
                yt61Var.f276025c = k3r0Var;
                gh00Var4 = gh00Var;
                yt61Var.f276026d = gh00Var4;
                gh00Var5 = gh00Var2;
                yt61Var.f276027e = gh00Var5;
                yt61Var.f276028f = vh00Var;
                yt61Var.f276029g = gh00Var3;
                i = 1;
                yt61Var.f276022X = 1;
                objM33880b = m33880b(sb61Var3, yt61Var, 3);
                if (objM33880b != yukVar) {
                    xukVar2 = xukVar;
                    gh00Var6 = gh00Var3;
                    k3r0Var2 = k3r0Var;
                    vh00Var2 = vh00Var;
                    k6q0 k6q0Var4 = (k6q0) objM33880b;
                    k6q0Var4.m55602a();
                    w2a1Var = w2a1Var2;
                    k6q0Var = k6q0Var4;
                    r15 = 0;
                    z = false;
                    di41VarM89578u = x0h1.m89578u(xukVar2, null, 4, new wt61(k3r0Var2, r15, 1), i);
                    if (vh00Var2 != ww0Var) {
                        vh00 vh00Var8 = vh00Var2;
                        k3r0 k3r0Var9 = k3r0Var2;
                        vh00Var3 = vh00Var8;
                        k3r0Var3 = k3r0Var9;
                        m33885g(xukVar2, di41VarM89578u, new zt61(vh00Var8, k3r0Var9, k6q0Var, r15, 0));
                    } else {
                        k3r0Var3 = k3r0Var2;
                        vh00Var3 = vh00Var2;
                    }
                    if (gh00Var5 == null) {
                        yt61Var.f276023a = sb61Var3;
                        yt61Var.f276024b = xukVar2;
                        yt61Var.f276025c = k3r0Var3;
                        yt61Var.f276026d = gh00Var4;
                        yt61Var.f276027e = gh00Var5;
                        yt61Var.f276028f = vh00Var3;
                        yt61Var.f276029g = gh00Var6;
                        yt61Var.f276030h = di41VarM89578u;
                        yt61Var.f276022X = 2;
                        objM33888j = m33888j(sb61Var3, f6q0Var, yt61Var);
                        if (objM33888j != yukVar) {
                            gh00Var9 = gh00Var6;
                            objM33888j2 = objM33888j;
                            gh00 gh00Var19 = gh00Var5;
                            gh00Var10 = gh00Var4;
                            gh00Var11 = gh00Var19;
                            sb61Var2 = sb61Var3;
                            tf60Var = di41VarM89578u;
                            vh00Var5 = vh00Var3;
                            k3r0Var4 = k3r0Var3;
                            gh00 gh00Var20 = gh00Var10;
                            gh00Var5 = gh00Var11;
                            k3r0Var5 = k3r0Var4;
                            gh00Var8 = gh00Var20;
                            r1 = (k6q0) objM33888j2;
                            r16 = z;
                            if (r1 == 0) {
                                tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 3));
                            } else {
                                r1.m55602a();
                                tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 4));
                            }
                            if (r1 != 0) {
                                if (gh00Var8 == null) {
                                    yt61Var.f276023a = sb61Var2;
                                    yt61Var.f276024b = xukVar2;
                                    yt61Var.f276025c = k3r0Var5;
                                    yt61Var.f276026d = gh00Var8;
                                    yt61Var.f276027e = gh00Var5;
                                    yt61Var.f276028f = vh00Var5;
                                    yt61Var.f276029g = gh00Var9;
                                    yt61Var.f276030h = r1;
                                    yt61Var.f276031i = tf60VarM33885g;
                                    yt61Var.f276022X = 5;
                                    gh00Var12 = gh00Var9;
                                    vh00Var6 = vh00Var5;
                                    objM77713e = sb61Var2.m77713e(sb61Var2.m77711c().mo51230a(), new ilz0(r1, r16), yt61Var);
                                    if (objM77713e != yukVar) {
                                        r3 = r1;
                                        objM33888j2 = objM77713e;
                                        gh00Var13 = gh00Var12;
                                        gh00Var14 = gh00Var8;
                                        xukVar3 = xukVar2;
                                        vh00Var7 = vh00Var6;
                                        r18 = r16;
                                        k6q0Var2 = (k6q0) objM33888j2;
                                        if (k6q0Var2 != null) {
                                            di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                                            if (vh00Var7 != ww0Var) {
                                                vh00 vh00Var9 = vh00Var7;
                                                m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var9, k3r0Var5, k6q0Var2, r18, 1));
                                            }
                                            if (gh00Var5 == null) {
                                                yt61Var.f276023a = xukVar3;
                                                yt61Var.f276024b = k3r0Var5;
                                                yt61Var.f276025c = gh00Var14;
                                                yt61Var.f276026d = gh00Var13;
                                                yt61Var.f276027e = di41VarM89578u2;
                                                yt61Var.f276028f = r3;
                                                yt61Var.f276029g = r18;
                                                yt61Var.f276030h = r18;
                                                yt61Var.f276031i = r18;
                                                yt61Var.f276022X = 6;
                                                objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                                                if (objM33888j2 != yukVar) {
                                                    ?? r6 = r3;
                                                    tf60Var3 = di41VarM89578u2;
                                                    r0 = r6;
                                                    gh00Var18 = gh00Var14;
                                                    k3r0Var8 = k3r0Var5;
                                                    xukVar5 = xukVar3;
                                                    r19 = r18;
                                                    r4 = r0;
                                                    r11 = (k6q0) objM33888j2;
                                                    r110 = r19;
                                                    if (r11 != 0) {
                                                        r110 = r111;
                                                        r110 = r111;
                                                        r11.m55602a();
                                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                        gh00Var18.invoke(new Offset(r11.f119812c));
                                                        return w2a1Var;
                                                    }
                                                    r110 = r111;
                                                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                    if (gh00Var13 != null) {
                                                        r110 = r111;
                                                        gh00Var13.invoke(new Offset(r4.f119812c));
                                                        return w2a1Var;
                                                    }
                                                }
                                            } else {
                                                yt61Var.f276023a = sb61Var2;
                                                yt61Var.f276024b = xukVar3;
                                                yt61Var.f276025c = k3r0Var5;
                                                yt61Var.f276026d = gh00Var14;
                                                yt61Var.f276027e = gh00Var5;
                                                yt61Var.f276028f = gh00Var13;
                                                yt61Var.f276029g = di41VarM89578u2;
                                                yt61Var.f276030h = r3;
                                                yt61Var.f276031i = r22;
                                                yt61Var.f276022X = 7;
                                                objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                                                if (objM33887i2 != yukVar) {
                                                    gh00 gh00Var21 = gh00Var13;
                                                    tf60Var2 = di41VarM89578u2;
                                                    k6q0Var3 = k6q0Var2;
                                                    objM33888j2 = objM33887i2;
                                                    r5 = r3;
                                                    k3r0Var7 = k3r0Var5;
                                                    gh00Var15 = gh00Var14;
                                                    gh00Var16 = gh00Var21;
                                                    gh00Var17 = gh00Var5;
                                                    r111 = r18;
                                                    l2b0Var2 = (l2b0) objM33888j2;
                                                    if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                                        gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                                        yt61Var.f276023a = xukVar3;
                                                        yt61Var.f276024b = k3r0Var7;
                                                        yt61Var.f276025c = tf60Var2;
                                                        yt61Var.f276026d = r111;
                                                        yt61Var.f276027e = r111;
                                                        yt61Var.f276028f = r111;
                                                        yt61Var.f276029g = r111;
                                                        yt61Var.f276030h = r111;
                                                        yt61Var.f276031i = r111;
                                                        yt61Var.f276022X = 8;
                                                        if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                                            tf60Var4 = tf60Var2;
                                                            xukVar6 = xukVar3;
                                                            r112 = r111;
                                                            m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                                            return w2a1Var;
                                                        }
                                                    } else {
                                                        if (l2b0Var2 instanceof j2b0) {
                                                            gh00 gh00Var22 = gh00Var16;
                                                            k3r0Var8 = k3r0Var7;
                                                            tf60Var3 = tf60Var2;
                                                            gh00Var13 = gh00Var22;
                                                            xukVar5 = xukVar3;
                                                            r11 = ((j2b0) l2b0Var2).f107992a;
                                                            r4 = r5;
                                                            gh00Var18 = gh00Var15;
                                                        } else {
                                                            if (l2b0Var2 instanceof i2b0) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            gh00 gh00Var23 = gh00Var16;
                                                            k3r0Var8 = k3r0Var7;
                                                            tf60Var3 = tf60Var2;
                                                            gh00Var13 = gh00Var23;
                                                            r4 = r5;
                                                            gh00Var18 = gh00Var15;
                                                            xukVar5 = xukVar3;
                                                            r11 = r111;
                                                        }
                                                        if (r11 != 0) {
                                                            r110 = r111;
                                                            r110 = r111;
                                                            r11.m55602a();
                                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                            gh00Var18.invoke(new Offset(r11.f119812c));
                                                            return w2a1Var;
                                                        }
                                                        r110 = r111;
                                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                        if (gh00Var13 != null) {
                                                            r110 = r111;
                                                            gh00Var13.invoke(new Offset(r4.f119812c));
                                                            return w2a1Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (gh00Var13 != null) {
                                            gh00Var13.invoke(new Offset(r3.f119812c));
                                            return w2a1Var;
                                        }
                                    }
                                } else if (gh00Var9 != null) {
                                    gh00Var9.invoke(new Offset(r1.f119812c));
                                    return w2a1Var;
                                }
                            }
                            r110 = r111;
                            return w2a1Var;
                        }
                    } else {
                        yt61Var.f276023a = sb61Var3;
                        yt61Var.f276024b = xukVar2;
                        yt61Var.f276025c = k3r0Var3;
                        yt61Var.f276026d = gh00Var4;
                        yt61Var.f276027e = gh00Var5;
                        yt61Var.f276028f = vh00Var3;
                        yt61Var.f276029g = gh00Var6;
                        yt61Var.f276030h = k6q0Var;
                        yt61Var.f276031i = di41VarM89578u;
                        yt61Var.f276022X = 3;
                        objM33887i = m33887i(sb61Var3, f6q0Var, yt61Var);
                        if (objM33887i != yukVar) {
                            sb61Var2 = sb61Var3;
                            tf60Var = di41VarM89578u;
                            gh00Var7 = gh00Var6;
                            objM33888j2 = objM33887i;
                            vh00 vh00Var10 = vh00Var3;
                            gh00Var8 = gh00Var4;
                            vh00Var4 = vh00Var10;
                            l2b0Var = (l2b0) objM33888j2;
                            if (!wj50.m88271j(l2b0Var, k2b0Var)) {
                                if (l2b0Var instanceof j2b0) {
                                    r2 = ((j2b0) l2b0Var).f107992a;
                                } else {
                                    if (!(l2b0Var instanceof i2b0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r2 = r15;
                                }
                                gh00Var9 = gh00Var7;
                                vh00Var5 = vh00Var4;
                                k3r0Var5 = k3r0Var3;
                                r1 = r2;
                                r16 = r15;
                                if (r1 == 0) {
                                    tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 3));
                                } else {
                                    r1.m55602a();
                                    tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 4));
                                }
                                if (r1 != 0) {
                                    if (gh00Var8 == null) {
                                        yt61Var.f276023a = sb61Var2;
                                        yt61Var.f276024b = xukVar2;
                                        yt61Var.f276025c = k3r0Var5;
                                        yt61Var.f276026d = gh00Var8;
                                        yt61Var.f276027e = gh00Var5;
                                        yt61Var.f276028f = vh00Var5;
                                        yt61Var.f276029g = gh00Var9;
                                        yt61Var.f276030h = r1;
                                        yt61Var.f276031i = tf60VarM33885g;
                                        yt61Var.f276022X = 5;
                                        gh00Var12 = gh00Var9;
                                        vh00Var6 = vh00Var5;
                                        objM77713e = sb61Var2.m77713e(sb61Var2.m77711c().mo51230a(), new ilz0(r1, r16), yt61Var);
                                        if (objM77713e != yukVar) {
                                            r3 = r1;
                                            objM33888j2 = objM77713e;
                                            gh00Var13 = gh00Var12;
                                            gh00Var14 = gh00Var8;
                                            xukVar3 = xukVar2;
                                            vh00Var7 = vh00Var6;
                                            r18 = r16;
                                            k6q0Var2 = (k6q0) objM33888j2;
                                            if (k6q0Var2 != null) {
                                                di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                                                if (vh00Var7 != ww0Var) {
                                                    vh00 vh00Var11 = vh00Var7;
                                                    m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var11, k3r0Var5, k6q0Var2, r18, 1));
                                                }
                                                if (gh00Var5 == null) {
                                                    yt61Var.f276023a = xukVar3;
                                                    yt61Var.f276024b = k3r0Var5;
                                                    yt61Var.f276025c = gh00Var14;
                                                    yt61Var.f276026d = gh00Var13;
                                                    yt61Var.f276027e = di41VarM89578u2;
                                                    yt61Var.f276028f = r3;
                                                    yt61Var.f276029g = r18;
                                                    yt61Var.f276030h = r18;
                                                    yt61Var.f276031i = r18;
                                                    yt61Var.f276022X = 6;
                                                    objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                                                    if (objM33888j2 != yukVar) {
                                                        ?? r7 = r3;
                                                        tf60Var3 = di41VarM89578u2;
                                                        r0 = r7;
                                                        gh00Var18 = gh00Var14;
                                                        k3r0Var8 = k3r0Var5;
                                                        xukVar5 = xukVar3;
                                                        r19 = r18;
                                                        r4 = r0;
                                                        r11 = (k6q0) objM33888j2;
                                                        r110 = r19;
                                                        if (r11 != 0) {
                                                            r110 = r111;
                                                            r110 = r111;
                                                            r11.m55602a();
                                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                            gh00Var18.invoke(new Offset(r11.f119812c));
                                                            return w2a1Var;
                                                        }
                                                        r110 = r111;
                                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                        if (gh00Var13 != null) {
                                                            r110 = r111;
                                                            gh00Var13.invoke(new Offset(r4.f119812c));
                                                            return w2a1Var;
                                                        }
                                                    }
                                                } else {
                                                    yt61Var.f276023a = sb61Var2;
                                                    yt61Var.f276024b = xukVar3;
                                                    yt61Var.f276025c = k3r0Var5;
                                                    yt61Var.f276026d = gh00Var14;
                                                    yt61Var.f276027e = gh00Var5;
                                                    yt61Var.f276028f = gh00Var13;
                                                    yt61Var.f276029g = di41VarM89578u2;
                                                    yt61Var.f276030h = r3;
                                                    yt61Var.f276031i = r22;
                                                    yt61Var.f276022X = 7;
                                                    objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                                                    if (objM33887i2 != yukVar) {
                                                        gh00 gh00Var24 = gh00Var13;
                                                        tf60Var2 = di41VarM89578u2;
                                                        k6q0Var3 = k6q0Var2;
                                                        objM33888j2 = objM33887i2;
                                                        r5 = r3;
                                                        k3r0Var7 = k3r0Var5;
                                                        gh00Var15 = gh00Var14;
                                                        gh00Var16 = gh00Var24;
                                                        gh00Var17 = gh00Var5;
                                                        r111 = r18;
                                                        l2b0Var2 = (l2b0) objM33888j2;
                                                        if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                                            gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                                            yt61Var.f276023a = xukVar3;
                                                            yt61Var.f276024b = k3r0Var7;
                                                            yt61Var.f276025c = tf60Var2;
                                                            yt61Var.f276026d = r111;
                                                            yt61Var.f276027e = r111;
                                                            yt61Var.f276028f = r111;
                                                            yt61Var.f276029g = r111;
                                                            yt61Var.f276030h = r111;
                                                            yt61Var.f276031i = r111;
                                                            yt61Var.f276022X = 8;
                                                            if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                                                tf60Var4 = tf60Var2;
                                                                xukVar6 = xukVar3;
                                                                r112 = r111;
                                                                m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                                                return w2a1Var;
                                                            }
                                                        } else {
                                                            if (l2b0Var2 instanceof j2b0) {
                                                                gh00 gh00Var25 = gh00Var16;
                                                                k3r0Var8 = k3r0Var7;
                                                                tf60Var3 = tf60Var2;
                                                                gh00Var13 = gh00Var25;
                                                                xukVar5 = xukVar3;
                                                                r11 = ((j2b0) l2b0Var2).f107992a;
                                                                r4 = r5;
                                                                gh00Var18 = gh00Var15;
                                                            } else {
                                                                if (l2b0Var2 instanceof i2b0) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                gh00 gh00Var26 = gh00Var16;
                                                                k3r0Var8 = k3r0Var7;
                                                                tf60Var3 = tf60Var2;
                                                                gh00Var13 = gh00Var26;
                                                                r4 = r5;
                                                                gh00Var18 = gh00Var15;
                                                                xukVar5 = xukVar3;
                                                                r11 = r111;
                                                            }
                                                            if (r11 != 0) {
                                                                r110 = r111;
                                                                r110 = r111;
                                                                r11.m55602a();
                                                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                                gh00Var18.invoke(new Offset(r11.f119812c));
                                                                return w2a1Var;
                                                            }
                                                            r110 = r111;
                                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                            if (gh00Var13 != null) {
                                                                r110 = r111;
                                                                gh00Var13.invoke(new Offset(r4.f119812c));
                                                                return w2a1Var;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (gh00Var13 != null) {
                                                gh00Var13.invoke(new Offset(r3.f119812c));
                                                return w2a1Var;
                                            }
                                        }
                                    } else if (gh00Var9 != null) {
                                        gh00Var9.invoke(new Offset(r1.f119812c));
                                        return w2a1Var;
                                    }
                                }
                                r110 = r111;
                                return w2a1Var;
                            }
                            gh00Var5.invoke(new Offset(k6q0Var.f119812c));
                            yt61Var.f276023a = xukVar2;
                            yt61Var.f276024b = k3r0Var3;
                            yt61Var.f276025c = tf60Var;
                            yt61Var.f276026d = r15;
                            yt61Var.f276027e = r15;
                            yt61Var.f276028f = r15;
                            yt61Var.f276029g = r15;
                            yt61Var.f276030h = r15;
                            yt61Var.f276031i = r15;
                            yt61Var.f276022X = 4;
                            if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                k3r0Var6 = k3r0Var3;
                                xukVar4 = xukVar2;
                                r17 = r15;
                                m33885g(xukVar4, tf60Var, new vt61(k3r0Var6, r17, 2));
                                return w2a1Var;
                            }
                        }
                    }
                }
                return yukVar;
            case 1:
                gh00 gh00Var27 = (gh00) yt61Var.f276029g;
                vh00Var2 = (vh00) yt61Var.f276028f;
                gh00 gh00Var28 = (gh00) yt61Var.f276027e;
                gh00 gh00Var29 = yt61Var.f276026d;
                k3r0Var2 = (k3r0) yt61Var.f276025c;
                xukVar2 = (xuk) yt61Var.f276024b;
                sb61 sb61Var4 = (sb61) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                gh00Var5 = gh00Var28;
                gh00Var4 = gh00Var29;
                objM33880b = objM33888j2;
                gh00Var6 = gh00Var27;
                sb61Var3 = sb61Var4;
                i = 1;
                k6q0 k6q0Var5 = (k6q0) objM33880b;
                k6q0Var5.m55602a();
                w2a1Var = w2a1Var2;
                k6q0Var = k6q0Var5;
                r15 = 0;
                z = false;
                di41VarM89578u = x0h1.m89578u(xukVar2, null, 4, new wt61(k3r0Var2, r15, 1), i);
                if (vh00Var2 != ww0Var) {
                    vh00 vh00Var12 = vh00Var2;
                    k3r0 k3r0Var10 = k3r0Var2;
                    vh00Var3 = vh00Var12;
                    k3r0Var3 = k3r0Var10;
                    m33885g(xukVar2, di41VarM89578u, new zt61(vh00Var12, k3r0Var10, k6q0Var, r15, 0));
                } else {
                    k3r0Var3 = k3r0Var2;
                    vh00Var3 = vh00Var2;
                }
                if (gh00Var5 == null) {
                    yt61Var.f276023a = sb61Var3;
                    yt61Var.f276024b = xukVar2;
                    yt61Var.f276025c = k3r0Var3;
                    yt61Var.f276026d = gh00Var4;
                    yt61Var.f276027e = gh00Var5;
                    yt61Var.f276028f = vh00Var3;
                    yt61Var.f276029g = gh00Var6;
                    yt61Var.f276030h = di41VarM89578u;
                    yt61Var.f276022X = 2;
                    objM33888j = m33888j(sb61Var3, f6q0Var, yt61Var);
                    if (objM33888j != yukVar) {
                        gh00Var9 = gh00Var6;
                        objM33888j2 = objM33888j;
                        gh00 gh00Var110 = gh00Var5;
                        gh00Var10 = gh00Var4;
                        gh00Var11 = gh00Var110;
                        sb61Var2 = sb61Var3;
                        tf60Var = di41VarM89578u;
                        vh00Var5 = vh00Var3;
                        k3r0Var4 = k3r0Var3;
                        gh00 gh00Var210 = gh00Var10;
                        gh00Var5 = gh00Var11;
                        k3r0Var5 = k3r0Var4;
                        gh00Var8 = gh00Var210;
                        r1 = (k6q0) objM33888j2;
                        r16 = z;
                        if (r1 == 0) {
                            tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 3));
                        } else {
                            r1.m55602a();
                            tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 4));
                        }
                        if (r1 != 0) {
                            if (gh00Var8 == null) {
                                yt61Var.f276023a = sb61Var2;
                                yt61Var.f276024b = xukVar2;
                                yt61Var.f276025c = k3r0Var5;
                                yt61Var.f276026d = gh00Var8;
                                yt61Var.f276027e = gh00Var5;
                                yt61Var.f276028f = vh00Var5;
                                yt61Var.f276029g = gh00Var9;
                                yt61Var.f276030h = r1;
                                yt61Var.f276031i = tf60VarM33885g;
                                yt61Var.f276022X = 5;
                                gh00Var12 = gh00Var9;
                                vh00Var6 = vh00Var5;
                                objM77713e = sb61Var2.m77713e(sb61Var2.m77711c().mo51230a(), new ilz0(r1, r16), yt61Var);
                                if (objM77713e != yukVar) {
                                    r3 = r1;
                                    objM33888j2 = objM77713e;
                                    gh00Var13 = gh00Var12;
                                    gh00Var14 = gh00Var8;
                                    xukVar3 = xukVar2;
                                    vh00Var7 = vh00Var6;
                                    r18 = r16;
                                    k6q0Var2 = (k6q0) objM33888j2;
                                    if (k6q0Var2 != null) {
                                        di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                                        if (vh00Var7 != ww0Var) {
                                            vh00 vh00Var13 = vh00Var7;
                                            m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var13, k3r0Var5, k6q0Var2, r18, 1));
                                        }
                                        if (gh00Var5 == null) {
                                            yt61Var.f276023a = xukVar3;
                                            yt61Var.f276024b = k3r0Var5;
                                            yt61Var.f276025c = gh00Var14;
                                            yt61Var.f276026d = gh00Var13;
                                            yt61Var.f276027e = di41VarM89578u2;
                                            yt61Var.f276028f = r3;
                                            yt61Var.f276029g = r18;
                                            yt61Var.f276030h = r18;
                                            yt61Var.f276031i = r18;
                                            yt61Var.f276022X = 6;
                                            objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                                            if (objM33888j2 != yukVar) {
                                                ?? r8 = r3;
                                                tf60Var3 = di41VarM89578u2;
                                                r0 = r8;
                                                gh00Var18 = gh00Var14;
                                                k3r0Var8 = k3r0Var5;
                                                xukVar5 = xukVar3;
                                                r19 = r18;
                                                r4 = r0;
                                                r11 = (k6q0) objM33888j2;
                                                r110 = r19;
                                                if (r11 != 0) {
                                                    r110 = r111;
                                                    r110 = r111;
                                                    r11.m55602a();
                                                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                    gh00Var18.invoke(new Offset(r11.f119812c));
                                                    return w2a1Var;
                                                }
                                                r110 = r111;
                                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                if (gh00Var13 != null) {
                                                    r110 = r111;
                                                    gh00Var13.invoke(new Offset(r4.f119812c));
                                                    return w2a1Var;
                                                }
                                            }
                                        } else {
                                            yt61Var.f276023a = sb61Var2;
                                            yt61Var.f276024b = xukVar3;
                                            yt61Var.f276025c = k3r0Var5;
                                            yt61Var.f276026d = gh00Var14;
                                            yt61Var.f276027e = gh00Var5;
                                            yt61Var.f276028f = gh00Var13;
                                            yt61Var.f276029g = di41VarM89578u2;
                                            yt61Var.f276030h = r3;
                                            yt61Var.f276031i = r22;
                                            yt61Var.f276022X = 7;
                                            objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                                            if (objM33887i2 != yukVar) {
                                                gh00 gh00Var211 = gh00Var13;
                                                tf60Var2 = di41VarM89578u2;
                                                k6q0Var3 = k6q0Var2;
                                                objM33888j2 = objM33887i2;
                                                r5 = r3;
                                                k3r0Var7 = k3r0Var5;
                                                gh00Var15 = gh00Var14;
                                                gh00Var16 = gh00Var211;
                                                gh00Var17 = gh00Var5;
                                                r111 = r18;
                                                l2b0Var2 = (l2b0) objM33888j2;
                                                if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                                    gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                                    yt61Var.f276023a = xukVar3;
                                                    yt61Var.f276024b = k3r0Var7;
                                                    yt61Var.f276025c = tf60Var2;
                                                    yt61Var.f276026d = r111;
                                                    yt61Var.f276027e = r111;
                                                    yt61Var.f276028f = r111;
                                                    yt61Var.f276029g = r111;
                                                    yt61Var.f276030h = r111;
                                                    yt61Var.f276031i = r111;
                                                    yt61Var.f276022X = 8;
                                                    if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                                        tf60Var4 = tf60Var2;
                                                        xukVar6 = xukVar3;
                                                        r112 = r111;
                                                        m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                                        return w2a1Var;
                                                    }
                                                } else {
                                                    if (l2b0Var2 instanceof j2b0) {
                                                        gh00 gh00Var212 = gh00Var16;
                                                        k3r0Var8 = k3r0Var7;
                                                        tf60Var3 = tf60Var2;
                                                        gh00Var13 = gh00Var212;
                                                        xukVar5 = xukVar3;
                                                        r11 = ((j2b0) l2b0Var2).f107992a;
                                                        r4 = r5;
                                                        gh00Var18 = gh00Var15;
                                                    } else {
                                                        if (l2b0Var2 instanceof i2b0) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        gh00 gh00Var213 = gh00Var16;
                                                        k3r0Var8 = k3r0Var7;
                                                        tf60Var3 = tf60Var2;
                                                        gh00Var13 = gh00Var213;
                                                        r4 = r5;
                                                        gh00Var18 = gh00Var15;
                                                        xukVar5 = xukVar3;
                                                        r11 = r111;
                                                    }
                                                    if (r11 != 0) {
                                                        r110 = r111;
                                                        r110 = r111;
                                                        r11.m55602a();
                                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                        gh00Var18.invoke(new Offset(r11.f119812c));
                                                        return w2a1Var;
                                                    }
                                                    r110 = r111;
                                                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                    if (gh00Var13 != null) {
                                                        r110 = r111;
                                                        gh00Var13.invoke(new Offset(r4.f119812c));
                                                        return w2a1Var;
                                                    }
                                                }
                                            }
                                        }
                                    } else if (gh00Var13 != null) {
                                        gh00Var13.invoke(new Offset(r3.f119812c));
                                        return w2a1Var;
                                    }
                                }
                            } else if (gh00Var9 != null) {
                                gh00Var9.invoke(new Offset(r1.f119812c));
                                return w2a1Var;
                            }
                        }
                        r110 = r111;
                        return w2a1Var;
                    }
                } else {
                    yt61Var.f276023a = sb61Var3;
                    yt61Var.f276024b = xukVar2;
                    yt61Var.f276025c = k3r0Var3;
                    yt61Var.f276026d = gh00Var4;
                    yt61Var.f276027e = gh00Var5;
                    yt61Var.f276028f = vh00Var3;
                    yt61Var.f276029g = gh00Var6;
                    yt61Var.f276030h = k6q0Var;
                    yt61Var.f276031i = di41VarM89578u;
                    yt61Var.f276022X = 3;
                    objM33887i = m33887i(sb61Var3, f6q0Var, yt61Var);
                    if (objM33887i != yukVar) {
                        sb61Var2 = sb61Var3;
                        tf60Var = di41VarM89578u;
                        gh00Var7 = gh00Var6;
                        objM33888j2 = objM33887i;
                        vh00 vh00Var14 = vh00Var3;
                        gh00Var8 = gh00Var4;
                        vh00Var4 = vh00Var14;
                        l2b0Var = (l2b0) objM33888j2;
                        if (!wj50.m88271j(l2b0Var, k2b0Var)) {
                            if (l2b0Var instanceof j2b0) {
                                r2 = ((j2b0) l2b0Var).f107992a;
                            } else {
                                if (!(l2b0Var instanceof i2b0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r2 = r15;
                            }
                            gh00Var9 = gh00Var7;
                            vh00Var5 = vh00Var4;
                            k3r0Var5 = k3r0Var3;
                            r1 = r2;
                            r16 = r15;
                            if (r1 == 0) {
                                tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 3));
                            } else {
                                r1.m55602a();
                                tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 4));
                            }
                            if (r1 != 0) {
                                if (gh00Var8 == null) {
                                    yt61Var.f276023a = sb61Var2;
                                    yt61Var.f276024b = xukVar2;
                                    yt61Var.f276025c = k3r0Var5;
                                    yt61Var.f276026d = gh00Var8;
                                    yt61Var.f276027e = gh00Var5;
                                    yt61Var.f276028f = vh00Var5;
                                    yt61Var.f276029g = gh00Var9;
                                    yt61Var.f276030h = r1;
                                    yt61Var.f276031i = tf60VarM33885g;
                                    yt61Var.f276022X = 5;
                                    gh00Var12 = gh00Var9;
                                    vh00Var6 = vh00Var5;
                                    objM77713e = sb61Var2.m77713e(sb61Var2.m77711c().mo51230a(), new ilz0(r1, r16), yt61Var);
                                    if (objM77713e != yukVar) {
                                        r3 = r1;
                                        objM33888j2 = objM77713e;
                                        gh00Var13 = gh00Var12;
                                        gh00Var14 = gh00Var8;
                                        xukVar3 = xukVar2;
                                        vh00Var7 = vh00Var6;
                                        r18 = r16;
                                        k6q0Var2 = (k6q0) objM33888j2;
                                        if (k6q0Var2 != null) {
                                            di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                                            if (vh00Var7 != ww0Var) {
                                                vh00 vh00Var15 = vh00Var7;
                                                m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var15, k3r0Var5, k6q0Var2, r18, 1));
                                            }
                                            if (gh00Var5 == null) {
                                                yt61Var.f276023a = xukVar3;
                                                yt61Var.f276024b = k3r0Var5;
                                                yt61Var.f276025c = gh00Var14;
                                                yt61Var.f276026d = gh00Var13;
                                                yt61Var.f276027e = di41VarM89578u2;
                                                yt61Var.f276028f = r3;
                                                yt61Var.f276029g = r18;
                                                yt61Var.f276030h = r18;
                                                yt61Var.f276031i = r18;
                                                yt61Var.f276022X = 6;
                                                objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                                                if (objM33888j2 != yukVar) {
                                                    ?? r9 = r3;
                                                    tf60Var3 = di41VarM89578u2;
                                                    r0 = r9;
                                                    gh00Var18 = gh00Var14;
                                                    k3r0Var8 = k3r0Var5;
                                                    xukVar5 = xukVar3;
                                                    r19 = r18;
                                                    r4 = r0;
                                                    r11 = (k6q0) objM33888j2;
                                                    r110 = r19;
                                                    if (r11 != 0) {
                                                        r110 = r111;
                                                        r110 = r111;
                                                        r11.m55602a();
                                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                        gh00Var18.invoke(new Offset(r11.f119812c));
                                                        return w2a1Var;
                                                    }
                                                    r110 = r111;
                                                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                    if (gh00Var13 != null) {
                                                        r110 = r111;
                                                        gh00Var13.invoke(new Offset(r4.f119812c));
                                                        return w2a1Var;
                                                    }
                                                }
                                            } else {
                                                yt61Var.f276023a = sb61Var2;
                                                yt61Var.f276024b = xukVar3;
                                                yt61Var.f276025c = k3r0Var5;
                                                yt61Var.f276026d = gh00Var14;
                                                yt61Var.f276027e = gh00Var5;
                                                yt61Var.f276028f = gh00Var13;
                                                yt61Var.f276029g = di41VarM89578u2;
                                                yt61Var.f276030h = r3;
                                                yt61Var.f276031i = r22;
                                                yt61Var.f276022X = 7;
                                                objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                                                if (objM33887i2 != yukVar) {
                                                    gh00 gh00Var214 = gh00Var13;
                                                    tf60Var2 = di41VarM89578u2;
                                                    k6q0Var3 = k6q0Var2;
                                                    objM33888j2 = objM33887i2;
                                                    r5 = r3;
                                                    k3r0Var7 = k3r0Var5;
                                                    gh00Var15 = gh00Var14;
                                                    gh00Var16 = gh00Var214;
                                                    gh00Var17 = gh00Var5;
                                                    r111 = r18;
                                                    l2b0Var2 = (l2b0) objM33888j2;
                                                    if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                                        gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                                        yt61Var.f276023a = xukVar3;
                                                        yt61Var.f276024b = k3r0Var7;
                                                        yt61Var.f276025c = tf60Var2;
                                                        yt61Var.f276026d = r111;
                                                        yt61Var.f276027e = r111;
                                                        yt61Var.f276028f = r111;
                                                        yt61Var.f276029g = r111;
                                                        yt61Var.f276030h = r111;
                                                        yt61Var.f276031i = r111;
                                                        yt61Var.f276022X = 8;
                                                        if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                                            tf60Var4 = tf60Var2;
                                                            xukVar6 = xukVar3;
                                                            r112 = r111;
                                                            m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                                            return w2a1Var;
                                                        }
                                                    } else {
                                                        if (l2b0Var2 instanceof j2b0) {
                                                            gh00 gh00Var215 = gh00Var16;
                                                            k3r0Var8 = k3r0Var7;
                                                            tf60Var3 = tf60Var2;
                                                            gh00Var13 = gh00Var215;
                                                            xukVar5 = xukVar3;
                                                            r11 = ((j2b0) l2b0Var2).f107992a;
                                                            r4 = r5;
                                                            gh00Var18 = gh00Var15;
                                                        } else {
                                                            if (l2b0Var2 instanceof i2b0) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            gh00 gh00Var216 = gh00Var16;
                                                            k3r0Var8 = k3r0Var7;
                                                            tf60Var3 = tf60Var2;
                                                            gh00Var13 = gh00Var216;
                                                            r4 = r5;
                                                            gh00Var18 = gh00Var15;
                                                            xukVar5 = xukVar3;
                                                            r11 = r111;
                                                        }
                                                        if (r11 != 0) {
                                                            r110 = r111;
                                                            r110 = r111;
                                                            r11.m55602a();
                                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                            gh00Var18.invoke(new Offset(r11.f119812c));
                                                            return w2a1Var;
                                                        }
                                                        r110 = r111;
                                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                        if (gh00Var13 != null) {
                                                            r110 = r111;
                                                            gh00Var13.invoke(new Offset(r4.f119812c));
                                                            return w2a1Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (gh00Var13 != null) {
                                            gh00Var13.invoke(new Offset(r3.f119812c));
                                            return w2a1Var;
                                        }
                                    }
                                } else if (gh00Var9 != null) {
                                    gh00Var9.invoke(new Offset(r1.f119812c));
                                    return w2a1Var;
                                }
                            }
                            r110 = r111;
                            return w2a1Var;
                        }
                        gh00Var5.invoke(new Offset(k6q0Var.f119812c));
                        yt61Var.f276023a = xukVar2;
                        yt61Var.f276024b = k3r0Var3;
                        yt61Var.f276025c = tf60Var;
                        yt61Var.f276026d = r15;
                        yt61Var.f276027e = r15;
                        yt61Var.f276028f = r15;
                        yt61Var.f276029g = r15;
                        yt61Var.f276030h = r15;
                        yt61Var.f276031i = r15;
                        yt61Var.f276022X = 4;
                        if (m33881c(sb61Var2, yt61Var) != yukVar) {
                            k3r0Var6 = k3r0Var3;
                            xukVar4 = xukVar2;
                            r17 = r15;
                            m33885g(xukVar4, tf60Var, new vt61(k3r0Var6, r17, 2));
                            return w2a1Var;
                        }
                    }
                }
                return yukVar;
            case 2:
                tf60Var = (tf60) yt61Var.f276030h;
                gh00Var9 = (gh00) yt61Var.f276029g;
                vh00Var5 = (vh00) yt61Var.f276028f;
                gh00Var11 = (gh00) yt61Var.f276027e;
                gh00Var10 = yt61Var.f276026d;
                k3r0Var4 = (k3r0) yt61Var.f276025c;
                xukVar2 = (xuk) yt61Var.f276024b;
                sb61Var2 = (sb61) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                w2a1Var = w2a1Var2;
                z = false;
                gh00 gh00Var217 = gh00Var10;
                gh00Var5 = gh00Var11;
                k3r0Var5 = k3r0Var4;
                gh00Var8 = gh00Var217;
                r1 = (k6q0) objM33888j2;
                r16 = z;
                if (r1 == 0) {
                    tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 3));
                } else {
                    r1.m55602a();
                    tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 4));
                }
                if (r1 != 0) {
                    if (gh00Var8 == null) {
                        yt61Var.f276023a = sb61Var2;
                        yt61Var.f276024b = xukVar2;
                        yt61Var.f276025c = k3r0Var5;
                        yt61Var.f276026d = gh00Var8;
                        yt61Var.f276027e = gh00Var5;
                        yt61Var.f276028f = vh00Var5;
                        yt61Var.f276029g = gh00Var9;
                        yt61Var.f276030h = r1;
                        yt61Var.f276031i = tf60VarM33885g;
                        yt61Var.f276022X = 5;
                        gh00Var12 = gh00Var9;
                        vh00Var6 = vh00Var5;
                        objM77713e = sb61Var2.m77713e(sb61Var2.m77711c().mo51230a(), new ilz0(r1, r16), yt61Var);
                        if (objM77713e != yukVar) {
                            r3 = r1;
                            objM33888j2 = objM77713e;
                            gh00Var13 = gh00Var12;
                            gh00Var14 = gh00Var8;
                            xukVar3 = xukVar2;
                            vh00Var7 = vh00Var6;
                            r18 = r16;
                            k6q0Var2 = (k6q0) objM33888j2;
                            if (k6q0Var2 != null) {
                                di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                                if (vh00Var7 != ww0Var) {
                                    vh00 vh00Var16 = vh00Var7;
                                    m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var16, k3r0Var5, k6q0Var2, r18, 1));
                                }
                                if (gh00Var5 == null) {
                                    yt61Var.f276023a = xukVar3;
                                    yt61Var.f276024b = k3r0Var5;
                                    yt61Var.f276025c = gh00Var14;
                                    yt61Var.f276026d = gh00Var13;
                                    yt61Var.f276027e = di41VarM89578u2;
                                    yt61Var.f276028f = r3;
                                    yt61Var.f276029g = r18;
                                    yt61Var.f276030h = r18;
                                    yt61Var.f276031i = r18;
                                    yt61Var.f276022X = 6;
                                    objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                                    if (objM33888j2 != yukVar) {
                                        ?? r10 = r3;
                                        tf60Var3 = di41VarM89578u2;
                                        r0 = r10;
                                        gh00Var18 = gh00Var14;
                                        k3r0Var8 = k3r0Var5;
                                        xukVar5 = xukVar3;
                                        r19 = r18;
                                        r4 = r0;
                                        r11 = (k6q0) objM33888j2;
                                        r110 = r19;
                                        if (r11 != 0) {
                                            r110 = r111;
                                            r110 = r111;
                                            r11.m55602a();
                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                            gh00Var18.invoke(new Offset(r11.f119812c));
                                            return w2a1Var;
                                        }
                                        r110 = r111;
                                        m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                        if (gh00Var13 != null) {
                                            r110 = r111;
                                            gh00Var13.invoke(new Offset(r4.f119812c));
                                            return w2a1Var;
                                        }
                                    }
                                } else {
                                    yt61Var.f276023a = sb61Var2;
                                    yt61Var.f276024b = xukVar3;
                                    yt61Var.f276025c = k3r0Var5;
                                    yt61Var.f276026d = gh00Var14;
                                    yt61Var.f276027e = gh00Var5;
                                    yt61Var.f276028f = gh00Var13;
                                    yt61Var.f276029g = di41VarM89578u2;
                                    yt61Var.f276030h = r3;
                                    yt61Var.f276031i = r22;
                                    yt61Var.f276022X = 7;
                                    objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                                    if (objM33887i2 != yukVar) {
                                        gh00 gh00Var218 = gh00Var13;
                                        tf60Var2 = di41VarM89578u2;
                                        k6q0Var3 = k6q0Var2;
                                        objM33888j2 = objM33887i2;
                                        r5 = r3;
                                        k3r0Var7 = k3r0Var5;
                                        gh00Var15 = gh00Var14;
                                        gh00Var16 = gh00Var218;
                                        gh00Var17 = gh00Var5;
                                        r111 = r18;
                                        l2b0Var2 = (l2b0) objM33888j2;
                                        if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                            gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                            yt61Var.f276023a = xukVar3;
                                            yt61Var.f276024b = k3r0Var7;
                                            yt61Var.f276025c = tf60Var2;
                                            yt61Var.f276026d = r111;
                                            yt61Var.f276027e = r111;
                                            yt61Var.f276028f = r111;
                                            yt61Var.f276029g = r111;
                                            yt61Var.f276030h = r111;
                                            yt61Var.f276031i = r111;
                                            yt61Var.f276022X = 8;
                                            if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                                tf60Var4 = tf60Var2;
                                                xukVar6 = xukVar3;
                                                r112 = r111;
                                                m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                                return w2a1Var;
                                            }
                                        } else {
                                            if (l2b0Var2 instanceof j2b0) {
                                                gh00 gh00Var219 = gh00Var16;
                                                k3r0Var8 = k3r0Var7;
                                                tf60Var3 = tf60Var2;
                                                gh00Var13 = gh00Var219;
                                                xukVar5 = xukVar3;
                                                r11 = ((j2b0) l2b0Var2).f107992a;
                                                r4 = r5;
                                                gh00Var18 = gh00Var15;
                                            } else {
                                                if (l2b0Var2 instanceof i2b0) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                gh00 gh00Var2110 = gh00Var16;
                                                k3r0Var8 = k3r0Var7;
                                                tf60Var3 = tf60Var2;
                                                gh00Var13 = gh00Var2110;
                                                r4 = r5;
                                                gh00Var18 = gh00Var15;
                                                xukVar5 = xukVar3;
                                                r11 = r111;
                                            }
                                            if (r11 != 0) {
                                                r110 = r111;
                                                r110 = r111;
                                                r11.m55602a();
                                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                gh00Var18.invoke(new Offset(r11.f119812c));
                                                return w2a1Var;
                                            }
                                            r110 = r111;
                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                            if (gh00Var13 != null) {
                                                r110 = r111;
                                                gh00Var13.invoke(new Offset(r4.f119812c));
                                                return w2a1Var;
                                            }
                                        }
                                    }
                                }
                            } else if (gh00Var13 != null) {
                                gh00Var13.invoke(new Offset(r3.f119812c));
                                return w2a1Var;
                            }
                        }
                        return yukVar;
                    }
                    if (gh00Var9 != null) {
                        gh00Var9.invoke(new Offset(r1.f119812c));
                        return w2a1Var;
                    }
                }
                r110 = r111;
                return w2a1Var;
            case 3:
                tf60Var = (tf60) yt61Var.f276031i;
                k6q0Var = (k6q0) yt61Var.f276030h;
                gh00Var7 = (gh00) yt61Var.f276029g;
                vh00Var4 = (vh00) yt61Var.f276028f;
                gh00Var5 = (gh00) yt61Var.f276027e;
                gh00Var8 = yt61Var.f276026d;
                k3r0 k3r0Var11 = (k3r0) yt61Var.f276025c;
                xuk xukVar7 = (xuk) yt61Var.f276024b;
                sb61 sb61Var5 = (sb61) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                w2a1Var = w2a1Var2;
                k3r0Var3 = k3r0Var11;
                xukVar2 = xukVar7;
                sb61Var2 = sb61Var5;
                r15 = 0;
                l2b0Var = (l2b0) objM33888j2;
                if (!wj50.m88271j(l2b0Var, k2b0Var)) {
                    if (l2b0Var instanceof j2b0) {
                        r2 = ((j2b0) l2b0Var).f107992a;
                    } else {
                        if (!(l2b0Var instanceof i2b0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r2 = r15;
                    }
                    gh00Var9 = gh00Var7;
                    vh00Var5 = vh00Var4;
                    k3r0Var5 = k3r0Var3;
                    r1 = r2;
                    r16 = r15;
                    if (r1 == 0) {
                        tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 3));
                    } else {
                        r1.m55602a();
                        tf60VarM33885g = m33885g(xukVar2, tf60Var, new vt61(k3r0Var5, r16, 4));
                    }
                    if (r1 != 0) {
                        if (gh00Var8 == null) {
                            yt61Var.f276023a = sb61Var2;
                            yt61Var.f276024b = xukVar2;
                            yt61Var.f276025c = k3r0Var5;
                            yt61Var.f276026d = gh00Var8;
                            yt61Var.f276027e = gh00Var5;
                            yt61Var.f276028f = vh00Var5;
                            yt61Var.f276029g = gh00Var9;
                            yt61Var.f276030h = r1;
                            yt61Var.f276031i = tf60VarM33885g;
                            yt61Var.f276022X = 5;
                            gh00Var12 = gh00Var9;
                            vh00Var6 = vh00Var5;
                            objM77713e = sb61Var2.m77713e(sb61Var2.m77711c().mo51230a(), new ilz0(r1, r16), yt61Var);
                            if (objM77713e != yukVar) {
                                r3 = r1;
                                objM33888j2 = objM77713e;
                                gh00Var13 = gh00Var12;
                                gh00Var14 = gh00Var8;
                                xukVar3 = xukVar2;
                                vh00Var7 = vh00Var6;
                                r18 = r16;
                                k6q0Var2 = (k6q0) objM33888j2;
                                if (k6q0Var2 != null) {
                                    di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                                    if (vh00Var7 != ww0Var) {
                                        vh00 vh00Var17 = vh00Var7;
                                        m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var17, k3r0Var5, k6q0Var2, r18, 1));
                                    }
                                    if (gh00Var5 == null) {
                                        yt61Var.f276023a = xukVar3;
                                        yt61Var.f276024b = k3r0Var5;
                                        yt61Var.f276025c = gh00Var14;
                                        yt61Var.f276026d = gh00Var13;
                                        yt61Var.f276027e = di41VarM89578u2;
                                        yt61Var.f276028f = r3;
                                        yt61Var.f276029g = r18;
                                        yt61Var.f276030h = r18;
                                        yt61Var.f276031i = r18;
                                        yt61Var.f276022X = 6;
                                        objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                                        if (objM33888j2 != yukVar) {
                                            ?? r12 = r3;
                                            tf60Var3 = di41VarM89578u2;
                                            r0 = r12;
                                            gh00Var18 = gh00Var14;
                                            k3r0Var8 = k3r0Var5;
                                            xukVar5 = xukVar3;
                                            r19 = r18;
                                            r4 = r0;
                                            r11 = (k6q0) objM33888j2;
                                            r110 = r19;
                                            if (r11 != 0) {
                                                r110 = r111;
                                                r110 = r111;
                                                r11.m55602a();
                                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                gh00Var18.invoke(new Offset(r11.f119812c));
                                                return w2a1Var;
                                            }
                                            r110 = r111;
                                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                            if (gh00Var13 != null) {
                                                r110 = r111;
                                                gh00Var13.invoke(new Offset(r4.f119812c));
                                                return w2a1Var;
                                            }
                                        }
                                    } else {
                                        yt61Var.f276023a = sb61Var2;
                                        yt61Var.f276024b = xukVar3;
                                        yt61Var.f276025c = k3r0Var5;
                                        yt61Var.f276026d = gh00Var14;
                                        yt61Var.f276027e = gh00Var5;
                                        yt61Var.f276028f = gh00Var13;
                                        yt61Var.f276029g = di41VarM89578u2;
                                        yt61Var.f276030h = r3;
                                        yt61Var.f276031i = r22;
                                        yt61Var.f276022X = 7;
                                        objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                                        if (objM33887i2 != yukVar) {
                                            gh00 gh00Var2111 = gh00Var13;
                                            tf60Var2 = di41VarM89578u2;
                                            k6q0Var3 = k6q0Var2;
                                            objM33888j2 = objM33887i2;
                                            r5 = r3;
                                            k3r0Var7 = k3r0Var5;
                                            gh00Var15 = gh00Var14;
                                            gh00Var16 = gh00Var2111;
                                            gh00Var17 = gh00Var5;
                                            r111 = r18;
                                            l2b0Var2 = (l2b0) objM33888j2;
                                            if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                                gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                                yt61Var.f276023a = xukVar3;
                                                yt61Var.f276024b = k3r0Var7;
                                                yt61Var.f276025c = tf60Var2;
                                                yt61Var.f276026d = r111;
                                                yt61Var.f276027e = r111;
                                                yt61Var.f276028f = r111;
                                                yt61Var.f276029g = r111;
                                                yt61Var.f276030h = r111;
                                                yt61Var.f276031i = r111;
                                                yt61Var.f276022X = 8;
                                                if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                                    tf60Var4 = tf60Var2;
                                                    xukVar6 = xukVar3;
                                                    r112 = r111;
                                                    m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                                    return w2a1Var;
                                                }
                                            } else {
                                                if (l2b0Var2 instanceof j2b0) {
                                                    gh00 gh00Var2112 = gh00Var16;
                                                    k3r0Var8 = k3r0Var7;
                                                    tf60Var3 = tf60Var2;
                                                    gh00Var13 = gh00Var2112;
                                                    xukVar5 = xukVar3;
                                                    r11 = ((j2b0) l2b0Var2).f107992a;
                                                    r4 = r5;
                                                    gh00Var18 = gh00Var15;
                                                } else {
                                                    if (l2b0Var2 instanceof i2b0) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    gh00 gh00Var2113 = gh00Var16;
                                                    k3r0Var8 = k3r0Var7;
                                                    tf60Var3 = tf60Var2;
                                                    gh00Var13 = gh00Var2113;
                                                    r4 = r5;
                                                    gh00Var18 = gh00Var15;
                                                    xukVar5 = xukVar3;
                                                    r11 = r111;
                                                }
                                                if (r11 != 0) {
                                                    r110 = r111;
                                                    r110 = r111;
                                                    r11.m55602a();
                                                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                                    gh00Var18.invoke(new Offset(r11.f119812c));
                                                    return w2a1Var;
                                                }
                                                r110 = r111;
                                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                                if (gh00Var13 != null) {
                                                    r110 = r111;
                                                    gh00Var13.invoke(new Offset(r4.f119812c));
                                                    return w2a1Var;
                                                }
                                            }
                                        }
                                    }
                                } else if (gh00Var13 != null) {
                                    gh00Var13.invoke(new Offset(r3.f119812c));
                                    return w2a1Var;
                                }
                            }
                        } else if (gh00Var9 != null) {
                            gh00Var9.invoke(new Offset(r1.f119812c));
                            return w2a1Var;
                        }
                    }
                    r110 = r111;
                    return w2a1Var;
                }
                gh00Var5.invoke(new Offset(k6q0Var.f119812c));
                yt61Var.f276023a = xukVar2;
                yt61Var.f276024b = k3r0Var3;
                yt61Var.f276025c = tf60Var;
                yt61Var.f276026d = r15;
                yt61Var.f276027e = r15;
                yt61Var.f276028f = r15;
                yt61Var.f276029g = r15;
                yt61Var.f276030h = r15;
                yt61Var.f276031i = r15;
                yt61Var.f276022X = 4;
                if (m33881c(sb61Var2, yt61Var) != yukVar) {
                    k3r0Var6 = k3r0Var3;
                    xukVar4 = xukVar2;
                    r17 = r15;
                    m33885g(xukVar4, tf60Var, new vt61(k3r0Var6, r17, 2));
                    return w2a1Var;
                }
                return yukVar;
            case 4:
                tf60Var = (tf60) yt61Var.f276025c;
                k3r0Var6 = (k3r0) yt61Var.f276024b;
                xukVar4 = (xuk) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                w2a1Var = w2a1Var2;
                r17 = 0;
                m33885g(xukVar4, tf60Var, new vt61(k3r0Var6, r17, 2));
                return w2a1Var;
            case 5:
                tf60VarM33885g = (tf60) yt61Var.f276031i;
                k6q0 k6q0Var6 = (k6q0) yt61Var.f276030h;
                gh00Var13 = (gh00) yt61Var.f276029g;
                vh00Var7 = (vh00) yt61Var.f276028f;
                gh00 gh00Var30 = (gh00) yt61Var.f276027e;
                gh00 gh00Var31 = yt61Var.f276026d;
                k3r0Var5 = (k3r0) yt61Var.f276025c;
                xukVar3 = (xuk) yt61Var.f276024b;
                sb61 sb61Var6 = (sb61) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                sb61Var2 = sb61Var6;
                gh00Var5 = gh00Var30;
                k2b0Var = k2b0Var;
                w2a1Var = w2a1Var2;
                gh00Var14 = gh00Var31;
                r18 = 0;
                r3 = k6q0Var6;
                k6q0Var2 = (k6q0) objM33888j2;
                if (k6q0Var2 != null) {
                    di41VarM89578u2 = x0h1.m89578u(xukVar3, r18, 4, new mt31(tf60VarM33885g, k3r0Var5, r18, 28), 1);
                    if (vh00Var7 != ww0Var) {
                        vh00 vh00Var18 = vh00Var7;
                        m33885g(xukVar3, di41VarM89578u2, new zt61(vh00Var18, k3r0Var5, k6q0Var2, r18, 1));
                    }
                    if (gh00Var5 == null) {
                        yt61Var.f276023a = xukVar3;
                        yt61Var.f276024b = k3r0Var5;
                        yt61Var.f276025c = gh00Var14;
                        yt61Var.f276026d = gh00Var13;
                        yt61Var.f276027e = di41VarM89578u2;
                        yt61Var.f276028f = r3;
                        yt61Var.f276029g = r18;
                        yt61Var.f276030h = r18;
                        yt61Var.f276031i = r18;
                        yt61Var.f276022X = 6;
                        objM33888j2 = m33888j(sb61Var2, f6q0Var, yt61Var);
                        if (objM33888j2 != yukVar) {
                            ?? r13 = r3;
                            tf60Var3 = di41VarM89578u2;
                            r0 = r13;
                            gh00Var18 = gh00Var14;
                            k3r0Var8 = k3r0Var5;
                            xukVar5 = xukVar3;
                            r19 = r18;
                            r4 = r0;
                            r11 = (k6q0) objM33888j2;
                            r110 = r19;
                            if (r11 != 0) {
                                r110 = r111;
                                r110 = r111;
                                r11.m55602a();
                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                gh00Var18.invoke(new Offset(r11.f119812c));
                                return w2a1Var;
                            }
                            r110 = r111;
                            m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                            if (gh00Var13 != null) {
                                r110 = r111;
                                gh00Var13.invoke(new Offset(r4.f119812c));
                                return w2a1Var;
                            }
                        }
                    } else {
                        yt61Var.f276023a = sb61Var2;
                        yt61Var.f276024b = xukVar3;
                        yt61Var.f276025c = k3r0Var5;
                        yt61Var.f276026d = gh00Var14;
                        yt61Var.f276027e = gh00Var5;
                        yt61Var.f276028f = gh00Var13;
                        yt61Var.f276029g = di41VarM89578u2;
                        yt61Var.f276030h = r3;
                        yt61Var.f276031i = r22;
                        yt61Var.f276022X = 7;
                        objM33887i2 = m33887i(sb61Var2, f6q0Var, yt61Var);
                        if (objM33887i2 != yukVar) {
                            gh00 gh00Var2114 = gh00Var13;
                            tf60Var2 = di41VarM89578u2;
                            k6q0Var3 = k6q0Var2;
                            objM33888j2 = objM33887i2;
                            r5 = r3;
                            k3r0Var7 = k3r0Var5;
                            gh00Var15 = gh00Var14;
                            gh00Var16 = gh00Var2114;
                            gh00Var17 = gh00Var5;
                            r111 = r18;
                            l2b0Var2 = (l2b0) objM33888j2;
                            if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                                gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                                yt61Var.f276023a = xukVar3;
                                yt61Var.f276024b = k3r0Var7;
                                yt61Var.f276025c = tf60Var2;
                                yt61Var.f276026d = r111;
                                yt61Var.f276027e = r111;
                                yt61Var.f276028f = r111;
                                yt61Var.f276029g = r111;
                                yt61Var.f276030h = r111;
                                yt61Var.f276031i = r111;
                                yt61Var.f276022X = 8;
                                if (m33881c(sb61Var2, yt61Var) != yukVar) {
                                    tf60Var4 = tf60Var2;
                                    xukVar6 = xukVar3;
                                    r112 = r111;
                                    m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                                    return w2a1Var;
                                }
                            } else {
                                if (l2b0Var2 instanceof j2b0) {
                                    gh00 gh00Var2115 = gh00Var16;
                                    k3r0Var8 = k3r0Var7;
                                    tf60Var3 = tf60Var2;
                                    gh00Var13 = gh00Var2115;
                                    xukVar5 = xukVar3;
                                    r11 = ((j2b0) l2b0Var2).f107992a;
                                    r4 = r5;
                                    gh00Var18 = gh00Var15;
                                } else {
                                    if (l2b0Var2 instanceof i2b0) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    gh00 gh00Var2116 = gh00Var16;
                                    k3r0Var8 = k3r0Var7;
                                    tf60Var3 = tf60Var2;
                                    gh00Var13 = gh00Var2116;
                                    r4 = r5;
                                    gh00Var18 = gh00Var15;
                                    xukVar5 = xukVar3;
                                    r11 = r111;
                                }
                                if (r11 != 0) {
                                    r110 = r111;
                                    r110 = r111;
                                    r11.m55602a();
                                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                                    gh00Var18.invoke(new Offset(r11.f119812c));
                                    return w2a1Var;
                                }
                                r110 = r111;
                                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                                if (gh00Var13 != null) {
                                    r110 = r111;
                                    gh00Var13.invoke(new Offset(r4.f119812c));
                                    return w2a1Var;
                                }
                            }
                        }
                    }
                    return yukVar;
                }
                if (gh00Var13 != null) {
                    gh00Var13.invoke(new Offset(r3.f119812c));
                    return w2a1Var;
                }
                r110 = r111;
                return w2a1Var;
            case 6:
                k6q0 k6q0Var7 = (k6q0) yt61Var.f276028f;
                tf60Var3 = (tf60) yt61Var.f276027e;
                gh00Var13 = yt61Var.f276026d;
                gh00Var18 = (gh00) yt61Var.f276025c;
                k3r0Var8 = (k3r0) yt61Var.f276024b;
                xukVar5 = (xuk) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                w2a1Var = w2a1Var2;
                r19 = 0;
                r0 = k6q0Var7;
                r4 = r0;
                r11 = (k6q0) objM33888j2;
                r110 = r19;
                if (r11 != 0) {
                    r110 = r111;
                    r110 = r111;
                    r11.m55602a();
                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                    gh00Var18.invoke(new Offset(r11.f119812c));
                    return w2a1Var;
                }
                r110 = r111;
                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                if (gh00Var13 != null) {
                    r110 = r111;
                    gh00Var13.invoke(new Offset(r4.f119812c));
                    return w2a1Var;
                }
                r110 = r111;
                return w2a1Var;
            case 7:
                k6q0Var3 = (k6q0) yt61Var.f276031i;
                k6q0 k6q0Var8 = (k6q0) yt61Var.f276030h;
                tf60Var2 = (tf60) yt61Var.f276029g;
                gh00 gh00Var32 = (gh00) yt61Var.f276028f;
                gh00Var17 = (gh00) yt61Var.f276027e;
                gh00Var15 = yt61Var.f276026d;
                k3r0 k3r0Var12 = (k3r0) yt61Var.f276025c;
                xuk xukVar8 = (xuk) yt61Var.f276024b;
                sb61Var2 = (sb61) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                k2b0Var = k2b0Var;
                w2a1Var = w2a1Var2;
                xukVar3 = xukVar8;
                r111 = 0;
                gh00Var16 = gh00Var32;
                r5 = k6q0Var8;
                k3r0Var7 = k3r0Var12;
                l2b0Var2 = (l2b0) objM33888j2;
                if (wj50.m88271j(l2b0Var2, k2b0Var)) {
                    gh00Var17.invoke(new Offset(k6q0Var3.f119812c));
                    yt61Var.f276023a = xukVar3;
                    yt61Var.f276024b = k3r0Var7;
                    yt61Var.f276025c = tf60Var2;
                    yt61Var.f276026d = r111;
                    yt61Var.f276027e = r111;
                    yt61Var.f276028f = r111;
                    yt61Var.f276029g = r111;
                    yt61Var.f276030h = r111;
                    yt61Var.f276031i = r111;
                    yt61Var.f276022X = 8;
                    if (m33881c(sb61Var2, yt61Var) != yukVar) {
                        tf60Var4 = tf60Var2;
                        xukVar6 = xukVar3;
                        r112 = r111;
                        m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                        return w2a1Var;
                    }
                    return yukVar;
                }
                if (l2b0Var2 instanceof j2b0) {
                    gh00 gh00Var2117 = gh00Var16;
                    k3r0Var8 = k3r0Var7;
                    tf60Var3 = tf60Var2;
                    gh00Var13 = gh00Var2117;
                    xukVar5 = xukVar3;
                    r11 = ((j2b0) l2b0Var2).f107992a;
                    r4 = r5;
                    gh00Var18 = gh00Var15;
                } else {
                    if (l2b0Var2 instanceof i2b0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gh00 gh00Var2118 = gh00Var16;
                    k3r0Var8 = k3r0Var7;
                    tf60Var3 = tf60Var2;
                    gh00Var13 = gh00Var2118;
                    r4 = r5;
                    gh00Var18 = gh00Var15;
                    xukVar5 = xukVar3;
                    r11 = r111;
                }
                if (r11 != 0) {
                    r110 = r111;
                    r110 = r111;
                    r11.m55602a();
                    m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 5));
                    gh00Var18.invoke(new Offset(r11.f119812c));
                    return w2a1Var;
                }
                r110 = r111;
                m33885g(xukVar5, tf60Var3, new vt61(k3r0Var8, r110, 6));
                if (gh00Var13 != null) {
                    r110 = r111;
                    gh00Var13.invoke(new Offset(r4.f119812c));
                    return w2a1Var;
                }
                r110 = r111;
                return w2a1Var;
            case 8:
                tf60Var4 = (tf60) yt61Var.f276025c;
                k3r0Var7 = (k3r0) yt61Var.f276024b;
                xukVar6 = (xuk) yt61Var.f276023a;
                bga.m29073P(objM33888j2);
                w2a1Var = w2a1Var2;
                r112 = 0;
                m33885g(xukVar6, tf60Var4, new vt61(k3r0Var7, r112, 7));
                return w2a1Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public static final Object m33887i(sb61 sb61Var, f6q0 f6q0Var, ibk ibkVar) {
        au61 au61Var;
        rlv0 rlv0Var;
        if (ibkVar instanceof au61) {
            au61Var = (au61) ibkVar;
            int i = au61Var.f19877c;
            if ((i & Integer.MIN_VALUE) != 0) {
                au61Var.f19877c = i - Integer.MIN_VALUE;
            } else {
                au61Var = new au61(ibkVar);
            }
        } else {
            au61Var = new au61(ibkVar);
        }
        Object obj = au61Var.f19876b;
        int i2 = au61Var.f19877c;
        try {
            if (i2 == 0) {
                rlv0 rlv0VarM36622v = dq60.m36622v(obj);
                rlv0VarM36622v.f200373a = i2b0.f97791a;
                long jMo51231b = sb61Var.m77711c().mo51231b();
                th00 w100Var = new w100(f6q0Var, rlv0VarM36622v, (fbk) null);
                au61Var.f19875a = rlv0VarM36622v;
                au61Var.f19877c = 1;
                Object objM77712d = sb61Var.m77712d(jMo51231b, w100Var, au61Var);
                Object obj2 = yuk.f276404a;
                if (objM77712d == obj2) {
                    return obj2;
                }
                rlv0Var = rlv0VarM36622v;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rlv0Var = au61Var.f19875a;
                bga.m29073P(obj);
            }
            return rlv0Var.f200373a;
        } catch (PointerEventTimeoutCancellationException unused) {
            return k2b0.f118587a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[LOOP:1: B:23:0x005f->B:44:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m33888j(p204p.sb61 r13, p204p.f6q0 r14, p204p.ly8 r15) {
        /*
            boolean r0 = r15 instanceof p204p.bu61
            if (r0 == 0) goto L13
            r0 = r15
            p.bu61 r0 = (p204p.bu61) r0
            int r1 = r0.f31038d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31038d = r1
            goto L18
        L13:
            p.bu61 r0 = new p.bu61
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f31037c
            int r1 = r0.f31038d
            r2 = 2
            r3 = 0
            r4 = 1
            p.yuk r5 = p204p.yuk.f276404a
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            p.f6q0 r13 = r0.f31036b
            p.sb61 r14 = r0.f31035a
            p204p.bga.m29073P(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            p.f6q0 r13 = r0.f31036b
            p.sb61 r14 = r0.f31035a
            p204p.bga.m29073P(r15)
            goto L56
        L43:
            p204p.bga.m29073P(r15)
        L46:
            r0.f31035a = r13
            r0.f31036b = r14
            r0.f31038d = r4
            java.lang.Object r15 = r13.m77709a(r14, r0)
            if (r15 != r5) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            p.e6q0 r15 = (p204p.e6q0) r15
            java.lang.Object r15 = r15.f56704a
            int r1 = r15.size()
            r6 = r3
        L5f:
            if (r6 >= r1) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            p.k6q0 r7 = (p204p.k6q0) r7
            boolean r7 = p204p.ex60.m40177k(r7)
            if (r7 != 0) goto Lbd
            int r1 = r15.size()
            r6 = r3
        L72:
            if (r6 >= r1) goto L92
            java.lang.Object r7 = r15.get(r6)
            p.k6q0 r7 = (p204p.k6q0) r7
            boolean r8 = r7.m55612l()
            if (r8 != 0) goto Lb8
            p.ub61 r8 = r14.f207370e
            long r8 = r8.f228647W0
            long r10 = r14.m77710b()
            boolean r7 = p204p.ex60.m40187u(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            r0.f31035a = r14
            r0.f31036b = r13
            r0.f31038d = r2
            p.f6q0 r15 = p204p.f6q0.f66487c
            java.lang.Object r15 = r14.m77709a(r15, r0)
            if (r15 != r5) goto L2e
        La0:
            return r5
        La1:
            p.e6q0 r15 = (p204p.e6q0) r15
            java.lang.Object r15 = r15.f56704a
            int r1 = r15.size()
            r6 = r3
        Laa:
            if (r6 >= r1) goto L46
            java.lang.Object r7 = r15.get(r6)
            p.k6q0 r7 = (p204p.k6q0) r7
            boolean r7 = r7.m55612l()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.cu61.m33888j(p.sb61, p.f6q0, p.ly8):java.lang.Object");
    }
}
