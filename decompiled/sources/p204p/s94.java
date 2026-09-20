package p204p;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: loaded from: classes3.dex */
public final class s94 implements ua40 {

    /* JADX INFO: renamed from: a */
    public final Image f206847a;

    /* JADX INFO: renamed from: b */
    public final egb1[] f206848b;

    /* JADX INFO: renamed from: c */
    public final b18 f206849c;

    public s94(Image image) {
        this.f206847a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f206848b = new egb1[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f206848b[i] = new egb1(planes[i], 14);
            }
        } else {
            this.f206848b = new egb1[0];
        }
        this.f206849c = new b18(fs61.f72777b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: G0 */
    public final egb1[] mo60746G0() {
        return this.f206848b;
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: b */
    public final int mo60748b() {
        return this.f206847a.getHeight();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f206847a.close();
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: d */
    public final int mo60749d() {
        return this.f206847a.getWidth();
    }

    @Override // p204p.ua40
    public final int getFormat() {
        return this.f206847a.getFormat();
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: i1 */
    public final s640 mo60750i1() {
        return this.f206849c;
    }

    @Override // p204p.ua40
    /* JADX INFO: renamed from: j */
    public final Image mo60751j() {
        return this.f206847a;
    }
}
