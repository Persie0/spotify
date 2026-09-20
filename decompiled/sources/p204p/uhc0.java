package p204p;

import com.squareup.moshi.JsonDataException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class uhc0<K, V> extends hk60<Map<K, V>> {

    /* JADX INFO: renamed from: c */
    public static final hk60.InterfaceC1945e f230415c = new C2458a();

    /* JADX INFO: renamed from: a */
    private final hk60<K> f230416a;

    /* JADX INFO: renamed from: b */
    private final hk60<V> f230417b;

    /* JADX INFO: renamed from: p.uhc0$a */
    public class C2458a implements hk60.InterfaceC1945e {
        @Override // p204p.hk60.InterfaceC1945e
        public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
            Class<?> clsM62454g;
            if (!set.isEmpty() || (clsM62454g = mp91.m62454g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrM62456i = mp91.m62456i(type, clsM62454g);
            return new uhc0(p0i0Var, typeArrM62456i[0], typeArrM62456i[1]).nullSafe();
        }
    }

    public uhc0(p0i0 p0i0Var, Type type, Type type2) {
        this.f230416a = p0i0Var.m68704d(type);
        this.f230417b = p0i0Var.m68704d(type2);
    }

    public String toString() {
        return "JsonAdapter(" + this.f230416a + "=" + this.f230417b + ")";
    }

    @Override // p204p.hk60
    public Map<K, V> fromJson(xl60 xl60Var) {
        qn80 qn80Var = new qn80();
        xl60Var.mo51076c();
        while (xl60Var.mo51079i()) {
            xl60Var.mo51070G();
            K kFromJson = this.f230416a.fromJson(xl60Var);
            V vFromJson = this.f230417b.fromJson(xl60Var);
            V vPut = qn80Var.put(kFromJson, vFromJson);
            if (vPut != null) {
                throw new JsonDataException("Map key '" + kFromJson + "' has multiple values at path " + xl60Var.m91387h() + ": " + vPut + " and " + vFromJson);
            }
        }
        xl60Var.mo51078f();
        return qn80Var;
    }

    @Override // p204p.hk60
    public void toJson(rm60 rm60Var, Map<K, V> map) {
        rm60Var.mo56891e();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + rm60Var.m75910n());
            }
            rm60Var.m75915z();
            this.f230416a.toJson(rm60Var, entry.getKey());
            this.f230417b.toJson(rm60Var, entry.getValue());
        }
        rm60Var.mo56893i();
    }
}
