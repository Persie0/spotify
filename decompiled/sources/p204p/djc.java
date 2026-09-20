package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class djc extends hq20 {

    /* JADX INFO: renamed from: n0 */
    public float f49647n0;

    /* JADX INFO: renamed from: o0 */
    public final HashMap f49648o0;

    /* JADX INFO: renamed from: p0 */
    public final HashMap f49649p0;

    /* JADX INFO: renamed from: q0 */
    public final HashMap f49650q0;

    /* JADX INFO: renamed from: r0 */
    public HashMap f49651r0;

    /* JADX INFO: renamed from: s0 */
    public HashMap f49652s0;

    /* JADX INFO: renamed from: t0 */
    public ps41 f49653t0;

    public djc(xu41 xu41Var, int i) {
        super(xu41Var, i);
        this.f49647n0 = 0.5f;
        this.f49648o0 = new HashMap();
        this.f49649p0 = new HashMap();
        this.f49650q0 = new HashMap();
        this.f49653t0 = ps41.f180744a;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m36182b0(float f) {
        this.f49647n0 = f;
    }

    /* JADX INFO: renamed from: c0 */
    public final float m36183c0(String str) {
        HashMap map = this.f49652s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f49652s0.get(str)).floatValue();
    }

    /* JADX INFO: renamed from: d0 */
    public final float m36184d0(String str) {
        HashMap map = this.f49650q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: e0 */
    public final float m36185e0(String str) {
        HashMap map = this.f49651r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f49651r0.get(str)).floatValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final float m36186f0(String str) {
        HashMap map = this.f49649p0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m36187g0(ps41 ps41Var) {
        this.f49653t0 = ps41Var;
    }
}
