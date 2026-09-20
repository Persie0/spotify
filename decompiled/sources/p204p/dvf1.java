package p204p;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dvf1 extends r3g1 {
    private static final dvf1 zzb;
    private l4g1 zzd = o9g1.f163034e;

    static {
        dvf1 dvf1Var = new dvf1();
        zzb = dvf1Var;
        r3g1.m74640f(dvf1.class, dvf1Var);
    }

    /* JADX INFO: renamed from: p */
    public static yuf1 m37097p() {
        return (yuf1) zzb.m74650k();
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
    /* JADX INFO: renamed from: q */
    public static void m37098q(dvf1 dvf1Var, ArrayList arrayList) {
        l4g1 l4g1Var = dvf1Var.zzd;
        if (!((xxf1) l4g1Var).f266970a) {
            int size = l4g1Var.size();
            dvf1Var.zzd = l4g1Var.zzd(size + size);
        }
        List list = dvf1Var.zzd;
        Charset charset = a5g1.f12516a;
        int size2 = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof o9g1) {
            o9g1 o9g1Var = (o9g1) list;
            int i = o9g1Var.f163036c + size2;
            int length = o9g1Var.f163035b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = s571.m77242a(length, 3, 2, 1, 10);
                    }
                    o9g1Var.f163035b = Arrays.copyOf(o9g1Var.f163035b, length);
                } else {
                    o9g1Var.f163035b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strM38563l = edb.m38563l("Element at index ", list.size() - size3, " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new NullPointerException(strM38563l);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // p204p.r3g1
    /* JADX INFO: renamed from: j */
    public final Object mo29132j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new t9g1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", vuf1.class});
        }
        if (i2 == 3) {
            return new dvf1();
        }
        if (i2 == 4) {
            return new yuf1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
