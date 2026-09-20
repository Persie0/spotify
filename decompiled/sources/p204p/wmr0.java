package p204p;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class wmr0 implements yf0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mpr0 f252969b;

    public /* synthetic */ wmr0(mpr0 mpr0Var, int i) {
        this.f252968a = i;
        this.f252969b = mpr0Var;
    }

    @Override // p204p.yf0
    /* JADX INFO: renamed from: a */
    public final void mo25836a(Object obj) {
        switch (this.f252968a) {
            case 0:
                Boolean bool = (Boolean) ((Map) obj).get("android.permission.CAMERA");
                if (bool != null) {
                    this.f252969b.m62500b(new yor0(bool.booleanValue()));
                    return;
                }
                return;
            case 1:
                fzn0 fzn0Var = (fzn0) obj;
                boolean z = fzn0Var instanceof ezn0;
                mpr0 mpr0Var = this.f252969b;
                if (z) {
                    mpr0Var.m62500b(new cpr0(((ezn0) fzn0Var).f64421a.toString()));
                    return;
                } else if (fzn0Var instanceof dzn0) {
                    mpr0Var.m62500b(bpr0.f29570a);
                    return;
                } else {
                    if (!(fzn0Var instanceof czn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 2:
                Boolean bool2 = (Boolean) ((Map) obj).get("android.permission.CAMERA");
                if (bool2 != null) {
                    this.f252969b.m62500b(new yor0(bool2.booleanValue()));
                    return;
                }
                return;
            default:
                fzn0 fzn0Var2 = (fzn0) obj;
                boolean z2 = fzn0Var2 instanceof ezn0;
                mpr0 mpr0Var2 = this.f252969b;
                if (z2) {
                    mpr0Var2.m62500b(new cpr0(((ezn0) fzn0Var2).f64421a.toString()));
                    return;
                } else if (fzn0Var2 instanceof dzn0) {
                    mpr0Var2.m62500b(bpr0.f29570a);
                    return;
                } else {
                    if (!(fzn0Var2 instanceof czn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
        }
    }
}
