package p204p;

import androidx.media3.muxer.MuxerException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class qj40 implements nsi0 {

    /* JADX INFO: renamed from: a */
    public final nch1 f189152a;

    /* JADX INFO: renamed from: b */
    public final boolean f189153b = true;

    public qj40(nch1 nch1Var) {
        this.f189152a = nch1Var;
    }

    @Override // p204p.nsi0
    /* JADX INFO: renamed from: b */
    public final wsv0 mo65562b(int i) {
        if (i == 2) {
            return n4i0.f150349g;
        }
        if (i == 1) {
            return n4i0.f150350h;
        }
        kf40 kf40Var = pf40.f176960b;
        return wsv0.f254763e;
    }

    @Override // p204p.nsi0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final rj40 mo65561a(String str) throws MuxerException {
        try {
            return new rj40(new n4i0(new lwy(new FileOutputStream(str)), this.f189153b), this.f189152a, -9223372036854775807L);
        } catch (FileNotFoundException e) {
            throw new MuxerException("Error creating file output stream", e);
        }
    }

    @Override // p204p.nsi0
    /* JADX INFO: renamed from: c */
    public final void mo65563c() {
    }
}
