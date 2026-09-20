package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mu3 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f147242a;

    /* JADX INFO: renamed from: b */
    public final boolean f147243b;

    /* JADX INFO: renamed from: c */
    public final bji f147244c;

    /* JADX INFO: renamed from: d */
    public final wg61 f147245d = new wg61(new ju3(this, 2));

    public mu3(boolean z, boolean z2, bji bjiVar) {
        this.f147242a = z;
        this.f147243b = z2;
        this.f147244c = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62833a() {
        mu3 mu3Var = (mu3) this.f147245d.getValue();
        return mu3Var != null ? mu3Var.m62833a() : this.f147242a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m62834b() {
        mu3 mu3Var = (mu3) this.f147245d.getValue();
        return mu3Var != null ? mu3Var.m62834b() : this.f147243b;
    }

    @Override // p204p.iys0
    public final List models() {
        return h6f.m46715L(new k8a("enable_contiguous_viewability_observer_for_in_stream_ads", "android-adsinternal-playback", m62833a()), new k8a("enable_continuous_viewability_observer_for_in_stream_ads", "android-adsinternal-playback", m62834b()));
    }
}
