package p204p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class rvm0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final n6q f203101a;

    /* JADX INFO: renamed from: b */
    public final b770 f203102b;

    /* JADX INFO: renamed from: c */
    public final vmz f203103c;

    /* JADX INFO: renamed from: d */
    public final pkh f203104d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f203105e;

    public rvm0(n6q n6qVar, b770 b770Var, vmz vmzVar, pkh pkhVar) {
        this.f203101a = n6qVar;
        this.f203102b = b770Var;
        this.f203103c = vmzVar;
        this.f203104d = pkhVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f203105e = new pfm0(new qfm0[]{new q040(xgg1.m90662N1("PARENTAL_CONTROL_PARENT_DETAILS", "parental-control/parent-details", 1364, "parental-control"), xoc1.f263909I6, null), new e6m0(true), new maa0(), new fda(null, bda.f26062b, null, 0, null, n6qVar, false, false, true, 1757)}, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r7 == r4) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m76484c(rvm0 rvm0Var, ibk ibkVar) {
        qvm0 qvm0Var;
        Uri uri;
        if (ibkVar instanceof qvm0) {
            qvm0Var = (qvm0) ibkVar;
            int i = qvm0Var.f193055c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qvm0Var.f193055c = i - Integer.MIN_VALUE;
            } else {
                qvm0Var = new qvm0(rvm0Var, ibkVar);
            }
        } else {
            qvm0Var = new qvm0(rvm0Var, ibkVar);
        }
        Object objM86755t = qvm0Var.f193053a;
        int i2 = qvm0Var.f193055c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM86024a = rvm0Var.f203103c.m86024a("show-linked-parent-in-settings", false);
            qvm0Var.f193055c = 1;
            objM86755t = vyf1.m86755t(fizVarM86024a, qvm0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        gwm0 gwm0Var = (gwm0) objM86755t;
        emr0 emr0Var = gwm0Var.f85047b;
        String str = emr0Var.f60974a;
        String str2 = emr0Var.f60975b;
        if (str2 == null || (uri = Uri.parse(str2)) == null) {
            uri = Uri.EMPTY;
        }
        wj50.m88279p(uri);
        return new uvm0(gwm0Var.f85046a, uri, str);
        if (!((Boolean) objM86755t).booleanValue()) {
            throw new IllegalStateException("Current account is not eligible to view linked parent details");
        }
        b770 b770Var = rvm0Var.f203102b;
        qvm0Var.f193055c = 2;
        objM86755t = ((h770) b770Var).m46762d(qvm0Var);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f203105e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f203104d.m70217a(new u4a0(new bya0(this, null, 9), bk5.m29613h0(new v4a0[0])), new fyf(new bnl0(this, 8), true, -130303019), new hlh(null, null, null, false, 63));
    }
}
