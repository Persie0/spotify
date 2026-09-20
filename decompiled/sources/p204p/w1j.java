package p204p;

/* JADX INFO: loaded from: classes.dex */
public class w1j {

    /* JADX INFO: renamed from: a */
    public final z8f f247111a;

    /* JADX INFO: renamed from: b */
    public final z8f f247112b;

    /* JADX INFO: renamed from: c */
    public final z8f f247113c;

    /* JADX INFO: renamed from: d */
    public final float[] f247114d;

    static {
        new l45(4);
    }

    public w1j(z8f z8fVar, z8f z8fVar2, z8f z8fVar3, float[] fArr) {
        this.f247111a = z8fVar;
        this.f247112b = z8fVar2;
        this.f247113c = z8fVar3;
        this.f247114d = fArr;
    }

    /* JADX INFO: renamed from: a */
    public long mo82228a(long j) {
        float fM63770g = n6f.m63770g(j);
        float fM63769f = n6f.m63769f(j);
        float fM63767d = n6f.m63767d(j);
        float fM63766c = n6f.m63766c(j);
        z8f z8fVar = this.f247112b;
        long jMo25698d = z8fVar.mo25698d(fM63770g, fM63769f, fM63767d);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo25698d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo25698d & 4294967295L));
        float fMo25699e = z8fVar.mo25699e(fM63770g, fM63769f, fM63767d);
        float[] fArr = this.f247114d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo25699e *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f247113c.mo25700f(f, f2, fMo25699e, fM63766c, this.f247111a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w1j(z8f z8fVar, z8f z8fVar2, int i) {
        long j = z8fVar.f280462b;
        int i2 = v7f.f238175e;
        ufg1.m83016r();
        long j2 = v7f.f238171a;
        z8f z8fVarM41600o = v7f.m84848a(j, j2) ? fgg1.m41600o(z8fVar) : z8fVar;
        long j3 = z8fVar2.f280462b;
        ufg1.m83016r();
        this(z8fVar2, z8fVarM41600o, v7f.m84848a(j3, j2) ? fgg1.m41600o(z8fVar2) : z8fVar2, l45.m58104b(z8fVar, z8fVar2, i));
    }
}
