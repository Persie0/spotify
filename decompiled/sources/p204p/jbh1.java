package p204p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class jbh1 implements Function {

    /* JADX INFO: renamed from: c */
    public static final jbh1 f110802c;

    /* JADX INFO: renamed from: d */
    public static final jbh1 f110803d;

    /* JADX INFO: renamed from: e */
    public static final jbh1 f110804e;

    /* JADX INFO: renamed from: f */
    public static final jbh1 f110805f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110806a;

    /* JADX INFO: renamed from: b */
    public String f110807b;

    static {
        int i = 0;
        f110802c = new jbh1("TINK", i);
        f110803d = new jbh1("CRUNCHY", i);
        f110804e = new jbh1("LEGACY", i);
        f110805f = new jbh1("NO_PREFIX", i);
    }

    public /* synthetic */ jbh1(String str, int i) {
        this.f110806a = i;
        this.f110807b = str;
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m52909a(Context context) {
        try {
            if (this.f110807b == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                this.f110807b = installerPackageName;
            }
        } catch (Throwable th) {
            throw th;
        }
        return "".equals(this.f110807b) ? null : this.f110807b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 java.lang.Object, still in use, count: 2, list:
          (r1v14 java.lang.Object) from 0x0030: PHI (r1 I:??) = (r1v11 java.lang.Object), (r1v14 java.lang.Object) binds: [B:12:0x002f, B:67:0x0030] A[DONT_GENERATE, DONT_INLINE]
          (r1v14 java.lang.Object) from 0x0024: CHECK_CAST (p.pob) (r1v14 java.lang.Object)
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
    public java.lang.Object mo98394apply(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.jbh1.mo98394apply(java.lang.Object):java.lang.Object");
    }

    public String toString() {
        switch (this.f110806a) {
            case 0:
                return this.f110807b;
            default:
                return super.toString();
        }
    }

    public jbh1(Context context) {
        this.f110806a = 1;
        this.f110807b = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    public jbh1() {
        this.f110806a = 6;
    }
}
