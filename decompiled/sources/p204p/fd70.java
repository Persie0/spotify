package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v28 p.fd70[], still in use, count: 1, list:
  (r0v28 p.fd70[]) from 0x0236: CONSTRUCTOR (r1v31 p.nzv) = (r0v28 p.fd70[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:567) call: p.nzv.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class fd70 {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);


    /* JADX INFO: renamed from: L0 */
    public static final List f68357L0;

    /* JADX INFO: renamed from: M0 */
    public static final Object f68358M0;

    /* JADX INFO: renamed from: X */
    public static final List f68369X;

    /* JADX INFO: renamed from: Y */
    public static final List f68371Y;

    /* JADX INFO: renamed from: Z */
    public static final List f68373Z;

    /* JADX INFO: renamed from: b */
    public static final HashMap f68376b;

    /* JADX INFO: renamed from: c */
    public static final List f68378c;

    /* JADX INFO: renamed from: d */
    public static final List f68380d;

    /* JADX INFO: renamed from: e */
    public static final List f68382e;

    /* JADX INFO: renamed from: f */
    public static final List f68384f;

    /* JADX INFO: renamed from: g */
    public static final List f68386g;

    /* JADX INFO: renamed from: h */
    public static final List f68388h;

    /* JADX INFO: renamed from: i */
    public static final List f68390i;

    /* JADX INFO: renamed from: j1 */
    public static final /* synthetic */ nzv f68392j1;

    /* JADX INFO: renamed from: t */
    public static final List f68393t;

    /* JADX INFO: renamed from: a */
    public final boolean f68394a;

    static {
        nzv nzvVar = new nzv(fd70VarArr);
        f68392j1 = nzvVar;
        f68376b = new HashMap();
        C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
        while (c2042k7.hasNext()) {
            fd70 fd70Var = (fd70) c2042k7.next();
            f68376b.put(fd70Var.name(), fd70Var);
        }
        nzv nzvVar2 = f68392j1;
        ArrayList arrayList = new ArrayList();
        C2042k7 c2042k8 = new C2042k7(nzvVar2, 0);
        while (c2042k8.hasNext()) {
            Object next = c2042k8.next();
            if (((fd70) next).f68394a) {
                arrayList.add(next);
            }
        }
        g6f.m43736n1(arrayList);
        g6f.m43736n1(f68392j1);
        fd70 fd70Var2 = ANNOTATION_CLASS;
        fd70 fd70Var3 = CLASS;
        f68378c = h6f.m46715L(fd70Var2, fd70Var3);
        f68380d = h6f.m46715L(LOCAL_CLASS, fd70Var3);
        f68382e = h6f.m46715L(CLASS_ONLY, fd70Var3);
        fd70 fd70Var4 = COMPANION_OBJECT;
        fd70 fd70Var5 = OBJECT;
        f68384f = h6f.m46715L(fd70Var4, fd70Var5, fd70Var3);
        f68386g = h6f.m46715L(STANDALONE_OBJECT, fd70Var5, fd70Var3);
        f68388h = h6f.m46715L(INTERFACE, fd70Var3);
        f68390i = h6f.m46715L(ENUM_CLASS, fd70Var3);
        fd70 fd70Var6 = ENUM_ENTRY;
        fd70 fd70Var7 = PROPERTY;
        fd70 fd70Var8 = FIELD;
        f68393t = h6f.m46715L(fd70Var6, fd70Var7, fd70Var8);
        fd70 fd70Var9 = PROPERTY_SETTER;
        f68369X = Collections.singletonList(fd70Var9);
        fd70 fd70Var10 = PROPERTY_GETTER;
        f68371Y = Collections.singletonList(fd70Var10);
        f68373Z = Collections.singletonList(FUNCTION);
        fd70 fd70Var11 = FILE;
        f68357L0 = Collections.singletonList(fd70Var11);
        g25 g25Var = g25.CONSTRUCTOR_PARAMETER;
        fd70 fd70Var12 = VALUE_PARAMETER;
        f68358M0 = kkc0.m56695h0(new pqm0(g25Var, fd70Var12), new pqm0(g25.FIELD, fd70Var8), new pqm0(g25.PROPERTY, fd70Var7), new pqm0(g25.FILE, fd70Var11), new pqm0(g25.PROPERTY_GETTER, fd70Var10), new pqm0(g25.PROPERTY_SETTER, fd70Var9), new pqm0(g25.RECEIVER, fd70Var12), new pqm0(g25.SETTER_PARAMETER, fd70Var12), new pqm0(g25.PROPERTY_DELEGATE_FIELD, fd70Var8));
    }

    public fd70(boolean z) {
        super(str, i);
        this.f68394a = z;
    }

    public static fd70 valueOf(String str) {
        return (fd70) Enum.valueOf(fd70.class, str);
    }

    public static fd70[] values() {
        return (fd70[]) f68391i1.clone();
    }
}
