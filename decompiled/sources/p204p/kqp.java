package p204p;

import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.util.ArrayDeque;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class kqp {

    /* JADX INFO: renamed from: a */
    public boolean f125368a;

    /* JADX INFO: renamed from: b */
    public final boolean f125369b;

    /* JADX INFO: renamed from: c */
    public int f125370c;

    /* JADX INFO: renamed from: d */
    public final Object f125371d;

    /* JADX INFO: renamed from: e */
    public final Object f125372e;

    /* JADX INFO: renamed from: f */
    public final Object f125373f;

    /* JADX INFO: renamed from: g */
    public Object f125374g;

    /* JADX INFO: renamed from: h */
    public Object f125375h;

    public kqp(boolean z, boolean z2, boolean z3, qo91 qo91Var, bkg1 bkg1Var, ekg1 ekg1Var) {
        this.f125368a = z;
        this.f125369b = z2;
        this.f125371d = qo91Var;
        this.f125372e = bkg1Var;
        this.f125373f = ekg1Var;
    }

    /* JADX INFO: renamed from: a */
    public void m57117a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f125374g;
        wj50.m88279p(arrayDeque);
        arrayDeque.clear();
        zw21 zw21Var = (zw21) this.f125375h;
        wj50.m88279p(zw21Var);
        zw21Var.clear();
    }

    /* JADX INFO: renamed from: b */
    public usd0 m57118b(int i) {
        j561 iqpVar;
        HashMap map = (HashMap) this.f125373f;
        usd0 usd0Var = (usd0) map.get(Integer.valueOf(i));
        if (usd0Var != null) {
            return usd0Var;
        }
        HashMap map2 = (HashMap) this.f125372e;
        j561 j561Var = (j561) map2.get(Integer.valueOf(i));
        if (j561Var == null) {
            final z4n z4nVar = (z4n) this.f125374g;
            z4nVar.getClass();
            final int i2 = 0;
            if (i != 0) {
                final int i3 = 1;
                if (i != 1) {
                    final int i4 = 2;
                    if (i == 2) {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(usd0.class);
                        iqpVar = new j561() { // from class: p.hqp
                            @Override // p204p.j561
                            public final Object get() {
                                switch (i4) {
                                    case 0:
                                        break;
                                    case 1:
                                        break;
                                }
                                return lqp.m59770e(clsAsSubclass, z4nVar);
                            }
                        };
                    } else if (i == 3) {
                        iqpVar = new iqp(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(usd0.class), i2);
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(s571.m77246e(i, "Unrecognized contentType: "));
                        }
                        iqpVar = new jqp(i2, this, z4nVar);
                    }
                } else {
                    final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(usd0.class);
                    iqpVar = new j561() { // from class: p.hqp
                        @Override // p204p.j561
                        public final Object get() {
                            switch (i3) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                            }
                            return lqp.m59770e(clsAsSubclass2, z4nVar);
                        }
                    };
                }
                j561Var = iqpVar;
            } else {
                final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(usd0.class);
                j561Var = new j561() { // from class: p.hqp
                    @Override // p204p.j561
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return lqp.m59770e(clsAsSubclass3, z4nVar);
                    }
                };
            }
            map2.put(Integer.valueOf(i), j561Var);
        }
        usd0 usd0Var2 = (usd0) j561Var.get();
        usd0Var2.mo772b((t46) this.f125375h);
        usd0Var2.mo773c(this.f125368a);
        usd0Var2.mo774d(this.f125370c);
        map.put(Integer.valueOf(i), usd0Var2);
        return usd0Var2;
    }

    /* JADX INFO: renamed from: c */
    public void m57119c() {
        if (((ArrayDeque) this.f125374g) == null) {
            this.f125374g = new ArrayDeque(4);
        }
        if (((zw21) this.f125375h) == null) {
            int i = zw21.f286894c;
            this.f125375h = pwb.m71231p();
        }
    }

    public kqp(ihp ihpVar, t46 t46Var) {
        this.f125371d = ihpVar;
        this.f125375h = t46Var;
        this.f125372e = new HashMap();
        this.f125373f = new HashMap();
        this.f125368a = true;
        this.f125369b = true;
        this.f125370c = 3;
    }
}
