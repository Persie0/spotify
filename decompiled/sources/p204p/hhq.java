package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes6.dex */
public final class hhq implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91560a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f91561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f91562c;

    public /* synthetic */ hhq(int i, Object obj, Object obj2) {
        this.f91560a = i;
        this.f91561b = obj;
        this.f91562c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    private final Object m47605b(Object obj, fbk fbkVar) {
        bzy bzyVar;
        Object next;
        if (fbkVar instanceof bzy) {
            bzyVar = (bzy) fbkVar;
            int i = bzyVar.f32616b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bzyVar.f32616b = i - Integer.MIN_VALUE;
            } else {
                bzyVar = new bzy(this, fbkVar);
            }
        } else {
            bzyVar = new bzy(this, fbkVar);
        }
        Object obj2 = bzyVar.f32615a;
        int i2 = bzyVar.f32616b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            niz nizVar = (niz) this.f91561b;
            pqm0 pqm0Var = (pqm0) obj;
            List list = (List) pqm0Var.f180350a;
            List list2 = (List) pqm0Var.f180351b;
            izy izyVar = (izy) ((nps) this.f91562c).f157063b;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((n2z) obj3).f149876b) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((n2z) it.next()).f149877c);
            }
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((nr31) next).f157439c);
            nr31 nr31Var = (nr31) next;
            String strM52035a = izyVar.m52035a(arrayList2, nr31Var != null ? nr31Var.f157438b : null);
            bzyVar.f32616b = 1;
            Object objEmit = nizVar.emit(strM52035a, bzyVar);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    private final Object m47606c(Object obj, fbk fbkVar) {
        wjz wjzVar;
        if (fbkVar instanceof wjz) {
            wjzVar = (wjz) fbkVar;
            int i = wjzVar.f252070c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjzVar.f252070c = i - Integer.MIN_VALUE;
            } else {
                wjzVar = new wjz(this, fbkVar);
            }
        } else {
            wjzVar = new wjz(this, fbkVar);
        }
        Object obj2 = wjzVar.f252068a;
        int i2 = wjzVar.f252070c;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ((nlv0) this.f91561b).f155174a = false;
            niz nizVar = (niz) this.f91562c;
            wjzVar.f252070c = 1;
            Object objEmit = nizVar.emit(obj, wjzVar);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    private final Object m47607d(Object obj, fbk fbkVar) {
        xkz xkzVar;
        if (fbkVar instanceof xkz) {
            xkzVar = (xkz) fbkVar;
            int i = xkzVar.f262966b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkzVar.f262966b = i - Integer.MIN_VALUE;
            } else {
                xkzVar = new xkz(this, fbkVar);
            }
        } else {
            xkzVar = new xkz(this, fbkVar);
        }
        Object objInvoke = xkzVar.f262965a;
        int i2 = xkzVar.f262966b;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            th00 th00Var = (th00) this.f91561b;
            xkzVar.f262968d = obj;
            xkzVar.f262966b = 1;
            objInvoke = th00Var.invoke(obj, xkzVar);
            yuk yukVar = yuk.f276404a;
            if (objInvoke == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = xkzVar.f262968d;
            bga.m29073P(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return w2a1.f247311a;
        }
        ((rlv0) this.f91562c).f200373a = obj;
        throw new AbortFlowException(this);
    }

    /* JADX WARN: Code duplicated, block: B:168:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:191:0x0301  */
    /* JADX WARN: Code duplicated, block: B:208:0x0350  */
    /* JADX WARN: Code duplicated, block: B:244:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:261:0x040a  */
    /* JADX WARN: Code duplicated, block: B:278:0x0452  */
    /* JADX WARN: Code duplicated, block: B:337:0x052c  */
    /* JADX WARN: Code duplicated, block: B:358:0x0576  */
    /* JADX WARN: Code duplicated, block: B:381:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:414:0x065a  */
    /* JADX WARN: Code duplicated, block: B:435:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:454:0x0706  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:486:0x0776  */
    /* JADX WARN: Code duplicated, block: B:507:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:532:0x0818  */
    /* JADX WARN: Code duplicated, block: B:552:0x0886  */
    /* JADX WARN: Code duplicated, block: B:553:0x0888  */
    /* JADX WARN: Code duplicated, block: B:555:0x089f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:556:0x08a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:557:0x08a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:558:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:561:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:562:0x08af  */
    /* JADX WARN: Code duplicated, block: B:565:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:577:0x08da  */
    /* JADX WARN: Code duplicated, block: B:594:0x091d  */
    /* JADX WARN: Code duplicated, block: B:616:0x096c  */
    /* JADX WARN: Code duplicated, block: B:664:0x08a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v28 java.lang.Object, still in use, count: 2, list:
          (r5v28 java.lang.Object) from 0x0502: PHI (r5 I:??) = (r5v26 java.lang.Object), (r5v28 java.lang.Object) binds: [B:322:0x0501, B:658:0x0502] A[DONT_GENERATE, DONT_INLINE]
          (r5v28 java.lang.Object) from 0x04f6: CHECK_CAST (p.r0s) (r5v28 java.lang.Object)
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
    @Override // p204p.niz
    public final java.lang.Object emit(java.lang.Object r46, p204p.fbk r47) {
        /*
            Method dump skipped, instruction units count: 2598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.hhq.emit(java.lang.Object, p.fbk):java.lang.Object");
    }
}
