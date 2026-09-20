package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zgi0 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final zgi0 f282647a;
    private static final ktz0 descriptor;

    static {
        zgi0 zgi0Var = new zgi0();
        f282647a = zgi0Var;
        it40 it40Var = new it40("com.spotify.fitness.workout.MusicGenre", zgi0Var);
        it40Var.m86594k("key", false);
        descriptor = it40Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{ql51.f189738a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return new bhi0(froVar.mo39233w(descriptor).mo39222V());
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        String str = ((bhi0) obj).f27194a;
        deu deuVarMo35828v = deuVar.mo35828v(descriptor);
        if (deuVarMo35828v == null) {
            return;
        }
        deuVarMo35828v.mo35824h0(str);
    }
}
