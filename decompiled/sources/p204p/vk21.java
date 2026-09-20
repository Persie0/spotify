package p204p;

import com.spotify.player.model.PlayOrigin;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class vk21 implements dut {

    /* JADX INFO: renamed from: a */
    public final r1w0 f242116a;

    /* JADX INFO: renamed from: b */
    public final krr f242117b;

    /* JADX INFO: renamed from: c */
    public final PlayOrigin f242118c;

    /* JADX INFO: renamed from: d */
    public final pgo f242119d;

    /* JADX INFO: renamed from: e */
    public final gb80 f242120e;

    /* JADX INFO: renamed from: f */
    public final wg61 f242121f = new wg61(new cy11(this, 9));

    /* JADX INFO: renamed from: g */
    public final wxh0 f242122g = uuf1.m83998r(ve21.f240583h, null, null, new la01(this, 14), 6);

    /* JADX INFO: renamed from: h */
    public final i5x f242123h = mhf1.m61771p(this).m94133b(j121.f107624f, j121.f107625g);

    /* JADX INFO: renamed from: i */
    public final cph f242124i;

    public vk21(r1w0 r1w0Var, krr krrVar, PlayOrigin playOrigin, ago agoVar, gb80 gb80Var) {
        this.f242116a = r1w0Var;
        this.f242117b = krrVar;
        this.f242118c = playOrigin;
        this.f242119d = agoVar;
        this.f242120e = gb80Var;
        fyf fyfVar = i9h.f100011a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f242124i = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public static final Object m85794e(vk21 vk21Var, sk21 sk21Var, String str, ibk ibkVar) {
        uk21 uk21Var;
        if (ibkVar instanceof uk21) {
            uk21Var = (uk21) ibkVar;
            int i = uk21Var.f231207c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uk21Var.f231207c = i - Integer.MIN_VALUE;
            } else {
                uk21Var = new uk21(vk21Var, ibkVar);
            }
        } else {
            uk21Var = new uk21(vk21Var, ibkVar);
        }
        uk21 uk21Var2 = uk21Var;
        Object obj = uk21Var2.f231205a;
        int i2 = uk21Var2.f231207c;
        if (i2 == 0) {
            bga.m29073P(obj);
            z1w0 z1w0Var = (z1w0) vk21Var.f242121f.getValue();
            String str2 = sk21Var.f209980a;
            String str3 = sk21Var.f209981b;
            uk21Var2.f231207c = 1;
            Serializable serializableM95161b = z1w0.m95161b(z1w0Var, str2, str3, lau.f131415a, str, null, null, null, false, uk21Var2, 240);
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
        return this.f242123h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f242124i;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f242122g;
    }
}
