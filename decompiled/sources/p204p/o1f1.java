package p204p;

import android.content.SharedPreferences;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase;
import com.ravelin.core.repository.p008db.AppDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class o1f1 implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final h4t0 f160728a;

    /* JADX INFO: renamed from: b */
    public final h4t0 f160729b;

    /* JADX INFO: renamed from: c */
    public final h4t0 f160730c;

    /* JADX INFO: renamed from: d */
    public final h4t0 f160731d;

    /* JADX INFO: renamed from: e */
    public final h4t0 f160732e;

    public o1f1(j7n0 j7n0Var, i2f1 i2f1Var, i2f1 i2f1Var2, h4t0 h4t0Var, h4t0 h4t0Var2, h4t0 h4t0Var3) {
        this.f160728a = i2f1Var;
        this.f160729b = i2f1Var2;
        this.f160730c = h4t0Var;
        this.f160731d = h4t0Var2;
        this.f160732e = h4t0Var3;
    }

    @Override // p204p.i4t0
    public final Object get() {
        return new qve((AppDatabase) this.f160728a.get(), (BroadcastsDatabase) this.f160729b.get(), (l2f1) this.f160730c.get(), (SharedPreferences) this.f160731d.get(), (xd70) this.f160732e.get());
    }
}
