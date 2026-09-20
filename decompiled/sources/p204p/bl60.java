package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class bl60 implements rr60 {

    /* JADX INFO: renamed from: a */
    public static final bl60 f28100a = new bl60();

    /* JADX INFO: renamed from: b */
    public static final mtz0 f28101b = gjg1.m44908H("kotlinx.serialization.json.JsonElement", u8q0.f228000z0, new ktz0[0], new nm6(4));

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        return eng1.m39504k(froVar).mo43785m();
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return f28101b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        yk60 yk60Var = (yk60) obj;
        eng1.m39503i(deuVar);
        if (yk60Var instanceof sl60) {
            deuVar.mo35825i(vl60.f242388a, yk60Var);
        } else if (yk60Var instanceof nl60) {
            deuVar.mo35825i(ql60.f189741a, yk60Var);
        } else {
            if (!(yk60Var instanceof jk60)) {
                throw new NoWhenBranchMatchedException();
            }
            deuVar.mo35825i(mk60.f144507a, yk60Var);
        }
    }
}
