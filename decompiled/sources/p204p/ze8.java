package p204p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import java.security.MessageDigest;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ze8 implements Predicate, Function5, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281900a;

    /* JADX INFO: renamed from: b */
    public final String f281901b;

    public /* synthetic */ ze8(String str, int i) {
        this.f281900a = i;
        this.f281901b = str;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:80:0x0157  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 java.lang.Object, still in use, count: 2, list:
          (r0v19 java.lang.Object) from 0x008e: PHI (r0 I:??) = (r0v16 java.lang.Object), (r0v19 java.lang.Object) binds: [B:32:0x008d, B:101:0x008e] A[DONT_GENERATE, DONT_INLINE]
          (r0v19 java.lang.Object) from 0x0080: CHECK_CAST (p.cwj0) (r0v19 java.lang.Object)
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
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ze8.mo98394apply(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    @Override // io.reactivex.rxjava3.functions.Function5
    /* JADX INFO: renamed from: e */
    public Object mo23410e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f4q0 d4q0Var;
        e4q0 e4q0Var;
        hz40 o4q0Var;
        za01 za01Var = (za01) obj;
        String str = (String) obj2;
        Boolean bool = (Boolean) obj3;
        Boolean bool2 = (Boolean) obj4;
        n4q0 n4q0Var = (n4q0) obj5;
        wj50.m88279p(bool);
        boolean zBooleanValue = bool.booleanValue();
        wj50.m88279p(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        wj50.m88279p(n4q0Var);
        h4q0 h4q0Var = new h4q0(za01Var.f280939c);
        g4q0 g4q0Var = new g4q0(za01Var.f280940d, za01Var.f280941e);
        ya01 ya01Var = za01Var.f280937a;
        if (!(ya01Var instanceof va01)) {
            if (ya01Var instanceof wa01) {
                e4q0Var = e4q0.f56166k;
            } else {
                if (!(ya01Var instanceof xa01)) {
                    throw new NoWhenBranchMatchedException();
                }
                xa01 xa01Var = (xa01) ya01Var;
                d4q0Var = new d4q0(xa01Var.f259494a, xa01Var.f259495b, xa01Var.f259496c);
            }
            if (za01Var.f280938b) {
                o4q0Var = new o4q0(zBooleanValue);
            } else {
                o4q0Var = p4q0.f173996c;
            }
            return new q4q0(str, this.f281901b, h4q0Var, g4q0Var, d4q0Var, o4q0Var, n4q0Var, zBooleanValue2);
        }
        e4q0Var = null;
        d4q0Var = e4q0Var;
        if (za01Var.f280938b) {
            o4q0Var = new o4q0(zBooleanValue);
        } else {
            o4q0Var = p4q0.f173996c;
        }
        return new q4q0(str, this.f281901b, h4q0Var, g4q0Var, d4q0Var, o4q0Var, n4q0Var, zBooleanValue2);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f281900a) {
            case 0:
                return ((String) obj).equals(this.f281901b);
            case 1:
                return wj50.m88271j(this.f281901b, ((zte0) obj).mo79239a().f236592a);
            case 9:
                gqx gqxVar = (gqx) obj;
                return (((iqx) gqxVar).f104863f && gqxVar.mo45449a(v140.class, this.f281901b).f72301b == null) ? false : true;
            default:
                return wj50.m88271j(this.f281901b, ((yl81) obj).f273939a);
        }
    }

    public ze8(String str, ujb0 ujb0Var) {
        this.f281900a = 7;
        this.f281901b = str;
    }

    public ze8(qyp qypVar, String str) {
        this.f281900a = 2;
        this.f281901b = str;
    }

    public ze8() {
        String strM89350c;
        this.f281900a = 13;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest("android-system-previewcard-previewcoordinator-impl".getBytes(vuc.f244913a));
            uy8 uy8Var = wy8.f256229a;
            strM89350c = (uy8Var.f246001d == null ? uy8Var : uy8Var.mo81954h(uy8Var.f246000c, null)).m89350c(bArrDigest, 16);
            wj50.m88279p(strM89350c);
        } catch (Exception unused) {
            strM89350c = "";
        }
        this.f281901b = strM89350c;
    }
}
