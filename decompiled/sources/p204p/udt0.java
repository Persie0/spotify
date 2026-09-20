package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class udt0 {

    /* JADX INFO: renamed from: a */
    public final Set f229329a;

    public udt0(hg40 hg40Var) {
        this.f229329a = hg40Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:21:0x0045->B:47:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0065 -> B:40:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m82865a(p204p.xz8 r7, p204p.ibk r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p204p.tdt0
            if (r0 == 0) goto L13
            r0 = r8
            p.tdt0 r0 = (p204p.tdt0) r0
            int r1 = r0.f219485f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219485f = r1
            goto L18
        L13:
            p.tdt0 r0 = new p.tdt0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f219483d
            int r1 = r0.f219485f
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            p.r160 r7 = r0.f219482c
            java.util.Iterator r1 = r0.f219481b
            p.xz8 r3 = r0.f219480a
            p204p.bga.m29073P(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L31
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
            goto L68
        L2f:
            r8 = move-exception
            goto L73
        L31:
            r7 = move-exception
            goto L93
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            p204p.bga.m29073P(r8)
            java.util.Set r8 = r6.f229329a
            java.util.Iterator r8 = r8.iterator()
            r1 = r8
        L45:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r1.next()
            p.r160 r8 = (p204p.r160) r8
            boolean r3 = r8.m74461b(r7)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            if (r3 == 0) goto L45
            r0.f219480a = r7     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            r0.f219481b = r1     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            r0.f219482c = r8     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            r0.f219485f = r2     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            java.lang.Object r3 = r8.m74460a(r0)     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            p.yuk r4 = p204p.yuk.f276404a
            if (r3 != r4) goto L68
            return r4
        L68:
            p.za r3 = (p204p.AbstractC2643za) r3     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            boolean r8 = r3 instanceof p204p.C2526wa     // Catch: java.util.concurrent.CancellationException -> L31 java.lang.Exception -> L6f
            if (r8 != 0) goto L45
            return r3
        L6f:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L73:
            java.lang.Class r7 = r7.getClass()
            p.jqv0 r0 = p204p.qpv0.f191387a
            p.up60 r7 = r0.mo54112b(r7)
            java.lang.String r7 = r7.mo29111F()
            java.lang.String r0 = "PushAcceptHandler failed: "
            java.lang.String r7 = p204p.edb.m38564m(r0, r7)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.spotify.base.java.logging.Logger.m3967c(r8, r7, r0)
            p.xa r7 = new p.xa
            r7.<init>()
            return r7
        L93:
            throw r7
        L94:
            p.wa r7 = p204p.C2526wa.f249307a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.udt0.m82865a(p.xz8, p.ibk):java.lang.Object");
    }
}
