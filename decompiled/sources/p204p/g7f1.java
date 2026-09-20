package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class g7f1 extends j7f1 {
    @Override // p204p.j7f1
    /* JADX INFO: renamed from: b */
    public final void mo43815b(Object obj, long j, byte b) {
        if (k7f1.f120087g) {
            k7f1.m55646c(obj, j, b);
        } else {
            k7f1.m55647d(obj, j, b);
        }
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: f */
    public final boolean mo43816f(long j, Object obj) {
        return k7f1.f120087g ? k7f1.m55657n(obj, j) : k7f1.m55658o(j, obj);
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: h */
    public final void mo43817h(Object obj, long j, boolean z) {
        if (k7f1.f120087g) {
            k7f1.m55646c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            k7f1.m55647d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: i */
    public final float mo43818i(long j, Object obj) {
        return Float.intBitsToFloat(this.f109588a.getInt(obj, j));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: n */
    public final void mo43819n(Object obj, long j, float f) {
        this.f109588a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: o */
    public final double mo43820o(long j, Object obj) {
        return Double.longBitsToDouble(this.f109588a.getLong(obj, j));
    }

    @Override // p204p.j7f1
    /* JADX INFO: renamed from: r */
    public final void mo43821r(Object obj, long j, double d) {
        this.f109588a.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
