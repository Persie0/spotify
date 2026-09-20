package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class sxo {

    /* JADX INFO: renamed from: a */
    public long f214949a;

    /* JADX INFO: renamed from: b */
    public final q27 f214950b;

    /* JADX INFO: renamed from: c */
    public final rnc f214951c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ txo f214952d;

    public sxo(txo txoVar, q27 q27Var, rnc rncVar, long j) {
        this.f214952d = txoVar;
        this.f214950b = q27Var;
        this.f214949a = j;
        this.f214951c = rncVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m79662a(ByteBuffer byteBuffer, long j) {
        c95.m31843i(j >= this.f214949a);
        byteBuffer.position((((int) (j - this.f214949a)) * this.f214950b.f184529d) + byteBuffer.position());
        this.f214949a = j;
    }
}
