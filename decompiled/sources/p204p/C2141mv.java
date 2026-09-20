package p204p;

import android.content.Context;
import com.comscore.util.log.LogLevel;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Calendar;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.mv */
/* JADX INFO: loaded from: classes18.dex */
public final class C2141mv implements Function, Predicate {

    /* JADX INFO: renamed from: a */
    public final Object f147460a;

    public /* synthetic */ C2141mv(Object obj) {
        this.f147460a = obj;
    }

    /* JADX INFO: renamed from: a */
    public s1v m62883a() {
        Context context = (Context) this.f147460a;
        Context applicationContext = context.getApplicationContext();
        zk1 zk1Var = new zk1(context.getApplicationContext());
        zk1Var.m96268L();
        return s1v.m76988a(applicationContext, "accountswitching_encrypted_sharedprefs", zk1Var.m96280f(), q1v.f184410b, r1v.f194925b);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        InterfaceC1720bw interfaceC1720bw = (InterfaceC1720bw) obj;
        if (interfaceC1720bw instanceof C2664zv) {
            ((C2664zv) interfaceC1720bw).f286569a.m82202b((sh7) this.f147460a, 0);
            return Single.just(Boolean.TRUE);
        }
        if (interfaceC1720bw.equals(C1682aw.f20328a)) {
            return Single.just(Boolean.FALSE);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public synchronized Single m62884b(wi7 wi7Var, boolean z) {
        Single singleJust;
        if (z) {
            singleJust = ((fta0) this.f147460a).m42589a(C2104lv.m60044a(wi7Var.f251544c)).take(1L).map(C2100lr.f136176h).singleOrError();
            wj50.m88279p(singleJust);
        } else {
            try {
                C1856fd c1856fd = wi7Var.f251543b;
                if (c1856fd != null && Calendar.getInstance().getTimeInMillis() + ((long) LogLevel.NONE) <= c1856fd.f68283c.getTime()) {
                    singleJust = Single.just(new bj7(wi7Var));
                    wj50.m88279p(singleJust);
                } else {
                    singleJust = ((fta0) this.f147460a).m42589a(C2104lv.m60044a(wi7Var.f251544c)).take(1L).map(C2100lr.f136176h).singleOrError();
                    wj50.m88279p(singleJust);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return singleJust;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        e301 e301Var = (e301) obj;
        return mkg1.m62160v(e301Var) && wj50.m88271j(e301Var.f55571a, (String) this.f147460a);
    }

    public C2141mv(fta0 fta0Var, xre xreVar) {
        this.f147460a = fta0Var;
    }
}
