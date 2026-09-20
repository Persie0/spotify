package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jq4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final int f114784a;

    /* JADX INFO: renamed from: b */
    public final bji f114785b;

    /* JADX INFO: renamed from: c */
    public final wg61 f114786c = new wg61(new kp4(this, 18));

    public jq4(int i, bji bjiVar) {
        this.f114784a = i;
        this.f114785b = bjiVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m54032a() {
        jq4 jq4Var = (jq4) this.f114786c.getValue();
        return jq4Var != null ? jq4Var.m54032a() : this.f114784a;
    }

    @Override // p204p.iys0
    public final List models() {
        return geg1.m44518y(new k8a("max_number_of_tracks", "android-system-offline-playablecacheimpl", m54032a(), 0, 100000));
    }
}
