package p204p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: classes5.dex */
public final class mw6 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f147723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f147724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mw6(int i, int i2, float f) {
        super(1);
        this.f147722a = i2;
        this.f147723b = i;
        this.f147724c = f;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f147722a) {
            case 0:
                AudioDriver.startDuckingAudioSession(((Number) obj).intValue(), this.f147723b, this.f147724c);
                return w2a1.f247311a;
            case 1:
                return new y350((((long) (this.f147723b * ((int) this.f147724c))) << 32) | (((long) 0) & 4294967295L));
            default:
                uw70 uw70Var = (uw70) obj;
                int i = this.f147723b;
                if (i < 1) {
                    i = 1;
                }
                uw70.m84090b(uw70Var, i, null, new fyf(new j5d0(this.f147724c), true, -891227864), 6);
                return w2a1.f247311a;
        }
    }
}
