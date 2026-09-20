package p204p;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class eg30 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59205a;

    /* JADX INFO: renamed from: b */
    public final Object f59206b;

    /* JADX INFO: renamed from: c */
    public final Object f59207c;

    public /* synthetic */ eg30(int i, Object obj, Object obj2) {
        this.f59205a = i;
        this.f59206b = obj;
        this.f59207c = obj2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f59205a) {
            case 0:
                fg30 fg30Var = (fg30) this.f59207c;
                ig30 ig30Var = (ig30) this.f59206b;
                try {
                    if (!ig30Var.m50466a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (ig30Var.m50466a(false, this)) {
                    }
                    fg30Var.m41564a(1, 9, null);
                    a0f1.m24341b(ig30Var);
                    return w2a1.f247311a;
                } catch (IOException e) {
                    fg30Var.m41564a(2, 2, e);
                } catch (Throwable th) {
                    fg30Var.m41564a(3, 3, null);
                    a0f1.m24341b(ig30Var);
                    throw th;
                }
                break;
            case 1:
                cq60 cq60Var = (cq60) this.f59206b;
                zp60 zp60Var = (zp60) this.f59207c;
                if (ci61.m32881a()) {
                    Metadata metadata = (Metadata) cq60Var.f40745b.getAnnotation(Metadata.class);
                    if (metadata == null) {
                        return null;
                    }
                    eug1 eug1VarM36964t = dug1.m36964t(metadata);
                    kb70 kb70Var = eug1VarM36964t instanceof kb70 ? (kb70) eug1VarM36964t : null;
                    if (kb70Var != null) {
                        return kb70Var.m55934p();
                    }
                    return null;
                }
                nfe nfeVarM96659b = zp60Var.m96659b();
                if (!(nfeVarM96659b instanceof ji00)) {
                    fyq fyqVar = nfeVarM96659b instanceof fyq ? (fyq) nfeVarM96659b : null;
                    if (fyqVar != null) {
                        return dug1.m36967w(fyqVar.m43112B0(), fyqVar.m43111A0().m77093z(), false, 6);
                    }
                    return null;
                }
                ji00 ji00Var = (ji00) nfeVarM96659b;
                if (ji00Var.m53439B0() instanceof si00) {
                    return h1h1.m46448s(ji00Var.m53438A0());
                }
                throw new cvk("Unsupported function type kind: " + ji00Var.m53439B0() + " (" + nfeVarM96659b + ')');
            default:
                return ((rwx0) ((qwx0) this.f59206b)).f203428a.map(new mab0(this, 26)).distinctUntilChanged();
        }
    }

    public eg30(fg30 fg30Var, ig30 ig30Var) {
        this.f59205a = 0;
        this.f59207c = fg30Var;
        this.f59206b = ig30Var;
    }
}
