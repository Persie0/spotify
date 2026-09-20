package p204p;

import android.media.MediaCodecInfo;
import android.util.Range;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afp implements dfp, lk30, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f15192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f15193c;

    public /* synthetic */ afp(String str, int i, int i2) {
        this.f15191a = i2;
        this.f15192b = str;
        this.f15193c = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        hrd0 hrd0Var;
        switch (this.f15191a) {
            case 2:
                return ((xnd0) obj).mo31394d(this.f15193c, this.f15192b);
            case 3:
                xnd0 xnd0Var = (xnd0) obj;
                int i = this.f15193c;
                if (i == 0) {
                    hrd0Var = hrd0.f94414a;
                } else if (i == 1) {
                    hrd0Var = hrd0.f94415b;
                } else {
                    if (i != 2) {
                        throw new UnsupportedOperationException("Unsupported repeat mode");
                    }
                    hrd0Var = hrd0.f94416c;
                }
                return xnd0Var.mo31401k(this.f15192b, hrd0Var);
            case 4:
                return ((xnd0) obj).mo31398h(this.f15193c, this.f15192b);
            default:
                xnd0 xnd0Var2 = (xnd0) obj;
                int i2 = 1;
                int i3 = this.f15193c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new UnsupportedOperationException("Unsupported shuffle mode");
                    }
                    i2 = 2;
                }
                return xnd0Var2.mo31403m(i2, this.f15192b);
        }
    }

    @Override // p204p.dfp
    /* JADX INFO: renamed from: c */
    public int mo25822c(MediaCodecInfo mediaCodecInfo) {
        lj5 lj5Var = jeu.f111661a;
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(this.f15192b).getVideoCapabilities();
        videoCapabilities.getClass();
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        int i = this.f15193c;
        return Math.abs(((Integer) bitrateRange.clamp(Integer.valueOf(i))).intValue() - i);
    }

    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public int mo25406k(fk30 fk30Var) {
        return kk30.lambda$single$2(this.f15192b, this.f15193c, fk30Var);
    }
}
