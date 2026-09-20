package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class b6a0 implements w4a0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f23889a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f23890b;

    /* JADX INFO: renamed from: c */
    public final boolean f23891c;

    /* JADX INFO: renamed from: d */
    public final String f23892d;

    /* JADX INFO: renamed from: e */
    public final w4a0 f23893e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f23894f = new AtomicBoolean(false);

    public b6a0(Scheduler scheduler, luk lukVar, z9j0 z9j0Var, boolean z, String str, w4a0 w4a0Var) {
        this.f23889a = scheduler;
        this.f23890b = z9j0Var;
        this.f23891c = z;
        this.f23892d = str;
        this.f23893e = w4a0Var;
    }

    @Override // p204p.w4a0
    /* JADX INFO: renamed from: a */
    public final void mo28287a(Bundle bundle) {
        this.f23893e.mo28287a(bundle);
    }

    @Override // p204p.w4a0
    /* JADX INFO: renamed from: b */
    public final Observable mo28288b() {
        return this.f23893e.mo28288b().observeOn(this.f23889a).doOnNext(new dh30(this, 20));
    }

    @Override // p204p.w4a0
    public final Bundle serialize() {
        return this.f23893e.serialize();
    }
}
