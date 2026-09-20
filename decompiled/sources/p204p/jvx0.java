package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class jvx0 implements uys0 {

    /* JADX INFO: renamed from: a */
    public final Map f116540a;

    public jvx0(Map map) {
        this.f116540a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // p204p.uys0
    /* JADX INFO: renamed from: a */
    public final Enum mo47705a(String str, Enum r8) {
        lb6 lb6VarM54394d = m54394d(3, str);
        ?? r0 = 0;
        String str2 = lb6VarM54394d != null ? lb6VarM54394d.f131573e : null;
        Object[] objArr = (Enum[]) r8.getDeclaringClass().getEnumConstants();
        if (str2 != null && objArr != null) {
            for (Object obj : objArr) {
                if (wj50.m88271j(((uzv) obj).value(), str2)) {
                    r0 = obj;
                    break;
                }
            }
            if (r0 != 0) {
                return r0;
            }
        }
        return r8;
    }

    @Override // p204p.uys0
    /* JADX INFO: renamed from: b */
    public final int mo47706b(int i, int i2, int i3, String str) {
        Integer num;
        int iIntValue;
        lb6 lb6VarM54394d = m54394d(2, str);
        return (lb6VarM54394d == null || (num = lb6VarM54394d.f131572d) == null || i > (iIntValue = num.intValue()) || iIntValue > i2) ? i3 : iIntValue;
    }

    @Override // p204p.uys0
    /* JADX INFO: renamed from: c */
    public final boolean mo47707c(String str, boolean z) {
        Boolean bool;
        lb6 lb6VarM54394d = m54394d(1, str);
        return (lb6VarM54394d == null || (bool = lb6VarM54394d.f131571c) == null) ? z : bool.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final lb6 m54394d(int i, String str) {
        lb6 lb6Var = (lb6) this.f116540a.get(str);
        if (lb6Var == null || i != lb6Var.m58619a()) {
            return null;
        }
        return lb6Var;
    }
}
