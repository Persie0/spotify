package p204p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j32 extends yu60 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f108265b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j32(Class cls, int i) {
        super(cls);
        this.f108265b = i;
    }

    @Override // p204p.yu60
    /* JADX INFO: renamed from: a */
    public final Object mo52247a(AbstractC2205o8 abstractC2205o8) {
        switch (this.f108265b) {
            case 0:
                g32 g32Var = (g32) abstractC2205o8;
                return new mdr0(new y0i0(g32Var.m43427q().m42777i()), g32Var.m43428r().m60624n());
            case 1:
                o32 o32Var = (o32) abstractC2205o8;
                yu60[] yu60VarArr = {new j32(on40.class, 2)};
                HashMap map = new HashMap();
                for (yu60 yu60Var : yu60VarArr) {
                    Class cls = yu60Var.f276278a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(dq60.m36611k(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, yu60Var);
                }
                if (yu60VarArr.length > 0) {
                    Class cls2 = yu60VarArr[0].f276278a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                t32 t32VarM66175q = o32Var.m66175q();
                yu60 yu60Var2 = (yu60) mapUnmodifiableMap.get(on40.class);
                if (yu60Var2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + on40.class.getCanonicalName() + " not supported.");
                }
                on40 on40Var = (on40) yu60Var2.mo52247a(t32VarM66175q);
                yu60[] yu60VarArr2 = {new x130(jrb0.class)};
                HashMap map2 = new HashMap();
                for (yu60 yu60Var3 : yu60VarArr2) {
                    Class cls3 = yu60Var3.f276278a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(dq60.m36611k(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, yu60Var3);
                }
                if (yu60VarArr2.length > 0) {
                    Class cls4 = yu60VarArr2[0].f276278a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                v130 v130VarM66176r = o32Var.m66176r();
                yu60 yu60Var4 = (yu60) mapUnmodifiableMap2.get(jrb0.class);
                if (yu60Var4 != null) {
                    return new l1v(on40Var, (jrb0) yu60Var4.mo52247a(v130VarM66176r), o32Var.m66176r().m84440s().m24484o());
                }
                throw new IllegalArgumentException("Requested primitive class " + jrb0.class.getCanonicalName() + " not supported.");
            case 2:
                t32 t32Var = (t32) abstractC2205o8;
                return new r32(t32Var.m79949q().m42777i(), t32Var.m79950r().m84530n());
            case 3:
                y32 y32Var = (y32) abstractC2205o8;
                return new w32(y32Var.m92722q().m42777i(), y32Var.m92723r().m24658n());
            case 4:
                return new b42(((d42) abstractC2205o8).m34903o().m42777i());
            case 5:
                return new g42(((i42) abstractC2205o8).m49639p().m42777i());
            case 6:
                return new k42(((m42) abstractC2205o8).m60757o().m42777i());
            case 7:
                return new vic(((xic) abstractC2205o8).m91114p().m42777i(), 0);
            case 8:
                String strM55772n = ((j970) abstractC2205o8).m52736p().m55772n();
                return l970.m58496a(strM55772n).m95619b(strM55772n);
            case 9:
                o970 o970Var = (o970) abstractC2205o8;
                String strM69363o = o970Var.m66451p().m69363o();
                return new m970(o970Var.m66451p().m69362n(), l970.m58496a(strM69363o).m95619b(strM69363o));
            default:
                return new vic(((ufe1) abstractC2205o8).m82993p().m42777i(), 1);
        }
    }
}
