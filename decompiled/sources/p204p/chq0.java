package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0048e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class chq0 extends AbstractC0048e {
    private static final chq0 DEFAULT_INSTANCE;
    private static volatile t2n0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private be50 strings_ = j3t0.m52316e();

    static {
        chq0 chq0Var = new chq0();
        DEFAULT_INSTANCE = chq0Var;
        AbstractC0048e.m520h(chq0.class, chq0Var);
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
    /* JADX INFO: renamed from: j */
    public static void m32808j(chq0 chq0Var, Iterable iterable) {
        if (!((AbstractC1770d9) chq0Var.strings_).m35295b()) {
            be50 be50Var = chq0Var.strings_;
            int size = be50Var.size();
            chq0Var.strings_ = be50Var.mo28906h(size == 0 ? 10 : size * 2);
        }
        List list = chq0Var.strings_;
        Charset charset = ge50.f79023a;
        if (iterable instanceof az70) {
            List listMo27581c = ((az70) iterable).mo27581c();
            az70 az70Var = (az70) list;
            int size2 = list.size();
            for (Object obj : listMo27581c) {
                if (obj == null) {
                    String str = "Element at index " + (az70Var.size() - size2) + " is null.";
                    for (int size3 = az70Var.size() - 1; size3 >= size2; size3--) {
                        az70Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof dva) {
                    az70Var.mo27580a1((dva) obj);
                } else {
                    az70Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof der0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size4) + " is null.";
                for (int size5 = list.size() - 1; size5 >= size4; size5--) {
                    list.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static chq0 m32809k() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static bhq0 m32810m() {
        return (bhq0) ((o110) DEFAULT_INSTANCE.mo521d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0048e
    /* JADX INFO: renamed from: d */
    public final Object mo521d(int i) {
        t2n0 s110Var;
        switch (edb.m38547C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ebu0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new chq0();
            case 4:
                return new bhq0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t2n0 t2n0Var = PARSER;
                if (t2n0Var != null) {
                    return t2n0Var;
                }
                synchronized (chq0.class) {
                    try {
                        s110Var = PARSER;
                        if (s110Var == null) {
                            s110Var = new s110();
                            PARSER = s110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return s110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: l */
    public final be50 m32811l() {
        return this.strings_;
    }
}
