package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class w3y0 implements Function {

    /* JADX INFO: renamed from: a */
    public final List f247662a;

    public /* synthetic */ w3y0(List list) {
        this.f247662a = list;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:12:0x0027, B:30:0x007f, B:18:0x0044, B:20:0x004a, B:21:0x0056, B:23:0x005c, B:25:0x0069, B:31:0x0089, B:32:0x0090, B:33:0x0091, B:17:0x003d), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005c A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:12:0x0027, B:30:0x007f, B:18:0x0044, B:20:0x004a, B:21:0x0056, B:23:0x005c, B:25:0x0069, B:31:0x0089, B:32:0x0090, B:33:0x0091, B:17:0x003d), top: B:37:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007c -> B:30:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public java.lang.Object m87117a(p204p.fws r9, p204p.ibk r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p204p.u3y0
            if (r0 == 0) goto L13
            r0 = r10
            p.u3y0 r0 = (p204p.u3y0) r0
            int r1 = r0.f226490f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226490f = r1
            goto L18
        L13:
            p.u3y0 r0 = new p.u3y0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f226488d
            int r1 = r0.f226490f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.util.Iterator r9 = r0.f226487c
            java.util.List r1 = r0.f226486b
            p.fws r3 = r0.f226485a
            p204p.bga.m29073P(r10)     // Catch: java.lang.Exception -> L99
            goto L7f
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            p204p.bga.m29073P(r10)
            java.util.List r10 = r9.f74157a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Exception -> L99
            r7 = r10
            r10 = r9
            r9 = r7
        L44:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Exception -> L99
            if (r3 == 0) goto L91
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Exception -> L99
            p.pql0 r3 = (p204p.pql0) r3     // Catch: java.lang.Exception -> L99
            java.util.List r4 = r8.f247662a     // Catch: java.lang.Exception -> L99
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L99
        L56:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L99
            if (r5 == 0) goto L89
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L99
            r6 = r5
            p.arl0 r6 = (p204p.arl0) r6     // Catch: java.lang.Exception -> L99
            boolean r6 = r6.mo26958a(r3)     // Catch: java.lang.Exception -> L99
            if (r6 == 0) goto L56
            p.arl0 r5 = (p204p.arl0) r5     // Catch: java.lang.Exception -> L99
            r0.f226485a = r10     // Catch: java.lang.Exception -> L99
            r0.f226486b = r1     // Catch: java.lang.Exception -> L99
            r0.f226487c = r9     // Catch: java.lang.Exception -> L99
            r0.f226490f = r2     // Catch: java.lang.Exception -> L99
            java.lang.Object r3 = r5.mo26959b(r3, r0)     // Catch: java.lang.Exception -> L99
            p.yuk r4 = p204p.yuk.f276404a
            if (r3 != r4) goto L7c
            return r4
        L7c:
            r7 = r3
            r3 = r10
            r10 = r7
        L7f:
            p.p2x0 r10 = (p204p.p2x0) r10     // Catch: java.lang.Exception -> L99
            r10.m68971d()     // Catch: java.lang.Exception -> L99
            r9.remove()     // Catch: java.lang.Exception -> L99
            r10 = r3
            goto L44
        L89:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException     // Catch: java.lang.Exception -> L99
            java.lang.String r10 = "Collection contains no element matching the predicate."
            r9.<init>(r10)     // Catch: java.lang.Exception -> L99
            throw r9     // Catch: java.lang.Exception -> L99
        L91:
            p.qxs r9 = new p.qxs     // Catch: java.lang.Exception -> L99
            p.bws r10 = r10.f74158b     // Catch: java.lang.Exception -> L99
            r9.<init>(r10)     // Catch: java.lang.Exception -> L99
            return r9
        L99:
            p.dxs r9 = new p.dxs
            r9.<init>(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.w3y0.m87117a(p.fws, p.ibk):java.lang.Object");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? this.f247662a : list;
    }
}
