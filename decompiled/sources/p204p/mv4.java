package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class mv4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f147508a;

    /* JADX INFO: renamed from: b */
    public final bji f147509b;

    /* JADX INFO: renamed from: c */
    public final wg61 f147510c;

    public mv4(boolean z, bji bjiVar) {
        this.f147508a = z;
        this.f147509b = bjiVar;
        this.f147510c = new wg61(new uu4(this, 12));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62901a() {
        mv4 mv4Var = (mv4) this.f147510c.getValue();
        return mv4Var != null ? mv4Var.m62901a() : this.f147508a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("is_playback_attribution_enabled", "android-widgets-widget-attribution-impl", m62901a()));
    }

    public mv4(bji bjiVar) {
        this(false, bjiVar);
    }
}
