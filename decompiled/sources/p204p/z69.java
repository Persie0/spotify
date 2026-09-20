package p204p;

import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class z69 {

    /* JADX INFO: renamed from: a */
    public final List f279761a;

    /* JADX INFO: renamed from: b */
    public final h50 f279762b;

    public z69(ArrayList arrayList, h50 h50Var, int i) {
        List list = (i & 2) != 0 ? lau.f131415a : arrayList;
        h50 h50Var2 = (i & 8) != 0 ? new h50(null, null, null, null, null, 0.0f, null, null, null, 0, null, Entity.SERP_METADATA_FIELD_NUMBER) : h50Var;
        this.f279761a = list;
        this.f279762b = h50Var2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z69)) {
            return false;
        }
        z69 z69Var = (z69) obj;
        if (!wj50.m88271j(this.f279761a, z69Var.f279761a)) {
            return false;
        }
        lau lauVar = lau.f131415a;
        return lauVar.equals(lauVar) && wj50.m88271j(this.f279762b, z69Var.f279762b);
    }

    public final int hashCode() {
        return this.f279762b.hashCode() + ((((this.f279761a.hashCode() + (edb.m38547C(1) * 31)) * 31) + 1) * 31);
    }
}
