package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hla1 {

    /* JADX INFO: renamed from: a */
    public final vxz0 f92657a;

    /* JADX INFO: renamed from: b */
    public final jla1 f92658b;

    /* JADX INFO: renamed from: c */
    public final j28 f92659c;

    /* JADX INFO: renamed from: d */
    public final List f92660d;

    /* JADX INFO: renamed from: e */
    public boolean f92661e = false;

    /* JADX INFO: renamed from: f */
    public boolean f92662f = false;

    public hla1(vxz0 vxz0Var, jla1 jla1Var, j28 j28Var, List list) {
        this.f92657a = vxz0Var;
        this.f92658b = jla1Var;
        this.f92659c = j28Var;
        this.f92660d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.f92657a);
        sb.append(", mUseCaseConfig=");
        sb.append(this.f92658b);
        sb.append(", mStreamSpec=");
        sb.append(this.f92659c);
        sb.append(", mCaptureTypes=");
        sb.append(this.f92660d);
        sb.append(", mAttached=");
        sb.append(this.f92661e);
        sb.append(", mActive=");
        return s571.m77253l(sb, this.f92662f, '}');
    }
}
