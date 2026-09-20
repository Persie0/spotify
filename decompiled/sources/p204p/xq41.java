package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class xq41 {

    /* JADX INFO: renamed from: a */
    public final tc31 f264872a;

    /* JADX INFO: renamed from: b */
    public final mb80 f264873b;

    /* JADX INFO: renamed from: c */
    public final an10 f264874c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f264875d;

    public xq41(tc31 tc31Var, mb80 mb80Var, an10 an10Var, Scheduler scheduler) {
        this.f264872a = tc31Var;
        this.f264873b = mb80Var;
        this.f264874c = an10Var;
        this.f264875d = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public static final Single m91816a(xq41 xq41Var, String str) {
        return k0e1.m54988g(b0g1.m27791m(new gso0(xq41Var.f264873b.f141817b.current(), str, 4)), dau.f47107a).timeout(11L, TimeUnit.SECONDS, xq41Var.f264875d).firstOrError();
    }

    /* JADX INFO: renamed from: b */
    public final Single m91817b(uq41 uq41Var, kq41 kq41Var) {
        Single singleFlatMap;
        boolean z = kq41Var instanceof jq41;
        tc31 tc31Var = this.f264872a;
        if (z) {
            bd31 bd31Var = (bd31) tc31Var;
            Object obj = null;
            singleFlatMap = bd31Var.m28790a(o131.f160593V0, o131.f160594W0).doOnSubscribe(new wk6(bd31Var, obj, ((jq41) kq41Var).m54033a(), 29)).flatMap(new d501(this, 10));
        } else {
            if (!(kq41Var instanceof iq41)) {
                throw new NoWhenBranchMatchedException();
            }
            bd31 bd31Var2 = (bd31) tc31Var;
            singleFlatMap = bd31Var2.m28790a(o131.f160591T0, o131.f160592U0).doOnSubscribe(new nyp(bd31Var2, ((iq41) kq41Var).m51339a(), 2)).flatMap(new wiy0(this, 19));
        }
        return singleFlatMap.compose(new y3z0(27, this, uq41Var));
    }
}
