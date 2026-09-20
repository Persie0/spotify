package p204p;

import com.spotify.player.model.PlayOrigin;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class cnw0 implements dut {

    /* JADX INFO: renamed from: a */
    public final r1w0 f40106a;

    /* JADX INFO: renamed from: b */
    public final krr f40107b;

    /* JADX INFO: renamed from: c */
    public final PlayOrigin f40108c;

    /* JADX INFO: renamed from: d */
    public final pgo f40109d;

    /* JADX INFO: renamed from: e */
    public final boolean f40110e;

    /* JADX INFO: renamed from: f */
    public final gb80 f40111f;

    /* JADX INFO: renamed from: g */
    public final wg61 f40112g = new wg61(new f8w0(this, 16));

    /* JADX INFO: renamed from: h */
    public final wxh0 f40113h = uuf1.m83999s(gkw0.f80946h, null, gkw0.f80948t, new fyf(new iy6(this, 28), true, -2092551150), 2);

    /* JADX INFO: renamed from: i */
    public final i5x f40114i = mhf1.m61771p(this).m94133b(mgw0.f143653Y, mgw0.f143655Z);

    /* JADX INFO: renamed from: t */
    public final cph f40115t;

    public cnw0(r1w0 r1w0Var, krr krrVar, PlayOrigin playOrigin, ago agoVar, boolean z, gb80 gb80Var) {
        this.f40106a = r1w0Var;
        this.f40107b = krrVar;
        this.f40108c = playOrigin;
        this.f40109d = agoVar;
        this.f40110e = z;
        this.f40111f = gb80Var;
        fyf fyfVar = new fyf(new fqv0(this, 10), true, -1456788935);
        wpi0 wpi0Var = xwt.f266743a;
        this.f40115t = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public static final Object m33471e(cnw0 cnw0Var, zmw0 zmw0Var, String str, ibk ibkVar) {
        bnw0 bnw0Var;
        if (ibkVar instanceof bnw0) {
            bnw0Var = (bnw0) ibkVar;
            int i = bnw0Var.f28933c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bnw0Var.f28933c = i - Integer.MIN_VALUE;
            } else {
                bnw0Var = new bnw0(cnw0Var, ibkVar);
            }
        } else {
            bnw0Var = new bnw0(cnw0Var, ibkVar);
        }
        bnw0 bnw0Var2 = bnw0Var;
        Object obj = bnw0Var2.f28931a;
        int i2 = bnw0Var2.f28933c;
        if (i2 == 0) {
            bga.m29073P(obj);
            z1w0 z1w0Var = (z1w0) cnw0Var.f40112g.getValue();
            String str2 = zmw0Var.f284349a;
            String str3 = zmw0Var.f284350b;
            bnw0Var2.f28933c = 1;
            Serializable serializableM95161b = z1w0.m95161b(z1w0Var, str2, str3, lau.f131415a, str, null, null, null, false, bnw0Var2, 240);
            yuk yukVar = yuk.f276404a;
            if (serializableM95161b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            ((s6x0) obj).getClass();
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f40114i;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f40115t;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f40113h;
    }
}
