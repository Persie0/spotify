package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class mwx0 {

    /* JADX INFO: renamed from: a */
    public final Observable f147894a;

    /* JADX INFO: renamed from: b */
    public final xoi0 f147895b;

    /* JADX INFO: renamed from: c */
    public Disposable f147896c;

    /* JADX INFO: renamed from: d */
    public final boolean f147897d;

    /* JADX INFO: renamed from: e */
    public final boolean f147898e;

    public mwx0(Observable observable, boolean z, boolean z2) {
        fby.m41270e();
        this.f147895b = new xoi0(r3a0.f195465a);
        this.f147894a = observable;
        this.f147897d = z;
        this.f147898e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m63069a() {
        if (this.f147896c != null) {
            throw new IllegalStateException("Loader is already running.");
        }
        this.f147896c = this.f147894a.subscribe(new xc5(this, 17));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m63070b() {
        m63071c();
    }

    /* JADX INFO: renamed from: c */
    public final void m63071c() {
        Disposable disposable = this.f147896c;
        if (disposable == null) {
            throw new IllegalStateException("This loader has already been stopped.");
        }
        disposable.dispose();
        this.f147896c = null;
        if (this.f147897d) {
            fby.m41270e();
            this.f147895b.m33101j(r3a0.f195465a);
        }
    }
}
