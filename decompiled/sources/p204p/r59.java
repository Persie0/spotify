package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class r59 extends ky8 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f195995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r59(l7j l7jVar, int i) {
        super(l7jVar);
        this.f195995b = i;
    }

    @Override // p204p.e6j
    /* JADX INFO: renamed from: b */
    public final boolean mo37942b(i1e1 i1e1Var) {
        switch (this.f195995b) {
            case 0:
                return i1e1Var.f97508j.f13305c;
            case 1:
                return i1e1Var.f97508j.f13303a == 2;
            case 2:
                int i = i1e1Var.f97508j.f13303a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return i1e1Var.f97508j.f13308f;
        }
    }

    @Override // p204p.ky8
    /* JADX INFO: renamed from: d */
    public final int mo57645d() {
        switch (this.f195995b) {
            case 0:
                return 6;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 9;
        }
    }

    @Override // p204p.ky8
    /* JADX INFO: renamed from: e */
    public final boolean mo57646e(Object obj) {
        boolean zBooleanValue;
        switch (this.f195995b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                aij0 aij0Var = (aij0) obj;
                boolean z = aij0Var.f16001a;
                return Build.VERSION.SDK_INT < 26 ? !z : !(z && aij0Var.f16002b);
            case 2:
                aij0 aij0Var2 = (aij0) obj;
                return !aij0Var2.f16001a || aij0Var2.f16003c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
