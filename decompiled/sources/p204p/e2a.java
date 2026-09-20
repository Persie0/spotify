package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e2a extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f55411h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2a(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f55411h = i4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dd A[Catch: all -> 0x01d5, TRY_LEAVE, TryCatch #0 {all -> 0x01d5, blocks: (B:79:0x01be, B:80:0x01c4, B:82:0x01ca, B:88:0x01d9, B:90:0x01dd), top: B:117:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0201  */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, p.gh00] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, p.gh00] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 java.lang.Object, still in use, count: 2, list:
          (r2v7 java.lang.Object) from 0x01d9: PHI (r2 I:??) = (r2v4 java.lang.Object), (r2v7 java.lang.Object) binds: [B:87:0x01d8, B:120:0x01d9] A[DONT_GENERATE, DONT_INLINE]
          (r2v7 java.lang.Object) from 0x01cf: CHECK_CAST (byte[]) (r2v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p204p.gh00
    public final java.lang.Object invoke(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.e2a.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2a(Consumer consumer, int i) {
        super(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, 0);
        this.f55411h = i;
        switch (i) {
            case 27:
                super(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2a(PublishSubject publishSubject) {
        super(1, publishSubject, Subject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 0);
        this.f55411h = 17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2a(lla llaVar) {
        super(1, llaVar, lla.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/models/BroadcastStatusUpdate;", 0, 0);
        this.f55411h = 1;
    }
}
