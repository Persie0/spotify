package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ths implements qsz0, zhs {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220474a;

    /* JADX INFO: renamed from: b */
    public final qsz0 f220475b;

    /* JADX INFO: renamed from: c */
    public final int f220476c;

    public ths(qsz0 qsz0Var, int i, int i2) {
        this.f220474a = i2;
        switch (i2) {
            case 1:
                this.f220475b = qsz0Var;
                this.f220476c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(dq60.m36613m("count must be non-negative, but was ", i, '.').toString());
                }
                return;
            default:
                this.f220475b = qsz0Var;
                this.f220476c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(dq60.m36613m("count must be non-negative, but was ", i, '.').toString());
                }
                return;
        }
    }

    @Override // p204p.zhs
    /* JADX INFO: renamed from: a */
    public final qsz0 mo41264a(int i) {
        switch (this.f220474a) {
            case 0:
                int i2 = this.f220476c + i;
                return i2 < 0 ? new ths(this, i, 0) : new ths(this.f220475b, i2, 0);
            default:
                int i3 = this.f220476c;
                return i >= i3 ? fbu.f67898a : new hr51(this.f220475b, i, i3);
        }
    }

    @Override // p204p.zhs
    /* JADX INFO: renamed from: b */
    public final qsz0 mo41265b(int i) {
        switch (this.f220474a) {
            case 0:
                int i2 = this.f220476c;
                int i3 = i2 + i;
                return i3 < 0 ? new ths(this, i, 1) : new hr51(this.f220475b, i2, i3);
            default:
                return i >= this.f220476c ? this : new ths(this.f220475b, i, 1);
        }
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        switch (this.f220474a) {
            case 0:
                return new shs(this);
            default:
                return new shs(this, (byte) 0);
        }
    }
}
