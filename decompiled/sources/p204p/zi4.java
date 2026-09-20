package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zi4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f283074a;

    /* JADX INFO: renamed from: b */
    public final bji f283075b;

    /* JADX INFO: renamed from: c */
    public final wg61 f283076c = new wg61(new si4(this, 6));

    public zi4(boolean z, bji bjiVar) {
        this.f283074a = z;
        this.f283075b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m96193a() {
        zi4 zi4Var = (zi4) this.f283076c.getValue();
        return zi4Var != null ? zi4Var.m96193a() : this.f283074a;
    }

    @Override // p204p.iys0
    public final List models() {
        return Collections.singletonList(new k8a("fix_seek_gesture_event_ordering", "android-nowplaying-elements-segmentedseekbar", m96193a()));
    }
}
