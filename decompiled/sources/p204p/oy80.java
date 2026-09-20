package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class oy80 {

    /* JADX INFO: renamed from: a */
    public final axx0 f171690a;

    /* JADX INFO: renamed from: b */
    public final u12 f171691b;

    /* JADX INFO: renamed from: c */
    public final List f171692c;

    /* JADX INFO: renamed from: d */
    public final List f171693d;

    /* JADX INFO: renamed from: e */
    public final kd4 f171694e;

    public oy80(axx0 axx0Var, u12 u12Var, List list, List list2, kd4 kd4Var) {
        this.f171690a = axx0Var;
        this.f171691b = u12Var;
        this.f171692c = list;
        this.f171693d = list2;
        this.f171694e = kd4Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007d -> B:25:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m68414a(p204p.oy80 r6, p204p.vhe0 r7, p204p.ago r8, p204p.ibk r9) {
        /*
            boolean r0 = r9 instanceof p204p.ly80
            if (r0 == 0) goto L13
            r0 = r9
            p.ly80 r0 = (p204p.ly80) r0
            int r1 = r0.f137989g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f137989g = r1
            goto L18
        L13:
            p.ly80 r0 = new p.ly80
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f137987e
            int r1 = r0.f137989g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            p.fiz r6 = r0.f137986d
            p.fiz r6 = (p204p.fiz) r6
            java.util.Iterator r7 = r0.f137985c
            p.pgo r8 = r0.f137984b
            p.vhe0 r1 = r0.f137983a
            p204p.bga.m29073P(r9)
            goto L81
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            p204p.bga.m29073P(r9)
            p.kd4 r9 = r6.f171694e
            boolean r9 = r9.m56157b()
            if (r9 == 0) goto L4e
            p.mm0 r9 = new p.mm0
            r9.<init>(r6, r7, r8, r3)
            p.nzx0 r6 = new p.nzx0
            r6.<init>(r9)
            return r6
        L4e:
            java.util.List r6 = r6.f171692c
            java.util.Iterator r6 = r6.iterator()
            r5 = r7
            r7 = r6
            r6 = r5
        L57:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L93
            java.lang.Object r9 = r7.next()
            p.k4k r9 = (p204p.k4k) r9
            p.fiz r9 = r9.mo55377b(r6, r8)
            r0.f137983a = r6
            r0.f137984b = r8
            r0.f137985c = r7
            r1 = r9
            p.fiz r1 = (p204p.fiz) r1
            r0.f137986d = r1
            r0.f137989g = r2
            java.lang.Object r1 = p204p.vyf1.m86755t(r9, r0)
            p.yuk r4 = p204p.yuk.f276404a
            if (r1 != r4) goto L7d
            return r4
        L7d:
            r5 = r1
            r1 = r6
            r6 = r9
            r9 = r5
        L81:
            p.f4k r9 = (p204p.f4k) r9
            if (r9 == 0) goto L8d
            p.kmx r9 = new p.kmx
            r4 = 8
            r9.<init>(r6, r4)
            goto L8e
        L8d:
            r9 = r3
        L8e:
            if (r9 == 0) goto L91
            goto L94
        L91:
            r6 = r1
            goto L57
        L93:
            r9 = r3
        L94:
            if (r9 != 0) goto La4
            p.f4k r6 = new p.f4k
            r7 = 7
            r6.<init>(r3, r3, r3, r7)
            p.ysk r7 = new p.ysk
            r8 = 27
            r7.<init>(r6, r8)
            return r7
        La4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.oy80.m68414a(p.oy80, p.vhe0, p.ago, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final Observable m68415b(eq80 eq80Var) {
        return k0e1.m54988g(new nzx0(new gnq(eq80Var, this, null, 15)), dau.f47107a);
    }
}
