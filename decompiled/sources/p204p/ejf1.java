package p204p;

import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ejf1 extends BasePendingResult {

    /* JADX INFO: renamed from: X0 */
    public use1 f60219X0;

    /* JADX INFO: renamed from: Y0 */
    public final boolean f60220Y0;

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ ydw0 f60221Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejf1(ydw0 ydw0Var, boolean z) {
        super((r3f1) null);
        Objects.requireNonNull(ydw0Var);
        this.f60221Z0 = ydw0Var;
        this.f60220Y0 = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ d7x0 mo1492Z(Status status) {
        return new eif1(this, status);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo39176k0();

    /* JADX INFO: renamed from: l0 */
    public final lhf1 m39177l0() {
        if (this.f60219X0 == null) {
            this.f60219X0 = new use1(this);
        }
        return this.f60219X0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m39178m0() {
        if (!this.f60220Y0) {
            ydw0 ydw0Var = this.f60221Z0;
            Iterator it = ydw0Var.f271870g.iterator();
            if (it.hasNext()) {
                throw ikc0.m50937i(it);
            }
            Iterator it2 = ydw0Var.f271871h.iterator();
            while (it2.hasNext()) {
                ((aqg1) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.f60221Z0.f271864a) {
                mo39176k0();
            }
        } catch (zzap unused) {
            m1493a(new eif1(this, new Status(2100, null, null, null)));
        }
    }
}
