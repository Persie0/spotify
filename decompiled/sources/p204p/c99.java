package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class c99 {

    /* JADX INFO: renamed from: a */
    public final u99 f35423a;

    /* JADX INFO: renamed from: b */
    public final s99 f35424b;

    /* JADX INFO: renamed from: c */
    public final q99 f35425c;

    /* JADX INFO: renamed from: d */
    public final q99 f35426d;

    /* JADX INFO: renamed from: e */
    public final iin f35427e;

    /* JADX INFO: renamed from: f */
    public final k4k0 f35428f;

    /* JADX INFO: renamed from: g */
    public final y3l0 f35429g;

    /* JADX INFO: renamed from: h */
    public final o89 f35430h;

    /* JADX INFO: renamed from: i */
    public final Scheduler f35431i;

    /* JADX INFO: renamed from: j */
    public final lwr f35432j = new lwr();

    public c99(u99 u99Var, s99 s99Var, q99 q99Var, q99 q99Var2, iin iinVar, k4k0 k4k0Var, y3l0 y3l0Var, o89 o89Var, Scheduler scheduler) {
        this.f35423a = u99Var;
        this.f35424b = s99Var;
        this.f35425c = q99Var;
        this.f35426d = q99Var2;
        this.f35427e = iinVar;
        this.f35428f = k4k0Var;
        this.f35429g = y3l0Var;
        this.f35430h = o89Var;
        this.f35431i = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final Single m31898a(t6s t6sVar, String str) {
        return this.f35427e.m50751m(new g6s(yif1.m93822y(t6sVar.m80165d()) ? new i9s(t6sVar.m80165d()) : new i9s(str)), new c8s());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31899b(String str, f6s f6sVar) {
        q99 q99Var;
        try {
            int iOrdinal = this.f35430h.m66420a().f151398B1.ordinal();
            if (iOrdinal == 0) {
                q99Var = this.f35425c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                q99Var = this.f35426d;
            }
            q99Var.mo62497a(str, iug1.m51687p(f6sVar));
            return true;
        } catch (Exception e) {
            Logger.m3974j(e, "Unable to refresh license for %s", str);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31900c(long j, ka80 ka80Var, String str) {
        nha0 nha0VarM55379f = this.f35428f.m55379f(str);
        try {
            return ((Number) nha0VarM55379f.m64454d(ka80Var.m55871b()).f180350a).longValue() < j;
        } finally {
            nha0VarM55379f.m64459i();
        }
    }
}
