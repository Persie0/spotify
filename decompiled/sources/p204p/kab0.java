package p204p;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kab0 {

    /* JADX INFO: renamed from: a */
    public final HashSet f120856a;

    /* JADX INFO: renamed from: b */
    public final wra f120857b;

    /* JADX INFO: renamed from: c */
    public LoudnessCodecController f120858c;

    public kab0() {
        wra wraVar = wra.f254302f;
        this.f120856a = new HashSet();
        this.f120857b = wraVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m55899a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f120858c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            c95.m31855u(this.f120856a.add(mediaCodec));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m55900b() {
        this.f120856a.clear();
        LoudnessCodecController loudnessCodecController = this.f120858c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55901c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f120856a.remove(mediaCodec) || (loudnessCodecController = this.f120858c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: d */
    public final void m55902d(int i) {
        LoudnessCodecController loudnessCodecController = this.f120858c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f120858c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, ckr.f39074a, new jab0(this));
        this.f120858c = loudnessCodecControllerCreate;
        Iterator it = this.f120856a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
