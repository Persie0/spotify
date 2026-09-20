package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class x39 extends iro {

    /* JADX INFO: renamed from: X */
    public int f257714X;

    /* JADX INFO: renamed from: i */
    public long f257715i;

    /* JADX INFO: renamed from: t */
    public int f257716t;

    @Override // p204p.iro
    /* JADX INFO: renamed from: g */
    public final void mo51465g() {
        super.mo51465g();
        this.f257716t = 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m89779k(iro iroVar) {
        ByteBuffer byteBuffer;
        c95.m31843i(!iroVar.m67519d(1073741824));
        c95.m31843i(!iroVar.m67519d(268435456));
        c95.m31843i(!iroVar.m67519d(4));
        if (m89780l()) {
            if (this.f257716t >= this.f257714X) {
                return false;
            }
            ByteBuffer byteBuffer2 = iroVar.f105018d;
            if (byteBuffer2 != null && (byteBuffer = this.f105018d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f257716t;
        this.f257716t = i + 1;
        if (i == 0) {
            this.f105020f = iroVar.f105020f;
            if (iroVar.m67519d(1)) {
                this.f167824a = 1;
            }
        }
        ByteBuffer byteBuffer3 = iroVar.f105018d;
        if (byteBuffer3 != null) {
            m51467i(byteBuffer3.remaining());
            this.f105018d.put(byteBuffer3);
        }
        this.f257715i = iroVar.f105020f;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m89780l() {
        return this.f257716t > 0;
    }
}
