package p204p;

import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ybd0 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f271161b;

    public /* synthetic */ ybd0(Object obj, int i) {
        this.f271160a = i;
        this.f271161b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f271160a) {
            case 0:
                lbd0 lbd0Var = ((jcd0) this.f271161b).f111079a;
                Objects.requireNonNull(lbd0Var);
                lbd0Var.m58660c1(new ig10(lbd0Var, 16));
                break;
            default:
                ((sef0) this.f271161b).m77897p();
                break;
        }
    }
}
