package p204p;

import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mw51 implements pzo0 {

    /* JADX INFO: renamed from: a */
    public final BehaviorProcessor f147716a;

    /* JADX INFO: renamed from: b */
    public final BehaviorProcessor f147717b;

    /* JADX INFO: renamed from: c */
    public List f147718c;

    /* JADX INFO: renamed from: d */
    public fv51 f147719d;

    /* JADX INFO: renamed from: e */
    public final BehaviorProcessor f147720e;

    /* JADX INFO: renamed from: f */
    public final BehaviorProcessor f147721f;

    public mw51() {
        BehaviorProcessor behaviorProcessor = new BehaviorProcessor();
        this.f147716a = behaviorProcessor;
        BehaviorProcessor behaviorProcessor2 = new BehaviorProcessor();
        this.f147717b = behaviorProcessor2;
        this.f147718c = lau.f131415a;
        this.f147720e = behaviorProcessor;
        this.f147721f = behaviorProcessor2;
    }

    @Override // p204p.pzo0
    /* JADX INFO: renamed from: a */
    public final ozo0 mo32013a(yzo0 yzo0Var, noo0 noo0Var, ujx ujxVar, String str) {
        return new lw51(this);
    }
}
