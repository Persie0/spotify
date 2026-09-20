package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class ot81 {

    /* JADX INFO: renamed from: a */
    public final long f169001a;

    /* JADX INFO: renamed from: b */
    public final long f169002b;

    /* JADX INFO: renamed from: c */
    public final boolean f169003c;

    public ot81(long j, long j2, boolean z) {
        this.f169001a = j;
        this.f169002b = j2;
        this.f169003c = z;
    }

    /* JADX INFO: renamed from: a */
    public final ot81 m67773a(ot81 ot81Var) {
        return new ot81(Offset.m257g(this.f169001a, ot81Var.f169001a), Math.max(this.f169002b, ot81Var.f169002b), this.f169003c || ot81Var.f169003c);
    }
}
