package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class hr51 implements qsz0, zhs {

    /* JADX INFO: renamed from: a */
    public final qsz0 f94366a;

    /* JADX INFO: renamed from: b */
    public final int f94367b;

    /* JADX INFO: renamed from: c */
    public final int f94368c;

    public hr51(qsz0 qsz0Var, int i, int i2) {
        this.f94366a = qsz0Var;
        this.f94367b = i;
        this.f94368c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(s571.m77246e(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(s571.m77247f(i2, "endIndex should be not less than startIndex, but was ", i, " < ").toString());
        }
    }

    @Override // p204p.zhs
    /* JADX INFO: renamed from: a */
    public final qsz0 mo41264a(int i) {
        int i2 = this.f94368c;
        int i3 = this.f94367b;
        return i >= i2 - i3 ? fbu.f67898a : new hr51(this.f94366a, i3 + i, i2);
    }

    @Override // p204p.zhs
    /* JADX INFO: renamed from: b */
    public final qsz0 mo41265b(int i) {
        int i2 = this.f94368c;
        int i3 = this.f94367b;
        return i >= i2 - i3 ? this : new hr51(this.f94366a, i3, i + i3);
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new srn0(this);
    }
}
