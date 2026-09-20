package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u440 extends odb {

    /* JADX INFO: renamed from: b */
    public static final u440 f226578b = new u440();

    @Override // p204p.odb
    /* JADX INFO: renamed from: a */
    public final void mo66742a(jla1 jla1Var, xvb xvbVar) {
        super.mo66742a(jla1Var, xvbVar);
        if (!(jla1Var instanceof t440)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        t440 t440Var = (t440) jla1Var;
        gl8 gl8Var = new gl8();
        sy7 sy7Var = t440.f216896b;
        if (t440Var.mo39829d(sy7Var)) {
            x58.m89979l(((Integer) t440Var.mo39828c(sy7Var)).intValue(), gl8Var);
        }
        xvbVar.m92221i(new sdb(jvl0.m54384j((lpi0) gl8Var.f81018b), 11));
    }
}
