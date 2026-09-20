package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q27 {

    /* JADX INFO: renamed from: e */
    public static final q27 f184525e = new q27(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f184526a;

    /* JADX INFO: renamed from: b */
    public final int f184527b;

    /* JADX INFO: renamed from: c */
    public final int f184528c;

    /* JADX INFO: renamed from: d */
    public final int f184529d;

    public q27(r300 r300Var) {
        this(r300Var.f195362L, r300Var.f195360J, r300Var.f195363M);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q27)) {
            return false;
        }
        q27 q27Var = (q27) obj;
        return this.f184526a == q27Var.f184526a && this.f184527b == q27Var.f184527b && this.f184528c == q27Var.f184528c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f184526a), Integer.valueOf(this.f184527b), Integer.valueOf(this.f184528c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f184526a);
        sb.append(", channelCount=");
        sb.append(this.f184527b);
        sb.append(", encoding=");
        return edb.m38567p(sb, this.f184528c, ']');
    }

    public q27(int i, int i2, int i3) {
        this.f184526a = i;
        this.f184527b = i2;
        this.f184528c = i3;
        this.f184529d = h0b1.m46288P(i3) ? h0b1.m46338z(i3) * i2 : -1;
    }
}
