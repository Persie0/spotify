package p204p;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class va20 {

    /* JADX INFO: renamed from: a */
    public final ck81 f239093a;

    /* JADX INFO: renamed from: b */
    public boolean f239094b;

    /* JADX INFO: renamed from: c */
    public boolean f239095c;

    /* JADX INFO: renamed from: d */
    public boolean f239096d;

    /* JADX INFO: renamed from: e */
    public int f239097e;

    /* JADX INFO: renamed from: f */
    public int f239098f;

    /* JADX INFO: renamed from: g */
    public long f239099g;

    /* JADX INFO: renamed from: h */
    public long f239100h;

    public va20(ck81 ck81Var) {
        this.f239093a = ck81Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m85013a(int i, byte[] bArr, int i2) {
        if (this.f239095c) {
            int i3 = this.f239098f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f239098f = (i2 - i) + i3;
            } else {
                this.f239096d = ((bArr[i4] & MessagePack.Code.NIL) >> 6) == 0;
                this.f239095c = false;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final void m85014b(long j, boolean z, int i) {
        c95.m31855u(this.f239100h != -9223372036854775807L);
        if (this.f239097e == 182 && z && this.f239094b) {
            this.f239093a.mo33088b(this.f239100h, this.f239096d ? 1 : 0, (int) (j - this.f239099g), i, null);
        }
        if (this.f239097e != 179) {
            this.f239099g = j;
        }
    }
}
