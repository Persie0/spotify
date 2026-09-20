package p204p;

import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes11.dex */
public final class mx20 implements lx20 {

    /* JADX INFO: renamed from: a */
    public final btv0 f147934a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f147935b;

    /* JADX INFO: renamed from: c */
    public final wg61 f147936c = new wg61(new si20(this, 6));

    public mx20(btv0 btv0Var, Scheduler scheduler) {
        this.f147934a = btv0Var;
        this.f147935b = scheduler;
    }

    @Override // p204p.lx20
    /* JADX INFO: renamed from: a */
    public final ObservableTransformer mo60158a() {
        return (ObservableTransformer) this.f147936c.getValue();
    }

    @Override // p204p.lx20
    /* JADX INFO: renamed from: b */
    public final void mo60159b(String str, dsr dsrVar) {
        ox20 ox20Var = (ox20) this.f147934a.get(str);
        if (ox20Var != null) {
            ox20Var.mo49418a(dsrVar);
        }
    }
}
