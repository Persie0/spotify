package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class v170 {

    /* JADX INFO: renamed from: a */
    public final in9 f236269a;

    /* JADX INFO: renamed from: b */
    public final e470 f236270b;

    /* JADX INFO: renamed from: c */
    public final ch9 f236271c;

    /* JADX INFO: renamed from: d */
    public w170 f236272d;

    public v170(h9y0 h9y0Var, in9 in9Var, e470 e470Var, ch9 ch9Var) {
        this.f236269a = in9Var;
        this.f236270b = e470Var;
        this.f236271c = ch9Var;
        h9y0Var.mo34135x().m41112e("kid_creation_account_state");
        h9y0Var.mo34135x().m41110c("kid_creation_account_state", new C1982ik(this, 8));
        h9y0Var.getLifecycle().mo31986a(new C2018jk(1, this, h9y0Var));
        Parcelable.Creator<w170> creator = w170.CREATOR;
        ssg1.m79211o();
        this.f236272d = w170.f246993L0;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m84448e(w170 w170Var) {
        return w170Var.f247004h && w170Var.f247003g;
    }

    /* JADX INFO: renamed from: a */
    public final void m84449a(d850 d850Var) {
        voc1 voc1Var;
        voc1 voc1Var2;
        boolean zM84448e = m84448e(this.f236272d);
        in9 in9Var = this.f236269a;
        v270 v270Var = v270.f236557a;
        if (zM84448e) {
            b370 b370Var = this.f236272d.f246995Y;
            if (wj50.m88271j(b370Var, v270Var)) {
                voc1Var2 = xoc1.f264178r3;
            } else {
                if (!(b370Var instanceof x270)) {
                    if (!(b370Var instanceof a370)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("ParentalConsent flows should use AccountCreationFlowManager");
                }
                voc1Var2 = xoc1.f263858C3;
            }
            Bundle bundle = new Bundle();
            bundle.putString("name", this.f236272d.f246998b);
            bundle.putParcelable("pages", m84452d(voc1Var2));
            bundle.putParcelable("flow_type", this.f236272d.f246995Y);
            in9Var.m51124c(voc1Var2.f243453a, d850Var, bundle);
            return;
        }
        b370 b370Var2 = this.f236272d.f246995Y;
        if (wj50.m88271j(b370Var2, v270Var)) {
            voc1Var = xoc1.f264138m3;
        } else {
            if (!(b370Var2 instanceof x270)) {
                if (!(b370Var2 instanceof a370)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("ParentalConsent flows should use AccountCreationFlowManager");
            }
            voc1Var = xoc1.f263866D3;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("pin", this.f236272d.f246997a);
        bundle2.putParcelable("pages", m84452d(voc1Var));
        bundle2.putParcelable("key_flow_type", this.f236272d.f246995Y);
        in9Var.m51124c(voc1Var.f243453a, d850Var, bundle2);
    }

    /* JADX INFO: renamed from: b */
    public final String m84450b() {
        b370 b370Var = this.f236272d.f246995Y;
        if (wj50.m88271j(b370Var, v270.f236557a)) {
            return xoc1.f264186s3.f243453a;
        }
        if (b370Var instanceof x270) {
            return xoc1.f263882F3.f243453a;
        }
        if (b370Var instanceof a370) {
            throw new IllegalStateException("ParentalConsent flows should use AccountCreationFlowManager");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final int m84451c() {
        return m84448e(this.f236272d) ? 4 : 5;
    }

    /* JADX INFO: renamed from: d */
    public final cpm0 m84452d(voc1 voc1Var) {
        if (voc1Var.equals(xoc1.f264138m3) || voc1Var.equals(xoc1.f263866D3)) {
            w170 w170Var = this.f236272d;
            if (w170Var.f247004h && w170Var.f247003g) {
                throw new IllegalArgumentException("The page shouldn't be reachable");
            }
            return new cpm0(1, m84451c());
        }
        if (voc1Var.equals(xoc1.f264178r3) || voc1Var.equals(xoc1.f263858C3)) {
            return new cpm0(m84448e(this.f236272d) ? 1 : 2, m84451c());
        }
        if (voc1Var.equals(xoc1.f264146n3)) {
            return new cpm0(m84448e(this.f236272d) ? 2 : 3, m84451c());
        }
        if (voc1Var.equals(xoc1.f264186s3)) {
            return new cpm0(m84448e(this.f236272d) ? 3 : 4, m84451c());
        }
        if (voc1Var.equals(xoc1.f264194t3) || voc1Var.equals(xoc1.f263890G3)) {
            return new cpm0(m84448e(this.f236272d) ? 4 : 5, m84451c());
        }
        return new cpm0(0, 0);
    }
}
