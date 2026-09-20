package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class hro {

    /* JADX INFO: renamed from: a */
    public int f94493a;

    /* JADX INFO: renamed from: b */
    public int f94494b;

    /* JADX INFO: renamed from: c */
    public int f94495c;

    /* JADX INFO: renamed from: d */
    public int f94496d;

    /* JADX INFO: renamed from: e */
    public int f94497e;

    /* JADX INFO: renamed from: f */
    public int f94498f;

    /* JADX INFO: renamed from: g */
    public int f94499g;

    /* JADX INFO: renamed from: h */
    public int f94500h;

    /* JADX INFO: renamed from: i */
    public int f94501i;

    /* JADX INFO: renamed from: j */
    public int f94502j;

    /* JADX INFO: renamed from: k */
    public long f94503k;

    /* JADX INFO: renamed from: l */
    public int f94504l;

    public final String toString() {
        int i = this.f94493a;
        int i2 = this.f94494b;
        int i3 = this.f94495c;
        int i4 = this.f94496d;
        int i5 = this.f94497e;
        int i6 = this.f94498f;
        int i7 = this.f94499g;
        int i8 = this.f94500h;
        int i9 = this.f94501i;
        int i10 = this.f94502j;
        long j = this.f94503k;
        int i11 = this.f94504l;
        String str = h0b1.f86200a;
        Locale locale = Locale.US;
        StringBuilder sbM36619s = dq60.m36619s(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        sbM36619s.append(i3);
        sbM36619s.append("\n skippedInputBuffers=");
        sbM36619s.append(i4);
        sbM36619s.append("\n renderedOutputBuffers=");
        sbM36619s.append(i5);
        sbM36619s.append("\n skippedOutputBuffers=");
        sbM36619s.append(i6);
        sbM36619s.append("\n droppedBuffers=");
        sbM36619s.append(i7);
        sbM36619s.append("\n droppedInputBuffers=");
        sbM36619s.append(i8);
        sbM36619s.append("\n maxConsecutiveDroppedBuffers=");
        sbM36619s.append(i9);
        sbM36619s.append("\n droppedToKeyframeEvents=");
        sbM36619s.append(i10);
        sbM36619s.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM36619s.append(j);
        sbM36619s.append("\n videoFrameProcessingOffsetCount=");
        sbM36619s.append(i11);
        sbM36619s.append("\n}");
        return sbM36619s.toString();
    }
}
